// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_online_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Contains Feature values to be written for a specific entity.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload}
 */
public final class WriteFeatureValuesPayload extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload)
    WriteFeatureValuesPayloadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WriteFeatureValuesPayload.newBuilder() to construct.
  private WriteFeatureValuesPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WriteFeatureValuesPayload() {
    entityId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WriteFeatureValuesPayload();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreOnlineServiceProto.internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetFeatureValues();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreOnlineServiceProto.internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload.class, com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload.Builder.class);
  }

  public static final int ENTITY_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object entityId_;
  /**
   * <pre>
   * Required. The ID of the entity.
   * </pre>
   *
   * <code>string entity_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entityId.
   */
  @java.lang.Override
  public java.lang.String getEntityId() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the entity.
   * </pre>
   *
   * <code>string entity_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for entityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntityIdBytes() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEATURE_VALUES_FIELD_NUMBER = 2;
  private static final class FeatureValuesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue>newDefaultInstance(
                com.google.cloud.aiplatform.v1beta1.FeaturestoreOnlineServiceProto.internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_FeatureValuesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.cloud.aiplatform.v1beta1.FeatureValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> featureValues_;
  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue>
  internalGetFeatureValues() {
    if (featureValues_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FeatureValuesDefaultEntryHolder.defaultEntry);
    }
    return featureValues_;
  }

  public int getFeatureValuesCount() {
    return internalGetFeatureValues().getMap().size();
  }
  /**
   * <pre>
   * Required. Feature values to be written, mapping from Feature ID to value. Up to
   * 100,000 `feature_values` entries may be written across all payloads.  The
   * feature generation time, aligned by days, must be no older than five
   * years (1825 days) and no later than one year (366 days) in the future.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */

  @java.lang.Override
  public boolean containsFeatureValues(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetFeatureValues().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFeatureValuesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> getFeatureValues() {
    return getFeatureValuesMap();
  }
  /**
   * <pre>
   * Required. Feature values to be written, mapping from Feature ID to value. Up to
   * 100,000 `feature_values` entries may be written across all payloads.  The
   * feature generation time, aligned by days, must be no older than five
   * years (1825 days) and no later than one year (366 days) in the future.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> getFeatureValuesMap() {
    return internalGetFeatureValues().getMap();
  }
  /**
   * <pre>
   * Required. Feature values to be written, mapping from Feature ID to value. Up to
   * 100,000 `feature_values` entries may be written across all payloads.  The
   * feature generation time, aligned by days, must be no older than five
   * years (1825 days) and no later than one year (366 days) in the future.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override

  public com.google.cloud.aiplatform.v1beta1.FeatureValue getFeatureValuesOrDefault(
      java.lang.String key,
      com.google.cloud.aiplatform.v1beta1.FeatureValue defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> map =
        internalGetFeatureValues().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Required. Feature values to be written, mapping from Feature ID to value. Up to
   * 100,000 `feature_values` entries may be written across all payloads.  The
   * feature generation time, aligned by days, must be no older than five
   * years (1825 days) and no later than one year (366 days) in the future.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override

  public com.google.cloud.aiplatform.v1beta1.FeatureValue getFeatureValuesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> map =
        internalGetFeatureValues().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entityId_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetFeatureValues(),
        FeatureValuesDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entityId_);
    }
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> entry
         : internalGetFeatureValues().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue>
      featureValues__ = FeatureValuesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, featureValues__);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload other = (com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload) obj;

    if (!getEntityId()
        .equals(other.getEntityId())) return false;
    if (!internalGetFeatureValues().equals(
        other.internalGetFeatureValues())) return false;
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
    hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityId().hashCode();
    if (!internalGetFeatureValues().getMap().isEmpty()) {
      hash = (37 * hash) + FEATURE_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFeatureValues().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload prototype) {
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
   * Contains Feature values to be written for a specific entity.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload)
      com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreOnlineServiceProto.internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetFeatureValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableFeatureValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreOnlineServiceProto.internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload.class, com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      entityId_ = "";

      internalGetMutableFeatureValues().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreOnlineServiceProto.internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload build() {
      com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload buildPartial() {
      com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload result = new com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload(this);
      int from_bitField0_ = bitField0_;
      result.entityId_ = entityId_;
      result.featureValues_ = internalGetFeatureValues();
      result.featureValues_.makeImmutable();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload other) {
      if (other == com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload.getDefaultInstance()) return this;
      if (!other.getEntityId().isEmpty()) {
        entityId_ = other.entityId_;
        onChanged();
      }
      internalGetMutableFeatureValues().mergeFrom(
          other.internalGetFeatureValues());
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
              entityId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue>
              featureValues__ = input.readMessage(
                  FeatureValuesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableFeatureValues().getMutableMap().put(
                  featureValues__.getKey(), featureValues__.getValue());
              break;
            } // case 18
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

    private java.lang.Object entityId_ = "";
    /**
     * <pre>
     * Required. The ID of the entity.
     * </pre>
     *
     * <code>string entity_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The entityId.
     */
    public java.lang.String getEntityId() {
      java.lang.Object ref = entityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the entity.
     * </pre>
     *
     * <code>string entity_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for entityId.
     */
    public com.google.protobuf.ByteString
        getEntityIdBytes() {
      java.lang.Object ref = entityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the entity.
     * </pre>
     *
     * <code>string entity_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the entity.
     * </pre>
     *
     * <code>string entity_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityId() {
      
      entityId_ = getDefaultInstance().getEntityId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the entity.
     * </pre>
     *
     * <code>string entity_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entityId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> featureValues_;
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue>
    internalGetFeatureValues() {
      if (featureValues_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FeatureValuesDefaultEntryHolder.defaultEntry);
      }
      return featureValues_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue>
    internalGetMutableFeatureValues() {
      onChanged();;
      if (featureValues_ == null) {
        featureValues_ = com.google.protobuf.MapField.newMapField(
            FeatureValuesDefaultEntryHolder.defaultEntry);
      }
      if (!featureValues_.isMutable()) {
        featureValues_ = featureValues_.copy();
      }
      return featureValues_;
    }

    public int getFeatureValuesCount() {
      return internalGetFeatureValues().getMap().size();
    }
    /**
     * <pre>
     * Required. Feature values to be written, mapping from Feature ID to value. Up to
     * 100,000 `feature_values` entries may be written across all payloads.  The
     * feature generation time, aligned by days, must be no older than five
     * years (1825 days) and no later than one year (366 days) in the future.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */

    @java.lang.Override
    public boolean containsFeatureValues(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetFeatureValues().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFeatureValuesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> getFeatureValues() {
      return getFeatureValuesMap();
    }
    /**
     * <pre>
     * Required. Feature values to be written, mapping from Feature ID to value. Up to
     * 100,000 `feature_values` entries may be written across all payloads.  The
     * feature generation time, aligned by days, must be no older than five
     * years (1825 days) and no later than one year (366 days) in the future.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> getFeatureValuesMap() {
      return internalGetFeatureValues().getMap();
    }
    /**
     * <pre>
     * Required. Feature values to be written, mapping from Feature ID to value. Up to
     * 100,000 `feature_values` entries may be written across all payloads.  The
     * feature generation time, aligned by days, must be no older than five
     * years (1825 days) and no later than one year (366 days) in the future.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    @java.lang.Override

    public com.google.cloud.aiplatform.v1beta1.FeatureValue getFeatureValuesOrDefault(
        java.lang.String key,
        com.google.cloud.aiplatform.v1beta1.FeatureValue defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> map =
          internalGetFeatureValues().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Required. Feature values to be written, mapping from Feature ID to value. Up to
     * 100,000 `feature_values` entries may be written across all payloads.  The
     * feature generation time, aligned by days, must be no older than five
     * years (1825 days) and no later than one year (366 days) in the future.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    @java.lang.Override

    public com.google.cloud.aiplatform.v1beta1.FeatureValue getFeatureValuesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> map =
          internalGetFeatureValues().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFeatureValues() {
      internalGetMutableFeatureValues().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Required. Feature values to be written, mapping from Feature ID to value. Up to
     * 100,000 `feature_values` entries may be written across all payloads.  The
     * feature generation time, aligned by days, must be no older than five
     * years (1825 days) and no later than one year (366 days) in the future.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */

    public Builder removeFeatureValues(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableFeatureValues().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue>
    getMutableFeatureValues() {
      return internalGetMutableFeatureValues().getMutableMap();
    }
    /**
     * <pre>
     * Required. Feature values to be written, mapping from Feature ID to value. Up to
     * 100,000 `feature_values` entries may be written across all payloads.  The
     * feature generation time, aligned by days, must be no older than five
     * years (1825 days) and no later than one year (366 days) in the future.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder putFeatureValues(
        java.lang.String key,
        com.google.cloud.aiplatform.v1beta1.FeatureValue value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableFeatureValues().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Required. Feature values to be written, mapping from Feature ID to value. Up to
     * 100,000 `feature_values` entries may be written across all payloads.  The
     * feature generation time, aligned by days, must be no older than five
     * years (1825 days) and no later than one year (366 days) in the future.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */

    public Builder putAllFeatureValues(
        java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue> values) {
      internalGetMutableFeatureValues().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload)
  private static final com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload();
  }

  public static com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WriteFeatureValuesPayload>
      PARSER = new com.google.protobuf.AbstractParser<WriteFeatureValuesPayload>() {
    @java.lang.Override
    public WriteFeatureValuesPayload parsePartialFrom(
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

  public static com.google.protobuf.Parser<WriteFeatureValuesPayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WriteFeatureValuesPayload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

