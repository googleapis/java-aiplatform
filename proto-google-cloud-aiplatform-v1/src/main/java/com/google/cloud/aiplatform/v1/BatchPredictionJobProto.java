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
// source: google/cloud/aiplatform/v1/batch_prediction_job.proto

package com.google.cloud.aiplatform.v1;

public final class BatchPredictionJobProto {
  private BatchPredictionJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InstanceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InstanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/batch_predi"
          + "ction_job.proto\022\032google.cloud.aiplatform"
          + ".v1\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\0321google/cloud/ai"
          + "platform/v1/completion_stats.proto\0320goog"
          + "le/cloud/aiplatform/v1/encryption_spec.p"
          + "roto\032,google/cloud/aiplatform/v1/explana"
          + "tion.proto\032#google/cloud/aiplatform/v1/i"
          + "o.proto\032*google/cloud/aiplatform/v1/job_"
          + "state.proto\0322google/cloud/aiplatform/v1/"
          + "machine_resources.proto\032?google/cloud/ai"
          + "platform/v1/manual_batch_tuning_paramete"
          + "rs.proto\032:google/cloud/aiplatform/v1/unm"
          + "anaged_container_model.proto\032\034google/pro"
          + "tobuf/struct.proto\032\037google/protobuf/time"
          + "stamp.proto\032\027google/rpc/status.proto\"\230\023\n"
          + "\022BatchPredictionJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031"
          + "\n\014display_name\030\002 \001(\tB\003\340A\002\0223\n\005model\030\003 \001(\t"
          + "B$\372A!\n\037aiplatform.googleapis.com/Model\022\035"
          + "\n\020model_version_id\030\036 \001(\tB\003\340A\003\022V\n\031unmanag"
          + "ed_container_model\030\034 \001(\01323.google.cloud."
          + "aiplatform.v1.UnmanagedContainerModel\022U\n"
          + "\014input_config\030\004 \001(\0132:.google.cloud.aipla"
          + "tform.v1.BatchPredictionJob.InputConfigB"
          + "\003\340A\002\022V\n\017instance_config\030\033 \001(\0132=.google.c"
          + "loud.aiplatform.v1.BatchPredictionJob.In"
          + "stanceConfig\0220\n\020model_parameters\030\005 \001(\0132\026"
          + ".google.protobuf.Value\022W\n\routput_config\030"
          + "\006 \001(\0132;.google.cloud.aiplatform.v1.Batch"
          + "PredictionJob.OutputConfigB\003\340A\002\022P\n\023dedic"
          + "ated_resources\030\007 \001(\01323.google.cloud.aipl"
          + "atform.v1.BatchDedicatedResources\022\027\n\017ser"
          + "vice_account\030\035 \001(\t\022d\n\036manual_batch_tunin"
          + "g_parameters\030\010 \001(\01327.google.cloud.aiplat"
          + "form.v1.ManualBatchTuningParametersB\003\340A\005"
          + "\022\034\n\024generate_explanation\030\027 \001(\010\022E\n\020explan"
          + "ation_spec\030\031 \001(\0132+.google.cloud.aiplatfo"
          + "rm.v1.ExplanationSpec\022S\n\013output_info\030\t \001"
          + "(\01329.google.cloud.aiplatform.v1.BatchPre"
          + "dictionJob.OutputInfoB\003\340A\003\0228\n\005state\030\n \001("
          + "\0162$.google.cloud.aiplatform.v1.JobStateB"
          + "\003\340A\003\022&\n\005error\030\013 \001(\0132\022.google.rpc.StatusB"
          + "\003\340A\003\0221\n\020partial_failures\030\014 \003(\0132\022.google."
          + "rpc.StatusB\003\340A\003\022N\n\022resources_consumed\030\r "
          + "\001(\0132-.google.cloud.aiplatform.v1.Resourc"
          + "esConsumedB\003\340A\003\022J\n\020completion_stats\030\016 \001("
          + "\0132+.google.cloud.aiplatform.v1.Completio"
          + "nStatsB\003\340A\003\0224\n\013create_time\030\017 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\0223\n\nstart_time\030"
          + "\020 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221"
          + "\n\010end_time\030\021 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\0224\n\013update_time\030\022 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022J\n\006labels\030\023 \003(\0132"
          + ":.google.cloud.aiplatform.v1.BatchPredic"
          + "tionJob.LabelsEntry\022C\n\017encryption_spec\030\030"
          + " \001(\0132*.google.cloud.aiplatform.v1.Encryp"
          + "tionSpec\032\272\001\n\013InputConfig\022;\n\ngcs_source\030\002"
          + " \001(\0132%.google.cloud.aiplatform.v1.GcsSou"
          + "rceH\000\022E\n\017bigquery_source\030\003 \001(\0132*.google."
          + "cloud.aiplatform.v1.BigQuerySourceH\000\022\035\n\020"
          + "instances_format\030\001 \001(\tB\003\340A\002B\010\n\006source\032l\n"
          + "\016InstanceConfig\022\025\n\rinstance_type\030\001 \001(\t\022\021"
          + "\n\tkey_field\030\002 \001(\t\022\027\n\017included_fields\030\003 \003"
          + "(\t\022\027\n\017excluded_fields\030\004 \003(\t\032\326\001\n\014OutputCo"
          + "nfig\022E\n\017gcs_destination\030\002 \001(\0132*.google.c"
          + "loud.aiplatform.v1.GcsDestinationH\000\022O\n\024b"
          + "igquery_destination\030\003 \001(\0132/.google.cloud"
          + ".aiplatform.v1.BigQueryDestinationH\000\022\037\n\022"
          + "predictions_format\030\001 \001(\tB\003\340A\002B\r\n\013destina"
          + "tion\032\220\001\n\nOutputInfo\022#\n\024gcs_output_direct"
          + "ory\030\001 \001(\tB\003\340A\003H\000\022&\n\027bigquery_output_data"
          + "set\030\002 \001(\tB\003\340A\003H\000\022\"\n\025bigquery_output_tabl"
          + "e\030\004 \001(\tB\003\340A\003B\021\n\017output_location\032-\n\013Label"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\206"
          + "\001\352A\202\001\n,aiplatform.googleapis.com/BatchPr"
          + "edictionJob\022Rprojects/{project}/location"
          + "s/{location}/batchPredictionJobs/{batch_"
          + "prediction_job}B\333\001\n\036com.google.cloud.aip"
          + "latform.v1B\027BatchPredictionJobProtoP\001ZDg"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/aiplatform/v1;aiplatform\252\002\032Google.Clo"
          + "ud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfo"
          + "rm\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.CompletionStatsProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ManualBatchTuningParametersProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.UnmanagedContainerModelProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Model",
              "ModelVersionId",
              "UnmanagedContainerModel",
              "InputConfig",
              "InstanceConfig",
              "ModelParameters",
              "OutputConfig",
              "DedicatedResources",
              "ServiceAccount",
              "ManualBatchTuningParameters",
              "GenerateExplanation",
              "ExplanationSpec",
              "OutputInfo",
              "State",
              "Error",
              "PartialFailures",
              "ResourcesConsumed",
              "CompletionStats",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Labels",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "BigquerySource", "InstancesFormat", "Source",
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InstanceConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InstanceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InstanceConfig_descriptor,
            new java.lang.String[] {
              "InstanceType", "KeyField", "IncludedFields", "ExcludedFields",
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "PredictionsFormat", "Destination",
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory",
              "BigqueryOutputDataset",
              "BigqueryOutputTable",
              "OutputLocation",
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.CompletionStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ManualBatchTuningParametersProto.getDescriptor();
    com.google.cloud.aiplatform.v1.UnmanagedContainerModelProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
