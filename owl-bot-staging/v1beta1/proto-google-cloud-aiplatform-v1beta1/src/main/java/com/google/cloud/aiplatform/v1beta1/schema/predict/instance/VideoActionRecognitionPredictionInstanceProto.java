// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/video_action_recognition.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

public final class VideoActionRecognitionPredictionInstanceProto {
  private VideoActionRecognitionPredictionInstanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nVgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/instance/video_action_recogniti" +
      "on.proto\0227google.cloud.aiplatform.v1beta" +
      "1.schema.predict.instance\032\034google/api/an" +
      "notations.proto\"\204\001\n(VideoActionRecogniti" +
      "onPredictionInstance\022\017\n\007content\030\001 \001(\t\022\021\n" +
      "\tmime_type\030\002 \001(\t\022\032\n\022time_segment_start\030\003" +
      " \001(\t\022\030\n\020time_segment_end\030\004 \001(\tB\317\001\n;com.g" +
      "oogle.cloud.aiplatform.v1beta1.schema.pr" +
      "edict.instanceB-VideoActionRecognitionPr" +
      "edictionInstanceProtoP\001Z_google.golang.o" +
      "rg/genproto/googleapis/cloud/aiplatform/" +
      "v1beta1/schema/predict/instance;instance" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor,
        new java.lang.String[] { "Content", "MimeType", "TimeSegmentStart", "TimeSegmentEnd", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
