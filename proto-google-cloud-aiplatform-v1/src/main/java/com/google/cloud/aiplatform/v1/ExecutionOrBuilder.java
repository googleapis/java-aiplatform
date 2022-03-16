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
// source: google/cloud/aiplatform/v1/execution.proto

package com.google.cloud.aiplatform.v1;

public interface ExecutionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Execution)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Execution.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Execution.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * User provided display name of the Execution.
   * May be up to 128 Unicode characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * User provided display name of the Execution.
   * May be up to 128 Unicode characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The state of this Execution. This is a property of the Execution, and does
   * not imply or capture any ongoing process. This property is managed by
   * clients (such as Vertex AI Pipelines) and the system does not prescribe
   * or check the validity of state transitions.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Execution.State state = 6;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of this Execution. This is a property of the Execution, and does
   * not imply or capture any ongoing process. This property is managed by
   * clients (such as Vertex AI Pipelines) and the system does not prescribe
   * or check the validity of state transitions.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Execution.State state = 6;</code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1.Execution.State getState();

  /**
   *
   *
   * <pre>
   * An eTag used to perform consistent read-modify-write updates. If not set, a
   * blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 9;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * An eTag used to perform consistent read-modify-write updates. If not set, a
   * blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 9;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Executions.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Execution (System
   * labels are excluded).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Executions.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Execution (System
   * labels are excluded).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Executions.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Execution (System
   * labels are excluded).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Executions.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Execution (System
   * labels are excluded).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Executions.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Execution (System
   * labels are excluded).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Execution was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Execution was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Execution was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Execution was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Execution was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Execution was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The title of the schema describing the metadata.
   * Schema title and version is expected to be registered in earlier Create
   * Schema calls. And both are used together as unique identifiers to identify
   * schemas within the local metadata store.
   * </pre>
   *
   * <code>string schema_title = 13;</code>
   *
   * @return The schemaTitle.
   */
  java.lang.String getSchemaTitle();
  /**
   *
   *
   * <pre>
   * The title of the schema describing the metadata.
   * Schema title and version is expected to be registered in earlier Create
   * Schema calls. And both are used together as unique identifiers to identify
   * schemas within the local metadata store.
   * </pre>
   *
   * <code>string schema_title = 13;</code>
   *
   * @return The bytes for schemaTitle.
   */
  com.google.protobuf.ByteString getSchemaTitleBytes();

  /**
   *
   *
   * <pre>
   * The version of the schema in `schema_title` to use.
   * Schema title and version is expected to be registered in earlier Create
   * Schema calls. And both are used together as unique identifiers to identify
   * schemas within the local metadata store.
   * </pre>
   *
   * <code>string schema_version = 14;</code>
   *
   * @return The schemaVersion.
   */
  java.lang.String getSchemaVersion();
  /**
   *
   *
   * <pre>
   * The version of the schema in `schema_title` to use.
   * Schema title and version is expected to be registered in earlier Create
   * Schema calls. And both are used together as unique identifiers to identify
   * schemas within the local metadata store.
   * </pre>
   *
   * <code>string schema_version = 14;</code>
   *
   * @return The bytes for schemaVersion.
   */
  com.google.protobuf.ByteString getSchemaVersionBytes();

  /**
   *
   *
   * <pre>
   * Properties of the Execution.
   * The size of this field should not exceed 200KB.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 15;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Properties of the Execution.
   * The size of this field should not exceed 200KB.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 15;</code>
   *
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   *
   *
   * <pre>
   * Properties of the Execution.
   * The size of this field should not exceed 200KB.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 15;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Description of the Execution
   * </pre>
   *
   * <code>string description = 16;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the Execution
   * </pre>
   *
   * <code>string description = 16;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
