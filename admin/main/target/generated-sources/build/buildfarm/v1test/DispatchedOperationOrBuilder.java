// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface DispatchedOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.DispatchedOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
   */
  boolean hasQueueEntry();
  /**
   * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
   */
  build.buildfarm.v1test.QueueEntry getQueueEntry();
  /**
   * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
   */
  build.buildfarm.v1test.QueueEntryOrBuilder getQueueEntryOrBuilder();

  /**
   * <code>int64 requeue_at = 2;</code>
   */
  long getRequeueAt();
}