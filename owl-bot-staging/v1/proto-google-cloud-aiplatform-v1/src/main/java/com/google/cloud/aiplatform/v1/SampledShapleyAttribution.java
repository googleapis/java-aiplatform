// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/explanation.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * An attribution method that approximates Shapley values for features that
 * contribute to the label being predicted. A sampling strategy is used to
 * approximate the value rather than considering all subsets of features.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.SampledShapleyAttribution}
 */
public final class SampledShapleyAttribution extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.SampledShapleyAttribution)
    SampledShapleyAttributionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SampledShapleyAttribution.newBuilder() to construct.
  private SampledShapleyAttribution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SampledShapleyAttribution() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SampledShapleyAttribution();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SampledShapleyAttribution(
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
          case 8: {

            pathCount_ = input.readInt32();
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
    return com.google.cloud.aiplatform.v1.ExplanationProto.internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ExplanationProto.internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.SampledShapleyAttribution.class, com.google.cloud.aiplatform.v1.SampledShapleyAttribution.Builder.class);
  }

  public static final int PATH_COUNT_FIELD_NUMBER = 1;
  private int pathCount_;
  /**
   * <pre>
   * Required. The number of feature permutations to consider when approximating the
   * Shapley values.
   * Valid range of its value is [1, 50], inclusively.
   * </pre>
   *
   * <code>int32 path_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The pathCount.
   */
  @java.lang.Override
  public int getPathCount() {
    return pathCount_;
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
    if (pathCount_ != 0) {
      output.writeInt32(1, pathCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pathCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pathCount_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.SampledShapleyAttribution)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.SampledShapleyAttribution other = (com.google.cloud.aiplatform.v1.SampledShapleyAttribution) obj;

    if (getPathCount()
        != other.getPathCount()) return false;
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
    hash = (37 * hash) + PATH_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPathCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.SampledShapleyAttribution prototype) {
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
   * An attribution method that approximates Shapley values for features that
   * contribute to the label being predicted. A sampling strategy is used to
   * approximate the value rather than considering all subsets of features.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.SampledShapleyAttribution}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.SampledShapleyAttribution)
      com.google.cloud.aiplatform.v1.SampledShapleyAttributionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.ExplanationProto.internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ExplanationProto.internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.SampledShapleyAttribution.class, com.google.cloud.aiplatform.v1.SampledShapleyAttribution.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.SampledShapleyAttribution.newBuilder()
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
      pathCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ExplanationProto.internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SampledShapleyAttribution getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.SampledShapleyAttribution.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SampledShapleyAttribution build() {
      com.google.cloud.aiplatform.v1.SampledShapleyAttribution result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SampledShapleyAttribution buildPartial() {
      com.google.cloud.aiplatform.v1.SampledShapleyAttribution result = new com.google.cloud.aiplatform.v1.SampledShapleyAttribution(this);
      result.pathCount_ = pathCount_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.SampledShapleyAttribution) {
        return mergeFrom((com.google.cloud.aiplatform.v1.SampledShapleyAttribution)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.SampledShapleyAttribution other) {
      if (other == com.google.cloud.aiplatform.v1.SampledShapleyAttribution.getDefaultInstance()) return this;
      if (other.getPathCount() != 0) {
        setPathCount(other.getPathCount());
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
      com.google.cloud.aiplatform.v1.SampledShapleyAttribution parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.SampledShapleyAttribution) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pathCount_ ;
    /**
     * <pre>
     * Required. The number of feature permutations to consider when approximating the
     * Shapley values.
     * Valid range of its value is [1, 50], inclusively.
     * </pre>
     *
     * <code>int32 path_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The pathCount.
     */
    @java.lang.Override
    public int getPathCount() {
      return pathCount_;
    }
    /**
     * <pre>
     * Required. The number of feature permutations to consider when approximating the
     * Shapley values.
     * Valid range of its value is [1, 50], inclusively.
     * </pre>
     *
     * <code>int32 path_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The pathCount to set.
     * @return This builder for chaining.
     */
    public Builder setPathCount(int value) {
      
      pathCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The number of feature permutations to consider when approximating the
     * Shapley values.
     * Valid range of its value is [1, 50], inclusively.
     * </pre>
     *
     * <code>int32 path_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPathCount() {
      
      pathCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.SampledShapleyAttribution)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.SampledShapleyAttribution)
  private static final com.google.cloud.aiplatform.v1.SampledShapleyAttribution DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.SampledShapleyAttribution();
  }

  public static com.google.cloud.aiplatform.v1.SampledShapleyAttribution getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SampledShapleyAttribution>
      PARSER = new com.google.protobuf.AbstractParser<SampledShapleyAttribution>() {
    @java.lang.Override
    public SampledShapleyAttribution parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SampledShapleyAttribution(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SampledShapleyAttribution> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SampledShapleyAttribution> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SampledShapleyAttribution getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

