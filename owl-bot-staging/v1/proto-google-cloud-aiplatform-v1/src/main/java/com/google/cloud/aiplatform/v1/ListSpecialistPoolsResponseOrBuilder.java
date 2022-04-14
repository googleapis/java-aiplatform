// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/specialist_pool_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListSpecialistPoolsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListSpecialistPoolsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SpecialistPool specialist_pools = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.SpecialistPool> 
      getSpecialistPoolsList();
  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SpecialistPool specialist_pools = 1;</code>
   */
  com.google.cloud.aiplatform.v1.SpecialistPool getSpecialistPools(int index);
  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SpecialistPool specialist_pools = 1;</code>
   */
  int getSpecialistPoolsCount();
  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SpecialistPool specialist_pools = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.SpecialistPoolOrBuilder> 
      getSpecialistPoolsOrBuilderList();
  /**
   * <pre>
   * A list of SpecialistPools that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.SpecialistPool specialist_pools = 1;</code>
   */
  com.google.cloud.aiplatform.v1.SpecialistPoolOrBuilder getSpecialistPoolsOrBuilder(
      int index);

  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}