// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/completion_stats.proto

package com.google.cloud.aiplatform.v1beta1;

public final class CompletionStatsProto {
  private CompletionStatsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/comple" +
      "tion_stats.proto\022\037google.cloud.aiplatfor" +
      "m.v1beta1\032\037google/api/field_behavior.pro" +
      "to\"\230\001\n\017CompletionStats\022\035\n\020successful_cou" +
      "nt\030\001 \001(\003B\003\340A\003\022\031\n\014failed_count\030\002 \001(\003B\003\340A\003" +
      "\022\035\n\020incomplete_count\030\003 \001(\003B\003\340A\003\022,\n\037succe" +
      "ssful_forecast_point_count\030\005 \001(\003B\003\340A\003B\353\001" +
      "\n#com.google.cloud.aiplatform.v1beta1B\024C" +
      "ompletionStatsProtoP\001ZCcloud.google.com/" +
      "go/aiplatform/apiv1beta1/aiplatformpb;ai" +
      "platformpb\252\002\037Google.Cloud.AIPlatform.V1B" +
      "eta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002" +
      "\"Google::Cloud::AIPlatform::V1beta1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_descriptor,
        new java.lang.String[] { "SuccessfulCount", "FailedCount", "IncompleteCount", "SuccessfulForecastPointCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
