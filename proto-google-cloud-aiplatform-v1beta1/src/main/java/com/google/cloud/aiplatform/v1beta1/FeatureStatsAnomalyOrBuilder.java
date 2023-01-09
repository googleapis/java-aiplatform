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
// source: google/cloud/aiplatform/v1beta1/feature_monitoring_stats.proto

package com.google.cloud.aiplatform.v1beta1;

public interface FeatureStatsAnomalyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Feature importance score, only populated when cross-feature monitoring is
   * enabled. For now only used to represent feature attribution score within
   * range [0, 1] for
   * [ModelDeploymentMonitoringObjectiveType.FEATURE_ATTRIBUTION_SKEW][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveType.FEATURE_ATTRIBUTION_SKEW]
   * and
   * [ModelDeploymentMonitoringObjectiveType.FEATURE_ATTRIBUTION_DRIFT][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveType.FEATURE_ATTRIBUTION_DRIFT].
   * </pre>
   *
   * <code>double score = 1;</code>
   *
   * @return The score.
   */
  double getScore();

  /**
   *
   *
   * <pre>
   * Path of the stats file for current feature values in Cloud Storage bucket.
   * Format: gs://&lt;bucket_name&gt;/&lt;object_name&gt;/stats.
   * Example: gs://monitoring_bucket/feature_name/stats.
   * Stats are stored as binary format with Protobuf message
   * [tensorflow.metadata.v0.FeatureNameStatistics](https://github.com/tensorflow/metadata/blob/master/tensorflow_metadata/proto/v0/statistics.proto).
   * </pre>
   *
   * <code>string stats_uri = 3;</code>
   *
   * @return The statsUri.
   */
  java.lang.String getStatsUri();
  /**
   *
   *
   * <pre>
   * Path of the stats file for current feature values in Cloud Storage bucket.
   * Format: gs://&lt;bucket_name&gt;/&lt;object_name&gt;/stats.
   * Example: gs://monitoring_bucket/feature_name/stats.
   * Stats are stored as binary format with Protobuf message
   * [tensorflow.metadata.v0.FeatureNameStatistics](https://github.com/tensorflow/metadata/blob/master/tensorflow_metadata/proto/v0/statistics.proto).
   * </pre>
   *
   * <code>string stats_uri = 3;</code>
   *
   * @return The bytes for statsUri.
   */
  com.google.protobuf.ByteString getStatsUriBytes();

  /**
   *
   *
   * <pre>
   * Path of the anomaly file for current feature values in Cloud Storage
   * bucket.
   * Format: gs://&lt;bucket_name&gt;/&lt;object_name&gt;/anomalies.
   * Example: gs://monitoring_bucket/feature_name/anomalies.
   * Stats are stored as binary format with Protobuf message
   * Anoamlies are stored as binary format with Protobuf message
   * [tensorflow.metadata.v0.AnomalyInfo]
   * (https://github.com/tensorflow/metadata/blob/master/tensorflow_metadata/proto/v0/anomalies.proto).
   * </pre>
   *
   * <code>string anomaly_uri = 4;</code>
   *
   * @return The anomalyUri.
   */
  java.lang.String getAnomalyUri();
  /**
   *
   *
   * <pre>
   * Path of the anomaly file for current feature values in Cloud Storage
   * bucket.
   * Format: gs://&lt;bucket_name&gt;/&lt;object_name&gt;/anomalies.
   * Example: gs://monitoring_bucket/feature_name/anomalies.
   * Stats are stored as binary format with Protobuf message
   * Anoamlies are stored as binary format with Protobuf message
   * [tensorflow.metadata.v0.AnomalyInfo]
   * (https://github.com/tensorflow/metadata/blob/master/tensorflow_metadata/proto/v0/anomalies.proto).
   * </pre>
   *
   * <code>string anomaly_uri = 4;</code>
   *
   * @return The bytes for anomalyUri.
   */
  com.google.protobuf.ByteString getAnomalyUriBytes();

  /**
   *
   *
   * <pre>
   * Deviation from the current stats to baseline stats.
   *   1. For categorical feature, the distribution distance is calculated by
   *      L-inifinity norm.
   *   2. For numerical feature, the distribution distance is calculated by
   *      Jensen–Shannon divergence.
   * </pre>
   *
   * <code>double distribution_deviation = 5;</code>
   *
   * @return The distributionDeviation.
   */
  double getDistributionDeviation();

  /**
   *
   *
   * <pre>
   * This is the threshold used when detecting anomalies.
   * The threshold can be changed by user, so this one might be different from
   * [ThresholdConfig.value][google.cloud.aiplatform.v1beta1.ThresholdConfig.value].
   * </pre>
   *
   * <code>double anomaly_detection_threshold = 9;</code>
   *
   * @return The anomalyDetectionThreshold.
   */
  double getAnomalyDetectionThreshold();

  /**
   *
   *
   * <pre>
   * The start timestamp of window where stats were generated.
   * For objectives where time window doesn't make sense (e.g. Featurestore
   * Snapshot Monitoring), start_time is only used to indicate the monitoring
   * intervals, so it always equals to (end_time - monitoring_interval).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The start timestamp of window where stats were generated.
   * For objectives where time window doesn't make sense (e.g. Featurestore
   * Snapshot Monitoring), start_time is only used to indicate the monitoring
   * intervals, so it always equals to (end_time - monitoring_interval).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The start timestamp of window where stats were generated.
   * For objectives where time window doesn't make sense (e.g. Featurestore
   * Snapshot Monitoring), start_time is only used to indicate the monitoring
   * intervals, so it always equals to (end_time - monitoring_interval).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The end timestamp of window where stats were generated.
   * For objectives where time window doesn't make sense (e.g. Featurestore
   * Snapshot Monitoring), end_time indicates the timestamp of the data used to
   * generate stats (e.g. timestamp we take snapshots for feature values).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The end timestamp of window where stats were generated.
   * For objectives where time window doesn't make sense (e.g. Featurestore
   * Snapshot Monitoring), end_time indicates the timestamp of the data used to
   * generate stats (e.g. timestamp we take snapshots for feature values).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The end timestamp of window where stats were generated.
   * For objectives where time window doesn't make sense (e.g. Featurestore
   * Snapshot Monitoring), end_time indicates the timestamp of the data used to
   * generate stats (e.g. timestamp we take snapshots for feature values).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
