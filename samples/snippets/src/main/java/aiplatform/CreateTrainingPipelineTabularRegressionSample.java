/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package aiplatform;

// [START aiplatform_create_training_pipeline_tabular_regression_sample]

import com.google.cloud.aiplatform.util.ValueConverter;
import com.google.cloud.aiplatform.v1.DeployedModelRef;
import com.google.cloud.aiplatform.v1.EnvVar;
import com.google.cloud.aiplatform.v1.FilterSplit;
import com.google.cloud.aiplatform.v1.FractionSplit;
import com.google.cloud.aiplatform.v1.InputDataConfig;
import com.google.cloud.aiplatform.v1.LocationName;
import com.google.cloud.aiplatform.v1.Model;
import com.google.cloud.aiplatform.v1.ModelContainerSpec;
import com.google.cloud.aiplatform.v1.PipelineServiceClient;
import com.google.cloud.aiplatform.v1.PipelineServiceSettings;
import com.google.cloud.aiplatform.v1.Port;
import com.google.cloud.aiplatform.v1.PredefinedSplit;
import com.google.cloud.aiplatform.v1.PredictSchemata;
import com.google.cloud.aiplatform.v1.TimestampSplit;
import com.google.cloud.aiplatform.v1.TrainingPipeline;
import com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs;
import com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs.Transformation;
import com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs.Transformation.AutoTransformation;
import com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs.Transformation.TimestampTransformation;
import com.google.rpc.Status;
import java.io.IOException;
import java.util.ArrayList;

public class CreateTrainingPipelineTabularRegressionSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "YOUR_PROJECT_ID";
    String modelDisplayName = "YOUR_DATASET_DISPLAY_NAME";
    String datasetId = "YOUR_DATASET_ID";
    String targetColumn = "TARGET_COLUMN";
    createTrainingPipelineTableRegression(project, modelDisplayName, datasetId, targetColumn);
  }

  static void createTrainingPipelineTableRegression(
      String project, String modelDisplayName, String datasetId, String targetColumn)
      throws IOException {
    PipelineServiceSettings pipelineServiceSettings =
        PipelineServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (PipelineServiceClient pipelineServiceClient =
        PipelineServiceClient.create(pipelineServiceSettings)) {
      String location = "us-central1";
      LocationName locationName = LocationName.of(project, location);
      String trainingTaskDefinition =
          "gs://google-cloud-aiplatform/schema/trainingjob/definition/automl_tables_1.0.0.yaml";

      // Set the columns used for training and their data types
      ArrayList<Transformation> tranformations = new ArrayList<>();
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(AutoTransformation.newBuilder().setColumnName("STRING_5000unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(AutoTransformation.newBuilder().setColumnName("INTEGER_5000unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(AutoTransformation.newBuilder().setColumnName("FLOAT_5000unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(AutoTransformation.newBuilder().setColumnName("FLOAT_5000unique_REPEATED"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(AutoTransformation.newBuilder().setColumnName("NUMERIC_5000unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(AutoTransformation.newBuilder().setColumnName("BOOLEAN_2unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setTimestamp(
                  TimestampTransformation.newBuilder()
                      .setColumnName("TIMESTAMP_1unique_NULLABLE")
                      .setInvalidValuesAllowed(true))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(AutoTransformation.newBuilder().setColumnName("DATE_1unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(AutoTransformation.newBuilder().setColumnName("TIME_1unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setTimestamp(
                  TimestampTransformation.newBuilder()
                      .setColumnName("DATETIME_1unique_NULLABLE")
                      .setInvalidValuesAllowed(true))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(
                  AutoTransformation.newBuilder()
                      .setColumnName("STRUCT_NULLABLE.STRING_5000unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(
                  AutoTransformation.newBuilder()
                      .setColumnName("STRUCT_NULLABLE.INTEGER_5000unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(
                  AutoTransformation.newBuilder()
                      .setColumnName("STRUCT_NULLABLE.FLOAT_5000unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(
                  AutoTransformation.newBuilder()
                      .setColumnName("STRUCT_NULLABLE.FLOAT_5000unique_REQUIRED"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(
                  AutoTransformation.newBuilder()
                      .setColumnName("STRUCT_NULLABLE.FLOAT_5000unique_REPEATED"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(
                  AutoTransformation.newBuilder()
                      .setColumnName("STRUCT_NULLABLE.NUMERIC_5000unique_NULLABLE"))
              .build());
      tranformations.add(
          Transformation.newBuilder()
              .setAuto(
                  AutoTransformation.newBuilder()
                      .setColumnName("STRUCT_NULLABLE.TIMESTAMP_1unique_NULLABLE"))
              .build());

      AutoMlTablesInputs trainingTaskInputs =
          AutoMlTablesInputs.newBuilder()
              .addAllTransformations(tranformations)
              .setTargetColumn(targetColumn)
              .setPredictionType("regression")
              .setTrainBudgetMilliNodeHours(8000)
              .setDisableEarlyStopping(false)
              // supported regression optimisation objectives: minimize-rmse,
              // minimize-mae, minimize-rmsle
              .setOptimizationObjective("minimize-rmse")
              .build();

      FractionSplit fractionSplit =
          FractionSplit.newBuilder()
              .setTrainingFraction(0.8)
              .setValidationFraction(0.1)
              .setTestFraction(0.1)
              .build();

      InputDataConfig inputDataConfig =
          InputDataConfig.newBuilder()
              .setDatasetId(datasetId)
              .setFractionSplit(fractionSplit)
              .build();
      Model modelToUpload = Model.newBuilder().setDisplayName(modelDisplayName).build();

      TrainingPipeline trainingPipeline =
          TrainingPipeline.newBuilder()
              .setDisplayName(modelDisplayName)
              .setTrainingTaskDefinition(trainingTaskDefinition)
              .setTrainingTaskInputs(ValueConverter.toValue(trainingTaskInputs))
              .setInputDataConfig(inputDataConfig)
              .setModelToUpload(modelToUpload)
              .build();

      TrainingPipeline trainingPipelineResponse =
          pipelineServiceClient.createTrainingPipeline(locationName, trainingPipeline);

      System.out.println("Create Training Pipeline Tabular Regression Response");
      System.out.format("\tName: %s\n", trainingPipelineResponse.getName());
      System.out.format("\tDisplay Name: %s\n", trainingPipelineResponse.getDisplayName());
      System.out.format(
          "\tTraining Task Definition: %s\n", trainingPipelineResponse.getTrainingTaskDefinition());
      System.out.format(
          "\tTraining Task Inputs: %s\n", trainingPipelineResponse.getTrainingTaskInputs());
      System.out.format(
          "\tTraining Task Metadata: %s\n", trainingPipelineResponse.getTrainingTaskMetadata());

      System.out.format("\tState: %s\n", trainingPipelineResponse.getState());
      System.out.format("\tCreate Time: %s\n", trainingPipelineResponse.getCreateTime());
      System.out.format("\tStart Time: %s\n", trainingPipelineResponse.getStartTime());
      System.out.format("\tEnd Time: %s\n", trainingPipelineResponse.getEndTime());
      System.out.format("\tUpdate Time: %s\n", trainingPipelineResponse.getUpdateTime());
      System.out.format("\tLabels: %s\n", trainingPipelineResponse.getLabelsMap());

      InputDataConfig inputDataConfigResponse = trainingPipelineResponse.getInputDataConfig();
      System.out.println("\tInput Data Config");
      System.out.format("\t\tDataset Id: %s\n", inputDataConfigResponse.getDatasetId());
      System.out.format(
          "\t\tAnnotations Filter: %s\n", inputDataConfigResponse.getAnnotationsFilter());

      FractionSplit fractionSplitResponse = inputDataConfigResponse.getFractionSplit();
      System.out.println("\t\tFraction Split");
      System.out.format(
          "\t\t\tTraining Fraction: %s\n", fractionSplitResponse.getTrainingFraction());
      System.out.format(
          "\t\t\tValidation Fraction: %s\n", fractionSplitResponse.getValidationFraction());
      System.out.format("\t\t\tTest Fraction: %s\n", fractionSplitResponse.getTestFraction());

      FilterSplit filterSplit = inputDataConfigResponse.getFilterSplit();
      System.out.println("\t\tFilter Split");
      System.out.format("\t\t\tTraining Fraction: %s\n", filterSplit.getTrainingFilter());
      System.out.format("\t\t\tValidation Fraction: %s\n", filterSplit.getValidationFilter());
      System.out.format("\t\t\tTest Fraction: %s\n", filterSplit.getTestFilter());

      PredefinedSplit predefinedSplit = inputDataConfigResponse.getPredefinedSplit();
      System.out.println("\t\tPredefined Split");
      System.out.format("\t\t\tKey: %s\n", predefinedSplit.getKey());

      TimestampSplit timestampSplit = inputDataConfigResponse.getTimestampSplit();
      System.out.println("\t\tTimestamp Split");
      System.out.format("\t\t\tTraining Fraction: %s\n", timestampSplit.getTrainingFraction());
      System.out.format("\t\t\tValidation Fraction: %s\n", timestampSplit.getValidationFraction());
      System.out.format("\t\t\tTest Fraction: %s\n", timestampSplit.getTestFraction());
      System.out.format("\t\t\tKey: %s\n", timestampSplit.getKey());

      Model modelResponse = trainingPipelineResponse.getModelToUpload();
      System.out.println("\tModel To Upload");
      System.out.format("\t\tName: %s\n", modelResponse.getName());
      System.out.format("\t\tDisplay Name: %s\n", modelResponse.getDisplayName());
      System.out.format("\t\tDescription: %s\n", modelResponse.getDescription());
      System.out.format("\t\tMetadata Schema Uri: %s\n", modelResponse.getMetadataSchemaUri());
      System.out.format("\t\tMeta Data: %s\n", modelResponse.getMetadata());
      System.out.format("\t\tTraining Pipeline: %s\n", modelResponse.getTrainingPipeline());
      System.out.format("\t\tArtifact Uri: %s\n", modelResponse.getArtifactUri());

      System.out.format(
          "\t\tSupported Deployment Resources Types: %s\n",
          modelResponse.getSupportedDeploymentResourcesTypesList().toString());
      System.out.format(
          "\t\tSupported Input Storage Formats: %s\n",
          modelResponse.getSupportedInputStorageFormatsList().toString());
      System.out.format(
          "\t\tSupported Output Storage Formats: %s\n",
          modelResponse.getSupportedOutputStorageFormatsList().toString());

      System.out.format("\t\tCreate Time: %s\n", modelResponse.getCreateTime());
      System.out.format("\t\tUpdate Time: %s\n", modelResponse.getUpdateTime());
      System.out.format("\t\tLables: %s\n", modelResponse.getLabelsMap());
      PredictSchemata predictSchemata = modelResponse.getPredictSchemata();

      System.out.println("\tPredict Schemata");
      System.out.format("\t\tInstance Schema Uri: %s\n", predictSchemata.getInstanceSchemaUri());
      System.out.format(
          "\t\tParameters Schema Uri: %s\n", predictSchemata.getParametersSchemaUri());
      System.out.format(
          "\t\tPrediction Schema Uri: %s\n", predictSchemata.getPredictionSchemaUri());

      for (Model.ExportFormat supportedExportFormat :
          modelResponse.getSupportedExportFormatsList()) {
        System.out.println("\tSupported Export Format");
        System.out.format("\t\tId: %s\n", supportedExportFormat.getId());
      }
      ModelContainerSpec containerSpec = modelResponse.getContainerSpec();

      System.out.println("\tContainer Spec");
      System.out.format("\t\tImage Uri: %s\n", containerSpec.getImageUri());
      System.out.format("\t\tCommand: %s\n", containerSpec.getCommandList());
      System.out.format("\t\tArgs: %s\n", containerSpec.getArgsList());
      System.out.format("\t\tPredict Route: %s\n", containerSpec.getPredictRoute());
      System.out.format("\t\tHealth Route: %s\n", containerSpec.getHealthRoute());

      for (EnvVar envVar : containerSpec.getEnvList()) {
        System.out.println("\t\tEnv");
        System.out.format("\t\t\tName: %s\n", envVar.getName());
        System.out.format("\t\t\tValue: %s\n", envVar.getValue());
      }

      for (Port port : containerSpec.getPortsList()) {
        System.out.println("\t\tPort");
        System.out.format("\t\t\tContainer Port: %s\n", port.getContainerPort());
      }

      for (DeployedModelRef deployedModelRef : modelResponse.getDeployedModelsList()) {
        System.out.println("\tDeployed Model");
        System.out.format("\t\tEndpoint: %s\n", deployedModelRef.getEndpoint());
        System.out.format("\t\tDeployed Model Id: %s\n", deployedModelRef.getDeployedModelId());
      }

      Status status = trainingPipelineResponse.getError();
      System.out.println("\tError");
      System.out.format("\t\tCode: %s\n", status.getCode());
      System.out.format("\t\tMessage: %s\n", status.getMessage());
    }
  }
}
// [END aiplatform_create_training_pipeline_tabular_regression_sample]
