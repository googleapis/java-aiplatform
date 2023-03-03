// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/specialist_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Response message for
 * [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse}
 */
public final class ListSpecialistPoolsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse)
    ListSpecialistPoolsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSpecialistPoolsResponse.newBuilder() to construct.
  private ListSpecialistPoolsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSpecialistPoolsResponse() {
    specialistPools_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSpecialistPoolsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.class, com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.Builder.class);
  }

  public static final int SPECIALIST_POOLS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.SpecialistPool> specialistPools_;
  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.SpecialistPool> getSpecialistPoolsList() {
    return specialistPools_;
  }
  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.SpecialistPoolOrBuilder> 
      getSpecialistPoolsOrBuilderList() {
    return specialistPools_;
  }
  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
   */
  @java.lang.Override
  public int getSpecialistPoolsCount() {
    return specialistPools_.size();
  }
  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.SpecialistPool getSpecialistPools(int index) {
    return specialistPools_.get(index);
  }
  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.SpecialistPoolOrBuilder getSpecialistPoolsOrBuilder(
      int index) {
    return specialistPools_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < specialistPools_.size(); i++) {
      output.writeMessage(1, specialistPools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < specialistPools_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, specialistPools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse other = (com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse) obj;

    if (!getSpecialistPoolsList()
        .equals(other.getSpecialistPoolsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getSpecialistPoolsCount() > 0) {
      hash = (37 * hash) + SPECIALIST_POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getSpecialistPoolsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse prototype) {
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
   * Response message for
   * [SpecialistPoolService.ListSpecialistPools][google.cloud.aiplatform.v1beta1.SpecialistPoolService.ListSpecialistPools].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse)
      com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.class, com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.newBuilder()
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
      if (specialistPoolsBuilder_ == null) {
        specialistPools_ = java.util.Collections.emptyList();
      } else {
        specialistPools_ = null;
        specialistPoolsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse result = new com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse result) {
      if (specialistPoolsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          specialistPools_ = java.util.Collections.unmodifiableList(specialistPools_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.specialistPools_ = specialistPools_;
      } else {
        result.specialistPools_ = specialistPoolsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse.getDefaultInstance()) return this;
      if (specialistPoolsBuilder_ == null) {
        if (!other.specialistPools_.isEmpty()) {
          if (specialistPools_.isEmpty()) {
            specialistPools_ = other.specialistPools_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSpecialistPoolsIsMutable();
            specialistPools_.addAll(other.specialistPools_);
          }
          onChanged();
        }
      } else {
        if (!other.specialistPools_.isEmpty()) {
          if (specialistPoolsBuilder_.isEmpty()) {
            specialistPoolsBuilder_.dispose();
            specialistPoolsBuilder_ = null;
            specialistPools_ = other.specialistPools_;
            bitField0_ = (bitField0_ & ~0x00000001);
            specialistPoolsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSpecialistPoolsFieldBuilder() : null;
          } else {
            specialistPoolsBuilder_.addAllMessages(other.specialistPools_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
            case 10: {
              com.google.cloud.aiplatform.v1beta1.SpecialistPool m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.SpecialistPool.parser(),
                      extensionRegistry);
              if (specialistPoolsBuilder_ == null) {
                ensureSpecialistPoolsIsMutable();
                specialistPools_.add(m);
              } else {
                specialistPoolsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.SpecialistPool> specialistPools_ =
      java.util.Collections.emptyList();
    private void ensureSpecialistPoolsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        specialistPools_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.SpecialistPool>(specialistPools_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.SpecialistPool, com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder, com.google.cloud.aiplatform.v1beta1.SpecialistPoolOrBuilder> specialistPoolsBuilder_;

    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.SpecialistPool> getSpecialistPoolsList() {
      if (specialistPoolsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(specialistPools_);
      } else {
        return specialistPoolsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public int getSpecialistPoolsCount() {
      if (specialistPoolsBuilder_ == null) {
        return specialistPools_.size();
      } else {
        return specialistPoolsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.SpecialistPool getSpecialistPools(int index) {
      if (specialistPoolsBuilder_ == null) {
        return specialistPools_.get(index);
      } else {
        return specialistPoolsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public Builder setSpecialistPools(
        int index, com.google.cloud.aiplatform.v1beta1.SpecialistPool value) {
      if (specialistPoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpecialistPoolsIsMutable();
        specialistPools_.set(index, value);
        onChanged();
      } else {
        specialistPoolsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public Builder setSpecialistPools(
        int index, com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder builderForValue) {
      if (specialistPoolsBuilder_ == null) {
        ensureSpecialistPoolsIsMutable();
        specialistPools_.set(index, builderForValue.build());
        onChanged();
      } else {
        specialistPoolsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public Builder addSpecialistPools(com.google.cloud.aiplatform.v1beta1.SpecialistPool value) {
      if (specialistPoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpecialistPoolsIsMutable();
        specialistPools_.add(value);
        onChanged();
      } else {
        specialistPoolsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public Builder addSpecialistPools(
        int index, com.google.cloud.aiplatform.v1beta1.SpecialistPool value) {
      if (specialistPoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpecialistPoolsIsMutable();
        specialistPools_.add(index, value);
        onChanged();
      } else {
        specialistPoolsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public Builder addSpecialistPools(
        com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder builderForValue) {
      if (specialistPoolsBuilder_ == null) {
        ensureSpecialistPoolsIsMutable();
        specialistPools_.add(builderForValue.build());
        onChanged();
      } else {
        specialistPoolsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public Builder addSpecialistPools(
        int index, com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder builderForValue) {
      if (specialistPoolsBuilder_ == null) {
        ensureSpecialistPoolsIsMutable();
        specialistPools_.add(index, builderForValue.build());
        onChanged();
      } else {
        specialistPoolsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public Builder addAllSpecialistPools(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.SpecialistPool> values) {
      if (specialistPoolsBuilder_ == null) {
        ensureSpecialistPoolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, specialistPools_);
        onChanged();
      } else {
        specialistPoolsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public Builder clearSpecialistPools() {
      if (specialistPoolsBuilder_ == null) {
        specialistPools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        specialistPoolsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public Builder removeSpecialistPools(int index) {
      if (specialistPoolsBuilder_ == null) {
        ensureSpecialistPoolsIsMutable();
        specialistPools_.remove(index);
        onChanged();
      } else {
        specialistPoolsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder getSpecialistPoolsBuilder(
        int index) {
      return getSpecialistPoolsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.SpecialistPoolOrBuilder getSpecialistPoolsOrBuilder(
        int index) {
      if (specialistPoolsBuilder_ == null) {
        return specialistPools_.get(index);  } else {
        return specialistPoolsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.SpecialistPoolOrBuilder> 
         getSpecialistPoolsOrBuilderList() {
      if (specialistPoolsBuilder_ != null) {
        return specialistPoolsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(specialistPools_);
      }
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder addSpecialistPoolsBuilder() {
      return getSpecialistPoolsFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1beta1.SpecialistPool.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder addSpecialistPoolsBuilder(
        int index) {
      return getSpecialistPoolsFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1beta1.SpecialistPool.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of SpecialistPools that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pools = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder> 
         getSpecialistPoolsBuilderList() {
      return getSpecialistPoolsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.SpecialistPool, com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder, com.google.cloud.aiplatform.v1beta1.SpecialistPoolOrBuilder> 
        getSpecialistPoolsFieldBuilder() {
      if (specialistPoolsBuilder_ == null) {
        specialistPoolsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.SpecialistPool, com.google.cloud.aiplatform.v1beta1.SpecialistPool.Builder, com.google.cloud.aiplatform.v1beta1.SpecialistPoolOrBuilder>(
                specialistPools_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        specialistPools_ = null;
      }
      return specialistPoolsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSpecialistPoolsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSpecialistPoolsResponse>() {
    @java.lang.Override
    public ListSpecialistPoolsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSpecialistPoolsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSpecialistPoolsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

