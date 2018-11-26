// Copyright 2017 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buildfarm.common;

import build.buildfarm.v1test.TreeIteratorToken;
import com.google.common.collect.Iterators;
import com.google.common.io.BaseEncoding;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import build.bazel.remote.execution.v2.Digest;
import build.bazel.remote.execution.v2.Directory;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Function;

public class TreeIterator implements TokenizableIterator<Directory> {
  private final GetBlobFunction getBlob;
  private Deque<Digest> path;
  private final ArrayDeque<Digest> parentPath;
  private final Stack<Iterator<Digest>> pointers;

  @FunctionalInterface
  public interface GetBlobFunction {
    ListenableFuture<ByteString> apply(Digest digest);
  }

  private static <T> T getIOUnchecked(Future<T> future)
      throws IOException, InterruptedException {
    try {
      return future.get();
    } catch (ExecutionException e) {
      if (e.getCause() instanceof IOException) {
        throw (IOException) e.getCause();
      }
      throw new UncheckedExecutionException(e.getCause());
    }
  }

  public TreeIterator(GetBlobFunction getBlob, Digest rootDigest, String pageToken)
      throws IOException, InterruptedException {
    this.getBlob = getBlob;
    parentPath = new ArrayDeque<Digest>();
    pointers = new Stack<Iterator<Digest>>();

    Iterator<Digest> iter = Iterators.singletonIterator(rootDigest);

    Directory directory = expectDirectory(getIOUnchecked(getBlob.apply(rootDigest)));

    if (!pageToken.isEmpty()) {
      TreeIteratorToken token = parseToken(BaseEncoding.base64().decode(pageToken));

      for (Digest digest : token.getDirectoriesList()) {
        boolean found = false;
        while (!found && iter.hasNext()) {
          if (iter.next().equals(digest)) {
            found = true;
          }
        }
        if (!found) {
          throw new IllegalArgumentException();
        }
        parentPath.addLast(digest);
        pointers.push(iter);
        directory = expectDirectory(getIOUnchecked(getBlob.apply(digest)));
        if (directory == null) {
          // some directory data has disappeared, current iter
          // is correct and will be next directory fetched
          break;
        }
        iter = Iterators.transform(
            directory.getDirectoriesList().iterator(),
            directoryNode -> {
              return directoryNode.getDigest();
            });
      }
    }
    pointers.push(iter);
    path = parentPath.clone();
    advanceIterator();
  }

  @Override
  public boolean hasNext() {
    return !pointers.isEmpty() && pointers.peek().hasNext();
  }

  private void advanceIterator() {
    while (!pointers.isEmpty()) {
      Iterator<Digest> iter = pointers.pop();
      if (iter.hasNext()) {
        pointers.push(iter);
        return;
      }
      if (!parentPath.isEmpty()) {
        parentPath.removeLast();
      }
    }
  }

  @Override
  public Directory next() throws NoSuchElementException {
    Iterator<Digest> iter = pointers.peek();
    if (!iter.hasNext()) {
      throw new NoSuchElementException();
    }
    /* we can have null directories in our list
     * if members of the tree have been removed from
     * the cas.  we return this to retain the information
     * (and simplify the interface) that they have been
     * removed. */
    Digest digest = iter.next();
    Directory directory;
    try {
      directory = expectDirectory(getIOUnchecked(getBlob.apply(digest)));
      if (directory != null) {
        /* the path to a new iter set is the path to its parent */
        parentPath.addLast(digest);
        path = parentPath.clone();
        pointers.push(Iterators.transform(
            directory.getDirectoriesList().iterator(),
            directoryNode -> directoryNode.getDigest()));
      }
    } catch (IOException e) {
      directory = null;
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      return null;
    }
    advanceIterator();
    return directory;
  }

  private static Directory expectDirectory(ByteString directoryData) {
    if (directoryData == null) {
      return null;
    }
    try {
      return Directory.parseFrom(directoryData);
    } catch (InvalidProtocolBufferException ex) {
      return null;
    }
  }

  private TreeIteratorToken parseToken(byte[] bytes) {
    try {
      return TreeIteratorToken.parseFrom(bytes);
    } catch (InvalidProtocolBufferException ex) {
      throw new IllegalArgumentException();
    }
  }

  private MessageLite toToken() {
    return TreeIteratorToken.newBuilder()
        .addAllDirectories(path)
        .build();
  }

  public String toNextPageToken() {
    if (hasNext()) {
      return BaseEncoding.base64().encode(toToken().toByteArray());
    }
    return "";
  }
}
