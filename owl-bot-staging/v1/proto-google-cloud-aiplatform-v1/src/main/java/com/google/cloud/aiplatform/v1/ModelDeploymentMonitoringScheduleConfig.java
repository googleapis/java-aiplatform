// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_deployment_monitoring_job.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * The config for scheduling monitoring job.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig}
 */
public final class ModelDeploymentMonitoringScheduleConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig)
    ModelDeploymentMonitoringScheduleConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModelDeploymentMonitoringScheduleConfig.newBuilder() to construct.
  private ModelDeploymentMonitoringScheduleConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModelDeploymentMonitoringScheduleConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModelDeploymentMonitoringScheduleConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModelDeploymentMonitoringScheduleConfig(
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
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (monitorInterval_ != null) {
              subBuilder = monitorInterval_.toBuilder();
            }
            monitorInterval_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(monitorInterval_);
              monitorInterval_ = subBuilder.buildPartial();
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
    return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig.class, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig.Builder.class);
  }

  public static final int MONITOR_INTERVAL_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration monitorInterval_;
  /**
   * <pre>
   * Required. The model monitoring job running interval. It will be rounded up to next
   * full hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the monitorInterval field is set.
   */
  @java.lang.Override
  public boolean hasMonitorInterval() {
    return monitorInterval_ != null;
  }
  /**
   * <pre>
   * Required. The model monitoring job running interval. It will be rounded up to next
   * full hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The monitorInterval.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getMonitorInterval() {
    return monitorInterval_ == null ? com.google.protobuf.Duration.getDefaultInstance() : monitorInterval_;
  }
  /**
   * <pre>
   * Required. The model monitoring job running interval. It will be rounded up to next
   * full hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getMonitorIntervalOrBuilder() {
    return getMonitorInterval();
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
    if (monitorInterval_ != null) {
      output.writeMessage(1, getMonitorInterval());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (monitorInterval_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMonitorInterval());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig other = (com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig) obj;

    if (hasMonitorInterval() != other.hasMonitorInterval()) return false;
    if (hasMonitorInterval()) {
      if (!getMonitorInterval()
          .equals(other.getMonitorInterval())) return false;
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
    if (hasMonitorInterval()) {
      hash = (37 * hash) + MONITOR_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getMonitorInterval().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig prototype) {
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
   * <pre>
   * The config for scheduling monitoring job.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig)
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig.class, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig.newBuilder()
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
      if (monitorIntervalBuilder_ == null) {
        monitorInterval_ = null;
      } else {
        monitorInterval_ = null;
        monitorIntervalBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringScheduleConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig build() {
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig buildPartial() {
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig result = new com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig(this);
      if (monitorIntervalBuilder_ == null) {
        result.monitorInterval_ = monitorInterval_;
      } else {
        result.monitorInterval_ = monitorIntervalBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig other) {
      if (other == com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig.getDefaultInstance()) return this;
      if (other.hasMonitorInterval()) {
        mergeMonitorInterval(other.getMonitorInterval());
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
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration monitorInterval_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> monitorIntervalBuilder_;
    /**
     * <pre>
     * Required. The model monitoring job running interval. It will be rounded up to next
     * full hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the monitorInterval field is set.
     */
    public boolean hasMonitorInterval() {
      return monitorIntervalBuilder_ != null || monitorInterval_ != null;
    }
    /**
     * <pre>
     * Required. The model monitoring job running interval. It will be rounded up to next
     * full hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The monitorInterval.
     */
    public com.google.protobuf.Duration getMonitorInterval() {
      if (monitorIntervalBuilder_ == null) {
        return monitorInterval_ == null ? com.google.protobuf.Duration.getDefaultInstance() : monitorInterval_;
      } else {
        return monitorIntervalBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The model monitoring job running interval. It will be rounded up to next
     * full hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMonitorInterval(com.google.protobuf.Duration value) {
      if (monitorIntervalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        monitorInterval_ = value;
        onChanged();
      } else {
        monitorIntervalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The model monitoring job running interval. It will be rounded up to next
     * full hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMonitorInterval(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (monitorIntervalBuilder_ == null) {
        monitorInterval_ = builderForValue.build();
        onChanged();
      } else {
        monitorIntervalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The model monitoring job running interval. It will be rounded up to next
     * full hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeMonitorInterval(com.google.protobuf.Duration value) {
      if (monitorIntervalBuilder_ == null) {
        if (monitorInterval_ != null) {
          monitorInterval_ =
            com.google.protobuf.Duration.newBuilder(monitorInterval_).mergeFrom(value).buildPartial();
        } else {
          monitorInterval_ = value;
        }
        onChanged();
      } else {
        monitorIntervalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The model monitoring job running interval. It will be rounded up to next
     * full hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMonitorInterval() {
      if (monitorIntervalBuilder_ == null) {
        monitorInterval_ = null;
        onChanged();
      } else {
        monitorInterval_ = null;
        monitorIntervalBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The model monitoring job running interval. It will be rounded up to next
     * full hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.Duration.Builder getMonitorIntervalBuilder() {
      
      onChanged();
      return getMonitorIntervalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The model monitoring job running interval. It will be rounded up to next
     * full hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.DurationOrBuilder getMonitorIntervalOrBuilder() {
      if (monitorIntervalBuilder_ != null) {
        return monitorIntervalBuilder_.getMessageOrBuilder();
      } else {
        return monitorInterval_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : monitorInterval_;
      }
    }
    /**
     * <pre>
     * Required. The model monitoring job running interval. It will be rounded up to next
     * full hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getMonitorIntervalFieldBuilder() {
      if (monitorIntervalBuilder_ == null) {
        monitorIntervalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getMonitorInterval(),
                getParentForChildren(),
                isClean());
        monitorInterval_ = null;
      }
      return monitorIntervalBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig)
  private static final com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig();
  }

  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelDeploymentMonitoringScheduleConfig>
      PARSER = new com.google.protobuf.AbstractParser<ModelDeploymentMonitoringScheduleConfig>() {
    @java.lang.Override
    public ModelDeploymentMonitoringScheduleConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModelDeploymentMonitoringScheduleConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModelDeploymentMonitoringScheduleConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelDeploymentMonitoringScheduleConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

