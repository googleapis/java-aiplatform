// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/params/video_action_recognition.proto

package com.google.cloud.aiplatform.v1.schema.predict.params;

public final class VideoActionRecognitionPredictionParamsProto {
  private VideoActionRecognitionPredictionParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nOgoogle/cloud/aiplatform/v1/schema/pred" +
      "ict/params/video_action_recognition.prot" +
      "o\0220google.cloud.aiplatform.v1.schema.pre" +
      "dict.params\032\034google/api/annotations.prot" +
      "o\"_\n&VideoActionRecognitionPredictionPar" +
      "ams\022\034\n\024confidence_threshold\030\001 \001(\002\022\027\n\017max" +
      "_predictions\030\002 \001(\005B\275\001\n4com.google.cloud." +
      "aiplatform.v1.schema.predict.paramsB+Vid" +
      "eoActionRecognitionPredictionParamsProto" +
      "P\001ZVgoogle.golang.org/genproto/googleapi" +
      "s/cloud/aiplatform/v1/schema/predict/par" +
      "ams;paramsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_descriptor,
        new java.lang.String[] { "ConfidenceThreshold", "MaxPredictions", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
