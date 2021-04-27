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

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import io.grpc.StatusRuntimeException;
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

public class CreateTrainingPipelineCustomJobSampleTest {

  private static final String PROJECT = System.getenv("UCAIP_PROJECT_ID");
  private static final String CONTAINER_IMAGE_URI =
      "gcr.io/ucaip-sample-tests/mnist-custom-job:latest";
  private static final String GCS_OUTPUT_DIRECTORY =
      "gs://ucaip-samples-us-central1/training_pipeline_output";
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private PrintStream originalPrintStream;
  private String trainingPipelineId;

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
      throws InterruptedException, ExecutionException, IOException, TimeoutException {
    // Cancel the Training Pipeline
    CancelTrainingPipelineSample.cancelTrainingPipelineSample(PROJECT, trainingPipelineId);

    // Assert
    String cancelResponse = bout.toString();
    assertThat(cancelResponse).contains("Cancelled the Training Pipeline");
    TimeUnit.MINUTES.sleep(2);

    // Delete the Training Pipeline
    int retryCount = 3;
    while (retryCount > 0) {
      retryCount--;
      try {
        DeleteTrainingPipelineSample.deleteTrainingPipelineSample(PROJECT, trainingPipelineId);
        // if delete operation is successful, break out of the loop and continue
        break;
      } catch (StatusRuntimeException | ExecutionException ex) {
        // wait for another 1 minute, then retry
        System.out.println("Retrying (due to unfinished cancellation operation)...");
        TimeUnit.MINUTES.sleep(1);
      } catch (Exception otherExceptions) {
        // other exception, let them throw
        throw otherExceptions;
      }
    }

    // Assert
    String deleteResponse = bout.toString();
    assertThat(deleteResponse).contains("Deleted Training Pipeline.");
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void testCreateTrainingPipelineCustomJobSample() throws IOException {
    // Act
    String trainingPipelineDisplayName =
        String.format(
            "temp_create_training_pipeline_test_%s",
            UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 26));

    String modelDisplayName =
        String.format(
            "temp_create_training_pipeline_model_test_%s",
            UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 26));

    CreateTrainingPipelineCustomJobSample.createTrainingPipelineCustomJobSample(
        PROJECT,
        trainingPipelineDisplayName,
        modelDisplayName,
        CONTAINER_IMAGE_URI,
        GCS_OUTPUT_DIRECTORY);

    // Assert
    String got = bout.toString();
    assertThat(got).contains(trainingPipelineDisplayName);
    trainingPipelineId = got.split("Name: ")[1].split("trainingPipelines/")[1].split("\n")[0];
  }
}
