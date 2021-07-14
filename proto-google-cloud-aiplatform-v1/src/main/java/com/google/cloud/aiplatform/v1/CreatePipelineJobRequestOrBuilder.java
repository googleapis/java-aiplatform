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
// source: google/cloud/aiplatform/v1/pipeline_service.proto

package com.google.cloud.aiplatform.v1;

public interface CreatePipelineJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreatePipelineJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the PipelineJob in.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the PipelineJob in.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The PipelineJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the pipelineJob field is set.
   */
  boolean hasPipelineJob();
  /**
   *
   *
   * <pre>
   * Required. The PipelineJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The pipelineJob.
   */
  com.google.cloud.aiplatform.v1.PipelineJob getPipelineJob();
  /**
   *
   *
   * <pre>
   * Required. The PipelineJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.PipelineJobOrBuilder getPipelineJobOrBuilder();

  /**
   *
   *
   * <pre>
   * The ID to use for the PipelineJob, which will become the final component of
   * the PipelineJob name. If not provided, an ID will be automatically
   * generated.
   * This value should be less than 128 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string pipeline_job_id = 3;</code>
   *
   * @return The pipelineJobId.
   */
  java.lang.String getPipelineJobId();
  /**
   *
   *
   * <pre>
   * The ID to use for the PipelineJob, which will become the final component of
   * the PipelineJob name. If not provided, an ID will be automatically
   * generated.
   * This value should be less than 128 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string pipeline_job_id = 3;</code>
   *
   * @return The bytes for pipelineJobId.
   */
  com.google.protobuf.ByteString getPipelineJobIdBytes();
}