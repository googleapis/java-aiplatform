// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/dataset_service.proto

package com.google.cloud.aiplatform.v1;

public interface SearchDataItemsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SearchDataItemsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItemView data_item_views = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.DataItemView> 
      getDataItemViewsList();
  /**
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItemView data_item_views = 1;</code>
   */
  com.google.cloud.aiplatform.v1.DataItemView getDataItemViews(int index);
  /**
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItemView data_item_views = 1;</code>
   */
  int getDataItemViewsCount();
  /**
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItemView data_item_views = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.DataItemViewOrBuilder> 
      getDataItemViewsOrBuilderList();
  /**
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItemView data_item_views = 1;</code>
   */
  com.google.cloud.aiplatform.v1.DataItemViewOrBuilder getDataItemViewsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [SearchDataItemsRequest.page_token][google.cloud.aiplatform.v1.SearchDataItemsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [SearchDataItemsRequest.page_token][google.cloud.aiplatform.v1.SearchDataItemsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
