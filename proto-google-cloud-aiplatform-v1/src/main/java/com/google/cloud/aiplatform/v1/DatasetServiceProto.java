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
// source: google/cloud/aiplatform/v1/dataset_service.proto

package com.google.cloud.aiplatform.v1;

public final class DatasetServiceProto {
  private DatasetServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListDatasetsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDatasetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListDatasetsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDatasetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportDataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportDataResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportDataOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportDataOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ExportDataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExportDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ExportDataResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExportDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ExportDataOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExportDataOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListDataItemsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDataItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetAnnotationSpecRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetAnnotationSpecRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListAnnotationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListAnnotationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListAnnotationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListAnnotationsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1/dataset_ser"
          + "vice.proto\022\032google.cloud.aiplatform.v1\032\034"
          + "google/api/annotations.proto\032\027google/api"
          + "/client.proto\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032+googl"
          + "e/cloud/aiplatform/v1/annotation.proto\0320"
          + "google/cloud/aiplatform/v1/annotation_sp"
          + "ec.proto\032*google/cloud/aiplatform/v1/dat"
          + "a_item.proto\032(google/cloud/aiplatform/v1"
          + "/dataset.proto\032*google/cloud/aiplatform/"
          + "v1/operation.proto\032#google/longrunning/o"
          + "perations.proto\032 google/protobuf/field_m"
          + "ask.proto\"\214\001\n\024CreateDatasetRequest\0229\n\006pa"
          + "rent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis"
          + ".com/Location\0229\n\007dataset\030\002 \001(\0132#.google."
          + "cloud.aiplatform.v1.DatasetB\003\340A\002\"p\n\036Crea"
          + "teDatasetOperationMetadata\022N\n\020generic_me"
          + "tadata\030\001 \001(\01324.google.cloud.aiplatform.v"
          + "1.GenericOperationMetadata\"{\n\021GetDataset"
          + "Request\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!aiplatfor"
          + "m.googleapis.com/Dataset\022-\n\tread_mask\030\002 "
          + "\001(\0132\032.google.protobuf.FieldMask\"\207\001\n\024Upda"
          + "teDatasetRequest\0229\n\007dataset\030\001 \001(\0132#.goog"
          + "le.cloud.aiplatform.v1.DatasetB\003\340A\002\0224\n\013u"
          + "pdate_mask\030\002 \001(\0132\032.google.protobuf.Field"
          + "MaskB\003\340A\002\"\310\001\n\023ListDatasetsRequest\0229\n\006par"
          + "ent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis."
          + "com/Location\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_siz"
          + "e\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022-\n\tread_mask"
          + "\030\005 \001(\0132\032.google.protobuf.FieldMask\022\020\n\010or"
          + "der_by\030\006 \001(\t\"f\n\024ListDatasetsResponse\0225\n\010"
          + "datasets\030\001 \003(\0132#.google.cloud.aiplatform"
          + ".v1.Dataset\022\027\n\017next_page_token\030\002 \001(\t\"O\n\024"
          + "DeleteDatasetRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372"
          + "A#\n!aiplatform.googleapis.com/Dataset\"\227\001"
          + "\n\021ImportDataRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A"
          + "#\n!aiplatform.googleapis.com/Dataset\022I\n\016"
          + "import_configs\030\002 \003(\0132,.google.cloud.aipl"
          + "atform.v1.ImportDataConfigB\003\340A\002\"\024\n\022Impor"
          + "tDataResponse\"m\n\033ImportDataOperationMeta"
          + "data\022N\n\020generic_metadata\030\001 \001(\01324.google."
          + "cloud.aiplatform.v1.GenericOperationMeta"
          + "data\"\226\001\n\021ExportDataRequest\0227\n\004name\030\001 \001(\t"
          + "B)\340A\002\372A#\n!aiplatform.googleapis.com/Data"
          + "set\022H\n\rexport_config\030\002 \001(\0132,.google.clou"
          + "d.aiplatform.v1.ExportDataConfigB\003\340A\002\",\n"
          + "\022ExportDataResponse\022\026\n\016exported_files\030\001 "
          + "\003(\t\"\213\001\n\033ExportDataOperationMetadata\022N\n\020g"
          + "eneric_metadata\030\001 \001(\01324.google.cloud.aip"
          + "latform.v1.GenericOperationMetadata\022\034\n\024g"
          + "cs_output_directory\030\002 \001(\t\"\311\001\n\024ListDataIt"
          + "emsRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!aipl"
          + "atform.googleapis.com/Dataset\022\016\n\006filter\030"
          + "\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004"
          + " \001(\t\022-\n\tread_mask\030\005 \001(\0132\032.google.protobu"
          + "f.FieldMask\022\020\n\010order_by\030\006 \001(\t\"j\n\025ListDat"
          + "aItemsResponse\0228\n\ndata_items\030\001 \003(\0132$.goo"
          + "gle.cloud.aiplatform.v1.DataItem\022\027\n\017next"
          + "_page_token\030\002 \001(\t\"\211\001\n\030GetAnnotationSpecR"
          + "equest\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(aiplatform"
          + ".googleapis.com/AnnotationSpec\022-\n\tread_m"
          + "ask\030\002 \001(\0132\032.google.protobuf.FieldMask\"\314\001"
          + "\n\026ListAnnotationsRequest\022:\n\006parent\030\001 \001(\t"
          + "B*\340A\002\372A$\n\"aiplatform.googleapis.com/Data"
          + "Item\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022"
          + "\022\n\npage_token\030\004 \001(\t\022-\n\tread_mask\030\005 \001(\0132\032"
          + ".google.protobuf.FieldMask\022\020\n\010order_by\030\006"
          + " \001(\t\"o\n\027ListAnnotationsResponse\022;\n\013annot"
          + "ations\030\001 \003(\0132&.google.cloud.aiplatform.v"
          + "1.Annotation\022\027\n\017next_page_token\030\002 \001(\t2\330\020"
          + "\n\016DatasetService\022\334\001\n\rCreateDataset\0220.goo"
          + "gle.cloud.aiplatform.v1.CreateDatasetReq"
          + "uest\032\035.google.longrunning.Operation\"z\202\323\344"
          + "\223\0027\",/v1/{parent=projects/*/locations/*}"
          + "/datasets:\007dataset\332A\016parent,dataset\312A)\n\007"
          + "Dataset\022\036CreateDatasetOperationMetadata\022"
          + "\235\001\n\nGetDataset\022-.google.cloud.aiplatform"
          + ".v1.GetDatasetRequest\032#.google.cloud.aip"
          + "latform.v1.Dataset\";\202\323\344\223\002.\022,/v1/{name=pr"
          + "ojects/*/locations/*/datasets/*}\332A\004name\022"
          + "\303\001\n\rUpdateDataset\0220.google.cloud.aiplatf"
          + "orm.v1.UpdateDatasetRequest\032#.google.clo"
          + "ud.aiplatform.v1.Dataset\"[\202\323\344\223\002?24/v1/{d"
          + "ataset.name=projects/*/locations/*/datas"
          + "ets/*}:\007dataset\332A\023dataset,update_mask\022\260\001"
          + "\n\014ListDatasets\022/.google.cloud.aiplatform"
          + ".v1.ListDatasetsRequest\0320.google.cloud.a"
          + "iplatform.v1.ListDatasetsResponse\"=\202\323\344\223\002"
          + ".\022,/v1/{parent=projects/*/locations/*}/d"
          + "atasets\332A\006parent\022\320\001\n\rDeleteDataset\0220.goo"
          + "gle.cloud.aiplatform.v1.DeleteDatasetReq"
          + "uest\032\035.google.longrunning.Operation\"n\202\323\344"
          + "\223\002.*,/v1/{name=projects/*/locations/*/da"
          + "tasets/*}\332A\004name\312A0\n\025google.protobuf.Emp"
          + "ty\022\027DeleteOperationMetadata\022\345\001\n\nImportDa"
          + "ta\022-.google.cloud.aiplatform.v1.ImportDa"
          + "taRequest\032\035.google.longrunning.Operation"
          + "\"\210\001\202\323\344\223\0028\"3/v1/{name=projects/*/location"
          + "s/*/datasets/*}:import:\001*\332A\023name,import_"
          + "configs\312A1\n\022ImportDataResponse\022\033ImportDa"
          + "taOperationMetadata\022\344\001\n\nExportData\022-.goo"
          + "gle.cloud.aiplatform.v1.ExportDataReques"
          + "t\032\035.google.longrunning.Operation\"\207\001\202\323\344\223\002"
          + "8\"3/v1/{name=projects/*/locations/*/data"
          + "sets/*}:export:\001*\332A\022name,export_config\312A"
          + "1\n\022ExportDataResponse\022\033ExportDataOperati"
          + "onMetadata\022\277\001\n\rListDataItems\0220.google.cl"
          + "oud.aiplatform.v1.ListDataItemsRequest\0321"
          + ".google.cloud.aiplatform.v1.ListDataItem"
          + "sResponse\"I\202\323\344\223\002:\0228/v1/{parent=projects/"
          + "*/locations/*/datasets/*}/dataItems\332A\006pa"
          + "rent\022\304\001\n\021GetAnnotationSpec\0224.google.clou"
          + "d.aiplatform.v1.GetAnnotationSpecRequest"
          + "\032*.google.cloud.aiplatform.v1.Annotation"
          + "Spec\"M\202\323\344\223\002@\022>/v1/{name=projects/*/locat"
          + "ions/*/datasets/*/annotationSpecs/*}\332A\004n"
          + "ame\022\323\001\n\017ListAnnotations\0222.google.cloud.a"
          + "iplatform.v1.ListAnnotationsRequest\0323.go"
          + "ogle.cloud.aiplatform.v1.ListAnnotations"
          + "Response\"W\202\323\344\223\002H\022F/v1/{parent=projects/*"
          + "/locations/*/datasets/*/dataItems/*}/ann"
          + "otations\332A\006parent\032M\312A\031aiplatform.googlea"
          + "pis.com\322A.https://www.googleapis.com/aut"
          + "h/cloud-platformB\327\001\n\036com.google.cloud.ai"
          + "platform.v1B\023DatasetServiceProtoP\001ZDgoog"
          + "le.golang.org/genproto/googleapis/cloud/"
          + "aiplatform/v1;aiplatform\252\002\032Google.Cloud."
          + "AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\"
          + "V1\352\002\035Google::Cloud::AIPlatform::V1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.AnnotationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.AnnotationSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DataItemProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DatasetProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreateDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateDatasetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Dataset",
            });
    internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_GetDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetDatasetRequest_descriptor,
            new java.lang.String[] {
              "Name", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_UpdateDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateDatasetRequest_descriptor,
            new java.lang.String[] {
              "Dataset", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1_ListDatasetsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListDatasetsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListDatasetsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1_ListDatasetsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_ListDatasetsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListDatasetsResponse_descriptor,
            new java.lang.String[] {
              "Datasets", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_DeleteDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteDatasetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ImportDataRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_ImportDataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportDataRequest_descriptor,
            new java.lang.String[] {
              "Name", "ImportConfigs",
            });
    internal_static_google_cloud_aiplatform_v1_ImportDataResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_ImportDataResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportDataResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_ImportDataOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_ImportDataOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportDataOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_ExportDataRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_ExportDataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ExportDataRequest_descriptor,
            new java.lang.String[] {
              "Name", "ExportConfig",
            });
    internal_static_google_cloud_aiplatform_v1_ExportDataResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_ExportDataResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ExportDataResponse_descriptor,
            new java.lang.String[] {
              "ExportedFiles",
            });
    internal_static_google_cloud_aiplatform_v1_ExportDataOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1_ExportDataOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ExportDataOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "GcsOutputDirectory",
            });
    internal_static_google_cloud_aiplatform_v1_ListDataItemsRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1_ListDataItemsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListDataItemsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_descriptor,
            new java.lang.String[] {
              "DataItems", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_GetAnnotationSpecRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1_GetAnnotationSpecRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetAnnotationSpecRequest_descriptor,
            new java.lang.String[] {
              "Name", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1_ListAnnotationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_aiplatform_v1_ListAnnotationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListAnnotationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1_ListAnnotationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_aiplatform_v1_ListAnnotationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListAnnotationsResponse_descriptor,
            new java.lang.String[] {
              "Annotations", "NextPageToken",
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
    com.google.cloud.aiplatform.v1.AnnotationProto.getDescriptor();
    com.google.cloud.aiplatform.v1.AnnotationSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DataItemProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DatasetProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}