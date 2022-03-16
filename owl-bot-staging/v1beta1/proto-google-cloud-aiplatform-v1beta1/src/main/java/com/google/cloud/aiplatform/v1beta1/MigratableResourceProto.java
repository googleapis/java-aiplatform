// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/migratable_resource.proto

package com.google.cloud.aiplatform.v1beta1;

public final class MigratableResourceProto {
  private MigratableResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/aiplatform/v1beta1/migrat" +
      "able_resource.proto\022\037google.cloud.aiplat" +
      "form.v1beta1\032\034google/api/annotations.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032\037google/protobuf/" +
      "timestamp.proto\"\354\t\n\022MigratableResource\022p" +
      "\n\027ml_engine_model_version\030\001 \001(\0132H.google" +
      ".cloud.aiplatform.v1beta1.MigratableReso" +
      "urce.MlEngineModelVersionB\003\340A\003H\000\022\\\n\014auto" +
      "ml_model\030\002 \001(\0132?.google.cloud.aiplatform" +
      ".v1beta1.MigratableResource.AutomlModelB" +
      "\003\340A\003H\000\022`\n\016automl_dataset\030\003 \001(\0132A.google." +
      "cloud.aiplatform.v1beta1.MigratableResou" +
      "rce.AutomlDatasetB\003\340A\003H\000\022m\n\025data_labelin" +
      "g_dataset\030\004 \001(\0132G.google.cloud.aiplatfor" +
      "m.v1beta1.MigratableResource.DataLabelin" +
      "gDatasetB\003\340A\003H\000\022:\n\021last_migrate_time\030\005 \001" +
      "(\0132\032.google.protobuf.TimestampB\003\340A\003\0229\n\020l" +
      "ast_update_time\030\006 \001(\0132\032.google.protobuf." +
      "TimestampB\003\340A\003\032Y\n\024MlEngineModelVersion\022\020" +
      "\n\010endpoint\030\001 \001(\t\022/\n\007version\030\002 \001(\tB\036\372A\033\n\031" +
      "ml.googleapis.com/Version\032Z\n\013AutomlModel" +
      "\022/\n\005model\030\001 \001(\tB \372A\035\n\033automl.googleapis." +
      "com/Model\022\032\n\022model_display_name\030\003 \001(\t\032b\n" +
      "\rAutomlDataset\0223\n\007dataset\030\001 \001(\tB\"\372A\037\n\035au" +
      "toml.googleapis.com/Dataset\022\034\n\024dataset_d" +
      "isplay_name\030\004 \001(\t\032\226\003\n\023DataLabelingDatase" +
      "t\0229\n\007dataset\030\001 \001(\tB(\372A%\n#datalabeling.go" +
      "ogleapis.com/Dataset\022\034\n\024dataset_display_" +
      "name\030\004 \001(\t\022\216\001\n data_labeling_annotated_d" +
      "atasets\030\003 \003(\0132d.google.cloud.aiplatform." +
      "v1beta1.MigratableResource.DataLabelingD" +
      "ataset.DataLabelingAnnotatedDataset\032\224\001\n\034" +
      "DataLabelingAnnotatedDataset\022L\n\021annotate" +
      "d_dataset\030\001 \001(\tB1\372A.\n,datalabeling.googl" +
      "eapis.com/AnnotatedDataset\022&\n\036annotated_" +
      "dataset_display_name\030\003 \001(\tB\n\n\010resourceB\313" +
      "\005\n#com.google.cloud.aiplatform.v1beta1B\027" +
      "MigratableResourceProtoP\001ZIgoogle.golang" +
      ".org/genproto/googleapis/cloud/aiplatfor" +
      "m/v1beta1;aiplatform\252\002\037Google.Cloud.AIPl" +
      "atform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform" +
      "\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1" +
      "beta1\352AQ\n\031ml.googleapis.com/Version\0224pro" +
      "jects/{project}/models/{model}/versions/" +
      "{version}\352AU\n\033automl.googleapis.com/Mode" +
      "l\0226projects/{project}/locations/{locatio" +
      "n}/models/{model}\352A[\n\035automl.googleapis." +
      "com/Dataset\022:projects/{project}/location" +
      "s/{location}/datasets/{dataset}\352AL\n#data" +
      "labeling.googleapis.com/Dataset\022%project" +
      "s/{project}/datasets/{dataset}\352A{\n,datal" +
      "abeling.googleapis.com/AnnotatedDataset\022" +
      "Kprojects/{project}/datasets/{dataset}/a" +
      "nnotatedDatasets/{annotated_dataset}b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor,
        new java.lang.String[] { "MlEngineModelVersion", "AutomlModel", "AutomlDataset", "DataLabelingDataset", "LastMigrateTime", "LastUpdateTime", "Resource", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_descriptor,
        new java.lang.String[] { "Endpoint", "Version", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_descriptor,
        new java.lang.String[] { "Model", "ModelDisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_descriptor,
        new java.lang.String[] { "Dataset", "DatasetDisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_descriptor,
        new java.lang.String[] { "Dataset", "DatasetDisplayName", "DataLabelingAnnotatedDatasets", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_descriptor,
        new java.lang.String[] { "AnnotatedDataset", "AnnotatedDatasetDisplayName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
