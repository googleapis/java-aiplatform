// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/annotation.proto

package com.google.cloud.aiplatform.v1;

public interface AnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Annotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the Annotation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the Annotation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Google Cloud Storage URI points to a YAML file describing [payload][google.cloud.aiplatform.v1.Annotation.payload]. The
   * schema is defined as an [OpenAPI 3.0.2 Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * The schema files that can be used here are found in
   * gs://google-cloud-aiplatform/schema/dataset/annotation/, note that the
   * chosen schema must be consistent with the parent Dataset's
   * [metadata][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri].
   * </pre>
   *
   * <code>string payload_schema_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The payloadSchemaUri.
   */
  java.lang.String getPayloadSchemaUri();
  /**
   * <pre>
   * Required. Google Cloud Storage URI points to a YAML file describing [payload][google.cloud.aiplatform.v1.Annotation.payload]. The
   * schema is defined as an [OpenAPI 3.0.2 Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * The schema files that can be used here are found in
   * gs://google-cloud-aiplatform/schema/dataset/annotation/, note that the
   * chosen schema must be consistent with the parent Dataset's
   * [metadata][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri].
   * </pre>
   *
   * <code>string payload_schema_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for payloadSchemaUri.
   */
  com.google.protobuf.ByteString
      getPayloadSchemaUriBytes();

  /**
   * <pre>
   * Required. The schema of the payload can be found in
   * [payload_schema][google.cloud.aiplatform.v1.Annotation.payload_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value payload = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * Required. The schema of the payload can be found in
   * [payload_schema][google.cloud.aiplatform.v1.Annotation.payload_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value payload = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The payload.
   */
  com.google.protobuf.Value getPayload();
  /**
   * <pre>
   * Required. The schema of the payload can be found in
   * [payload_schema][google.cloud.aiplatform.v1.Annotation.payload_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value payload = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ValueOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when this Annotation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this Annotation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this Annotation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when this Annotation was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this Annotation was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this Annotation was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Output only. The source of the Annotation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.UserActionReference annotation_source = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the annotationSource field is set.
   */
  boolean hasAnnotationSource();
  /**
   * <pre>
   * Output only. The source of the Annotation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.UserActionReference annotation_source = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The annotationSource.
   */
  com.google.cloud.aiplatform.v1.UserActionReference getAnnotationSource();
  /**
   * <pre>
   * Output only. The source of the Annotation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.UserActionReference annotation_source = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.UserActionReferenceOrBuilder getAnnotationSourceOrBuilder();

  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Annotations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Annotation(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Annotation:
   * * "aiplatform.googleapis.com/annotation_set_name":
   *   optional, name of the UI's annotation set this Annotation belongs to.
   *   If not set, the Annotation is not visible in the UI.
   * * "aiplatform.googleapis.com/payload_schema":
   *   output only, its value is the [payload_schema's][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Annotations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Annotation(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Annotation:
   * * "aiplatform.googleapis.com/annotation_set_name":
   *   optional, name of the UI's annotation set this Annotation belongs to.
   *   If not set, the Annotation is not visible in the UI.
   * * "aiplatform.googleapis.com/payload_schema":
   *   output only, its value is the [payload_schema's][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Annotations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Annotation(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Annotation:
   * * "aiplatform.googleapis.com/annotation_set_name":
   *   optional, name of the UI's annotation set this Annotation belongs to.
   *   If not set, the Annotation is not visible in the UI.
   * * "aiplatform.googleapis.com/payload_schema":
   *   output only, its value is the [payload_schema's][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Annotations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Annotation(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Annotation:
   * * "aiplatform.googleapis.com/annotation_set_name":
   *   optional, name of the UI's annotation set this Annotation belongs to.
   *   If not set, the Annotation is not visible in the UI.
   * * "aiplatform.googleapis.com/payload_schema":
   *   output only, its value is the [payload_schema's][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Annotations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Annotation(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Annotation:
   * * "aiplatform.googleapis.com/annotation_set_name":
   *   optional, name of the UI's annotation set this Annotation belongs to.
   *   If not set, the Annotation is not visible in the UI.
   * * "aiplatform.googleapis.com/payload_schema":
   *   output only, its value is the [payload_schema's][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
