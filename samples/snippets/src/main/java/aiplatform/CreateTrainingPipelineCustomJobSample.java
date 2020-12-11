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

// [START aiplatform_create_training_pipeline_custom_job_sample]
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.cloud.aiplatform.v1beta1.Model;
import com.google.cloud.aiplatform.v1beta1.ModelContainerSpec;
import com.google.cloud.aiplatform.v1beta1.PipelineServiceClient;
import com.google.cloud.aiplatform.v1beta1.PipelineServiceSettings;
import com.google.cloud.aiplatform.v1beta1.TrainingPipeline;
import com.google.protobuf.Value;
import com.google.protobuf.util.JsonFormat;
import java.io.IOException;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;

public class CreateTrainingPipelineCustomJobSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String displayName = "DISPLAY_NAME";
    String modelDisplayName = "MODEL_DISPLAY_NAME";
    String containerImageUri = "CONTAINER_IMAGE_URI";
    String baseOutputDirectoryPrefix = "BASE_OUTPUT_DIRECTORY_PREFIX";
    createTrainingPipelineCustomJobSample(
        project, displayName, modelDisplayName, containerImageUri, baseOutputDirectoryPrefix);
  }

  static void createTrainingPipelineCustomJobSample(
      String project,
      String displayName,
      String modelDisplayName,
      String containerImageUri,
      String baseOutputDirectoryPrefix)
      throws IOException {
    PipelineServiceSettings settings =
        PipelineServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();
    String location = "us-central1";

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (PipelineServiceClient client = PipelineServiceClient.create(settings)) {
      JsonObject jsonMachineSpec =
          Json.createObjectBuilder().add("machineType", "n1-standard-4").build();
      JsonArray jsonArgs =
          Json.createArrayBuilder()
              // AIP_MODEL_DIR is set by the service according to baseOutputDirectory.
              .add("--model_dir=$(AIP_MODEL_DIR)")
              .build();
      JsonObject jsonContainerSpec =
          Json.createObjectBuilder()
              // A working docker image can be found at
              // gs://cloud-samples-data/ai-platform/mnist_tfrecord/custom_job
              .add("imageUri", containerImageUri)
              .add("args", jsonArgs)
              .build();
      JsonObject jsonJsonWorkerPoolSpec0 =
          Json.createObjectBuilder()
              .add("replicaCount", 1)
              .add("machineSpec", jsonMachineSpec)
              .add("containerSpec", jsonContainerSpec)
              .build();
      JsonArray jsonWorkerPoolSpecs =
          Json.createArrayBuilder().add(jsonJsonWorkerPoolSpec0).build();
      JsonObject jsonBaseOutputDirectory =
          Json.createObjectBuilder()
              // The GCS location for outputs must be accessible by the project's AI Platform
              // service account.
              .add("output_uri_prefix", baseOutputDirectoryPrefix)
              .build();
      JsonObject jsonTrainingTaskInputs =
          Json.createObjectBuilder()
              .add("workerPoolSpecs", jsonWorkerPoolSpecs)
              .add("baseOutputDirectory", jsonBaseOutputDirectory)
              .build();
      Value.Builder trainingTaskInputsBuilder = Value.newBuilder();
      JsonFormat.parser().merge(jsonTrainingTaskInputs.toString(), trainingTaskInputsBuilder);
      Value trainingTaskInputs = trainingTaskInputsBuilder.build();
      String trainingTaskDefinition =
          "gs://google-cloud-aiplatform/schema/trainingjob/definition/custom_task_1.0.0.yaml";
      String imageUri = "gcr.io/cloud-aiplatform/prediction/tf-cpu.1-15:latest";
      ModelContainerSpec containerSpec =
          ModelContainerSpec.newBuilder().setImageUri(imageUri).build();
      Model modelToUpload =
          Model.newBuilder()
              .setDisplayName(modelDisplayName)
              .setContainerSpec(containerSpec)
              .build();
      TrainingPipeline trainingPipeline =
          TrainingPipeline.newBuilder()
              .setDisplayName(displayName)
              .setTrainingTaskDefinition(trainingTaskDefinition)
              .setTrainingTaskInputs(trainingTaskInputs)
              .setModelToUpload(modelToUpload)
              .build();
      LocationName parent = LocationName.of(project, location);
      TrainingPipeline response = client.createTrainingPipeline(parent, trainingPipeline);
      System.out.format("response: %s\n", response);
      System.out.format("Name: %s\n", response.getName());
    }
  }
}

// [END aiplatform_create_training_pipeline_custom_job_sample]
