/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [FeaturestoreService.CreateFeature][google.cloud.aiplatform.v1beta1.FeaturestoreService.CreateFeature].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateFeatureRequest}
 */
public final class CreateFeatureRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateFeatureRequest)
    CreateFeatureRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateFeatureRequest.newBuilder() to construct.
  private CreateFeatureRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateFeatureRequest() {
    parent_ = "";
    featureId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateFeatureRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest.class,
            com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType to create a Feature.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType to create a Feature.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEATURE_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.Feature feature_;
  /**
   *
   *
   * <pre>
   * Required. The Feature to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the feature field is set.
   */
  @java.lang.Override
  public boolean hasFeature() {
    return feature_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Feature to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The feature.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Feature getFeature() {
    return feature_ == null
        ? com.google.cloud.aiplatform.v1beta1.Feature.getDefaultInstance()
        : feature_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Feature to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder getFeatureOrBuilder() {
    return feature_ == null
        ? com.google.cloud.aiplatform.v1beta1.Feature.getDefaultInstance()
        : feature_;
  }

  public static final int FEATURE_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object featureId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the Feature, which will become the final
   * component of the Feature's resource name.
   * This value may be up to 128 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   * The value must be unique within an EntityType.
   * </pre>
   *
   * <code>string feature_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The featureId.
   */
  @java.lang.Override
  public java.lang.String getFeatureId() {
    java.lang.Object ref = featureId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      featureId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the Feature, which will become the final
   * component of the Feature's resource name.
   * This value may be up to 128 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   * The value must be unique within an EntityType.
   * </pre>
   *
   * <code>string feature_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for featureId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFeatureIdBytes() {
    java.lang.Object ref = featureId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      featureId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (feature_ != null) {
      output.writeMessage(2, getFeature());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, featureId_);
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
    if (feature_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getFeature());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, featureId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest other =
        (com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasFeature() != other.hasFeature()) return false;
    if (hasFeature()) {
      if (!getFeature().equals(other.getFeature())) return false;
    }
    if (!getFeatureId().equals(other.getFeatureId())) return false;
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
    if (hasFeature()) {
      hash = (37 * hash) + FEATURE_FIELD_NUMBER;
      hash = (53 * hash) + getFeature().hashCode();
    }
    hash = (37 * hash) + FEATURE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for
   * [FeaturestoreService.CreateFeature][google.cloud.aiplatform.v1beta1.FeaturestoreService.CreateFeature].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateFeatureRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateFeatureRequest)
      com.google.cloud.aiplatform.v1beta1.CreateFeatureRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest.class,
              com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      feature_ = null;
      if (featureBuilder_ != null) {
        featureBuilder_.dispose();
        featureBuilder_ = null;
      }
      featureId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest result =
          new com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.feature_ = featureBuilder_ == null ? feature_ : featureBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.featureId_ = featureId_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFeature()) {
        mergeFeature(other.getFeature());
      }
      if (!other.getFeatureId().isEmpty()) {
        featureId_ = other.featureId_;
        bitField0_ |= 0x00000004;
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getFeatureFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                featureId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType to create a Feature.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType to create a Feature.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType to create a Feature.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType to create a Feature.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType to create a Feature.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.Feature feature_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Feature,
            com.google.cloud.aiplatform.v1beta1.Feature.Builder,
            com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
        featureBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Feature to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the feature field is set.
     */
    public boolean hasFeature() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The Feature to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The feature.
     */
    public com.google.cloud.aiplatform.v1beta1.Feature getFeature() {
      if (featureBuilder_ == null) {
        return feature_ == null
            ? com.google.cloud.aiplatform.v1beta1.Feature.getDefaultInstance()
            : feature_;
      } else {
        return featureBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Feature to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFeature(com.google.cloud.aiplatform.v1beta1.Feature value) {
      if (featureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        feature_ = value;
      } else {
        featureBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Feature to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFeature(com.google.cloud.aiplatform.v1beta1.Feature.Builder builderForValue) {
      if (featureBuilder_ == null) {
        feature_ = builderForValue.build();
      } else {
        featureBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Feature to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeFeature(com.google.cloud.aiplatform.v1beta1.Feature value) {
      if (featureBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && feature_ != null
            && feature_ != com.google.cloud.aiplatform.v1beta1.Feature.getDefaultInstance()) {
          getFeatureBuilder().mergeFrom(value);
        } else {
          feature_ = value;
        }
      } else {
        featureBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Feature to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearFeature() {
      bitField0_ = (bitField0_ & ~0x00000002);
      feature_ = null;
      if (featureBuilder_ != null) {
        featureBuilder_.dispose();
        featureBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Feature to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.Feature.Builder getFeatureBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFeatureFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Feature to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder getFeatureOrBuilder() {
      if (featureBuilder_ != null) {
        return featureBuilder_.getMessageOrBuilder();
      } else {
        return feature_ == null
            ? com.google.cloud.aiplatform.v1beta1.Feature.getDefaultInstance()
            : feature_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Feature to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Feature feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Feature,
            com.google.cloud.aiplatform.v1beta1.Feature.Builder,
            com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
        getFeatureFieldBuilder() {
      if (featureBuilder_ == null) {
        featureBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Feature,
                com.google.cloud.aiplatform.v1beta1.Feature.Builder,
                com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>(
                getFeature(), getParentForChildren(), isClean());
        feature_ = null;
      }
      return featureBuilder_;
    }

    private java.lang.Object featureId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the Feature, which will become the final
     * component of the Feature's resource name.
     * This value may be up to 128 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     * The value must be unique within an EntityType.
     * </pre>
     *
     * <code>string feature_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The featureId.
     */
    public java.lang.String getFeatureId() {
      java.lang.Object ref = featureId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        featureId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the Feature, which will become the final
     * component of the Feature's resource name.
     * This value may be up to 128 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     * The value must be unique within an EntityType.
     * </pre>
     *
     * <code>string feature_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for featureId.
     */
    public com.google.protobuf.ByteString getFeatureIdBytes() {
      java.lang.Object ref = featureId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        featureId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the Feature, which will become the final
     * component of the Feature's resource name.
     * This value may be up to 128 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     * The value must be unique within an EntityType.
     * </pre>
     *
     * <code>string feature_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The featureId to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      featureId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the Feature, which will become the final
     * component of the Feature's resource name.
     * This value may be up to 128 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     * The value must be unique within an EntityType.
     * </pre>
     *
     * <code>string feature_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFeatureId() {
      featureId_ = getDefaultInstance().getFeatureId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the Feature, which will become the final
     * component of the Feature's resource name.
     * This value may be up to 128 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     * The value must be unique within an EntityType.
     * </pre>
     *
     * <code>string feature_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for featureId to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      featureId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateFeatureRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateFeatureRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFeatureRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateFeatureRequest>() {
        @java.lang.Override
        public CreateFeatureRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFeatureRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFeatureRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
