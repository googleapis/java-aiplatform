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
// source: google/cloud/aiplatform/v1beta1/model_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [ModelService.UpdateModel][google.cloud.aiplatform.v1beta1.ModelService.UpdateModel].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateModelRequest}
 */
public final class UpdateModelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UpdateModelRequest)
    UpdateModelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateModelRequest.newBuilder() to construct.
  private UpdateModelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateModelRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateModelRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateModelRequest(
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
          case 10:
            {
              com.google.cloud.aiplatform.v1beta1.Model.Builder subBuilder = null;
              if (model_ != null) {
                subBuilder = model_.toBuilder();
              }
              model_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.Model.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(model_);
                model_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UpdateModelRequest.class,
            com.google.cloud.aiplatform.v1beta1.UpdateModelRequest.Builder.class);
  }

  public static final int MODEL_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.Model model_;
  /**
   *
   *
   * <pre>
   * Required. The Model which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the model field is set.
   */
  @java.lang.Override
  public boolean hasModel() {
    return model_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Model which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The model.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Model getModel() {
    return model_ == null ? com.google.cloud.aiplatform.v1beta1.Model.getDefaultInstance() : model_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Model which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ModelOrBuilder getModelOrBuilder() {
    return getModel();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (model_ != null) {
      output.writeMessage(1, getModel());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (model_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getModel());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UpdateModelRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UpdateModelRequest other =
        (com.google.cloud.aiplatform.v1beta1.UpdateModelRequest) obj;

    if (hasModel() != other.hasModel()) return false;
    if (hasModel()) {
      if (!getModel().equals(other.getModel())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.UpdateModelRequest prototype) {
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
   * Request message for [ModelService.UpdateModel][google.cloud.aiplatform.v1beta1.ModelService.UpdateModel].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateModelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UpdateModelRequest)
      com.google.cloud.aiplatform.v1beta1.UpdateModelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UpdateModelRequest.class,
              com.google.cloud.aiplatform.v1beta1.UpdateModelRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UpdateModelRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (modelBuilder_ == null) {
        model_ = null;
      } else {
        model_ = null;
        modelBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpdateModelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateModelRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UpdateModelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateModelRequest build() {
      com.google.cloud.aiplatform.v1beta1.UpdateModelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateModelRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UpdateModelRequest result =
          new com.google.cloud.aiplatform.v1beta1.UpdateModelRequest(this);
      if (modelBuilder_ == null) {
        result.model_ = model_;
      } else {
        result.model_ = modelBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UpdateModelRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UpdateModelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.UpdateModelRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.UpdateModelRequest.getDefaultInstance())
        return this;
      if (other.hasModel()) {
        mergeModel(other.getModel());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.aiplatform.v1beta1.UpdateModelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.UpdateModelRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.Model model_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Model,
            com.google.cloud.aiplatform.v1beta1.Model.Builder,
            com.google.cloud.aiplatform.v1beta1.ModelOrBuilder>
        modelBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Model which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the model field is set.
     */
    public boolean hasModel() {
      return modelBuilder_ != null || model_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The Model which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The model.
     */
    public com.google.cloud.aiplatform.v1beta1.Model getModel() {
      if (modelBuilder_ == null) {
        return model_ == null
            ? com.google.cloud.aiplatform.v1beta1.Model.getDefaultInstance()
            : model_;
      } else {
        return modelBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Model which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setModel(com.google.cloud.aiplatform.v1beta1.Model value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        model_ = value;
        onChanged();
      } else {
        modelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Model which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setModel(com.google.cloud.aiplatform.v1beta1.Model.Builder builderForValue) {
      if (modelBuilder_ == null) {
        model_ = builderForValue.build();
        onChanged();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Model which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeModel(com.google.cloud.aiplatform.v1beta1.Model value) {
      if (modelBuilder_ == null) {
        if (model_ != null) {
          model_ =
              com.google.cloud.aiplatform.v1beta1.Model.newBuilder(model_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          model_ = value;
        }
        onChanged();
      } else {
        modelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Model which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        model_ = null;
        onChanged();
      } else {
        model_ = null;
        modelBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Model which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.Model.Builder getModelBuilder() {

      onChanged();
      return getModelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Model which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ModelOrBuilder getModelOrBuilder() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        return model_ == null
            ? com.google.cloud.aiplatform.v1beta1.Model.getDefaultInstance()
            : model_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Model which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Model,
            com.google.cloud.aiplatform.v1beta1.Model.Builder,
            com.google.cloud.aiplatform.v1beta1.ModelOrBuilder>
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Model,
                com.google.cloud.aiplatform.v1beta1.Model.Builder,
                com.google.cloud.aiplatform.v1beta1.ModelOrBuilder>(
                getModel(), getParentForChildren(), isClean());
        model_ = null;
      }
      return modelBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UpdateModelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UpdateModelRequest)
  private static final com.google.cloud.aiplatform.v1beta1.UpdateModelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UpdateModelRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateModelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateModelRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateModelRequest>() {
        @java.lang.Override
        public UpdateModelRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateModelRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateModelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateModelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UpdateModelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
