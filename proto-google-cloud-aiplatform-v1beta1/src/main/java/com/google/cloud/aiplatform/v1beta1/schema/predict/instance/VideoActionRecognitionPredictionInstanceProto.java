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
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/video_action_recognition.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

public final class VideoActionRecognitionPredictionInstanceProto {
  private VideoActionRecognitionPredictionInstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nVgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/instance/video_action_recogniti"
          + "on.proto\0227google.cloud.aiplatform.v1beta"
          + "1.schema.predict.instance\"\204\001\n(VideoActio"
          + "nRecognitionPredictionInstance\022\017\n\007conten"
          + "t\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\t\022\032\n\022time_segme"
          + "nt_start\030\003 \001(\t\022\030\n\020time_segment_end\030\004 \001(\t"
          + "B\203\003\n;com.google.cloud.aiplatform.v1beta1"
          + ".schema.predict.instanceB-VideoActionRec"
          + "ognitionPredictionInstanceProtoP\001Z_googl"
          + "e.golang.org/genproto/googleapis/cloud/a"
          + "iplatform/v1beta1/schema/predict/instanc"
          + "e;instance\252\0027Google.Cloud.AIPlatform.V1B"
          + "eta1.Schema.Predict.Instance\312\0027Google\\Cl"
          + "oud\\AIPlatform\\V1beta1\\Schema\\Predict\\In"
          + "stance\352\002=Google::Cloud::AIPlatform::V1be"
          + "ta1::Schema::Predict::Instanceb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor,
            new java.lang.String[] {
              "Content", "MimeType", "TimeSegmentStart", "TimeSegmentEnd",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
