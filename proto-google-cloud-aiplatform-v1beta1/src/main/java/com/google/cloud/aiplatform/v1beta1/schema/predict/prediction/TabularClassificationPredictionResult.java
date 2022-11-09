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
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/tabular_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

/**
 *
 *
 * <pre>
 * Prediction output format for Tabular Classification.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.aiplatform.v1beta1.schema.predict.prediction.TabularClassificationPredictionResult}
 */
public final class TabularClassificationPredictionResult
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TabularClassificationPredictionResult)
    TabularClassificationPredictionResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TabularClassificationPredictionResult.newBuilder() to construct.
  private TabularClassificationPredictionResult(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TabularClassificationPredictionResult() {
    classes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    scores_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TabularClassificationPredictionResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
        .TabularClassificationPredictionResultProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
        .TabularClassificationPredictionResultProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
                .TabularClassificationPredictionResult.class,
            com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
                .TabularClassificationPredictionResult.Builder.class);
  }

  public static final int CLASSES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList classes_;
  /**
   *
   *
   * <pre>
   * The name of the classes being classified, contains all possible values of
   * the target column.
   * </pre>
   *
   * <code>repeated string classes = 1;</code>
   *
   * @return A list containing the classes.
   */
  public com.google.protobuf.ProtocolStringList getClassesList() {
    return classes_;
  }
  /**
   *
   *
   * <pre>
   * The name of the classes being classified, contains all possible values of
   * the target column.
   * </pre>
   *
   * <code>repeated string classes = 1;</code>
   *
   * @return The count of classes.
   */
  public int getClassesCount() {
    return classes_.size();
  }
  /**
   *
   *
   * <pre>
   * The name of the classes being classified, contains all possible values of
   * the target column.
   * </pre>
   *
   * <code>repeated string classes = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The classes at the given index.
   */
  public java.lang.String getClasses(int index) {
    return classes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The name of the classes being classified, contains all possible values of
   * the target column.
   * </pre>
   *
   * <code>repeated string classes = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the classes at the given index.
   */
  public com.google.protobuf.ByteString getClassesBytes(int index) {
    return classes_.getByteString(index);
  }

  public static final int SCORES_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.FloatList scores_;
  /**
   *
   *
   * <pre>
   * The model's confidence in each class being correct, higher
   * value means higher confidence. The N-th score corresponds to
   * the N-th class in classes.
   * </pre>
   *
   * <code>repeated float scores = 2;</code>
   *
   * @return A list containing the scores.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float> getScoresList() {
    return scores_;
  }
  /**
   *
   *
   * <pre>
   * The model's confidence in each class being correct, higher
   * value means higher confidence. The N-th score corresponds to
   * the N-th class in classes.
   * </pre>
   *
   * <code>repeated float scores = 2;</code>
   *
   * @return The count of scores.
   */
  public int getScoresCount() {
    return scores_.size();
  }
  /**
   *
   *
   * <pre>
   * The model's confidence in each class being correct, higher
   * value means higher confidence. The N-th score corresponds to
   * the N-th class in classes.
   * </pre>
   *
   * <code>repeated float scores = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The scores at the given index.
   */
  public float getScores(int index) {
    return scores_.getFloat(index);
  }

  private int scoresMemoizedSerializedSize = -1;

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
    getSerializedSize();
    for (int i = 0; i < classes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, classes_.getRaw(i));
    }
    if (getScoresList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(scoresMemoizedSerializedSize);
    }
    for (int i = 0; i < scores_.size(); i++) {
      output.writeFloatNoTag(scores_.getFloat(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < classes_.size(); i++) {
        dataSize += computeStringSizeNoTag(classes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getClassesList().size();
    }
    {
      int dataSize = 0;
      dataSize = 4 * getScoresList().size();
      size += dataSize;
      if (!getScoresList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      scoresMemoizedSerializedSize = dataSize;
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
    if (!(obj
        instanceof
        com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
            .TabularClassificationPredictionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
            .TabularClassificationPredictionResult
        other =
            (com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
                    .TabularClassificationPredictionResult)
                obj;

    if (!getClassesList().equals(other.getClassesList())) return false;
    if (!getScoresList().equals(other.getScoresList())) return false;
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
    if (getClassesCount() > 0) {
      hash = (37 * hash) + CLASSES_FIELD_NUMBER;
      hash = (53 * hash) + getClassesList().hashCode();
    }
    if (getScoresCount() > 0) {
      hash = (37 * hash) + SCORES_FIELD_NUMBER;
      hash = (53 * hash) + getScoresList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
              .TabularClassificationPredictionResult
          prototype) {
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
   * Prediction output format for Tabular Classification.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.aiplatform.v1beta1.schema.predict.prediction.TabularClassificationPredictionResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TabularClassificationPredictionResult)
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResultProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResultProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
                  .TabularClassificationPredictionResult.class,
              com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
                  .TabularClassificationPredictionResult.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TabularClassificationPredictionResult.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      classes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      scores_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResultProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
            .TabularClassificationPredictionResult
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
            .TabularClassificationPredictionResult
        build() {
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
              .TabularClassificationPredictionResult
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
            .TabularClassificationPredictionResult
        buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
              .TabularClassificationPredictionResult
          result =
              new com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
                  .TabularClassificationPredictionResult(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        classes_ = classes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.classes_ = classes_;
      if (((bitField0_ & 0x00000002) != 0)) {
        scores_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.scores_ = scores_;
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
          instanceof
          com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
              .TabularClassificationPredictionResult) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
                    .TabularClassificationPredictionResult)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
                .TabularClassificationPredictionResult
            other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
              .TabularClassificationPredictionResult.getDefaultInstance()) return this;
      if (!other.classes_.isEmpty()) {
        if (classes_.isEmpty()) {
          classes_ = other.classes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureClassesIsMutable();
          classes_.addAll(other.classes_);
        }
        onChanged();
      }
      if (!other.scores_.isEmpty()) {
        if (scores_.isEmpty()) {
          scores_ = other.scores_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureScoresIsMutable();
          scores_.addAll(other.scores_);
        }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureClassesIsMutable();
                classes_.add(s);
                break;
              } // case 10
            case 21:
              {
                float v = input.readFloat();
                ensureScoresIsMutable();
                scores_.addFloat(v);
                break;
              } // case 21
            case 18:
              {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureScoresIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  scores_.addFloat(input.readFloat());
                }
                input.popLimit(limit);
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

    private int bitField0_;

    private com.google.protobuf.LazyStringList classes_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureClassesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        classes_ = new com.google.protobuf.LazyStringArrayList(classes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the classes being classified, contains all possible values of
     * the target column.
     * </pre>
     *
     * <code>repeated string classes = 1;</code>
     *
     * @return A list containing the classes.
     */
    public com.google.protobuf.ProtocolStringList getClassesList() {
      return classes_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The name of the classes being classified, contains all possible values of
     * the target column.
     * </pre>
     *
     * <code>repeated string classes = 1;</code>
     *
     * @return The count of classes.
     */
    public int getClassesCount() {
      return classes_.size();
    }
    /**
     *
     *
     * <pre>
     * The name of the classes being classified, contains all possible values of
     * the target column.
     * </pre>
     *
     * <code>repeated string classes = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The classes at the given index.
     */
    public java.lang.String getClasses(int index) {
      return classes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The name of the classes being classified, contains all possible values of
     * the target column.
     * </pre>
     *
     * <code>repeated string classes = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the classes at the given index.
     */
    public com.google.protobuf.ByteString getClassesBytes(int index) {
      return classes_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The name of the classes being classified, contains all possible values of
     * the target column.
     * </pre>
     *
     * <code>repeated string classes = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The classes to set.
     * @return This builder for chaining.
     */
    public Builder setClasses(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureClassesIsMutable();
      classes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the classes being classified, contains all possible values of
     * the target column.
     * </pre>
     *
     * <code>repeated string classes = 1;</code>
     *
     * @param value The classes to add.
     * @return This builder for chaining.
     */
    public Builder addClasses(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureClassesIsMutable();
      classes_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the classes being classified, contains all possible values of
     * the target column.
     * </pre>
     *
     * <code>repeated string classes = 1;</code>
     *
     * @param values The classes to add.
     * @return This builder for chaining.
     */
    public Builder addAllClasses(java.lang.Iterable<java.lang.String> values) {
      ensureClassesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, classes_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the classes being classified, contains all possible values of
     * the target column.
     * </pre>
     *
     * <code>repeated string classes = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClasses() {
      classes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the classes being classified, contains all possible values of
     * the target column.
     * </pre>
     *
     * <code>repeated string classes = 1;</code>
     *
     * @param value The bytes of the classes to add.
     * @return This builder for chaining.
     */
    public Builder addClassesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureClassesIsMutable();
      classes_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList scores_ = emptyFloatList();

    private void ensureScoresIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        scores_ = mutableCopy(scores_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * The model's confidence in each class being correct, higher
     * value means higher confidence. The N-th score corresponds to
     * the N-th class in classes.
     * </pre>
     *
     * <code>repeated float scores = 2;</code>
     *
     * @return A list containing the scores.
     */
    public java.util.List<java.lang.Float> getScoresList() {
      return ((bitField0_ & 0x00000002) != 0)
          ? java.util.Collections.unmodifiableList(scores_)
          : scores_;
    }
    /**
     *
     *
     * <pre>
     * The model's confidence in each class being correct, higher
     * value means higher confidence. The N-th score corresponds to
     * the N-th class in classes.
     * </pre>
     *
     * <code>repeated float scores = 2;</code>
     *
     * @return The count of scores.
     */
    public int getScoresCount() {
      return scores_.size();
    }
    /**
     *
     *
     * <pre>
     * The model's confidence in each class being correct, higher
     * value means higher confidence. The N-th score corresponds to
     * the N-th class in classes.
     * </pre>
     *
     * <code>repeated float scores = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The scores at the given index.
     */
    public float getScores(int index) {
      return scores_.getFloat(index);
    }
    /**
     *
     *
     * <pre>
     * The model's confidence in each class being correct, higher
     * value means higher confidence. The N-th score corresponds to
     * the N-th class in classes.
     * </pre>
     *
     * <code>repeated float scores = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The scores to set.
     * @return This builder for chaining.
     */
    public Builder setScores(int index, float value) {
      ensureScoresIsMutable();
      scores_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The model's confidence in each class being correct, higher
     * value means higher confidence. The N-th score corresponds to
     * the N-th class in classes.
     * </pre>
     *
     * <code>repeated float scores = 2;</code>
     *
     * @param value The scores to add.
     * @return This builder for chaining.
     */
    public Builder addScores(float value) {
      ensureScoresIsMutable();
      scores_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The model's confidence in each class being correct, higher
     * value means higher confidence. The N-th score corresponds to
     * the N-th class in classes.
     * </pre>
     *
     * <code>repeated float scores = 2;</code>
     *
     * @param values The scores to add.
     * @return This builder for chaining.
     */
    public Builder addAllScores(java.lang.Iterable<? extends java.lang.Float> values) {
      ensureScoresIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, scores_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The model's confidence in each class being correct, higher
     * value means higher confidence. The N-th score corresponds to
     * the N-th class in classes.
     * </pre>
     *
     * <code>repeated float scores = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScores() {
      scores_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TabularClassificationPredictionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TabularClassificationPredictionResult)
  private static final com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
            .TabularClassificationPredictionResult();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TabularClassificationPredictionResult> PARSER =
      new com.google.protobuf.AbstractParser<TabularClassificationPredictionResult>() {
        @java.lang.Override
        public TabularClassificationPredictionResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<TabularClassificationPredictionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TabularClassificationPredictionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction
          .TabularClassificationPredictionResult
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
