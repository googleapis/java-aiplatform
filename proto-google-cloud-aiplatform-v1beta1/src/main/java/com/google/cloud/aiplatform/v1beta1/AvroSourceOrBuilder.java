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
// source: google/cloud/aiplatform/v1beta1/io.proto

package com.google.cloud.aiplatform.v1beta1;

public interface AvroSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.AvroSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.aiplatform.v1beta1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();
}
