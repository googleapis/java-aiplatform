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
// source: google/cloud/aiplatform/v1/index_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for [IndexService.UpdateIndex][google.cloud.aiplatform.v1.IndexService.UpdateIndex].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.UpdateIndexRequest}
 */
public final class UpdateIndexRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.UpdateIndexRequest)
    UpdateIndexRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateIndexRequest.newBuilder() to construct.
  private UpdateIndexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateIndexRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateIndexRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateIndexRequest(
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
              com.google.cloud.aiplatform.v1.Index.Builder subBuilder = null;
              if (index_ != null) {
                subBuilder = index_.toBuilder();
              }
              index_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1.Index.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(index_);
                index_ = subBuilder.buildPartial();
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
    return com.google.cloud.aiplatform.v1.IndexServiceProto
        .internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.IndexServiceProto
        .internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.UpdateIndexRequest.class,
            com.google.cloud.aiplatform.v1.UpdateIndexRequest.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.Index index_;
  /**
   *
   *
   * <pre>
   * Required. The Index which updates the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the index field is set.
   */
  @java.lang.Override
  public boolean hasIndex() {
    return index_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Index which updates the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The index.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Index getIndex() {
    return index_ == null ? com.google.cloud.aiplatform.v1.Index.getDefaultInstance() : index_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Index which updates the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.IndexOrBuilder getIndexOrBuilder() {
    return getIndex();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
   * The update mask applies to the resource.
   * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
   * The update mask applies to the resource.
   * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
    if (index_ != null) {
      output.writeMessage(1, getIndex());
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
    if (index_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIndex());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.UpdateIndexRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.UpdateIndexRequest other =
        (com.google.cloud.aiplatform.v1.UpdateIndexRequest) obj;

    if (hasIndex() != other.hasIndex()) return false;
    if (hasIndex()) {
      if (!getIndex().equals(other.getIndex())) return false;
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
    if (hasIndex()) {
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.UpdateIndexRequest prototype) {
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
   * Request message for [IndexService.UpdateIndex][google.cloud.aiplatform.v1.IndexService.UpdateIndex].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.UpdateIndexRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.UpdateIndexRequest)
      com.google.cloud.aiplatform.v1.UpdateIndexRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.IndexServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.IndexServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.UpdateIndexRequest.class,
              com.google.cloud.aiplatform.v1.UpdateIndexRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.UpdateIndexRequest.newBuilder()
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
      if (indexBuilder_ == null) {
        index_ = null;
      } else {
        index_ = null;
        indexBuilder_ = null;
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
      return com.google.cloud.aiplatform.v1.IndexServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateIndexRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.UpdateIndexRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateIndexRequest build() {
      com.google.cloud.aiplatform.v1.UpdateIndexRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateIndexRequest buildPartial() {
      com.google.cloud.aiplatform.v1.UpdateIndexRequest result =
          new com.google.cloud.aiplatform.v1.UpdateIndexRequest(this);
      if (indexBuilder_ == null) {
        result.index_ = index_;
      } else {
        result.index_ = indexBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.UpdateIndexRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.UpdateIndexRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.UpdateIndexRequest other) {
      if (other == com.google.cloud.aiplatform.v1.UpdateIndexRequest.getDefaultInstance())
        return this;
      if (other.hasIndex()) {
        mergeIndex(other.getIndex());
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
      com.google.cloud.aiplatform.v1.UpdateIndexRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1.UpdateIndexRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1.Index index_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Index,
            com.google.cloud.aiplatform.v1.Index.Builder,
            com.google.cloud.aiplatform.v1.IndexOrBuilder>
        indexBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Index which updates the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the index field is set.
     */
    public boolean hasIndex() {
      return indexBuilder_ != null || index_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The Index which updates the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The index.
     */
    public com.google.cloud.aiplatform.v1.Index getIndex() {
      if (indexBuilder_ == null) {
        return index_ == null ? com.google.cloud.aiplatform.v1.Index.getDefaultInstance() : index_;
      } else {
        return indexBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Index which updates the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIndex(com.google.cloud.aiplatform.v1.Index value) {
      if (indexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        index_ = value;
        onChanged();
      } else {
        indexBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Index which updates the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIndex(com.google.cloud.aiplatform.v1.Index.Builder builderForValue) {
      if (indexBuilder_ == null) {
        index_ = builderForValue.build();
        onChanged();
      } else {
        indexBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Index which updates the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeIndex(com.google.cloud.aiplatform.v1.Index value) {
      if (indexBuilder_ == null) {
        if (index_ != null) {
          index_ =
              com.google.cloud.aiplatform.v1.Index.newBuilder(index_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          index_ = value;
        }
        onChanged();
      } else {
        indexBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Index which updates the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearIndex() {
      if (indexBuilder_ == null) {
        index_ = null;
        onChanged();
      } else {
        index_ = null;
        indexBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Index which updates the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.Index.Builder getIndexBuilder() {

      onChanged();
      return getIndexFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Index which updates the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.IndexOrBuilder getIndexOrBuilder() {
      if (indexBuilder_ != null) {
        return indexBuilder_.getMessageOrBuilder();
      } else {
        return index_ == null ? com.google.cloud.aiplatform.v1.Index.getDefaultInstance() : index_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Index which updates the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Index,
            com.google.cloud.aiplatform.v1.Index.Builder,
            com.google.cloud.aiplatform.v1.IndexOrBuilder>
        getIndexFieldBuilder() {
      if (indexBuilder_ == null) {
        indexBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Index,
                com.google.cloud.aiplatform.v1.Index.Builder,
                com.google.cloud.aiplatform.v1.IndexOrBuilder>(
                getIndex(), getParentForChildren(), isClean());
        index_ = null;
      }
      return indexBuilder_;
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
     * The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The update mask applies to the resource.
     * For the `FieldMask` definition, see [google.protobuf.FieldMask][google.protobuf.FieldMask].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.UpdateIndexRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.UpdateIndexRequest)
  private static final com.google.cloud.aiplatform.v1.UpdateIndexRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.UpdateIndexRequest();
  }

  public static com.google.cloud.aiplatform.v1.UpdateIndexRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateIndexRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateIndexRequest>() {
        @java.lang.Override
        public UpdateIndexRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateIndexRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateIndexRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateIndexRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.UpdateIndexRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
