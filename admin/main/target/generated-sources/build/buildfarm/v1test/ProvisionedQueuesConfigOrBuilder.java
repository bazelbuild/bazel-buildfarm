// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface ProvisionedQueuesConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.ProvisionedQueuesConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .build.buildfarm.v1test.ProvisionedQueue queues = 1;</code>
   */
  java.util.List<build.buildfarm.v1test.ProvisionedQueue> 
      getQueuesList();
  /**
   * <code>repeated .build.buildfarm.v1test.ProvisionedQueue queues = 1;</code>
   */
  build.buildfarm.v1test.ProvisionedQueue getQueues(int index);
  /**
   * <code>repeated .build.buildfarm.v1test.ProvisionedQueue queues = 1;</code>
   */
  int getQueuesCount();
  /**
   * <code>repeated .build.buildfarm.v1test.ProvisionedQueue queues = 1;</code>
   */
  java.util.List<? extends build.buildfarm.v1test.ProvisionedQueueOrBuilder> 
      getQueuesOrBuilderList();
  /**
   * <code>repeated .build.buildfarm.v1test.ProvisionedQueue queues = 1;</code>
   */
  build.buildfarm.v1test.ProvisionedQueueOrBuilder getQueuesOrBuilder(
      int index);
}