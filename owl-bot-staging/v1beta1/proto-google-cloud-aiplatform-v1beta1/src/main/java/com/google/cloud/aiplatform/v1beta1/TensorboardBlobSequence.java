// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/tensorboard_data.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * One point viewable on a blob metric plot, but mostly just a wrapper message
 * to work around repeated fields can't be used directly within `oneof` fields.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.TensorboardBlobSequence}
 */
public final class TensorboardBlobSequence extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.TensorboardBlobSequence)
    TensorboardBlobSequenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TensorboardBlobSequence.newBuilder() to construct.
  private TensorboardBlobSequence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TensorboardBlobSequence() {
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TensorboardBlobSequence();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardBlobSequence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardBlobSequence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence.class, com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardBlob> values_;
  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardBlob> getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TensorboardBlobOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardBlob getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardBlobOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
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
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(1, values_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, values_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence other = (com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence) obj;

    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence prototype) {
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
   * One point viewable on a blob metric plot, but mostly just a wrapper message
   * to work around repeated fields can't be used directly within `oneof` fields.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.TensorboardBlobSequence}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.TensorboardBlobSequence)
      com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardBlobSequence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardBlobSequence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence.class, com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
      } else {
        values_ = null;
        valuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardDataProto.internal_static_google_cloud_aiplatform_v1beta1_TensorboardBlobSequence_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence build() {
      com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence buildPartial() {
      com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence result = new com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence result) {
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence other) {
      if (other == com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence.getDefaultInstance()) return this;
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
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
            case 10: {
              com.google.cloud.aiplatform.v1beta1.TensorboardBlob m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.TensorboardBlob.parser(),
                      extensionRegistry);
              if (valuesBuilder_ == null) {
                ensureValuesIsMutable();
                values_.add(m);
              } else {
                valuesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardBlob> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.TensorboardBlob>(values_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.TensorboardBlob, com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder, com.google.cloud.aiplatform.v1beta1.TensorboardBlobOrBuilder> valuesBuilder_;

    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardBlob> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardBlob getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public Builder setValues(
        int index, com.google.cloud.aiplatform.v1beta1.TensorboardBlob value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public Builder setValues(
        int index, com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public Builder addValues(com.google.cloud.aiplatform.v1beta1.TensorboardBlob value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public Builder addValues(
        int index, com.google.cloud.aiplatform.v1beta1.TensorboardBlob value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public Builder addValues(
        com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public Builder addValues(
        int index, com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.TensorboardBlob> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardBlobOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TensorboardBlobOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1beta1.TensorboardBlob.getDefaultInstance());
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1beta1.TensorboardBlob.getDefaultInstance());
    }
    /**
     * <pre>
     * List of blobs contained within the sequence.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardBlob values = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.TensorboardBlob, com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder, com.google.cloud.aiplatform.v1beta1.TensorboardBlobOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.TensorboardBlob, com.google.cloud.aiplatform.v1beta1.TensorboardBlob.Builder, com.google.cloud.aiplatform.v1beta1.TensorboardBlobOrBuilder>(
                values_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.TensorboardBlobSequence)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.TensorboardBlobSequence)
  private static final com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence();
  }

  public static com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TensorboardBlobSequence>
      PARSER = new com.google.protobuf.AbstractParser<TensorboardBlobSequence>() {
    @java.lang.Override
    public TensorboardBlobSequence parsePartialFrom(
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

  public static com.google.protobuf.Parser<TensorboardBlobSequence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TensorboardBlobSequence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardBlobSequence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

