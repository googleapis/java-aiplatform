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
import org.junit.Ignore;
import org.junit.Test;

public class CancelDataLabelingJobSampleTest {

  private static final String PROJECT = System.getenv("UCAIP_PROJECT_ID");
  private static final String DATASET_ID = System.getenv("DATA_LABELING_DATASET_ID");
  private static final String INSTRUCTION_URI =
      "gs://ucaip-sample-resources/images/datalabeling_instructions.pdf";
  private static final String INPUT_SCHEMA_URI =
      "gs://google-cloud-aiplatform/schema/datalabelingjob/inputs/image_classification.yaml";
  private static final String ANNOTATION_SPEC = "daisy";
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private PrintStream originalPrintStream;
  private String dataLabelingJobId;

  private static void requireEnvVar(String varName) {
    String errorMessage =
        String.format("Environment variable '%s' is required to perform these tests.", varName);
    assertNotNull(errorMessage, System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("UCAIP_PROJECT_ID");
    requireEnvVar("DATA_LABELING_DATASET_ID");
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
    // Delete the created data labeling
    DeleteDataLabelingJobSample.deleteDataLabelingJob(PROJECT, dataLabelingJobId);

    // Assert
    String deleteResponse = bout.toString();
    assertThat(deleteResponse).contains("Delete Data Labeling Job Response: ");
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  @Ignore
  public void testCancelDataLabelingJob() throws IOException, InterruptedException {
    // Act
    String dataLabelingDisplayName =
        String.format(
            "temp_data_labeling_display_name_%s",
            UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 26));

    CreateDataLabelingJobSample.createDataLabelingJob(
        PROJECT,
        dataLabelingDisplayName,
        DATASET_ID,
        INSTRUCTION_URI,
        INPUT_SCHEMA_URI,
        ANNOTATION_SPEC);

    String got = bout.toString();
    dataLabelingJobId = got.split("Name: ")[1].split("dataLabelingJobs/")[1].split("\n")[0];

    CancelDataLabelingJobSample.cancelDataLabelingJob(PROJECT, dataLabelingJobId);

    // Assert
    String cancelResponse = bout.toString();
    assertThat(cancelResponse).contains("Cancelled Data labeling job");
    TimeUnit.MINUTES.sleep(1);
  }
}
