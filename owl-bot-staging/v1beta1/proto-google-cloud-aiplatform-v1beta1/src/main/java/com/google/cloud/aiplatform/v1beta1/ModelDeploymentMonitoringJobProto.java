// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_deployment_monitoring_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelDeploymentMonitoringJobProto {
  private ModelDeploymentMonitoringJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/cloud/aiplatform/v1beta1/model_" +
      "deployment_monitoring_job.proto\022\037google." +
      "cloud.aiplatform.v1beta1\032\034google/api/ann" +
      "otations.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\0325goog" +
      "le/cloud/aiplatform/v1beta1/encryption_s" +
      "pec.proto\032>google/cloud/aiplatform/v1bet" +
      "a1/feature_monitoring_stats.proto\032(googl" +
      "e/cloud/aiplatform/v1beta1/io.proto\032/goo" +
      "gle/cloud/aiplatform/v1beta1/job_state.p" +
      "roto\0326google/cloud/aiplatform/v1beta1/mo" +
      "del_monitoring.proto\032\036google/protobuf/du" +
      "ration.proto\032\034google/protobuf/struct.pro" +
      "to\032\037google/protobuf/timestamp.proto\032\027goo" +
      "gle/rpc/status.proto\"\334\016\n\034ModelDeployment" +
      "MonitoringJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014disp" +
      "lay_name\030\002 \001(\tB\003\340A\002\022<\n\010endpoint\030\003 \001(\tB*\340" +
      "A\002\372A$\n\"aiplatform.googleapis.com/Endpoin" +
      "t\022=\n\005state\030\004 \001(\0162).google.cloud.aiplatfo" +
      "rm.v1beta1.JobStateB\003\340A\003\022r\n\016schedule_sta" +
      "te\030\005 \001(\0162U.google.cloud.aiplatform.v1bet" +
      "a1.ModelDeploymentMonitoringJob.Monitori" +
      "ngScheduleStateB\003\340A\003\022\205\001\n-model_deploymen" +
      "t_monitoring_objective_configs\030\006 \003(\0132I.g" +
      "oogle.cloud.aiplatform.v1beta1.ModelDepl" +
      "oymentMonitoringObjectiveConfigB\003\340A\002\022\202\001\n" +
      "+model_deployment_monitoring_schedule_co" +
      "nfig\030\007 \001(\0132H.google.cloud.aiplatform.v1b" +
      "eta1.ModelDeploymentMonitoringScheduleCo" +
      "nfigB\003\340A\002\022Y\n\031logging_sampling_strategy\030\010" +
      " \001(\01321.google.cloud.aiplatform.v1beta1.S" +
      "amplingStrategyB\003\340A\002\022b\n\035model_monitoring" +
      "_alert_config\030\017 \001(\0132;.google.cloud.aipla" +
      "tform.v1beta1.ModelMonitoringAlertConfig" +
      "\022#\n\033predict_instance_schema_uri\030\t \001(\t\0227\n" +
      "\027sample_predict_instance\030\023 \001(\0132\026.google." +
      "protobuf.Value\022$\n\034analysis_instance_sche" +
      "ma_uri\030\020 \001(\t\022e\n\017bigquery_tables\030\n \003(\0132G." +
      "google.cloud.aiplatform.v1beta1.ModelDep" +
      "loymentMonitoringBigQueryTableB\003\340A\003\022*\n\007l" +
      "og_ttl\030\021 \001(\0132\031.google.protobuf.Duration\022" +
      "Y\n\006labels\030\013 \003(\0132I.google.cloud.aiplatfor" +
      "m.v1beta1.ModelDeploymentMonitoringJob.L" +
      "abelsEntry\0224\n\013create_time\030\014 \001(\0132\032.google" +
      ".protobuf.TimestampB\003\340A\003\0224\n\013update_time\030" +
      "\r \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022;" +
      "\n\022next_schedule_time\030\016 \001(\0132\032.google.prot" +
      "obuf.TimestampB\003\340A\003\022W\n\036stats_anomalies_b" +
      "ase_directory\030\024 \001(\0132/.google.cloud.aipla" +
      "tform.v1beta1.GcsDestination\022H\n\017encrypti" +
      "on_spec\030\025 \001(\0132/.google.cloud.aiplatform." +
      "v1beta1.EncryptionSpec\022\'\n\037enable_monitor" +
      "ing_pipeline_logs\030\026 \001(\010\022&\n\005error\030\027 \001(\0132\022" +
      ".google.rpc.StatusB\003\340A\003\032-\n\013LabelsEntry\022\013" +
      "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"k\n\027Monito" +
      "ringScheduleState\022)\n%MONITORING_SCHEDULE" +
      "_STATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007OFF" +
      "LINE\020\002\022\013\n\007RUNNING\020\003:\245\001\352A\241\001\n6aiplatform.g" +
      "oogleapis.com/ModelDeploymentMonitoringJ" +
      "ob\022gprojects/{project}/locations/{locati" +
      "on}/modelDeploymentMonitoringJobs/{model" +
      "_deployment_monitoring_job}\"\222\003\n&ModelDep" +
      "loymentMonitoringBigQueryTable\022e\n\nlog_so" +
      "urce\030\001 \001(\0162Q.google.cloud.aiplatform.v1b" +
      "eta1.ModelDeploymentMonitoringBigQueryTa" +
      "ble.LogSource\022a\n\010log_type\030\002 \001(\0162O.google" +
      ".cloud.aiplatform.v1beta1.ModelDeploymen" +
      "tMonitoringBigQueryTable.LogType\022\033\n\023bigq" +
      "uery_table_path\030\003 \001(\t\"B\n\tLogSource\022\032\n\026LO" +
      "G_SOURCE_UNSPECIFIED\020\000\022\014\n\010TRAINING\020\001\022\013\n\007" +
      "SERVING\020\002\"=\n\007LogType\022\030\n\024LOG_TYPE_UNSPECI" +
      "FIED\020\000\022\013\n\007PREDICT\020\001\022\013\n\007EXPLAIN\020\002\"\240\001\n(Mod" +
      "elDeploymentMonitoringObjectiveConfig\022\031\n" +
      "\021deployed_model_id\030\001 \001(\t\022Y\n\020objective_co" +
      "nfig\030\002 \001(\0132?.google.cloud.aiplatform.v1b" +
      "eta1.ModelMonitoringObjectiveConfig\"c\n\'M" +
      "odelDeploymentMonitoringScheduleConfig\0228" +
      "\n\020monitor_interval\030\001 \001(\0132\031.google.protob" +
      "uf.DurationB\003\340A\002\"\305\004\n\035ModelMonitoringStat" +
      "sAnomalies\022Z\n\tobjective\030\001 \001(\0162G.google.c" +
      "loud.aiplatform.v1beta1.ModelDeploymentM" +
      "onitoringObjectiveType\022\031\n\021deployed_model" +
      "_id\030\002 \001(\t\022\025\n\ranomaly_count\030\003 \001(\005\022s\n\rfeat" +
      "ure_stats\030\004 \003(\0132\\.google.cloud.aiplatfor" +
      "m.v1beta1.ModelMonitoringStatsAnomalies." +
      "FeatureHistoricStatsAnomalies\032\240\002\n\035Featur" +
      "eHistoricStatsAnomalies\022\034\n\024feature_displ" +
      "ay_name\030\001 \001(\t\022C\n\tthreshold\030\003 \001(\01320.googl" +
      "e.cloud.aiplatform.v1beta1.ThresholdConf" +
      "ig\022L\n\016training_stats\030\004 \001(\01324.google.clou" +
      "d.aiplatform.v1beta1.FeatureStatsAnomaly" +
      "\022N\n\020prediction_stats\030\005 \003(\01324.google.clou" +
      "d.aiplatform.v1beta1.FeatureStatsAnomaly" +
      "*\316\001\n&ModelDeploymentMonitoringObjectiveT" +
      "ype\022:\n6MODEL_DEPLOYMENT_MONITORING_OBJEC" +
      "TIVE_TYPE_UNSPECIFIED\020\000\022\024\n\020RAW_FEATURE_S" +
      "KEW\020\001\022\025\n\021RAW_FEATURE_DRIFT\020\002\022\034\n\030FEATURE_" +
      "ATTRIBUTION_SKEW\020\003\022\035\n\031FEATURE_ATTRIBUTIO" +
      "N_DRIFT\020\004B\376\001\n#com.google.cloud.aiplatfor" +
      "m.v1beta1B!ModelDeploymentMonitoringJobP" +
      "rotoP\001ZIgoogle.golang.org/genproto/googl" +
      "eapis/cloud/aiplatform/v1beta1;aiplatfor" +
      "m\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Go" +
      "ogle\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::" +
      "Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Endpoint", "State", "ScheduleState", "ModelDeploymentMonitoringObjectiveConfigs", "ModelDeploymentMonitoringScheduleConfig", "LoggingSamplingStrategy", "ModelMonitoringAlertConfig", "PredictInstanceSchemaUri", "SamplePredictInstance", "AnalysisInstanceSchemaUri", "BigqueryTables", "LogTtl", "Labels", "CreateTime", "UpdateTime", "NextScheduleTime", "StatsAnomaliesBaseDirectory", "EncryptionSpec", "EnableMonitoringPipelineLogs", "Error", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_descriptor,
        new java.lang.String[] { "LogSource", "LogType", "BigqueryTablePath", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor,
        new java.lang.String[] { "DeployedModelId", "ObjectiveConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_descriptor,
        new java.lang.String[] { "MonitorInterval", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor,
        new java.lang.String[] { "Objective", "DeployedModelId", "AnomalyCount", "FeatureStats", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor,
        new java.lang.String[] { "FeatureDisplayName", "Threshold", "TrainingStats", "PredictionStats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
