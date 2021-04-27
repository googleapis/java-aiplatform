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
// source: google/cloud/aiplatform/v1beta1/vizier_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface CompleteTrialRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CompleteTrialRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Trial's name.
   * Format:
   * `projects/{project}/locations/{location}/studies/{study}/trials/{trial}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The Trial's name.
   * Format:
   * `projects/{project}/locations/{location}/studies/{study}/trials/{trial}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. If provided, it will be used as the completed Trial's
   * final_measurement; Otherwise, the service will auto-select a
   * previously reported measurement as the final-measurement
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Measurement final_measurement = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the finalMeasurement field is set.
   */
  boolean hasFinalMeasurement();
  /**
   *
   *
   * <pre>
   * Optional. If provided, it will be used as the completed Trial's
   * final_measurement; Otherwise, the service will auto-select a
   * previously reported measurement as the final-measurement
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Measurement final_measurement = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The finalMeasurement.
   */
  com.google.cloud.aiplatform.v1beta1.Measurement getFinalMeasurement();
  /**
   *
   *
   * <pre>
   * Optional. If provided, it will be used as the completed Trial's
   * final_measurement; Otherwise, the service will auto-select a
   * previously reported measurement as the final-measurement
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Measurement final_measurement = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.MeasurementOrBuilder getFinalMeasurementOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. True if the Trial cannot be run with the given Parameter, and
   * final_measurement will be ignored.
   * </pre>
   *
   * <code>bool trial_infeasible = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The trialInfeasible.
   */
  boolean getTrialInfeasible();

  /**
   *
   *
   * <pre>
   * Optional. A human readable reason why the trial was infeasible. This should
   * only be provided if `trial_infeasible` is true.
   * </pre>
   *
   * <code>string infeasible_reason = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The infeasibleReason.
   */
  java.lang.String getInfeasibleReason();
  /**
   *
   *
   * <pre>
   * Optional. A human readable reason why the trial was infeasible. This should
   * only be provided if `trial_infeasible` is true.
   * </pre>
   *
   * <code>string infeasible_reason = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for infeasibleReason.
   */
  com.google.protobuf.ByteString getInfeasibleReasonBytes();
}
