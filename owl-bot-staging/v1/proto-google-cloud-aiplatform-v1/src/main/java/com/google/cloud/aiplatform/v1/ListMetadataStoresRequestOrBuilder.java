// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListMetadataStoresRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListMetadataStoresRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Location whose MetadataStores should be listed.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The Location whose MetadataStores should be listed.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of Metadata Stores to return. The service may return
   * fewer.
   * Must be in range 1-1000, inclusive. Defaults to 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous
   * [MetadataService.ListMetadataStores][google.cloud.aiplatform.v1.MetadataService.ListMetadataStores] call. Provide this to retrieve the
   * subsequent page.
   * When paginating, all other provided parameters must match the call that
   * provided the page token. (Otherwise the request will fail with
   * INVALID_ARGUMENT error.)
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous
   * [MetadataService.ListMetadataStores][google.cloud.aiplatform.v1.MetadataService.ListMetadataStores] call. Provide this to retrieve the
   * subsequent page.
   * When paginating, all other provided parameters must match the call that
   * provided the page token. (Otherwise the request will fail with
   * INVALID_ARGUMENT error.)
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
