/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ExplanationProto {
  private ExplanationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1beta1/explan"
          + "ation.proto\022\037google.cloud.aiplatform.v1b"
          + "eta1\032\037google/api/field_behavior.proto\032:g"
          + "oogle/cloud/aiplatform/v1beta1/explanati"
          + "on_metadata.proto\032\034google/protobuf/struc"
          + "t.proto\032\034google/api/annotations.proto\"V\n"
          + "\013Explanation\022G\n\014attributions\030\001 \003(\0132,.goo"
          + "gle.cloud.aiplatform.v1beta1.Attribution"
          + "B\003\340A\003\"`\n\020ModelExplanation\022L\n\021mean_attrib"
          + "utions\030\001 \003(\0132,.google.cloud.aiplatform.v"
          + "1beta1.AttributionB\003\340A\003\"\211\002\n\013Attribution\022"
          + "\"\n\025baseline_output_value\030\001 \001(\001B\003\340A\003\022\"\n\025i"
          + "nstance_output_value\030\002 \001(\001B\003\340A\003\0229\n\024featu"
          + "re_attributions\030\003 \001(\0132\026.google.protobuf."
          + "ValueB\003\340A\003\022\031\n\014output_index\030\004 \003(\005B\003\340A\003\022 \n"
          + "\023output_display_name\030\005 \001(\tB\003\340A\003\022 \n\023appro"
          + "ximation_error\030\006 \001(\001B\003\340A\003\022\030\n\013output_name"
          + "\030\007 \001(\tB\003\340A\003\"\257\001\n\017ExplanationSpec\022O\n\nparam"
          + "eters\030\001 \001(\01326.google.cloud.aiplatform.v1"
          + "beta1.ExplanationParametersB\003\340A\002\022K\n\010meta"
          + "data\030\002 \001(\01324.google.cloud.aiplatform.v1b"
          + "eta1.ExplanationMetadataB\003\340A\002\"\202\003\n\025Explan"
          + "ationParameters\022a\n\033sampled_shapley_attri"
          + "bution\030\001 \001(\0132:.google.cloud.aiplatform.v"
          + "1beta1.SampledShapleyAttributionH\000\022k\n in"
          + "tegrated_gradients_attribution\030\002 \001(\0132?.g"
          + "oogle.cloud.aiplatform.v1beta1.Integrate"
          + "dGradientsAttributionH\000\022L\n\020xrai_attribut"
          + "ion\030\003 \001(\01320.google.cloud.aiplatform.v1be"
          + "ta1.XraiAttributionH\000\022\r\n\005top_k\030\004 \001(\005\0222\n\016"
          + "output_indices\030\005 \001(\0132\032.google.protobuf.L"
          + "istValueB\010\n\006method\"4\n\031SampledShapleyAttr"
          + "ibution\022\027\n\npath_count\030\001 \001(\005B\003\340A\002\"\210\001\n\036Int"
          + "egratedGradientsAttribution\022\027\n\nstep_coun"
          + "t\030\001 \001(\005B\003\340A\002\022M\n\022smooth_grad_config\030\002 \001(\013"
          + "21.google.cloud.aiplatform.v1beta1.Smoot"
          + "hGradConfig\"y\n\017XraiAttribution\022\027\n\nstep_c"
          + "ount\030\001 \001(\005B\003\340A\002\022M\n\022smooth_grad_config\030\002 "
          + "\001(\01321.google.cloud.aiplatform.v1beta1.Sm"
          + "oothGradConfig\"\256\001\n\020SmoothGradConfig\022\025\n\013n"
          + "oise_sigma\030\001 \001(\002H\000\022Q\n\023feature_noise_sigm"
          + "a\030\002 \001(\01322.google.cloud.aiplatform.v1beta"
          + "1.FeatureNoiseSigmaH\000\022\032\n\022noisy_sample_co"
          + "unt\030\003 \001(\005B\024\n\022GradientNoiseSigma\"\246\001\n\021Feat"
          + "ureNoiseSigma\022\\\n\013noise_sigma\030\001 \003(\0132G.goo"
          + "gle.cloud.aiplatform.v1beta1.FeatureNois"
          + "eSigma.NoiseSigmaForFeature\0323\n\024NoiseSigm"
          + "aForFeature\022\014\n\004name\030\001 \001(\t\022\r\n\005sigma\030\002 \001(\002"
          + "B\204\001\n#com.google.cloud.aiplatform.v1beta1"
          + "B\020ExplanationProtoP\001ZIgoogle.golang.org/"
          + "genproto/googleapis/cloud/aiplatform/v1b"
          + "eta1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor,
            new java.lang.String[] {
              "Attributions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor,
            new java.lang.String[] {
              "MeanAttributions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor,
            new java.lang.String[] {
              "BaselineOutputValue",
              "InstanceOutputValue",
              "FeatureAttributions",
              "OutputIndex",
              "OutputDisplayName",
              "ApproximationError",
              "OutputName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor,
            new java.lang.String[] {
              "Parameters", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor,
            new java.lang.String[] {
              "SampledShapleyAttribution",
              "IntegratedGradientsAttribution",
              "XraiAttribution",
              "TopK",
              "OutputIndices",
              "Method",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor,
            new java.lang.String[] {
              "PathCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor,
            new java.lang.String[] {
              "StepCount", "SmoothGradConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor,
            new java.lang.String[] {
              "StepCount", "SmoothGradConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor,
            new java.lang.String[] {
              "NoiseSigma", "FeatureNoiseSigma", "NoisySampleCount", "GradientNoiseSigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor,
            new java.lang.String[] {
              "NoiseSigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor,
            new java.lang.String[] {
              "Name", "Sigma",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
