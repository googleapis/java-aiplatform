/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
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
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GetBatchPredictionJobSampleTest {

  private static final String PROJECT = System.getenv("CAIP_PROJECT_ID");
  private static final String MODEL_ID = System.getenv("BATCH_PREDICTION_VIDEO_CLASS_MODEL_ID");
  private static final String GCS_SOURCE_URI =
      "gs://prj-ucaip-tutorials-vcm/dataset/automl-video-demo-data/traffic_predict.jsonl";
  private static final String GCS_DESTINATION_OUTPUT_URI_PREFIX =
      "gs://prj-ucaip-tutorials-vcm/batchprediction/Video/";
  private static String BATCH_PREDICTION_JOB_ID = null;
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private PrintStream originalPrintStream;

  private static void requireEnvVar(String varName) {
    String errorMessage =
        String.format("Environment variable '%s' is required to perform these tests.", varName);
    assertNotNull(errorMessage, System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("CAIP_PROJECT_ID");
    requireEnvVar("BATCH_PREDICTION_VIDEO_CLASS_MODEL_ID");
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
    // Cancel the batch prediction job
    CancelBatchPredictionJobSample.cancelBatchPredictionJobSample(PROJECT, BATCH_PREDICTION_JOB_ID);

    // Assert
    String cancelResponse = bout.toString();
    assertThat(cancelResponse).contains("Cancelled the Batch Prediction Job");
    TimeUnit.MINUTES.sleep(2);

    // Delete the batch prediction job
    DeleteBatchPredictionJobSample.deleteBatchPredictionJobSample(PROJECT, BATCH_PREDICTION_JOB_ID);

    // Assert
    String deleteResponse = bout.toString();
    assertThat(deleteResponse).contains("Delete Batch Prediction Job Response: ");
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void testGetBatchPredictionJobSample() throws IOException {
    // Act
    String batchPredictionDisplayName =
        String.format(
            "batch_prediction_video_classification_display_name_%s",
            UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 26));

    CreateBatchPredictionJobVideoClassificationSample.createBatchPredictionJobVideoClassification(
        batchPredictionDisplayName,
        MODEL_ID,
        GCS_SOURCE_URI,
        GCS_DESTINATION_OUTPUT_URI_PREFIX,
        PROJECT);

    String getBatchPredictResponse = bout.toString();
    assertThat(getBatchPredictResponse).contains(batchPredictionDisplayName);
    assertThat(getBatchPredictResponse)
        .contains("Create Batch Prediction Job Video Classification Response");
    BATCH_PREDICTION_JOB_ID =
        getBatchPredictResponse.split("Name: ")[1].split("batchPredictionJobs/")[1].split("\n")[0];

    // Get Batch Prediction Job
    GetBatchPredictionJobSample.getBatchPredictionJobSample(PROJECT, BATCH_PREDICTION_JOB_ID);

    // Assert
    String got = bout.toString();
    assertThat(got).contains(BATCH_PREDICTION_JOB_ID);
    assertThat(got).contains("Get Batch Prediction Job Response");
  }
}
