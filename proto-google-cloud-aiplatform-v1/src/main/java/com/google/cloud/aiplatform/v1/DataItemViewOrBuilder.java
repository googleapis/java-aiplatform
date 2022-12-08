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
// source: google/cloud/aiplatform/v1/dataset_service.proto

package com.google.cloud.aiplatform.v1;

public interface DataItemViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DataItemView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The DataItem.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DataItem data_item = 1;</code>
   *
   * @return Whether the dataItem field is set.
   */
  boolean hasDataItem();
  /**
   *
   *
   * <pre>
   * The DataItem.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DataItem data_item = 1;</code>
   *
   * @return The dataItem.
   */
  com.google.cloud.aiplatform.v1.DataItem getDataItem();
  /**
   *
   *
   * <pre>
   * The DataItem.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DataItem data_item = 1;</code>
   */
  com.google.cloud.aiplatform.v1.DataItemOrBuilder getDataItemOrBuilder();

  /**
   *
   *
   * <pre>
   * The Annotations on the DataItem. If too many Annotations should be returned
   * for the DataItem, this field will be truncated per annotations_limit in
   * request. If it was, then the has_truncated_annotations will be set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Annotation annotations = 2;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Annotation> getAnnotationsList();
  /**
   *
   *
   * <pre>
   * The Annotations on the DataItem. If too many Annotations should be returned
   * for the DataItem, this field will be truncated per annotations_limit in
   * request. If it was, then the has_truncated_annotations will be set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Annotation annotations = 2;</code>
   */
  com.google.cloud.aiplatform.v1.Annotation getAnnotations(int index);
  /**
   *
   *
   * <pre>
   * The Annotations on the DataItem. If too many Annotations should be returned
   * for the DataItem, this field will be truncated per annotations_limit in
   * request. If it was, then the has_truncated_annotations will be set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Annotation annotations = 2;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * The Annotations on the DataItem. If too many Annotations should be returned
   * for the DataItem, this field will be truncated per annotations_limit in
   * request. If it was, then the has_truncated_annotations will be set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Annotation annotations = 2;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.AnnotationOrBuilder>
      getAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Annotations on the DataItem. If too many Annotations should be returned
   * for the DataItem, this field will be truncated per annotations_limit in
   * request. If it was, then the has_truncated_annotations will be set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Annotation annotations = 2;</code>
   */
  com.google.cloud.aiplatform.v1.AnnotationOrBuilder getAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * True if and only if the Annotations field has been truncated. It happens if
   * more Annotations for this DataItem met the request's annotation_filter than
   * are allowed to be returned by annotations_limit.
   * Note that if Annotations field is not being returned due to field mask,
   * then this field will not be set to true no matter how many Annotations are
   * there.
   * </pre>
   *
   * <code>bool has_truncated_annotations = 3;</code>
   *
   * @return The hasTruncatedAnnotations.
   */
  boolean getHasTruncatedAnnotations();
}