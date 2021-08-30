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
// source: google/cloud/aiplatform/v1beta1/metadata_store.proto

package com.google.cloud.aiplatform.v1beta1;

public final class MetadataProto {
  private MetadataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_MetadataStoreState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_MetadataStoreState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/aiplatform/v1beta1/metada"
          + "ta_store.proto\022\037google.cloud.aiplatform."
          + "v1beta1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\0325google/clou"
          + "d/aiplatform/v1beta1/encryption_spec.pro"
          + "to\032\037google/protobuf/timestamp.proto\032\034goo"
          + "gle/api/annotations.proto\"\361\003\n\rMetadataSt"
          + "ore\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_time\030\003 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013"
          + "update_time\030\004 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\022H\n\017encryption_spec\030\005 \001(\0132/.go"
          + "ogle.cloud.aiplatform.v1beta1.Encryption"
          + "Spec\022\023\n\013description\030\006 \001(\t\022U\n\005state\030\007 \001(\013"
          + "2A.google.cloud.aiplatform.v1beta1.Metad"
          + "ataStore.MetadataStoreStateB\003\340A\003\0324\n\022Meta"
          + "dataStoreState\022\036\n\026disk_utilization_bytes"
          + "\030\001 \001(\003:u\352Ar\n\'aiplatform.googleapis.com/M"
          + "etadataStore\022Gprojects/{project}/locatio"
          + "ns/{location}/metadataStores/{metadata_s"
          + "tore}B\352\001\n#com.google.cloud.aiplatform.v1"
          + "beta1B\rMetadataProtoP\001ZIgoogle.golang.or"
          + "g/genproto/googleapis/cloud/aiplatform/v"
          + "1beta1;aiplatform\252\002\037Google.Cloud.AIPlatf"
          + "orm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1"
          + "beta1\352\002\"Google::Cloud::AIPlatform::V1bet"
          + "a1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "EncryptionSpec", "Description", "State",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_MetadataStoreState_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_MetadataStoreState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MetadataStore_MetadataStoreState_descriptor,
            new java.lang.String[] {
              "DiskUtilizationBytes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
