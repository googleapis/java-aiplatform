// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/operation.proto

package com.google.cloud.aiplatform.v1beta1;

public final class OperationProto {
  private OperationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_GenericOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GenericOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeleteOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/aiplatform/v1beta1/operat" +
      "ion.proto\022\037google.cloud.aiplatform.v1bet" +
      "a1\032\037google/api/field_behavior.proto\032\037goo" +
      "gle/protobuf/timestamp.proto\032\027google/rpc" +
      "/status.proto\032\034google/api/annotations.pr" +
      "oto\"\271\001\n\030GenericOperationMetadata\0221\n\020part" +
      "ial_failures\030\001 \003(\0132\022.google.rpc.StatusB\003" +
      "\340A\003\0224\n\013create_time\030\002 \001(\0132\032.google.protob" +
      "uf.TimestampB\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032" +
      ".google.protobuf.TimestampB\003\340A\003\"n\n\027Delet" +
      "eOperationMetadata\022S\n\020generic_metadata\030\001" +
      " \001(\01329.google.cloud.aiplatform.v1beta1.G" +
      "enericOperationMetadataB\353\001\n#com.google.c" +
      "loud.aiplatform.v1beta1B\016OperationProtoP" +
      "\001ZIgoogle.golang.org/genproto/googleapis" +
      "/cloud/aiplatform/v1beta1;aiplatform\252\002\037G" +
      "oogle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\" +
      "Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cloud" +
      "::AIPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_GenericOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_GenericOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_GenericOperationMetadata_descriptor,
        new java.lang.String[] { "PartialFailures", "CreateTime", "UpdateTime", });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeleteOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
