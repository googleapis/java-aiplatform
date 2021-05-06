/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package aiplatform;

// [START aiplatform_create_training_pipeline_tabular_forecasting_sample]
import com.google.cloud.aiplatform.v1.FractionSplit;
import com.google.cloud.aiplatform.v1.InputDataConfig;
import com.google.cloud.aiplatform.v1.LocationName;
import com.google.cloud.aiplatform.v1.Model;
import com.google.cloud.aiplatform.v1.PipelineServiceClient;
import com.google.cloud.aiplatform.v1.PipelineServiceSettings;
import com.google.cloud.aiplatform.v1.TrainingPipeline;
import com.google.gson.JsonObject;
import java.io.IOException;

public class CreateTrainingPipelineTabularForecastingSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String displayName = "DISPLAY_NAME";
    String datasetId = "DATASET_ID";
    String modelDisplayName = "MODEL_DISPLAY_NAME";
    String targetColumn = "TARGET_COLUMN";
    String timeSeriesIdentifierColumn = "TIME_SERIES_IDENTIFIER_COLUMN";
    String timeColumn = "TIME_COLUMN";
    String staticColumns = "STATIC_COLUMNS";
    String timeVariantPastOnlyColumns = "TIME_VARIANT_PAST_ONLY_COLUMNS";
    String timeVariantPastAndFutureColumns = "TIME_VARIANT_PAST_AND_FUTURE_COLUMNS";
    Integer forecastWindowEnd;
    createTrainingPipelineTabularForecastingSample(
        project,
        location,
        displayName,
        datasetId,
        modelDisplayName,
        targetColumn,
        timeSeriesIdentifierColumn,
        timeColumn,
        staticColumns,
        timeVariantPastOnlyColumns,
        timeVariantPastAndFutureColumns,
        forecastWindowEnd);
  }

  static void createTrainingPipelineTabularForecastingSample(
      String project,
      String location,
      String displayName,
      String datasetId,
      String modelDisplayName,
      String targetColumn,
      String timeSeriesIdentifierColumn,
      String timeColumn,
      String staticColumns,
      String timeVariantPastOnlyColumns,
      String timeVariantPastAndFutureColumns,
      Integer forecastWindowEnd)
      throws IOException {
    // The AI Platform services require regional API endpoints.
    PipelineServiceSettings settings =
        PipelineServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (PipelineServiceClient client = PipelineServiceClient.create(settings)) {
      // TODO: build transformations here
      JsonObject jsonPeriod = new JsonObject();
      jsonPeriod.addProperty("unit", "day");
      jsonPeriod.addProperty("quantity", 1);
      // the inputs should be formatted according to the training_task_definition yaml file
      JsonObject jsonTrainingTaskInputs = new JsonObject();
      // required inputs
      jsonTrainingTaskInputs.addProperty("targetColumn", targetColumn);
      jsonTrainingTaskInputs.addProperty("timeSeriesIdentifierColumn", timeSeriesIdentifierColumn);
      jsonTrainingTaskInputs.addProperty("timeColumn", timeColumn);
      jsonTrainingTaskInputs.addProperty("transformations", jsonTransformations);
      jsonTrainingTaskInputs.addProperty("period", jsonPeriod);
      jsonTrainingTaskInputs.addProperty("optimizationObjective", "minimize-rmse");
      jsonTrainingTaskInputs.addProperty("trainBudgetMilliNodeHours", 8000);
      jsonTrainingTaskInputs.addProperty("staticColumns", staticColumns);
      jsonTrainingTaskInputs.addProperty("timeVariantPastOnlyColumns", timeVariantPastOnlyColumns);
      jsonTrainingTaskInputs.addProperty(
          "timeVariantPastAndFutureColumns", timeVariantPastAndFutureColumns);
      jsonTrainingTaskInputs.addProperty("forecastWindowEnd", forecastWindowEnd);
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
              .setDisplayName(displayName)
              .setTrainingTaskDefinition(
                  "gs://google-cloud-aiplatform/schema/trainingjob/definition/automl_forecasting_1.0.0.yaml")
              .setTrainingTaskInputs(trainingTaskInputs)
              .setInputDataConfig(inputDataConfig)
              .setModelToUpload(modelToUpload)
              .build();
      LocationName parent = LocationName.of(project, location);
      TrainingPipeline response = client.createTrainingPipeline(parent, trainingPipeline);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_create_training_pipeline_tabular_forecasting_sample]
