// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/encryption_spec.proto

package com.google.cloud.aiplatform.v1beta1;

public interface EncryptionSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.EncryptionSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Cloud KMS resource identifier of the customer managed encryption key
   * used to protect a resource. Has the form:
   * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
   * The key needs to be in the same region as where the compute resource is
   * created.
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   * <pre>
   * Required. The Cloud KMS resource identifier of the customer managed encryption key
   * used to protect a resource. Has the form:
   * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
   * The key needs to be in the same region as where the compute resource is
   * created.
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString
      getKmsKeyNameBytes();
}