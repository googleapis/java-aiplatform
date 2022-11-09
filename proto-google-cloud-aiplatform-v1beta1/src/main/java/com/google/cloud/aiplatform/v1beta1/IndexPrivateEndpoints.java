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
// source: google/cloud/aiplatform/v1beta1/index_endpoint.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * IndexPrivateEndpoints proto is used to provide paths for users to send
 * requests via private endpoints (e.g. private service access, private service
 * connect).
 * To send request via private service access, use match_grpc_address.
 * To send request via private service connect, use service_attachment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints}
 */
public final class IndexPrivateEndpoints extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints)
    IndexPrivateEndpointsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IndexPrivateEndpoints.newBuilder() to construct.
  private IndexPrivateEndpoints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IndexPrivateEndpoints() {
    matchGrpcAddress_ = "";
    serviceAttachment_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IndexPrivateEndpoints();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.IndexEndpointProto
        .internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.IndexEndpointProto
        .internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints.class,
            com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints.Builder.class);
  }

  public static final int MATCH_GRPC_ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object matchGrpcAddress_;
  /**
   *
   *
   * <pre>
   * Output only. The ip address used to send match gRPC requests.
   * </pre>
   *
   * <code>string match_grpc_address = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The matchGrpcAddress.
   */
  @java.lang.Override
  public java.lang.String getMatchGrpcAddress() {
    java.lang.Object ref = matchGrpcAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      matchGrpcAddress_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The ip address used to send match gRPC requests.
   * </pre>
   *
   * <code>string match_grpc_address = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for matchGrpcAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMatchGrpcAddressBytes() {
    java.lang.Object ref = matchGrpcAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      matchGrpcAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_ATTACHMENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object serviceAttachment_;
  /**
   *
   *
   * <pre>
   * Output only. The name of the service attachment resource. Populated if private service
   * connect is enabled.
   * </pre>
   *
   * <code>string service_attachment = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serviceAttachment.
   */
  @java.lang.Override
  public java.lang.String getServiceAttachment() {
    java.lang.Object ref = serviceAttachment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAttachment_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The name of the service attachment resource. Populated if private service
   * connect is enabled.
   * </pre>
   *
   * <code>string service_attachment = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serviceAttachment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceAttachmentBytes() {
    java.lang.Object ref = serviceAttachment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceAttachment_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(matchGrpcAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, matchGrpcAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAttachment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceAttachment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(matchGrpcAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, matchGrpcAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAttachment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceAttachment_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints other =
        (com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints) obj;

    if (!getMatchGrpcAddress().equals(other.getMatchGrpcAddress())) return false;
    if (!getServiceAttachment().equals(other.getServiceAttachment())) return false;
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
    hash = (37 * hash) + MATCH_GRPC_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getMatchGrpcAddress().hashCode();
    hash = (37 * hash) + SERVICE_ATTACHMENT_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAttachment().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints prototype) {
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
   * IndexPrivateEndpoints proto is used to provide paths for users to send
   * requests via private endpoints (e.g. private service access, private service
   * connect).
   * To send request via private service access, use match_grpc_address.
   * To send request via private service connect, use service_attachment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints)
      com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpointsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointProto
          .internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointProto
          .internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints.class,
              com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      matchGrpcAddress_ = "";

      serviceAttachment_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointProto
          .internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints build() {
      com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints buildPartial() {
      com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints result =
          new com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints(this);
      result.matchGrpcAddress_ = matchGrpcAddress_;
      result.serviceAttachment_ = serviceAttachment_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints other) {
      if (other == com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints.getDefaultInstance())
        return this;
      if (!other.getMatchGrpcAddress().isEmpty()) {
        matchGrpcAddress_ = other.matchGrpcAddress_;
        onChanged();
      }
      if (!other.getServiceAttachment().isEmpty()) {
        serviceAttachment_ = other.serviceAttachment_;
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
                matchGrpcAddress_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                serviceAttachment_ = input.readStringRequireUtf8();

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

    private java.lang.Object matchGrpcAddress_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The ip address used to send match gRPC requests.
     * </pre>
     *
     * <code>string match_grpc_address = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The matchGrpcAddress.
     */
    public java.lang.String getMatchGrpcAddress() {
      java.lang.Object ref = matchGrpcAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        matchGrpcAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The ip address used to send match gRPC requests.
     * </pre>
     *
     * <code>string match_grpc_address = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for matchGrpcAddress.
     */
    public com.google.protobuf.ByteString getMatchGrpcAddressBytes() {
      java.lang.Object ref = matchGrpcAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        matchGrpcAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The ip address used to send match gRPC requests.
     * </pre>
     *
     * <code>string match_grpc_address = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The matchGrpcAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMatchGrpcAddress(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      matchGrpcAddress_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The ip address used to send match gRPC requests.
     * </pre>
     *
     * <code>string match_grpc_address = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMatchGrpcAddress() {

      matchGrpcAddress_ = getDefaultInstance().getMatchGrpcAddress();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The ip address used to send match gRPC requests.
     * </pre>
     *
     * <code>string match_grpc_address = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for matchGrpcAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMatchGrpcAddressBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      matchGrpcAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serviceAttachment_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The name of the service attachment resource. Populated if private service
     * connect is enabled.
     * </pre>
     *
     * <code>string service_attachment = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The serviceAttachment.
     */
    public java.lang.String getServiceAttachment() {
      java.lang.Object ref = serviceAttachment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAttachment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the service attachment resource. Populated if private service
     * connect is enabled.
     * </pre>
     *
     * <code>string service_attachment = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for serviceAttachment.
     */
    public com.google.protobuf.ByteString getServiceAttachmentBytes() {
      java.lang.Object ref = serviceAttachment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceAttachment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the service attachment resource. Populated if private service
     * connect is enabled.
     * </pre>
     *
     * <code>string service_attachment = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The serviceAttachment to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAttachment(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      serviceAttachment_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the service attachment resource. Populated if private service
     * connect is enabled.
     * </pre>
     *
     * <code>string service_attachment = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceAttachment() {

      serviceAttachment_ = getDefaultInstance().getServiceAttachment();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the service attachment resource. Populated if private service
     * connect is enabled.
     * </pre>
     *
     * <code>string service_attachment = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for serviceAttachment to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAttachmentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      serviceAttachment_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints)
  private static final com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints();
  }

  public static com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IndexPrivateEndpoints> PARSER =
      new com.google.protobuf.AbstractParser<IndexPrivateEndpoints>() {
        @java.lang.Override
        public IndexPrivateEndpoints parsePartialFrom(
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

  public static com.google.protobuf.Parser<IndexPrivateEndpoints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IndexPrivateEndpoints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
