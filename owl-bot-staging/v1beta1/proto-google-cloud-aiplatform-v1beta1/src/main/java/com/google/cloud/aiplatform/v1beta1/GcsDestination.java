// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/io.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * The Google Cloud Storage location where the output is to be written to.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.GcsDestination}
 */
public final class GcsDestination extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.GcsDestination)
    GcsDestinationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcsDestination.newBuilder() to construct.
  private GcsDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcsDestination() {
    outputUriPrefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcsDestination();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GcsDestination(
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

            outputUriPrefix_ = s;
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
    return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.GcsDestination.class, com.google.cloud.aiplatform.v1beta1.GcsDestination.Builder.class);
  }

  public static final int OUTPUT_URI_PREFIX_FIELD_NUMBER = 1;
  private volatile java.lang.Object outputUriPrefix_;
  /**
   * <pre>
   * Required. Google Cloud Storage URI to output directory. If the uri doesn't end with
   * '/', a '/' will be automatically appended. The directory is created if it
   * doesn't exist.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputUriPrefix.
   */
  @java.lang.Override
  public java.lang.String getOutputUriPrefix() {
    java.lang.Object ref = outputUriPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputUriPrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URI to output directory. If the uri doesn't end with
   * '/', a '/' will be automatically appended. The directory is created if it
   * doesn't exist.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for outputUriPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutputUriPrefixBytes() {
    java.lang.Object ref = outputUriPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outputUriPrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getOutputUriPrefixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outputUriPrefix_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOutputUriPrefixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outputUriPrefix_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.GcsDestination)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.GcsDestination other = (com.google.cloud.aiplatform.v1beta1.GcsDestination) obj;

    if (!getOutputUriPrefix()
        .equals(other.getOutputUriPrefix())) return false;
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
    hash = (37 * hash) + OUTPUT_URI_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getOutputUriPrefix().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsDestination parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.GcsDestination prototype) {
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
   * The Google Cloud Storage location where the output is to be written to.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.GcsDestination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.GcsDestination)
      com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.GcsDestination.class, com.google.cloud.aiplatform.v1beta1.GcsDestination.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.GcsDestination.newBuilder()
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
      outputUriPrefix_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GcsDestination getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.GcsDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GcsDestination build() {
      com.google.cloud.aiplatform.v1beta1.GcsDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GcsDestination buildPartial() {
      com.google.cloud.aiplatform.v1beta1.GcsDestination result = new com.google.cloud.aiplatform.v1beta1.GcsDestination(this);
      result.outputUriPrefix_ = outputUriPrefix_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.GcsDestination) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.GcsDestination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.GcsDestination other) {
      if (other == com.google.cloud.aiplatform.v1beta1.GcsDestination.getDefaultInstance()) return this;
      if (!other.getOutputUriPrefix().isEmpty()) {
        outputUriPrefix_ = other.outputUriPrefix_;
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
      com.google.cloud.aiplatform.v1beta1.GcsDestination parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.GcsDestination) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object outputUriPrefix_ = "";
    /**
     * <pre>
     * Required. Google Cloud Storage URI to output directory. If the uri doesn't end with
     * '/', a '/' will be automatically appended. The directory is created if it
     * doesn't exist.
     * </pre>
     *
     * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The outputUriPrefix.
     */
    public java.lang.String getOutputUriPrefix() {
      java.lang.Object ref = outputUriPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputUriPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI to output directory. If the uri doesn't end with
     * '/', a '/' will be automatically appended. The directory is created if it
     * doesn't exist.
     * </pre>
     *
     * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for outputUriPrefix.
     */
    public com.google.protobuf.ByteString
        getOutputUriPrefixBytes() {
      java.lang.Object ref = outputUriPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputUriPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI to output directory. If the uri doesn't end with
     * '/', a '/' will be automatically appended. The directory is created if it
     * doesn't exist.
     * </pre>
     *
     * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The outputUriPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setOutputUriPrefix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      outputUriPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI to output directory. If the uri doesn't end with
     * '/', a '/' will be automatically appended. The directory is created if it
     * doesn't exist.
     * </pre>
     *
     * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearOutputUriPrefix() {
      
      outputUriPrefix_ = getDefaultInstance().getOutputUriPrefix();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI to output directory. If the uri doesn't end with
     * '/', a '/' will be automatically appended. The directory is created if it
     * doesn't exist.
     * </pre>
     *
     * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for outputUriPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setOutputUriPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      outputUriPrefix_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.GcsDestination)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.GcsDestination)
  private static final com.google.cloud.aiplatform.v1beta1.GcsDestination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.GcsDestination();
  }

  public static com.google.cloud.aiplatform.v1beta1.GcsDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsDestination>
      PARSER = new com.google.protobuf.AbstractParser<GcsDestination>() {
    @java.lang.Override
    public GcsDestination parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GcsDestination(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GcsDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GcsDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

