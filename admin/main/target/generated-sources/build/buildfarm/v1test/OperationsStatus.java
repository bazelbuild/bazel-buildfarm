// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

/**
 * Protobuf type {@code build.buildfarm.v1test.OperationsStatus}
 */
public  final class OperationsStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.buildfarm.v1test.OperationsStatus)
    OperationsStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OperationsStatus.newBuilder() to construct.
  private OperationsStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperationsStatus() {
    activeWorkers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OperationsStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OperationsStatus(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            build.buildfarm.v1test.QueueStatus.Builder subBuilder = null;
            if (prequeue_ != null) {
              subBuilder = prequeue_.toBuilder();
            }
            prequeue_ = input.readMessage(build.buildfarm.v1test.QueueStatus.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prequeue_);
              prequeue_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            build.buildfarm.v1test.OperationQueueStatus.Builder subBuilder = null;
            if (operationQueue_ != null) {
              subBuilder = operationQueue_.toBuilder();
            }
            operationQueue_ = input.readMessage(build.buildfarm.v1test.OperationQueueStatus.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operationQueue_);
              operationQueue_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            dispatchedSize_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              activeWorkers_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            activeWorkers_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        activeWorkers_ = activeWorkers_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_OperationsStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_OperationsStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buildfarm.v1test.OperationsStatus.class, build.buildfarm.v1test.OperationsStatus.Builder.class);
  }

  public static final int PREQUEUE_FIELD_NUMBER = 1;
  private build.buildfarm.v1test.QueueStatus prequeue_;
  /**
   * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
   */
  public boolean hasPrequeue() {
    return prequeue_ != null;
  }
  /**
   * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
   */
  public build.buildfarm.v1test.QueueStatus getPrequeue() {
    return prequeue_ == null ? build.buildfarm.v1test.QueueStatus.getDefaultInstance() : prequeue_;
  }
  /**
   * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
   */
  public build.buildfarm.v1test.QueueStatusOrBuilder getPrequeueOrBuilder() {
    return getPrequeue();
  }

  public static final int OPERATION_QUEUE_FIELD_NUMBER = 2;
  private build.buildfarm.v1test.OperationQueueStatus operationQueue_;
  /**
   * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
   */
  public boolean hasOperationQueue() {
    return operationQueue_ != null;
  }
  /**
   * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
   */
  public build.buildfarm.v1test.OperationQueueStatus getOperationQueue() {
    return operationQueue_ == null ? build.buildfarm.v1test.OperationQueueStatus.getDefaultInstance() : operationQueue_;
  }
  /**
   * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
   */
  public build.buildfarm.v1test.OperationQueueStatusOrBuilder getOperationQueueOrBuilder() {
    return getOperationQueue();
  }

  public static final int DISPATCHED_SIZE_FIELD_NUMBER = 3;
  private long dispatchedSize_;
  /**
   * <code>int64 dispatched_size = 3;</code>
   */
  public long getDispatchedSize() {
    return dispatchedSize_;
  }

  public static final int ACTIVE_WORKERS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList activeWorkers_;
  /**
   * <code>repeated string active_workers = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getActiveWorkersList() {
    return activeWorkers_;
  }
  /**
   * <code>repeated string active_workers = 4;</code>
   */
  public int getActiveWorkersCount() {
    return activeWorkers_.size();
  }
  /**
   * <code>repeated string active_workers = 4;</code>
   */
  public java.lang.String getActiveWorkers(int index) {
    return activeWorkers_.get(index);
  }
  /**
   * <code>repeated string active_workers = 4;</code>
   */
  public com.google.protobuf.ByteString
      getActiveWorkersBytes(int index) {
    return activeWorkers_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (prequeue_ != null) {
      output.writeMessage(1, getPrequeue());
    }
    if (operationQueue_ != null) {
      output.writeMessage(2, getOperationQueue());
    }
    if (dispatchedSize_ != 0L) {
      output.writeInt64(3, dispatchedSize_);
    }
    for (int i = 0; i < activeWorkers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, activeWorkers_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (prequeue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPrequeue());
    }
    if (operationQueue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOperationQueue());
    }
    if (dispatchedSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, dispatchedSize_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < activeWorkers_.size(); i++) {
        dataSize += computeStringSizeNoTag(activeWorkers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getActiveWorkersList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.buildfarm.v1test.OperationsStatus)) {
      return super.equals(obj);
    }
    build.buildfarm.v1test.OperationsStatus other = (build.buildfarm.v1test.OperationsStatus) obj;

    if (hasPrequeue() != other.hasPrequeue()) return false;
    if (hasPrequeue()) {
      if (!getPrequeue()
          .equals(other.getPrequeue())) return false;
    }
    if (hasOperationQueue() != other.hasOperationQueue()) return false;
    if (hasOperationQueue()) {
      if (!getOperationQueue()
          .equals(other.getOperationQueue())) return false;
    }
    if (getDispatchedSize()
        != other.getDispatchedSize()) return false;
    if (!getActiveWorkersList()
        .equals(other.getActiveWorkersList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPrequeue()) {
      hash = (37 * hash) + PREQUEUE_FIELD_NUMBER;
      hash = (53 * hash) + getPrequeue().hashCode();
    }
    if (hasOperationQueue()) {
      hash = (37 * hash) + OPERATION_QUEUE_FIELD_NUMBER;
      hash = (53 * hash) + getOperationQueue().hashCode();
    }
    hash = (37 * hash) + DISPATCHED_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDispatchedSize());
    if (getActiveWorkersCount() > 0) {
      hash = (37 * hash) + ACTIVE_WORKERS_FIELD_NUMBER;
      hash = (53 * hash) + getActiveWorkersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buildfarm.v1test.OperationsStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.OperationsStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.OperationsStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.OperationsStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.OperationsStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.OperationsStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.OperationsStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.OperationsStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.OperationsStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.OperationsStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.OperationsStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.OperationsStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.buildfarm.v1test.OperationsStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code build.buildfarm.v1test.OperationsStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.buildfarm.v1test.OperationsStatus)
      build.buildfarm.v1test.OperationsStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_OperationsStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_OperationsStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buildfarm.v1test.OperationsStatus.class, build.buildfarm.v1test.OperationsStatus.Builder.class);
    }

    // Construct using build.buildfarm.v1test.OperationsStatus.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (prequeueBuilder_ == null) {
        prequeue_ = null;
      } else {
        prequeue_ = null;
        prequeueBuilder_ = null;
      }
      if (operationQueueBuilder_ == null) {
        operationQueue_ = null;
      } else {
        operationQueue_ = null;
        operationQueueBuilder_ = null;
      }
      dispatchedSize_ = 0L;

      activeWorkers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_OperationsStatus_descriptor;
    }

    @java.lang.Override
    public build.buildfarm.v1test.OperationsStatus getDefaultInstanceForType() {
      return build.buildfarm.v1test.OperationsStatus.getDefaultInstance();
    }

    @java.lang.Override
    public build.buildfarm.v1test.OperationsStatus build() {
      build.buildfarm.v1test.OperationsStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buildfarm.v1test.OperationsStatus buildPartial() {
      build.buildfarm.v1test.OperationsStatus result = new build.buildfarm.v1test.OperationsStatus(this);
      int from_bitField0_ = bitField0_;
      if (prequeueBuilder_ == null) {
        result.prequeue_ = prequeue_;
      } else {
        result.prequeue_ = prequeueBuilder_.build();
      }
      if (operationQueueBuilder_ == null) {
        result.operationQueue_ = operationQueue_;
      } else {
        result.operationQueue_ = operationQueueBuilder_.build();
      }
      result.dispatchedSize_ = dispatchedSize_;
      if (((bitField0_ & 0x00000001) != 0)) {
        activeWorkers_ = activeWorkers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.activeWorkers_ = activeWorkers_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buildfarm.v1test.OperationsStatus) {
        return mergeFrom((build.buildfarm.v1test.OperationsStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buildfarm.v1test.OperationsStatus other) {
      if (other == build.buildfarm.v1test.OperationsStatus.getDefaultInstance()) return this;
      if (other.hasPrequeue()) {
        mergePrequeue(other.getPrequeue());
      }
      if (other.hasOperationQueue()) {
        mergeOperationQueue(other.getOperationQueue());
      }
      if (other.getDispatchedSize() != 0L) {
        setDispatchedSize(other.getDispatchedSize());
      }
      if (!other.activeWorkers_.isEmpty()) {
        if (activeWorkers_.isEmpty()) {
          activeWorkers_ = other.activeWorkers_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureActiveWorkersIsMutable();
          activeWorkers_.addAll(other.activeWorkers_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      build.buildfarm.v1test.OperationsStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.buildfarm.v1test.OperationsStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private build.buildfarm.v1test.QueueStatus prequeue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buildfarm.v1test.QueueStatus, build.buildfarm.v1test.QueueStatus.Builder, build.buildfarm.v1test.QueueStatusOrBuilder> prequeueBuilder_;
    /**
     * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
     */
    public boolean hasPrequeue() {
      return prequeueBuilder_ != null || prequeue_ != null;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
     */
    public build.buildfarm.v1test.QueueStatus getPrequeue() {
      if (prequeueBuilder_ == null) {
        return prequeue_ == null ? build.buildfarm.v1test.QueueStatus.getDefaultInstance() : prequeue_;
      } else {
        return prequeueBuilder_.getMessage();
      }
    }
    /**
     * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
     */
    public Builder setPrequeue(build.buildfarm.v1test.QueueStatus value) {
      if (prequeueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prequeue_ = value;
        onChanged();
      } else {
        prequeueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
     */
    public Builder setPrequeue(
        build.buildfarm.v1test.QueueStatus.Builder builderForValue) {
      if (prequeueBuilder_ == null) {
        prequeue_ = builderForValue.build();
        onChanged();
      } else {
        prequeueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
     */
    public Builder mergePrequeue(build.buildfarm.v1test.QueueStatus value) {
      if (prequeueBuilder_ == null) {
        if (prequeue_ != null) {
          prequeue_ =
            build.buildfarm.v1test.QueueStatus.newBuilder(prequeue_).mergeFrom(value).buildPartial();
        } else {
          prequeue_ = value;
        }
        onChanged();
      } else {
        prequeueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
     */
    public Builder clearPrequeue() {
      if (prequeueBuilder_ == null) {
        prequeue_ = null;
        onChanged();
      } else {
        prequeue_ = null;
        prequeueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
     */
    public build.buildfarm.v1test.QueueStatus.Builder getPrequeueBuilder() {
      
      onChanged();
      return getPrequeueFieldBuilder().getBuilder();
    }
    /**
     * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
     */
    public build.buildfarm.v1test.QueueStatusOrBuilder getPrequeueOrBuilder() {
      if (prequeueBuilder_ != null) {
        return prequeueBuilder_.getMessageOrBuilder();
      } else {
        return prequeue_ == null ?
            build.buildfarm.v1test.QueueStatus.getDefaultInstance() : prequeue_;
      }
    }
    /**
     * <code>.build.buildfarm.v1test.QueueStatus prequeue = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buildfarm.v1test.QueueStatus, build.buildfarm.v1test.QueueStatus.Builder, build.buildfarm.v1test.QueueStatusOrBuilder> 
        getPrequeueFieldBuilder() {
      if (prequeueBuilder_ == null) {
        prequeueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.buildfarm.v1test.QueueStatus, build.buildfarm.v1test.QueueStatus.Builder, build.buildfarm.v1test.QueueStatusOrBuilder>(
                getPrequeue(),
                getParentForChildren(),
                isClean());
        prequeue_ = null;
      }
      return prequeueBuilder_;
    }

    private build.buildfarm.v1test.OperationQueueStatus operationQueue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buildfarm.v1test.OperationQueueStatus, build.buildfarm.v1test.OperationQueueStatus.Builder, build.buildfarm.v1test.OperationQueueStatusOrBuilder> operationQueueBuilder_;
    /**
     * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
     */
    public boolean hasOperationQueue() {
      return operationQueueBuilder_ != null || operationQueue_ != null;
    }
    /**
     * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
     */
    public build.buildfarm.v1test.OperationQueueStatus getOperationQueue() {
      if (operationQueueBuilder_ == null) {
        return operationQueue_ == null ? build.buildfarm.v1test.OperationQueueStatus.getDefaultInstance() : operationQueue_;
      } else {
        return operationQueueBuilder_.getMessage();
      }
    }
    /**
     * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
     */
    public Builder setOperationQueue(build.buildfarm.v1test.OperationQueueStatus value) {
      if (operationQueueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operationQueue_ = value;
        onChanged();
      } else {
        operationQueueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
     */
    public Builder setOperationQueue(
        build.buildfarm.v1test.OperationQueueStatus.Builder builderForValue) {
      if (operationQueueBuilder_ == null) {
        operationQueue_ = builderForValue.build();
        onChanged();
      } else {
        operationQueueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
     */
    public Builder mergeOperationQueue(build.buildfarm.v1test.OperationQueueStatus value) {
      if (operationQueueBuilder_ == null) {
        if (operationQueue_ != null) {
          operationQueue_ =
            build.buildfarm.v1test.OperationQueueStatus.newBuilder(operationQueue_).mergeFrom(value).buildPartial();
        } else {
          operationQueue_ = value;
        }
        onChanged();
      } else {
        operationQueueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
     */
    public Builder clearOperationQueue() {
      if (operationQueueBuilder_ == null) {
        operationQueue_ = null;
        onChanged();
      } else {
        operationQueue_ = null;
        operationQueueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
     */
    public build.buildfarm.v1test.OperationQueueStatus.Builder getOperationQueueBuilder() {
      
      onChanged();
      return getOperationQueueFieldBuilder().getBuilder();
    }
    /**
     * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
     */
    public build.buildfarm.v1test.OperationQueueStatusOrBuilder getOperationQueueOrBuilder() {
      if (operationQueueBuilder_ != null) {
        return operationQueueBuilder_.getMessageOrBuilder();
      } else {
        return operationQueue_ == null ?
            build.buildfarm.v1test.OperationQueueStatus.getDefaultInstance() : operationQueue_;
      }
    }
    /**
     * <code>.build.buildfarm.v1test.OperationQueueStatus operation_queue = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buildfarm.v1test.OperationQueueStatus, build.buildfarm.v1test.OperationQueueStatus.Builder, build.buildfarm.v1test.OperationQueueStatusOrBuilder> 
        getOperationQueueFieldBuilder() {
      if (operationQueueBuilder_ == null) {
        operationQueueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.buildfarm.v1test.OperationQueueStatus, build.buildfarm.v1test.OperationQueueStatus.Builder, build.buildfarm.v1test.OperationQueueStatusOrBuilder>(
                getOperationQueue(),
                getParentForChildren(),
                isClean());
        operationQueue_ = null;
      }
      return operationQueueBuilder_;
    }

    private long dispatchedSize_ ;
    /**
     * <code>int64 dispatched_size = 3;</code>
     */
    public long getDispatchedSize() {
      return dispatchedSize_;
    }
    /**
     * <code>int64 dispatched_size = 3;</code>
     */
    public Builder setDispatchedSize(long value) {
      
      dispatchedSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 dispatched_size = 3;</code>
     */
    public Builder clearDispatchedSize() {
      
      dispatchedSize_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList activeWorkers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureActiveWorkersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        activeWorkers_ = new com.google.protobuf.LazyStringArrayList(activeWorkers_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string active_workers = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getActiveWorkersList() {
      return activeWorkers_.getUnmodifiableView();
    }
    /**
     * <code>repeated string active_workers = 4;</code>
     */
    public int getActiveWorkersCount() {
      return activeWorkers_.size();
    }
    /**
     * <code>repeated string active_workers = 4;</code>
     */
    public java.lang.String getActiveWorkers(int index) {
      return activeWorkers_.get(index);
    }
    /**
     * <code>repeated string active_workers = 4;</code>
     */
    public com.google.protobuf.ByteString
        getActiveWorkersBytes(int index) {
      return activeWorkers_.getByteString(index);
    }
    /**
     * <code>repeated string active_workers = 4;</code>
     */
    public Builder setActiveWorkers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureActiveWorkersIsMutable();
      activeWorkers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string active_workers = 4;</code>
     */
    public Builder addActiveWorkers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureActiveWorkersIsMutable();
      activeWorkers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string active_workers = 4;</code>
     */
    public Builder addAllActiveWorkers(
        java.lang.Iterable<java.lang.String> values) {
      ensureActiveWorkersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, activeWorkers_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string active_workers = 4;</code>
     */
    public Builder clearActiveWorkers() {
      activeWorkers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string active_workers = 4;</code>
     */
    public Builder addActiveWorkersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureActiveWorkersIsMutable();
      activeWorkers_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:build.buildfarm.v1test.OperationsStatus)
  }

  // @@protoc_insertion_point(class_scope:build.buildfarm.v1test.OperationsStatus)
  private static final build.buildfarm.v1test.OperationsStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buildfarm.v1test.OperationsStatus();
  }

  public static build.buildfarm.v1test.OperationsStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperationsStatus>
      PARSER = new com.google.protobuf.AbstractParser<OperationsStatus>() {
    @java.lang.Override
    public OperationsStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OperationsStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OperationsStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperationsStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buildfarm.v1test.OperationsStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
