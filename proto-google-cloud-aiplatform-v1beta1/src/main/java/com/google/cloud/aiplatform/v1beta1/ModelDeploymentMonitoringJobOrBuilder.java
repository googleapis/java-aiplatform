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
// source: google/cloud/aiplatform/v1beta1/model_deployment_monitoring_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ModelDeploymentMonitoringJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of a ModelDeploymentMonitoringJob.
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
   * Output only. Resource name of a ModelDeploymentMonitoringJob.
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
   * Required. The user-defined name of the ModelDeploymentMonitoringJob.
   * The name can be up to 128 characters long and can be consist of any UTF-8
   * characters.
   * Display name of a ModelDeploymentMonitoringJob.
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
   * Required. The user-defined name of the ModelDeploymentMonitoringJob.
   * The name can be up to 128 characters long and can be consist of any UTF-8
   * characters.
   * Display name of a ModelDeploymentMonitoringJob.
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
   * Required. Endpoint resource name.
   * Format: `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * Required. Endpoint resource name.
   * Format: `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the monitoring job.
   * When the job is still creating, the state will be 'PENDING'.
   * Once the job is successfully created, the state will be 'RUNNING'.
   * Pause the job, the state will be 'PAUSED'.
   * Resume the job, the state will return to 'RUNNING'.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the monitoring job.
   * When the job is still creating, the state will be 'PENDING'.
   * Once the job is successfully created, the state will be 'RUNNING'.
   * Pause the job, the state will be 'PAUSED'.
   * Resume the job, the state will return to 'RUNNING'.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.JobState getState();

  /**
   *
   *
   * <pre>
   * Output only. Schedule state when the monitoring job is in Running state.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.MonitoringScheduleState schedule_state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for scheduleState.
   */
  int getScheduleStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Schedule state when the monitoring job is in Running state.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.MonitoringScheduleState schedule_state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The scheduleState.
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.MonitoringScheduleState
      getScheduleState();

  /**
   *
   *
   * <pre>
   * Output only. Latest triggered monitoring pipeline metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.LatestMonitoringPipelineMetadata latest_monitoring_pipeline_metadata = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the latestMonitoringPipelineMetadata field is set.
   */
  boolean hasLatestMonitoringPipelineMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Latest triggered monitoring pipeline metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.LatestMonitoringPipelineMetadata latest_monitoring_pipeline_metadata = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The latestMonitoringPipelineMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.LatestMonitoringPipelineMetadata
      getLatestMonitoringPipelineMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Latest triggered monitoring pipeline metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.LatestMonitoringPipelineMetadata latest_monitoring_pipeline_metadata = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob
          .LatestMonitoringPipelineMetadataOrBuilder
      getLatestMonitoringPipelineMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The config for monitoring objectives. This is a per DeployedModel config.
   * Each DeployedModel needs to be configured separately.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig model_deployment_monitoring_objective_configs = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig>
      getModelDeploymentMonitoringObjectiveConfigsList();
  /**
   *
   *
   * <pre>
   * Required. The config for monitoring objectives. This is a per DeployedModel config.
   * Each DeployedModel needs to be configured separately.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig model_deployment_monitoring_objective_configs = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      getModelDeploymentMonitoringObjectiveConfigs(int index);
  /**
   *
   *
   * <pre>
   * Required. The config for monitoring objectives. This is a per DeployedModel config.
   * Each DeployedModel needs to be configured separately.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig model_deployment_monitoring_objective_configs = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getModelDeploymentMonitoringObjectiveConfigsCount();
  /**
   *
   *
   * <pre>
   * Required. The config for monitoring objectives. This is a per DeployedModel config.
   * Each DeployedModel needs to be configured separately.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig model_deployment_monitoring_objective_configs = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfigOrBuilder>
      getModelDeploymentMonitoringObjectiveConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The config for monitoring objectives. This is a per DeployedModel config.
   * Each DeployedModel needs to be configured separately.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig model_deployment_monitoring_objective_configs = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfigOrBuilder
      getModelDeploymentMonitoringObjectiveConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Required. Schedule config for running the monitoring job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringScheduleConfig model_deployment_monitoring_schedule_config = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the modelDeploymentMonitoringScheduleConfig field is set.
   */
  boolean hasModelDeploymentMonitoringScheduleConfig();
  /**
   *
   *
   * <pre>
   * Required. Schedule config for running the monitoring job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringScheduleConfig model_deployment_monitoring_schedule_config = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The modelDeploymentMonitoringScheduleConfig.
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringScheduleConfig
      getModelDeploymentMonitoringScheduleConfig();
  /**
   *
   *
   * <pre>
   * Required. Schedule config for running the monitoring job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringScheduleConfig model_deployment_monitoring_schedule_config = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringScheduleConfigOrBuilder
      getModelDeploymentMonitoringScheduleConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Sample Strategy for logging.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SamplingStrategy logging_sampling_strategy = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the loggingSamplingStrategy field is set.
   */
  boolean hasLoggingSamplingStrategy();
  /**
   *
   *
   * <pre>
   * Required. Sample Strategy for logging.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SamplingStrategy logging_sampling_strategy = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The loggingSamplingStrategy.
   */
  com.google.cloud.aiplatform.v1beta1.SamplingStrategy getLoggingSamplingStrategy();
  /**
   *
   *
   * <pre>
   * Required. Sample Strategy for logging.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SamplingStrategy logging_sampling_strategy = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SamplingStrategyOrBuilder
      getLoggingSamplingStrategyOrBuilder();

  /**
   *
   *
   * <pre>
   * Alert config for model monitoring.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig model_monitoring_alert_config = 15;
   * </code>
   *
   * @return Whether the modelMonitoringAlertConfig field is set.
   */
  boolean hasModelMonitoringAlertConfig();
  /**
   *
   *
   * <pre>
   * Alert config for model monitoring.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig model_monitoring_alert_config = 15;
   * </code>
   *
   * @return The modelMonitoringAlertConfig.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig getModelMonitoringAlertConfig();
  /**
   *
   *
   * <pre>
   * Alert config for model monitoring.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig model_monitoring_alert_config = 15;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfigOrBuilder
      getModelMonitoringAlertConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * YAML schema file uri describing the format of a single instance,
   * which are given to format this Endpoint's prediction (and explanation).
   * If not set, we will generate predict schema from collected predict
   * requests.
   * </pre>
   *
   * <code>string predict_instance_schema_uri = 9;</code>
   *
   * @return The predictInstanceSchemaUri.
   */
  java.lang.String getPredictInstanceSchemaUri();
  /**
   *
   *
   * <pre>
   * YAML schema file uri describing the format of a single instance,
   * which are given to format this Endpoint's prediction (and explanation).
   * If not set, we will generate predict schema from collected predict
   * requests.
   * </pre>
   *
   * <code>string predict_instance_schema_uri = 9;</code>
   *
   * @return The bytes for predictInstanceSchemaUri.
   */
  com.google.protobuf.ByteString getPredictInstanceSchemaUriBytes();

  /**
   *
   *
   * <pre>
   * Sample Predict instance, same format as [PredictRequest.instances][google.cloud.aiplatform.v1beta1.PredictRequest.instances],
   * this can be set as a replacement of
   * [ModelDeploymentMonitoringJob.predict_instance_schema_uri][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.predict_instance_schema_uri]. If not set,
   * we will generate predict schema from collected predict requests.
   * </pre>
   *
   * <code>.google.protobuf.Value sample_predict_instance = 19;</code>
   *
   * @return Whether the samplePredictInstance field is set.
   */
  boolean hasSamplePredictInstance();
  /**
   *
   *
   * <pre>
   * Sample Predict instance, same format as [PredictRequest.instances][google.cloud.aiplatform.v1beta1.PredictRequest.instances],
   * this can be set as a replacement of
   * [ModelDeploymentMonitoringJob.predict_instance_schema_uri][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.predict_instance_schema_uri]. If not set,
   * we will generate predict schema from collected predict requests.
   * </pre>
   *
   * <code>.google.protobuf.Value sample_predict_instance = 19;</code>
   *
   * @return The samplePredictInstance.
   */
  com.google.protobuf.Value getSamplePredictInstance();
  /**
   *
   *
   * <pre>
   * Sample Predict instance, same format as [PredictRequest.instances][google.cloud.aiplatform.v1beta1.PredictRequest.instances],
   * this can be set as a replacement of
   * [ModelDeploymentMonitoringJob.predict_instance_schema_uri][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.predict_instance_schema_uri]. If not set,
   * we will generate predict schema from collected predict requests.
   * </pre>
   *
   * <code>.google.protobuf.Value sample_predict_instance = 19;</code>
   */
  com.google.protobuf.ValueOrBuilder getSamplePredictInstanceOrBuilder();

  /**
   *
   *
   * <pre>
   * YAML schema file uri describing the format of a single instance that you
   * want Tensorflow Data Validation (TFDV) to analyze.
   * If this field is empty, all the feature data types are inferred from
   * [predict_instance_schema_uri][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.predict_instance_schema_uri],
   * meaning that TFDV will use the data in the exact format(data type) as
   * prediction request/response.
   * If there are any data type differences between predict instance and TFDV
   * instance, this field can be used to override the schema.
   * For models trained with Vertex AI, this field must be set as all the
   * fields in predict instance formatted as string.
   * </pre>
   *
   * <code>string analysis_instance_schema_uri = 16;</code>
   *
   * @return The analysisInstanceSchemaUri.
   */
  java.lang.String getAnalysisInstanceSchemaUri();
  /**
   *
   *
   * <pre>
   * YAML schema file uri describing the format of a single instance that you
   * want Tensorflow Data Validation (TFDV) to analyze.
   * If this field is empty, all the feature data types are inferred from
   * [predict_instance_schema_uri][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob.predict_instance_schema_uri],
   * meaning that TFDV will use the data in the exact format(data type) as
   * prediction request/response.
   * If there are any data type differences between predict instance and TFDV
   * instance, this field can be used to override the schema.
   * For models trained with Vertex AI, this field must be set as all the
   * fields in predict instance formatted as string.
   * </pre>
   *
   * <code>string analysis_instance_schema_uri = 16;</code>
   *
   * @return The bytes for analysisInstanceSchemaUri.
   */
  com.google.protobuf.ByteString getAnalysisInstanceSchemaUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. The created bigquery tables for the job under customer project. Customer
   * could do their own query &amp; analysis. There could be 4 log tables in
   * maximum:
   * 1. Training data logging predict request/response
   * 2. Serving data logging predict request/response
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable bigquery_tables = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable>
      getBigqueryTablesList();
  /**
   *
   *
   * <pre>
   * Output only. The created bigquery tables for the job under customer project. Customer
   * could do their own query &amp; analysis. There could be 4 log tables in
   * maximum:
   * 1. Training data logging predict request/response
   * 2. Serving data logging predict request/response
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable bigquery_tables = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable getBigqueryTables(
      int index);
  /**
   *
   *
   * <pre>
   * Output only. The created bigquery tables for the job under customer project. Customer
   * could do their own query &amp; analysis. There could be 4 log tables in
   * maximum:
   * 1. Training data logging predict request/response
   * 2. Serving data logging predict request/response
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable bigquery_tables = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getBigqueryTablesCount();
  /**
   *
   *
   * <pre>
   * Output only. The created bigquery tables for the job under customer project. Customer
   * could do their own query &amp; analysis. There could be 4 log tables in
   * maximum:
   * 1. Training data logging predict request/response
   * 2. Serving data logging predict request/response
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable bigquery_tables = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTableOrBuilder>
      getBigqueryTablesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The created bigquery tables for the job under customer project. Customer
   * could do their own query &amp; analysis. There could be 4 log tables in
   * maximum:
   * 1. Training data logging predict request/response
   * 2. Serving data logging predict request/response
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable bigquery_tables = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTableOrBuilder
      getBigqueryTablesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The TTL of BigQuery tables in user projects which stores logs.
   * A day is the basic unit of the TTL and we take the ceil of TTL/86400(a
   * day). e.g. { second: 3600} indicates ttl = 1 day.
   * </pre>
   *
   * <code>.google.protobuf.Duration log_ttl = 17;</code>
   *
   * @return Whether the logTtl field is set.
   */
  boolean hasLogTtl();
  /**
   *
   *
   * <pre>
   * The TTL of BigQuery tables in user projects which stores logs.
   * A day is the basic unit of the TTL and we take the ceil of TTL/86400(a
   * day). e.g. { second: 3600} indicates ttl = 1 day.
   * </pre>
   *
   * <code>.google.protobuf.Duration log_ttl = 17;</code>
   *
   * @return The logTtl.
   */
  com.google.protobuf.Duration getLogTtl();
  /**
   *
   *
   * <pre>
   * The TTL of BigQuery tables in user projects which stores logs.
   * A day is the basic unit of the TTL and we take the ceil of TTL/86400(a
   * day). e.g. { second: 3600} indicates ttl = 1 day.
   * </pre>
   *
   * <code>.google.protobuf.Duration log_ttl = 17;</code>
   */
  com.google.protobuf.DurationOrBuilder getLogTtlOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your
   * ModelDeploymentMonitoringJob.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your
   * ModelDeploymentMonitoringJob.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your
   * ModelDeploymentMonitoringJob.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your
   * ModelDeploymentMonitoringJob.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your
   * ModelDeploymentMonitoringJob.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelDeploymentMonitoringJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelDeploymentMonitoringJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelDeploymentMonitoringJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelDeploymentMonitoringJob was updated most recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelDeploymentMonitoringJob was updated most recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelDeploymentMonitoringJob was updated most recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this monitoring pipeline will be scheduled to run for the
   * next round.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_schedule_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the nextScheduleTime field is set.
   */
  boolean hasNextScheduleTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this monitoring pipeline will be scheduled to run for the
   * next round.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_schedule_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The nextScheduleTime.
   */
  com.google.protobuf.Timestamp getNextScheduleTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this monitoring pipeline will be scheduled to run for the
   * next round.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_schedule_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getNextScheduleTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Stats anomalies base folder path.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination stats_anomalies_base_directory = 20;
   * </code>
   *
   * @return Whether the statsAnomaliesBaseDirectory field is set.
   */
  boolean hasStatsAnomaliesBaseDirectory();
  /**
   *
   *
   * <pre>
   * Stats anomalies base folder path.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination stats_anomalies_base_directory = 20;
   * </code>
   *
   * @return The statsAnomaliesBaseDirectory.
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestination getStatsAnomaliesBaseDirectory();
  /**
   *
   *
   * <pre>
   * Stats anomalies base folder path.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination stats_anomalies_base_directory = 20;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder
      getStatsAnomaliesBaseDirectoryOrBuilder();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a ModelDeploymentMonitoringJob. If
   * set, this ModelDeploymentMonitoringJob and all sub-resources of this
   * ModelDeploymentMonitoringJob will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 21;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a ModelDeploymentMonitoringJob. If
   * set, this ModelDeploymentMonitoringJob and all sub-resources of this
   * ModelDeploymentMonitoringJob will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 21;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a ModelDeploymentMonitoringJob. If
   * set, this ModelDeploymentMonitoringJob and all sub-resources of this
   * ModelDeploymentMonitoringJob will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 21;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * If true, the scheduled monitoring pipeline logs are sent to
   * Google Cloud Logging, including pipeline status and anomalies detected.
   * Please note the logs incur cost, which are subject to [Cloud Logging
   * pricing](https://cloud.google.com/logging#pricing).
   * </pre>
   *
   * <code>bool enable_monitoring_pipeline_logs = 22;</code>
   *
   * @return The enableMonitoringPipelineLogs.
   */
  boolean getEnableMonitoringPipelineLogs();

  /**
   *
   *
   * <pre>
   * Output only. Only populated when the job's state is `JOB_STATE_FAILED` or
   * `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. Only populated when the job's state is `JOB_STATE_FAILED` or
   * `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. Only populated when the job's state is `JOB_STATE_FAILED` or
   * `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}
