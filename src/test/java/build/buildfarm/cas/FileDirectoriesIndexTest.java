// Copyright 2020 The Bazel Authors. All rights reserved.
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

package build.buildfarm.cas;

import static com.google.common.truth.Truth.assertThat;

import build.bazel.remote.execution.v2.Digest;
import build.buildfarm.common.DigestUtil;
import build.buildfarm.common.DigestUtil.HashFunction;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class FileDirectoriesIndexTest {
  private final DigestUtil DIGEST_UTIL = new DigestUtil(HashFunction.SHA256);

  private final String jdbcIndexUrl = "jdbc:sqlite::memory:";
  private Path root;
  private FileDirectoriesIndex directoriesIndex;

  protected FileDirectoriesIndexTest(Path root) {
    this.root = root.resolve("cache");
  }

  @Before
  public void setUp() throws IOException {
    directoriesIndex = new FileDirectoriesIndex(jdbcIndexUrl, root);
    Files.createDirectories(root);
  }

  @Test
  public void testFileDirectoriesIndex() throws IOException {
    // create directory and file
    ByteString coolBlob = ByteString.copyFromUtf8("cool content");
    Digest digest = DIGEST_UTIL.compute(coolBlob);
    String dirName = "cool_dir";
    Path path = root.resolve(dirName);
    ImmutableList.Builder<String> entriesBuilder = new ImmutableList.Builder<>();
    entriesBuilder.add(digest.getHash());

    // before inserting (entry, directory)
    Digest directory = DIGEST_UTIL.compute(coolBlob);
    Iterable<String> entries = directoriesIndex.directoryEntries(directory);
    assertThat(entries).isEmpty();

    // insert
    directoriesIndex.put(directory, entriesBuilder.build());
    entries = directoriesIndex.directoryEntries(directory);
    assertThat(entries).contains(digest.getHash());

    // remove entry-wise
    for (String entry : entries) {
      Set<Digest> digests = directoriesIndex.removeEntry(entry);
      assertThat(digests.size() == 1 && digests.contains(directory)).isTrue();
    }

    // insert again to test remove directory-wise
    assertThat(entries).contains(digest.getHash());
    directoriesIndex.put(directory, entries);
    assertThat(Files.exists(directoriesIndex.path(directory))).isTrue();
    directoriesIndex.remove(directory);
    assertThat(Files.notExists(directoriesIndex.path(directory))).isTrue();
    for (String entry : entries) {
      Set<Digest> digests = directoriesIndex.removeEntry(entry);
      assertThat(digests.isEmpty()).isTrue();
    }
  }

  @RunWith(JUnit4.class)
  public static class WindowsFileDirectoriesIndexTest extends FileDirectoriesIndexTest {
    public WindowsFileDirectoriesIndexTest() {
      super(
          Iterables.getFirst(
              Jimfs.newFileSystem(
                      Configuration.windows()
                          .toBuilder()
                          .setAttributeViews("basic", "owner", "dos", "acl", "posix", "user")
                          .build())
                  .getRootDirectories(),
              null));
    }
  }

  @RunWith(JUnit4.class)
  public static class UnixFileDirectoriesIndexTest extends FileDirectoriesIndexTest {
    public UnixFileDirectoriesIndexTest() {
      super(
          Iterables.getFirst(
              Jimfs.newFileSystem(
                      Configuration.unix()
                          .toBuilder()
                          .setAttributeViews("basic", "owner", "posix", "unix")
                          .build())
                  .getRootDirectories(),
              null));
    }
  }

  @RunWith(JUnit4.class)
  public static class OsFileDirectoriesIndexTest extends FileDirectoriesIndexTest {
    public OsFileDirectoriesIndexTest() {
      super(
          Iterables.getFirst(
              Jimfs.newFileSystem(
                      Configuration.osX()
                          .toBuilder()
                          .setAttributeViews("basic", "owner", "posix", "unix")
                          .build())
                  .getRootDirectories(),
              null));
    }
  }
}
