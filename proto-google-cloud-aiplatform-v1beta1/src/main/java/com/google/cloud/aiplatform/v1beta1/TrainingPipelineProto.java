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
// source: google/cloud/aiplatform/v1beta1/training_pipeline.proto

package com.google.cloud.aiplatform.v1beta1;

public final class TrainingPipelineProto {
  private TrainingPipelineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1beta1/traini"
          + "ng_pipeline.proto\022\037google.cloud.aiplatfo"
          + "rm.v1beta1\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\0325google/c"
          + "loud/aiplatform/v1beta1/encryption_spec."
          + "proto\032(google/cloud/aiplatform/v1beta1/i"
          + "o.proto\032+google/cloud/aiplatform/v1beta1"
          + "/model.proto\0324google/cloud/aiplatform/v1"
          + "beta1/pipeline_state.proto\032\034google/proto"
          + "buf/struct.proto\032\037google/protobuf/timest"
          + "amp.proto\032\027google/rpc/status.proto\"\247\010\n\020T"
          + "rainingPipeline\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014di"
          + "splay_name\030\002 \001(\tB\003\340A\002\022K\n\021input_data_conf"
          + "ig\030\003 \001(\01320.google.cloud.aiplatform.v1bet"
          + "a1.InputDataConfig\022%\n\030training_task_defi"
          + "nition\030\004 \001(\tB\003\340A\002\0229\n\024training_task_input"
          + "s\030\005 \001(\0132\026.google.protobuf.ValueB\003\340A\002\022;\n\026"
          + "training_task_metadata\030\006 \001(\0132\026.google.pr"
          + "otobuf.ValueB\003\340A\003\022?\n\017model_to_upload\030\007 \001"
          + "(\0132&.google.cloud.aiplatform.v1beta1.Mod"
          + "el\022\025\n\010model_id\030\026 \001(\tB\003\340A\001\022\031\n\014parent_mode"
          + "l\030\025 \001(\tB\003\340A\001\022B\n\005state\030\t \001(\0162..google.clo"
          + "ud.aiplatform.v1beta1.PipelineStateB\003\340A\003"
          + "\022&\n\005error\030\n \001(\0132\022.google.rpc.StatusB\003\340A\003"
          + "\0224\n\013create_time\030\013 \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003\0223\n\nstart_time\030\014 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\0221\n\010end_time\030"
          + "\r \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224"
          + "\n\013update_time\030\016 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\022M\n\006labels\030\017 \003(\0132=.google.cl"
          + "oud.aiplatform.v1beta1.TrainingPipeline."
          + "LabelsEntry\022H\n\017encryption_spec\030\022 \001(\0132/.g"
          + "oogle.cloud.aiplatform.v1beta1.Encryptio"
          + "nSpec\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val"
          + "ue\030\002 \001(\t:\0028\001:~\352A{\n*aiplatform.googleapis"
          + ".com/TrainingPipeline\022Mprojects/{project"
          + "}/locations/{location}/trainingPipelines"
          + "/{training_pipeline}\"\322\005\n\017InputDataConfig"
          + "\022H\n\016fraction_split\030\002 \001(\0132..google.cloud."
          + "aiplatform.v1beta1.FractionSplitH\000\022D\n\014fi"
          + "lter_split\030\003 \001(\0132,.google.cloud.aiplatfo"
          + "rm.v1beta1.FilterSplitH\000\022L\n\020predefined_s"
          + "plit\030\004 \001(\01320.google.cloud.aiplatform.v1b"
          + "eta1.PredefinedSplitH\000\022J\n\017timestamp_spli"
          + "t\030\005 \001(\0132/.google.cloud.aiplatform.v1beta"
          + "1.TimestampSplitH\000\022L\n\020stratified_split\030\014"
          + " \001(\01320.google.cloud.aiplatform.v1beta1.S"
          + "tratifiedSplitH\000\022J\n\017gcs_destination\030\010 \001("
          + "\0132/.google.cloud.aiplatform.v1beta1.GcsD"
          + "estinationH\001\022T\n\024bigquery_destination\030\n \001"
          + "(\01324.google.cloud.aiplatform.v1beta1.Big"
          + "QueryDestinationH\001\022\027\n\ndataset_id\030\001 \001(\tB\003"
          + "\340A\002\022\032\n\022annotations_filter\030\006 \001(\t\022\035\n\025annot"
          + "ation_schema_uri\030\t \001(\t\022\026\n\016saved_query_id"
          + "\030\007 \001(\t\022!\n\031persist_ml_use_assignment\030\013 \001("
          + "\010B\007\n\005splitB\r\n\013destination\"^\n\rFractionSpl"
          + "it\022\031\n\021training_fraction\030\001 \001(\001\022\033\n\023validat"
          + "ion_fraction\030\002 \001(\001\022\025\n\rtest_fraction\030\003 \001("
          + "\001\"e\n\013FilterSplit\022\034\n\017training_filter\030\001 \001("
          + "\tB\003\340A\002\022\036\n\021validation_filter\030\002 \001(\tB\003\340A\002\022\030"
          + "\n\013test_filter\030\003 \001(\tB\003\340A\002\"#\n\017PredefinedSp"
          + "lit\022\020\n\003key\030\001 \001(\tB\003\340A\002\"q\n\016TimestampSplit\022"
          + "\031\n\021training_fraction\030\001 \001(\001\022\033\n\023validation"
          + "_fraction\030\002 \001(\001\022\025\n\rtest_fraction\030\003 \001(\001\022\020"
          + "\n\003key\030\004 \001(\tB\003\340A\002\"r\n\017StratifiedSplit\022\031\n\021t"
          + "raining_fraction\030\001 \001(\001\022\033\n\023validation_fra"
          + "ction\030\002 \001(\001\022\025\n\rtest_fraction\030\003 \001(\001\022\020\n\003ke"
          + "y\030\004 \001(\tB\003\340A\002B\362\001\n#com.google.cloud.aiplat"
          + "form.v1beta1B\025TrainingPipelineProtoP\001ZIg"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/aiplatform/v1beta1;aiplatform\252\002\037Googl"
          + "e.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Clou"
          + "d\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AI"
          + "Platform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "InputDataConfig",
              "TrainingTaskDefinition",
              "TrainingTaskInputs",
              "TrainingTaskMetadata",
              "ModelToUpload",
              "ModelId",
              "ParentModel",
              "State",
              "Error",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Labels",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_descriptor,
            new java.lang.String[] {
              "FractionSplit",
              "FilterSplit",
              "PredefinedSplit",
              "TimestampSplit",
              "StratifiedSplit",
              "GcsDestination",
              "BigqueryDestination",
              "DatasetId",
              "AnnotationsFilter",
              "AnnotationSchemaUri",
              "SavedQueryId",
              "PersistMlUseAssignment",
              "Split",
              "Destination",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_descriptor,
            new java.lang.String[] {
              "TrainingFilter", "ValidationFilter", "TestFilter",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_descriptor,
            new java.lang.String[] {
              "Key",
            });
    internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction", "Key",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction", "Key",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
