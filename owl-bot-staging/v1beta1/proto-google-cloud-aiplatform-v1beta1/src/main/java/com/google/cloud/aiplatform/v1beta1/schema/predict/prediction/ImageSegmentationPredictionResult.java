// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/image_segmentation.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

/**
 * <pre>
 * Prediction output format for Image Segmentation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult}
 */
public final class ImageSegmentationPredictionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult)
    ImageSegmentationPredictionResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageSegmentationPredictionResult.newBuilder() to construct.
  private ImageSegmentationPredictionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageSegmentationPredictionResult() {
    categoryMask_ = "";
    confidenceMask_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageSegmentationPredictionResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImageSegmentationPredictionResult(
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
            java.lang.String s = input.readStringRequireUtf8();

            categoryMask_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            confidenceMask_ = s;
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
    return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult.class, com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult.Builder.class);
  }

  public static final int CATEGORY_MASK_FIELD_NUMBER = 1;
  private volatile java.lang.Object categoryMask_;
  /**
   * <pre>
   * A PNG image where each pixel in the mask represents the category in which
   * the pixel in the original image was predicted to belong to. The size of
   * this image will be the same as the original image. The mapping between the
   * AnntoationSpec and the color can be found in model's metadata. The model
   * will choose the most likely category and if none of the categories reach
   * the confidence threshold, the pixel will be marked as background.
   * </pre>
   *
   * <code>string category_mask = 1;</code>
   * @return The categoryMask.
   */
  @java.lang.Override
  public java.lang.String getCategoryMask() {
    java.lang.Object ref = categoryMask_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      categoryMask_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A PNG image where each pixel in the mask represents the category in which
   * the pixel in the original image was predicted to belong to. The size of
   * this image will be the same as the original image. The mapping between the
   * AnntoationSpec and the color can be found in model's metadata. The model
   * will choose the most likely category and if none of the categories reach
   * the confidence threshold, the pixel will be marked as background.
   * </pre>
   *
   * <code>string category_mask = 1;</code>
   * @return The bytes for categoryMask.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCategoryMaskBytes() {
    java.lang.Object ref = categoryMask_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      categoryMask_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIDENCE_MASK_FIELD_NUMBER = 2;
  private volatile java.lang.Object confidenceMask_;
  /**
   * <pre>
   * A one channel image which is encoded as an 8bit lossless PNG. The size of
   * the image will be the same as the original image. For a specific pixel,
   * darker color means less confidence in correctness of the cateogry in the
   * categoryMask for the corresponding pixel. Black means no confidence and
   * white means complete confidence.
   * </pre>
   *
   * <code>string confidence_mask = 2;</code>
   * @return The confidenceMask.
   */
  @java.lang.Override
  public java.lang.String getConfidenceMask() {
    java.lang.Object ref = confidenceMask_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      confidenceMask_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A one channel image which is encoded as an 8bit lossless PNG. The size of
   * the image will be the same as the original image. For a specific pixel,
   * darker color means less confidence in correctness of the cateogry in the
   * categoryMask for the corresponding pixel. Black means no confidence and
   * white means complete confidence.
   * </pre>
   *
   * <code>string confidence_mask = 2;</code>
   * @return The bytes for confidenceMask.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConfidenceMaskBytes() {
    java.lang.Object ref = confidenceMask_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      confidenceMask_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(categoryMask_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, categoryMask_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(confidenceMask_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, confidenceMask_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(categoryMask_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, categoryMask_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(confidenceMask_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, confidenceMask_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult other = (com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult) obj;

    if (!getCategoryMask()
        .equals(other.getCategoryMask())) return false;
    if (!getConfidenceMask()
        .equals(other.getConfidenceMask())) return false;
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
    hash = (37 * hash) + CATEGORY_MASK_FIELD_NUMBER;
    hash = (53 * hash) + getCategoryMask().hashCode();
    hash = (37 * hash) + CONFIDENCE_MASK_FIELD_NUMBER;
    hash = (53 * hash) + getConfidenceMask().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult prototype) {
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
   * Prediction output format for Image Segmentation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult)
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult.class, com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult.newBuilder()
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
      categoryMask_ = "";

      confidenceMask_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult build() {
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult result = new com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult(this);
      result.categoryMask_ = categoryMask_;
      result.confidenceMask_ = confidenceMask_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult other) {
      if (other == com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult.getDefaultInstance()) return this;
      if (!other.getCategoryMask().isEmpty()) {
        categoryMask_ = other.categoryMask_;
        onChanged();
      }
      if (!other.getConfidenceMask().isEmpty()) {
        confidenceMask_ = other.confidenceMask_;
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
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object categoryMask_ = "";
    /**
     * <pre>
     * A PNG image where each pixel in the mask represents the category in which
     * the pixel in the original image was predicted to belong to. The size of
     * this image will be the same as the original image. The mapping between the
     * AnntoationSpec and the color can be found in model's metadata. The model
     * will choose the most likely category and if none of the categories reach
     * the confidence threshold, the pixel will be marked as background.
     * </pre>
     *
     * <code>string category_mask = 1;</code>
     * @return The categoryMask.
     */
    public java.lang.String getCategoryMask() {
      java.lang.Object ref = categoryMask_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        categoryMask_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A PNG image where each pixel in the mask represents the category in which
     * the pixel in the original image was predicted to belong to. The size of
     * this image will be the same as the original image. The mapping between the
     * AnntoationSpec and the color can be found in model's metadata. The model
     * will choose the most likely category and if none of the categories reach
     * the confidence threshold, the pixel will be marked as background.
     * </pre>
     *
     * <code>string category_mask = 1;</code>
     * @return The bytes for categoryMask.
     */
    public com.google.protobuf.ByteString
        getCategoryMaskBytes() {
      java.lang.Object ref = categoryMask_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        categoryMask_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A PNG image where each pixel in the mask represents the category in which
     * the pixel in the original image was predicted to belong to. The size of
     * this image will be the same as the original image. The mapping between the
     * AnntoationSpec and the color can be found in model's metadata. The model
     * will choose the most likely category and if none of the categories reach
     * the confidence threshold, the pixel will be marked as background.
     * </pre>
     *
     * <code>string category_mask = 1;</code>
     * @param value The categoryMask to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryMask(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      categoryMask_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A PNG image where each pixel in the mask represents the category in which
     * the pixel in the original image was predicted to belong to. The size of
     * this image will be the same as the original image. The mapping between the
     * AnntoationSpec and the color can be found in model's metadata. The model
     * will choose the most likely category and if none of the categories reach
     * the confidence threshold, the pixel will be marked as background.
     * </pre>
     *
     * <code>string category_mask = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategoryMask() {
      
      categoryMask_ = getDefaultInstance().getCategoryMask();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A PNG image where each pixel in the mask represents the category in which
     * the pixel in the original image was predicted to belong to. The size of
     * this image will be the same as the original image. The mapping between the
     * AnntoationSpec and the color can be found in model's metadata. The model
     * will choose the most likely category and if none of the categories reach
     * the confidence threshold, the pixel will be marked as background.
     * </pre>
     *
     * <code>string category_mask = 1;</code>
     * @param value The bytes for categoryMask to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryMaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      categoryMask_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object confidenceMask_ = "";
    /**
     * <pre>
     * A one channel image which is encoded as an 8bit lossless PNG. The size of
     * the image will be the same as the original image. For a specific pixel,
     * darker color means less confidence in correctness of the cateogry in the
     * categoryMask for the corresponding pixel. Black means no confidence and
     * white means complete confidence.
     * </pre>
     *
     * <code>string confidence_mask = 2;</code>
     * @return The confidenceMask.
     */
    public java.lang.String getConfidenceMask() {
      java.lang.Object ref = confidenceMask_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        confidenceMask_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A one channel image which is encoded as an 8bit lossless PNG. The size of
     * the image will be the same as the original image. For a specific pixel,
     * darker color means less confidence in correctness of the cateogry in the
     * categoryMask for the corresponding pixel. Black means no confidence and
     * white means complete confidence.
     * </pre>
     *
     * <code>string confidence_mask = 2;</code>
     * @return The bytes for confidenceMask.
     */
    public com.google.protobuf.ByteString
        getConfidenceMaskBytes() {
      java.lang.Object ref = confidenceMask_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        confidenceMask_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A one channel image which is encoded as an 8bit lossless PNG. The size of
     * the image will be the same as the original image. For a specific pixel,
     * darker color means less confidence in correctness of the cateogry in the
     * categoryMask for the corresponding pixel. Black means no confidence and
     * white means complete confidence.
     * </pre>
     *
     * <code>string confidence_mask = 2;</code>
     * @param value The confidenceMask to set.
     * @return This builder for chaining.
     */
    public Builder setConfidenceMask(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      confidenceMask_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A one channel image which is encoded as an 8bit lossless PNG. The size of
     * the image will be the same as the original image. For a specific pixel,
     * darker color means less confidence in correctness of the cateogry in the
     * categoryMask for the corresponding pixel. Black means no confidence and
     * white means complete confidence.
     * </pre>
     *
     * <code>string confidence_mask = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidenceMask() {
      
      confidenceMask_ = getDefaultInstance().getConfidenceMask();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A one channel image which is encoded as an 8bit lossless PNG. The size of
     * the image will be the same as the original image. For a specific pixel,
     * darker color means less confidence in correctness of the cateogry in the
     * categoryMask for the corresponding pixel. Black means no confidence and
     * white means complete confidence.
     * </pre>
     *
     * <code>string confidence_mask = 2;</code>
     * @param value The bytes for confidenceMask to set.
     * @return This builder for chaining.
     */
    public Builder setConfidenceMaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      confidenceMask_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult)
  private static final com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageSegmentationPredictionResult>
      PARSER = new com.google.protobuf.AbstractParser<ImageSegmentationPredictionResult>() {
    @java.lang.Override
    public ImageSegmentationPredictionResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImageSegmentationPredictionResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImageSegmentationPredictionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageSegmentationPredictionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

