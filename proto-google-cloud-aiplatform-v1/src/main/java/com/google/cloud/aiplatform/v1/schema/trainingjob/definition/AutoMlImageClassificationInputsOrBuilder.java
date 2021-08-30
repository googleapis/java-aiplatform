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
// source:
// google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_image_classification.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public interface AutoMlImageClassificationInputsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageClassificationInputs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageClassificationInputs.ModelType model_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for modelType.
   */
  int getModelTypeValue();
  /**
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageClassificationInputs.ModelType model_type = 1;
   * </code>
   *
   * @return The modelType.
   */
  com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageClassificationInputs
          .ModelType
      getModelType();

  /**
   *
   *
   * <pre>
   * The ID of the `base` model. If it is specified, the new model will be
   * trained based on the `base` model. Otherwise, the new model will be
   * trained from scratch. The `base` model must be in the same
   * Project and Location as the new Model to train, and have the same
   * modelType.
   * </pre>
   *
   * <code>string base_model_id = 2;</code>
   *
   * @return The baseModelId.
   */
  java.lang.String getBaseModelId();
  /**
   *
   *
   * <pre>
   * The ID of the `base` model. If it is specified, the new model will be
   * trained based on the `base` model. Otherwise, the new model will be
   * trained from scratch. The `base` model must be in the same
   * Project and Location as the new Model to train, and have the same
   * modelType.
   * </pre>
   *
   * <code>string base_model_id = 2;</code>
   *
   * @return The bytes for baseModelId.
   */
  com.google.protobuf.ByteString getBaseModelIdBytes();

  /**
   *
   *
   * <pre>
   * The training budget of creating this model, expressed in milli node
   * hours i.e. 1,000 value in this field means 1 node hour. The actual
   * metadata.costMilliNodeHours will be equal or less than this value.
   * If further model training ceases to provide any improvements, it will
   * stop without using the full budget and the metadata.successfulStopReason
   * will be `model-converged`.
   * Note, node_hour  = actual_hour * number_of_nodes_involved.
   * For modelType `cloud`(default), the budget must be between 8,000
   * and 800,000 milli node hours, inclusive. The default value is 192,000
   * which represents one day in wall time, considering 8 nodes are used.
   * For model types `mobile-tf-low-latency-1`, `mobile-tf-versatile-1`,
   * `mobile-tf-high-accuracy-1`, the training budget must be between
   * 1,000 and 100,000 milli node hours, inclusive.
   * The default value is 24,000 which represents one day in wall time on a
   * single node that is used.
   * </pre>
   *
   * <code>int64 budget_milli_node_hours = 3;</code>
   *
   * @return The budgetMilliNodeHours.
   */
  long getBudgetMilliNodeHours();

  /**
   *
   *
   * <pre>
   * Use the entire training budget. This disables the early stopping feature.
   * When false the early stopping feature is enabled, which means that
   * AutoML Image Classification might stop training before the entire
   * training budget has been used.
   * </pre>
   *
   * <code>bool disable_early_stopping = 4;</code>
   *
   * @return The disableEarlyStopping.
   */
  boolean getDisableEarlyStopping();

  /**
   *
   *
   * <pre>
   * If false, a single-label (multi-class) Model will be trained (i.e.
   * assuming that for each image just up to one annotation may be
   * applicable). If true, a multi-label Model will be trained (i.e.
   * assuming that for each image multiple annotations may be applicable).
   * </pre>
   *
   * <code>bool multi_label = 5;</code>
   *
   * @return The multiLabel.
   */
  boolean getMultiLabel();
}
