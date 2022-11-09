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
// source: google/cloud/aiplatform/v1beta1/model_monitoring.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ModelMonitoringObjectiveConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Training dataset for models. This field has to be set only if
   * TrainingPredictionSkewDetectionConfig is specified.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.TrainingDataset training_dataset = 1;
   * </code>
   *
   * @return Whether the trainingDataset field is set.
   */
  boolean hasTrainingDataset();
  /**
   *
   *
   * <pre>
   * Training dataset for models. This field has to be set only if
   * TrainingPredictionSkewDetectionConfig is specified.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.TrainingDataset training_dataset = 1;
   * </code>
   *
   * @return The trainingDataset.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.TrainingDataset
      getTrainingDataset();
  /**
   *
   *
   * <pre>
   * Training dataset for models. This field has to be set only if
   * TrainingPredictionSkewDetectionConfig is specified.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.TrainingDataset training_dataset = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.TrainingDatasetOrBuilder
      getTrainingDatasetOrBuilder();

  /**
   *
   *
   * <pre>
   * The config for skew between training data and prediction data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.TrainingPredictionSkewDetectionConfig training_prediction_skew_detection_config = 2;
   * </code>
   *
   * @return Whether the trainingPredictionSkewDetectionConfig field is set.
   */
  boolean hasTrainingPredictionSkewDetectionConfig();
  /**
   *
   *
   * <pre>
   * The config for skew between training data and prediction data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.TrainingPredictionSkewDetectionConfig training_prediction_skew_detection_config = 2;
   * </code>
   *
   * @return The trainingPredictionSkewDetectionConfig.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig
          .TrainingPredictionSkewDetectionConfig
      getTrainingPredictionSkewDetectionConfig();
  /**
   *
   *
   * <pre>
   * The config for skew between training data and prediction data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.TrainingPredictionSkewDetectionConfig training_prediction_skew_detection_config = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig
          .TrainingPredictionSkewDetectionConfigOrBuilder
      getTrainingPredictionSkewDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The config for drift of prediction data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.PredictionDriftDetectionConfig prediction_drift_detection_config = 3;
   * </code>
   *
   * @return Whether the predictionDriftDetectionConfig field is set.
   */
  boolean hasPredictionDriftDetectionConfig();
  /**
   *
   *
   * <pre>
   * The config for drift of prediction data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.PredictionDriftDetectionConfig prediction_drift_detection_config = 3;
   * </code>
   *
   * @return The predictionDriftDetectionConfig.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.PredictionDriftDetectionConfig
      getPredictionDriftDetectionConfig();
  /**
   *
   *
   * <pre>
   * The config for drift of prediction data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.PredictionDriftDetectionConfig prediction_drift_detection_config = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig
          .PredictionDriftDetectionConfigOrBuilder
      getPredictionDriftDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The config for integrating with Vertex Explainable AI.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.ExplanationConfig explanation_config = 5;
   * </code>
   *
   * @return Whether the explanationConfig field is set.
   */
  boolean hasExplanationConfig();
  /**
   *
   *
   * <pre>
   * The config for integrating with Vertex Explainable AI.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.ExplanationConfig explanation_config = 5;
   * </code>
   *
   * @return The explanationConfig.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.ExplanationConfig
      getExplanationConfig();
  /**
   *
   *
   * <pre>
   * The config for integrating with Vertex Explainable AI.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.ExplanationConfig explanation_config = 5;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.ExplanationConfigOrBuilder
      getExplanationConfigOrBuilder();
}
