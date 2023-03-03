// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for
 * [MetadataService.UpdateContext][google.cloud.aiplatform.v1.MetadataService.UpdateContext].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.UpdateContextRequest}
 */
public final class UpdateContextRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.UpdateContextRequest)
    UpdateContextRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateContextRequest.newBuilder() to construct.
  private UpdateContextRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateContextRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateContextRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateContextRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateContextRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.UpdateContextRequest.class, com.google.cloud.aiplatform.v1.UpdateContextRequest.Builder.class);
  }

  public static final int CONTEXT_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.Context context_;
  /**
   * <pre>
   * Required. The Context containing updates.
   * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
   * is used to identify the Context to be updated. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the context field is set.
   */
  @java.lang.Override
  public boolean hasContext() {
    return context_ != null;
  }
  /**
   * <pre>
   * Required. The Context containing updates.
   * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
   * is used to identify the Context to be updated. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The context.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Context getContext() {
    return context_ == null ? com.google.cloud.aiplatform.v1.Context.getDefaultInstance() : context_;
  }
  /**
   * <pre>
   * Required. The Context containing updates.
   * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
   * is used to identify the Context to be updated. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ContextOrBuilder getContextOrBuilder() {
    return context_ == null ? com.google.cloud.aiplatform.v1.Context.getDefaultInstance() : context_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * Functionality of this field is not yet supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * Functionality of this field is not yet supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * Functionality of this field is not yet supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int ALLOW_MISSING_FIELD_NUMBER = 3;
  private boolean allowMissing_ = false;
  /**
   * <pre>
   * If set to true, and the [Context][google.cloud.aiplatform.v1.Context] is
   * not found, a new [Context][google.cloud.aiplatform.v1.Context] is created.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   * @return The allowMissing.
   */
  @java.lang.Override
  public boolean getAllowMissing() {
    return allowMissing_;
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
    if (context_ != null) {
      output.writeMessage(1, getContext());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      output.writeBool(3, allowMissing_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (context_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContext());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowMissing_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.UpdateContextRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.UpdateContextRequest other = (com.google.cloud.aiplatform.v1.UpdateContextRequest) obj;

    if (hasContext() != other.hasContext()) return false;
    if (hasContext()) {
      if (!getContext()
          .equals(other.getContext())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (getAllowMissing()
        != other.getAllowMissing()) return false;
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
    if (hasContext()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getContext().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + ALLOW_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowMissing());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.UpdateContextRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.UpdateContextRequest prototype) {
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
   * Request message for
   * [MetadataService.UpdateContext][google.cloud.aiplatform.v1.MetadataService.UpdateContext].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.UpdateContextRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.UpdateContextRequest)
      com.google.cloud.aiplatform.v1.UpdateContextRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateContextRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateContextRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.UpdateContextRequest.class, com.google.cloud.aiplatform.v1.UpdateContextRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.UpdateContextRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      context_ = null;
      if (contextBuilder_ != null) {
        contextBuilder_.dispose();
        contextBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      allowMissing_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_UpdateContextRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateContextRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.UpdateContextRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateContextRequest build() {
      com.google.cloud.aiplatform.v1.UpdateContextRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateContextRequest buildPartial() {
      com.google.cloud.aiplatform.v1.UpdateContextRequest result = new com.google.cloud.aiplatform.v1.UpdateContextRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.UpdateContextRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.context_ = contextBuilder_ == null
            ? context_
            : contextBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.allowMissing_ = allowMissing_;
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1.UpdateContextRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.UpdateContextRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.UpdateContextRequest other) {
      if (other == com.google.cloud.aiplatform.v1.UpdateContextRequest.getDefaultInstance()) return this;
      if (other.hasContext()) {
        mergeContext(other.getContext());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getAllowMissing() != false) {
        setAllowMissing(other.getAllowMissing());
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
                  getContextFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              allowMissing_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.cloud.aiplatform.v1.Context context_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.Context, com.google.cloud.aiplatform.v1.Context.Builder, com.google.cloud.aiplatform.v1.ContextOrBuilder> contextBuilder_;
    /**
     * <pre>
     * Required. The Context containing updates.
     * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
     * is used to identify the Context to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the context field is set.
     */
    public boolean hasContext() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The Context containing updates.
     * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
     * is used to identify the Context to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The context.
     */
    public com.google.cloud.aiplatform.v1.Context getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? com.google.cloud.aiplatform.v1.Context.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Context containing updates.
     * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
     * is used to identify the Context to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setContext(com.google.cloud.aiplatform.v1.Context value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
      } else {
        contextBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Context containing updates.
     * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
     * is used to identify the Context to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setContext(
        com.google.cloud.aiplatform.v1.Context.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Context containing updates.
     * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
     * is used to identify the Context to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeContext(com.google.cloud.aiplatform.v1.Context value) {
      if (contextBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          context_ != null &&
          context_ != com.google.cloud.aiplatform.v1.Context.getDefaultInstance()) {
          getContextBuilder().mergeFrom(value);
        } else {
          context_ = value;
        }
      } else {
        contextBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Context containing updates.
     * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
     * is used to identify the Context to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearContext() {
      bitField0_ = (bitField0_ & ~0x00000001);
      context_ = null;
      if (contextBuilder_ != null) {
        contextBuilder_.dispose();
        contextBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Context containing updates.
     * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
     * is used to identify the Context to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.Context.Builder getContextBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Context containing updates.
     * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
     * is used to identify the Context to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.ContextOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ?
            com.google.cloud.aiplatform.v1.Context.getDefaultInstance() : context_;
      }
    }
    /**
     * <pre>
     * Required. The Context containing updates.
     * The Context's [Context.name][google.cloud.aiplatform.v1.Context.name] field
     * is used to identify the Context to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.Context, com.google.cloud.aiplatform.v1.Context.Builder, com.google.cloud.aiplatform.v1.ContextOrBuilder> 
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Context, com.google.cloud.aiplatform.v1.Context.Builder, com.google.cloud.aiplatform.v1.ContextOrBuilder>(
                getContext(),
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      return contextBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * Functionality of this field is not yet supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * Functionality of this field is not yet supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * Functionality of this field is not yet supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * Functionality of this field is not yet supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * Functionality of this field is not yet supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * Functionality of this field is not yet supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * Functionality of this field is not yet supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * Functionality of this field is not yet supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * Functionality of this field is not yet supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean allowMissing_ ;
    /**
     * <pre>
     * If set to true, and the [Context][google.cloud.aiplatform.v1.Context] is
     * not found, a new [Context][google.cloud.aiplatform.v1.Context] is created.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @return The allowMissing.
     */
    @java.lang.Override
    public boolean getAllowMissing() {
      return allowMissing_;
    }
    /**
     * <pre>
     * If set to true, and the [Context][google.cloud.aiplatform.v1.Context] is
     * not found, a new [Context][google.cloud.aiplatform.v1.Context] is created.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @param value The allowMissing to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMissing(boolean value) {
      
      allowMissing_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, and the [Context][google.cloud.aiplatform.v1.Context] is
     * not found, a new [Context][google.cloud.aiplatform.v1.Context] is created.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowMissing() {
      bitField0_ = (bitField0_ & ~0x00000004);
      allowMissing_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.UpdateContextRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.UpdateContextRequest)
  private static final com.google.cloud.aiplatform.v1.UpdateContextRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.UpdateContextRequest();
  }

  public static com.google.cloud.aiplatform.v1.UpdateContextRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateContextRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateContextRequest>() {
    @java.lang.Override
    public UpdateContextRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateContextRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateContextRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.UpdateContextRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

