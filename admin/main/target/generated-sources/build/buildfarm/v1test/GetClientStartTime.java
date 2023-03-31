// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

/**
 * Protobuf type {@code build.buildfarm.v1test.GetClientStartTime}
 */
public  final class GetClientStartTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.buildfarm.v1test.GetClientStartTime)
    GetClientStartTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetClientStartTime.newBuilder() to construct.
  private GetClientStartTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetClientStartTime() {
    instanceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetClientStartTime();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetClientStartTime(
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
            java.lang.String s = input.readStringRequireUtf8();

            instanceName_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (clientStartTime_ != null) {
              subBuilder = clientStartTime_.toBuilder();
            }
            clientStartTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientStartTime_);
              clientStartTime_ = subBuilder.buildPartial();
            }

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
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_GetClientStartTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_GetClientStartTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buildfarm.v1test.GetClientStartTime.class, build.buildfarm.v1test.GetClientStartTime.Builder.class);
  }

  public static final int INSTANCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object instanceName_;
  /**
   * <code>string instance_name = 1;</code>
   */
  public java.lang.String getInstanceName() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceName_ = s;
      return s;
    }
  }
  /**
   * <code>string instance_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getInstanceNameBytes() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_START_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp clientStartTime_;
  /**
   * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
   */
  public boolean hasClientStartTime() {
    return clientStartTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getClientStartTime() {
    return clientStartTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : clientStartTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getClientStartTimeOrBuilder() {
    return getClientStartTime();
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
    if (!getInstanceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceName_);
    }
    if (clientStartTime_ != null) {
      output.writeMessage(2, getClientStartTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInstanceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceName_);
    }
    if (clientStartTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getClientStartTime());
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
    if (!(obj instanceof build.buildfarm.v1test.GetClientStartTime)) {
      return super.equals(obj);
    }
    build.buildfarm.v1test.GetClientStartTime other = (build.buildfarm.v1test.GetClientStartTime) obj;

    if (!getInstanceName()
        .equals(other.getInstanceName())) return false;
    if (hasClientStartTime() != other.hasClientStartTime()) return false;
    if (hasClientStartTime()) {
      if (!getClientStartTime()
          .equals(other.getClientStartTime())) return false;
    }
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
    hash = (37 * hash) + INSTANCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceName().hashCode();
    if (hasClientStartTime()) {
      hash = (37 * hash) + CLIENT_START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getClientStartTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buildfarm.v1test.GetClientStartTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.GetClientStartTime parseFrom(
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
  public static Builder newBuilder(build.buildfarm.v1test.GetClientStartTime prototype) {
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
   * Protobuf type {@code build.buildfarm.v1test.GetClientStartTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.buildfarm.v1test.GetClientStartTime)
      build.buildfarm.v1test.GetClientStartTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_GetClientStartTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_GetClientStartTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buildfarm.v1test.GetClientStartTime.class, build.buildfarm.v1test.GetClientStartTime.Builder.class);
    }

    // Construct using build.buildfarm.v1test.GetClientStartTime.newBuilder()
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
      instanceName_ = "";

      if (clientStartTimeBuilder_ == null) {
        clientStartTime_ = null;
      } else {
        clientStartTime_ = null;
        clientStartTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_GetClientStartTime_descriptor;
    }

    @java.lang.Override
    public build.buildfarm.v1test.GetClientStartTime getDefaultInstanceForType() {
      return build.buildfarm.v1test.GetClientStartTime.getDefaultInstance();
    }

    @java.lang.Override
    public build.buildfarm.v1test.GetClientStartTime build() {
      build.buildfarm.v1test.GetClientStartTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buildfarm.v1test.GetClientStartTime buildPartial() {
      build.buildfarm.v1test.GetClientStartTime result = new build.buildfarm.v1test.GetClientStartTime(this);
      result.instanceName_ = instanceName_;
      if (clientStartTimeBuilder_ == null) {
        result.clientStartTime_ = clientStartTime_;
      } else {
        result.clientStartTime_ = clientStartTimeBuilder_.build();
      }
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
      if (other instanceof build.buildfarm.v1test.GetClientStartTime) {
        return mergeFrom((build.buildfarm.v1test.GetClientStartTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buildfarm.v1test.GetClientStartTime other) {
      if (other == build.buildfarm.v1test.GetClientStartTime.getDefaultInstance()) return this;
      if (!other.getInstanceName().isEmpty()) {
        instanceName_ = other.instanceName_;
        onChanged();
      }
      if (other.hasClientStartTime()) {
        mergeClientStartTime(other.getClientStartTime());
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
      build.buildfarm.v1test.GetClientStartTime parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.buildfarm.v1test.GetClientStartTime) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object instanceName_ = "";
    /**
     * <code>string instance_name = 1;</code>
     */
    public java.lang.String getInstanceName() {
      java.lang.Object ref = instanceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string instance_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInstanceNameBytes() {
      java.lang.Object ref = instanceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string instance_name = 1;</code>
     */
    public Builder setInstanceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string instance_name = 1;</code>
     */
    public Builder clearInstanceName() {
      
      instanceName_ = getDefaultInstance().getInstanceName();
      onChanged();
      return this;
    }
    /**
     * <code>string instance_name = 1;</code>
     */
    public Builder setInstanceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp clientStartTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> clientStartTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
     */
    public boolean hasClientStartTime() {
      return clientStartTimeBuilder_ != null || clientStartTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
     */
    public com.google.protobuf.Timestamp getClientStartTime() {
      if (clientStartTimeBuilder_ == null) {
        return clientStartTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : clientStartTime_;
      } else {
        return clientStartTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
     */
    public Builder setClientStartTime(com.google.protobuf.Timestamp value) {
      if (clientStartTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientStartTime_ = value;
        onChanged();
      } else {
        clientStartTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
     */
    public Builder setClientStartTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (clientStartTimeBuilder_ == null) {
        clientStartTime_ = builderForValue.build();
        onChanged();
      } else {
        clientStartTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
     */
    public Builder mergeClientStartTime(com.google.protobuf.Timestamp value) {
      if (clientStartTimeBuilder_ == null) {
        if (clientStartTime_ != null) {
          clientStartTime_ =
            com.google.protobuf.Timestamp.newBuilder(clientStartTime_).mergeFrom(value).buildPartial();
        } else {
          clientStartTime_ = value;
        }
        onChanged();
      } else {
        clientStartTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
     */
    public Builder clearClientStartTime() {
      if (clientStartTimeBuilder_ == null) {
        clientStartTime_ = null;
        onChanged();
      } else {
        clientStartTime_ = null;
        clientStartTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getClientStartTimeBuilder() {
      
      onChanged();
      return getClientStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getClientStartTimeOrBuilder() {
      if (clientStartTimeBuilder_ != null) {
        return clientStartTimeBuilder_.getMessageOrBuilder();
      } else {
        return clientStartTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : clientStartTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getClientStartTimeFieldBuilder() {
      if (clientStartTimeBuilder_ == null) {
        clientStartTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getClientStartTime(),
                getParentForChildren(),
                isClean());
        clientStartTime_ = null;
      }
      return clientStartTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:build.buildfarm.v1test.GetClientStartTime)
  }

  // @@protoc_insertion_point(class_scope:build.buildfarm.v1test.GetClientStartTime)
  private static final build.buildfarm.v1test.GetClientStartTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buildfarm.v1test.GetClientStartTime();
  }

  public static build.buildfarm.v1test.GetClientStartTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetClientStartTime>
      PARSER = new com.google.protobuf.AbstractParser<GetClientStartTime>() {
    @java.lang.Override
    public GetClientStartTime parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetClientStartTime(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetClientStartTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetClientStartTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buildfarm.v1test.GetClientStartTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
