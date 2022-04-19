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
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/video_object_tracking.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class VideoObjectTrackingPredictionResultProto {
  private VideoObjectTrackingPredictionResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nUgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/prediction/video_object_trackin"
          + "g.proto\0229google.cloud.aiplatform.v1beta1"
          + ".schema.predict.prediction\032\036google/proto"
          + "buf/duration.proto\032\036google/protobuf/wrap"
          + "pers.proto\032\034google/api/annotations.proto"
          + "\"\304\004\n#VideoObjectTrackingPredictionResult"
          + "\022\n\n\002id\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\0225\n\022ti"
          + "me_segment_start\030\003 \001(\0132\031.google.protobuf"
          + ".Duration\0223\n\020time_segment_end\030\004 \001(\0132\031.go"
          + "ogle.protobuf.Duration\022/\n\nconfidence\030\005 \001"
          + "(\0132\033.google.protobuf.FloatValue\022t\n\006frame"
          + "s\030\006 \003(\0132d.google.cloud.aiplatform.v1beta"
          + "1.schema.predict.prediction.VideoObjectT"
          + "rackingPredictionResult.Frame\032\347\001\n\005Frame\022"
          + ".\n\013time_offset\030\001 \001(\0132\031.google.protobuf.D"
          + "uration\022*\n\005x_min\030\002 \001(\0132\033.google.protobuf"
          + ".FloatValue\022*\n\005x_max\030\003 \001(\0132\033.google.prot"
          + "obuf.FloatValue\022*\n\005y_min\030\004 \001(\0132\033.google."
          + "protobuf.FloatValue\022*\n\005y_max\030\005 \001(\0132\033.goo"
          + "gle.protobuf.FloatValueB\320\001\n=com.google.c"
          + "loud.aiplatform.v1beta1.schema.predict.p"
          + "redictionB(VideoObjectTrackingPrediction"
          + "ResultProtoP\001Zcgoogle.golang.org/genprot"
          + "o/googleapis/cloud/aiplatform/v1beta1/sc"
          + "hema/predict/prediction;predictionb\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_descriptor,
            new java.lang.String[] {
              "Id", "DisplayName", "TimeSegmentStart", "TimeSegmentEnd", "Confidence", "Frames",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_descriptor,
            new java.lang.String[] {
              "TimeOffset", "XMin", "XMax", "YMin", "YMax",
            });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}