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
// source: google/cloud/aiplatform/v1beta1/pipeline_failure_policy.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Represents the failure policy of a pipeline. Currently, the default of a
 * pipeline is that the pipeline will continue to run until no more tasks can be
 * executed, also known as PIPELINE_FAILURE_POLICY_FAIL_SLOW. However, if a
 * pipeline is set to PIPELINE_FAILURE_POLICY_FAIL_FAST, it will stop scheduling
 * any new tasks when a task has failed. Any scheduled tasks will continue to
 * completion.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1beta1.PipelineFailurePolicy}
 */
public enum PipelineFailurePolicy implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value, and follows fail slow behavior.
   * </pre>
   *
   * <code>PIPELINE_FAILURE_POLICY_UNSPECIFIED = 0;</code>
   */
  PIPELINE_FAILURE_POLICY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Indicates that the pipeline should continue to run until all possible
   * tasks have been scheduled and completed.
   * </pre>
   *
   * <code>PIPELINE_FAILURE_POLICY_FAIL_SLOW = 1;</code>
   */
  PIPELINE_FAILURE_POLICY_FAIL_SLOW(1),
  /**
   *
   *
   * <pre>
   * Indicates that the pipeline should stop scheduling new tasks after a task
   * has failed.
   * </pre>
   *
   * <code>PIPELINE_FAILURE_POLICY_FAIL_FAST = 2;</code>
   */
  PIPELINE_FAILURE_POLICY_FAIL_FAST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value, and follows fail slow behavior.
   * </pre>
   *
   * <code>PIPELINE_FAILURE_POLICY_UNSPECIFIED = 0;</code>
   */
  public static final int PIPELINE_FAILURE_POLICY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Indicates that the pipeline should continue to run until all possible
   * tasks have been scheduled and completed.
   * </pre>
   *
   * <code>PIPELINE_FAILURE_POLICY_FAIL_SLOW = 1;</code>
   */
  public static final int PIPELINE_FAILURE_POLICY_FAIL_SLOW_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Indicates that the pipeline should stop scheduling new tasks after a task
   * has failed.
   * </pre>
   *
   * <code>PIPELINE_FAILURE_POLICY_FAIL_FAST = 2;</code>
   */
  public static final int PIPELINE_FAILURE_POLICY_FAIL_FAST_VALUE = 2;

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
  public static PipelineFailurePolicy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PipelineFailurePolicy forNumber(int value) {
    switch (value) {
      case 0:
        return PIPELINE_FAILURE_POLICY_UNSPECIFIED;
      case 1:
        return PIPELINE_FAILURE_POLICY_FAIL_SLOW;
      case 2:
        return PIPELINE_FAILURE_POLICY_FAIL_FAST;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PipelineFailurePolicy>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PipelineFailurePolicy>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PipelineFailurePolicy>() {
            public PipelineFailurePolicy findValueByNumber(int number) {
              return PipelineFailurePolicy.forNumber(number);
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
    return com.google.cloud.aiplatform.v1beta1.PipelineFailurePolicyProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final PipelineFailurePolicy[] VALUES = values();

  public static PipelineFailurePolicy valueOf(
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

  private PipelineFailurePolicy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.PipelineFailurePolicy)
}
