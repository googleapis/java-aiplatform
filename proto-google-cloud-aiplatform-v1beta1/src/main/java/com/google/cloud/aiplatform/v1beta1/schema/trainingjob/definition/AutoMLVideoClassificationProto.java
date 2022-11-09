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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_video_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLVideoClassificationProto {
  private AutoMLVideoClassificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n_google/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_video_cla"
          + "ssification.proto\022=google.cloud.aiplatfo"
          + "rm.v1beta1.schema.trainingjob.definition"
          + "\"\213\001\n\031AutoMlVideoClassification\022n\n\006inputs"
          + "\030\001 \001(\0132^.google.cloud.aiplatform.v1beta1"
          + ".schema.trainingjob.definition.AutoMlVid"
          + "eoClassificationInputs\"\212\002\n\037AutoMlVideoCl"
          + "assificationInputs\022|\n\nmodel_type\030\001 \001(\0162h"
          + ".google.cloud.aiplatform.v1beta1.schema."
          + "trainingjob.definition.AutoMlVideoClassi"
          + "ficationInputs.ModelType\"i\n\tModelType\022\032\n"
          + "\026MODEL_TYPE_UNSPECIFIED\020\000\022\t\n\005CLOUD\020\001\022\026\n\022"
          + "MOBILE_VERSATILE_1\020\002\022\035\n\031MOBILE_JETSON_VE"
          + "RSATILE_1\020\003B\224\003\nAcom.google.cloud.aiplatf"
          + "orm.v1beta1.schema.trainingjob.definitio"
          + "nB\036AutoMLVideoClassificationProtoP\001Zggoo"
          + "gle.golang.org/genproto/googleapis/cloud"
          + "/aiplatform/v1beta1/schema/trainingjob/d"
          + "efinition;definition\252\002=Google.Cloud.AIPl"
          + "atform.V1Beta1.Schema.TrainingJob.Defini"
          + "tion\312\002=Google\\Cloud\\AIPlatform\\V1beta1\\S"
          + "chema\\TrainingJob\\Definition\352\002CGoogle::C"
          + "loud::AIPlatform::V1beta1::Schema::Train"
          + "ingJob::Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor,
            new java.lang.String[] {
              "ModelType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
