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
// source: google/cloud/aiplatform/v1beta1/index_endpoint_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [IndexEndpointService.ListIndexEndpoints][google.cloud.aiplatform.v1beta1.IndexEndpointService.ListIndexEndpoints].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse}
 */
public final class ListIndexEndpointsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse)
    ListIndexEndpointsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListIndexEndpointsResponse.newBuilder() to construct.
  private ListIndexEndpointsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListIndexEndpointsResponse() {
    indexEndpoints_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListIndexEndpointsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListIndexEndpointsResponse(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                indexEndpoints_ =
                    new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.IndexEndpoint>();
                mutable_bitField0_ |= 0x00000001;
              }
              indexEndpoints_.add(
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.IndexEndpoint.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
        indexEndpoints_ = java.util.Collections.unmodifiableList(indexEndpoints_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse.Builder.class);
  }

  public static final int INDEX_ENDPOINTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.IndexEndpoint> indexEndpoints_;
  /**
   *
   *
   * <pre>
   * List of IndexEndpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.IndexEndpoint> getIndexEndpointsList() {
    return indexEndpoints_;
  }
  /**
   *
   *
   * <pre>
   * List of IndexEndpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder>
      getIndexEndpointsOrBuilderList() {
    return indexEndpoints_;
  }
  /**
   *
   *
   * <pre>
   * List of IndexEndpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
   */
  @java.lang.Override
  public int getIndexEndpointsCount() {
    return indexEndpoints_.size();
  }
  /**
   *
   *
   * <pre>
   * List of IndexEndpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IndexEndpoint getIndexEndpoints(int index) {
    return indexEndpoints_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of IndexEndpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder getIndexEndpointsOrBuilder(
      int index) {
    return indexEndpoints_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListIndexEndpointsRequest.page_token][google.cloud.aiplatform.v1beta1.ListIndexEndpointsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListIndexEndpointsRequest.page_token][google.cloud.aiplatform.v1beta1.ListIndexEndpointsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < indexEndpoints_.size(); i++) {
      output.writeMessage(1, indexEndpoints_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < indexEndpoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, indexEndpoints_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse) obj;

    if (!getIndexEndpointsList().equals(other.getIndexEndpointsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getIndexEndpointsCount() > 0) {
      hash = (37 * hash) + INDEX_ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getIndexEndpointsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse prototype) {
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
   * Response message for [IndexEndpointService.ListIndexEndpoints][google.cloud.aiplatform.v1beta1.IndexEndpointService.ListIndexEndpoints].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse)
      com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIndexEndpointsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (indexEndpointsBuilder_ == null) {
        indexEndpoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        indexEndpointsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse(this);
      int from_bitField0_ = bitField0_;
      if (indexEndpointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          indexEndpoints_ = java.util.Collections.unmodifiableList(indexEndpoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.indexEndpoints_ = indexEndpoints_;
      } else {
        result.indexEndpoints_ = indexEndpointsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse.getDefaultInstance())
        return this;
      if (indexEndpointsBuilder_ == null) {
        if (!other.indexEndpoints_.isEmpty()) {
          if (indexEndpoints_.isEmpty()) {
            indexEndpoints_ = other.indexEndpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIndexEndpointsIsMutable();
            indexEndpoints_.addAll(other.indexEndpoints_);
          }
          onChanged();
        }
      } else {
        if (!other.indexEndpoints_.isEmpty()) {
          if (indexEndpointsBuilder_.isEmpty()) {
            indexEndpointsBuilder_.dispose();
            indexEndpointsBuilder_ = null;
            indexEndpoints_ = other.indexEndpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            indexEndpointsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getIndexEndpointsFieldBuilder()
                    : null;
          } else {
            indexEndpointsBuilder_.addAllMessages(other.indexEndpoints_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.aiplatform.v1beta1.IndexEndpoint> indexEndpoints_ =
        java.util.Collections.emptyList();

    private void ensureIndexEndpointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        indexEndpoints_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.IndexEndpoint>(
                indexEndpoints_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.IndexEndpoint,
            com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder,
            com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder>
        indexEndpointsBuilder_;

    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.IndexEndpoint>
        getIndexEndpointsList() {
      if (indexEndpointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(indexEndpoints_);
      } else {
        return indexEndpointsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public int getIndexEndpointsCount() {
      if (indexEndpointsBuilder_ == null) {
        return indexEndpoints_.size();
      } else {
        return indexEndpointsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexEndpoint getIndexEndpoints(int index) {
      if (indexEndpointsBuilder_ == null) {
        return indexEndpoints_.get(index);
      } else {
        return indexEndpointsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public Builder setIndexEndpoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexEndpoint value) {
      if (indexEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndexEndpointsIsMutable();
        indexEndpoints_.set(index, value);
        onChanged();
      } else {
        indexEndpointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public Builder setIndexEndpoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder builderForValue) {
      if (indexEndpointsBuilder_ == null) {
        ensureIndexEndpointsIsMutable();
        indexEndpoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        indexEndpointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public Builder addIndexEndpoints(com.google.cloud.aiplatform.v1beta1.IndexEndpoint value) {
      if (indexEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndexEndpointsIsMutable();
        indexEndpoints_.add(value);
        onChanged();
      } else {
        indexEndpointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public Builder addIndexEndpoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexEndpoint value) {
      if (indexEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndexEndpointsIsMutable();
        indexEndpoints_.add(index, value);
        onChanged();
      } else {
        indexEndpointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public Builder addIndexEndpoints(
        com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder builderForValue) {
      if (indexEndpointsBuilder_ == null) {
        ensureIndexEndpointsIsMutable();
        indexEndpoints_.add(builderForValue.build());
        onChanged();
      } else {
        indexEndpointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public Builder addIndexEndpoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder builderForValue) {
      if (indexEndpointsBuilder_ == null) {
        ensureIndexEndpointsIsMutable();
        indexEndpoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        indexEndpointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public Builder addAllIndexEndpoints(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.IndexEndpoint> values) {
      if (indexEndpointsBuilder_ == null) {
        ensureIndexEndpointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, indexEndpoints_);
        onChanged();
      } else {
        indexEndpointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public Builder clearIndexEndpoints() {
      if (indexEndpointsBuilder_ == null) {
        indexEndpoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        indexEndpointsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public Builder removeIndexEndpoints(int index) {
      if (indexEndpointsBuilder_ == null) {
        ensureIndexEndpointsIsMutable();
        indexEndpoints_.remove(index);
        onChanged();
      } else {
        indexEndpointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder getIndexEndpointsBuilder(
        int index) {
      return getIndexEndpointsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder getIndexEndpointsOrBuilder(
        int index) {
      if (indexEndpointsBuilder_ == null) {
        return indexEndpoints_.get(index);
      } else {
        return indexEndpointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder>
        getIndexEndpointsOrBuilderList() {
      if (indexEndpointsBuilder_ != null) {
        return indexEndpointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(indexEndpoints_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder addIndexEndpointsBuilder() {
      return getIndexEndpointsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.IndexEndpoint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder addIndexEndpointsBuilder(
        int index) {
      return getIndexEndpointsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.aiplatform.v1beta1.IndexEndpoint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of IndexEndpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoints = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder>
        getIndexEndpointsBuilderList() {
      return getIndexEndpointsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.IndexEndpoint,
            com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder,
            com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder>
        getIndexEndpointsFieldBuilder() {
      if (indexEndpointsBuilder_ == null) {
        indexEndpointsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.IndexEndpoint,
                com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder,
                com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder>(
                indexEndpoints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        indexEndpoints_ = null;
      }
      return indexEndpointsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListIndexEndpointsRequest.page_token][google.cloud.aiplatform.v1beta1.ListIndexEndpointsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListIndexEndpointsRequest.page_token][google.cloud.aiplatform.v1beta1.ListIndexEndpointsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListIndexEndpointsRequest.page_token][google.cloud.aiplatform.v1beta1.ListIndexEndpointsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListIndexEndpointsRequest.page_token][google.cloud.aiplatform.v1beta1.ListIndexEndpointsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListIndexEndpointsRequest.page_token][google.cloud.aiplatform.v1beta1.ListIndexEndpointsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListIndexEndpointsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListIndexEndpointsResponse>() {
        @java.lang.Override
        public ListIndexEndpointsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListIndexEndpointsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListIndexEndpointsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListIndexEndpointsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
