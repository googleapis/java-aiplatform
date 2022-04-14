// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/prediction_service.proto

package com.google.cloud.aiplatform.v1;

public interface PredictRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.PredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString
      getEndpointBytes();

  /**
   * <pre>
   * Required. The instances that are the input to the prediction call.
   * A DeployedModel may have an upper limit on the number of instances it
   * supports per request, and when it is exceeded the prediction call errors
   * in case of AutoML Models, or, in case of customer created Models, the
   * behaviour is as documented by that Model.
   * The schema of any single instance may be specified via Endpoint's
   * DeployedModels' [Model's][google.cloud.aiplatform.v1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.protobuf.Value> 
      getInstancesList();
  /**
   * <pre>
   * Required. The instances that are the input to the prediction call.
   * A DeployedModel may have an upper limit on the number of instances it
   * supports per request, and when it is exceeded the prediction call errors
   * in case of AutoML Models, or, in case of customer created Models, the
   * behaviour is as documented by that Model.
   * The schema of any single instance may be specified via Endpoint's
   * DeployedModels' [Model's][google.cloud.aiplatform.v1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.Value getInstances(int index);
  /**
   * <pre>
   * Required. The instances that are the input to the prediction call.
   * A DeployedModel may have an upper limit on the number of instances it
   * supports per request, and when it is exceeded the prediction call errors
   * in case of AutoML Models, or, in case of customer created Models, the
   * behaviour is as documented by that Model.
   * The schema of any single instance may be specified via Endpoint's
   * DeployedModels' [Model's][google.cloud.aiplatform.v1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getInstancesCount();
  /**
   * <pre>
   * Required. The instances that are the input to the prediction call.
   * A DeployedModel may have an upper limit on the number of instances it
   * supports per request, and when it is exceeded the prediction call errors
   * in case of AutoML Models, or, in case of customer created Models, the
   * behaviour is as documented by that Model.
   * The schema of any single instance may be specified via Endpoint's
   * DeployedModels' [Model's][google.cloud.aiplatform.v1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.protobuf.ValueOrBuilder> 
      getInstancesOrBuilderList();
  /**
   * <pre>
   * Required. The instances that are the input to the prediction call.
   * A DeployedModel may have an upper limit on the number of instances it
   * supports per request, and when it is exceeded the prediction call errors
   * in case of AutoML Models, or, in case of customer created Models, the
   * behaviour is as documented by that Model.
   * The schema of any single instance may be specified via Endpoint's
   * DeployedModels' [Model's][google.cloud.aiplatform.v1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ValueOrBuilder getInstancesOrBuilder(
      int index);

  /**
   * <pre>
   * The parameters that govern the prediction. The schema of the parameters may
   * be specified via Endpoint's DeployedModels' [Model's ][google.cloud.aiplatform.v1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [parameters_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.parameters_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value parameters = 3;</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * The parameters that govern the prediction. The schema of the parameters may
   * be specified via Endpoint's DeployedModels' [Model's ][google.cloud.aiplatform.v1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [parameters_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.parameters_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value parameters = 3;</code>
   * @return The parameters.
   */
  com.google.protobuf.Value getParameters();
  /**
   * <pre>
   * The parameters that govern the prediction. The schema of the parameters may
   * be specified via Endpoint's DeployedModels' [Model's ][google.cloud.aiplatform.v1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [parameters_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.parameters_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value parameters = 3;</code>
   */
  com.google.protobuf.ValueOrBuilder getParametersOrBuilder();
}