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
// source: google/cloud/aiplatform/v1beta1/job_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListDataLabelingJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListDataLabelingJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of DataLabelingJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.DataLabelingJob> getDataLabelingJobsList();
  /**
   *
   *
   * <pre>
   * A list of DataLabelingJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.DataLabelingJob getDataLabelingJobs(int index);
  /**
   *
   *
   * <pre>
   * A list of DataLabelingJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_jobs = 1;</code>
   */
  int getDataLabelingJobsCount();
  /**
   *
   *
   * <pre>
   * A list of DataLabelingJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.DataLabelingJobOrBuilder>
      getDataLabelingJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of DataLabelingJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.DataLabelingJobOrBuilder getDataLabelingJobsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The standard List next-page token.
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
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
