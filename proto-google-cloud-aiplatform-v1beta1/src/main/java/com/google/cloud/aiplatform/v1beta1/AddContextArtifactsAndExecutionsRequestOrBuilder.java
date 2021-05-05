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

public interface AddContextArtifactsAndExecutionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.AddContextArtifactsAndExecutionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Context that the Artifacts and Executions
   * belong to.
   * Format:
   * projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}
   * </pre>
   *
   * <code>
   * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The context.
   */
  java.lang.String getContext();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Context that the Artifacts and Executions
   * belong to.
   * Format:
   * projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}
   * </pre>
   *
   * <code>
   * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString getContextBytes();

  /**
   *
   *
   * <pre>
   * The resource names of the Artifacts to attribute to the Context.
   * </pre>
   *
   * <code>repeated string artifacts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the artifacts.
   */
  java.util.List<java.lang.String> getArtifactsList();
  /**
   *
   *
   * <pre>
   * The resource names of the Artifacts to attribute to the Context.
   * </pre>
   *
   * <code>repeated string artifacts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of artifacts.
   */
  int getArtifactsCount();
  /**
   *
   *
   * <pre>
   * The resource names of the Artifacts to attribute to the Context.
   * </pre>
   *
   * <code>repeated string artifacts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The artifacts at the given index.
   */
  java.lang.String getArtifacts(int index);
  /**
   *
   *
   * <pre>
   * The resource names of the Artifacts to attribute to the Context.
   * </pre>
   *
   * <code>repeated string artifacts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the artifacts at the given index.
   */
  com.google.protobuf.ByteString getArtifactsBytes(int index);

  /**
   *
   *
   * <pre>
   * The resource names of the Executions to associate with the
   * Context.
   * </pre>
   *
   * <code>repeated string executions = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the executions.
   */
  java.util.List<java.lang.String> getExecutionsList();
  /**
   *
   *
   * <pre>
   * The resource names of the Executions to associate with the
   * Context.
   * </pre>
   *
   * <code>repeated string executions = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of executions.
   */
  int getExecutionsCount();
  /**
   *
   *
   * <pre>
   * The resource names of the Executions to associate with the
   * Context.
   * </pre>
   *
   * <code>repeated string executions = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The executions at the given index.
   */
  java.lang.String getExecutions(int index);
  /**
   *
   *
   * <pre>
   * The resource names of the Executions to associate with the
   * Context.
   * </pre>
   *
   * <code>repeated string executions = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the executions at the given index.
   */
  com.google.protobuf.ByteString getExecutionsBytes(int index);
}
