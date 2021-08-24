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
 * Details of operations that perform import feature values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata}
 */
public final class ImportFeatureValuesOperationMetadata
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata)
    ImportFeatureValuesOperationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportFeatureValuesOperationMetadata.newBuilder() to construct.
  private ImportFeatureValuesOperationMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportFeatureValuesOperationMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportFeatureValuesOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImportFeatureValuesOperationMetadata(
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
              com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder subBuilder =
                  null;
              if (genericMetadata_ != null) {
                subBuilder = genericMetadata_.toBuilder();
              }
              genericMetadata_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(genericMetadata_);
                genericMetadata_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              importedEntityCount_ = input.readInt64();
              break;
            }
          case 24:
            {
              importedFeatureValueCount_ = input.readInt64();
              break;
            }
          case 48:
            {
              invalidRowCount_ = input.readInt64();
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
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata.class,
            com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata.Builder.class);
  }

  public static final int GENERIC_METADATA_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata genericMetadata_;
  /**
   *
   *
   * <pre>
   * Operation metadata for Featurestore import feature values.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   *
   * @return Whether the genericMetadata field is set.
   */
  @java.lang.Override
  public boolean hasGenericMetadata() {
    return genericMetadata_ != null;
  }
  /**
   *
   *
   * <pre>
   * Operation metadata for Featurestore import feature values.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   *
   * @return The genericMetadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata() {
    return genericMetadata_ == null
        ? com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.getDefaultInstance()
        : genericMetadata_;
  }
  /**
   *
   *
   * <pre>
   * Operation metadata for Featurestore import feature values.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder
      getGenericMetadataOrBuilder() {
    return getGenericMetadata();
  }

  public static final int IMPORTED_ENTITY_COUNT_FIELD_NUMBER = 2;
  private long importedEntityCount_;
  /**
   *
   *
   * <pre>
   * Number of entities that have been imported by the operation.
   * </pre>
   *
   * <code>int64 imported_entity_count = 2;</code>
   *
   * @return The importedEntityCount.
   */
  @java.lang.Override
  public long getImportedEntityCount() {
    return importedEntityCount_;
  }

  public static final int IMPORTED_FEATURE_VALUE_COUNT_FIELD_NUMBER = 3;
  private long importedFeatureValueCount_;
  /**
   *
   *
   * <pre>
   * Number of feature values that have been imported by the operation.
   * </pre>
   *
   * <code>int64 imported_feature_value_count = 3;</code>
   *
   * @return The importedFeatureValueCount.
   */
  @java.lang.Override
  public long getImportedFeatureValueCount() {
    return importedFeatureValueCount_;
  }

  public static final int INVALID_ROW_COUNT_FIELD_NUMBER = 6;
  private long invalidRowCount_;
  /**
   *
   *
   * <pre>
   * The number of rows in input source that weren't imported due to either
   * * Not having any featureValues.
   * * Having a null entityId.
   * * Having a null timestamp.
   * * Not being parsable (applicable for CSV sources).
   * </pre>
   *
   * <code>int64 invalid_row_count = 6;</code>
   *
   * @return The invalidRowCount.
   */
  @java.lang.Override
  public long getInvalidRowCount() {
    return invalidRowCount_;
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
    if (genericMetadata_ != null) {
      output.writeMessage(1, getGenericMetadata());
    }
    if (importedEntityCount_ != 0L) {
      output.writeInt64(2, importedEntityCount_);
    }
    if (importedFeatureValueCount_ != 0L) {
      output.writeInt64(3, importedFeatureValueCount_);
    }
    if (invalidRowCount_ != 0L) {
      output.writeInt64(6, invalidRowCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (genericMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGenericMetadata());
    }
    if (importedEntityCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, importedEntityCount_);
    }
    if (importedFeatureValueCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, importedFeatureValueCount_);
    }
    if (invalidRowCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(6, invalidRowCount_);
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
        instanceof com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata other =
        (com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata) obj;

    if (hasGenericMetadata() != other.hasGenericMetadata()) return false;
    if (hasGenericMetadata()) {
      if (!getGenericMetadata().equals(other.getGenericMetadata())) return false;
    }
    if (getImportedEntityCount() != other.getImportedEntityCount()) return false;
    if (getImportedFeatureValueCount() != other.getImportedFeatureValueCount()) return false;
    if (getInvalidRowCount() != other.getInvalidRowCount()) return false;
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
    if (hasGenericMetadata()) {
      hash = (37 * hash) + GENERIC_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getGenericMetadata().hashCode();
    }
    hash = (37 * hash) + IMPORTED_ENTITY_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getImportedEntityCount());
    hash = (37 * hash) + IMPORTED_FEATURE_VALUE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getImportedFeatureValueCount());
    hash = (37 * hash) + INVALID_ROW_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getInvalidRowCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata prototype) {
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
   * Details of operations that perform import feature values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata)
      com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata.class,
              com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata.newBuilder()
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
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = null;
      } else {
        genericMetadata_ = null;
        genericMetadataBuilder_ = null;
      }
      importedEntityCount_ = 0L;

      importedFeatureValueCount_ = 0L;

      invalidRowCount_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata build() {
      com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata result =
          new com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata(this);
      if (genericMetadataBuilder_ == null) {
        result.genericMetadata_ = genericMetadata_;
      } else {
        result.genericMetadata_ = genericMetadataBuilder_.build();
      }
      result.importedEntityCount_ = importedEntityCount_;
      result.importedFeatureValueCount_ = importedFeatureValueCount_;
      result.invalidRowCount_ = invalidRowCount_;
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
          instanceof com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata
              .getDefaultInstance()) return this;
      if (other.hasGenericMetadata()) {
        mergeGenericMetadata(other.getGenericMetadata());
      }
      if (other.getImportedEntityCount() != 0L) {
        setImportedEntityCount(other.getImportedEntityCount());
      }
      if (other.getImportedFeatureValueCount() != 0L) {
        setImportedFeatureValueCount(other.getImportedFeatureValueCount());
      }
      if (other.getInvalidRowCount() != 0L) {
        setInvalidRowCount(other.getInvalidRowCount());
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
      com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata genericMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata,
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder,
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder>
        genericMetadataBuilder_;
    /**
     *
     *
     * <pre>
     * Operation metadata for Featurestore import feature values.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     *
     * @return Whether the genericMetadata field is set.
     */
    public boolean hasGenericMetadata() {
      return genericMetadataBuilder_ != null || genericMetadata_ != null;
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for Featurestore import feature values.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     *
     * @return The genericMetadata.
     */
    public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata() {
      if (genericMetadataBuilder_ == null) {
        return genericMetadata_ == null
            ? com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.getDefaultInstance()
            : genericMetadata_;
      } else {
        return genericMetadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for Featurestore import feature values.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(
        com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        genericMetadata_ = value;
        onChanged();
      } else {
        genericMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for Featurestore import feature values.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(
        com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder builderForValue) {
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = builderForValue.build();
        onChanged();
      } else {
        genericMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for Featurestore import feature values.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder mergeGenericMetadata(
        com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (genericMetadata_ != null) {
          genericMetadata_ =
              com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.newBuilder(
                      genericMetadata_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          genericMetadata_ = value;
        }
        onChanged();
      } else {
        genericMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for Featurestore import feature values.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder clearGenericMetadata() {
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = null;
        onChanged();
      } else {
        genericMetadata_ = null;
        genericMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for Featurestore import feature values.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder
        getGenericMetadataBuilder() {

      onChanged();
      return getGenericMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for Featurestore import feature values.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder
        getGenericMetadataOrBuilder() {
      if (genericMetadataBuilder_ != null) {
        return genericMetadataBuilder_.getMessageOrBuilder();
      } else {
        return genericMetadata_ == null
            ? com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.getDefaultInstance()
            : genericMetadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for Featurestore import feature values.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata,
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder,
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder>
        getGenericMetadataFieldBuilder() {
      if (genericMetadataBuilder_ == null) {
        genericMetadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata,
                com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder,
                com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder>(
                getGenericMetadata(), getParentForChildren(), isClean());
        genericMetadata_ = null;
      }
      return genericMetadataBuilder_;
    }

    private long importedEntityCount_;
    /**
     *
     *
     * <pre>
     * Number of entities that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_entity_count = 2;</code>
     *
     * @return The importedEntityCount.
     */
    @java.lang.Override
    public long getImportedEntityCount() {
      return importedEntityCount_;
    }
    /**
     *
     *
     * <pre>
     * Number of entities that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_entity_count = 2;</code>
     *
     * @param value The importedEntityCount to set.
     * @return This builder for chaining.
     */
    public Builder setImportedEntityCount(long value) {

      importedEntityCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of entities that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_entity_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImportedEntityCount() {

      importedEntityCount_ = 0L;
      onChanged();
      return this;
    }

    private long importedFeatureValueCount_;
    /**
     *
     *
     * <pre>
     * Number of feature values that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_feature_value_count = 3;</code>
     *
     * @return The importedFeatureValueCount.
     */
    @java.lang.Override
    public long getImportedFeatureValueCount() {
      return importedFeatureValueCount_;
    }
    /**
     *
     *
     * <pre>
     * Number of feature values that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_feature_value_count = 3;</code>
     *
     * @param value The importedFeatureValueCount to set.
     * @return This builder for chaining.
     */
    public Builder setImportedFeatureValueCount(long value) {

      importedFeatureValueCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of feature values that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_feature_value_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImportedFeatureValueCount() {

      importedFeatureValueCount_ = 0L;
      onChanged();
      return this;
    }

    private long invalidRowCount_;
    /**
     *
     *
     * <pre>
     * The number of rows in input source that weren't imported due to either
     * * Not having any featureValues.
     * * Having a null entityId.
     * * Having a null timestamp.
     * * Not being parsable (applicable for CSV sources).
     * </pre>
     *
     * <code>int64 invalid_row_count = 6;</code>
     *
     * @return The invalidRowCount.
     */
    @java.lang.Override
    public long getInvalidRowCount() {
      return invalidRowCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of rows in input source that weren't imported due to either
     * * Not having any featureValues.
     * * Having a null entityId.
     * * Having a null timestamp.
     * * Not being parsable (applicable for CSV sources).
     * </pre>
     *
     * <code>int64 invalid_row_count = 6;</code>
     *
     * @param value The invalidRowCount to set.
     * @return This builder for chaining.
     */
    public Builder setInvalidRowCount(long value) {

      invalidRowCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of rows in input source that weren't imported due to either
     * * Not having any featureValues.
     * * Having a null entityId.
     * * Having a null timestamp.
     * * Not being parsable (applicable for CSV sources).
     * </pre>
     *
     * <code>int64 invalid_row_count = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInvalidRowCount() {

      invalidRowCount_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata)
  private static final com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata();
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportFeatureValuesOperationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<ImportFeatureValuesOperationMetadata>() {
        @java.lang.Override
        public ImportFeatureValuesOperationMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImportFeatureValuesOperationMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImportFeatureValuesOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportFeatureValuesOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
