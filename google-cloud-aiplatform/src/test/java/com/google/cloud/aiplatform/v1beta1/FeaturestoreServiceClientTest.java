/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.aiplatform.v1beta1;

import static com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient.ListEntityTypesPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient.ListFeaturesPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient.ListFeaturestoresPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient.SearchFeaturesPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class FeaturestoreServiceClientTest {
  private static MockFeaturestoreService mockFeaturestoreService;
  private static MockServiceHelper mockServiceHelper;
  private FeaturestoreServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockFeaturestoreService = new MockFeaturestoreService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockFeaturestoreService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    FeaturestoreServiceSettings settings =
        FeaturestoreServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FeaturestoreServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createFeaturestoreTest() throws Exception {
    Featurestore expectedResponse =
        Featurestore.newBuilder()
            .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setOnlineServingConfig(Featurestore.OnlineServingConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createFeaturestoreTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Featurestore featurestore = Featurestore.newBuilder().build();

    Featurestore actualResponse = client.createFeaturestoreAsync(parent, featurestore).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateFeaturestoreRequest actualRequest = ((CreateFeaturestoreRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(featurestore, actualRequest.getFeaturestore());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createFeaturestoreExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Featurestore featurestore = Featurestore.newBuilder().build();
      client.createFeaturestoreAsync(parent, featurestore).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createFeaturestoreTest2() throws Exception {
    Featurestore expectedResponse =
        Featurestore.newBuilder()
            .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setOnlineServingConfig(Featurestore.OnlineServingConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createFeaturestoreTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String parent = "parent-995424086";
    Featurestore featurestore = Featurestore.newBuilder().build();

    Featurestore actualResponse = client.createFeaturestoreAsync(parent, featurestore).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateFeaturestoreRequest actualRequest = ((CreateFeaturestoreRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(featurestore, actualRequest.getFeaturestore());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createFeaturestoreExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String parent = "parent-995424086";
      Featurestore featurestore = Featurestore.newBuilder().build();
      client.createFeaturestoreAsync(parent, featurestore).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getFeaturestoreTest() throws Exception {
    Featurestore expectedResponse =
        Featurestore.newBuilder()
            .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setOnlineServingConfig(Featurestore.OnlineServingConfig.newBuilder().build())
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    FeaturestoreName name = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");

    Featurestore actualResponse = client.getFeaturestore(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeaturestoreRequest actualRequest = ((GetFeaturestoreRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeaturestoreExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      FeaturestoreName name = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
      client.getFeaturestore(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getFeaturestoreTest2() throws Exception {
    Featurestore expectedResponse =
        Featurestore.newBuilder()
            .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setOnlineServingConfig(Featurestore.OnlineServingConfig.newBuilder().build())
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    String name = "name3373707";

    Featurestore actualResponse = client.getFeaturestore(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeaturestoreRequest actualRequest = ((GetFeaturestoreRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeaturestoreExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String name = "name3373707";
      client.getFeaturestore(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listFeaturestoresTest() throws Exception {
    Featurestore responsesElement = Featurestore.newBuilder().build();
    ListFeaturestoresResponse expectedResponse =
        ListFeaturestoresResponse.newBuilder()
            .setNextPageToken("")
            .addAllFeaturestores(Arrays.asList(responsesElement))
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListFeaturestoresPagedResponse pagedListResponse = client.listFeaturestores(parent);

    List<Featurestore> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getFeaturestoresList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListFeaturestoresRequest actualRequest = ((ListFeaturestoresRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listFeaturestoresExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listFeaturestores(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listFeaturestoresTest2() throws Exception {
    Featurestore responsesElement = Featurestore.newBuilder().build();
    ListFeaturestoresResponse expectedResponse =
        ListFeaturestoresResponse.newBuilder()
            .setNextPageToken("")
            .addAllFeaturestores(Arrays.asList(responsesElement))
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListFeaturestoresPagedResponse pagedListResponse = client.listFeaturestores(parent);

    List<Featurestore> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getFeaturestoresList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListFeaturestoresRequest actualRequest = ((ListFeaturestoresRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listFeaturestoresExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listFeaturestores(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateFeaturestoreTest() throws Exception {
    Featurestore expectedResponse =
        Featurestore.newBuilder()
            .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setOnlineServingConfig(Featurestore.OnlineServingConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateFeaturestoreTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    Featurestore featurestore = Featurestore.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Featurestore actualResponse = client.updateFeaturestoreAsync(featurestore, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateFeaturestoreRequest actualRequest = ((UpdateFeaturestoreRequest) actualRequests.get(0));

    Assert.assertEquals(featurestore, actualRequest.getFeaturestore());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateFeaturestoreExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      Featurestore featurestore = Featurestore.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateFeaturestoreAsync(featurestore, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteFeaturestoreTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteFeaturestoreTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    FeaturestoreName name = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");

    client.deleteFeaturestoreAsync(name).get();

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteFeaturestoreRequest actualRequest = ((DeleteFeaturestoreRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteFeaturestoreExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      FeaturestoreName name = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
      client.deleteFeaturestoreAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteFeaturestoreTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteFeaturestoreTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteFeaturestoreAsync(name).get();

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteFeaturestoreRequest actualRequest = ((DeleteFeaturestoreRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteFeaturestoreExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteFeaturestoreAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createEntityTypeTest() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createEntityTypeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    FeaturestoreName parent = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
    EntityType entityType = EntityType.newBuilder().build();

    EntityType actualResponse = client.createEntityTypeAsync(parent, entityType).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateEntityTypeRequest actualRequest = ((CreateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createEntityTypeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      FeaturestoreName parent = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
      EntityType entityType = EntityType.newBuilder().build();
      client.createEntityTypeAsync(parent, entityType).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createEntityTypeTest2() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createEntityTypeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String parent = "parent-995424086";
    EntityType entityType = EntityType.newBuilder().build();

    EntityType actualResponse = client.createEntityTypeAsync(parent, entityType).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateEntityTypeRequest actualRequest = ((CreateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createEntityTypeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String parent = "parent-995424086";
      EntityType entityType = EntityType.newBuilder().build();
      client.createEntityTypeAsync(parent, entityType).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getEntityTypeTest() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    EntityTypeName name =
        EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");

    EntityType actualResponse = client.getEntityType(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEntityTypeRequest actualRequest = ((GetEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEntityTypeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      EntityTypeName name =
          EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
      client.getEntityType(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEntityTypeTest2() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    String name = "name3373707";

    EntityType actualResponse = client.getEntityType(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEntityTypeRequest actualRequest = ((GetEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEntityTypeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String name = "name3373707";
      client.getEntityType(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEntityTypesTest() throws Exception {
    EntityType responsesElement = EntityType.newBuilder().build();
    ListEntityTypesResponse expectedResponse =
        ListEntityTypesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEntityTypes(Arrays.asList(responsesElement))
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    FeaturestoreName parent = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");

    ListEntityTypesPagedResponse pagedListResponse = client.listEntityTypes(parent);

    List<EntityType> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEntityTypesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEntityTypesRequest actualRequest = ((ListEntityTypesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEntityTypesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      FeaturestoreName parent = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
      client.listEntityTypes(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEntityTypesTest2() throws Exception {
    EntityType responsesElement = EntityType.newBuilder().build();
    ListEntityTypesResponse expectedResponse =
        ListEntityTypesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEntityTypes(Arrays.asList(responsesElement))
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListEntityTypesPagedResponse pagedListResponse = client.listEntityTypes(parent);

    List<EntityType> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEntityTypesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEntityTypesRequest actualRequest = ((ListEntityTypesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEntityTypesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listEntityTypes(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateEntityTypeTest() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    EntityType entityType = EntityType.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    EntityType actualResponse = client.updateEntityType(entityType, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateEntityTypeRequest actualRequest = ((UpdateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateEntityTypeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      EntityType entityType = EntityType.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateEntityType(entityType, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteEntityTypeTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteEntityTypeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    EntityTypeName name =
        EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");

    client.deleteEntityTypeAsync(name).get();

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteEntityTypeRequest actualRequest = ((DeleteEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteEntityTypeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      EntityTypeName name =
          EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
      client.deleteEntityTypeAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteEntityTypeTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteEntityTypeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteEntityTypeAsync(name).get();

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteEntityTypeRequest actualRequest = ((DeleteEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteEntityTypeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteEntityTypeAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createFeatureTest() throws Exception {
    Feature expectedResponse =
        Feature.newBuilder()
            .setName(
                FeatureName.of(
                        "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .addAllMonitoringStats(new ArrayList<FeatureStatsAnomaly>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createFeatureTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    EntityTypeName parent =
        EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
    Feature feature = Feature.newBuilder().build();

    Feature actualResponse = client.createFeatureAsync(parent, feature).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateFeatureRequest actualRequest = ((CreateFeatureRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(feature, actualRequest.getFeature());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createFeatureExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      EntityTypeName parent =
          EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
      Feature feature = Feature.newBuilder().build();
      client.createFeatureAsync(parent, feature).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createFeatureTest2() throws Exception {
    Feature expectedResponse =
        Feature.newBuilder()
            .setName(
                FeatureName.of(
                        "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .addAllMonitoringStats(new ArrayList<FeatureStatsAnomaly>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createFeatureTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String parent = "parent-995424086";
    Feature feature = Feature.newBuilder().build();

    Feature actualResponse = client.createFeatureAsync(parent, feature).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateFeatureRequest actualRequest = ((CreateFeatureRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(feature, actualRequest.getFeature());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createFeatureExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String parent = "parent-995424086";
      Feature feature = Feature.newBuilder().build();
      client.createFeatureAsync(parent, feature).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchCreateFeaturesTest() throws Exception {
    BatchCreateFeaturesResponse expectedResponse =
        BatchCreateFeaturesResponse.newBuilder().addAllFeatures(new ArrayList<Feature>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchCreateFeaturesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    EntityTypeName parent =
        EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
    List<CreateFeatureRequest> requests = new ArrayList<>();

    BatchCreateFeaturesResponse actualResponse =
        client.batchCreateFeaturesAsync(parent, requests).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchCreateFeaturesRequest actualRequest = ((BatchCreateFeaturesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(requests, actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchCreateFeaturesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      EntityTypeName parent =
          EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
      List<CreateFeatureRequest> requests = new ArrayList<>();
      client.batchCreateFeaturesAsync(parent, requests).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchCreateFeaturesTest2() throws Exception {
    BatchCreateFeaturesResponse expectedResponse =
        BatchCreateFeaturesResponse.newBuilder().addAllFeatures(new ArrayList<Feature>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchCreateFeaturesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String parent = "parent-995424086";
    List<CreateFeatureRequest> requests = new ArrayList<>();

    BatchCreateFeaturesResponse actualResponse =
        client.batchCreateFeaturesAsync(parent, requests).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchCreateFeaturesRequest actualRequest = ((BatchCreateFeaturesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(requests, actualRequest.getRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchCreateFeaturesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String parent = "parent-995424086";
      List<CreateFeatureRequest> requests = new ArrayList<>();
      client.batchCreateFeaturesAsync(parent, requests).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getFeatureTest() throws Exception {
    Feature expectedResponse =
        Feature.newBuilder()
            .setName(
                FeatureName.of(
                        "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .addAllMonitoringStats(new ArrayList<FeatureStatsAnomaly>())
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    FeatureName name =
        FeatureName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]");

    Feature actualResponse = client.getFeature(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeatureRequest actualRequest = ((GetFeatureRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeatureExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      FeatureName name =
          FeatureName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]");
      client.getFeature(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getFeatureTest2() throws Exception {
    Feature expectedResponse =
        Feature.newBuilder()
            .setName(
                FeatureName.of(
                        "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .addAllMonitoringStats(new ArrayList<FeatureStatsAnomaly>())
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    String name = "name3373707";

    Feature actualResponse = client.getFeature(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeatureRequest actualRequest = ((GetFeatureRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeatureExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String name = "name3373707";
      client.getFeature(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listFeaturesTest() throws Exception {
    Feature responsesElement = Feature.newBuilder().build();
    ListFeaturesResponse expectedResponse =
        ListFeaturesResponse.newBuilder()
            .setNextPageToken("")
            .addAllFeatures(Arrays.asList(responsesElement))
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    EntityTypeName parent =
        EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");

    ListFeaturesPagedResponse pagedListResponse = client.listFeatures(parent);

    List<Feature> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getFeaturesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListFeaturesRequest actualRequest = ((ListFeaturesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listFeaturesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      EntityTypeName parent =
          EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
      client.listFeatures(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listFeaturesTest2() throws Exception {
    Feature responsesElement = Feature.newBuilder().build();
    ListFeaturesResponse expectedResponse =
        ListFeaturesResponse.newBuilder()
            .setNextPageToken("")
            .addAllFeatures(Arrays.asList(responsesElement))
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListFeaturesPagedResponse pagedListResponse = client.listFeatures(parent);

    List<Feature> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getFeaturesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListFeaturesRequest actualRequest = ((ListFeaturesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listFeaturesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listFeatures(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateFeatureTest() throws Exception {
    Feature expectedResponse =
        Feature.newBuilder()
            .setName(
                FeatureName.of(
                        "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
                    .toString())
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setEtag("etag3123477")
            .setMonitoringConfig(FeaturestoreMonitoringConfig.newBuilder().build())
            .addAllMonitoringStats(new ArrayList<FeatureStatsAnomaly>())
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    Feature feature = Feature.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Feature actualResponse = client.updateFeature(feature, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateFeatureRequest actualRequest = ((UpdateFeatureRequest) actualRequests.get(0));

    Assert.assertEquals(feature, actualRequest.getFeature());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateFeatureExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      Feature feature = Feature.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateFeature(feature, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteFeatureTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteFeatureTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    FeatureName name =
        FeatureName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]");

    client.deleteFeatureAsync(name).get();

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteFeatureRequest actualRequest = ((DeleteFeatureRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteFeatureExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      FeatureName name =
          FeatureName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]");
      client.deleteFeatureAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteFeatureTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteFeatureTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteFeatureAsync(name).get();

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteFeatureRequest actualRequest = ((DeleteFeatureRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteFeatureExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteFeatureAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void importFeatureValuesTest() throws Exception {
    ImportFeatureValuesResponse expectedResponse =
        ImportFeatureValuesResponse.newBuilder()
            .setImportedEntityCount(-1840044274)
            .setImportedFeatureValueCount(-1221471427)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("importFeatureValuesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    EntityTypeName entityType =
        EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");

    ImportFeatureValuesResponse actualResponse = client.importFeatureValuesAsync(entityType).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportFeatureValuesRequest actualRequest = ((ImportFeatureValuesRequest) actualRequests.get(0));

    Assert.assertEquals(entityType.toString(), actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void importFeatureValuesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      EntityTypeName entityType =
          EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
      client.importFeatureValuesAsync(entityType).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void importFeatureValuesTest2() throws Exception {
    ImportFeatureValuesResponse expectedResponse =
        ImportFeatureValuesResponse.newBuilder()
            .setImportedEntityCount(-1840044274)
            .setImportedFeatureValueCount(-1221471427)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("importFeatureValuesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String entityType = "entityType-1482998339";

    ImportFeatureValuesResponse actualResponse = client.importFeatureValuesAsync(entityType).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportFeatureValuesRequest actualRequest = ((ImportFeatureValuesRequest) actualRequests.get(0));

    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void importFeatureValuesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String entityType = "entityType-1482998339";
      client.importFeatureValuesAsync(entityType).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchReadFeatureValuesTest() throws Exception {
    BatchReadFeatureValuesResponse expectedResponse =
        BatchReadFeatureValuesResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchReadFeatureValuesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    FeaturestoreName featurestore =
        FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");

    BatchReadFeatureValuesResponse actualResponse =
        client.batchReadFeatureValuesAsync(featurestore).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchReadFeatureValuesRequest actualRequest =
        ((BatchReadFeatureValuesRequest) actualRequests.get(0));

    Assert.assertEquals(featurestore.toString(), actualRequest.getFeaturestore());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchReadFeatureValuesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      FeaturestoreName featurestore =
          FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
      client.batchReadFeatureValuesAsync(featurestore).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchReadFeatureValuesTest2() throws Exception {
    BatchReadFeatureValuesResponse expectedResponse =
        BatchReadFeatureValuesResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchReadFeatureValuesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String featurestore = "featurestore1227679659";

    BatchReadFeatureValuesResponse actualResponse =
        client.batchReadFeatureValuesAsync(featurestore).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchReadFeatureValuesRequest actualRequest =
        ((BatchReadFeatureValuesRequest) actualRequests.get(0));

    Assert.assertEquals(featurestore, actualRequest.getFeaturestore());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchReadFeatureValuesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String featurestore = "featurestore1227679659";
      client.batchReadFeatureValuesAsync(featurestore).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void exportFeatureValuesTest() throws Exception {
    ExportFeatureValuesResponse expectedResponse = ExportFeatureValuesResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportFeatureValuesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    EntityTypeName entityType =
        EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");

    ExportFeatureValuesResponse actualResponse = client.exportFeatureValuesAsync(entityType).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportFeatureValuesRequest actualRequest = ((ExportFeatureValuesRequest) actualRequests.get(0));

    Assert.assertEquals(entityType.toString(), actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportFeatureValuesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      EntityTypeName entityType =
          EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
      client.exportFeatureValuesAsync(entityType).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void exportFeatureValuesTest2() throws Exception {
    ExportFeatureValuesResponse expectedResponse = ExportFeatureValuesResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportFeatureValuesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockFeaturestoreService.addResponse(resultOperation);

    String entityType = "entityType-1482998339";

    ExportFeatureValuesResponse actualResponse = client.exportFeatureValuesAsync(entityType).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportFeatureValuesRequest actualRequest = ((ExportFeatureValuesRequest) actualRequests.get(0));

    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportFeatureValuesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String entityType = "entityType-1482998339";
      client.exportFeatureValuesAsync(entityType).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void searchFeaturesTest() throws Exception {
    Feature responsesElement = Feature.newBuilder().build();
    SearchFeaturesResponse expectedResponse =
        SearchFeaturesResponse.newBuilder()
            .setNextPageToken("")
            .addAllFeatures(Arrays.asList(responsesElement))
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    LocationName location = LocationName.of("[PROJECT]", "[LOCATION]");

    SearchFeaturesPagedResponse pagedListResponse = client.searchFeatures(location);

    List<Feature> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getFeaturesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchFeaturesRequest actualRequest = ((SearchFeaturesRequest) actualRequests.get(0));

    Assert.assertEquals(location.toString(), actualRequest.getLocation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void searchFeaturesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      LocationName location = LocationName.of("[PROJECT]", "[LOCATION]");
      client.searchFeatures(location);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void searchFeaturesTest2() throws Exception {
    Feature responsesElement = Feature.newBuilder().build();
    SearchFeaturesResponse expectedResponse =
        SearchFeaturesResponse.newBuilder()
            .setNextPageToken("")
            .addAllFeatures(Arrays.asList(responsesElement))
            .build();
    mockFeaturestoreService.addResponse(expectedResponse);

    String location = "location1901043637";

    SearchFeaturesPagedResponse pagedListResponse = client.searchFeatures(location);

    List<Feature> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getFeaturesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockFeaturestoreService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchFeaturesRequest actualRequest = ((SearchFeaturesRequest) actualRequests.get(0));

    Assert.assertEquals(location, actualRequest.getLocation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void searchFeaturesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreService.addException(exception);

    try {
      String location = "location1901043637";
      client.searchFeatures(location);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
