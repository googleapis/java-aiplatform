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
// source: google/cloud/aiplatform/v1/vizier_service.proto

package com.google.cloud.aiplatform.v1;

public interface SuggestTrialsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SuggestTrialsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of Trials.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Trial> getTrialsList();
  /**
   *
   *
   * <pre>
   * A list of Trials.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Trial getTrials(int index);
  /**
   *
   *
   * <pre>
   * A list of Trials.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  int getTrialsCount();
  /**
   *
   *
   * <pre>
   * A list of Trials.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TrialOrBuilder> getTrialsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of Trials.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial trials = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TrialOrBuilder getTrialsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The state of the Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Study.State study_state = 2;</code>
   *
   * @return The enum numeric value on the wire for studyState.
   */
  int getStudyStateValue();
  /**
   *
   *
   * <pre>
   * The state of the Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Study.State study_state = 2;</code>
   *
   * @return The studyState.
   */
  com.google.cloud.aiplatform.v1.Study.State getStudyState();

  /**
   *
   *
   * <pre>
   * The time at which the operation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The time at which the operation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The time at which the operation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which operation processing completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time at which operation processing completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time at which operation processing completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
