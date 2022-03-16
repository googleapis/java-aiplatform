// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Response message for [MetadataService.PurgeContexts][google.cloud.aiplatform.v1.MetadataService.PurgeContexts].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.PurgeContextsResponse}
 */
public final class PurgeContextsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.PurgeContextsResponse)
    PurgeContextsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PurgeContextsResponse.newBuilder() to construct.
  private PurgeContextsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PurgeContextsResponse() {
    purgeSample_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PurgeContextsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PurgeContextsResponse(
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
          case 8: {

            purgeCount_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              purgeSample_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            purgeSample_.add(s);
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
        purgeSample_ = purgeSample_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_PurgeContextsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_PurgeContextsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.PurgeContextsResponse.class, com.google.cloud.aiplatform.v1.PurgeContextsResponse.Builder.class);
  }

  public static final int PURGE_COUNT_FIELD_NUMBER = 1;
  private long purgeCount_;
  /**
   * <pre>
   * The number of Contexts that this request deleted (or, if `force` is false,
   * the number of Contexts that will be deleted). This can be an estimate.
   * </pre>
   *
   * <code>int64 purge_count = 1;</code>
   * @return The purgeCount.
   */
  @java.lang.Override
  public long getPurgeCount() {
    return purgeCount_;
  }

  public static final int PURGE_SAMPLE_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList purgeSample_;
  /**
   * <pre>
   * A sample of the Context names that will be deleted.
   * Only populated if `force` is set to false. The maximum number of samples is
   * 100 (it is possible to return fewer).
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the purgeSample.
   */
  public com.google.protobuf.ProtocolStringList
      getPurgeSampleList() {
    return purgeSample_;
  }
  /**
   * <pre>
   * A sample of the Context names that will be deleted.
   * Only populated if `force` is set to false. The maximum number of samples is
   * 100 (it is possible to return fewer).
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of purgeSample.
   */
  public int getPurgeSampleCount() {
    return purgeSample_.size();
  }
  /**
   * <pre>
   * A sample of the Context names that will be deleted.
   * Only populated if `force` is set to false. The maximum number of samples is
   * 100 (it is possible to return fewer).
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The purgeSample at the given index.
   */
  public java.lang.String getPurgeSample(int index) {
    return purgeSample_.get(index);
  }
  /**
   * <pre>
   * A sample of the Context names that will be deleted.
   * Only populated if `force` is set to false. The maximum number of samples is
   * 100 (it is possible to return fewer).
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the purgeSample at the given index.
   */
  public com.google.protobuf.ByteString
      getPurgeSampleBytes(int index) {
    return purgeSample_.getByteString(index);
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
    if (purgeCount_ != 0L) {
      output.writeInt64(1, purgeCount_);
    }
    for (int i = 0; i < purgeSample_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, purgeSample_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (purgeCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, purgeCount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < purgeSample_.size(); i++) {
        dataSize += computeStringSizeNoTag(purgeSample_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPurgeSampleList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.PurgeContextsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.PurgeContextsResponse other = (com.google.cloud.aiplatform.v1.PurgeContextsResponse) obj;

    if (getPurgeCount()
        != other.getPurgeCount()) return false;
    if (!getPurgeSampleList()
        .equals(other.getPurgeSampleList())) return false;
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
    hash = (37 * hash) + PURGE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPurgeCount());
    if (getPurgeSampleCount() > 0) {
      hash = (37 * hash) + PURGE_SAMPLE_FIELD_NUMBER;
      hash = (53 * hash) + getPurgeSampleList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.PurgeContextsResponse prototype) {
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
   * Response message for [MetadataService.PurgeContexts][google.cloud.aiplatform.v1.MetadataService.PurgeContexts].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.PurgeContextsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.PurgeContextsResponse)
      com.google.cloud.aiplatform.v1.PurgeContextsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_PurgeContextsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_PurgeContextsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.PurgeContextsResponse.class, com.google.cloud.aiplatform.v1.PurgeContextsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.PurgeContextsResponse.newBuilder()
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
      purgeCount_ = 0L;

      purgeSample_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_PurgeContextsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.PurgeContextsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.PurgeContextsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.PurgeContextsResponse build() {
      com.google.cloud.aiplatform.v1.PurgeContextsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.PurgeContextsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.PurgeContextsResponse result = new com.google.cloud.aiplatform.v1.PurgeContextsResponse(this);
      int from_bitField0_ = bitField0_;
      result.purgeCount_ = purgeCount_;
      if (((bitField0_ & 0x00000001) != 0)) {
        purgeSample_ = purgeSample_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.purgeSample_ = purgeSample_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.PurgeContextsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.PurgeContextsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.PurgeContextsResponse other) {
      if (other == com.google.cloud.aiplatform.v1.PurgeContextsResponse.getDefaultInstance()) return this;
      if (other.getPurgeCount() != 0L) {
        setPurgeCount(other.getPurgeCount());
      }
      if (!other.purgeSample_.isEmpty()) {
        if (purgeSample_.isEmpty()) {
          purgeSample_ = other.purgeSample_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePurgeSampleIsMutable();
          purgeSample_.addAll(other.purgeSample_);
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
      com.google.cloud.aiplatform.v1.PurgeContextsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.PurgeContextsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long purgeCount_ ;
    /**
     * <pre>
     * The number of Contexts that this request deleted (or, if `force` is false,
     * the number of Contexts that will be deleted). This can be an estimate.
     * </pre>
     *
     * <code>int64 purge_count = 1;</code>
     * @return The purgeCount.
     */
    @java.lang.Override
    public long getPurgeCount() {
      return purgeCount_;
    }
    /**
     * <pre>
     * The number of Contexts that this request deleted (or, if `force` is false,
     * the number of Contexts that will be deleted). This can be an estimate.
     * </pre>
     *
     * <code>int64 purge_count = 1;</code>
     * @param value The purgeCount to set.
     * @return This builder for chaining.
     */
    public Builder setPurgeCount(long value) {
      
      purgeCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of Contexts that this request deleted (or, if `force` is false,
     * the number of Contexts that will be deleted). This can be an estimate.
     * </pre>
     *
     * <code>int64 purge_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPurgeCount() {
      
      purgeCount_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList purgeSample_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePurgeSampleIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        purgeSample_ = new com.google.protobuf.LazyStringArrayList(purgeSample_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * A sample of the Context names that will be deleted.
     * Only populated if `force` is set to false. The maximum number of samples is
     * 100 (it is possible to return fewer).
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return A list containing the purgeSample.
     */
    public com.google.protobuf.ProtocolStringList
        getPurgeSampleList() {
      return purgeSample_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A sample of the Context names that will be deleted.
     * Only populated if `force` is set to false. The maximum number of samples is
     * 100 (it is possible to return fewer).
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The count of purgeSample.
     */
    public int getPurgeSampleCount() {
      return purgeSample_.size();
    }
    /**
     * <pre>
     * A sample of the Context names that will be deleted.
     * Only populated if `force` is set to false. The maximum number of samples is
     * 100 (it is possible to return fewer).
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param index The index of the element to return.
     * @return The purgeSample at the given index.
     */
    public java.lang.String getPurgeSample(int index) {
      return purgeSample_.get(index);
    }
    /**
     * <pre>
     * A sample of the Context names that will be deleted.
     * Only populated if `force` is set to false. The maximum number of samples is
     * 100 (it is possible to return fewer).
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param index The index of the value to return.
     * @return The bytes of the purgeSample at the given index.
     */
    public com.google.protobuf.ByteString
        getPurgeSampleBytes(int index) {
      return purgeSample_.getByteString(index);
    }
    /**
     * <pre>
     * A sample of the Context names that will be deleted.
     * Only populated if `force` is set to false. The maximum number of samples is
     * 100 (it is possible to return fewer).
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The purgeSample to set.
     * @return This builder for chaining.
     */
    public Builder setPurgeSample(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePurgeSampleIsMutable();
      purgeSample_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sample of the Context names that will be deleted.
     * Only populated if `force` is set to false. The maximum number of samples is
     * 100 (it is possible to return fewer).
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The purgeSample to add.
     * @return This builder for chaining.
     */
    public Builder addPurgeSample(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePurgeSampleIsMutable();
      purgeSample_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sample of the Context names that will be deleted.
     * Only populated if `force` is set to false. The maximum number of samples is
     * 100 (it is possible to return fewer).
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param values The purgeSample to add.
     * @return This builder for chaining.
     */
    public Builder addAllPurgeSample(
        java.lang.Iterable<java.lang.String> values) {
      ensurePurgeSampleIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, purgeSample_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sample of the Context names that will be deleted.
     * Only populated if `force` is set to false. The maximum number of samples is
     * 100 (it is possible to return fewer).
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPurgeSample() {
      purgeSample_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sample of the Context names that will be deleted.
     * Only populated if `force` is set to false. The maximum number of samples is
     * 100 (it is possible to return fewer).
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes of the purgeSample to add.
     * @return This builder for chaining.
     */
    public Builder addPurgeSampleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePurgeSampleIsMutable();
      purgeSample_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.PurgeContextsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.PurgeContextsResponse)
  private static final com.google.cloud.aiplatform.v1.PurgeContextsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.PurgeContextsResponse();
  }

  public static com.google.cloud.aiplatform.v1.PurgeContextsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PurgeContextsResponse>
      PARSER = new com.google.protobuf.AbstractParser<PurgeContextsResponse>() {
    @java.lang.Override
    public PurgeContextsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PurgeContextsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PurgeContextsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PurgeContextsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.PurgeContextsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

