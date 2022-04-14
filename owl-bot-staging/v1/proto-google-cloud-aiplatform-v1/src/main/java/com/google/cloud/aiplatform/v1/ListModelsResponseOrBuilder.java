// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListModelsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListModelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Model models = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Model> 
      getModelsList();
  /**
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Model models = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Model getModels(int index);
  /**
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Model models = 1;</code>
   */
  int getModelsCount();
  /**
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Model models = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ModelOrBuilder> 
      getModelsOrBuilderList();
  /**
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Model models = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ModelOrBuilder getModelsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModelsRequest.page_token][google.cloud.aiplatform.v1.ListModelsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModelsRequest.page_token][google.cloud.aiplatform.v1.ListModelsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}