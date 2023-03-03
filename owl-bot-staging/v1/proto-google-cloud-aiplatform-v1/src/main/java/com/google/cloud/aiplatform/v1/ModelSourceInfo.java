// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Detail description of the source information of the model.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ModelSourceInfo}
 */
public final class ModelSourceInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ModelSourceInfo)
    ModelSourceInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModelSourceInfo.newBuilder() to construct.
  private ModelSourceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModelSourceInfo() {
    sourceType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModelSourceInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.ModelProto.internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ModelProto.internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ModelSourceInfo.class, com.google.cloud.aiplatform.v1.ModelSourceInfo.Builder.class);
  }

  /**
   * <pre>
   * Source of the model.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType}
   */
  public enum ModelSourceType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Should not be used.
     * </pre>
     *
     * <code>MODEL_SOURCE_TYPE_UNSPECIFIED = 0;</code>
     */
    MODEL_SOURCE_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * The Model is uploaded by automl training pipeline.
     * </pre>
     *
     * <code>AUTOML = 1;</code>
     */
    AUTOML(1),
    /**
     * <pre>
     * The Model is uploaded by user or custom training pipeline.
     * </pre>
     *
     * <code>CUSTOM = 2;</code>
     */
    CUSTOM(2),
    /**
     * <pre>
     * The Model is registered and sync'ed from BigQuery ML.
     * </pre>
     *
     * <code>BQML = 3;</code>
     */
    BQML(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Should not be used.
     * </pre>
     *
     * <code>MODEL_SOURCE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int MODEL_SOURCE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The Model is uploaded by automl training pipeline.
     * </pre>
     *
     * <code>AUTOML = 1;</code>
     */
    public static final int AUTOML_VALUE = 1;
    /**
     * <pre>
     * The Model is uploaded by user or custom training pipeline.
     * </pre>
     *
     * <code>CUSTOM = 2;</code>
     */
    public static final int CUSTOM_VALUE = 2;
    /**
     * <pre>
     * The Model is registered and sync'ed from BigQuery ML.
     * </pre>
     *
     * <code>BQML = 3;</code>
     */
    public static final int BQML_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ModelSourceType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ModelSourceType forNumber(int value) {
      switch (value) {
        case 0: return MODEL_SOURCE_TYPE_UNSPECIFIED;
        case 1: return AUTOML;
        case 2: return CUSTOM;
        case 3: return BQML;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ModelSourceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ModelSourceType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ModelSourceType>() {
            public ModelSourceType findValueByNumber(int number) {
              return ModelSourceType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelSourceInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final ModelSourceType[] VALUES = values();

    public static ModelSourceType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ModelSourceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType)
  }

  public static final int SOURCE_TYPE_FIELD_NUMBER = 1;
  private int sourceType_ = 0;
  /**
   * <pre>
   * Type of the model source.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType source_type = 1;</code>
   * @return The enum numeric value on the wire for sourceType.
   */
  @java.lang.Override public int getSourceTypeValue() {
    return sourceType_;
  }
  /**
   * <pre>
   * Type of the model source.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType source_type = 1;</code>
   * @return The sourceType.
   */
  @java.lang.Override public com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType getSourceType() {
    com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType result = com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType.forNumber(sourceType_);
    return result == null ? com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType.UNRECOGNIZED : result;
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
    if (sourceType_ != com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType.MODEL_SOURCE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, sourceType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceType_ != com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType.MODEL_SOURCE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, sourceType_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ModelSourceInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ModelSourceInfo other = (com.google.cloud.aiplatform.v1.ModelSourceInfo) obj;

    if (sourceType_ != other.sourceType_) return false;
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
    hash = (37 * hash) + SOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + sourceType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ModelSourceInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ModelSourceInfo prototype) {
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
   * Detail description of the source information of the model.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ModelSourceInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ModelSourceInfo)
      com.google.cloud.aiplatform.v1.ModelSourceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelProto.internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ModelProto.internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ModelSourceInfo.class, com.google.cloud.aiplatform.v1.ModelSourceInfo.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ModelSourceInfo.newBuilder()
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
      sourceType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ModelProto.internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelSourceInfo getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ModelSourceInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelSourceInfo build() {
      com.google.cloud.aiplatform.v1.ModelSourceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelSourceInfo buildPartial() {
      com.google.cloud.aiplatform.v1.ModelSourceInfo result = new com.google.cloud.aiplatform.v1.ModelSourceInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ModelSourceInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceType_ = sourceType_;
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1.ModelSourceInfo) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ModelSourceInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ModelSourceInfo other) {
      if (other == com.google.cloud.aiplatform.v1.ModelSourceInfo.getDefaultInstance()) return this;
      if (other.sourceType_ != 0) {
        setSourceTypeValue(other.getSourceTypeValue());
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
            case 8: {
              sourceType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int sourceType_ = 0;
    /**
     * <pre>
     * Type of the model source.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType source_type = 1;</code>
     * @return The enum numeric value on the wire for sourceType.
     */
    @java.lang.Override public int getSourceTypeValue() {
      return sourceType_;
    }
    /**
     * <pre>
     * Type of the model source.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType source_type = 1;</code>
     * @param value The enum numeric value on the wire for sourceType to set.
     * @return This builder for chaining.
     */
    public Builder setSourceTypeValue(int value) {
      sourceType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the model source.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType source_type = 1;</code>
     * @return The sourceType.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType getSourceType() {
      com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType result = com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType.forNumber(sourceType_);
      return result == null ? com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of the model source.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType source_type = 1;</code>
     * @param value The sourceType to set.
     * @return This builder for chaining.
     */
    public Builder setSourceType(com.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      sourceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the model source.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelSourceInfo.ModelSourceType source_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sourceType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ModelSourceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ModelSourceInfo)
  private static final com.google.cloud.aiplatform.v1.ModelSourceInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ModelSourceInfo();
  }

  public static com.google.cloud.aiplatform.v1.ModelSourceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelSourceInfo>
      PARSER = new com.google.protobuf.AbstractParser<ModelSourceInfo>() {
    @java.lang.Override
    public ModelSourceInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModelSourceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelSourceInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ModelSourceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

