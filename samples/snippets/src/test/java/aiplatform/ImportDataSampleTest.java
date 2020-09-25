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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ImportDataSampleTest {

  private static final String PROJECT = System.getenv("CAIP_PROJECT_ID");
  private static final String DATASET_ID = System.getenv("IMPORT_DATA_SAMPLE_DATASET_ID");
  private static final String GCS_SOURCE_URI =
      "gs://prj-ucaip-tutorials-vcm/dataset/csv/all_data_sample.csv";
  private static final String IMPORT_SCHEMA_URI =
      "gs://google-cloud-aiplatform/schema/dataset/ioformat/"
          + "image_classification_single_label_io_format_1.0.0.yaml";
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
    requireEnvVar("IMPORT_DATA_SAMPLE_DATASET_ID");
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
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void testImportDataSample()
      throws IOException, InterruptedException, ExecutionException, TimeoutException {
    // Act
    ImportDataSample.importDataSample(PROJECT, DATASET_ID, GCS_SOURCE_URI, IMPORT_SCHEMA_URI);

    // Assert
    String got = bout.toString();
    assertThat(got).contains("Import Data Response: ");
  }
}
