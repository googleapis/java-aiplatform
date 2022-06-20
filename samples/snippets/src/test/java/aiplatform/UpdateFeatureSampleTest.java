/*
 * Copyright 2022 Google LLC
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

import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.aiplatform.v1beta1.CreateEntityTypeOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest;
import com.google.cloud.aiplatform.v1beta1.CreateFeatureOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest;
import com.google.cloud.aiplatform.v1beta1.CreateFeaturestoreOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateFeaturestoreRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteFeaturestoreRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.EntityType;
import com.google.cloud.aiplatform.v1beta1.EntityTypeName;
import com.google.cloud.aiplatform.v1beta1.Feature;
import com.google.cloud.aiplatform.v1beta1.Feature.ValueType;
import com.google.cloud.aiplatform.v1beta1.Featurestore;
import com.google.cloud.aiplatform.v1beta1.Featurestore.OnlineServingConfig;
import com.google.cloud.aiplatform.v1beta1.Featurestore.OnlineServingConfig.Scaling;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreName;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceSettings;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.protobuf.Empty;
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
public class UpdateFeatureSampleTest {

  private static final String PROJECT_ID = System.getenv("UCAIP_PROJECT_ID");
  private static final String DESCRIPTION = "Test Description";
  private static final String VALUE_TYPE = "STRING";
  private static final int MIN_NODE_COUNT = 1;
  private static final int MAX_NODE_COUNT = 4;
  private static final boolean USE_FORCE = true;
  private static final String LOCATION = "us-central1";
  private static final String ENDPOINT = "us-central1-aiplatform.googleapis.com:443";
  private static final int TIMEOUT = 300;
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private PrintStream originalPrintStream;
  private String featurestoreId;

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

  static void createFeaturestoreSample(String project, String featurestoreId, int minNodeCount,
      int maxNodeCount, String location, String endpoint, int timeout)
      throws IOException, InterruptedException, ExecutionException, TimeoutException {

    FeaturestoreServiceSettings featurestoreServiceSettings =
        FeaturestoreServiceSettings.newBuilder().setEndpoint(endpoint).build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (FeaturestoreServiceClient featurestoreServiceClient =
        FeaturestoreServiceClient.create(featurestoreServiceSettings)) {

      OnlineServingConfig.Builder builderValue = OnlineServingConfig.newBuilder().setScaling(
          Scaling.newBuilder().setMinNodeCount(minNodeCount).setMaxNodeCount(maxNodeCount));
      Featurestore featurestore =
          Featurestore.newBuilder().setOnlineServingConfig(builderValue).build();
      String parent = LocationName.of(project, location).toString();

      CreateFeaturestoreRequest createFeaturestoreRequest =
          CreateFeaturestoreRequest.newBuilder().setParent(parent).setFeaturestore(featurestore)
              .setFeaturestoreId(featurestoreId).build();

      OperationFuture<Featurestore, CreateFeaturestoreOperationMetadata> featurestoreFuture =
          featurestoreServiceClient.createFeaturestoreAsync(createFeaturestoreRequest);
      System.out.format("Operation name: %s%n",
          featurestoreFuture.getInitialFuture().get().getName());
      System.out.println("Waiting for operation to finish...");
      Featurestore featurestoreResponse = featurestoreFuture.get(timeout, TimeUnit.SECONDS);
      System.out.println("Create Featurestore Response");
      System.out.format("Name: %s%n", featurestoreResponse.getName());
    }
  }

  static void createEntityTypeSample(String project, String featurestoreId, String entityTypeId,
      String description, String location, String endpoint, int timeout)
      throws IOException, InterruptedException, ExecutionException, TimeoutException {

    FeaturestoreServiceSettings featurestoreServiceSettings =
        FeaturestoreServiceSettings.newBuilder().setEndpoint(endpoint).build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (FeaturestoreServiceClient featurestoreServiceClient =
        FeaturestoreServiceClient.create(featurestoreServiceSettings)) {

      EntityType entityType = EntityType.newBuilder().setDescription(description).build();

      CreateEntityTypeRequest createEntityTypeRequest = CreateEntityTypeRequest.newBuilder()
          .setParent(FeaturestoreName.of(project, location, featurestoreId).toString())
          .setEntityType(entityType).setEntityTypeId(entityTypeId).build();

      OperationFuture<EntityType, CreateEntityTypeOperationMetadata> entityTypeFuture =
          featurestoreServiceClient.createEntityTypeAsync(createEntityTypeRequest);
      System.out.format("Operation name: %s%n",
          entityTypeFuture.getInitialFuture().get().getName());
      System.out.println("Waiting for operation to finish...");
      EntityType entityTypeResponse = entityTypeFuture.get(timeout, TimeUnit.SECONDS);
      System.out.println("Create Entity Type Response");
      System.out.format("Name: %s%n", entityTypeResponse.getName());
    }
  }

  static void createFeatureSample(String project, String featurestoreId, String entityTypeId,
      String featureId, String description, String valueType, String location, String endpoint,
      int timeout) throws IOException, InterruptedException, ExecutionException, TimeoutException {

    FeaturestoreServiceSettings featurestoreServiceSettings =
        FeaturestoreServiceSettings.newBuilder().setEndpoint(endpoint).build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (FeaturestoreServiceClient featurestoreServiceClient =
        FeaturestoreServiceClient.create(featurestoreServiceSettings)) {

      Feature feature = Feature.newBuilder().setDescription(description)
          .setValueType(ValueType.valueOf(valueType))
          // .setDisableMonitoring(disableMonitoring)
          .build();

      CreateFeatureRequest createFeatureRequest = CreateFeatureRequest.newBuilder()
          .setParent(EntityTypeName.of(project, location, featurestoreId, entityTypeId).toString())
          .setFeature(feature).setFeatureId(featureId).build();

      OperationFuture<Feature, CreateFeatureOperationMetadata> featureFuture =
          featurestoreServiceClient.createFeatureAsync(createFeatureRequest);
      System.out.format("Operation name: %s%n", featureFuture.getInitialFuture().get().getName());
      System.out.println("Waiting for operation to finish...");
      Feature featureResponse = featureFuture.get(timeout, TimeUnit.SECONDS);
      System.out.println("Create Feature Response");
      System.out.format("Name: %s%n", featureResponse.getName());
    }
  }

  static void deleteFeaturestoreSample(String project, String featurestoreId, boolean useForce,
      String location, String endpoint, int timeout)
      throws IOException, InterruptedException, ExecutionException, TimeoutException {

    FeaturestoreServiceSettings featurestoreServiceSettings =
        FeaturestoreServiceSettings.newBuilder().setEndpoint(endpoint).build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (FeaturestoreServiceClient featurestoreServiceClient =
        FeaturestoreServiceClient.create(featurestoreServiceSettings)) {

      DeleteFeaturestoreRequest deleteFeaturestoreRequest = DeleteFeaturestoreRequest.newBuilder()
          .setName(FeaturestoreName.of(project, location, featurestoreId).toString())
          .setForce(useForce).build();

      OperationFuture<Empty, DeleteOperationMetadata> operationFuture =
          featurestoreServiceClient.deleteFeaturestoreAsync(deleteFeaturestoreRequest);
      System.out.format("Operation name: %s%n", operationFuture.getInitialFuture().get().getName());
      System.out.println("Waiting for operation to finish...");
      operationFuture.get(timeout, TimeUnit.SECONDS);

      System.out.format("Deleted Featurestore.");
    }
  }

  @After
  public void tearDown()
      throws InterruptedException, ExecutionException, IOException, TimeoutException {

    // Delete the Featurestore
    deleteFeaturestoreSample(PROJECT_ID, featurestoreId, USE_FORCE, LOCATION, ENDPOINT, 60);

    // Assert
    String deleteResponse = bout.toString();
    assertThat(deleteResponse).contains("Deleted Featurestore");
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void testUpdateFeatureSample()
      throws IOException, InterruptedException, ExecutionException, TimeoutException {

    // Create the Featurestore
    String tempUuid = UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 26);
    String id = String.format("temp_create_featurestore_test_%s", tempUuid);
    createFeaturestoreSample(PROJECT_ID, id, MIN_NODE_COUNT, MAX_NODE_COUNT, LOCATION, ENDPOINT,
        900);

    // Assert
    String createFeaturestoreResponse = bout.toString();
    assertThat(createFeaturestoreResponse).contains("Create Featurestore Response");
    featurestoreId =
        createFeaturestoreResponse.split("Name: ")[1].split("featurestores/")[1].split("\n")[0]
            .trim();

    // Create the Entity Type
    String entityTypeTempUuid = UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 16);
    String entityTypeId = String.format("temp_create_entity_type_test_%s", entityTypeTempUuid);
    createEntityTypeSample(PROJECT_ID, featurestoreId, entityTypeId, DESCRIPTION, LOCATION,
        ENDPOINT, TIMEOUT);

    // Assert
    String createEntityTypeResponse = bout.toString();
    assertThat(createEntityTypeResponse).contains("Create Entity Type Response");


    // Create the feature value
    String featureTempUuid = UUID.randomUUID().toString().replaceAll("-", "_").substring(0, 26);
    String featureId = String.format("temp_create_feature_test_%s", featureTempUuid);
    createFeatureSample(PROJECT_ID, featurestoreId, entityTypeId, featureId, DESCRIPTION,
        VALUE_TYPE, LOCATION, ENDPOINT, TIMEOUT);

    // Assert
    String createFeatureResponse = bout.toString();
    assertThat(createFeatureResponse).contains("Create Feature Response");

    // Update the feature value
    UpdateFeatureSample.updateFeatureSample(PROJECT_ID, featurestoreId, entityTypeId, featureId,
        LOCATION, ENDPOINT);

    // Assert
    String updateFeatureResponse = bout.toString();
    assertThat(updateFeatureResponse).contains("Update Feature Response");

  }
}
