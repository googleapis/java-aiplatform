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
// source: google/cloud/aiplatform/v1beta1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [TensorboardService.UpdateTensorboardRun][google.cloud.aiplatform.v1beta1.TensorboardService.UpdateTensorboardRun].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest}
 */
public final class UpdateTensorboardRunRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest)
    UpdateTensorboardRunRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateTensorboardRunRequest.newBuilder() to construct.
  private UpdateTensorboardRunRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateTensorboardRunRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateTensorboardRunRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UpdateTensorboardRunRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UpdateTensorboardRunRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest.class,
            com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * TensorboardRun resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten if new
   * values are specified.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
   * Required. Field mask is used to specify the fields to be overwritten in the
   * TensorboardRun resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten if new
   * values are specified.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
   * Required. Field mask is used to specify the fields to be overwritten in the
   * TensorboardRun resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten if new
   * values are specified.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int TENSORBOARD_RUN_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboardRun_;
  /**
   *
   *
   * <pre>
   * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
   * be updated. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tensorboardRun field is set.
   */
  @java.lang.Override
  public boolean hasTensorboardRun() {
    return tensorboardRun_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
   * be updated. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tensorboardRun.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardRun getTensorboardRun() {
    return tensorboardRun_ == null
        ? com.google.cloud.aiplatform.v1beta1.TensorboardRun.getDefaultInstance()
        : tensorboardRun_;
  }
  /**
   *
   *
   * <pre>
   * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
   * be updated. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder getTensorboardRunOrBuilder() {
    return getTensorboardRun();
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (tensorboardRun_ != null) {
      output.writeMessage(2, getTensorboardRun());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateMask());
    }
    if (tensorboardRun_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTensorboardRun());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest other =
        (com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasTensorboardRun() != other.hasTensorboardRun()) return false;
    if (hasTensorboardRun()) {
      if (!getTensorboardRun().equals(other.getTensorboardRun())) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasTensorboardRun()) {
      hash = (37 * hash) + TENSORBOARD_RUN_FIELD_NUMBER;
      hash = (53 * hash) + getTensorboardRun().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest prototype) {
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
   * Request message for [TensorboardService.UpdateTensorboardRun][google.cloud.aiplatform.v1beta1.TensorboardService.UpdateTensorboardRun].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest)
      com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpdateTensorboardRunRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpdateTensorboardRunRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest.class,
              com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      if (tensorboardRunBuilder_ == null) {
        tensorboardRun_ = null;
      } else {
        tensorboardRun_ = null;
        tensorboardRunBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpdateTensorboardRunRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest build() {
      com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest result =
          new com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest(this);
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      if (tensorboardRunBuilder_ == null) {
        result.tensorboardRun_ = tensorboardRun_;
      } else {
        result.tensorboardRun_ = tensorboardRunBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasTensorboardRun()) {
        mergeTensorboardRun(other.getTensorboardRun());
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
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getTensorboardRunFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardRun resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardRun resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardRun resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardRun resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardRun resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardRun resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardRun resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardRun resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. Field mask is used to specify the fields to be overwritten in the
     * TensorboardRun resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten if new
     * values are specified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
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

    private com.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboardRun_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.TensorboardRun,
            com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder,
            com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder>
        tensorboardRunBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
     * be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the tensorboardRun field is set.
     */
    public boolean hasTensorboardRun() {
      return tensorboardRunBuilder_ != null || tensorboardRun_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
     * be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The tensorboardRun.
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRun getTensorboardRun() {
      if (tensorboardRunBuilder_ == null) {
        return tensorboardRun_ == null
            ? com.google.cloud.aiplatform.v1beta1.TensorboardRun.getDefaultInstance()
            : tensorboardRun_;
      } else {
        return tensorboardRunBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
     * be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTensorboardRun(com.google.cloud.aiplatform.v1beta1.TensorboardRun value) {
      if (tensorboardRunBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensorboardRun_ = value;
        onChanged();
      } else {
        tensorboardRunBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
     * be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTensorboardRun(
        com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder builderForValue) {
      if (tensorboardRunBuilder_ == null) {
        tensorboardRun_ = builderForValue.build();
        onChanged();
      } else {
        tensorboardRunBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
     * be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTensorboardRun(com.google.cloud.aiplatform.v1beta1.TensorboardRun value) {
      if (tensorboardRunBuilder_ == null) {
        if (tensorboardRun_ != null) {
          tensorboardRun_ =
              com.google.cloud.aiplatform.v1beta1.TensorboardRun.newBuilder(tensorboardRun_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          tensorboardRun_ = value;
        }
        onChanged();
      } else {
        tensorboardRunBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
     * be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTensorboardRun() {
      if (tensorboardRunBuilder_ == null) {
        tensorboardRun_ = null;
        onChanged();
      } else {
        tensorboardRun_ = null;
        tensorboardRunBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
     * be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder getTensorboardRunBuilder() {

      onChanged();
      return getTensorboardRunFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
     * be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder
        getTensorboardRunOrBuilder() {
      if (tensorboardRunBuilder_ != null) {
        return tensorboardRunBuilder_.getMessageOrBuilder();
      } else {
        return tensorboardRun_ == null
            ? com.google.cloud.aiplatform.v1beta1.TensorboardRun.getDefaultInstance()
            : tensorboardRun_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The TensorboardRun's `name` field is used to identify the TensorboardRun to
     * be updated. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.TensorboardRun,
            com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder,
            com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder>
        getTensorboardRunFieldBuilder() {
      if (tensorboardRunBuilder_ == null) {
        tensorboardRunBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.TensorboardRun,
                com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder,
                com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder>(
                getTensorboardRun(), getParentForChildren(), isClean());
        tensorboardRun_ = null;
      }
      return tensorboardRunBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest)
  private static final com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTensorboardRunRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTensorboardRunRequest>() {
        @java.lang.Override
        public UpdateTensorboardRunRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTensorboardRunRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTensorboardRunRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
