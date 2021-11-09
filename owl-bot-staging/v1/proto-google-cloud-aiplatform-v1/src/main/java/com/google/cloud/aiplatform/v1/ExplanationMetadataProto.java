// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/explanation_metadata.proto

package com.google.cloud.aiplatform.v1;

public final class ExplanationMetadataProto {
  private ExplanationMetadataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_Visualization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_Visualization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/explanation" +
      "_metadata.proto\022\032google.cloud.aiplatform" +
      ".v1\032\037google/api/field_behavior.proto\032\034go" +
      "ogle/protobuf/struct.proto\032\034google/api/a" +
      "nnotations.proto\"\262\022\n\023ExplanationMetadata" +
      "\022P\n\006inputs\030\001 \003(\0132;.google.cloud.aiplatfo" +
      "rm.v1.ExplanationMetadata.InputsEntryB\003\340" +
      "A\002\022R\n\007outputs\030\002 \003(\0132<.google.cloud.aipla" +
      "tform.v1.ExplanationMetadata.OutputsEntr" +
      "yB\003\340A\002\022\'\n\037feature_attributions_schema_ur" +
      "i\030\003 \001(\t\032\304\r\n\rInputMetadata\022/\n\017input_basel" +
      "ines\030\001 \003(\0132\026.google.protobuf.Value\022\031\n\021in" +
      "put_tensor_name\030\002 \001(\t\022X\n\010encoding\030\003 \001(\0162" +
      "F.google.cloud.aiplatform.v1.Explanation" +
      "Metadata.InputMetadata.Encoding\022\020\n\010modal" +
      "ity\030\004 \001(\t\022n\n\024feature_value_domain\030\005 \001(\0132" +
      "P.google.cloud.aiplatform.v1.Explanation" +
      "Metadata.InputMetadata.FeatureValueDomai" +
      "n\022\033\n\023indices_tensor_name\030\006 \001(\t\022\037\n\027dense_" +
      "shape_tensor_name\030\007 \001(\t\022\035\n\025index_feature" +
      "_mapping\030\010 \003(\t\022\033\n\023encoded_tensor_name\030\t " +
      "\001(\t\0221\n\021encoded_baselines\030\n \003(\0132\026.google." +
      "protobuf.Value\022b\n\rvisualization\030\013 \001(\0132K." +
      "google.cloud.aiplatform.v1.ExplanationMe" +
      "tadata.InputMetadata.Visualization\022\022\n\ngr" +
      "oup_name\030\014 \001(\t\032j\n\022FeatureValueDomain\022\021\n\t" +
      "min_value\030\001 \001(\002\022\021\n\tmax_value\030\002 \001(\002\022\025\n\ror" +
      "iginal_mean\030\003 \001(\002\022\027\n\017original_stddev\030\004 \001" +
      "(\002\032\326\006\n\rVisualization\022^\n\004type\030\001 \001(\0162P.goo" +
      "gle.cloud.aiplatform.v1.ExplanationMetad" +
      "ata.InputMetadata.Visualization.Type\022f\n\010" +
      "polarity\030\002 \001(\0162T.google.cloud.aiplatform" +
      ".v1.ExplanationMetadata.InputMetadata.Vi" +
      "sualization.Polarity\022g\n\tcolor_map\030\003 \001(\0162" +
      "T.google.cloud.aiplatform.v1.Explanation" +
      "Metadata.InputMetadata.Visualization.Col" +
      "orMap\022\037\n\027clip_percent_upperbound\030\004 \001(\002\022\037" +
      "\n\027clip_percent_lowerbound\030\005 \001(\002\022m\n\014overl" +
      "ay_type\030\006 \001(\0162W.google.cloud.aiplatform." +
      "v1.ExplanationMetadata.InputMetadata.Vis" +
      "ualization.OverlayType\"6\n\004Type\022\024\n\020TYPE_U" +
      "NSPECIFIED\020\000\022\n\n\006PIXELS\020\001\022\014\n\010OUTLINES\020\002\"J" +
      "\n\010Polarity\022\030\n\024POLARITY_UNSPECIFIED\020\000\022\014\n\010" +
      "POSITIVE\020\001\022\014\n\010NEGATIVE\020\002\022\010\n\004BOTH\020\003\"{\n\010Co" +
      "lorMap\022\031\n\025COLOR_MAP_UNSPECIFIED\020\000\022\016\n\nPIN" +
      "K_GREEN\020\001\022\013\n\007VIRIDIS\020\002\022\007\n\003RED\020\003\022\t\n\005GREEN" +
      "\020\004\022\r\n\tRED_GREEN\020\006\022\024\n\020PINK_WHITE_GREEN\020\005\"" +
      "b\n\013OverlayType\022\034\n\030OVERLAY_TYPE_UNSPECIFI" +
      "ED\020\000\022\010\n\004NONE\020\001\022\014\n\010ORIGINAL\020\002\022\r\n\tGRAYSCAL" +
      "E\020\003\022\016\n\nMASK_BLACK\020\004\"\240\001\n\010Encoding\022\030\n\024ENCO" +
      "DING_UNSPECIFIED\020\000\022\014\n\010IDENTITY\020\001\022\023\n\017BAG_" +
      "OF_FEATURES\020\002\022\032\n\026BAG_OF_FEATURES_SPARSE\020" +
      "\003\022\r\n\tINDICATOR\020\004\022\026\n\022COMBINED_EMBEDDING\020\005" +
      "\022\024\n\020CONCAT_EMBEDDING\020\006\032\246\001\n\016OutputMetadat" +
      "a\022<\n\032index_display_name_mapping\030\001 \001(\0132\026." +
      "google.protobuf.ValueH\000\022\"\n\030display_name_" +
      "mapping_key\030\002 \001(\tH\000\022\032\n\022output_tensor_nam" +
      "e\030\003 \001(\tB\026\n\024display_name_mapping\032l\n\013Input" +
      "sEntry\022\013\n\003key\030\001 \001(\t\022L\n\005value\030\002 \001(\0132=.goo" +
      "gle.cloud.aiplatform.v1.ExplanationMetad" +
      "ata.InputMetadata:\0028\001\032n\n\014OutputsEntry\022\013\n" +
      "\003key\030\001 \001(\t\022M\n\005value\030\002 \001(\0132>.google.cloud" +
      ".aiplatform.v1.ExplanationMetadata.Outpu" +
      "tMetadata:\0028\001B\334\001\n\036com.google.cloud.aipla" +
      "tform.v1B\030ExplanationMetadataProtoP\001ZDgo" +
      "ogle.golang.org/genproto/googleapis/clou" +
      "d/aiplatform/v1;aiplatform\252\002\032Google.Clou" +
      "d.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfor" +
      "m\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_descriptor,
        new java.lang.String[] { "Inputs", "Outputs", "FeatureAttributionsSchemaUri", });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_descriptor =
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_descriptor,
        new java.lang.String[] { "InputBaselines", "InputTensorName", "Encoding", "Modality", "FeatureValueDomain", "IndicesTensorName", "DenseShapeTensorName", "IndexFeatureMapping", "EncodedTensorName", "EncodedBaselines", "Visualization", "GroupName", });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor =
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor,
        new java.lang.String[] { "MinValue", "MaxValue", "OriginalMean", "OriginalStddev", });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_Visualization_descriptor =
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_Visualization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputMetadata_Visualization_descriptor,
        new java.lang.String[] { "Type", "Polarity", "ColorMap", "ClipPercentUpperbound", "ClipPercentLowerbound", "OverlayType", });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputMetadata_descriptor =
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputMetadata_descriptor,
        new java.lang.String[] { "IndexDisplayNameMapping", "DisplayNameMappingKey", "OutputTensorName", "DisplayNameMapping", });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_InputsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplanationMetadata_OutputsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
