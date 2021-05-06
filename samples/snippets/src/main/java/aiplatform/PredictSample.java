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

// [START aiplatform_predict_tutorial]
// [START aiplatform_predict_sample]
import com.google.cloud.aiplatform.v1.EndpointName;
import com.google.cloud.aiplatform.v1.PredictResponse;
import com.google.cloud.aiplatform.v1.PredictionServiceClient;
import com.google.cloud.aiplatform.v1.PredictionServiceSettings;
import com.google.gson.JsonObject;
import com.google.protobuf.Value;
import com.google.protobuf.util.JsonFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PredictSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String endpointId = "ENDPOINT_ID";
    JsonObject jsonInstance = new JsonObject();
    predictSample(project, location, endpointId, jsonInstance);
  }

  static void predictSample(
      String project, String location, String endpointId, JsonObject jsonInstance)
      throws IOException {
    // The AI Platform services require regional API endpoints.
    PredictionServiceSettings settings =
        PredictionServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (PredictionServiceClient client = PredictionServiceClient.create(settings)) {
      Value.Builder instanceBuilder = Value.newBuilder();
      JsonFormat.parser().merge(jsonInstance.toString(), instanceBuilder);
      Value instance = instanceBuilder.build();
      List<Value> instances = new ArrayList<>();
      instances.add(instance);
      JsonObject jsonParameters = new JsonObject();
      EndpointName endpoint = EndpointName.of(project, location, endpointId);
      PredictResponse response = client.predict(endpoint, instances, parameters);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_predict_sample]
// [END aiplatform_predict_tutorial]
