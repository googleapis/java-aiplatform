// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for [MetadataService.UpdateArtifact][google.cloud.aiplatform.v1beta1.MetadataService.UpdateArtifact].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateArtifactRequest}
 */
public final class UpdateArtifactRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UpdateArtifactRequest)
    UpdateArtifactRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateArtifactRequest.newBuilder() to construct.
  private UpdateArtifactRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateArtifactRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateArtifactRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateArtifactRequest(
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
            com.google.cloud.aiplatform.v1beta1.Artifact.Builder subBuilder = null;
            if (artifact_ != null) {
              subBuilder = artifact_.toBuilder();
            }
            artifact_ = input.readMessage(com.google.cloud.aiplatform.v1beta1.Artifact.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(artifact_);
              artifact_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            allowMissing_ = input.readBool();
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
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateArtifactRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateArtifactRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest.class, com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest.Builder.class);
  }

  public static final int ARTIFACT_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.Artifact artifact_;
  /**
   * <pre>
   * Required. The Artifact containing updates.
   * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
   * be updated.
   * Format:
   * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the artifact field is set.
   */
  @java.lang.Override
  public boolean hasArtifact() {
    return artifact_ != null;
  }
  /**
   * <pre>
   * Required. The Artifact containing updates.
   * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
   * be updated.
   * Format:
   * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The artifact.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Artifact getArtifact() {
    return artifact_ == null ? com.google.cloud.aiplatform.v1beta1.Artifact.getDefaultInstance() : artifact_;
  }
  /**
   * <pre>
   * Required. The Artifact containing updates.
   * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
   * be updated.
   * Format:
   * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ArtifactOrBuilder getArtifactOrBuilder() {
    return getArtifact();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. A FieldMask indicating which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. A FieldMask indicating which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. A FieldMask indicating which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int ALLOW_MISSING_FIELD_NUMBER = 3;
  private boolean allowMissing_;
  /**
   * <pre>
   * If set to true, and the [Artifact][google.cloud.aiplatform.v1beta1.Artifact] is not found, a new [Artifact][google.cloud.aiplatform.v1beta1.Artifact] will
   * be created. In this situation, `update_mask` is ignored.
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
    if (artifact_ != null) {
      output.writeMessage(1, getArtifact());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      output.writeBool(3, allowMissing_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (artifact_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getArtifact());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowMissing_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest other = (com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest) obj;

    if (hasArtifact() != other.hasArtifact()) return false;
    if (hasArtifact()) {
      if (!getArtifact()
          .equals(other.getArtifact())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (getAllowMissing()
        != other.getAllowMissing()) return false;
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
    if (hasArtifact()) {
      hash = (37 * hash) + ARTIFACT_FIELD_NUMBER;
      hash = (53 * hash) + getArtifact().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + ALLOW_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowMissing());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest prototype) {
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
   * Request message for [MetadataService.UpdateArtifact][google.cloud.aiplatform.v1beta1.MetadataService.UpdateArtifact].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateArtifactRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UpdateArtifactRequest)
      com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateArtifactRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateArtifactRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest.class, com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest.newBuilder()
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
      if (artifactBuilder_ == null) {
        artifact_ = null;
      } else {
        artifact_ = null;
        artifactBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      allowMissing_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateArtifactRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest build() {
      com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest result = new com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest(this);
      if (artifactBuilder_ == null) {
        result.artifact_ = artifact_;
      } else {
        result.artifact_ = artifactBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      result.allowMissing_ = allowMissing_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest.getDefaultInstance()) return this;
      if (other.hasArtifact()) {
        mergeArtifact(other.getArtifact());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getAllowMissing() != false) {
        setAllowMissing(other.getAllowMissing());
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
      com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.Artifact artifact_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.Artifact, com.google.cloud.aiplatform.v1beta1.Artifact.Builder, com.google.cloud.aiplatform.v1beta1.ArtifactOrBuilder> artifactBuilder_;
    /**
     * <pre>
     * Required. The Artifact containing updates.
     * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
     * be updated.
     * Format:
     * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the artifact field is set.
     */
    public boolean hasArtifact() {
      return artifactBuilder_ != null || artifact_ != null;
    }
    /**
     * <pre>
     * Required. The Artifact containing updates.
     * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
     * be updated.
     * Format:
     * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The artifact.
     */
    public com.google.cloud.aiplatform.v1beta1.Artifact getArtifact() {
      if (artifactBuilder_ == null) {
        return artifact_ == null ? com.google.cloud.aiplatform.v1beta1.Artifact.getDefaultInstance() : artifact_;
      } else {
        return artifactBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Artifact containing updates.
     * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
     * be updated.
     * Format:
     * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setArtifact(com.google.cloud.aiplatform.v1beta1.Artifact value) {
      if (artifactBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        artifact_ = value;
        onChanged();
      } else {
        artifactBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Artifact containing updates.
     * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
     * be updated.
     * Format:
     * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setArtifact(
        com.google.cloud.aiplatform.v1beta1.Artifact.Builder builderForValue) {
      if (artifactBuilder_ == null) {
        artifact_ = builderForValue.build();
        onChanged();
      } else {
        artifactBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Artifact containing updates.
     * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
     * be updated.
     * Format:
     * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeArtifact(com.google.cloud.aiplatform.v1beta1.Artifact value) {
      if (artifactBuilder_ == null) {
        if (artifact_ != null) {
          artifact_ =
            com.google.cloud.aiplatform.v1beta1.Artifact.newBuilder(artifact_).mergeFrom(value).buildPartial();
        } else {
          artifact_ = value;
        }
        onChanged();
      } else {
        artifactBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Artifact containing updates.
     * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
     * be updated.
     * Format:
     * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearArtifact() {
      if (artifactBuilder_ == null) {
        artifact_ = null;
        onChanged();
      } else {
        artifact_ = null;
        artifactBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Artifact containing updates.
     * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
     * be updated.
     * Format:
     * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Artifact.Builder getArtifactBuilder() {
      
      onChanged();
      return getArtifactFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Artifact containing updates.
     * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
     * be updated.
     * Format:
     * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ArtifactOrBuilder getArtifactOrBuilder() {
      if (artifactBuilder_ != null) {
        return artifactBuilder_.getMessageOrBuilder();
      } else {
        return artifact_ == null ?
            com.google.cloud.aiplatform.v1beta1.Artifact.getDefaultInstance() : artifact_;
      }
    }
    /**
     * <pre>
     * Required. The Artifact containing updates.
     * The Artifact's [Artifact.name][google.cloud.aiplatform.v1beta1.Artifact.name] field is used to identify the Artifact to
     * be updated.
     * Format:
     * projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.Artifact, com.google.cloud.aiplatform.v1beta1.Artifact.Builder, com.google.cloud.aiplatform.v1beta1.ArtifactOrBuilder> 
        getArtifactFieldBuilder() {
      if (artifactBuilder_ == null) {
        artifactBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Artifact, com.google.cloud.aiplatform.v1beta1.Artifact.Builder, com.google.cloud.aiplatform.v1beta1.ArtifactOrBuilder>(
                getArtifact(),
                getParentForChildren(),
                isClean());
        artifact_ = null;
      }
      return artifactBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Required. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * If set to true, and the [Artifact][google.cloud.aiplatform.v1beta1.Artifact] is not found, a new [Artifact][google.cloud.aiplatform.v1beta1.Artifact] will
     * be created. In this situation, `update_mask` is ignored.
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
     * If set to true, and the [Artifact][google.cloud.aiplatform.v1beta1.Artifact] is not found, a new [Artifact][google.cloud.aiplatform.v1beta1.Artifact] will
     * be created. In this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @param value The allowMissing to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMissing(boolean value) {
      
      allowMissing_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, and the [Artifact][google.cloud.aiplatform.v1beta1.Artifact] is not found, a new [Artifact][google.cloud.aiplatform.v1beta1.Artifact] will
     * be created. In this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowMissing() {
      
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UpdateArtifactRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UpdateArtifactRequest)
  private static final com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateArtifactRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateArtifactRequest>() {
    @java.lang.Override
    public UpdateArtifactRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateArtifactRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateArtifactRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateArtifactRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

