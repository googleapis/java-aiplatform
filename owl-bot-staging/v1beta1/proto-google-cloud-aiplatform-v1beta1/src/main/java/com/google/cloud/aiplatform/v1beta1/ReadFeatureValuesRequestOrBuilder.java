// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_online_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ReadFeatureValuesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ReadFeatureValuesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the EntityType for the entity being read.
   * Value format: `projects/{project}/locations/{location}/featurestores/
   * {featurestore}/entityTypes/{entityType}`. For example,
   * for a machine learning model predicting user clicks on a website, an
   * EntityType ID could be "user".
   * </pre>
   *
   * <code>string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The entityType.
   */
  java.lang.String getEntityType();
  /**
   * <pre>
   * Required. The resource name of the EntityType for the entity being read.
   * Value format: `projects/{project}/locations/{location}/featurestores/
   * {featurestore}/entityTypes/{entityType}`. For example,
   * for a machine learning model predicting user clicks on a website, an
   * EntityType ID could be "user".
   * </pre>
   *
   * <code>string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for entityType.
   */
  com.google.protobuf.ByteString
      getEntityTypeBytes();

  /**
   * <pre>
   * Required. ID for a specific entity. For example,
   * for a machine learning model predicting user clicks on a website, an entity
   * ID could be "user_123".
   * </pre>
   *
   * <code>string entity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * Required. ID for a specific entity. For example,
   * for a machine learning model predicting user clicks on a website, an entity
   * ID could be "user_123".
   * </pre>
   *
   * <code>string entity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <pre>
   * Required. Selector choosing Features of the target EntityType.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the featureSelector field is set.
   */
  boolean hasFeatureSelector();
  /**
   * <pre>
   * Required. Selector choosing Features of the target EntityType.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The featureSelector.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureSelector getFeatureSelector();
  /**
   * <pre>
   * Required. Selector choosing Features of the target EntityType.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureSelectorOrBuilder getFeatureSelectorOrBuilder();
}
