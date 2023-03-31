// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

/**
 * Protobuf type {@code build.buildfarm.v1test.DispatchedOperation}
 */
public  final class DispatchedOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.buildfarm.v1test.DispatchedOperation)
    DispatchedOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DispatchedOperation.newBuilder() to construct.
  private DispatchedOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DispatchedOperation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DispatchedOperation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DispatchedOperation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            build.buildfarm.v1test.QueueEntry.Builder subBuilder = null;
            if (queueEntry_ != null) {
              subBuilder = queueEntry_.toBuilder();
            }
            queueEntry_ = input.readMessage(build.buildfarm.v1test.QueueEntry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(queueEntry_);
              queueEntry_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            requeueAt_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_DispatchedOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_DispatchedOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buildfarm.v1test.DispatchedOperation.class, build.buildfarm.v1test.DispatchedOperation.Builder.class);
  }

  public static final int QUEUE_ENTRY_FIELD_NUMBER = 1;
  private build.buildfarm.v1test.QueueEntry queueEntry_;
  /**
   * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
   */
  public boolean hasQueueEntry() {
    return queueEntry_ != null;
  }
  /**
   * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
   */
  public build.buildfarm.v1test.QueueEntry getQueueEntry() {
    return queueEntry_ == null ? build.buildfarm.v1test.QueueEntry.getDefaultInstance() : queueEntry_;
  }
  /**
   * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
   */
  public build.buildfarm.v1test.QueueEntryOrBuilder getQueueEntryOrBuilder() {
    return getQueueEntry();
  }

  public static final int REQUEUE_AT_FIELD_NUMBER = 2;
  private long requeueAt_;
  /**
   * <code>int64 requeue_at = 2;</code>
   */
  public long getRequeueAt() {
    return requeueAt_;
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
    if (queueEntry_ != null) {
      output.writeMessage(1, getQueueEntry());
    }
    if (requeueAt_ != 0L) {
      output.writeInt64(2, requeueAt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (queueEntry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQueueEntry());
    }
    if (requeueAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, requeueAt_);
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
    if (!(obj instanceof build.buildfarm.v1test.DispatchedOperation)) {
      return super.equals(obj);
    }
    build.buildfarm.v1test.DispatchedOperation other = (build.buildfarm.v1test.DispatchedOperation) obj;

    if (hasQueueEntry() != other.hasQueueEntry()) return false;
    if (hasQueueEntry()) {
      if (!getQueueEntry()
          .equals(other.getQueueEntry())) return false;
    }
    if (getRequeueAt()
        != other.getRequeueAt()) return false;
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
    if (hasQueueEntry()) {
      hash = (37 * hash) + QUEUE_ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getQueueEntry().hashCode();
    }
    hash = (37 * hash) + REQUEUE_AT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequeueAt());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buildfarm.v1test.DispatchedOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.DispatchedOperation parseFrom(
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
  public static Builder newBuilder(build.buildfarm.v1test.DispatchedOperation prototype) {
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
   * Protobuf type {@code build.buildfarm.v1test.DispatchedOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.buildfarm.v1test.DispatchedOperation)
      build.buildfarm.v1test.DispatchedOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_DispatchedOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_DispatchedOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buildfarm.v1test.DispatchedOperation.class, build.buildfarm.v1test.DispatchedOperation.Builder.class);
    }

    // Construct using build.buildfarm.v1test.DispatchedOperation.newBuilder()
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
      if (queueEntryBuilder_ == null) {
        queueEntry_ = null;
      } else {
        queueEntry_ = null;
        queueEntryBuilder_ = null;
      }
      requeueAt_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_DispatchedOperation_descriptor;
    }

    @java.lang.Override
    public build.buildfarm.v1test.DispatchedOperation getDefaultInstanceForType() {
      return build.buildfarm.v1test.DispatchedOperation.getDefaultInstance();
    }

    @java.lang.Override
    public build.buildfarm.v1test.DispatchedOperation build() {
      build.buildfarm.v1test.DispatchedOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buildfarm.v1test.DispatchedOperation buildPartial() {
      build.buildfarm.v1test.DispatchedOperation result = new build.buildfarm.v1test.DispatchedOperation(this);
      if (queueEntryBuilder_ == null) {
        result.queueEntry_ = queueEntry_;
      } else {
        result.queueEntry_ = queueEntryBuilder_.build();
      }
      result.requeueAt_ = requeueAt_;
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
      if (other instanceof build.buildfarm.v1test.DispatchedOperation) {
        return mergeFrom((build.buildfarm.v1test.DispatchedOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buildfarm.v1test.DispatchedOperation other) {
      if (other == build.buildfarm.v1test.DispatchedOperation.getDefaultInstance()) return this;
      if (other.hasQueueEntry()) {
        mergeQueueEntry(other.getQueueEntry());
      }
      if (other.getRequeueAt() != 0L) {
        setRequeueAt(other.getRequeueAt());
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
      build.buildfarm.v1test.DispatchedOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.buildfarm.v1test.DispatchedOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private build.buildfarm.v1test.QueueEntry queueEntry_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buildfarm.v1test.QueueEntry, build.buildfarm.v1test.QueueEntry.Builder, build.buildfarm.v1test.QueueEntryOrBuilder> queueEntryBuilder_;
    /**
     * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
     */
    public boolean hasQueueEntry() {
      return queueEntryBuilder_ != null || queueEntry_ != null;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
     */
    public build.buildfarm.v1test.QueueEntry getQueueEntry() {
      if (queueEntryBuilder_ == null) {
        return queueEntry_ == null ? build.buildfarm.v1test.QueueEntry.getDefaultInstance() : queueEntry_;
      } else {
        return queueEntryBuilder_.getMessage();
      }
    }
    /**
     * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
     */
    public Builder setQueueEntry(build.buildfarm.v1test.QueueEntry value) {
      if (queueEntryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queueEntry_ = value;
        onChanged();
      } else {
        queueEntryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
     */
    public Builder setQueueEntry(
        build.buildfarm.v1test.QueueEntry.Builder builderForValue) {
      if (queueEntryBuilder_ == null) {
        queueEntry_ = builderForValue.build();
        onChanged();
      } else {
        queueEntryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
     */
    public Builder mergeQueueEntry(build.buildfarm.v1test.QueueEntry value) {
      if (queueEntryBuilder_ == null) {
        if (queueEntry_ != null) {
          queueEntry_ =
            build.buildfarm.v1test.QueueEntry.newBuilder(queueEntry_).mergeFrom(value).buildPartial();
        } else {
          queueEntry_ = value;
        }
        onChanged();
      } else {
        queueEntryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
     */
    public Builder clearQueueEntry() {
      if (queueEntryBuilder_ == null) {
        queueEntry_ = null;
        onChanged();
      } else {
        queueEntry_ = null;
        queueEntryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
     */
    public build.buildfarm.v1test.QueueEntry.Builder getQueueEntryBuilder() {
      
      onChanged();
      return getQueueEntryFieldBuilder().getBuilder();
    }
    /**
     * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
     */
    public build.buildfarm.v1test.QueueEntryOrBuilder getQueueEntryOrBuilder() {
      if (queueEntryBuilder_ != null) {
        return queueEntryBuilder_.getMessageOrBuilder();
      } else {
        return queueEntry_ == null ?
            build.buildfarm.v1test.QueueEntry.getDefaultInstance() : queueEntry_;
      }
    }
    /**
     * <code>.build.buildfarm.v1test.QueueEntry queue_entry = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buildfarm.v1test.QueueEntry, build.buildfarm.v1test.QueueEntry.Builder, build.buildfarm.v1test.QueueEntryOrBuilder> 
        getQueueEntryFieldBuilder() {
      if (queueEntryBuilder_ == null) {
        queueEntryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.buildfarm.v1test.QueueEntry, build.buildfarm.v1test.QueueEntry.Builder, build.buildfarm.v1test.QueueEntryOrBuilder>(
                getQueueEntry(),
                getParentForChildren(),
                isClean());
        queueEntry_ = null;
      }
      return queueEntryBuilder_;
    }

    private long requeueAt_ ;
    /**
     * <code>int64 requeue_at = 2;</code>
     */
    public long getRequeueAt() {
      return requeueAt_;
    }
    /**
     * <code>int64 requeue_at = 2;</code>
     */
    public Builder setRequeueAt(long value) {
      
      requeueAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 requeue_at = 2;</code>
     */
    public Builder clearRequeueAt() {
      
      requeueAt_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:build.buildfarm.v1test.DispatchedOperation)
  }

  // @@protoc_insertion_point(class_scope:build.buildfarm.v1test.DispatchedOperation)
  private static final build.buildfarm.v1test.DispatchedOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buildfarm.v1test.DispatchedOperation();
  }

  public static build.buildfarm.v1test.DispatchedOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DispatchedOperation>
      PARSER = new com.google.protobuf.AbstractParser<DispatchedOperation>() {
    @java.lang.Override
    public DispatchedOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DispatchedOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DispatchedOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DispatchedOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buildfarm.v1test.DispatchedOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
