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

public class DeployModelSampleTest {

  private static final String PROJECT = System.getenv("CAIP_PROJECT_ID");
  private static final String MODEL_ID = System.getenv("DEPLOY_MODEL_ID");
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private PrintStream originalPrintStream;
  private String deployedModelId;
  private String endpointId;

  private static void requireEnvVar(String varName) {
    String errorMessage =
        String.format("Environment variable '%s' is required to perform these tests.", varName);
    assertNotNull(errorMessage, System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("CAIP_PROJECT_ID");
    requireEnvVar("DEPLOY_MODEL_ID");
  }

  @Before
  public void setUp()
      throws InterruptedException, ExecutionException, TimeoutException, IOException {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    originalPrintStream = System.out;
    System.setOut(out);
    String endpointDisplayName =
        String.format(
            "temp_create_endpoint_test_%s",
            UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 26));

    CreateEndpointSample.createEndpointSample(PROJECT, endpointDisplayName);
    String endpointOutput = bout.toString();
    endpointId = endpointOutput.split("Name: ")[1].split("endpoints/")[1].split("\n")[0];
  }

  @After
  public void tearDown()
      throws InterruptedException, ExecutionException, IOException, TimeoutException {
    // Undeploy the deployed Model
    UndeployModelSample.undeployModelSample(PROJECT, endpointId, deployedModelId);

    // Assert
    String undeployResponse = bout.toString();
    assertThat(undeployResponse).contains("Undeploy Model Response: ");
    TimeUnit.MINUTES.sleep(2);

    // Delete the endpoint
    DeleteEndpointSample.deleteEndpointSample(PROJECT, endpointId);

    // Assert
    String deleteResponse = bout.toString();
    assertThat(deleteResponse).contains("Delete Endpoint Response: ");
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void testDeployModelSample()
      throws IOException, InterruptedException, ExecutionException, TimeoutException {
    // Act
    String deployedModelDisplayName =
        String.format(
            "temp_deploy_model_test_%s",
            UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 26));
    DeployModelSample.deployModelSample(PROJECT, deployedModelDisplayName, endpointId, MODEL_ID);

    // Assert
    String got = bout.toString();
    assertThat(got).contains(deployedModelDisplayName);
    assertThat(got).contains("Deploy Model Response");
    deployedModelId = got.split("Name: ")[1].split("id: ")[1].split("\n")[0];
  }
}
