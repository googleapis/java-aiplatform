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
// source: google/cloud/aiplatform/v1beta1/featurestore_online_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class FeaturestoreOnlineServiceProto {
  private FeaturestoreOnlineServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/aiplatform/v1beta1/featur"
          + "estore_online_service.proto\022\037google.clou"
          + "d.aiplatform.v1beta1\032\034google/api/annotat"
          + "ions.proto\032\027google/api/client.proto\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\0326google/cloud/aiplatform"
          + "/v1beta1/feature_selector.proto\032+google/"
          + "cloud/aiplatform/v1beta1/types.proto\032\037go"
          + "ogle/protobuf/timestamp.proto\"\306\001\n\030ReadFe"
          + "atureValuesRequest\022A\n\013entity_type\030\001 \001(\tB"
          + ",\340A\002\372A&\n$aiplatform.googleapis.com/Entit"
          + "yType\022\026\n\tentity_id\030\002 \001(\tB\003\340A\002\022O\n\020feature"
          + "_selector\030\003 \001(\01320.google.cloud.aiplatfor"
          + "m.v1beta1.FeatureSelectorB\003\340A\002\"\263\005\n\031ReadF"
          + "eatureValuesResponse\022Q\n\006header\030\001 \001(\0132A.g"
          + "oogle.cloud.aiplatform.v1beta1.ReadFeatu"
          + "reValuesResponse.Header\022Z\n\013entity_view\030\002"
          + " \001(\0132E.google.cloud.aiplatform.v1beta1.R"
          + "eadFeatureValuesResponse.EntityView\032\037\n\021F"
          + "eatureDescriptor\022\n\n\002id\030\001 \001(\t\032\263\001\n\006Header\022"
          + ">\n\013entity_type\030\001 \001(\tB)\372A&\n$aiplatform.go"
          + "ogleapis.com/EntityType\022i\n\023feature_descr"
          + "iptors\030\002 \003(\0132L.google.cloud.aiplatform.v"
          + "1beta1.ReadFeatureValuesResponse.Feature"
          + "Descriptor\032\217\002\n\nEntityView\022\021\n\tentity_id\030\001"
          + " \001(\t\022X\n\004data\030\002 \003(\0132J.google.cloud.aiplat"
          + "form.v1beta1.ReadFeatureValuesResponse.E"
          + "ntityView.Data\032\223\001\n\004Data\022>\n\005value\030\001 \001(\0132-"
          + ".google.cloud.aiplatform.v1beta1.Feature"
          + "ValueH\000\022C\n\006values\030\002 \001(\01321.google.cloud.a"
          + "iplatform.v1beta1.FeatureValueListH\000B\006\n\004"
          + "data\"\320\001\n!StreamingReadFeatureValuesReque"
          + "st\022A\n\013entity_type\030\001 \001(\tB,\340A\002\372A&\n$aiplatf"
          + "orm.googleapis.com/EntityType\022\027\n\nentity_"
          + "ids\030\002 \003(\tB\003\340A\002\022O\n\020feature_selector\030\003 \001(\013"
          + "20.google.cloud.aiplatform.v1beta1.Featu"
          + "reSelectorB\003\340A\002\"\303\004\n\014FeatureValue\022\024\n\nbool"
          + "_value\030\001 \001(\010H\000\022\026\n\014double_value\030\002 \001(\001H\000\022\025"
          + "\n\013int64_value\030\005 \001(\003H\000\022\026\n\014string_value\030\006 "
          + "\001(\tH\000\022F\n\020bool_array_value\030\007 \001(\0132*.google"
          + ".cloud.aiplatform.v1beta1.BoolArrayH\000\022J\n"
          + "\022double_array_value\030\010 \001(\0132,.google.cloud"
          + ".aiplatform.v1beta1.DoubleArrayH\000\022H\n\021int"
          + "64_array_value\030\013 \001(\0132+.google.cloud.aipl"
          + "atform.v1beta1.Int64ArrayH\000\022J\n\022string_ar"
          + "ray_value\030\014 \001(\0132,.google.cloud.aiplatfor"
          + "m.v1beta1.StringArrayH\000\022\025\n\013bytes_value\030\r"
          + " \001(\014H\000\022M\n\010metadata\030\016 \001(\01326.google.cloud."
          + "aiplatform.v1beta1.FeatureValue.Metadata"
          + "B\003\340A\003\032=\n\010Metadata\0221\n\rgenerate_time\030\001 \001(\013"
          + "2\032.google.protobuf.TimestampB\007\n\005value\"Q\n"
          + "\020FeatureValueList\022=\n\006values\030\001 \003(\0132-.goog"
          + "le.cloud.aiplatform.v1beta1.FeatureValue"
          + "2\230\005\n FeaturestoreOnlineServingService\022\202\002"
          + "\n\021ReadFeatureValues\0229.google.cloud.aipla"
          + "tform.v1beta1.ReadFeatureValuesRequest\032:"
          + ".google.cloud.aiplatform.v1beta1.ReadFea"
          + "tureValuesResponse\"v\202\323\344\223\002b\"]/v1beta1/{en"
          + "tity_type=projects/*/locations/*/feature"
          + "stores/*/entityTypes/*}:readFeatureValue"
          + "s:\001*\332A\013entity_type\022\237\002\n\032StreamingReadFeat"
          + "ureValues\022B.google.cloud.aiplatform.v1be"
          + "ta1.StreamingReadFeatureValuesRequest\032:."
          + "google.cloud.aiplatform.v1beta1.ReadFeat"
          + "ureValuesResponse\"\177\202\323\344\223\002k\"f/v1beta1/{ent"
          + "ity_type=projects/*/locations/*/features"
          + "tores/*/entityTypes/*}:streamingReadFeat"
          + "ureValues:\001*\332A\013entity_type0\001\032M\312A\031aiplatf"
          + "orm.googleapis.com\322A.https://www.googlea"
          + "pis.com/auth/cloud-platformB\222\001\n#com.goog"
          + "le.cloud.aiplatform.v1beta1B\036Featurestor"
          + "eOnlineServiceProtoP\001ZIgoogle.golang.org"
          + "/genproto/googleapis/cloud/aiplatform/v1"
          + "beta1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeatureSelectorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.TypesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "EntityId", "FeatureSelector",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor,
            new java.lang.String[] {
              "Header", "EntityView",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_descriptor,
            new java.lang.String[] {
              "Id",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_descriptor,
            new java.lang.String[] {
              "EntityType", "FeatureDescriptors",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_descriptor,
            new java.lang.String[] {
              "EntityId", "Data",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_descriptor,
            new java.lang.String[] {
              "Value", "Values", "Data",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "EntityIds", "FeatureSelector",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_descriptor,
            new java.lang.String[] {
              "BoolValue",
              "DoubleValue",
              "Int64Value",
              "StringValue",
              "BoolArrayValue",
              "DoubleArrayValue",
              "Int64ArrayValue",
              "StringArrayValue",
              "BytesValue",
              "Metadata",
              "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_descriptor,
            new java.lang.String[] {
              "GenerateTime",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_descriptor,
            new java.lang.String[] {
              "Values",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureSelectorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.TypesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}