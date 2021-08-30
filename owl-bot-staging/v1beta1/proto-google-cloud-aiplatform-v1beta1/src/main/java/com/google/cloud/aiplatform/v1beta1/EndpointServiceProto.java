// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/endpoint_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class EndpointServiceProto {
  private EndpointServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/endpoi" +
      "nt_service.proto\022\037google.cloud.aiplatfor" +
      "m.v1beta1\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\032.google/cloud/aiplatform/v1beta1/en" +
      "dpoint.proto\032/google/cloud/aiplatform/v1" +
      "beta1/operation.proto\032#google/longrunnin" +
      "g/operations.proto\032 google/protobuf/fiel" +
      "d_mask.proto\"\224\001\n\025CreateEndpointRequest\0229" +
      "\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.google" +
      "apis.com/Location\022@\n\010endpoint\030\002 \001(\0132).go" +
      "ogle.cloud.aiplatform.v1beta1.EndpointB\003" +
      "\340A\002\"v\n\037CreateEndpointOperationMetadata\022S" +
      "\n\020generic_metadata\030\001 \001(\01329.google.cloud." +
      "aiplatform.v1beta1.GenericOperationMetad" +
      "ata\"N\n\022GetEndpointRequest\0228\n\004name\030\001 \001(\tB" +
      "*\340A\002\372A$\n\"aiplatform.googleapis.com/Endpo" +
      "int\"\313\001\n\024ListEndpointsRequest\0229\n\006parent\030\001" +
      " \001(\tB)\340A\002\372A#\n!locations.googleapis.com/L" +
      "ocation\022\023\n\006filter\030\002 \001(\tB\003\340A\001\022\026\n\tpage_siz" +
      "e\030\003 \001(\005B\003\340A\001\022\027\n\npage_token\030\004 \001(\tB\003\340A\001\0222\n" +
      "\tread_mask\030\005 \001(\0132\032.google.protobuf.Field" +
      "MaskB\003\340A\001\"n\n\025ListEndpointsResponse\022<\n\ten" +
      "dpoints\030\001 \003(\0132).google.cloud.aiplatform." +
      "v1beta1.Endpoint\022\027\n\017next_page_token\030\002 \001(" +
      "\t\"\217\001\n\025UpdateEndpointRequest\022@\n\010endpoint\030" +
      "\001 \001(\0132).google.cloud.aiplatform.v1beta1." +
      "EndpointB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.goo" +
      "gle.protobuf.FieldMaskB\003\340A\002\"Q\n\025DeleteEnd" +
      "pointRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aipl" +
      "atform.googleapis.com/Endpoint\"\262\002\n\022Deplo" +
      "yModelRequest\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n" +
      "\"aiplatform.googleapis.com/Endpoint\022K\n\016d" +
      "eployed_model\030\002 \001(\0132..google.cloud.aipla" +
      "tform.v1beta1.DeployedModelB\003\340A\002\022\\\n\rtraf" +
      "fic_split\030\003 \003(\0132E.google.cloud.aiplatfor" +
      "m.v1beta1.DeployModelRequest.TrafficSpli" +
      "tEntry\0323\n\021TrafficSplitEntry\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\005:\0028\001\"]\n\023DeployModelRespon" +
      "se\022F\n\016deployed_model\030\001 \001(\0132..google.clou" +
      "d.aiplatform.v1beta1.DeployedModel\"s\n\034De" +
      "ployModelOperationMetadata\022S\n\020generic_me" +
      "tadata\030\001 \001(\01329.google.cloud.aiplatform.v" +
      "1beta1.GenericOperationMetadata\"\211\002\n\024Unde" +
      "ployModelRequest\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372" +
      "A$\n\"aiplatform.googleapis.com/Endpoint\022\036" +
      "\n\021deployed_model_id\030\002 \001(\tB\003\340A\002\022^\n\rtraffi" +
      "c_split\030\003 \003(\0132G.google.cloud.aiplatform." +
      "v1beta1.UndeployModelRequest.TrafficSpli" +
      "tEntry\0323\n\021TrafficSplitEntry\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\005:\0028\001\"\027\n\025UndeployModelResp" +
      "onse\"u\n\036UndeployModelOperationMetadata\022S" +
      "\n\020generic_metadata\030\001 \001(\01329.google.cloud." +
      "aiplatform.v1beta1.GenericOperationMetad" +
      "ata2\267\r\n\017EndpointService\022\356\001\n\016CreateEndpoi" +
      "nt\0226.google.cloud.aiplatform.v1beta1.Cre" +
      "ateEndpointRequest\032\035.google.longrunning." +
      "Operation\"\204\001\202\323\344\223\002>\"2/v1beta1/{parent=pro" +
      "jects/*/locations/*}/endpoints:\010endpoint" +
      "\332A\017parent,endpoint\312A+\n\010Endpoint\022\037CreateE" +
      "ndpointOperationMetadata\022\260\001\n\013GetEndpoint" +
      "\0223.google.cloud.aiplatform.v1beta1.GetEn" +
      "dpointRequest\032).google.cloud.aiplatform." +
      "v1beta1.Endpoint\"A\202\323\344\223\0024\0222/v1beta1/{name" +
      "=projects/*/locations/*/endpoints/*}\332A\004n" +
      "ame\022\303\001\n\rListEndpoints\0225.google.cloud.aip" +
      "latform.v1beta1.ListEndpointsRequest\0326.g" +
      "oogle.cloud.aiplatform.v1beta1.ListEndpo" +
      "intsResponse\"C\202\323\344\223\0024\0222/v1beta1/{parent=p" +
      "rojects/*/locations/*}/endpoints\332A\006paren" +
      "t\022\331\001\n\016UpdateEndpoint\0226.google.cloud.aipl" +
      "atform.v1beta1.UpdateEndpointRequest\032).g" +
      "oogle.cloud.aiplatform.v1beta1.Endpoint\"" +
      "d\202\323\344\223\002G2;/v1beta1/{endpoint.name=project" +
      "s/*/locations/*/endpoints/*}:\010endpoint\332A" +
      "\024endpoint,update_mask\022\335\001\n\016DeleteEndpoint" +
      "\0226.google.cloud.aiplatform.v1beta1.Delet" +
      "eEndpointRequest\032\035.google.longrunning.Op" +
      "eration\"t\202\323\344\223\0024*2/v1beta1/{name=projects" +
      "/*/locations/*/endpoints/*}\332A\004name\312A0\n\025g" +
      "oogle.protobuf.Empty\022\027DeleteOperationMet" +
      "adata\022\217\002\n\013DeployModel\0223.google.cloud.aip" +
      "latform.v1beta1.DeployModelRequest\032\035.goo" +
      "gle.longrunning.Operation\"\253\001\202\323\344\223\002G\"B/v1b" +
      "eta1/{endpoint=projects/*/locations/*/en" +
      "dpoints/*}:deployModel:\001*\332A%endpoint,dep" +
      "loyed_model,traffic_split\312A3\n\023DeployMode" +
      "lResponse\022\034DeployModelOperationMetadata\022" +
      "\234\002\n\rUndeployModel\0225.google.cloud.aiplatf" +
      "orm.v1beta1.UndeployModelRequest\032\035.googl" +
      "e.longrunning.Operation\"\264\001\202\323\344\223\002I\"D/v1bet" +
      "a1/{endpoint=projects/*/locations/*/endp" +
      "oints/*}:undeployModel:\001*\332A(endpoint,dep" +
      "loyed_model_id,traffic_split\312A7\n\025Undeplo" +
      "yModelResponse\022\036UndeployModelOperationMe" +
      "tadata\032M\312A\031aiplatform.googleapis.com\322A.h" +
      "ttps://www.googleapis.com/auth/cloud-pla" +
      "tformB\361\001\n#com.google.cloud.aiplatform.v1" +
      "beta1B\024EndpointServiceProtoP\001ZIgoogle.go" +
      "lang.org/genproto/googleapis/cloud/aipla" +
      "tform/v1beta1;aiplatform\252\002\037Google.Cloud." +
      "AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlat" +
      "form\\V1beta1\352\002\"Google::Cloud::AIPlatform" +
      "::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_descriptor,
        new java.lang.String[] { "Parent", "Endpoint", });
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageSize", "PageToken", "ReadMask", });
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_descriptor,
        new java.lang.String[] { "Endpoints", "NextPageToken", });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_descriptor,
        new java.lang.String[] { "Endpoint", "UpdateMask", });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor,
        new java.lang.String[] { "Endpoint", "DeployedModel", "TrafficSplit", });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor,
        new java.lang.String[] { "DeployedModel", });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor,
        new java.lang.String[] { "Endpoint", "DeployedModelId", "TrafficSplit", });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
