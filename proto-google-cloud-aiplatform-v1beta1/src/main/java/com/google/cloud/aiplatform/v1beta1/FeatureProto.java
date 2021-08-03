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
// source: google/cloud/aiplatform/v1beta1/feature.proto

package com.google.cloud.aiplatform.v1beta1;

public final class FeatureProto {
  private FeatureProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/featur"
          + "e.proto\022\037google.cloud.aiplatform.v1beta1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032>google/cloud/aipla"
          + "tform/v1beta1/feature_monitoring_stats.p"
          + "roto\032=google/cloud/aiplatform/v1beta1/fe"
          + "aturestore_monitoring.proto\032\037google/prot"
          + "obuf/timestamp.proto\032\034google/api/annotat"
          + "ions.proto\"\355\006\n\007Feature\022\021\n\004name\030\001 \001(\tB\003\340A"
          + "\005\022\023\n\013description\030\002 \001(\t\022N\n\nvalue_type\030\003 \001"
          + "(\01622.google.cloud.aiplatform.v1beta1.Fea"
          + "ture.ValueTypeB\006\340A\002\340A\005\0224\n\013create_time\030\004 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013"
          + "update_time\030\005 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\022I\n\006labels\030\006 \003(\01324.google.clou"
          + "d.aiplatform.v1beta1.Feature.LabelsEntry"
          + "B\003\340A\001\022\014\n\004etag\030\007 \001(\t\022]\n\021monitoring_config"
          + "\030\t \001(\0132=.google.cloud.aiplatform.v1beta1"
          + ".FeaturestoreMonitoringConfigB\003\340A\001\022S\n\020mo"
          + "nitoring_stats\030\n \003(\01324.google.cloud.aipl"
          + "atform.v1beta1.FeatureStatsAnomalyB\003\340A\003\032"
          + "-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\t:\0028\001\"\244\001\n\tValueType\022\032\n\026VALUE_TYPE_UNSPE"
          + "CIFIED\020\000\022\010\n\004BOOL\020\001\022\016\n\nBOOL_ARRAY\020\002\022\n\n\006DO"
          + "UBLE\020\003\022\020\n\014DOUBLE_ARRAY\020\004\022\t\n\005INT64\020\t\022\017\n\013I"
          + "NT64_ARRAY\020\n\022\n\n\006STRING\020\013\022\020\n\014STRING_ARRAY"
          + "\020\014\022\t\n\005BYTES\020\r:\232\001\352A\226\001\n!aiplatform.googlea"
          + "pis.com/Feature\022qprojects/{project}/loca"
          + "tions/{location}/featurestores/{features"
          + "tore}/entityTypes/{entity_type}/features"
          + "/{feature}B\351\001\n#com.google.cloud.aiplatfo"
          + "rm.v1beta1B\014FeatureProtoP\001ZIgoogle.golan"
          + "g.org/genproto/googleapis/cloud/aiplatfo"
          + "rm/v1beta1;aiplatform\252\002\037Google.Cloud.AIP"
          + "latform.V1Beta1\312\002\037Google\\Cloud\\AIPlatfor"
          + "m\\V1beta1\352\002\"Google::Cloud::AIPlatform::V"
          + "1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Feature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "ValueType",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Etag",
              "MonitoringConfig",
              "MonitoringStats",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
