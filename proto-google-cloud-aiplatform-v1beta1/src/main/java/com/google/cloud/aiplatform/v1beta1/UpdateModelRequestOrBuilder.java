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
// source: google/cloud/aiplatform/v1beta1/model_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface UpdateModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Model which replaces the resource on the server.
   * When Model Versioning is enabled, the model.name will be used to determine
   * whether to update the model or model version.
   * 1. model.name with the &#64; value, e.g. models/123&#64;1, refers to a version
   * specific update.
   * 2. model.name without the &#64; value, e.g. models/123, refers to a model
   * update.
   * 3. model.name with &#64;-, e.g. models/123&#64;-, refers to a model update.
   * 4. Supported model fields: display_name, description; supported
   * version-specific fields: version_description. Labels are supported in both
   * scenarios. Both the model labels and the version labels are merged when a
   * model is returned. When updating labels, if the request is for
   * model-specific update, model label gets updated. Otherwise, version labels
   * get updated.
   * 5. A model name or model version name fields update mismatch will cause a
   * precondition error.
   * 6. One request cannot update both the model and the version fields. You
   * must update them separately.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   *
   *
   * <pre>
   * Required. The Model which replaces the resource on the server.
   * When Model Versioning is enabled, the model.name will be used to determine
   * whether to update the model or model version.
   * 1. model.name with the &#64; value, e.g. models/123&#64;1, refers to a version
   * specific update.
   * 2. model.name without the &#64; value, e.g. models/123, refers to a model
   * update.
   * 3. model.name with &#64;-, e.g. models/123&#64;-, refers to a model update.
   * 4. Supported model fields: display_name, description; supported
   * version-specific fields: version_description. Labels are supported in both
   * scenarios. Both the model labels and the version labels are merged when a
   * model is returned. When updating labels, if the request is for
   * model-specific update, model label gets updated. Otherwise, version labels
   * get updated.
   * 5. A model name or model version name fields update mismatch will cause a
   * precondition error.
   * 6. One request cannot update both the model and the version fields. You
   * must update them separately.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The model.
   */
  com.google.cloud.aiplatform.v1beta1.Model getModel();
  /**
   *
   *
   * <pre>
   * Required. The Model which replaces the resource on the server.
   * When Model Versioning is enabled, the model.name will be used to determine
   * whether to update the model or model version.
   * 1. model.name with the &#64; value, e.g. models/123&#64;1, refers to a version
   * specific update.
   * 2. model.name without the &#64; value, e.g. models/123, refers to a model
   * update.
   * 3. model.name with &#64;-, e.g. models/123&#64;-, refers to a model update.
   * 4. Supported model fields: display_name, description; supported
   * version-specific fields: version_description. Labels are supported in both
   * scenarios. Both the model labels and the version labels are merged when a
   * model is returned. When updating labels, if the request is for
   * model-specific update, model label gets updated. Otherwise, version labels
   * get updated.
   * 5. A model name or model version name fields update mismatch will cause a
   * precondition error.
   * 6. One request cannot update both the model and the version fields. You
   * must update them separately.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Model model = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelOrBuilder getModelOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
