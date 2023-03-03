// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/featurestore_service.proto

package com.google.cloud.aiplatform.v1;

public interface BatchReadFeatureValuesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Each read instance consists of exactly one read timestamp and one or more
   * entity IDs identifying entities of the corresponding EntityTypes whose
   * Features are requested.
   * Each output instance contains Feature values of requested entities
   * concatenated together as of the read time.
   * An example read instance may be `foo_entity_id, bar_entity_id,
   * 2020-01-01T10:00:00.123Z`.
   * An example output instance may be `foo_entity_id, bar_entity_id,
   * 2020-01-01T10:00:00.123Z, foo_entity_feature1_value,
   * bar_entity_feature2_value`.
   * Timestamp in each read instance must be millisecond-aligned.
   * `csv_read_instances` are read instances stored in a plain-text CSV file.
   * The header should be:
   *     [ENTITY_TYPE_ID1], [ENTITY_TYPE_ID2], ..., timestamp
   * The columns can be in any order.
   * Values in the timestamp column must use the RFC 3339 format, e.g.
   * `2012-07-30T10:43:17.123Z`.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_read_instances = 3;</code>
   * @return Whether the csvReadInstances field is set.
   */
  boolean hasCsvReadInstances();
  /**
   * <pre>
   * Each read instance consists of exactly one read timestamp and one or more
   * entity IDs identifying entities of the corresponding EntityTypes whose
   * Features are requested.
   * Each output instance contains Feature values of requested entities
   * concatenated together as of the read time.
   * An example read instance may be `foo_entity_id, bar_entity_id,
   * 2020-01-01T10:00:00.123Z`.
   * An example output instance may be `foo_entity_id, bar_entity_id,
   * 2020-01-01T10:00:00.123Z, foo_entity_feature1_value,
   * bar_entity_feature2_value`.
   * Timestamp in each read instance must be millisecond-aligned.
   * `csv_read_instances` are read instances stored in a plain-text CSV file.
   * The header should be:
   *     [ENTITY_TYPE_ID1], [ENTITY_TYPE_ID2], ..., timestamp
   * The columns can be in any order.
   * Values in the timestamp column must use the RFC 3339 format, e.g.
   * `2012-07-30T10:43:17.123Z`.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_read_instances = 3;</code>
   * @return The csvReadInstances.
   */
  com.google.cloud.aiplatform.v1.CsvSource getCsvReadInstances();
  /**
   * <pre>
   * Each read instance consists of exactly one read timestamp and one or more
   * entity IDs identifying entities of the corresponding EntityTypes whose
   * Features are requested.
   * Each output instance contains Feature values of requested entities
   * concatenated together as of the read time.
   * An example read instance may be `foo_entity_id, bar_entity_id,
   * 2020-01-01T10:00:00.123Z`.
   * An example output instance may be `foo_entity_id, bar_entity_id,
   * 2020-01-01T10:00:00.123Z, foo_entity_feature1_value,
   * bar_entity_feature2_value`.
   * Timestamp in each read instance must be millisecond-aligned.
   * `csv_read_instances` are read instances stored in a plain-text CSV file.
   * The header should be:
   *     [ENTITY_TYPE_ID1], [ENTITY_TYPE_ID2], ..., timestamp
   * The columns can be in any order.
   * Values in the timestamp column must use the RFC 3339 format, e.g.
   * `2012-07-30T10:43:17.123Z`.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_read_instances = 3;</code>
   */
  com.google.cloud.aiplatform.v1.CsvSourceOrBuilder getCsvReadInstancesOrBuilder();

  /**
   * <pre>
   * Similar to csv_read_instances, but from BigQuery source.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BigQuerySource bigquery_read_instances = 5;</code>
   * @return Whether the bigqueryReadInstances field is set.
   */
  boolean hasBigqueryReadInstances();
  /**
   * <pre>
   * Similar to csv_read_instances, but from BigQuery source.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BigQuerySource bigquery_read_instances = 5;</code>
   * @return The bigqueryReadInstances.
   */
  com.google.cloud.aiplatform.v1.BigQuerySource getBigqueryReadInstances();
  /**
   * <pre>
   * Similar to csv_read_instances, but from BigQuery source.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BigQuerySource bigquery_read_instances = 5;</code>
   */
  com.google.cloud.aiplatform.v1.BigQuerySourceOrBuilder getBigqueryReadInstancesOrBuilder();

  /**
   * <pre>
   * Required. The resource name of the Featurestore from which to query Feature
   * values. Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * </pre>
   *
   * <code>string featurestore = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The featurestore.
   */
  java.lang.String getFeaturestore();
  /**
   * <pre>
   * Required. The resource name of the Featurestore from which to query Feature
   * values. Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * </pre>
   *
   * <code>string featurestore = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for featurestore.
   */
  com.google.protobuf.ByteString
      getFeaturestoreBytes();

  /**
   * <pre>
   * Required. Specifies output location and format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureValueDestination destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <pre>
   * Required. Specifies output location and format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureValueDestination destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The destination.
   */
  com.google.cloud.aiplatform.v1.FeatureValueDestination getDestination();
  /**
   * <pre>
   * Required. Specifies output location and format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureValueDestination destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.FeatureValueDestinationOrBuilder getDestinationOrBuilder();

  /**
   * <pre>
   * When not empty, the specified fields in the *_read_instances source will be
   * joined as-is in the output, in addition to those fields from the
   * Featurestore Entity.
   * For BigQuery source, the type of the pass-through values will be
   * automatically inferred. For CSV source, the pass-through values will be
   * passed as opaque bytes.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughField pass_through_fields = 8;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughField> 
      getPassThroughFieldsList();
  /**
   * <pre>
   * When not empty, the specified fields in the *_read_instances source will be
   * joined as-is in the output, in addition to those fields from the
   * Featurestore Entity.
   * For BigQuery source, the type of the pass-through values will be
   * automatically inferred. For CSV source, the pass-through values will be
   * passed as opaque bytes.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughField pass_through_fields = 8;</code>
   */
  com.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughField getPassThroughFields(int index);
  /**
   * <pre>
   * When not empty, the specified fields in the *_read_instances source will be
   * joined as-is in the output, in addition to those fields from the
   * Featurestore Entity.
   * For BigQuery source, the type of the pass-through values will be
   * automatically inferred. For CSV source, the pass-through values will be
   * passed as opaque bytes.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughField pass_through_fields = 8;</code>
   */
  int getPassThroughFieldsCount();
  /**
   * <pre>
   * When not empty, the specified fields in the *_read_instances source will be
   * joined as-is in the output, in addition to those fields from the
   * Featurestore Entity.
   * For BigQuery source, the type of the pass-through values will be
   * automatically inferred. For CSV source, the pass-through values will be
   * passed as opaque bytes.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughField pass_through_fields = 8;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughFieldOrBuilder> 
      getPassThroughFieldsOrBuilderList();
  /**
   * <pre>
   * When not empty, the specified fields in the *_read_instances source will be
   * joined as-is in the output, in addition to those fields from the
   * Featurestore Entity.
   * For BigQuery source, the type of the pass-through values will be
   * automatically inferred. For CSV source, the pass-through values will be
   * passed as opaque bytes.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughField pass_through_fields = 8;</code>
   */
  com.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughFieldOrBuilder getPassThroughFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. Specifies EntityType grouping Features to read values of and
   * settings. Each EntityType referenced in
   * [BatchReadFeatureValuesRequest.entity_type_specs] must have a column
   * specifying entity IDs in the EntityType in
   * [BatchReadFeatureValuesRequest.request][] .
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpec entity_type_specs = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpec> 
      getEntityTypeSpecsList();
  /**
   * <pre>
   * Required. Specifies EntityType grouping Features to read values of and
   * settings. Each EntityType referenced in
   * [BatchReadFeatureValuesRequest.entity_type_specs] must have a column
   * specifying entity IDs in the EntityType in
   * [BatchReadFeatureValuesRequest.request][] .
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpec entity_type_specs = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpec getEntityTypeSpecs(int index);
  /**
   * <pre>
   * Required. Specifies EntityType grouping Features to read values of and
   * settings. Each EntityType referenced in
   * [BatchReadFeatureValuesRequest.entity_type_specs] must have a column
   * specifying entity IDs in the EntityType in
   * [BatchReadFeatureValuesRequest.request][] .
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpec entity_type_specs = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getEntityTypeSpecsCount();
  /**
   * <pre>
   * Required. Specifies EntityType grouping Features to read values of and
   * settings. Each EntityType referenced in
   * [BatchReadFeatureValuesRequest.entity_type_specs] must have a column
   * specifying entity IDs in the EntityType in
   * [BatchReadFeatureValuesRequest.request][] .
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpec entity_type_specs = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpecOrBuilder> 
      getEntityTypeSpecsOrBuilderList();
  /**
   * <pre>
   * Required. Specifies EntityType grouping Features to read values of and
   * settings. Each EntityType referenced in
   * [BatchReadFeatureValuesRequest.entity_type_specs] must have a column
   * specifying entity IDs in the EntityType in
   * [BatchReadFeatureValuesRequest.request][] .
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpec entity_type_specs = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpecOrBuilder getEntityTypeSpecsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Excludes Feature values with feature generation timestamp before
   * this timestamp. If not set, retrieve oldest values kept in Feature Store.
   * Timestamp, if present, must not have higher than millisecond precision.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Optional. Excludes Feature values with feature generation timestamp before
   * this timestamp. If not set, retrieve oldest values kept in Feature Store.
   * Timestamp, if present, must not have higher than millisecond precision.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Optional. Excludes Feature values with feature generation timestamp before
   * this timestamp. If not set, retrieve oldest values kept in Feature Store.
   * Timestamp, if present, must not have higher than millisecond precision.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  public com.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.ReadOptionCase getReadOptionCase();
}
