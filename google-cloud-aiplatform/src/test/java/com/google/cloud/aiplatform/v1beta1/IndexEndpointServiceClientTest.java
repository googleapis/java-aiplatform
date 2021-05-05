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

import static com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceClient.ListIndexEndpointsPagedResponse;

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
public class IndexEndpointServiceClientTest {
  private static MockIndexEndpointService mockIndexEndpointService;
  private static MockServiceHelper mockServiceHelper;
  private IndexEndpointServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockIndexEndpointService = new MockIndexEndpointService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockIndexEndpointService));
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
    IndexEndpointServiceSettings settings =
        IndexEndpointServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = IndexEndpointServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createIndexEndpointTest() throws Exception {
    IndexEndpoint expectedResponse =
        IndexEndpoint.newBuilder()
            .setName(IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDeployedIndexes(new ArrayList<DeployedIndex>())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setNetwork("network1843485230")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createIndexEndpointTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockIndexEndpointService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    IndexEndpoint indexEndpoint = IndexEndpoint.newBuilder().build();

    IndexEndpoint actualResponse = client.createIndexEndpointAsync(parent, indexEndpoint).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateIndexEndpointRequest actualRequest = ((CreateIndexEndpointRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(indexEndpoint, actualRequest.getIndexEndpoint());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createIndexEndpointExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      IndexEndpoint indexEndpoint = IndexEndpoint.newBuilder().build();
      client.createIndexEndpointAsync(parent, indexEndpoint).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createIndexEndpointTest2() throws Exception {
    IndexEndpoint expectedResponse =
        IndexEndpoint.newBuilder()
            .setName(IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDeployedIndexes(new ArrayList<DeployedIndex>())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setNetwork("network1843485230")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createIndexEndpointTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockIndexEndpointService.addResponse(resultOperation);

    String parent = "parent-995424086";
    IndexEndpoint indexEndpoint = IndexEndpoint.newBuilder().build();

    IndexEndpoint actualResponse = client.createIndexEndpointAsync(parent, indexEndpoint).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateIndexEndpointRequest actualRequest = ((CreateIndexEndpointRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(indexEndpoint, actualRequest.getIndexEndpoint());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createIndexEndpointExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      String parent = "parent-995424086";
      IndexEndpoint indexEndpoint = IndexEndpoint.newBuilder().build();
      client.createIndexEndpointAsync(parent, indexEndpoint).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getIndexEndpointTest() throws Exception {
    IndexEndpoint expectedResponse =
        IndexEndpoint.newBuilder()
            .setName(IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDeployedIndexes(new ArrayList<DeployedIndex>())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setNetwork("network1843485230")
            .build();
    mockIndexEndpointService.addResponse(expectedResponse);

    IndexEndpointName name = IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]");

    IndexEndpoint actualResponse = client.getIndexEndpoint(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIndexEndpointRequest actualRequest = ((GetIndexEndpointRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIndexEndpointExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      IndexEndpointName name = IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]");
      client.getIndexEndpoint(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIndexEndpointTest2() throws Exception {
    IndexEndpoint expectedResponse =
        IndexEndpoint.newBuilder()
            .setName(IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDeployedIndexes(new ArrayList<DeployedIndex>())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setNetwork("network1843485230")
            .build();
    mockIndexEndpointService.addResponse(expectedResponse);

    String name = "name3373707";

    IndexEndpoint actualResponse = client.getIndexEndpoint(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIndexEndpointRequest actualRequest = ((GetIndexEndpointRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIndexEndpointExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      String name = "name3373707";
      client.getIndexEndpoint(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listIndexEndpointsTest() throws Exception {
    IndexEndpoint responsesElement = IndexEndpoint.newBuilder().build();
    ListIndexEndpointsResponse expectedResponse =
        ListIndexEndpointsResponse.newBuilder()
            .setNextPageToken("")
            .addAllIndexEndpoints(Arrays.asList(responsesElement))
            .build();
    mockIndexEndpointService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListIndexEndpointsPagedResponse pagedListResponse = client.listIndexEndpoints(parent);

    List<IndexEndpoint> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getIndexEndpointsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListIndexEndpointsRequest actualRequest = ((ListIndexEndpointsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listIndexEndpointsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listIndexEndpoints(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listIndexEndpointsTest2() throws Exception {
    IndexEndpoint responsesElement = IndexEndpoint.newBuilder().build();
    ListIndexEndpointsResponse expectedResponse =
        ListIndexEndpointsResponse.newBuilder()
            .setNextPageToken("")
            .addAllIndexEndpoints(Arrays.asList(responsesElement))
            .build();
    mockIndexEndpointService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListIndexEndpointsPagedResponse pagedListResponse = client.listIndexEndpoints(parent);

    List<IndexEndpoint> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getIndexEndpointsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListIndexEndpointsRequest actualRequest = ((ListIndexEndpointsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listIndexEndpointsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listIndexEndpoints(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateIndexEndpointTest() throws Exception {
    IndexEndpoint expectedResponse =
        IndexEndpoint.newBuilder()
            .setName(IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .addAllDeployedIndexes(new ArrayList<DeployedIndex>())
            .setEtag("etag3123477")
            .putAllLabels(new HashMap<String, String>())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setNetwork("network1843485230")
            .build();
    mockIndexEndpointService.addResponse(expectedResponse);

    IndexEndpoint indexEndpoint = IndexEndpoint.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    IndexEndpoint actualResponse = client.updateIndexEndpoint(indexEndpoint, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateIndexEndpointRequest actualRequest = ((UpdateIndexEndpointRequest) actualRequests.get(0));

    Assert.assertEquals(indexEndpoint, actualRequest.getIndexEndpoint());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateIndexEndpointExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      IndexEndpoint indexEndpoint = IndexEndpoint.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateIndexEndpoint(indexEndpoint, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteIndexEndpointTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteIndexEndpointTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockIndexEndpointService.addResponse(resultOperation);

    IndexEndpointName name = IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]");

    client.deleteIndexEndpointAsync(name).get();

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteIndexEndpointRequest actualRequest = ((DeleteIndexEndpointRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteIndexEndpointExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      IndexEndpointName name = IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]");
      client.deleteIndexEndpointAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteIndexEndpointTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteIndexEndpointTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockIndexEndpointService.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteIndexEndpointAsync(name).get();

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteIndexEndpointRequest actualRequest = ((DeleteIndexEndpointRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteIndexEndpointExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteIndexEndpointAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deployIndexTest() throws Exception {
    DeployIndexResponse expectedResponse =
        DeployIndexResponse.newBuilder()
            .setDeployedIndex(DeployedIndex.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deployIndexTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockIndexEndpointService.addResponse(resultOperation);

    IndexEndpointName indexEndpoint =
        IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]");
    DeployedIndex deployedIndex = DeployedIndex.newBuilder().build();

    DeployIndexResponse actualResponse =
        client.deployIndexAsync(indexEndpoint, deployedIndex).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeployIndexRequest actualRequest = ((DeployIndexRequest) actualRequests.get(0));

    Assert.assertEquals(indexEndpoint.toString(), actualRequest.getIndexEndpoint());
    Assert.assertEquals(deployedIndex, actualRequest.getDeployedIndex());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deployIndexExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      IndexEndpointName indexEndpoint =
          IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]");
      DeployedIndex deployedIndex = DeployedIndex.newBuilder().build();
      client.deployIndexAsync(indexEndpoint, deployedIndex).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deployIndexTest2() throws Exception {
    DeployIndexResponse expectedResponse =
        DeployIndexResponse.newBuilder()
            .setDeployedIndex(DeployedIndex.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deployIndexTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockIndexEndpointService.addResponse(resultOperation);

    String indexEndpoint = "indexEndpoint-1743275897";
    DeployedIndex deployedIndex = DeployedIndex.newBuilder().build();

    DeployIndexResponse actualResponse =
        client.deployIndexAsync(indexEndpoint, deployedIndex).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeployIndexRequest actualRequest = ((DeployIndexRequest) actualRequests.get(0));

    Assert.assertEquals(indexEndpoint, actualRequest.getIndexEndpoint());
    Assert.assertEquals(deployedIndex, actualRequest.getDeployedIndex());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deployIndexExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      String indexEndpoint = "indexEndpoint-1743275897";
      DeployedIndex deployedIndex = DeployedIndex.newBuilder().build();
      client.deployIndexAsync(indexEndpoint, deployedIndex).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void undeployIndexTest() throws Exception {
    UndeployIndexResponse expectedResponse = UndeployIndexResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("undeployIndexTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockIndexEndpointService.addResponse(resultOperation);

    IndexEndpointName indexEndpoint =
        IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]");
    String deployedIndexId = "deployedIndexId-1101212953";

    UndeployIndexResponse actualResponse =
        client.undeployIndexAsync(indexEndpoint, deployedIndexId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UndeployIndexRequest actualRequest = ((UndeployIndexRequest) actualRequests.get(0));

    Assert.assertEquals(indexEndpoint.toString(), actualRequest.getIndexEndpoint());
    Assert.assertEquals(deployedIndexId, actualRequest.getDeployedIndexId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void undeployIndexExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      IndexEndpointName indexEndpoint =
          IndexEndpointName.of("[PROJECT]", "[LOCATION]", "[INDEX_ENDPOINT]");
      String deployedIndexId = "deployedIndexId-1101212953";
      client.undeployIndexAsync(indexEndpoint, deployedIndexId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void undeployIndexTest2() throws Exception {
    UndeployIndexResponse expectedResponse = UndeployIndexResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("undeployIndexTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockIndexEndpointService.addResponse(resultOperation);

    String indexEndpoint = "indexEndpoint-1743275897";
    String deployedIndexId = "deployedIndexId-1101212953";

    UndeployIndexResponse actualResponse =
        client.undeployIndexAsync(indexEndpoint, deployedIndexId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIndexEndpointService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UndeployIndexRequest actualRequest = ((UndeployIndexRequest) actualRequests.get(0));

    Assert.assertEquals(indexEndpoint, actualRequest.getIndexEndpoint());
    Assert.assertEquals(deployedIndexId, actualRequest.getDeployedIndexId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void undeployIndexExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIndexEndpointService.addException(exception);

    try {
      String indexEndpoint = "indexEndpoint-1743275897";
      String deployedIndexId = "deployedIndexId-1101212953";
      client.undeployIndexAsync(indexEndpoint, deployedIndexId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
