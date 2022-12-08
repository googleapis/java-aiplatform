// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Statistics information about resource consumption.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ResourcesConsumed}
 */
public final class ResourcesConsumed extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ResourcesConsumed)
    ResourcesConsumedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourcesConsumed.newBuilder() to construct.
  private ResourcesConsumed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourcesConsumed() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourcesConsumed();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ResourcesConsumed.class, com.google.cloud.aiplatform.v1beta1.ResourcesConsumed.Builder.class);
  }

  public static final int REPLICA_HOURS_FIELD_NUMBER = 1;
  private double replicaHours_;
  /**
   * <pre>
   * Output only. The number of replica hours used. Note that many replicas may run in
   * parallel, and additionally any given work may be queued for some time.
   * Therefore this value is not strictly related to wall time.
   * </pre>
   *
   * <code>double replica_hours = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The replicaHours.
   */
  @java.lang.Override
  public double getReplicaHours() {
    return replicaHours_;
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
    if (java.lang.Double.doubleToRawLongBits(replicaHours_) != 0) {
      output.writeDouble(1, replicaHours_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(replicaHours_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, replicaHours_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ResourcesConsumed)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ResourcesConsumed other = (com.google.cloud.aiplatform.v1beta1.ResourcesConsumed) obj;

    if (java.lang.Double.doubleToLongBits(getReplicaHours())
        != java.lang.Double.doubleToLongBits(
            other.getReplicaHours())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REPLICA_HOURS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getReplicaHours()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ResourcesConsumed prototype) {
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
   * Statistics information about resource consumption.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ResourcesConsumed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ResourcesConsumed)
      com.google.cloud.aiplatform.v1beta1.ResourcesConsumedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ResourcesConsumed.class, com.google.cloud.aiplatform.v1beta1.ResourcesConsumed.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ResourcesConsumed.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      replicaHours_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ResourcesConsumed getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ResourcesConsumed.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ResourcesConsumed build() {
      com.google.cloud.aiplatform.v1beta1.ResourcesConsumed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ResourcesConsumed buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ResourcesConsumed result = new com.google.cloud.aiplatform.v1beta1.ResourcesConsumed(this);
      result.replicaHours_ = replicaHours_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ResourcesConsumed) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ResourcesConsumed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ResourcesConsumed other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ResourcesConsumed.getDefaultInstance()) return this;
      if (other.getReplicaHours() != 0D) {
        setReplicaHours(other.getReplicaHours());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {
              replicaHours_ = input.readDouble();

              break;
            } // case 9
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private double replicaHours_ ;
    /**
     * <pre>
     * Output only. The number of replica hours used. Note that many replicas may run in
     * parallel, and additionally any given work may be queued for some time.
     * Therefore this value is not strictly related to wall time.
     * </pre>
     *
     * <code>double replica_hours = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The replicaHours.
     */
    @java.lang.Override
    public double getReplicaHours() {
      return replicaHours_;
    }
    /**
     * <pre>
     * Output only. The number of replica hours used. Note that many replicas may run in
     * parallel, and additionally any given work may be queued for some time.
     * Therefore this value is not strictly related to wall time.
     * </pre>
     *
     * <code>double replica_hours = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The replicaHours to set.
     * @return This builder for chaining.
     */
    public Builder setReplicaHours(double value) {
      
      replicaHours_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The number of replica hours used. Note that many replicas may run in
     * parallel, and additionally any given work may be queued for some time.
     * Therefore this value is not strictly related to wall time.
     * </pre>
     *
     * <code>double replica_hours = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearReplicaHours() {
      
      replicaHours_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ResourcesConsumed)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ResourcesConsumed)
  private static final com.google.cloud.aiplatform.v1beta1.ResourcesConsumed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ResourcesConsumed();
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourcesConsumed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourcesConsumed>
      PARSER = new com.google.protobuf.AbstractParser<ResourcesConsumed>() {
    @java.lang.Override
    public ResourcesConsumed parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ResourcesConsumed> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourcesConsumed> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ResourcesConsumed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

