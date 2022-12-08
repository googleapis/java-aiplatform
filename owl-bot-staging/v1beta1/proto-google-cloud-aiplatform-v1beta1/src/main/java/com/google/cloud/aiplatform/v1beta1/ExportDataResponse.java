// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Response message for [DatasetService.ExportData][google.cloud.aiplatform.v1beta1.DatasetService.ExportData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExportDataResponse}
 */
public final class ExportDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ExportDataResponse)
    ExportDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportDataResponse.newBuilder() to construct.
  private ExportDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportDataResponse() {
    exportedFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportDataResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ExportDataResponse.class, com.google.cloud.aiplatform.v1beta1.ExportDataResponse.Builder.class);
  }

  public static final int EXPORTED_FILES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList exportedFiles_;
  /**
   * <pre>
   * All of the files that are exported in this export operation.
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   * @return A list containing the exportedFiles.
   */
  public com.google.protobuf.ProtocolStringList
      getExportedFilesList() {
    return exportedFiles_;
  }
  /**
   * <pre>
   * All of the files that are exported in this export operation.
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   * @return The count of exportedFiles.
   */
  public int getExportedFilesCount() {
    return exportedFiles_.size();
  }
  /**
   * <pre>
   * All of the files that are exported in this export operation.
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   * @param index The index of the element to return.
   * @return The exportedFiles at the given index.
   */
  public java.lang.String getExportedFiles(int index) {
    return exportedFiles_.get(index);
  }
  /**
   * <pre>
   * All of the files that are exported in this export operation.
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the exportedFiles at the given index.
   */
  public com.google.protobuf.ByteString
      getExportedFilesBytes(int index) {
    return exportedFiles_.getByteString(index);
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
    for (int i = 0; i < exportedFiles_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, exportedFiles_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < exportedFiles_.size(); i++) {
        dataSize += computeStringSizeNoTag(exportedFiles_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getExportedFilesList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ExportDataResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ExportDataResponse other = (com.google.cloud.aiplatform.v1beta1.ExportDataResponse) obj;

    if (!getExportedFilesList()
        .equals(other.getExportedFilesList())) return false;
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
    if (getExportedFilesCount() > 0) {
      hash = (37 * hash) + EXPORTED_FILES_FIELD_NUMBER;
      hash = (53 * hash) + getExportedFilesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ExportDataResponse prototype) {
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
   * Response message for [DatasetService.ExportData][google.cloud.aiplatform.v1beta1.DatasetService.ExportData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExportDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ExportDataResponse)
      com.google.cloud.aiplatform.v1beta1.ExportDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ExportDataResponse.class, com.google.cloud.aiplatform.v1beta1.ExportDataResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ExportDataResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      exportedFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExportDataResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ExportDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExportDataResponse build() {
      com.google.cloud.aiplatform.v1beta1.ExportDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExportDataResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ExportDataResponse result = new com.google.cloud.aiplatform.v1beta1.ExportDataResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        exportedFiles_ = exportedFiles_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.exportedFiles_ = exportedFiles_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ExportDataResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ExportDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ExportDataResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ExportDataResponse.getDefaultInstance()) return this;
      if (!other.exportedFiles_.isEmpty()) {
        if (exportedFiles_.isEmpty()) {
          exportedFiles_ = other.exportedFiles_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureExportedFilesIsMutable();
          exportedFiles_.addAll(other.exportedFiles_);
        }
        onChanged();
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureExportedFilesIsMutable();
              exportedFiles_.add(s);
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
    private int bitField0_;

    private com.google.protobuf.LazyStringList exportedFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureExportedFilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        exportedFiles_ = new com.google.protobuf.LazyStringArrayList(exportedFiles_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * All of the files that are exported in this export operation.
     * </pre>
     *
     * <code>repeated string exported_files = 1;</code>
     * @return A list containing the exportedFiles.
     */
    public com.google.protobuf.ProtocolStringList
        getExportedFilesList() {
      return exportedFiles_.getUnmodifiableView();
    }
    /**
     * <pre>
     * All of the files that are exported in this export operation.
     * </pre>
     *
     * <code>repeated string exported_files = 1;</code>
     * @return The count of exportedFiles.
     */
    public int getExportedFilesCount() {
      return exportedFiles_.size();
    }
    /**
     * <pre>
     * All of the files that are exported in this export operation.
     * </pre>
     *
     * <code>repeated string exported_files = 1;</code>
     * @param index The index of the element to return.
     * @return The exportedFiles at the given index.
     */
    public java.lang.String getExportedFiles(int index) {
      return exportedFiles_.get(index);
    }
    /**
     * <pre>
     * All of the files that are exported in this export operation.
     * </pre>
     *
     * <code>repeated string exported_files = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the exportedFiles at the given index.
     */
    public com.google.protobuf.ByteString
        getExportedFilesBytes(int index) {
      return exportedFiles_.getByteString(index);
    }
    /**
     * <pre>
     * All of the files that are exported in this export operation.
     * </pre>
     *
     * <code>repeated string exported_files = 1;</code>
     * @param index The index to set the value at.
     * @param value The exportedFiles to set.
     * @return This builder for chaining.
     */
    public Builder setExportedFiles(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureExportedFilesIsMutable();
      exportedFiles_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * All of the files that are exported in this export operation.
     * </pre>
     *
     * <code>repeated string exported_files = 1;</code>
     * @param value The exportedFiles to add.
     * @return This builder for chaining.
     */
    public Builder addExportedFiles(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureExportedFilesIsMutable();
      exportedFiles_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * All of the files that are exported in this export operation.
     * </pre>
     *
     * <code>repeated string exported_files = 1;</code>
     * @param values The exportedFiles to add.
     * @return This builder for chaining.
     */
    public Builder addAllExportedFiles(
        java.lang.Iterable<java.lang.String> values) {
      ensureExportedFilesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, exportedFiles_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * All of the files that are exported in this export operation.
     * </pre>
     *
     * <code>repeated string exported_files = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExportedFiles() {
      exportedFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * All of the files that are exported in this export operation.
     * </pre>
     *
     * <code>repeated string exported_files = 1;</code>
     * @param value The bytes of the exportedFiles to add.
     * @return This builder for chaining.
     */
    public Builder addExportedFilesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureExportedFilesIsMutable();
      exportedFiles_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ExportDataResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ExportDataResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ExportDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ExportDataResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<ExportDataResponse>() {
    @java.lang.Override
    public ExportDataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExportDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

