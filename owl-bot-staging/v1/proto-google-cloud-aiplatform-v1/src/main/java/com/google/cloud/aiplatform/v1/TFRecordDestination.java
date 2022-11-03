// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/io.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * The storage details for TFRecord output content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.TFRecordDestination}
 */
public final class TFRecordDestination extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.TFRecordDestination)
    TFRecordDestinationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TFRecordDestination.newBuilder() to construct.
  private TFRecordDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TFRecordDestination() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TFRecordDestination();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.IoProto.internal_static_google_cloud_aiplatform_v1_TFRecordDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.IoProto.internal_static_google_cloud_aiplatform_v1_TFRecordDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.TFRecordDestination.class, com.google.cloud.aiplatform.v1.TFRecordDestination.Builder.class);
  }

  public static final int GCS_DESTINATION_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.GcsDestination gcsDestination_;
  /**
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the gcsDestination field is set.
   */
  @java.lang.Override
  public boolean hasGcsDestination() {
    return gcsDestination_ != null;
  }
  /**
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gcsDestination.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GcsDestination getGcsDestination() {
    return gcsDestination_ == null ? com.google.cloud.aiplatform.v1.GcsDestination.getDefaultInstance() : gcsDestination_;
  }
  /**
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GcsDestinationOrBuilder getGcsDestinationOrBuilder() {
    return getGcsDestination();
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
    if (gcsDestination_ != null) {
      output.writeMessage(1, getGcsDestination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gcsDestination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGcsDestination());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.TFRecordDestination)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.TFRecordDestination other = (com.google.cloud.aiplatform.v1.TFRecordDestination) obj;

    if (hasGcsDestination() != other.hasGcsDestination()) return false;
    if (hasGcsDestination()) {
      if (!getGcsDestination()
          .equals(other.getGcsDestination())) return false;
    }
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
    if (hasGcsDestination()) {
      hash = (37 * hash) + GCS_DESTINATION_FIELD_NUMBER;
      hash = (53 * hash) + getGcsDestination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.TFRecordDestination parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.TFRecordDestination prototype) {
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
   * The storage details for TFRecord output content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.TFRecordDestination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.TFRecordDestination)
      com.google.cloud.aiplatform.v1.TFRecordDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.IoProto.internal_static_google_cloud_aiplatform_v1_TFRecordDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.IoProto.internal_static_google_cloud_aiplatform_v1_TFRecordDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.TFRecordDestination.class, com.google.cloud.aiplatform.v1.TFRecordDestination.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.TFRecordDestination.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gcsDestinationBuilder_ == null) {
        gcsDestination_ = null;
      } else {
        gcsDestination_ = null;
        gcsDestinationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.IoProto.internal_static_google_cloud_aiplatform_v1_TFRecordDestination_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.TFRecordDestination getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.TFRecordDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.TFRecordDestination build() {
      com.google.cloud.aiplatform.v1.TFRecordDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.TFRecordDestination buildPartial() {
      com.google.cloud.aiplatform.v1.TFRecordDestination result = new com.google.cloud.aiplatform.v1.TFRecordDestination(this);
      if (gcsDestinationBuilder_ == null) {
        result.gcsDestination_ = gcsDestination_;
      } else {
        result.gcsDestination_ = gcsDestinationBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.TFRecordDestination) {
        return mergeFrom((com.google.cloud.aiplatform.v1.TFRecordDestination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.TFRecordDestination other) {
      if (other == com.google.cloud.aiplatform.v1.TFRecordDestination.getDefaultInstance()) return this;
      if (other.hasGcsDestination()) {
        mergeGcsDestination(other.getGcsDestination());
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
            case 10: {
              input.readMessage(
                  getGcsDestinationFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private com.google.cloud.aiplatform.v1.GcsDestination gcsDestination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.GcsDestination, com.google.cloud.aiplatform.v1.GcsDestination.Builder, com.google.cloud.aiplatform.v1.GcsDestinationOrBuilder> gcsDestinationBuilder_;
    /**
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the gcsDestination field is set.
     */
    public boolean hasGcsDestination() {
      return gcsDestinationBuilder_ != null || gcsDestination_ != null;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The gcsDestination.
     */
    public com.google.cloud.aiplatform.v1.GcsDestination getGcsDestination() {
      if (gcsDestinationBuilder_ == null) {
        return gcsDestination_ == null ? com.google.cloud.aiplatform.v1.GcsDestination.getDefaultInstance() : gcsDestination_;
      } else {
        return gcsDestinationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGcsDestination(com.google.cloud.aiplatform.v1.GcsDestination value) {
      if (gcsDestinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsDestination_ = value;
        onChanged();
      } else {
        gcsDestinationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGcsDestination(
        com.google.cloud.aiplatform.v1.GcsDestination.Builder builderForValue) {
      if (gcsDestinationBuilder_ == null) {
        gcsDestination_ = builderForValue.build();
        onChanged();
      } else {
        gcsDestinationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeGcsDestination(com.google.cloud.aiplatform.v1.GcsDestination value) {
      if (gcsDestinationBuilder_ == null) {
        if (gcsDestination_ != null) {
          gcsDestination_ =
            com.google.cloud.aiplatform.v1.GcsDestination.newBuilder(gcsDestination_).mergeFrom(value).buildPartial();
        } else {
          gcsDestination_ = value;
        }
        onChanged();
      } else {
        gcsDestinationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearGcsDestination() {
      if (gcsDestinationBuilder_ == null) {
        gcsDestination_ = null;
        onChanged();
      } else {
        gcsDestination_ = null;
        gcsDestinationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.GcsDestination.Builder getGcsDestinationBuilder() {
      
      onChanged();
      return getGcsDestinationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.GcsDestinationOrBuilder getGcsDestinationOrBuilder() {
      if (gcsDestinationBuilder_ != null) {
        return gcsDestinationBuilder_.getMessageOrBuilder();
      } else {
        return gcsDestination_ == null ?
            com.google.cloud.aiplatform.v1.GcsDestination.getDefaultInstance() : gcsDestination_;
      }
    }
    /**
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.GcsDestination, com.google.cloud.aiplatform.v1.GcsDestination.Builder, com.google.cloud.aiplatform.v1.GcsDestinationOrBuilder> 
        getGcsDestinationFieldBuilder() {
      if (gcsDestinationBuilder_ == null) {
        gcsDestinationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.GcsDestination, com.google.cloud.aiplatform.v1.GcsDestination.Builder, com.google.cloud.aiplatform.v1.GcsDestinationOrBuilder>(
                getGcsDestination(),
                getParentForChildren(),
                isClean());
        gcsDestination_ = null;
      }
      return gcsDestinationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.TFRecordDestination)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.TFRecordDestination)
  private static final com.google.cloud.aiplatform.v1.TFRecordDestination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.TFRecordDestination();
  }

  public static com.google.cloud.aiplatform.v1.TFRecordDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TFRecordDestination>
      PARSER = new com.google.protobuf.AbstractParser<TFRecordDestination>() {
    @java.lang.Override
    public TFRecordDestination parsePartialFrom(
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

  public static com.google.protobuf.Parser<TFRecordDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TFRecordDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TFRecordDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
