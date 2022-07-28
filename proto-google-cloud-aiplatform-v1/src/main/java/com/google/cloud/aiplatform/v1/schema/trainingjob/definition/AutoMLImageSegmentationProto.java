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
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_image_segmentation.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLImageSegmentationProto {
  private AutoMLImageSegmentationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nXgoogle/cloud/aiplatform/v1/schema/trai"
          + "ningjob/definition/automl_image_segmenta"
          + "tion.proto\0228google.cloud.aiplatform.v1.s"
          + "chema.trainingjob.definition\032\034google/api"
          + "/annotations.proto\"\357\001\n\027AutoMlImageSegmen"
          + "tation\022g\n\006inputs\030\001 \001(\0132W.google.cloud.ai"
          + "platform.v1.schema.trainingjob.definitio"
          + "n.AutoMlImageSegmentationInputs\022k\n\010metad"
          + "ata\030\002 \001(\0132Y.google.cloud.aiplatform.v1.s"
          + "chema.trainingjob.definition.AutoMlImage"
          + "SegmentationMetadata\"\311\002\n\035AutoMlImageSegm"
          + "entationInputs\022u\n\nmodel_type\030\001 \001(\0162a.goo"
          + "gle.cloud.aiplatform.v1.schema.trainingj"
          + "ob.definition.AutoMlImageSegmentationInp"
          + "uts.ModelType\022\037\n\027budget_milli_node_hours"
          + "\030\002 \001(\003\022\025\n\rbase_model_id\030\003 \001(\t\"y\n\tModelTy"
          + "pe\022\032\n\026MODEL_TYPE_UNSPECIFIED\020\000\022\031\n\025CLOUD_"
          + "HIGH_ACCURACY_1\020\001\022\030\n\024CLOUD_LOW_ACCURACY_"
          + "1\020\002\022\033\n\027MOBILE_TF_LOW_LATENCY_1\020\003\"\272\002\n\037Aut"
          + "oMlImageSegmentationMetadata\022\035\n\025cost_mil"
          + "li_node_hours\030\001 \001(\003\022\216\001\n\026successful_stop_"
          + "reason\030\002 \001(\0162n.google.cloud.aiplatform.v"
          + "1.schema.trainingjob.definition.AutoMlIm"
          + "ageSegmentationMetadata.SuccessfulStopRe"
          + "ason\"g\n\024SuccessfulStopReason\022&\n\"SUCCESSF"
          + "UL_STOP_REASON_UNSPECIFIED\020\000\022\022\n\016BUDGET_R"
          + "EACHED\020\001\022\023\n\017MODEL_CONVERGED\020\002B\371\002\n<com.go"
          + "ogle.cloud.aiplatform.v1.schema.training"
          + "job.definitionB\034AutoMLImageSegmentationP"
          + "rotoP\001Zbgoogle.golang.org/genproto/googl"
          + "eapis/cloud/aiplatform/v1/schema/trainin"
          + "gjob/definition;definition\252\0028Google.Clou"
          + "d.AIPlatform.V1.Schema.TrainingJob.Defin"
          + "ition\312\0028Google\\Cloud\\AIPlatform\\V1\\Schem"
          + "a\\TrainingJob\\Definition\352\002>Google::Cloud"
          + "::AIPlatform::V1::Schema::TrainingJob::D"
          + "efinitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor,
            new java.lang.String[] {
              "Inputs", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_descriptor,
            new java.lang.String[] {
              "ModelType", "BudgetMilliNodeHours", "BaseModelId",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_descriptor,
            new java.lang.String[] {
              "CostMilliNodeHours", "SuccessfulStopReason",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
