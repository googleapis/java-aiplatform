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
// source: google/cloud/aiplatform/v1/model_evaluation_slice.proto

package com.google.cloud.aiplatform.v1;

public final class ModelEvaluationSliceProto {
  private ModelEvaluationSliceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_Slice_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_Slice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1/model_evalu"
          + "ation_slice.proto\022\032google.cloud.aiplatfo"
          + "rm.v1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\034google/protob"
          + "uf/struct.proto\032\037google/protobuf/timesta"
          + "mp.proto\032\034google/api/annotations.proto\"\306"
          + "\003\n\024ModelEvaluationSlice\022\021\n\004name\030\001 \001(\tB\003\340"
          + "A\003\022J\n\005slice\030\002 \001(\01326.google.cloud.aiplatf"
          + "orm.v1.ModelEvaluationSlice.SliceB\003\340A\003\022\037"
          + "\n\022metrics_schema_uri\030\003 \001(\tB\003\340A\003\022,\n\007metri"
          + "cs\030\004 \001(\0132\026.google.protobuf.ValueB\003\340A\003\0224\n"
          + "\013create_time\030\005 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\0323\n\005Slice\022\026\n\tdimension\030\001 \001(\tB"
          + "\003\340A\003\022\022\n\005value\030\002 \001(\tB\003\340A\003:\224\001\352A\220\001\n.aiplatf"
          + "orm.googleapis.com/ModelEvaluationSlice\022"
          + "^projects/{project}/locations/{location}"
          + "/models/{model}/evaluations/{evaluation}"
          + "/slices/{slice}B\335\001\n\036com.google.cloud.aip"
          + "latform.v1B\031ModelEvaluationSliceProtoP\001Z"
          + "Dgoogle.golang.org/genproto/googleapis/c"
          + "loud/aiplatform/v1;aiplatform\252\002\032Google.C"
          + "loud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlat"
          + "form\\V1\352\002\035Google::Cloud::AIPlatform::V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_descriptor,
            new java.lang.String[] {
              "Name", "Slice", "MetricsSchemaUri", "Metrics", "CreateTime",
            });
    internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_Slice_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_Slice_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelEvaluationSlice_Slice_descriptor,
            new java.lang.String[] {
              "Dimension", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
