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
// source: google/cloud/aiplatform/v1beta1/types.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * A list of string values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.StringArray}
 */
public final class StringArray extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.StringArray)
    StringArrayOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StringArray.newBuilder() to construct.
  private StringArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StringArray() {
    values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StringArray();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StringArray(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                values_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              values_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        values_ = values_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TypesProto
        .internal_static_google_cloud_aiplatform_v1beta1_StringArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TypesProto
        .internal_static_google_cloud_aiplatform_v1beta1_StringArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.StringArray.class,
            com.google.cloud.aiplatform.v1beta1.StringArray.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList values_;
  /**
   *
   *
   * <pre>
   * A list of string values.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @return A list containing the values.
   */
  public com.google.protobuf.ProtocolStringList getValuesList() {
    return values_;
  }
  /**
   *
   *
   * <pre>
   * A list of string values.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of string values.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public java.lang.String getValues(int index) {
    return values_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of string values.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  public com.google.protobuf.ByteString getValuesBytes(int index) {
    return values_.getByteString(index);
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
    for (int i = 0; i < values_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, values_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += computeStringSizeNoTag(values_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValuesList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.StringArray)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.StringArray other =
        (com.google.cloud.aiplatform.v1beta1.StringArray) obj;

    if (!getValuesList().equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.StringArray prototype) {
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
   * A list of string values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.StringArray}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.StringArray)
      com.google.cloud.aiplatform.v1beta1.StringArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TypesProto
          .internal_static_google_cloud_aiplatform_v1beta1_StringArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TypesProto
          .internal_static_google_cloud_aiplatform_v1beta1_StringArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.StringArray.class,
              com.google.cloud.aiplatform.v1beta1.StringArray.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.StringArray.newBuilder()
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
      values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TypesProto
          .internal_static_google_cloud_aiplatform_v1beta1_StringArray_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.StringArray getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.StringArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.StringArray build() {
      com.google.cloud.aiplatform.v1beta1.StringArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.StringArray buildPartial() {
      com.google.cloud.aiplatform.v1beta1.StringArray result =
          new com.google.cloud.aiplatform.v1beta1.StringArray(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        values_ = values_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.values_ = values_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.StringArray) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.StringArray) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.StringArray other) {
      if (other == com.google.cloud.aiplatform.v1beta1.StringArray.getDefaultInstance())
        return this;
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
      com.google.cloud.aiplatform.v1beta1.StringArray parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.StringArray) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList values_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new com.google.protobuf.LazyStringArrayList(values_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * A list of string values.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @return A list containing the values.
     */
    public com.google.protobuf.ProtocolStringList getValuesList() {
      return values_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * A list of string values.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of string values.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public java.lang.String getValues(int index) {
      return values_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A list of string values.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    public com.google.protobuf.ByteString getValuesBytes(int index) {
      return values_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * A list of string values.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValuesIsMutable();
      values_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of string values.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValuesIsMutable();
      values_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of string values.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(java.lang.Iterable<java.lang.String> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, values_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of string values.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of string values.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param value The bytes of the values to add.
     * @return This builder for chaining.
     */
    public Builder addValuesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureValuesIsMutable();
      values_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.StringArray)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.StringArray)
  private static final com.google.cloud.aiplatform.v1beta1.StringArray DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.StringArray();
  }

  public static com.google.cloud.aiplatform.v1beta1.StringArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StringArray> PARSER =
      new com.google.protobuf.AbstractParser<StringArray>() {
        @java.lang.Override
        public StringArray parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StringArray(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StringArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StringArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.StringArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
