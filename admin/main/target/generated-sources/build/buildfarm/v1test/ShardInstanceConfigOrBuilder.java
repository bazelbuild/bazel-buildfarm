// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface ShardInstanceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.ShardInstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool run_dispatched_monitor = 1;</code>
   */
  boolean getRunDispatchedMonitor();

  /**
   * <code>int32 dispatched_monitor_interval_seconds = 2;</code>
   */
  int getDispatchedMonitorIntervalSeconds();

  /**
   * <code>bool run_operation_queuer = 3;</code>
   */
  boolean getRunOperationQueuer();

  /**
   * <code>.build.buildfarm.v1test.RedisShardBackplaneConfig redis_shard_backplane_config = 4;</code>
   */
  boolean hasRedisShardBackplaneConfig();
  /**
   * <code>.build.buildfarm.v1test.RedisShardBackplaneConfig redis_shard_backplane_config = 4;</code>
   */
  build.buildfarm.v1test.RedisShardBackplaneConfig getRedisShardBackplaneConfig();
  /**
   * <code>.build.buildfarm.v1test.RedisShardBackplaneConfig redis_shard_backplane_config = 4;</code>
   */
  build.buildfarm.v1test.RedisShardBackplaneConfigOrBuilder getRedisShardBackplaneConfigOrBuilder();

  /**
   * <code>int64 max_blob_size = 5;</code>
   */
  long getMaxBlobSize();

  /**
   * <code>int32 max_cpu = 9;</code>
   */
  int getMaxCpu();

  /**
   * <pre>
   * maximum selectable timeout
   * a maximum threshold for an action's specified timeout,
   * beyond which an action will be rejected for execution
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_action_timeout = 7;</code>
   */
  boolean hasMaximumActionTimeout();
  /**
   * <pre>
   * maximum selectable timeout
   * a maximum threshold for an action's specified timeout,
   * beyond which an action will be rejected for execution
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_action_timeout = 7;</code>
   */
  com.google.protobuf.Duration getMaximumActionTimeout();
  /**
   * <pre>
   * maximum selectable timeout
   * a maximum threshold for an action's specified timeout,
   * beyond which an action will be rejected for execution
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_action_timeout = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaximumActionTimeoutOrBuilder();

  /**
   * <pre>
   * default timeouts on grpc requests made by instances
   * </pre>
   *
   * <code>.google.protobuf.Duration grpc_timeout = 8;</code>
   */
  boolean hasGrpcTimeout();
  /**
   * <pre>
   * default timeouts on grpc requests made by instances
   * </pre>
   *
   * <code>.google.protobuf.Duration grpc_timeout = 8;</code>
   */
  com.google.protobuf.Duration getGrpcTimeout();
  /**
   * <pre>
   * default timeouts on grpc requests made by instances
   * </pre>
   *
   * <code>.google.protobuf.Duration grpc_timeout = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getGrpcTimeoutOrBuilder();

  public build.buildfarm.v1test.ShardInstanceConfig.BackplaneCase getBackplaneCase();
}