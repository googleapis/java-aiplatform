// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/dataset_service.proto

package com.google.cloud.aiplatform.v1;

public interface ExportDataOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExportDataOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The common part of the operation metadata.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return Whether the genericMetadata field is set.
   */
  boolean hasGenericMetadata();
  /**
   * <pre>
   * The common part of the operation metadata.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return The genericMetadata.
   */
  com.google.cloud.aiplatform.v1.GenericOperationMetadata getGenericMetadata();
  /**
   * <pre>
   * The common part of the operation metadata.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder();

  /**
   * <pre>
   * A Google Cloud Storage directory which path ends with '/'. The exported
   * data is stored in the directory.
   * </pre>
   *
   * <code>string gcs_output_directory = 2;</code>
   * @return The gcsOutputDirectory.
   */
  java.lang.String getGcsOutputDirectory();
  /**
   * <pre>
   * A Google Cloud Storage directory which path ends with '/'. The exported
   * data is stored in the directory.
   * </pre>
   *
   * <code>string gcs_output_directory = 2;</code>
   * @return The bytes for gcsOutputDirectory.
   */
  com.google.protobuf.ByteString
      getGcsOutputDirectoryBytes();
}