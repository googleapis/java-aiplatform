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
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for [TensorboardService.BatchCreateTensorboardTimeSeries][google.cloud.aiplatform.v1.TensorboardService.BatchCreateTensorboardTimeSeries].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse}
 */
public final class BatchCreateTensorboardTimeSeriesResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse)
    BatchCreateTensorboardTimeSeriesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateTensorboardTimeSeriesResponse.newBuilder() to construct.
  private BatchCreateTensorboardTimeSeriesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateTensorboardTimeSeriesResponse() {
    tensorboardTimeSeries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCreateTensorboardTimeSeriesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardTimeSeriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardTimeSeriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse.class,
            com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse.Builder.class);
  }

  public static final int TENSORBOARD_TIME_SERIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1.TensorboardTimeSeries>
      tensorboardTimeSeries_;
  /**
   *
   *
   * <pre>
   * The created TensorboardTimeSeries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.TensorboardTimeSeries>
      getTensorboardTimeSeriesList() {
    return tensorboardTimeSeries_;
  }
  /**
   *
   *
   * <pre>
   * The created TensorboardTimeSeries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder>
      getTensorboardTimeSeriesOrBuilderList() {
    return tensorboardTimeSeries_;
  }
  /**
   *
   *
   * <pre>
   * The created TensorboardTimeSeries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
   * </code>
   */
  @java.lang.Override
  public int getTensorboardTimeSeriesCount() {
    return tensorboardTimeSeries_.size();
  }
  /**
   *
   *
   * <pre>
   * The created TensorboardTimeSeries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardTimeSeries getTensorboardTimeSeries(int index) {
    return tensorboardTimeSeries_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The created TensorboardTimeSeries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder
      getTensorboardTimeSeriesOrBuilder(int index) {
    return tensorboardTimeSeries_.get(index);
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
    for (int i = 0; i < tensorboardTimeSeries_.size(); i++) {
      output.writeMessage(1, tensorboardTimeSeries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tensorboardTimeSeries_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, tensorboardTimeSeries_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse other =
        (com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse) obj;

    if (!getTensorboardTimeSeriesList().equals(other.getTensorboardTimeSeriesList())) return false;
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
    if (getTensorboardTimeSeriesCount() > 0) {
      hash = (37 * hash) + TENSORBOARD_TIME_SERIES_FIELD_NUMBER;
      hash = (53 * hash) + getTensorboardTimeSeriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse prototype) {
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
   * Response message for [TensorboardService.BatchCreateTensorboardTimeSeries][google.cloud.aiplatform.v1.TensorboardService.BatchCreateTensorboardTimeSeries].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse)
      com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardTimeSeriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardTimeSeriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse.class,
              com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tensorboardTimeSeriesBuilder_ == null) {
        tensorboardTimeSeries_ = java.util.Collections.emptyList();
      } else {
        tensorboardTimeSeries_ = null;
        tensorboardTimeSeriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardTimeSeriesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse build() {
      com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse buildPartial() {
      com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse result =
          new com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse(this);
      int from_bitField0_ = bitField0_;
      if (tensorboardTimeSeriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tensorboardTimeSeries_ = java.util.Collections.unmodifiableList(tensorboardTimeSeries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tensorboardTimeSeries_ = tensorboardTimeSeries_;
      } else {
        result.tensorboardTimeSeries_ = tensorboardTimeSeriesBuilder_.build();
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
      if (other
          instanceof com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse
              .getDefaultInstance()) return this;
      if (tensorboardTimeSeriesBuilder_ == null) {
        if (!other.tensorboardTimeSeries_.isEmpty()) {
          if (tensorboardTimeSeries_.isEmpty()) {
            tensorboardTimeSeries_ = other.tensorboardTimeSeries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTensorboardTimeSeriesIsMutable();
            tensorboardTimeSeries_.addAll(other.tensorboardTimeSeries_);
          }
          onChanged();
        }
      } else {
        if (!other.tensorboardTimeSeries_.isEmpty()) {
          if (tensorboardTimeSeriesBuilder_.isEmpty()) {
            tensorboardTimeSeriesBuilder_.dispose();
            tensorboardTimeSeriesBuilder_ = null;
            tensorboardTimeSeries_ = other.tensorboardTimeSeries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tensorboardTimeSeriesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTensorboardTimeSeriesFieldBuilder()
                    : null;
          } else {
            tensorboardTimeSeriesBuilder_.addAllMessages(other.tensorboardTimeSeries_);
          }
        }
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
                com.google.cloud.aiplatform.v1.TensorboardTimeSeries m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.TensorboardTimeSeries.parser(),
                        extensionRegistry);
                if (tensorboardTimeSeriesBuilder_ == null) {
                  ensureTensorboardTimeSeriesIsMutable();
                  tensorboardTimeSeries_.add(m);
                } else {
                  tensorboardTimeSeriesBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.aiplatform.v1.TensorboardTimeSeries>
        tensorboardTimeSeries_ = java.util.Collections.emptyList();

    private void ensureTensorboardTimeSeriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tensorboardTimeSeries_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.TensorboardTimeSeries>(
                tensorboardTimeSeries_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TensorboardTimeSeries,
            com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder,
            com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder>
        tensorboardTimeSeriesBuilder_;

    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.TensorboardTimeSeries>
        getTensorboardTimeSeriesList() {
      if (tensorboardTimeSeriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tensorboardTimeSeries_);
      } else {
        return tensorboardTimeSeriesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public int getTensorboardTimeSeriesCount() {
      if (tensorboardTimeSeriesBuilder_ == null) {
        return tensorboardTimeSeries_.size();
      } else {
        return tensorboardTimeSeriesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardTimeSeries getTensorboardTimeSeries(
        int index) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        return tensorboardTimeSeries_.get(index);
      } else {
        return tensorboardTimeSeriesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public Builder setTensorboardTimeSeries(
        int index, com.google.cloud.aiplatform.v1.TensorboardTimeSeries value) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorboardTimeSeriesIsMutable();
        tensorboardTimeSeries_.set(index, value);
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public Builder setTensorboardTimeSeries(
        int index, com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder builderForValue) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        ensureTensorboardTimeSeriesIsMutable();
        tensorboardTimeSeries_.set(index, builderForValue.build());
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public Builder addTensorboardTimeSeries(
        com.google.cloud.aiplatform.v1.TensorboardTimeSeries value) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorboardTimeSeriesIsMutable();
        tensorboardTimeSeries_.add(value);
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public Builder addTensorboardTimeSeries(
        int index, com.google.cloud.aiplatform.v1.TensorboardTimeSeries value) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorboardTimeSeriesIsMutable();
        tensorboardTimeSeries_.add(index, value);
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public Builder addTensorboardTimeSeries(
        com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder builderForValue) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        ensureTensorboardTimeSeriesIsMutable();
        tensorboardTimeSeries_.add(builderForValue.build());
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public Builder addTensorboardTimeSeries(
        int index, com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder builderForValue) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        ensureTensorboardTimeSeriesIsMutable();
        tensorboardTimeSeries_.add(index, builderForValue.build());
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public Builder addAllTensorboardTimeSeries(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.TensorboardTimeSeries> values) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        ensureTensorboardTimeSeriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tensorboardTimeSeries_);
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public Builder clearTensorboardTimeSeries() {
      if (tensorboardTimeSeriesBuilder_ == null) {
        tensorboardTimeSeries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public Builder removeTensorboardTimeSeries(int index) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        ensureTensorboardTimeSeriesIsMutable();
        tensorboardTimeSeries_.remove(index);
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder
        getTensorboardTimeSeriesBuilder(int index) {
      return getTensorboardTimeSeriesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder
        getTensorboardTimeSeriesOrBuilder(int index) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        return tensorboardTimeSeries_.get(index);
      } else {
        return tensorboardTimeSeriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder>
        getTensorboardTimeSeriesOrBuilderList() {
      if (tensorboardTimeSeriesBuilder_ != null) {
        return tensorboardTimeSeriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tensorboardTimeSeries_);
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder
        addTensorboardTimeSeriesBuilder() {
      return getTensorboardTimeSeriesFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.TensorboardTimeSeries.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder
        addTensorboardTimeSeriesBuilder(int index) {
      return getTensorboardTimeSeriesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.aiplatform.v1.TensorboardTimeSeries.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardTimeSeries.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder>
        getTensorboardTimeSeriesBuilderList() {
      return getTensorboardTimeSeriesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TensorboardTimeSeries,
            com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder,
            com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder>
        getTensorboardTimeSeriesFieldBuilder() {
      if (tensorboardTimeSeriesBuilder_ == null) {
        tensorboardTimeSeriesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.TensorboardTimeSeries,
                com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder,
                com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder>(
                tensorboardTimeSeries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tensorboardTimeSeries_ = null;
      }
      return tensorboardTimeSeriesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse)
  private static final com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse();
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateTensorboardTimeSeriesResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateTensorboardTimeSeriesResponse>() {
        @java.lang.Override
        public BatchCreateTensorboardTimeSeriesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateTensorboardTimeSeriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateTensorboardTimeSeriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.BatchCreateTensorboardTimeSeriesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
