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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Specification of Model explanation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExplanationSpec}
 */
public final class ExplanationSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ExplanationSpec)
    ExplanationSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExplanationSpec.newBuilder() to construct.
  private ExplanationSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExplanationSpec() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExplanationSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExplanationSpec(
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
              com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder subBuilder = null;
              if (parameters_ != null) {
                subBuilder = parameters_.toBuilder();
              }
              parameters_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.ExplanationParameters.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(parameters_);
                parameters_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder subBuilder = null;
              if (metadata_ != null) {
                subBuilder = metadata_.toBuilder();
              }
              metadata_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(metadata_);
                metadata_ = subBuilder.buildPartial();
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
    return com.google.cloud.aiplatform.v1beta1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ExplanationSpec.class,
            com.google.cloud.aiplatform.v1beta1.ExplanationSpec.Builder.class);
  }

  public static final int PARAMETERS_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters_;
  /**
   *
   *
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the parameters field is set.
   */
  @java.lang.Override
  public boolean hasParameters() {
    return parameters_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The parameters.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationParameters getParameters() {
    return parameters_ == null
        ? com.google.cloud.aiplatform.v1beta1.ExplanationParameters.getDefaultInstance()
        : parameters_;
  }
  /**
   *
   *
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder
      getParametersOrBuilder() {
    return getParameters();
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata_;
  /**
   *
   *
   * <pre>
   * Required. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationMetadata getMetadata() {
    return metadata_ == null
        ? com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.getDefaultInstance()
        : metadata_;
  }
  /**
   *
   *
   * <pre>
   * Required. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder getMetadataOrBuilder() {
    return getMetadata();
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
    if (parameters_ != null) {
      output.writeMessage(1, getParameters());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (parameters_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getParameters());
    }
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetadata());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ExplanationSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ExplanationSpec other =
        (com.google.cloud.aiplatform.v1beta1.ExplanationSpec) obj;

    if (hasParameters() != other.hasParameters()) return false;
    if (hasParameters()) {
      if (!getParameters().equals(other.getParameters())) return false;
    }
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata().equals(other.getMetadata())) return false;
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
    if (hasParameters()) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParameters().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ExplanationSpec prototype) {
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
   * Specification of Model explanation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExplanationSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ExplanationSpec)
      com.google.cloud.aiplatform.v1beta1.ExplanationSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ExplanationSpec.class,
              com.google.cloud.aiplatform.v1beta1.ExplanationSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ExplanationSpec.newBuilder()
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
      if (parametersBuilder_ == null) {
        parameters_ = null;
      } else {
        parameters_ = null;
        parametersBuilder_ = null;
      }
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExplanationSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExplanationSpec build() {
      com.google.cloud.aiplatform.v1beta1.ExplanationSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExplanationSpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ExplanationSpec result =
          new com.google.cloud.aiplatform.v1beta1.ExplanationSpec(this);
      if (parametersBuilder_ == null) {
        result.parameters_ = parameters_;
      } else {
        result.parameters_ = parametersBuilder_.build();
      }
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ExplanationSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ExplanationSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ExplanationSpec other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ExplanationSpec.getDefaultInstance())
        return this;
      if (other.hasParameters()) {
        mergeParameters(other.getParameters());
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
      com.google.cloud.aiplatform.v1beta1.ExplanationSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.ExplanationSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExplanationParameters,
            com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder,
            com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder>
        parametersBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the parameters field is set.
     */
    public boolean hasParameters() {
      return parametersBuilder_ != null || parameters_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The parameters.
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationParameters getParameters() {
      if (parametersBuilder_ == null) {
        return parameters_ == null
            ? com.google.cloud.aiplatform.v1beta1.ExplanationParameters.getDefaultInstance()
            : parameters_;
      } else {
        return parametersBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setParameters(com.google.cloud.aiplatform.v1beta1.ExplanationParameters value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parameters_ = value;
        onChanged();
      } else {
        parametersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setParameters(
        com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        parameters_ = builderForValue.build();
        onChanged();
      } else {
        parametersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeParameters(
        com.google.cloud.aiplatform.v1beta1.ExplanationParameters value) {
      if (parametersBuilder_ == null) {
        if (parameters_ != null) {
          parameters_ =
              com.google.cloud.aiplatform.v1beta1.ExplanationParameters.newBuilder(parameters_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          parameters_ = value;
        }
        onChanged();
      } else {
        parametersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearParameters() {
      if (parametersBuilder_ == null) {
        parameters_ = null;
        onChanged();
      } else {
        parameters_ = null;
        parametersBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder
        getParametersBuilder() {

      onChanged();
      return getParametersFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder
        getParametersOrBuilder() {
      if (parametersBuilder_ != null) {
        return parametersBuilder_.getMessageOrBuilder();
      } else {
        return parameters_ == null
            ? com.google.cloud.aiplatform.v1beta1.ExplanationParameters.getDefaultInstance()
            : parameters_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters that configure explaining of the Model's predictions.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExplanationParameters,
            com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder,
            com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder>
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.ExplanationParameters,
                com.google.cloud.aiplatform.v1beta1.ExplanationParameters.Builder,
                com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder>(
                getParameters(), getParentForChildren(), isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
    }

    private com.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExplanationMetadata,
            com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder,
            com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder>
        metadataBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The metadata.
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null
            ? com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.getDefaultInstance()
            : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetadata(com.google.cloud.aiplatform.v1beta1.ExplanationMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetadata(
        com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMetadata(com.google.cloud.aiplatform.v1beta1.ExplanationMetadata value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
              com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.newBuilder(metadata_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder getMetadataBuilder() {

      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null
            ? com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.getDefaultInstance()
            : metadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Metadata describing the Model's input and output for explanation.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExplanationMetadata,
            com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder,
            com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder>
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.ExplanationMetadata,
                com.google.cloud.aiplatform.v1beta1.ExplanationMetadata.Builder,
                com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder>(
                getMetadata(), getParentForChildren(), isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ExplanationSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ExplanationSpec)
  private static final com.google.cloud.aiplatform.v1beta1.ExplanationSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ExplanationSpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.ExplanationSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExplanationSpec> PARSER =
      new com.google.protobuf.AbstractParser<ExplanationSpec>() {
        @java.lang.Override
        public ExplanationSpec parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExplanationSpec(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExplanationSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExplanationSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
