// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/env_var.proto

package com.google.cloud.aiplatform.v1beta1;

public final class EnvVarProto {
  private EnvVarProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_EnvVar_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_EnvVar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/env_va" +
      "r.proto\022\037google.cloud.aiplatform.v1beta1" +
      "\032\037google/api/field_behavior.proto\"/\n\006Env" +
      "Var\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\022\n\005value\030\002 \001(\tB\003\340" +
      "A\002B\350\001\n#com.google.cloud.aiplatform.v1bet" +
      "a1B\013EnvVarProtoP\001ZIgoogle.golang.org/gen" +
      "proto/googleapis/cloud/aiplatform/v1beta" +
      "1;aiplatform\252\002\037Google.Cloud.AIPlatform.V" +
      "1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1" +
      "\352\002\"Google::Cloud::AIPlatform::V1beta1b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_EnvVar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_EnvVar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_EnvVar_descriptor,
        new java.lang.String[] { "Name", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
