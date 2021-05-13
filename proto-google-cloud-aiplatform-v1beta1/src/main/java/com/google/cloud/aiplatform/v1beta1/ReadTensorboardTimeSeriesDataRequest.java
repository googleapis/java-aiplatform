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
 * Request message for [TensorboardService.ReadTensorboardTimeSeriesData][google.cloud.aiplatform.v1beta1.TensorboardService.ReadTensorboardTimeSeriesData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest}
 */
public final class ReadTensorboardTimeSeriesDataRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest)
    ReadTensorboardTimeSeriesDataRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReadTensorboardTimeSeriesDataRequest.newBuilder() to construct.
  private ReadTensorboardTimeSeriesDataRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReadTensorboardTimeSeriesDataRequest() {
    tensorboardTimeSeries_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReadTensorboardTimeSeriesDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReadTensorboardTimeSeriesDataRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              tensorboardTimeSeries_ = s;
              break;
            }
          case 16:
            {
              maxDataPoints_ = input.readInt32();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              filter_ = s;
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
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardTimeSeriesDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardTimeSeriesDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest.class,
            com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest.Builder.class);
  }

  public static final int TENSORBOARD_TIME_SERIES_FIELD_NUMBER = 1;
  private volatile java.lang.Object tensorboardTimeSeries_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to read data from.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tensorboardTimeSeries.
   */
  @java.lang.Override
  public java.lang.String getTensorboardTimeSeries() {
    java.lang.Object ref = tensorboardTimeSeries_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tensorboardTimeSeries_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to read data from.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tensorboardTimeSeries.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTensorboardTimeSeriesBytes() {
    java.lang.Object ref = tensorboardTimeSeries_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tensorboardTimeSeries_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_DATA_POINTS_FIELD_NUMBER = 2;
  private int maxDataPoints_;
  /**
   *
   *
   * <pre>
   * The maximum number of TensorboardTimeSeries' data to return.
   * This value should be a positive integer.
   * This value can be set to -1 to return all data.
   * </pre>
   *
   * <code>int32 max_data_points = 2;</code>
   *
   * @return The maxDataPoints.
   */
  @java.lang.Override
  public int getMaxDataPoints() {
    return maxDataPoints_;
  }

  public static final int FILTER_FIELD_NUMBER = 3;
  private volatile java.lang.Object filter_;
  /**
   *
   *
   * <pre>
   * Reads the TensorboardTimeSeries' data that match the filter expression.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Reads the TensorboardTimeSeries' data that match the filter expression.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
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
    if (!getTensorboardTimeSeriesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tensorboardTimeSeries_);
    }
    if (maxDataPoints_ != 0) {
      output.writeInt32(2, maxDataPoints_);
    }
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTensorboardTimeSeriesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tensorboardTimeSeries_);
    }
    if (maxDataPoints_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxDataPoints_);
    }
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filter_);
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
    if (!(obj
        instanceof com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest other =
        (com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest) obj;

    if (!getTensorboardTimeSeries().equals(other.getTensorboardTimeSeries())) return false;
    if (getMaxDataPoints() != other.getMaxDataPoints()) return false;
    if (!getFilter().equals(other.getFilter())) return false;
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
    hash = (37 * hash) + TENSORBOARD_TIME_SERIES_FIELD_NUMBER;
    hash = (53 * hash) + getTensorboardTimeSeries().hashCode();
    hash = (37 * hash) + MAX_DATA_POINTS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxDataPoints();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest prototype) {
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
   * Request message for [TensorboardService.ReadTensorboardTimeSeriesData][google.cloud.aiplatform.v1beta1.TensorboardService.ReadTensorboardTimeSeriesData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest)
      com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardTimeSeriesDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardTimeSeriesDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest.class,
              com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest.newBuilder()
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
      tensorboardTimeSeries_ = "";

      maxDataPoints_ = 0;

      filter_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardTimeSeriesDataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest build() {
      com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest result =
          new com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest(this);
      result.tensorboardTimeSeries_ = tensorboardTimeSeries_;
      result.maxDataPoints_ = maxDataPoints_;
      result.filter_ = filter_;
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
          instanceof com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest
              .getDefaultInstance()) return this;
      if (!other.getTensorboardTimeSeries().isEmpty()) {
        tensorboardTimeSeries_ = other.tensorboardTimeSeries_;
        onChanged();
      }
      if (other.getMaxDataPoints() != 0) {
        setMaxDataPoints(other.getMaxDataPoints());
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
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
      com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tensorboardTimeSeries_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to read data from.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The tensorboardTimeSeries.
     */
    public java.lang.String getTensorboardTimeSeries() {
      java.lang.Object ref = tensorboardTimeSeries_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tensorboardTimeSeries_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to read data from.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for tensorboardTimeSeries.
     */
    public com.google.protobuf.ByteString getTensorboardTimeSeriesBytes() {
      java.lang.Object ref = tensorboardTimeSeries_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tensorboardTimeSeries_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to read data from.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The tensorboardTimeSeries to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboardTimeSeries(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      tensorboardTimeSeries_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to read data from.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTensorboardTimeSeries() {

      tensorboardTimeSeries_ = getDefaultInstance().getTensorboardTimeSeries();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to read data from.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for tensorboardTimeSeries to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboardTimeSeriesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      tensorboardTimeSeries_ = value;
      onChanged();
      return this;
    }

    private int maxDataPoints_;
    /**
     *
     *
     * <pre>
     * The maximum number of TensorboardTimeSeries' data to return.
     * This value should be a positive integer.
     * This value can be set to -1 to return all data.
     * </pre>
     *
     * <code>int32 max_data_points = 2;</code>
     *
     * @return The maxDataPoints.
     */
    @java.lang.Override
    public int getMaxDataPoints() {
      return maxDataPoints_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of TensorboardTimeSeries' data to return.
     * This value should be a positive integer.
     * This value can be set to -1 to return all data.
     * </pre>
     *
     * <code>int32 max_data_points = 2;</code>
     *
     * @param value The maxDataPoints to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDataPoints(int value) {

      maxDataPoints_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of TensorboardTimeSeries' data to return.
     * This value should be a positive integer.
     * This value can be set to -1 to return all data.
     * </pre>
     *
     * <code>int32 max_data_points = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxDataPoints() {

      maxDataPoints_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * Reads the TensorboardTimeSeries' data that match the filter expression.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Reads the TensorboardTimeSeries' data that match the filter expression.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Reads the TensorboardTimeSeries' data that match the filter expression.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      filter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reads the TensorboardTimeSeries' data that match the filter expression.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {

      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reads the TensorboardTimeSeries' data that match the filter expression.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      filter_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest)
  private static final com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadTensorboardTimeSeriesDataRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReadTensorboardTimeSeriesDataRequest>() {
        @java.lang.Override
        public ReadTensorboardTimeSeriesDataRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReadTensorboardTimeSeriesDataRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReadTensorboardTimeSeriesDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadTensorboardTimeSeriesDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}