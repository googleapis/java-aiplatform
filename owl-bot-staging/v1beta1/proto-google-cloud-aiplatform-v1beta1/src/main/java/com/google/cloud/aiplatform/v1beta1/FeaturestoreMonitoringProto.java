// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_monitoring.proto

package com.google.cloud.aiplatform.v1beta1;

public final class FeaturestoreMonitoringProto {
  private FeaturestoreMonitoringProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/aiplatform/v1beta1/featur" +
      "estore_monitoring.proto\022\037google.cloud.ai" +
      "platform.v1beta1\032\036google/protobuf/durati" +
      "on.proto\032\034google/api/annotations.proto\"\216" +
      "\002\n\034FeaturestoreMonitoringConfig\022i\n\021snaps" +
      "hot_analysis\030\001 \001(\0132N.google.cloud.aiplat" +
      "form.v1beta1.FeaturestoreMonitoringConfi" +
      "g.SnapshotAnalysis\032\202\001\n\020SnapshotAnalysis\022" +
      "\020\n\010disabled\030\001 \001(\010\022:\n\023monitoring_interval" +
      "\030\002 \001(\0132\031.google.protobuf.DurationB\002\030\001\022 \n" +
      "\030monitoring_interval_days\030\003 \001(\005B\370\001\n#com." +
      "google.cloud.aiplatform.v1beta1B\033Feature" +
      "storeMonitoringProtoP\001ZIgoogle.golang.or" +
      "g/genproto/googleapis/cloud/aiplatform/v" +
      "1beta1;aiplatform\252\002\037Google.Cloud.AIPlatf" +
      "orm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1" +
      "beta1\352\002\"Google::Cloud::AIPlatform::V1bet" +
      "a1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_descriptor,
        new java.lang.String[] { "SnapshotAnalysis", });
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_descriptor,
        new java.lang.String[] { "Disabled", "MonitoringInterval", "MonitoringIntervalDays", });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
