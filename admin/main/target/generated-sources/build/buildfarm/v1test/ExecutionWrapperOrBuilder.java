// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface ExecutionWrapperOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.ExecutionWrapper)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <code>string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>repeated string arguments = 2;</code>
   */
  java.util.List<java.lang.String>
      getArgumentsList();
  /**
   * <code>repeated string arguments = 2;</code>
   */
  int getArgumentsCount();
  /**
   * <code>repeated string arguments = 2;</code>
   */
  java.lang.String getArguments(int index);
  /**
   * <code>repeated string arguments = 2;</code>
   */
  com.google.protobuf.ByteString
      getArgumentsBytes(int index);
}