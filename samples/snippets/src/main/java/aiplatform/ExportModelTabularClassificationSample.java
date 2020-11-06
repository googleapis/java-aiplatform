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

// [START aiplatform_export_model_tabular_classification_sample]

import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.aiplatform.v1beta1.ExportModelOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.ExportModelRequest;
import com.google.cloud.aiplatform.v1beta1.ExportModelResponse;
import com.google.cloud.aiplatform.v1beta1.GcsDestination;
import com.google.cloud.aiplatform.v1beta1.ModelName;
import com.google.cloud.aiplatform.v1beta1.ModelServiceClient;
import com.google.cloud.aiplatform.v1beta1.ModelServiceSettings;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExportModelTabularClassificationSample {
  public static void main(String[] args)
      throws InterruptedException, ExecutionException, TimeoutException, IOException {
    // TODO(developer): Replace these variables before running the sample.
    String gcsDestinationOutputUriPrefix = "gs://your-gcs-bucket/destination_path";
    String project = "YOUR_PROJECT_ID";
    String modelId = "YOUR_MODEL_ID";
    exportModelTableClassification(gcsDestinationOutputUriPrefix, project, modelId);
  }

  static void exportModelTableClassification(
      String gcsDestinationOutputUriPrefix, String project, String modelId)
      throws IOException, ExecutionException, InterruptedException, TimeoutException {
    ModelServiceSettings modelServiceSettings =
        ModelServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (ModelServiceClient modelServiceClient = ModelServiceClient.create(modelServiceSettings)) {
      String location = "us-central1";
      ModelName modelName = ModelName.of(project, location, modelId);

      GcsDestination.Builder gcsDestination = GcsDestination.newBuilder();
      gcsDestination.setOutputUriPrefix(gcsDestinationOutputUriPrefix);
      ExportModelRequest.OutputConfig outputConfig =
          ExportModelRequest.OutputConfig.newBuilder()
              .setExportFormatId("tf-saved-model")
              .setArtifactDestination(gcsDestination)
              .build();

      OperationFuture<ExportModelResponse, ExportModelOperationMetadata> exportModelResponseFuture =
          modelServiceClient.exportModelAsync(modelName, outputConfig);
      System.out.format(
          "Operation name: %s\n", exportModelResponseFuture.getInitialFuture().get().getName());
      System.out.println("Waiting for operation to finish...");
      ExportModelResponse exportModelResponse =
          exportModelResponseFuture.get(300, TimeUnit.SECONDS);
      System.out.format(
          "Export Model Tabular Classification Response: %s", exportModelResponse.toString());
    }
  }
}
// [END aiplatform_export_model_tabular_classification_sample]
