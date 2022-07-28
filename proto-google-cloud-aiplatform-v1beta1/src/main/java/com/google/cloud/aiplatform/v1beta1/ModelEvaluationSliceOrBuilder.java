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
// source: google/cloud/aiplatform/v1beta1/model_evaluation_slice.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ModelEvaluationSliceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelEvaluationSlice)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the ModelEvaluationSlice.
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
   * Output only. The resource name of the ModelEvaluationSlice.
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
   * Output only. The slice of the test data that is used to evaluate the Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.Slice slice = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the slice field is set.
   */
  boolean hasSlice();
  /**
   *
   *
   * <pre>
   * Output only. The slice of the test data that is used to evaluate the Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.Slice slice = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The slice.
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.Slice getSlice();
  /**
   *
   *
   * <pre>
   * Output only. The slice of the test data that is used to evaluate the Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.Slice slice = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.SliceOrBuilder getSliceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Points to a YAML file stored on Google Cloud Storage describing the
   * [metrics][google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.metrics] of this ModelEvaluationSlice. The
   * schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * </pre>
   *
   * <code>string metrics_schema_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The metricsSchemaUri.
   */
  java.lang.String getMetricsSchemaUri();
  /**
   *
   *
   * <pre>
   * Output only. Points to a YAML file stored on Google Cloud Storage describing the
   * [metrics][google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.metrics] of this ModelEvaluationSlice. The
   * schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * </pre>
   *
   * <code>string metrics_schema_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for metricsSchemaUri.
   */
  com.google.protobuf.ByteString getMetricsSchemaUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Sliced evaluation metrics of the Model. The schema of the metrics is stored
   * in [metrics_schema_uri][google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.metrics_schema_uri]
   * </pre>
   *
   * <code>.google.protobuf.Value metrics = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   *
   *
   * <pre>
   * Output only. Sliced evaluation metrics of the Model. The schema of the metrics is stored
   * in [metrics_schema_uri][google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.metrics_schema_uri]
   * </pre>
   *
   * <code>.google.protobuf.Value metrics = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The metrics.
   */
  com.google.protobuf.Value getMetrics();
  /**
   *
   *
   * <pre>
   * Output only. Sliced evaluation metrics of the Model. The schema of the metrics is stored
   * in [metrics_schema_uri][google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.metrics_schema_uri]
   * </pre>
   *
   * <code>.google.protobuf.Value metrics = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ValueOrBuilder getMetricsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelEvaluationSlice was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelEvaluationSlice was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelEvaluationSlice was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
