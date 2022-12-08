// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/specialist_pool_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for [SpecialistPoolService.CreateSpecialistPool][google.cloud.aiplatform.v1.SpecialistPoolService.CreateSpecialistPool].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CreateSpecialistPoolRequest}
 */
public final class CreateSpecialistPoolRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CreateSpecialistPoolRequest)
    CreateSpecialistPoolRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSpecialistPoolRequest.newBuilder() to construct.
  private CreateSpecialistPoolRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSpecialistPoolRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSpecialistPoolRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest.class, com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent Project name for the new SpecialistPool.
   * The form is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent Project name for the new SpecialistPool.
   * The form is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPECIALIST_POOL_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.SpecialistPool specialistPool_;
  /**
   * <pre>
   * Required. The SpecialistPool to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the specialistPool field is set.
   */
  @java.lang.Override
  public boolean hasSpecialistPool() {
    return specialistPool_ != null;
  }
  /**
   * <pre>
   * Required. The SpecialistPool to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The specialistPool.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SpecialistPool getSpecialistPool() {
    return specialistPool_ == null ? com.google.cloud.aiplatform.v1.SpecialistPool.getDefaultInstance() : specialistPool_;
  }
  /**
   * <pre>
   * Required. The SpecialistPool to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SpecialistPoolOrBuilder getSpecialistPoolOrBuilder() {
    return getSpecialistPool();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (specialistPool_ != null) {
      output.writeMessage(2, getSpecialistPool());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (specialistPool_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSpecialistPool());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest other = (com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSpecialistPool() != other.hasSpecialistPool()) return false;
    if (hasSpecialistPool()) {
      if (!getSpecialistPool()
          .equals(other.getSpecialistPool())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSpecialistPool()) {
      hash = (37 * hash) + SPECIALIST_POOL_FIELD_NUMBER;
      hash = (53 * hash) + getSpecialistPool().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest prototype) {
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
   * Request message for [SpecialistPoolService.CreateSpecialistPool][google.cloud.aiplatform.v1.SpecialistPoolService.CreateSpecialistPool].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CreateSpecialistPoolRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CreateSpecialistPoolRequest)
      com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest.class, com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (specialistPoolBuilder_ == null) {
        specialistPool_ = null;
      } else {
        specialistPool_ = null;
        specialistPoolBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest build() {
      com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest buildPartial() {
      com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest result = new com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest(this);
      result.parent_ = parent_;
      if (specialistPoolBuilder_ == null) {
        result.specialistPool_ = specialistPool_;
      } else {
        result.specialistPool_ = specialistPoolBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest other) {
      if (other == com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSpecialistPool()) {
        mergeSpecialistPool(other.getSpecialistPool());
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
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSpecialistPoolFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent Project name for the new SpecialistPool.
     * The form is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent Project name for the new SpecialistPool.
     * The form is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent Project name for the new SpecialistPool.
     * The form is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent Project name for the new SpecialistPool.
     * The form is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent Project name for the new SpecialistPool.
     * The form is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.SpecialistPool specialistPool_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.SpecialistPool, com.google.cloud.aiplatform.v1.SpecialistPool.Builder, com.google.cloud.aiplatform.v1.SpecialistPoolOrBuilder> specialistPoolBuilder_;
    /**
     * <pre>
     * Required. The SpecialistPool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the specialistPool field is set.
     */
    public boolean hasSpecialistPool() {
      return specialistPoolBuilder_ != null || specialistPool_ != null;
    }
    /**
     * <pre>
     * Required. The SpecialistPool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The specialistPool.
     */
    public com.google.cloud.aiplatform.v1.SpecialistPool getSpecialistPool() {
      if (specialistPoolBuilder_ == null) {
        return specialistPool_ == null ? com.google.cloud.aiplatform.v1.SpecialistPool.getDefaultInstance() : specialistPool_;
      } else {
        return specialistPoolBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The SpecialistPool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSpecialistPool(com.google.cloud.aiplatform.v1.SpecialistPool value) {
      if (specialistPoolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        specialistPool_ = value;
        onChanged();
      } else {
        specialistPoolBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The SpecialistPool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSpecialistPool(
        com.google.cloud.aiplatform.v1.SpecialistPool.Builder builderForValue) {
      if (specialistPoolBuilder_ == null) {
        specialistPool_ = builderForValue.build();
        onChanged();
      } else {
        specialistPoolBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The SpecialistPool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSpecialistPool(com.google.cloud.aiplatform.v1.SpecialistPool value) {
      if (specialistPoolBuilder_ == null) {
        if (specialistPool_ != null) {
          specialistPool_ =
            com.google.cloud.aiplatform.v1.SpecialistPool.newBuilder(specialistPool_).mergeFrom(value).buildPartial();
        } else {
          specialistPool_ = value;
        }
        onChanged();
      } else {
        specialistPoolBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The SpecialistPool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSpecialistPool() {
      if (specialistPoolBuilder_ == null) {
        specialistPool_ = null;
        onChanged();
      } else {
        specialistPool_ = null;
        specialistPoolBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The SpecialistPool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.SpecialistPool.Builder getSpecialistPoolBuilder() {
      
      onChanged();
      return getSpecialistPoolFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The SpecialistPool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.SpecialistPoolOrBuilder getSpecialistPoolOrBuilder() {
      if (specialistPoolBuilder_ != null) {
        return specialistPoolBuilder_.getMessageOrBuilder();
      } else {
        return specialistPool_ == null ?
            com.google.cloud.aiplatform.v1.SpecialistPool.getDefaultInstance() : specialistPool_;
      }
    }
    /**
     * <pre>
     * Required. The SpecialistPool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SpecialistPool specialist_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.SpecialistPool, com.google.cloud.aiplatform.v1.SpecialistPool.Builder, com.google.cloud.aiplatform.v1.SpecialistPoolOrBuilder> 
        getSpecialistPoolFieldBuilder() {
      if (specialistPoolBuilder_ == null) {
        specialistPoolBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.SpecialistPool, com.google.cloud.aiplatform.v1.SpecialistPool.Builder, com.google.cloud.aiplatform.v1.SpecialistPoolOrBuilder>(
                getSpecialistPool(),
                getParentForChildren(),
                isClean());
        specialistPool_ = null;
      }
      return specialistPoolBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CreateSpecialistPoolRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CreateSpecialistPoolRequest)
  private static final com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest();
  }

  public static com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSpecialistPoolRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSpecialistPoolRequest>() {
    @java.lang.Override
    public CreateSpecialistPoolRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSpecialistPoolRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSpecialistPoolRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CreateSpecialistPoolRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

