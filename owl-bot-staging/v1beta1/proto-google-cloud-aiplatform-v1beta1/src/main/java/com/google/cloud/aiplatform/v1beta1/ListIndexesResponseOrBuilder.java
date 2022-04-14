// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/index_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListIndexesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListIndexesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of indexes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Index indexes = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Index> 
      getIndexesList();
  /**
   * <pre>
   * List of indexes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Index indexes = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Index getIndexes(int index);
  /**
   * <pre>
   * List of indexes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Index indexes = 1;</code>
   */
  int getIndexesCount();
  /**
   * <pre>
   * List of indexes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Index indexes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.IndexOrBuilder> 
      getIndexesOrBuilderList();
  /**
   * <pre>
   * List of indexes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Index indexes = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.IndexOrBuilder getIndexesOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListIndexesRequest.page_token][google.cloud.aiplatform.v1beta1.ListIndexesRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListIndexesRequest.page_token][google.cloud.aiplatform.v1beta1.ListIndexesRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}