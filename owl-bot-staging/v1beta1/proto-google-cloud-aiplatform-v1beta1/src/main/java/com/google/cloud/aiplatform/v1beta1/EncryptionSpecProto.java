// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/encryption_spec.proto

package com.google.cloud.aiplatform.v1beta1;

public final class EncryptionSpecProto {
  private EncryptionSpecProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1beta1/encryp" +
      "tion_spec.proto\022\037google.cloud.aiplatform" +
      ".v1beta1\032\037google/api/field_behavior.prot" +
      "o\032\034google/api/annotations.proto\"+\n\016Encry" +
      "ptionSpec\022\031\n\014kms_key_name\030\001 \001(\tB\003\340A\002B\360\001\n" +
      "#com.google.cloud.aiplatform.v1beta1B\023En" +
      "cryptionSpecProtoP\001ZIgoogle.golang.org/g" +
      "enproto/googleapis/cloud/aiplatform/v1be" +
      "ta1;aiplatform\252\002\037Google.Cloud.AIPlatform" +
      ".V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1bet" +
      "a1\352\002\"Google::Cloud::AIPlatform::V1beta1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_descriptor,
        new java.lang.String[] { "KmsKeyName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
