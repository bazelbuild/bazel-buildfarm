// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface RedisShardBackplaneConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.RedisShardBackplaneConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the uri endpoint of the redis target. This must be a single host entry
   * with cluster discoverability enabled if the redis service is configured
   * for cluster operation. If the endpoint is a singleton redis node, cluster
   * adaptive behaviors, specifically queue balancing, will be emulated.
   * </pre>
   *
   * <code>string redis_uri = 1;</code>
   */
  java.lang.String getRedisUri();
  /**
   * <pre>
   * the uri endpoint of the redis target. This must be a single host entry
   * with cluster discoverability enabled if the redis service is configured
   * for cluster operation. If the endpoint is a singleton redis node, cluster
   * adaptive behaviors, specifically queue balancing, will be emulated.
   * </pre>
   *
   * <code>string redis_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getRedisUriBytes();

  /**
   * <pre>
   * the password used to authenticate to redis via `auth`
   * </pre>
   *
   * <code>string redis_password = 34;</code>
   */
  java.lang.String getRedisPassword();
  /**
   * <pre>
   * the password used to authenticate to redis via `auth`
   * </pre>
   *
   * <code>string redis_password = 34;</code>
   */
  com.google.protobuf.ByteString
      getRedisPasswordBytes();

  /**
   * <pre>
   * the size of the pool of jedis connections per-cluster-member
   * </pre>
   *
   * <code>int32 jedis_pool_max_total = 15;</code>
   */
  int getJedisPoolMaxTotal();

  /**
   * <pre>
   * the hash of active cas shards. Shards must update a self-reported expiry
   * regularly or face deactivation and excommunication. Advertisements for
   * contents on deactivated workers may be pruned.
   * </pre>
   *
   * <code>string workers_hash_name = 2;</code>
   */
  java.lang.String getWorkersHashName();
  /**
   * <pre>
   * the hash of active cas shards. Shards must update a self-reported expiry
   * regularly or face deactivation and excommunication. Advertisements for
   * contents on deactivated workers may be pruned.
   * </pre>
   *
   * <code>string workers_hash_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getWorkersHashNameBytes();

  /**
   * <pre>
   * the channel used to communicate cas shard structural changes
   * </pre>
   *
   * <code>string worker_channel = 25;</code>
   */
  java.lang.String getWorkerChannel();
  /**
   * <pre>
   * the channel used to communicate cas shard structural changes
   * </pre>
   *
   * <code>string worker_channel = 25;</code>
   */
  com.google.protobuf.ByteString
      getWorkerChannelBytes();

  /**
   * <pre>
   * the prefix of keys which map action keys to action results
   * </pre>
   *
   * <code>string action_cache_prefix = 3;</code>
   */
  java.lang.String getActionCachePrefix();
  /**
   * <pre>
   * the prefix of keys which map action keys to action results
   * </pre>
   *
   * <code>string action_cache_prefix = 3;</code>
   */
  com.google.protobuf.ByteString
      getActionCachePrefixBytes();

  /**
   * <pre>
   * the expiration time in seconds for action cache entries
   * </pre>
   *
   * <code>int32 action_cache_expire = 4;</code>
   */
  int getActionCacheExpire();

  /**
   * <pre>
   * the prefix of keys which identify actions that are to be rejected
   * from any request endpoint
   * </pre>
   *
   * <code>string action_blacklist_prefix = 28;</code>
   */
  java.lang.String getActionBlacklistPrefix();
  /**
   * <pre>
   * the prefix of keys which identify actions that are to be rejected
   * from any request endpoint
   * </pre>
   *
   * <code>string action_blacklist_prefix = 28;</code>
   */
  com.google.protobuf.ByteString
      getActionBlacklistPrefixBytes();

  /**
   * <pre>
   * the expiration time in seconds for banned actions
   * </pre>
   *
   * <code>int32 action_blacklist_expire = 29;</code>
   */
  int getActionBlacklistExpire();

  /**
   * <pre>
   * the prefix of keys which identify invocations that are to be rejected
   * from any request endpoint
   * </pre>
   *
   * <code>string invocation_blacklist_prefix = 30;</code>
   */
  java.lang.String getInvocationBlacklistPrefix();
  /**
   * <pre>
   * the prefix of keys which identify invocations that are to be rejected
   * from any request endpoint
   * </pre>
   *
   * <code>string invocation_blacklist_prefix = 30;</code>
   */
  com.google.protobuf.ByteString
      getInvocationBlacklistPrefixBytes();

  /**
   * <pre>
   * the prefix of keys used to retain current Operation state
   * </pre>
   *
   * <code>string operation_prefix = 5;</code>
   */
  java.lang.String getOperationPrefix();
  /**
   * <pre>
   * the prefix of keys used to retain current Operation state
   * </pre>
   *
   * <code>string operation_prefix = 5;</code>
   */
  com.google.protobuf.ByteString
      getOperationPrefixBytes();

  /**
   * <pre>
   * the expiration time in seconds for operation keys
   * </pre>
   *
   * <code>int32 operation_expire = 6;</code>
   */
  int getOperationExpire();

  /**
   * <pre>
   * the arrival queue. Contains ExecuteEntry messages
   * </pre>
   *
   * <code>string pre_queued_operations_list_name = 18;</code>
   */
  java.lang.String getPreQueuedOperationsListName();
  /**
   * <pre>
   * the arrival queue. Contains ExecuteEntry messages
   * </pre>
   *
   * <code>string pre_queued_operations_list_name = 18;</code>
   */
  com.google.protobuf.ByteString
      getPreQueuedOperationsListNameBytes();

  /**
   * <pre>
   * the atomic target list for reliable arrival queue removal
   * </pre>
   *
   * <code>string processing_list_name = 19;</code>
   */
  java.lang.String getProcessingListName();
  /**
   * <pre>
   * the atomic target list for reliable arrival queue removal
   * </pre>
   *
   * <code>string processing_list_name = 19;</code>
   */
  com.google.protobuf.ByteString
      getProcessingListNameBytes();

  /**
   * <pre>
   * the prefix of the processing list timeout monitor key
   * </pre>
   *
   * <code>string processing_prefix = 20;</code>
   */
  java.lang.String getProcessingPrefix();
  /**
   * <pre>
   * the prefix of the processing list timeout monitor key
   * </pre>
   *
   * <code>string processing_prefix = 20;</code>
   */
  com.google.protobuf.ByteString
      getProcessingPrefixBytes();

  /**
   * <pre>
   * the minimum timeout for an operation to be removed from the processing list
   * upon leaving the arrival queue
   * </pre>
   *
   * <code>int32 processing_timeout_millis = 21;</code>
   */
  int getProcessingTimeoutMillis();

  /**
   * <pre>
   * the ready-to-run operation queue. Contains QueueEntry messages
   * </pre>
   *
   * <code>string queued_operations_list_name = 7;</code>
   */
  java.lang.String getQueuedOperationsListName();
  /**
   * <pre>
   * the ready-to-run operation queue. Contains QueueEntry messages
   * </pre>
   *
   * <code>string queued_operations_list_name = 7;</code>
   */
  com.google.protobuf.ByteString
      getQueuedOperationsListNameBytes();

  /**
   * <pre>
   * the prefix of the dispatching list timeout monitor key
   * </pre>
   *
   * <code>string dispatching_prefix = 23;</code>
   */
  java.lang.String getDispatchingPrefix();
  /**
   * <pre>
   * the prefix of the dispatching list timeout monitor key
   * </pre>
   *
   * <code>string dispatching_prefix = 23;</code>
   */
  com.google.protobuf.ByteString
      getDispatchingPrefixBytes();

  /**
   * <pre>
   * the minimum timeout for an operation to be observable in the dispatched
   * hash upon leaving the ready-to-run queue.
   * </pre>
   *
   * <code>int32 dispatching_timeout_millis = 24;</code>
   */
  int getDispatchingTimeoutMillis();

  /**
   * <pre>
   * the hash key of dispatched operations. all operations which have been
   * removed from the ready-to-run queue should make their way here in a timely
   * (per dispatching) fashion.
   * </pre>
   *
   * <code>string dispatched_operations_hash_name = 8;</code>
   */
  java.lang.String getDispatchedOperationsHashName();
  /**
   * <pre>
   * the hash key of dispatched operations. all operations which have been
   * removed from the ready-to-run queue should make their way here in a timely
   * (per dispatching) fashion.
   * </pre>
   *
   * <code>string dispatched_operations_hash_name = 8;</code>
   */
  com.google.protobuf.ByteString
      getDispatchedOperationsHashNameBytes();

  /**
   * <pre>
   * the prefix of operation update topics
   * </pre>
   *
   * <code>string operation_channel_prefix = 9;</code>
   */
  java.lang.String getOperationChannelPrefix();
  /**
   * <pre>
   * the prefix of operation update topics
   * </pre>
   *
   * <code>string operation_channel_prefix = 9;</code>
   */
  com.google.protobuf.ByteString
      getOperationChannelPrefixBytes();

  /**
   * <pre>
   * the prefix of cas set keys. A cas set for a key suffixed with a digest
   * address, contain the shards which have advertised storage of the
   * addressed content. This set of valid shards for a digest must intersect
   * with the active shard list (workers)
   * </pre>
   *
   * <code>string cas_prefix = 10;</code>
   */
  java.lang.String getCasPrefix();
  /**
   * <pre>
   * the prefix of cas set keys. A cas set for a key suffixed with a digest
   * address, contain the shards which have advertised storage of the
   * addressed content. This set of valid shards for a digest must intersect
   * with the active shard list (workers)
   * </pre>
   *
   * <code>string cas_prefix = 10;</code>
   */
  com.google.protobuf.ByteString
      getCasPrefixBytes();

  /**
   * <pre>
   * the expiration time in seconds for cas sets
   * </pre>
   *
   * <code>int32 cas_expire = 11;</code>
   */
  int getCasExpire();

  /**
   * <pre>
   * whether to listen to the backplane communication streams for shard
   * lifecycle events and watched operations. This is required for failsafe
   * operation below and realtime notification for watched operations. This is
   * nearly required for schedulers, and may be useful elsewhere
   * </pre>
   *
   * <code>bool subscribe_to_backplane = 26;</code>
   */
  boolean getSubscribeToBackplane();

  /**
   * <pre>
   * whether to run the failsafe operation monitor, which establishes watchdogs
   * on watched operations, to ensure they are in a known or recently refreshed
   * state, and guaranteeing a watch's termination on expiry
   * This monitor also effects processing/dispatching expirations globally,
   * required to ensure queue reliability. This is recommended for schedulers,
   * meaningless for others
   * </pre>
   *
   * <code>bool run_failsafe_operation = 27;</code>
   */
  boolean getRunFailsafeOperation();

  /**
   * <pre>
   * the maximum size allowed for the ready-to-run queue before rejection
   * </pre>
   *
   * <code>int32 max_queue_depth = 16;</code>
   */
  int getMaxQueueDepth();

  /**
   * <pre>
   * the maximum size allowed for the arrival queue before rejection
   * </pre>
   *
   * <code>int32 max_pre_queue_depth = 17;</code>
   */
  int getMaxPreQueueDepth();

  /**
   * <pre>
   * the provisioned queue definitions for platform partitioning
   * </pre>
   *
   * <code>.build.buildfarm.v1test.ProvisionedQueuesConfig provisioned_queues = 31;</code>
   */
  boolean hasProvisionedQueues();
  /**
   * <pre>
   * the provisioned queue definitions for platform partitioning
   * </pre>
   *
   * <code>.build.buildfarm.v1test.ProvisionedQueuesConfig provisioned_queues = 31;</code>
   */
  build.buildfarm.v1test.ProvisionedQueuesConfig getProvisionedQueues();
  /**
   * <pre>
   * the provisioned queue definitions for platform partitioning
   * </pre>
   *
   * <code>.build.buildfarm.v1test.ProvisionedQueuesConfig provisioned_queues = 31;</code>
   */
  build.buildfarm.v1test.ProvisionedQueuesConfigOrBuilder getProvisionedQueuesOrBuilder();

  /**
   * <pre>
   * connection and socket read timeout for jedis
   * </pre>
   *
   * <code>int32 timeout = 32;</code>
   */
  int getTimeout();

  /**
   * <pre>
   * maximum number of retries in a cluster
   * </pre>
   *
   * <code>int32 max_attempts = 33;</code>
   */
  int getMaxAttempts();
}