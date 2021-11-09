// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_monitoring.proto

package com.google.cloud.aiplatform.v1;

public final class ModelMonitoringProto {
  private ModelMonitoringProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ThresholdConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ThresholdConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SamplingStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/model_monit" +
      "oring.proto\022\032google.cloud.aiplatform.v1\032" +
      "\031google/api/resource.proto\032#google/cloud" +
      "/aiplatform/v1/io.proto\032\034google/api/anno" +
      "tations.proto\"\244\024\n\036ModelMonitoringObjecti" +
      "veConfig\022d\n\020training_dataset\030\001 \001(\0132J.goo" +
      "gle.cloud.aiplatform.v1.ModelMonitoringO" +
      "bjectiveConfig.TrainingDataset\022\223\001\n)train" +
      "ing_prediction_skew_detection_config\030\002 \001" +
      "(\0132`.google.cloud.aiplatform.v1.ModelMon" +
      "itoringObjectiveConfig.TrainingPredictio" +
      "nSkewDetectionConfig\022\204\001\n!prediction_drif" +
      "t_detection_config\030\003 \001(\0132Y.google.cloud." +
      "aiplatform.v1.ModelMonitoringObjectiveCo" +
      "nfig.PredictionDriftDetectionConfig\022h\n\022e" +
      "xplanation_config\030\005 \001(\0132L.google.cloud.a" +
      "iplatform.v1.ModelMonitoringObjectiveCon" +
      "fig.ExplanationConfig\032\333\002\n\017TrainingDatase" +
      "t\0229\n\007dataset\030\003 \001(\tB&\372A#\n!aiplatform.goog" +
      "leapis.com/DatasetH\000\022;\n\ngcs_source\030\004 \001(\013" +
      "2%.google.cloud.aiplatform.v1.GcsSourceH" +
      "\000\022E\n\017bigquery_source\030\005 \001(\0132*.google.clou" +
      "d.aiplatform.v1.BigQuerySourceH\000\022\023\n\013data" +
      "_format\030\002 \001(\t\022\024\n\014target_field\030\006 \001(\t\022O\n\031l" +
      "ogging_sampling_strategy\030\007 \001(\0132,.google." +
      "cloud.aiplatform.v1.SamplingStrategyB\r\n\013" +
      "data_source\032\302\004\n%TrainingPredictionSkewDe" +
      "tectionConfig\022\215\001\n\017skew_thresholds\030\001 \003(\0132" +
      "t.google.cloud.aiplatform.v1.ModelMonito" +
      "ringObjectiveConfig.TrainingPredictionSk" +
      "ewDetectionConfig.SkewThresholdsEntry\022\260\001" +
      "\n!attribution_score_skew_thresholds\030\002 \003(" +
      "\0132\204\001.google.cloud.aiplatform.v1.ModelMon" +
      "itoringObjectiveConfig.TrainingPredictio" +
      "nSkewDetectionConfig.AttributionScoreSke" +
      "wThresholdsEntry\032b\n\023SkewThresholdsEntry\022" +
      "\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.google.clo" +
      "ud.aiplatform.v1.ThresholdConfig:\0028\001\032r\n#" +
      "AttributionScoreSkewThresholdsEntry\022\013\n\003k" +
      "ey\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.google.cloud.a" +
      "iplatform.v1.ThresholdConfig:\0028\001\032\262\004\n\036Pre" +
      "dictionDriftDetectionConfig\022\210\001\n\020drift_th" +
      "resholds\030\001 \003(\0132n.google.cloud.aiplatform" +
      ".v1.ModelMonitoringObjectiveConfig.Predi" +
      "ctionDriftDetectionConfig.DriftThreshold" +
      "sEntry\022\252\001\n\"attribution_score_drift_thres" +
      "holds\030\002 \003(\0132~.google.cloud.aiplatform.v1" +
      ".ModelMonitoringObjectiveConfig.Predicti" +
      "onDriftDetectionConfig.AttributionScoreD" +
      "riftThresholdsEntry\032c\n\024DriftThresholdsEn" +
      "try\022\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.google" +
      ".cloud.aiplatform.v1.ThresholdConfig:\0028\001" +
      "\032s\n$AttributionScoreDriftThresholdsEntry" +
      "\022\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.google.cl" +
      "oud.aiplatform.v1.ThresholdConfig:\0028\001\032\274\004" +
      "\n\021ExplanationConfig\022!\n\031enable_feature_at" +
      "tributes\030\001 \001(\010\022~\n\024explanation_baseline\030\002" +
      " \001(\0132`.google.cloud.aiplatform.v1.ModelM" +
      "onitoringObjectiveConfig.ExplanationConf" +
      "ig.ExplanationBaseline\032\203\003\n\023ExplanationBa" +
      "seline\0229\n\003gcs\030\002 \001(\0132*.google.cloud.aipla" +
      "tform.v1.GcsDestinationH\000\022C\n\010bigquery\030\003 " +
      "\001(\0132/.google.cloud.aiplatform.v1.BigQuer" +
      "yDestinationH\000\022\214\001\n\021prediction_format\030\001 \001" +
      "(\0162q.google.cloud.aiplatform.v1.ModelMon" +
      "itoringObjectiveConfig.ExplanationConfig" +
      ".ExplanationBaseline.PredictionFormat\"N\n" +
      "\020PredictionFormat\022!\n\035PREDICTION_FORMAT_U" +
      "NSPECIFIED\020\000\022\t\n\005JSONL\020\002\022\014\n\010BIGQUERY\020\003B\r\n" +
      "\013destination\"\265\001\n\032ModelMonitoringAlertCon" +
      "fig\022e\n\022email_alert_config\030\001 \001(\0132G.google" +
      ".cloud.aiplatform.v1.ModelMonitoringAler" +
      "tConfig.EmailAlertConfigH\000\032\'\n\020EmailAlert" +
      "Config\022\023\n\013user_emails\030\001 \003(\tB\007\n\005alert\"/\n\017" +
      "ThresholdConfig\022\017\n\005value\030\001 \001(\001H\000B\013\n\tthre" +
      "shold\"\234\001\n\020SamplingStrategy\022]\n\024random_sam" +
      "ple_config\030\001 \001(\0132?.google.cloud.aiplatfo" +
      "rm.v1.SamplingStrategy.RandomSampleConfi" +
      "g\032)\n\022RandomSampleConfig\022\023\n\013sample_rate\030\001" +
      " \001(\001B\330\001\n\036com.google.cloud.aiplatform.v1B" +
      "\024ModelMonitoringProtoP\001ZDgoogle.golang.o" +
      "rg/genproto/googleapis/cloud/aiplatform/" +
      "v1;aiplatform\252\002\032Google.Cloud.AIPlatform." +
      "V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google" +
      "::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor,
        new java.lang.String[] { "TrainingDataset", "TrainingPredictionSkewDetectionConfig", "PredictionDriftDetectionConfig", "ExplanationConfig", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor,
        new java.lang.String[] { "Dataset", "GcsSource", "BigquerySource", "DataFormat", "TargetField", "LoggingSamplingStrategy", "DataSource", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor,
        new java.lang.String[] { "SkewThresholds", "AttributionScoreSkewThresholds", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor,
        new java.lang.String[] { "DriftThresholds", "AttributionScoreDriftThresholds", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor,
        new java.lang.String[] { "EnableFeatureAttributes", "ExplanationBaseline", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor,
        new java.lang.String[] { "Gcs", "Bigquery", "PredictionFormat", "Destination", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_descriptor,
        new java.lang.String[] { "EmailAlertConfig", "Alert", });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor,
        new java.lang.String[] { "UserEmails", });
    internal_static_google_cloud_aiplatform_v1_ThresholdConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ThresholdConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ThresholdConfig_descriptor,
        new java.lang.String[] { "Value", "Threshold", });
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SamplingStrategy_descriptor,
        new java.lang.String[] { "RandomSampleConfig", });
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1_SamplingStrategy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_descriptor,
        new java.lang.String[] { "SampleRate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
