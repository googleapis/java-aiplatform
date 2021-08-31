// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/explanation.proto

package com.google.cloud.aiplatform.v1;

public final class ExplanationProto {
  private ExplanationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Explanation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ModelExplanation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelExplanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Attribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Attribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_IntegratedGradientsAttribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IntegratedGradientsAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_XraiAttribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_XraiAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SmoothGradConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SmoothGradConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationSpecOverride_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationSpecOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputMetadataOverride_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/aiplatform/v1/explanation" +
      ".proto\022\032google.cloud.aiplatform.v1\032\037goog" +
      "le/api/field_behavior.proto\0325google/clou" +
      "d/aiplatform/v1/explanation_metadata.pro" +
      "to\032#google/cloud/aiplatform/v1/io.proto\032" +
      "\034google/protobuf/struct.proto\032\034google/ap" +
      "i/annotations.proto\"Q\n\013Explanation\022B\n\014at" +
      "tributions\030\001 \003(\0132\'.google.cloud.aiplatfo" +
      "rm.v1.AttributionB\003\340A\003\"[\n\020ModelExplanati" +
      "on\022G\n\021mean_attributions\030\001 \003(\0132\'.google.c" +
      "loud.aiplatform.v1.AttributionB\003\340A\003\"\211\002\n\013" +
      "Attribution\022\"\n\025baseline_output_value\030\001 \001" +
      "(\001B\003\340A\003\022\"\n\025instance_output_value\030\002 \001(\001B\003" +
      "\340A\003\0229\n\024feature_attributions\030\003 \001(\0132\026.goog" +
      "le.protobuf.ValueB\003\340A\003\022\031\n\014output_index\030\004" +
      " \003(\005B\003\340A\003\022 \n\023output_display_name\030\005 \001(\tB\003" +
      "\340A\003\022 \n\023approximation_error\030\006 \001(\001B\003\340A\003\022\030\n" +
      "\013output_name\030\007 \001(\tB\003\340A\003\"\245\001\n\017ExplanationS" +
      "pec\022J\n\nparameters\030\001 \001(\01321.google.cloud.a" +
      "iplatform.v1.ExplanationParametersB\003\340A\002\022" +
      "F\n\010metadata\030\002 \001(\0132/.google.cloud.aiplatf" +
      "orm.v1.ExplanationMetadataB\003\340A\002\"\363\002\n\025Expl" +
      "anationParameters\022\\\n\033sampled_shapley_att" +
      "ribution\030\001 \001(\01325.google.cloud.aiplatform" +
      ".v1.SampledShapleyAttributionH\000\022f\n integ" +
      "rated_gradients_attribution\030\002 \001(\0132:.goog" +
      "le.cloud.aiplatform.v1.IntegratedGradien" +
      "tsAttributionH\000\022G\n\020xrai_attribution\030\003 \001(" +
      "\0132+.google.cloud.aiplatform.v1.XraiAttri" +
      "butionH\000\022\r\n\005top_k\030\004 \001(\005\0222\n\016output_indice" +
      "s\030\005 \001(\0132\032.google.protobuf.ListValueB\010\n\006m" +
      "ethod\"4\n\031SampledShapleyAttribution\022\027\n\npa" +
      "th_count\030\001 \001(\005B\003\340A\002\"\203\001\n\036IntegratedGradie" +
      "ntsAttribution\022\027\n\nstep_count\030\001 \001(\005B\003\340A\002\022" +
      "H\n\022smooth_grad_config\030\002 \001(\0132,.google.clo" +
      "ud.aiplatform.v1.SmoothGradConfig\"t\n\017Xra" +
      "iAttribution\022\027\n\nstep_count\030\001 \001(\005B\003\340A\002\022H\n" +
      "\022smooth_grad_config\030\002 \001(\0132,.google.cloud" +
      ".aiplatform.v1.SmoothGradConfig\"\251\001\n\020Smoo" +
      "thGradConfig\022\025\n\013noise_sigma\030\001 \001(\002H\000\022L\n\023f" +
      "eature_noise_sigma\030\002 \001(\0132-.google.cloud." +
      "aiplatform.v1.FeatureNoiseSigmaH\000\022\032\n\022noi" +
      "sy_sample_count\030\003 \001(\005B\024\n\022GradientNoiseSi" +
      "gma\"\241\001\n\021FeatureNoiseSigma\022W\n\013noise_sigma" +
      "\030\001 \003(\0132B.google.cloud.aiplatform.v1.Feat" +
      "ureNoiseSigma.NoiseSigmaForFeature\0323\n\024No" +
      "iseSigmaForFeature\022\014\n\004name\030\001 \001(\t\022\r\n\005sigm" +
      "a\030\002 \001(\002\"\253\001\n\027ExplanationSpecOverride\022E\n\np" +
      "arameters\030\001 \001(\01321.google.cloud.aiplatfor" +
      "m.v1.ExplanationParameters\022I\n\010metadata\030\002" +
      " \001(\01327.google.cloud.aiplatform.v1.Explan" +
      "ationMetadataOverride\"\277\002\n\033ExplanationMet" +
      "adataOverride\022X\n\006inputs\030\001 \003(\0132C.google.c" +
      "loud.aiplatform.v1.ExplanationMetadataOv" +
      "erride.InputsEntryB\003\340A\002\032H\n\025InputMetadata" +
      "Override\022/\n\017input_baselines\030\001 \003(\0132\026.goog" +
      "le.protobuf.Value\032|\n\013InputsEntry\022\013\n\003key\030" +
      "\001 \001(\t\022\\\n\005value\030\002 \001(\0132M.google.cloud.aipl" +
      "atform.v1.ExplanationMetadataOverride.In" +
      "putMetadataOverride:\0028\001B\324\001\n\036com.google.c" +
      "loud.aiplatform.v1B\020ExplanationProtoP\001ZD" +
      "google.golang.org/genproto/googleapis/cl" +
      "oud/aiplatform/v1;aiplatform\252\002\032Google.Cl" +
      "oud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatf" +
      "orm\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.ExplanationMetadataProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_Explanation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Explanation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Explanation_descriptor,
        new java.lang.String[] { "Attributions", });
    internal_static_google_cloud_aiplatform_v1_ModelExplanation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ModelExplanation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ModelExplanation_descriptor,
        new java.lang.String[] { "MeanAttributions", });
    internal_static_google_cloud_aiplatform_v1_Attribution_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_Attribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Attribution_descriptor,
        new java.lang.String[] { "BaselineOutputValue", "InstanceOutputValue", "FeatureAttributions", "OutputIndex", "OutputDisplayName", "ApproximationError", "OutputName", });
    internal_static_google_cloud_aiplatform_v1_ExplanationSpec_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ExplanationSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationSpec_descriptor,
        new java.lang.String[] { "Parameters", "Metadata", });
    internal_static_google_cloud_aiplatform_v1_ExplanationParameters_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ExplanationParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationParameters_descriptor,
        new java.lang.String[] { "SampledShapleyAttribution", "IntegratedGradientsAttribution", "XraiAttribution", "TopK", "OutputIndices", "Method", });
    internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SampledShapleyAttribution_descriptor,
        new java.lang.String[] { "PathCount", });
    internal_static_google_cloud_aiplatform_v1_IntegratedGradientsAttribution_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_IntegratedGradientsAttribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_IntegratedGradientsAttribution_descriptor,
        new java.lang.String[] { "StepCount", "SmoothGradConfig", });
    internal_static_google_cloud_aiplatform_v1_XraiAttribution_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_XraiAttribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_XraiAttribution_descriptor,
        new java.lang.String[] { "StepCount", "SmoothGradConfig", });
    internal_static_google_cloud_aiplatform_v1_SmoothGradConfig_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_SmoothGradConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SmoothGradConfig_descriptor,
        new java.lang.String[] { "NoiseSigma", "FeatureNoiseSigma", "NoisySampleCount", "GradientNoiseSigma", });
    internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_descriptor,
        new java.lang.String[] { "NoiseSigma", });
    internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor =
      internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor,
        new java.lang.String[] { "Name", "Sigma", });
    internal_static_google_cloud_aiplatform_v1_ExplanationSpecOverride_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_ExplanationSpecOverride_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationSpecOverride_descriptor,
        new java.lang.String[] { "Parameters", "Metadata", });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_descriptor,
        new java.lang.String[] { "Inputs", });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputMetadataOverride_descriptor =
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputMetadataOverride_descriptor,
        new java.lang.String[] { "InputBaselines", });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadataOverride_InputsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationMetadataProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
