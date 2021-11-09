// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/endpoint.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * PrivateEndpoints is used to provide paths for users to send
 * requests via private services access.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.PrivateEndpoints}
 */
public final class PrivateEndpoints extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.PrivateEndpoints)
    PrivateEndpointsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrivateEndpoints.newBuilder() to construct.
  private PrivateEndpoints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrivateEndpoints() {
    predictHttpUri_ = "";
    explainHttpUri_ = "";
    healthHttpUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrivateEndpoints();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PrivateEndpoints(
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

            predictHttpUri_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            explainHttpUri_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            healthHttpUri_ = s;
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
    return com.google.cloud.aiplatform.v1beta1.EndpointProto.internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EndpointProto.internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.PrivateEndpoints.class, com.google.cloud.aiplatform.v1beta1.PrivateEndpoints.Builder.class);
  }

  public static final int PREDICT_HTTP_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object predictHttpUri_;
  /**
   * <pre>
   * Output only. Http(s) path to send prediction requests.
   * </pre>
   *
   * <code>string predict_http_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The predictHttpUri.
   */
  @java.lang.Override
  public java.lang.String getPredictHttpUri() {
    java.lang.Object ref = predictHttpUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      predictHttpUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Http(s) path to send prediction requests.
   * </pre>
   *
   * <code>string predict_http_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for predictHttpUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPredictHttpUriBytes() {
    java.lang.Object ref = predictHttpUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      predictHttpUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPLAIN_HTTP_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object explainHttpUri_;
  /**
   * <pre>
   * Output only. Http(s) path to send explain requests.
   * </pre>
   *
   * <code>string explain_http_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The explainHttpUri.
   */
  @java.lang.Override
  public java.lang.String getExplainHttpUri() {
    java.lang.Object ref = explainHttpUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      explainHttpUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Http(s) path to send explain requests.
   * </pre>
   *
   * <code>string explain_http_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for explainHttpUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExplainHttpUriBytes() {
    java.lang.Object ref = explainHttpUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      explainHttpUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEALTH_HTTP_URI_FIELD_NUMBER = 3;
  private volatile java.lang.Object healthHttpUri_;
  /**
   * <pre>
   * Output only. Http(s) path to send health check requests.
   * </pre>
   *
   * <code>string health_http_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The healthHttpUri.
   */
  @java.lang.Override
  public java.lang.String getHealthHttpUri() {
    java.lang.Object ref = healthHttpUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      healthHttpUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Http(s) path to send health check requests.
   * </pre>
   *
   * <code>string health_http_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for healthHttpUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHealthHttpUriBytes() {
    java.lang.Object ref = healthHttpUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      healthHttpUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(predictHttpUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, predictHttpUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(explainHttpUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, explainHttpUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(healthHttpUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, healthHttpUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(predictHttpUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, predictHttpUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(explainHttpUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, explainHttpUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(healthHttpUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, healthHttpUri_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.PrivateEndpoints)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.PrivateEndpoints other = (com.google.cloud.aiplatform.v1beta1.PrivateEndpoints) obj;

    if (!getPredictHttpUri()
        .equals(other.getPredictHttpUri())) return false;
    if (!getExplainHttpUri()
        .equals(other.getExplainHttpUri())) return false;
    if (!getHealthHttpUri()
        .equals(other.getHealthHttpUri())) return false;
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
    hash = (37 * hash) + PREDICT_HTTP_URI_FIELD_NUMBER;
    hash = (53 * hash) + getPredictHttpUri().hashCode();
    hash = (37 * hash) + EXPLAIN_HTTP_URI_FIELD_NUMBER;
    hash = (53 * hash) + getExplainHttpUri().hashCode();
    hash = (37 * hash) + HEALTH_HTTP_URI_FIELD_NUMBER;
    hash = (53 * hash) + getHealthHttpUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.PrivateEndpoints prototype) {
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
   * PrivateEndpoints is used to provide paths for users to send
   * requests via private services access.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.PrivateEndpoints}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.PrivateEndpoints)
      com.google.cloud.aiplatform.v1beta1.PrivateEndpointsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EndpointProto.internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EndpointProto.internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.PrivateEndpoints.class, com.google.cloud.aiplatform.v1beta1.PrivateEndpoints.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.PrivateEndpoints.newBuilder()
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
      predictHttpUri_ = "";

      explainHttpUri_ = "";

      healthHttpUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EndpointProto.internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PrivateEndpoints getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.PrivateEndpoints.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PrivateEndpoints build() {
      com.google.cloud.aiplatform.v1beta1.PrivateEndpoints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PrivateEndpoints buildPartial() {
      com.google.cloud.aiplatform.v1beta1.PrivateEndpoints result = new com.google.cloud.aiplatform.v1beta1.PrivateEndpoints(this);
      result.predictHttpUri_ = predictHttpUri_;
      result.explainHttpUri_ = explainHttpUri_;
      result.healthHttpUri_ = healthHttpUri_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.PrivateEndpoints) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.PrivateEndpoints)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.PrivateEndpoints other) {
      if (other == com.google.cloud.aiplatform.v1beta1.PrivateEndpoints.getDefaultInstance()) return this;
      if (!other.getPredictHttpUri().isEmpty()) {
        predictHttpUri_ = other.predictHttpUri_;
        onChanged();
      }
      if (!other.getExplainHttpUri().isEmpty()) {
        explainHttpUri_ = other.explainHttpUri_;
        onChanged();
      }
      if (!other.getHealthHttpUri().isEmpty()) {
        healthHttpUri_ = other.healthHttpUri_;
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
      com.google.cloud.aiplatform.v1beta1.PrivateEndpoints parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.PrivateEndpoints) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object predictHttpUri_ = "";
    /**
     * <pre>
     * Output only. Http(s) path to send prediction requests.
     * </pre>
     *
     * <code>string predict_http_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The predictHttpUri.
     */
    public java.lang.String getPredictHttpUri() {
      java.lang.Object ref = predictHttpUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        predictHttpUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Http(s) path to send prediction requests.
     * </pre>
     *
     * <code>string predict_http_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for predictHttpUri.
     */
    public com.google.protobuf.ByteString
        getPredictHttpUriBytes() {
      java.lang.Object ref = predictHttpUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        predictHttpUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Http(s) path to send prediction requests.
     * </pre>
     *
     * <code>string predict_http_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The predictHttpUri to set.
     * @return This builder for chaining.
     */
    public Builder setPredictHttpUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      predictHttpUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Http(s) path to send prediction requests.
     * </pre>
     *
     * <code>string predict_http_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearPredictHttpUri() {
      
      predictHttpUri_ = getDefaultInstance().getPredictHttpUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Http(s) path to send prediction requests.
     * </pre>
     *
     * <code>string predict_http_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for predictHttpUri to set.
     * @return This builder for chaining.
     */
    public Builder setPredictHttpUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      predictHttpUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object explainHttpUri_ = "";
    /**
     * <pre>
     * Output only. Http(s) path to send explain requests.
     * </pre>
     *
     * <code>string explain_http_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The explainHttpUri.
     */
    public java.lang.String getExplainHttpUri() {
      java.lang.Object ref = explainHttpUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        explainHttpUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Http(s) path to send explain requests.
     * </pre>
     *
     * <code>string explain_http_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for explainHttpUri.
     */
    public com.google.protobuf.ByteString
        getExplainHttpUriBytes() {
      java.lang.Object ref = explainHttpUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        explainHttpUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Http(s) path to send explain requests.
     * </pre>
     *
     * <code>string explain_http_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The explainHttpUri to set.
     * @return This builder for chaining.
     */
    public Builder setExplainHttpUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      explainHttpUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Http(s) path to send explain requests.
     * </pre>
     *
     * <code>string explain_http_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearExplainHttpUri() {
      
      explainHttpUri_ = getDefaultInstance().getExplainHttpUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Http(s) path to send explain requests.
     * </pre>
     *
     * <code>string explain_http_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for explainHttpUri to set.
     * @return This builder for chaining.
     */
    public Builder setExplainHttpUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      explainHttpUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object healthHttpUri_ = "";
    /**
     * <pre>
     * Output only. Http(s) path to send health check requests.
     * </pre>
     *
     * <code>string health_http_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The healthHttpUri.
     */
    public java.lang.String getHealthHttpUri() {
      java.lang.Object ref = healthHttpUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        healthHttpUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Http(s) path to send health check requests.
     * </pre>
     *
     * <code>string health_http_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for healthHttpUri.
     */
    public com.google.protobuf.ByteString
        getHealthHttpUriBytes() {
      java.lang.Object ref = healthHttpUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        healthHttpUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Http(s) path to send health check requests.
     * </pre>
     *
     * <code>string health_http_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The healthHttpUri to set.
     * @return This builder for chaining.
     */
    public Builder setHealthHttpUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      healthHttpUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Http(s) path to send health check requests.
     * </pre>
     *
     * <code>string health_http_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearHealthHttpUri() {
      
      healthHttpUri_ = getDefaultInstance().getHealthHttpUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Http(s) path to send health check requests.
     * </pre>
     *
     * <code>string health_http_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for healthHttpUri to set.
     * @return This builder for chaining.
     */
    public Builder setHealthHttpUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      healthHttpUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.PrivateEndpoints)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.PrivateEndpoints)
  private static final com.google.cloud.aiplatform.v1beta1.PrivateEndpoints DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.PrivateEndpoints();
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateEndpoints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrivateEndpoints>
      PARSER = new com.google.protobuf.AbstractParser<PrivateEndpoints>() {
    @java.lang.Override
    public PrivateEndpoints parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PrivateEndpoints(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrivateEndpoints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrivateEndpoints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PrivateEndpoints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

