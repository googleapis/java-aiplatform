// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/dataset_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for [DatasetService.ImportData][google.cloud.aiplatform.v1.DatasetService.ImportData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ImportDataRequest}
 */
public final class ImportDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ImportDataRequest)
    ImportDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportDataRequest.newBuilder() to construct.
  private ImportDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportDataRequest() {
    name_ = "";
    importConfigs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImportDataRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              importConfigs_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.ImportDataConfig>();
              mutable_bitField0_ |= 0x00000001;
            }
            importConfigs_.add(
                input.readMessage(com.google.cloud.aiplatform.v1.ImportDataConfig.parser(), extensionRegistry));
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
        importConfigs_ = java.util.Collections.unmodifiableList(importConfigs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ImportDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ImportDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ImportDataRequest.class, com.google.cloud.aiplatform.v1.ImportDataRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMPORT_CONFIGS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.aiplatform.v1.ImportDataConfig> importConfigs_;
  /**
   * <pre>
   * Required. The desired input locations. The contents of all input locations will be
   * imported in one batch.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.ImportDataConfig> getImportConfigsList() {
    return importConfigs_;
  }
  /**
   * <pre>
   * Required. The desired input locations. The contents of all input locations will be
   * imported in one batch.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.ImportDataConfigOrBuilder> 
      getImportConfigsOrBuilderList() {
    return importConfigs_;
  }
  /**
   * <pre>
   * Required. The desired input locations. The contents of all input locations will be
   * imported in one batch.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getImportConfigsCount() {
    return importConfigs_.size();
  }
  /**
   * <pre>
   * Required. The desired input locations. The contents of all input locations will be
   * imported in one batch.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ImportDataConfig getImportConfigs(int index) {
    return importConfigs_.get(index);
  }
  /**
   * <pre>
   * Required. The desired input locations. The contents of all input locations will be
   * imported in one batch.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ImportDataConfigOrBuilder getImportConfigsOrBuilder(
      int index) {
    return importConfigs_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < importConfigs_.size(); i++) {
      output.writeMessage(2, importConfigs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < importConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, importConfigs_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ImportDataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ImportDataRequest other = (com.google.cloud.aiplatform.v1.ImportDataRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getImportConfigsList()
        .equals(other.getImportConfigsList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getImportConfigsCount() > 0) {
      hash = (37 * hash) + IMPORT_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getImportConfigsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ImportDataRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ImportDataRequest prototype) {
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
   * Request message for [DatasetService.ImportData][google.cloud.aiplatform.v1.DatasetService.ImportData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ImportDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ImportDataRequest)
      com.google.cloud.aiplatform.v1.ImportDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ImportDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ImportDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ImportDataRequest.class, com.google.cloud.aiplatform.v1.ImportDataRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ImportDataRequest.newBuilder()
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
        getImportConfigsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (importConfigsBuilder_ == null) {
        importConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        importConfigsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ImportDataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ImportDataRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ImportDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ImportDataRequest build() {
      com.google.cloud.aiplatform.v1.ImportDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ImportDataRequest buildPartial() {
      com.google.cloud.aiplatform.v1.ImportDataRequest result = new com.google.cloud.aiplatform.v1.ImportDataRequest(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (importConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          importConfigs_ = java.util.Collections.unmodifiableList(importConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.importConfigs_ = importConfigs_;
      } else {
        result.importConfigs_ = importConfigsBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.ImportDataRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ImportDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ImportDataRequest other) {
      if (other == com.google.cloud.aiplatform.v1.ImportDataRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (importConfigsBuilder_ == null) {
        if (!other.importConfigs_.isEmpty()) {
          if (importConfigs_.isEmpty()) {
            importConfigs_ = other.importConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureImportConfigsIsMutable();
            importConfigs_.addAll(other.importConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.importConfigs_.isEmpty()) {
          if (importConfigsBuilder_.isEmpty()) {
            importConfigsBuilder_.dispose();
            importConfigsBuilder_ = null;
            importConfigs_ = other.importConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            importConfigsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getImportConfigsFieldBuilder() : null;
          } else {
            importConfigsBuilder_.addAllMessages(other.importConfigs_);
          }
        }
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
      com.google.cloud.aiplatform.v1.ImportDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.ImportDataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.aiplatform.v1.ImportDataConfig> importConfigs_ =
      java.util.Collections.emptyList();
    private void ensureImportConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        importConfigs_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.ImportDataConfig>(importConfigs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.ImportDataConfig, com.google.cloud.aiplatform.v1.ImportDataConfig.Builder, com.google.cloud.aiplatform.v1.ImportDataConfigOrBuilder> importConfigsBuilder_;

    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.ImportDataConfig> getImportConfigsList() {
      if (importConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(importConfigs_);
      } else {
        return importConfigsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getImportConfigsCount() {
      if (importConfigsBuilder_ == null) {
        return importConfigs_.size();
      } else {
        return importConfigsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.ImportDataConfig getImportConfigs(int index) {
      if (importConfigsBuilder_ == null) {
        return importConfigs_.get(index);
      } else {
        return importConfigsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setImportConfigs(
        int index, com.google.cloud.aiplatform.v1.ImportDataConfig value) {
      if (importConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImportConfigsIsMutable();
        importConfigs_.set(index, value);
        onChanged();
      } else {
        importConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setImportConfigs(
        int index, com.google.cloud.aiplatform.v1.ImportDataConfig.Builder builderForValue) {
      if (importConfigsBuilder_ == null) {
        ensureImportConfigsIsMutable();
        importConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        importConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addImportConfigs(com.google.cloud.aiplatform.v1.ImportDataConfig value) {
      if (importConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImportConfigsIsMutable();
        importConfigs_.add(value);
        onChanged();
      } else {
        importConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addImportConfigs(
        int index, com.google.cloud.aiplatform.v1.ImportDataConfig value) {
      if (importConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImportConfigsIsMutable();
        importConfigs_.add(index, value);
        onChanged();
      } else {
        importConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addImportConfigs(
        com.google.cloud.aiplatform.v1.ImportDataConfig.Builder builderForValue) {
      if (importConfigsBuilder_ == null) {
        ensureImportConfigsIsMutable();
        importConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        importConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addImportConfigs(
        int index, com.google.cloud.aiplatform.v1.ImportDataConfig.Builder builderForValue) {
      if (importConfigsBuilder_ == null) {
        ensureImportConfigsIsMutable();
        importConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        importConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllImportConfigs(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.ImportDataConfig> values) {
      if (importConfigsBuilder_ == null) {
        ensureImportConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, importConfigs_);
        onChanged();
      } else {
        importConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearImportConfigs() {
      if (importConfigsBuilder_ == null) {
        importConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        importConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeImportConfigs(int index) {
      if (importConfigsBuilder_ == null) {
        ensureImportConfigsIsMutable();
        importConfigs_.remove(index);
        onChanged();
      } else {
        importConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.ImportDataConfig.Builder getImportConfigsBuilder(
        int index) {
      return getImportConfigsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.ImportDataConfigOrBuilder getImportConfigsOrBuilder(
        int index) {
      if (importConfigsBuilder_ == null) {
        return importConfigs_.get(index);  } else {
        return importConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.ImportDataConfigOrBuilder> 
         getImportConfigsOrBuilderList() {
      if (importConfigsBuilder_ != null) {
        return importConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(importConfigs_);
      }
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.ImportDataConfig.Builder addImportConfigsBuilder() {
      return getImportConfigsFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1.ImportDataConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.ImportDataConfig.Builder addImportConfigsBuilder(
        int index) {
      return getImportConfigsFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1.ImportDataConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The desired input locations. The contents of all input locations will be
     * imported in one batch.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.ImportDataConfig.Builder> 
         getImportConfigsBuilderList() {
      return getImportConfigsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.ImportDataConfig, com.google.cloud.aiplatform.v1.ImportDataConfig.Builder, com.google.cloud.aiplatform.v1.ImportDataConfigOrBuilder> 
        getImportConfigsFieldBuilder() {
      if (importConfigsBuilder_ == null) {
        importConfigsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ImportDataConfig, com.google.cloud.aiplatform.v1.ImportDataConfig.Builder, com.google.cloud.aiplatform.v1.ImportDataConfigOrBuilder>(
                importConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        importConfigs_ = null;
      }
      return importConfigsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ImportDataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ImportDataRequest)
  private static final com.google.cloud.aiplatform.v1.ImportDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ImportDataRequest();
  }

  public static com.google.cloud.aiplatform.v1.ImportDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImportDataRequest>() {
    @java.lang.Override
    public ImportDataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImportDataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImportDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ImportDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

