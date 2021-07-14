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
// source: google/cloud/aiplatform/v1beta1/hyperparameter_tuning_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface HyperparameterTuningJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.HyperparameterTuningJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the HyperparameterTuningJob.
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
   * Output only. Resource name of the HyperparameterTuningJob.
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
   * Required. The display name of the HyperparameterTuningJob.
   * The name can be up to 128 characters long and can be consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the HyperparameterTuningJob.
   * The name can be up to 128 characters long and can be consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Study configuration of the HyperparameterTuningJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.StudySpec study_spec = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the studySpec field is set.
   */
  boolean hasStudySpec();
  /**
   *
   *
   * <pre>
   * Required. Study configuration of the HyperparameterTuningJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.StudySpec study_spec = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The studySpec.
   */
  com.google.cloud.aiplatform.v1beta1.StudySpec getStudySpec();
  /**
   *
   *
   * <pre>
   * Required. Study configuration of the HyperparameterTuningJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.StudySpec study_spec = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.StudySpecOrBuilder getStudySpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The desired total number of Trials.
   * </pre>
   *
   * <code>int32 max_trial_count = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The maxTrialCount.
   */
  int getMaxTrialCount();

  /**
   *
   *
   * <pre>
   * Required. The desired number of Trials to run in parallel.
   * </pre>
   *
   * <code>int32 parallel_trial_count = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parallelTrialCount.
   */
  int getParallelTrialCount();

  /**
   *
   *
   * <pre>
   * The number of failed Trials that need to be seen before failing
   * the HyperparameterTuningJob.
   * If set to 0, Vertex AI decides how many Trials must fail
   * before the whole job fails.
   * </pre>
   *
   * <code>int32 max_failed_trial_count = 7;</code>
   *
   * @return The maxFailedTrialCount.
   */
  int getMaxFailedTrialCount();

  /**
   *
   *
   * <pre>
   * Required. The spec of a trial job. The same spec applies to the CustomJobs created
   * in all the trials.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CustomJobSpec trial_job_spec = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the trialJobSpec field is set.
   */
  boolean hasTrialJobSpec();
  /**
   *
   *
   * <pre>
   * Required. The spec of a trial job. The same spec applies to the CustomJobs created
   * in all the trials.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CustomJobSpec trial_job_spec = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The trialJobSpec.
   */
  com.google.cloud.aiplatform.v1beta1.CustomJobSpec getTrialJobSpec();
  /**
   *
   *
   * <pre>
   * Required. The spec of a trial job. The same spec applies to the CustomJobs created
   * in all the trials.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CustomJobSpec trial_job_spec = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.CustomJobSpecOrBuilder getTrialJobSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Trials of the HyperparameterTuningJob.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Trial trials = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Trial> getTrialsList();
  /**
   *
   *
   * <pre>
   * Output only. Trials of the HyperparameterTuningJob.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Trial trials = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Trial getTrials(int index);
  /**
   *
   *
   * <pre>
   * Output only. Trials of the HyperparameterTuningJob.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Trial trials = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getTrialsCount();
  /**
   *
   *
   * <pre>
   * Output only. Trials of the HyperparameterTuningJob.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Trial trials = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>
      getTrialsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Trials of the HyperparameterTuningJob.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Trial trials = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TrialOrBuilder getTrialsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.JobState getState();

  /**
   *
   *
   * <pre>
   * Output only. Time when the HyperparameterTuningJob was created.
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
   * Output only. Time when the HyperparameterTuningJob was created.
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
   * Output only. Time when the HyperparameterTuningJob was created.
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
   * Output only. Time when the HyperparameterTuningJob for the first time entered the
   * `JOB_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the HyperparameterTuningJob for the first time entered the
   * `JOB_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the HyperparameterTuningJob for the first time entered the
   * `JOB_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the HyperparameterTuningJob entered any of the following states:
   * `JOB_STATE_SUCCEEDED`, `JOB_STATE_FAILED`, `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the HyperparameterTuningJob entered any of the following states:
   * `JOB_STATE_SUCCEEDED`, `JOB_STATE_FAILED`, `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the HyperparameterTuningJob entered any of the following states:
   * `JOB_STATE_SUCCEEDED`, `JOB_STATE_FAILED`, `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the HyperparameterTuningJob was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the HyperparameterTuningJob was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the HyperparameterTuningJob was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Only populated when job's state is JOB_STATE_FAILED or
   * JOB_STATE_CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. Only populated when job's state is JOB_STATE_FAILED or
   * JOB_STATE_CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. Only populated when job's state is JOB_STATE_FAILED or
   * JOB_STATE_CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize HyperparameterTuningJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize HyperparameterTuningJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize HyperparameterTuningJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize HyperparameterTuningJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize HyperparameterTuningJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key options for a HyperparameterTuningJob.
   * If this is set, then all resources created by the HyperparameterTuningJob
   * will be encrypted with the provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 17;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key options for a HyperparameterTuningJob.
   * If this is set, then all resources created by the HyperparameterTuningJob
   * will be encrypted with the provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 17;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key options for a HyperparameterTuningJob.
   * If this is set, then all resources created by the HyperparameterTuningJob
   * will be encrypted with the provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 17;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();
}
