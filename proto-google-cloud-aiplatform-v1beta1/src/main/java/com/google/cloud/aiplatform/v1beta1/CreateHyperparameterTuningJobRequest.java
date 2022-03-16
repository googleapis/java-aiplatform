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
// source: google/cloud/aiplatform/v1beta1/job_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [JobService.CreateHyperparameterTuningJob][google.cloud.aiplatform.v1beta1.JobService.CreateHyperparameterTuningJob].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest}
 */
public final class CreateHyperparameterTuningJobRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest)
    CreateHyperparameterTuningJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateHyperparameterTuningJobRequest.newBuilder() to construct.
  private CreateHyperparameterTuningJobRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateHyperparameterTuningJobRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateHyperparameterTuningJobRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateHyperparameterTuningJobRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.Builder subBuilder = null;
              if (hyperparameterTuningJob_ != null) {
                subBuilder = hyperparameterTuningJob_.toBuilder();
              }
              hyperparameterTuningJob_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(hyperparameterTuningJob_);
                hyperparameterTuningJob_ = subBuilder.buildPartial();
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
    return com.google.cloud.aiplatform.v1beta1.JobServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateHyperparameterTuningJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.JobServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateHyperparameterTuningJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest.class,
            com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the HyperparameterTuningJob in.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location to create the HyperparameterTuningJob in.
   * Format: `projects/{project}/locations/{location}`
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

  public static final int HYPERPARAMETER_TUNING_JOB_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameterTuningJob_;
  /**
   *
   *
   * <pre>
   * Required. The HyperparameterTuningJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the hyperparameterTuningJob field is set.
   */
  @java.lang.Override
  public boolean hasHyperparameterTuningJob() {
    return hyperparameterTuningJob_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The HyperparameterTuningJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The hyperparameterTuningJob.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob getHyperparameterTuningJob() {
    return hyperparameterTuningJob_ == null
        ? com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.getDefaultInstance()
        : hyperparameterTuningJob_;
  }
  /**
   *
   *
   * <pre>
   * Required. The HyperparameterTuningJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJobOrBuilder
      getHyperparameterTuningJobOrBuilder() {
    return getHyperparameterTuningJob();
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
    if (hyperparameterTuningJob_ != null) {
      output.writeMessage(2, getHyperparameterTuningJob());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (hyperparameterTuningJob_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getHyperparameterTuningJob());
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
        instanceof com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest other =
        (com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasHyperparameterTuningJob() != other.hasHyperparameterTuningJob()) return false;
    if (hasHyperparameterTuningJob()) {
      if (!getHyperparameterTuningJob().equals(other.getHyperparameterTuningJob())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasHyperparameterTuningJob()) {
      hash = (37 * hash) + HYPERPARAMETER_TUNING_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getHyperparameterTuningJob().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest prototype) {
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
   * Request message for [JobService.CreateHyperparameterTuningJob][google.cloud.aiplatform.v1beta1.JobService.CreateHyperparameterTuningJob].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest)
      com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.JobServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateHyperparameterTuningJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.JobServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateHyperparameterTuningJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest.class,
              com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest.newBuilder()
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
      parent_ = "";

      if (hyperparameterTuningJobBuilder_ == null) {
        hyperparameterTuningJob_ = null;
      } else {
        hyperparameterTuningJob_ = null;
        hyperparameterTuningJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.JobServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateHyperparameterTuningJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest result =
          new com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest(this);
      result.parent_ = parent_;
      if (hyperparameterTuningJobBuilder_ == null) {
        result.hyperparameterTuningJob_ = hyperparameterTuningJob_;
      } else {
        result.hyperparameterTuningJob_ = hyperparameterTuningJobBuilder_.build();
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
          instanceof com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasHyperparameterTuningJob()) {
        mergeHyperparameterTuningJob(other.getHyperparameterTuningJob());
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
      com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the HyperparameterTuningJob in.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create the HyperparameterTuningJob in.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create the HyperparameterTuningJob in.
     * Format: `projects/{project}/locations/{location}`
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the HyperparameterTuningJob in.
     * Format: `projects/{project}/locations/{location}`
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the HyperparameterTuningJob in.
     * Format: `projects/{project}/locations/{location}`
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
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameterTuningJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob,
            com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.Builder,
            com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJobOrBuilder>
        hyperparameterTuningJobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The HyperparameterTuningJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the hyperparameterTuningJob field is set.
     */
    public boolean hasHyperparameterTuningJob() {
      return hyperparameterTuningJobBuilder_ != null || hyperparameterTuningJob_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The HyperparameterTuningJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The hyperparameterTuningJob.
     */
    public com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob
        getHyperparameterTuningJob() {
      if (hyperparameterTuningJobBuilder_ == null) {
        return hyperparameterTuningJob_ == null
            ? com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.getDefaultInstance()
            : hyperparameterTuningJob_;
      } else {
        return hyperparameterTuningJobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The HyperparameterTuningJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob value) {
      if (hyperparameterTuningJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hyperparameterTuningJob_ = value;
        onChanged();
      } else {
        hyperparameterTuningJobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The HyperparameterTuningJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.Builder builderForValue) {
      if (hyperparameterTuningJobBuilder_ == null) {
        hyperparameterTuningJob_ = builderForValue.build();
        onChanged();
      } else {
        hyperparameterTuningJobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The HyperparameterTuningJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob value) {
      if (hyperparameterTuningJobBuilder_ == null) {
        if (hyperparameterTuningJob_ != null) {
          hyperparameterTuningJob_ =
              com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.newBuilder(
                      hyperparameterTuningJob_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          hyperparameterTuningJob_ = value;
        }
        onChanged();
      } else {
        hyperparameterTuningJobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The HyperparameterTuningJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearHyperparameterTuningJob() {
      if (hyperparameterTuningJobBuilder_ == null) {
        hyperparameterTuningJob_ = null;
        onChanged();
      } else {
        hyperparameterTuningJob_ = null;
        hyperparameterTuningJobBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The HyperparameterTuningJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.Builder
        getHyperparameterTuningJobBuilder() {

      onChanged();
      return getHyperparameterTuningJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The HyperparameterTuningJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJobOrBuilder
        getHyperparameterTuningJobOrBuilder() {
      if (hyperparameterTuningJobBuilder_ != null) {
        return hyperparameterTuningJobBuilder_.getMessageOrBuilder();
      } else {
        return hyperparameterTuningJob_ == null
            ? com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.getDefaultInstance()
            : hyperparameterTuningJob_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The HyperparameterTuningJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.HyperparameterTuningJob hyperparameter_tuning_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob,
            com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.Builder,
            com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJobOrBuilder>
        getHyperparameterTuningJobFieldBuilder() {
      if (hyperparameterTuningJobBuilder_ == null) {
        hyperparameterTuningJobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob,
                com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.Builder,
                com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJobOrBuilder>(
                getHyperparameterTuningJob(), getParentForChildren(), isClean());
        hyperparameterTuningJob_ = null;
      }
      return hyperparameterTuningJobBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateHyperparameterTuningJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateHyperparameterTuningJobRequest>() {
        @java.lang.Override
        public CreateHyperparameterTuningJobRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateHyperparameterTuningJobRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateHyperparameterTuningJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateHyperparameterTuningJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateHyperparameterTuningJobRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
