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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface NeighborOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Neighbor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The neighbor id.
   * </pre>
   *
   * <code>string neighbor_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The neighborId.
   */
  java.lang.String getNeighborId();
  /**
   *
   *
   * <pre>
   * Output only. The neighbor id.
   * </pre>
   *
   * <code>string neighbor_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for neighborId.
   */
  com.google.protobuf.ByteString getNeighborIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The neighbor distance.
   * </pre>
   *
   * <code>double neighbor_distance = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The neighborDistance.
   */
  double getNeighborDistance();
}
