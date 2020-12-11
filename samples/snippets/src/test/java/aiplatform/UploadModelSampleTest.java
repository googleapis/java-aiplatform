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

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UploadModelSampleTest {

  private static final String PROJECT = System.getenv("UCAIP_PROJECT_ID");
  private static final String METADATASCHEMA_URI = "";
  private static final String IMAGE_URI =
      "gcr.io/cloud-ml-service-public/"
          + "cloud-ml-online-prediction-model-server-cpu:"
          + "v1_15py3cmle_op_images_20200229_0210_RC00";
  private static final String ARTIFACT_URI = "gs://ucaip-samples-us-central1/model/explain/";
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private PrintStream originalPrintStream;
  private String uploadedModelId;

  private static void requireEnvVar(String varName) {
    String errorMessage =
        String.format("Environment variable '%s' is required to perform these tests.", varName);
    assertNotNull(errorMessage, System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("UCAIP_PROJECT_ID");
  }

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    originalPrintStream = System.out;
    System.setOut(out);
  }

  @After
  public void tearDown()
      throws InterruptedException, ExecutionException, TimeoutException, IOException {
    // Cancel the Training Pipeline
    DeleteModelSample.deleteModel(PROJECT, uploadedModelId);

    // Assert
    String deleteModelResponse = bout.toString();
    assertThat(deleteModelResponse).contains("Deleted Model.");
    TimeUnit.MINUTES.sleep(1);
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void uploadModelSampleTest()
      throws InterruptedException, ExecutionException, TimeoutException, IOException {
    // Act
    String modelDisplayName =
        String.format(
            "temp_upload_model_test_%s",
            UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 26));
    UploadModelSample.uploadModel(
        PROJECT, modelDisplayName, METADATASCHEMA_URI, IMAGE_URI, ARTIFACT_URI);

    // Assert
    String got = bout.toString();
    assertThat(got).contains("Upload Model Response");
    uploadedModelId = got.split("Model:")[1].split("models/")[1].split("\n")[0];
  }
}
