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
// source: google/cloud/aiplatform/v1/schema/predict/prediction/tabular_classification.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public interface TabularClassificationPredictionResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.schema.predict.prediction.TabularClassificationPredictionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the classes being classified, contains all possible values of
   * the target column.
   * </pre>
   *
   * <code>repeated string classes = 1;</code>
   *
   * @return A list containing the classes.
   */
  java.util.List<java.lang.String> getClassesList();
  /**
   *
   *
   * <pre>
   * The name of the classes being classified, contains all possible values of
   * the target column.
   * </pre>
   *
   * <code>repeated string classes = 1;</code>
   *
   * @return The count of classes.
   */
  int getClassesCount();
  /**
   *
   *
   * <pre>
   * The name of the classes being classified, contains all possible values of
   * the target column.
   * </pre>
   *
   * <code>repeated string classes = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The classes at the given index.
   */
  java.lang.String getClasses(int index);
  /**
   *
   *
   * <pre>
   * The name of the classes being classified, contains all possible values of
   * the target column.
   * </pre>
   *
   * <code>repeated string classes = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the classes at the given index.
   */
  com.google.protobuf.ByteString getClassesBytes(int index);

  /**
   *
   *
   * <pre>
   * The model's confidence in each class being correct, higher
   * value means higher confidence. The N-th score corresponds to
   * the N-th class in classes.
   * </pre>
   *
   * <code>repeated float scores = 2;</code>
   *
   * @return A list containing the scores.
   */
  java.util.List<java.lang.Float> getScoresList();
  /**
   *
   *
   * <pre>
   * The model's confidence in each class being correct, higher
   * value means higher confidence. The N-th score corresponds to
   * the N-th class in classes.
   * </pre>
   *
   * <code>repeated float scores = 2;</code>
   *
   * @return The count of scores.
   */
  int getScoresCount();
  /**
   *
   *
   * <pre>
   * The model's confidence in each class being correct, higher
   * value means higher confidence. The N-th score corresponds to
   * the N-th class in classes.
   * </pre>
   *
   * <code>repeated float scores = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The scores at the given index.
   */
  float getScores(int index);
}
