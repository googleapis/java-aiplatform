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
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListContextsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListContextsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Context contexts = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Context> getContextsList();
  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Context contexts = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Context getContexts(int index);
  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Context contexts = 1;</code>
   */
  int getContextsCount();
  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Context contexts = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ContextOrBuilder>
      getContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Contexts retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Context contexts = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ContextOrBuilder getContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as [ListContextsRequest.page_token][google.cloud.aiplatform.v1.ListContextsRequest.page_token]
   * to retrieve the next page.
   * If this field is not populated, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as [ListContextsRequest.page_token][google.cloud.aiplatform.v1.ListContextsRequest.page_token]
   * to retrieve the next page.
   * If this field is not populated, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
