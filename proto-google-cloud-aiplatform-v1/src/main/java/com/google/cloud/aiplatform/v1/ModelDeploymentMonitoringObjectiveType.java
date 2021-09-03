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
// source: google/cloud/aiplatform/v1/model_deployment_monitoring_job.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * The Model Monitoring Objective types.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1.ModelDeploymentMonitoringObjectiveType}
 */
public enum ModelDeploymentMonitoringObjectiveType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value, should not be set.
   * </pre>
   *
   * <code>MODEL_DEPLOYMENT_MONITORING_OBJECTIVE_TYPE_UNSPECIFIED = 0;</code>
   */
  MODEL_DEPLOYMENT_MONITORING_OBJECTIVE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Raw feature values' stats to detect skew between Training-Prediction
   * datasets.
   * </pre>
   *
   * <code>RAW_FEATURE_SKEW = 1;</code>
   */
  RAW_FEATURE_SKEW(1),
  /**
   *
   *
   * <pre>
   * Raw feature values' stats to detect drift between Serving-Prediction
   * datasets.
   * </pre>
   *
   * <code>RAW_FEATURE_DRIFT = 2;</code>
   */
  RAW_FEATURE_DRIFT(2),
  /**
   *
   *
   * <pre>
   * Feature attribution scores to detect skew between Training-Prediction
   * datasets.
   * </pre>
   *
   * <code>FEATURE_ATTRIBUTION_SKEW = 3;</code>
   */
  FEATURE_ATTRIBUTION_SKEW(3),
  /**
   *
   *
   * <pre>
   * Feature attribution scores to detect skew between Prediction datasets
   * collected within different time windows.
   * </pre>
   *
   * <code>FEATURE_ATTRIBUTION_DRIFT = 4;</code>
   */
  FEATURE_ATTRIBUTION_DRIFT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value, should not be set.
   * </pre>
   *
   * <code>MODEL_DEPLOYMENT_MONITORING_OBJECTIVE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int MODEL_DEPLOYMENT_MONITORING_OBJECTIVE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Raw feature values' stats to detect skew between Training-Prediction
   * datasets.
   * </pre>
   *
   * <code>RAW_FEATURE_SKEW = 1;</code>
   */
  public static final int RAW_FEATURE_SKEW_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Raw feature values' stats to detect drift between Serving-Prediction
   * datasets.
   * </pre>
   *
   * <code>RAW_FEATURE_DRIFT = 2;</code>
   */
  public static final int RAW_FEATURE_DRIFT_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Feature attribution scores to detect skew between Training-Prediction
   * datasets.
   * </pre>
   *
   * <code>FEATURE_ATTRIBUTION_SKEW = 3;</code>
   */
  public static final int FEATURE_ATTRIBUTION_SKEW_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Feature attribution scores to detect skew between Prediction datasets
   * collected within different time windows.
   * </pre>
   *
   * <code>FEATURE_ATTRIBUTION_DRIFT = 4;</code>
   */
  public static final int FEATURE_ATTRIBUTION_DRIFT_VALUE = 4;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ModelDeploymentMonitoringObjectiveType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ModelDeploymentMonitoringObjectiveType forNumber(int value) {
    switch (value) {
      case 0:
        return MODEL_DEPLOYMENT_MONITORING_OBJECTIVE_TYPE_UNSPECIFIED;
      case 1:
        return RAW_FEATURE_SKEW;
      case 2:
        return RAW_FEATURE_DRIFT;
      case 3:
        return FEATURE_ATTRIBUTION_SKEW;
      case 4:
        return FEATURE_ATTRIBUTION_DRIFT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ModelDeploymentMonitoringObjectiveType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<
          ModelDeploymentMonitoringObjectiveType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ModelDeploymentMonitoringObjectiveType>() {
            public ModelDeploymentMonitoringObjectiveType findValueByNumber(int number) {
              return ModelDeploymentMonitoringObjectiveType.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final ModelDeploymentMonitoringObjectiveType[] VALUES = values();

  public static ModelDeploymentMonitoringObjectiveType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ModelDeploymentMonitoringObjectiveType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.ModelDeploymentMonitoringObjectiveType)
}