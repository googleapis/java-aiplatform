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
// source: google/cloud/aiplatform/v1beta1/specialist_pool.proto

package com.google.cloud.aiplatform.v1beta1;

public final class SpecialistPoolProto {
  private SpecialistPoolProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SpecialistPool_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SpecialistPool_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1beta1/specia"
          + "list_pool.proto\022\037google.cloud.aiplatform"
          + ".v1beta1\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032\034google/api"
          + "/annotations.proto\"\254\002\n\016SpecialistPool\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022\031\n\014display_name\030\002 \001(\tB\003"
          + "\340A\002\022&\n\031specialist_managers_count\030\003 \001(\005B\003"
          + "\340A\003\022!\n\031specialist_manager_emails\030\004 \003(\t\022\'"
          + "\n\032pending_data_labeling_jobs\030\005 \003(\tB\003\340A\003:"
          + "x\352Au\n(aiplatform.googleapis.com/Speciali"
          + "stPool\022Iprojects/{project}/locations/{lo"
          + "cation}/specialistPools/{specialist_pool"
          + "}B\207\001\n#com.google.cloud.aiplatform.v1beta"
          + "1B\023SpecialistPoolProtoP\001ZIgoogle.golang."
          + "org/genproto/googleapis/cloud/aiplatform"
          + "/v1beta1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_SpecialistPool_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_SpecialistPool_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SpecialistPool_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "SpecialistManagersCount",
              "SpecialistManagerEmails",
              "PendingDataLabelingJobs",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
