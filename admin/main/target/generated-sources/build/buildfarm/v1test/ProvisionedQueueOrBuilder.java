// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface ProvisionedQueueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.ProvisionedQueue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>bool allow_unmatched = 3;</code>
   */
  boolean getAllowUnmatched();

  /**
   * <code>.build.bazel.remote.execution.v2.Platform platform = 2;</code>
   */
  boolean hasPlatform();
  /**
   * <code>.build.bazel.remote.execution.v2.Platform platform = 2;</code>
   */
  build.bazel.remote.execution.v2.Platform getPlatform();
  /**
   * <code>.build.bazel.remote.execution.v2.Platform platform = 2;</code>
   */
  build.bazel.remote.execution.v2.PlatformOrBuilder getPlatformOrBuilder();
}