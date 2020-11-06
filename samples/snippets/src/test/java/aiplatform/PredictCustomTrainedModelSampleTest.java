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

import com.google.protobuf.ByteString;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PredictCustomTrainedModelSampleTest {

  private static final String PROJECT = System.getenv("UCAIP_PROJECT_ID");
  private static final String ENDPOINT_ID =
      System.getenv("PREDICT_CUSTOM_TRAINED_MODEL_ENDPOINT_ID");
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
    requireEnvVar("UCAIP_PROJECT_ID");
    requireEnvVar("PREDICT_CUSTOM_TRAINED_MODEL_ENDPOINT_ID");
  }

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    originalPrintStream = System.out;
    System.setOut(out);
  }

  @After
  public void tearDown() {
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void testPredictCustomTrainedModelSample() throws IOException {
    // Act
    ByteString content = ByteString.copyFrom(Files.readAllBytes(Paths.get("resources/daisy.jpg")));
    String encoded = Base64.getEncoder().encodeToString(content.toByteArray());
    String instance = "[{'image_bytes': {'b64': '" + encoded + "'}, 'key':'0'}]";
    PredictCustomTrainedModelSample.predictCustomTrainedModel(PROJECT, ENDPOINT_ID, instance);

    // Assert
    String got = bout.toString();
    assertThat(got).contains("Predict Custom Trained model Response");
  }
}
