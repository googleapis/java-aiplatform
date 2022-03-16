// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/metadata_schema.proto

package com.google.cloud.aiplatform.v1beta1;

public final class MetadataSchemaProto {
  private MetadataSchemaProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MetadataSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MetadataSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1beta1/metada" +
      "ta_schema.proto\022\037google.cloud.aiplatform" +
      ".v1beta1\032\034google/api/annotations.proto\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032\037google/protobuf/time" +
      "stamp.proto\"\205\004\n\016MetadataSchema\022\021\n\004name\030\001" +
      " \001(\tB\003\340A\003\022\026\n\016schema_version\030\002 \001(\t\022\023\n\006sch" +
      "ema\030\003 \001(\tB\003\340A\002\022W\n\013schema_type\030\004 \001(\0162B.go" +
      "ogle.cloud.aiplatform.v1beta1.MetadataSc" +
      "hema.MetadataSchemaType\0224\n\013create_time\030\005" +
      " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n" +
      "\013description\030\006 \001(\t\"s\n\022MetadataSchemaType" +
      "\022$\n METADATA_SCHEMA_TYPE_UNSPECIFIED\020\000\022\021" +
      "\n\rARTIFACT_TYPE\020\001\022\022\n\016EXECUTION_TYPE\020\002\022\020\n" +
      "\014CONTEXT_TYPE\020\003:\231\001\352A\225\001\n(aiplatform.googl" +
      "eapis.com/MetadataSchema\022iprojects/{proj" +
      "ect}/locations/{location}/metadataStores" +
      "/{metadata_store}/metadataSchemas/{metad" +
      "ata_schema}B\360\001\n#com.google.cloud.aiplatf" +
      "orm.v1beta1B\023MetadataSchemaProtoP\001ZIgoog" +
      "le.golang.org/genproto/googleapis/cloud/" +
      "aiplatform/v1beta1;aiplatform\252\002\037Google.C" +
      "loud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\A" +
      "IPlatform\\V1beta1\352\002\"Google::Cloud::AIPla" +
      "tform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_MetadataSchema_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MetadataSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MetadataSchema_descriptor,
        new java.lang.String[] { "Name", "SchemaVersion", "Schema", "SchemaType", "CreateTime", "Description", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
