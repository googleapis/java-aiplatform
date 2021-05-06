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

// [START aiplatform_predict_image_file_sample]
import com.google.cloud.aiplatform.v1.EndpointName;
import com.google.cloud.aiplatform.v1.PredictResponse;
import com.google.cloud.aiplatform.v1.PredictionServiceClient;
import com.google.cloud.aiplatform.v1.PredictionServiceSettings;
import com.google.gson.JsonObject;
import com.google.protobuf.Value;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Base64;

public class PredictImageFileSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String endpointId = "ENDPOINT_ID";
    String filename = "FILENAME";
    predictImageFileSample(project, location, endpointId, filename);
  }

  static void predictImageFileSample(
      String project, String location, String endpointId, String filename) throws IOException {
    // The AI Platform services require regional API endpoints.
    PredictionServiceSettings settings =
        PredictionServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (PredictionServiceClient client = PredictionServiceClient.create(settings)) {
      byte[] content = Files.readAllBytes(Paths.get(filename));
      byte[] encodedContent = Base64.encodeBase64(content);
      JsonObject jsonInstance = new JsonObject();
      jsonInstance.addProperty("content", jsonEncodedContent);
      List<Value> instances = new ArrayList<>();
      instances.add(instance);
      // See gs://google-cloud-aiplatform/schema/predict/params/image_classification_1.0.0.yaml for
      // the format of the parameters.
      JsonObject jsonParameters = new JsonObject();
      EndpointName endpoint = EndpointName.of(project, location, endpointId);
      PredictResponse response = client.predict(endpoint, instances, parameters);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_predict_image_file_sample]
