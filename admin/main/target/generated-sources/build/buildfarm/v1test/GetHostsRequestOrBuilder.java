// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface GetHostsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.GetHostsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string filter = 1;</code>
   */
  java.lang.String getFilter();
  /**
   * <code>string filter = 1;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <code>int32 age_in_minutes = 2;</code>
   */
  int getAgeInMinutes();

  /**
   * <code>string status = 3;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 3;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}