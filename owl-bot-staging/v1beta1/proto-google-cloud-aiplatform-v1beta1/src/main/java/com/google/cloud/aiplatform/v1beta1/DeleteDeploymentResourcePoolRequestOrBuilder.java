// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DeleteDeploymentResourcePoolRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeleteDeploymentResourcePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the DeploymentResourcePool to delete.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the DeploymentResourcePool to delete.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
