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
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [MetadataService.QueryArtifactLineageSubgraph][google.cloud.aiplatform.v1beta1.MetadataService.QueryArtifactLineageSubgraph].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest}
 */
public final class QueryArtifactLineageSubgraphRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest)
    QueryArtifactLineageSubgraphRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QueryArtifactLineageSubgraphRequest.newBuilder() to construct.
  private QueryArtifactLineageSubgraphRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueryArtifactLineageSubgraphRequest() {
    artifact_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QueryArtifactLineageSubgraphRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_QueryArtifactLineageSubgraphRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_QueryArtifactLineageSubgraphRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest.class,
            com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest.Builder.class);
  }

  public static final int ARTIFACT_FIELD_NUMBER = 1;
  private volatile java.lang.Object artifact_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Artifact whose Lineage needs to be retrieved as a
   * LineageSubgraph.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
   * The request may error with FAILED_PRECONDITION if the number of Artifacts,
   * the number of Executions, or the number of Events that would be returned
   * for the Context exceeds 1000.
   * </pre>
   *
   * <code>
   * string artifact = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The artifact.
   */
  @java.lang.Override
  public java.lang.String getArtifact() {
    java.lang.Object ref = artifact_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      artifact_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Artifact whose Lineage needs to be retrieved as a
   * LineageSubgraph.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
   * The request may error with FAILED_PRECONDITION if the number of Artifacts,
   * the number of Executions, or the number of Events that would be returned
   * for the Context exceeds 1000.
   * </pre>
   *
   * <code>
   * string artifact = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for artifact.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getArtifactBytes() {
    java.lang.Object ref = artifact_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      artifact_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_HOPS_FIELD_NUMBER = 2;
  private int maxHops_;
  /**
   *
   *
   * <pre>
   * Specifies the size of the lineage graph in terms of number of hops from the
   * specified artifact.
   * Negative Value: INVALID_ARGUMENT error is returned
   * 0: Only input artifact is returned.
   * No value: Transitive closure is performed to return the complete graph.
   * </pre>
   *
   * <code>int32 max_hops = 2;</code>
   *
   * @return The maxHops.
   */
  @java.lang.Override
  public int getMaxHops() {
    return maxHops_;
  }

  public static final int FILTER_FIELD_NUMBER = 3;
  private volatile java.lang.Object filter_;
  /**
   *
   *
   * <pre>
   * Filter specifying the boolean condition for the Artifacts to satisfy in
   * order to be part of the Lineage Subgraph.
   * The syntax to define filter query is based on https://google.aip.dev/160.
   * The supported set of filters include the following:
   * *  **Attribute filtering**:
   *    For example: `display_name = "test"`
   *    Supported fields include: `name`, `display_name`, `uri`, `state`,
   *    `schema_title`, `create_time`, and `update_time`.
   *    Time fields, such as `create_time` and `update_time`, require values
   *    specified in RFC-3339 format.
   *    For example: `create_time = "2020-11-19T11:30:00-04:00"`
   * *  **Metadata field**:
   *    To filter on metadata fields use traversal operation as follows:
   *    `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
   *    For example: `metadata.field_1.number_value = 10.0`
   * Each of the above supported filter types can be combined together using
   * logical operators (`AND` &amp; `OR`). Maximum nested expression depth allowed
   * is 5.
   * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Filter specifying the boolean condition for the Artifacts to satisfy in
   * order to be part of the Lineage Subgraph.
   * The syntax to define filter query is based on https://google.aip.dev/160.
   * The supported set of filters include the following:
   * *  **Attribute filtering**:
   *    For example: `display_name = "test"`
   *    Supported fields include: `name`, `display_name`, `uri`, `state`,
   *    `schema_title`, `create_time`, and `update_time`.
   *    Time fields, such as `create_time` and `update_time`, require values
   *    specified in RFC-3339 format.
   *    For example: `create_time = "2020-11-19T11:30:00-04:00"`
   * *  **Metadata field**:
   *    To filter on metadata fields use traversal operation as follows:
   *    `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
   *    For example: `metadata.field_1.number_value = 10.0`
   * Each of the above supported filter types can be combined together using
   * logical operators (`AND` &amp; `OR`). Maximum nested expression depth allowed
   * is 5.
   * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifact_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, artifact_);
    }
    if (maxHops_ != 0) {
      output.writeInt32(2, maxHops_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifact_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, artifact_);
    }
    if (maxHops_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxHops_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filter_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest other =
        (com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest) obj;

    if (!getArtifact().equals(other.getArtifact())) return false;
    if (getMaxHops() != other.getMaxHops()) return false;
    if (!getFilter().equals(other.getFilter())) return false;
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
    hash = (37 * hash) + ARTIFACT_FIELD_NUMBER;
    hash = (53 * hash) + getArtifact().hashCode();
    hash = (37 * hash) + MAX_HOPS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxHops();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest prototype) {
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
   * Request message for [MetadataService.QueryArtifactLineageSubgraph][google.cloud.aiplatform.v1beta1.MetadataService.QueryArtifactLineageSubgraph].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest)
      com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_QueryArtifactLineageSubgraphRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_QueryArtifactLineageSubgraphRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest.class,
              com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      artifact_ = "";

      maxHops_ = 0;

      filter_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_QueryArtifactLineageSubgraphRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest build() {
      com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest result =
          new com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest(this);
      result.artifact_ = artifact_;
      result.maxHops_ = maxHops_;
      result.filter_ = filter_;
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
          instanceof com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest
              .getDefaultInstance()) return this;
      if (!other.getArtifact().isEmpty()) {
        artifact_ = other.artifact_;
        onChanged();
      }
      if (other.getMaxHops() != 0) {
        setMaxHops(other.getMaxHops());
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
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
                artifact_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 16:
              {
                maxHops_ = input.readInt32();

                break;
              } // case 16
            case 26:
              {
                filter_ = input.readStringRequireUtf8();

                break;
              } // case 26
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

    private java.lang.Object artifact_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Artifact whose Lineage needs to be retrieved as a
     * LineageSubgraph.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
     * The request may error with FAILED_PRECONDITION if the number of Artifacts,
     * the number of Executions, or the number of Events that would be returned
     * for the Context exceeds 1000.
     * </pre>
     *
     * <code>
     * string artifact = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The artifact.
     */
    public java.lang.String getArtifact() {
      java.lang.Object ref = artifact_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        artifact_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Artifact whose Lineage needs to be retrieved as a
     * LineageSubgraph.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
     * The request may error with FAILED_PRECONDITION if the number of Artifacts,
     * the number of Executions, or the number of Events that would be returned
     * for the Context exceeds 1000.
     * </pre>
     *
     * <code>
     * string artifact = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for artifact.
     */
    public com.google.protobuf.ByteString getArtifactBytes() {
      java.lang.Object ref = artifact_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        artifact_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Artifact whose Lineage needs to be retrieved as a
     * LineageSubgraph.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
     * The request may error with FAILED_PRECONDITION if the number of Artifacts,
     * the number of Executions, or the number of Events that would be returned
     * for the Context exceeds 1000.
     * </pre>
     *
     * <code>
     * string artifact = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The artifact to set.
     * @return This builder for chaining.
     */
    public Builder setArtifact(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      artifact_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Artifact whose Lineage needs to be retrieved as a
     * LineageSubgraph.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
     * The request may error with FAILED_PRECONDITION if the number of Artifacts,
     * the number of Executions, or the number of Events that would be returned
     * for the Context exceeds 1000.
     * </pre>
     *
     * <code>
     * string artifact = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearArtifact() {

      artifact_ = getDefaultInstance().getArtifact();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Artifact whose Lineage needs to be retrieved as a
     * LineageSubgraph.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
     * The request may error with FAILED_PRECONDITION if the number of Artifacts,
     * the number of Executions, or the number of Events that would be returned
     * for the Context exceeds 1000.
     * </pre>
     *
     * <code>
     * string artifact = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for artifact to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      artifact_ = value;
      onChanged();
      return this;
    }

    private int maxHops_;
    /**
     *
     *
     * <pre>
     * Specifies the size of the lineage graph in terms of number of hops from the
     * specified artifact.
     * Negative Value: INVALID_ARGUMENT error is returned
     * 0: Only input artifact is returned.
     * No value: Transitive closure is performed to return the complete graph.
     * </pre>
     *
     * <code>int32 max_hops = 2;</code>
     *
     * @return The maxHops.
     */
    @java.lang.Override
    public int getMaxHops() {
      return maxHops_;
    }
    /**
     *
     *
     * <pre>
     * Specifies the size of the lineage graph in terms of number of hops from the
     * specified artifact.
     * Negative Value: INVALID_ARGUMENT error is returned
     * 0: Only input artifact is returned.
     * No value: Transitive closure is performed to return the complete graph.
     * </pre>
     *
     * <code>int32 max_hops = 2;</code>
     *
     * @param value The maxHops to set.
     * @return This builder for chaining.
     */
    public Builder setMaxHops(int value) {

      maxHops_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the size of the lineage graph in terms of number of hops from the
     * specified artifact.
     * Negative Value: INVALID_ARGUMENT error is returned
     * 0: Only input artifact is returned.
     * No value: Transitive closure is performed to return the complete graph.
     * </pre>
     *
     * <code>int32 max_hops = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxHops() {

      maxHops_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * Filter specifying the boolean condition for the Artifacts to satisfy in
     * order to be part of the Lineage Subgraph.
     * The syntax to define filter query is based on https://google.aip.dev/160.
     * The supported set of filters include the following:
     * *  **Attribute filtering**:
     *    For example: `display_name = "test"`
     *    Supported fields include: `name`, `display_name`, `uri`, `state`,
     *    `schema_title`, `create_time`, and `update_time`.
     *    Time fields, such as `create_time` and `update_time`, require values
     *    specified in RFC-3339 format.
     *    For example: `create_time = "2020-11-19T11:30:00-04:00"`
     * *  **Metadata field**:
     *    To filter on metadata fields use traversal operation as follows:
     *    `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
     *    For example: `metadata.field_1.number_value = 10.0`
     * Each of the above supported filter types can be combined together using
     * logical operators (`AND` &amp; `OR`). Maximum nested expression depth allowed
     * is 5.
     * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Filter specifying the boolean condition for the Artifacts to satisfy in
     * order to be part of the Lineage Subgraph.
     * The syntax to define filter query is based on https://google.aip.dev/160.
     * The supported set of filters include the following:
     * *  **Attribute filtering**:
     *    For example: `display_name = "test"`
     *    Supported fields include: `name`, `display_name`, `uri`, `state`,
     *    `schema_title`, `create_time`, and `update_time`.
     *    Time fields, such as `create_time` and `update_time`, require values
     *    specified in RFC-3339 format.
     *    For example: `create_time = "2020-11-19T11:30:00-04:00"`
     * *  **Metadata field**:
     *    To filter on metadata fields use traversal operation as follows:
     *    `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
     *    For example: `metadata.field_1.number_value = 10.0`
     * Each of the above supported filter types can be combined together using
     * logical operators (`AND` &amp; `OR`). Maximum nested expression depth allowed
     * is 5.
     * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Filter specifying the boolean condition for the Artifacts to satisfy in
     * order to be part of the Lineage Subgraph.
     * The syntax to define filter query is based on https://google.aip.dev/160.
     * The supported set of filters include the following:
     * *  **Attribute filtering**:
     *    For example: `display_name = "test"`
     *    Supported fields include: `name`, `display_name`, `uri`, `state`,
     *    `schema_title`, `create_time`, and `update_time`.
     *    Time fields, such as `create_time` and `update_time`, require values
     *    specified in RFC-3339 format.
     *    For example: `create_time = "2020-11-19T11:30:00-04:00"`
     * *  **Metadata field**:
     *    To filter on metadata fields use traversal operation as follows:
     *    `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
     *    For example: `metadata.field_1.number_value = 10.0`
     * Each of the above supported filter types can be combined together using
     * logical operators (`AND` &amp; `OR`). Maximum nested expression depth allowed
     * is 5.
     * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      filter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Filter specifying the boolean condition for the Artifacts to satisfy in
     * order to be part of the Lineage Subgraph.
     * The syntax to define filter query is based on https://google.aip.dev/160.
     * The supported set of filters include the following:
     * *  **Attribute filtering**:
     *    For example: `display_name = "test"`
     *    Supported fields include: `name`, `display_name`, `uri`, `state`,
     *    `schema_title`, `create_time`, and `update_time`.
     *    Time fields, such as `create_time` and `update_time`, require values
     *    specified in RFC-3339 format.
     *    For example: `create_time = "2020-11-19T11:30:00-04:00"`
     * *  **Metadata field**:
     *    To filter on metadata fields use traversal operation as follows:
     *    `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
     *    For example: `metadata.field_1.number_value = 10.0`
     * Each of the above supported filter types can be combined together using
     * logical operators (`AND` &amp; `OR`). Maximum nested expression depth allowed
     * is 5.
     * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {

      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Filter specifying the boolean condition for the Artifacts to satisfy in
     * order to be part of the Lineage Subgraph.
     * The syntax to define filter query is based on https://google.aip.dev/160.
     * The supported set of filters include the following:
     * *  **Attribute filtering**:
     *    For example: `display_name = "test"`
     *    Supported fields include: `name`, `display_name`, `uri`, `state`,
     *    `schema_title`, `create_time`, and `update_time`.
     *    Time fields, such as `create_time` and `update_time`, require values
     *    specified in RFC-3339 format.
     *    For example: `create_time = "2020-11-19T11:30:00-04:00"`
     * *  **Metadata field**:
     *    To filter on metadata fields use traversal operation as follows:
     *    `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
     *    For example: `metadata.field_1.number_value = 10.0`
     * Each of the above supported filter types can be combined together using
     * logical operators (`AND` &amp; `OR`). Maximum nested expression depth allowed
     * is 5.
     * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
     * </pre>
     *
     * <code>string filter = 3;</code>
     *
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      filter_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest)
  private static final com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryArtifactLineageSubgraphRequest> PARSER =
      new com.google.protobuf.AbstractParser<QueryArtifactLineageSubgraphRequest>() {
        @java.lang.Override
        public QueryArtifactLineageSubgraphRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryArtifactLineageSubgraphRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryArtifactLineageSubgraphRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
