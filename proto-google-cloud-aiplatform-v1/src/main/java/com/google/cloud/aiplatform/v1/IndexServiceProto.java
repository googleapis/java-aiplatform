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
// source: google/cloud/aiplatform/v1/index_service.proto

package com.google.cloud.aiplatform.v1;

public final class IndexServiceProto {
  private IndexServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/aiplatform/v1/index_servi"
          + "ce.proto\022\032google.cloud.aiplatform.v1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032&google/"
          + "cloud/aiplatform/v1/index.proto\032*google/"
          + "cloud/aiplatform/v1/operation.proto\032#goo"
          + "gle/longrunning/operations.proto\032 google"
          + "/protobuf/field_mask.proto\"\206\001\n\022CreateInd"
          + "exRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locat"
          + "ions.googleapis.com/Location\0225\n\005index\030\002 "
          + "\001(\0132!.google.cloud.aiplatform.v1.IndexB\003"
          + "\340A\002\"\346\001\n\034CreateIndexOperationMetadata\022N\n\020"
          + "generic_metadata\030\001 \001(\01324.google.cloud.ai"
          + "platform.v1.GenericOperationMetadata\022v\n*"
          + "nearest_neighbor_search_operation_metada"
          + "ta\030\002 \001(\0132B.google.cloud.aiplatform.v1.Ne"
          + "arestNeighborSearchOperationMetadata\"H\n\017"
          + "GetIndexRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037a"
          + "iplatform.googleapis.com/Index\"\265\001\n\022ListI"
          + "ndexesRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!l"
          + "ocations.googleapis.com/Location\022\016\n\006filt"
          + "er\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_toke"
          + "n\030\004 \001(\t\022-\n\tread_mask\030\005 \001(\0132\032.google.prot"
          + "obuf.FieldMask\"b\n\023ListIndexesResponse\0222\n"
          + "\007indexes\030\001 \003(\0132!.google.cloud.aiplatform"
          + ".v1.Index\022\027\n\017next_page_token\030\002 \001(\t\"|\n\022Up"
          + "dateIndexRequest\0225\n\005index\030\001 \001(\0132!.google"
          + ".cloud.aiplatform.v1.IndexB\003\340A\002\022/\n\013updat"
          + "e_mask\030\002 \001(\0132\032.google.protobuf.FieldMask"
          + "\"\346\001\n\034UpdateIndexOperationMetadata\022N\n\020gen"
          + "eric_metadata\030\001 \001(\01324.google.cloud.aipla"
          + "tform.v1.GenericOperationMetadata\022v\n*nea"
          + "rest_neighbor_search_operation_metadata\030"
          + "\002 \001(\0132B.google.cloud.aiplatform.v1.Neare"
          + "stNeighborSearchOperationMetadata\"K\n\022Del"
          + "eteIndexRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037a"
          + "iplatform.googleapis.com/Index\"\221\001\n\027Upser"
          + "tDatapointsRequest\0226\n\005index\030\001 \001(\tB\'\340A\002\372A"
          + "!\n\037aiplatform.googleapis.com/Index\022>\n\nda"
          + "tapoints\030\002 \003(\0132*.google.cloud.aiplatform"
          + ".v1.IndexDatapoint\"\032\n\030UpsertDatapointsRe"
          + "sponse\"h\n\027RemoveDatapointsRequest\0226\n\005ind"
          + "ex\030\001 \001(\tB\'\340A\002\372A!\n\037aiplatform.googleapis."
          + "com/Index\022\025\n\rdatapoint_ids\030\002 \003(\t\"\032\n\030Remo"
          + "veDatapointsResponse\"\311\006\n&NearestNeighbor"
          + "SearchOperationMetadata\022{\n\030content_valid"
          + "ation_stats\030\001 \003(\0132Y.google.cloud.aiplatf"
          + "orm.v1.NearestNeighborSearchOperationMet"
          + "adata.ContentValidationStats\022\030\n\020data_byt"
          + "es_count\030\002 \001(\003\032\262\003\n\013RecordError\022r\n\nerror_"
          + "type\030\001 \001(\0162^.google.cloud.aiplatform.v1."
          + "NearestNeighborSearchOperationMetadata.R"
          + "ecordError.RecordErrorType\022\025\n\rerror_mess"
          + "age\030\002 \001(\t\022\026\n\016source_gcs_uri\030\003 \001(\t\022\024\n\014emb"
          + "edding_id\030\004 \001(\t\022\022\n\nraw_record\030\005 \001(\t\"\325\001\n\017"
          + "RecordErrorType\022\032\n\026ERROR_TYPE_UNSPECIFIE"
          + "D\020\000\022\016\n\nEMPTY_LINE\020\001\022\027\n\023INVALID_JSON_SYNT"
          + "AX\020\002\022\026\n\022INVALID_CSV_SYNTAX\020\003\022\027\n\023INVALID_"
          + "AVRO_SYNTAX\020\004\022\030\n\024INVALID_EMBEDDING_ID\020\005\022"
          + "\033\n\027EMBEDDING_SIZE_MISMATCH\020\006\022\025\n\021NAMESPAC"
          + "E_MISSING\020\007\032\322\001\n\026ContentValidationStats\022\026"
          + "\n\016source_gcs_uri\030\001 \001(\t\022\032\n\022valid_record_c"
          + "ount\030\002 \001(\003\022\034\n\024invalid_record_count\030\003 \001(\003"
          + "\022f\n\016partial_errors\030\004 \003(\0132N.google.cloud."
          + "aiplatform.v1.NearestNeighborSearchOpera"
          + "tionMetadata.RecordError2\266\013\n\014IndexServic"
          + "e\022\317\001\n\013CreateIndex\022..google.cloud.aiplatf"
          + "orm.v1.CreateIndexRequest\032\035.google.longr"
          + "unning.Operation\"q\202\323\344\223\0024\"+/v1/{parent=pr"
          + "ojects/*/locations/*}/indexes:\005index\332A\014p"
          + "arent,index\312A%\n\005Index\022\034CreateIndexOperat"
          + "ionMetadata\022\226\001\n\010GetIndex\022+.google.cloud."
          + "aiplatform.v1.GetIndexRequest\032!.google.c"
          + "loud.aiplatform.v1.Index\":\202\323\344\223\002-\022+/v1/{n"
          + "ame=projects/*/locations/*/indexes/*}\332A\004"
          + "name\022\254\001\n\013ListIndexes\022..google.cloud.aipl"
          + "atform.v1.ListIndexesRequest\032/.google.cl"
          + "oud.aiplatform.v1.ListIndexesResponse\"<\202"
          + "\323\344\223\002-\022+/v1/{parent=projects/*/locations/"
          + "*}/indexes\332A\006parent\022\332\001\n\013UpdateIndex\022..go"
          + "ogle.cloud.aiplatform.v1.UpdateIndexRequ"
          + "est\032\035.google.longrunning.Operation\"|\202\323\344\223"
          + "\002:21/v1/{index.name=projects/*/locations"
          + "/*/indexes/*}:\005index\332A\021index,update_mask"
          + "\312A%\n\005Index\022\034UpdateIndexOperationMetadata"
          + "\022\313\001\n\013DeleteIndex\022..google.cloud.aiplatfo"
          + "rm.v1.DeleteIndexRequest\032\035.google.longru"
          + "nning.Operation\"m\202\323\344\223\002-*+/v1/{name=proje"
          + "cts/*/locations/*/indexes/*}\332A\004name\312A0\n\025"
          + "google.protobuf.Empty\022\027DeleteOperationMe"
          + "tadata\022\307\001\n\020UpsertDatapoints\0223.google.clo"
          + "ud.aiplatform.v1.UpsertDatapointsRequest"
          + "\0324.google.cloud.aiplatform.v1.UpsertData"
          + "pointsResponse\"H\202\323\344\223\002B\"=/v1/{index=proje"
          + "cts/*/locations/*/indexes/*}:upsertDatap"
          + "oints:\001*\022\307\001\n\020RemoveDatapoints\0223.google.c"
          + "loud.aiplatform.v1.RemoveDatapointsReque"
          + "st\0324.google.cloud.aiplatform.v1.RemoveDa"
          + "tapointsResponse\"H\202\323\344\223\002B\"=/v1/{index=pro"
          + "jects/*/locations/*/indexes/*}:removeDat"
          + "apoints:\001*\032M\312A\031aiplatform.googleapis.com"
          + "\322A.https://www.googleapis.com/auth/cloud"
          + "-platformB\325\001\n\036com.google.cloud.aiplatfor"
          + "m.v1B\021IndexServiceProtoP\001ZDgoogle.golang"
          + ".org/genproto/googleapis/cloud/aiplatfor"
          + "m/v1;aiplatform\252\002\032Google.Cloud.AIPlatfor"
          + "m.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Goog"
          + "le::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IndexProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Index",
            });
    internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "NearestNeighborSearchOperationMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_GetIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetIndexRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_descriptor,
            new java.lang.String[] {
              "Indexes", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor,
            new java.lang.String[] {
              "Index", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "NearestNeighborSearchOperationMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_descriptor,
            new java.lang.String[] {
              "Index", "Datapoints",
            });
    internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_descriptor,
            new java.lang.String[] {
              "Index", "DatapointIds",
            });
    internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor,
            new java.lang.String[] {
              "ContentValidationStats", "DataBytesCount",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_descriptor =
        internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_descriptor,
            new java.lang.String[] {
              "ErrorType", "ErrorMessage", "SourceGcsUri", "EmbeddingId", "RawRecord",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor =
        internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor,
            new java.lang.String[] {
              "SourceGcsUri", "ValidRecordCount", "InvalidRecordCount", "PartialErrors",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IndexProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
