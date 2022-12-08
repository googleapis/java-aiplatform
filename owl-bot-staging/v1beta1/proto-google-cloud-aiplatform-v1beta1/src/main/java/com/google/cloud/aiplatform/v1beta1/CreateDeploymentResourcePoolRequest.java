// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for CreateDeploymentResourcePool method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest}
 */
public final class CreateDeploymentResourcePoolRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest)
    CreateDeploymentResourcePoolRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDeploymentResourcePoolRequest.newBuilder() to construct.
  private CreateDeploymentResourcePoolRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDeploymentResourcePoolRequest() {
    parent_ = "";
    deploymentResourcePoolId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDeploymentResourcePoolRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest.class, com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent location resource where this DeploymentResourcePool will be
   * created. Format: `projects/{project}/locations/{location}`
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
   * Required. The parent location resource where this DeploymentResourcePool will be
   * created. Format: `projects/{project}/locations/{location}`
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

  public static final int DEPLOYMENT_RESOURCE_POOL_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deploymentResourcePool_;
  /**
   * <pre>
   * Required. The DeploymentResourcePool to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the deploymentResourcePool field is set.
   */
  @java.lang.Override
  public boolean hasDeploymentResourcePool() {
    return deploymentResourcePool_ != null;
  }
  /**
   * <pre>
   * Required. The DeploymentResourcePool to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The deploymentResourcePool.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool getDeploymentResourcePool() {
    return deploymentResourcePool_ == null ? com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.getDefaultInstance() : deploymentResourcePool_;
  }
  /**
   * <pre>
   * Required. The DeploymentResourcePool to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolOrBuilder getDeploymentResourcePoolOrBuilder() {
    return getDeploymentResourcePool();
  }

  public static final int DEPLOYMENT_RESOURCE_POOL_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object deploymentResourcePoolId_;
  /**
   * <pre>
   * Required. The ID to use for the DeploymentResourcePool, which
   * will become the final component of the DeploymentResourcePool's resource
   * name.
   * The maximum length is 63 characters, and valid characters
   * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
   * </pre>
   *
   * <code>string deployment_resource_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The deploymentResourcePoolId.
   */
  @java.lang.Override
  public java.lang.String getDeploymentResourcePoolId() {
    java.lang.Object ref = deploymentResourcePoolId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deploymentResourcePoolId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the DeploymentResourcePool, which
   * will become the final component of the DeploymentResourcePool's resource
   * name.
   * The maximum length is 63 characters, and valid characters
   * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
   * </pre>
   *
   * <code>string deployment_resource_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for deploymentResourcePoolId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeploymentResourcePoolIdBytes() {
    java.lang.Object ref = deploymentResourcePoolId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deploymentResourcePoolId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (deploymentResourcePool_ != null) {
      output.writeMessage(2, getDeploymentResourcePool());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deploymentResourcePoolId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deploymentResourcePoolId_);
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
    if (deploymentResourcePool_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDeploymentResourcePool());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deploymentResourcePoolId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deploymentResourcePoolId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest other = (com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasDeploymentResourcePool() != other.hasDeploymentResourcePool()) return false;
    if (hasDeploymentResourcePool()) {
      if (!getDeploymentResourcePool()
          .equals(other.getDeploymentResourcePool())) return false;
    }
    if (!getDeploymentResourcePoolId()
        .equals(other.getDeploymentResourcePoolId())) return false;
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
    if (hasDeploymentResourcePool()) {
      hash = (37 * hash) + DEPLOYMENT_RESOURCE_POOL_FIELD_NUMBER;
      hash = (53 * hash) + getDeploymentResourcePool().hashCode();
    }
    hash = (37 * hash) + DEPLOYMENT_RESOURCE_POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeploymentResourcePoolId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest prototype) {
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
   * Request message for CreateDeploymentResourcePool method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest)
      com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest.class, com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest.newBuilder()
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

      if (deploymentResourcePoolBuilder_ == null) {
        deploymentResourcePool_ = null;
      } else {
        deploymentResourcePool_ = null;
        deploymentResourcePoolBuilder_ = null;
      }
      deploymentResourcePoolId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest result = new com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest(this);
      result.parent_ = parent_;
      if (deploymentResourcePoolBuilder_ == null) {
        result.deploymentResourcePool_ = deploymentResourcePool_;
      } else {
        result.deploymentResourcePool_ = deploymentResourcePoolBuilder_.build();
      }
      result.deploymentResourcePoolId_ = deploymentResourcePoolId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasDeploymentResourcePool()) {
        mergeDeploymentResourcePool(other.getDeploymentResourcePool());
      }
      if (!other.getDeploymentResourcePoolId().isEmpty()) {
        deploymentResourcePoolId_ = other.deploymentResourcePoolId_;
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
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDeploymentResourcePoolFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              deploymentResourcePoolId_ = input.readStringRequireUtf8();

              break;
            } // case 26
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
     * Required. The parent location resource where this DeploymentResourcePool will be
     * created. Format: `projects/{project}/locations/{location}`
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
     * Required. The parent location resource where this DeploymentResourcePool will be
     * created. Format: `projects/{project}/locations/{location}`
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
     * Required. The parent location resource where this DeploymentResourcePool will be
     * created. Format: `projects/{project}/locations/{location}`
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
     * Required. The parent location resource where this DeploymentResourcePool will be
     * created. Format: `projects/{project}/locations/{location}`
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
     * Required. The parent location resource where this DeploymentResourcePool will be
     * created. Format: `projects/{project}/locations/{location}`
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

    private com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deploymentResourcePool_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool, com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.Builder, com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolOrBuilder> deploymentResourcePoolBuilder_;
    /**
     * <pre>
     * Required. The DeploymentResourcePool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the deploymentResourcePool field is set.
     */
    public boolean hasDeploymentResourcePool() {
      return deploymentResourcePoolBuilder_ != null || deploymentResourcePool_ != null;
    }
    /**
     * <pre>
     * Required. The DeploymentResourcePool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The deploymentResourcePool.
     */
    public com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool getDeploymentResourcePool() {
      if (deploymentResourcePoolBuilder_ == null) {
        return deploymentResourcePool_ == null ? com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.getDefaultInstance() : deploymentResourcePool_;
      } else {
        return deploymentResourcePoolBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The DeploymentResourcePool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDeploymentResourcePool(com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool value) {
      if (deploymentResourcePoolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deploymentResourcePool_ = value;
        onChanged();
      } else {
        deploymentResourcePoolBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The DeploymentResourcePool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDeploymentResourcePool(
        com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.Builder builderForValue) {
      if (deploymentResourcePoolBuilder_ == null) {
        deploymentResourcePool_ = builderForValue.build();
        onChanged();
      } else {
        deploymentResourcePoolBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The DeploymentResourcePool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeDeploymentResourcePool(com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool value) {
      if (deploymentResourcePoolBuilder_ == null) {
        if (deploymentResourcePool_ != null) {
          deploymentResourcePool_ =
            com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.newBuilder(deploymentResourcePool_).mergeFrom(value).buildPartial();
        } else {
          deploymentResourcePool_ = value;
        }
        onChanged();
      } else {
        deploymentResourcePoolBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The DeploymentResourcePool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearDeploymentResourcePool() {
      if (deploymentResourcePoolBuilder_ == null) {
        deploymentResourcePool_ = null;
        onChanged();
      } else {
        deploymentResourcePool_ = null;
        deploymentResourcePoolBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The DeploymentResourcePool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.Builder getDeploymentResourcePoolBuilder() {
      
      onChanged();
      return getDeploymentResourcePoolFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The DeploymentResourcePool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolOrBuilder getDeploymentResourcePoolOrBuilder() {
      if (deploymentResourcePoolBuilder_ != null) {
        return deploymentResourcePoolBuilder_.getMessageOrBuilder();
      } else {
        return deploymentResourcePool_ == null ?
            com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.getDefaultInstance() : deploymentResourcePool_;
      }
    }
    /**
     * <pre>
     * Required. The DeploymentResourcePool to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool, com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.Builder, com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolOrBuilder> 
        getDeploymentResourcePoolFieldBuilder() {
      if (deploymentResourcePoolBuilder_ == null) {
        deploymentResourcePoolBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool, com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool.Builder, com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolOrBuilder>(
                getDeploymentResourcePool(),
                getParentForChildren(),
                isClean());
        deploymentResourcePool_ = null;
      }
      return deploymentResourcePoolBuilder_;
    }

    private java.lang.Object deploymentResourcePoolId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the DeploymentResourcePool, which
     * will become the final component of the DeploymentResourcePool's resource
     * name.
     * The maximum length is 63 characters, and valid characters
     * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
     * </pre>
     *
     * <code>string deployment_resource_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The deploymentResourcePoolId.
     */
    public java.lang.String getDeploymentResourcePoolId() {
      java.lang.Object ref = deploymentResourcePoolId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deploymentResourcePoolId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the DeploymentResourcePool, which
     * will become the final component of the DeploymentResourcePool's resource
     * name.
     * The maximum length is 63 characters, and valid characters
     * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
     * </pre>
     *
     * <code>string deployment_resource_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for deploymentResourcePoolId.
     */
    public com.google.protobuf.ByteString
        getDeploymentResourcePoolIdBytes() {
      java.lang.Object ref = deploymentResourcePoolId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deploymentResourcePoolId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the DeploymentResourcePool, which
     * will become the final component of the DeploymentResourcePool's resource
     * name.
     * The maximum length is 63 characters, and valid characters
     * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
     * </pre>
     *
     * <code>string deployment_resource_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The deploymentResourcePoolId to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentResourcePoolId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deploymentResourcePoolId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the DeploymentResourcePool, which
     * will become the final component of the DeploymentResourcePool's resource
     * name.
     * The maximum length is 63 characters, and valid characters
     * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
     * </pre>
     *
     * <code>string deployment_resource_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeploymentResourcePoolId() {
      
      deploymentResourcePoolId_ = getDefaultInstance().getDeploymentResourcePoolId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the DeploymentResourcePool, which
     * will become the final component of the DeploymentResourcePool's resource
     * name.
     * The maximum length is 63 characters, and valid characters
     * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
     * </pre>
     *
     * <code>string deployment_resource_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for deploymentResourcePoolId to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentResourcePoolIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deploymentResourcePoolId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDeploymentResourcePoolRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateDeploymentResourcePoolRequest>() {
    @java.lang.Override
    public CreateDeploymentResourcePoolRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDeploymentResourcePoolRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDeploymentResourcePoolRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

