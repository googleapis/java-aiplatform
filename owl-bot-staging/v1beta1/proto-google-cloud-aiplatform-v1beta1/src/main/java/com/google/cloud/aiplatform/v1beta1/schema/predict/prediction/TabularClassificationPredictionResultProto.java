// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/tabular_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class TabularClassificationPredictionResultProto {
  private TabularClassificationPredictionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nVgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/prediction/tabular_classificati" +
      "on.proto\0229google.cloud.aiplatform.v1beta" +
      "1.schema.predict.prediction\"H\n%TabularCl" +
      "assificationPredictionResult\022\017\n\007classes\030" +
      "\001 \003(\t\022\016\n\006scores\030\002 \003(\002B\214\003\n=com.google.clo" +
      "ud.aiplatform.v1beta1.schema.predict.pre" +
      "dictionB*TabularClassificationPrediction" +
      "ResultProtoP\001Zcgoogle.golang.org/genprot" +
      "o/googleapis/cloud/aiplatform/v1beta1/sc" +
      "hema/predict/prediction;prediction\252\0029Goo" +
      "gle.Cloud.AIPlatform.V1Beta1.Schema.Pred" +
      "ict.Prediction\312\0029Google\\Cloud\\AIPlatform" +
      "\\V1beta1\\Schema\\Predict\\Prediction\352\002?Goo" +
      "gle::Cloud::AIPlatform::V1beta1::Schema:" +
      ":Predict::Predictionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor,
        new java.lang.String[] { "Classes", "Scores", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
