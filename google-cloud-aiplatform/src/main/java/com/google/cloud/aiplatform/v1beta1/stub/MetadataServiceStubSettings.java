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

package com.google.cloud.aiplatform.v1beta1.stub;

import static com.google.cloud.aiplatform.v1beta1.MetadataServiceClient.ListArtifactsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.MetadataServiceClient.ListContextsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.MetadataServiceClient.ListExecutionsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.MetadataServiceClient.ListMetadataSchemasPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.MetadataServiceClient.ListMetadataStoresPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1beta1.AddContextArtifactsAndExecutionsRequest;
import com.google.cloud.aiplatform.v1beta1.AddContextArtifactsAndExecutionsResponse;
import com.google.cloud.aiplatform.v1beta1.AddContextChildrenRequest;
import com.google.cloud.aiplatform.v1beta1.AddContextChildrenResponse;
import com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest;
import com.google.cloud.aiplatform.v1beta1.AddExecutionEventsResponse;
import com.google.cloud.aiplatform.v1beta1.Artifact;
import com.google.cloud.aiplatform.v1beta1.Context;
import com.google.cloud.aiplatform.v1beta1.CreateArtifactRequest;
import com.google.cloud.aiplatform.v1beta1.CreateContextRequest;
import com.google.cloud.aiplatform.v1beta1.CreateExecutionRequest;
import com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest;
import com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteContextRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteMetadataStoreOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.DeleteMetadataStoreRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.Execution;
import com.google.cloud.aiplatform.v1beta1.GetArtifactRequest;
import com.google.cloud.aiplatform.v1beta1.GetContextRequest;
import com.google.cloud.aiplatform.v1beta1.GetExecutionRequest;
import com.google.cloud.aiplatform.v1beta1.GetMetadataSchemaRequest;
import com.google.cloud.aiplatform.v1beta1.GetMetadataStoreRequest;
import com.google.cloud.aiplatform.v1beta1.LineageSubgraph;
import com.google.cloud.aiplatform.v1beta1.ListArtifactsRequest;
import com.google.cloud.aiplatform.v1beta1.ListArtifactsResponse;
import com.google.cloud.aiplatform.v1beta1.ListContextsRequest;
import com.google.cloud.aiplatform.v1beta1.ListContextsResponse;
import com.google.cloud.aiplatform.v1beta1.ListExecutionsRequest;
import com.google.cloud.aiplatform.v1beta1.ListExecutionsResponse;
import com.google.cloud.aiplatform.v1beta1.ListMetadataSchemasRequest;
import com.google.cloud.aiplatform.v1beta1.ListMetadataSchemasResponse;
import com.google.cloud.aiplatform.v1beta1.ListMetadataStoresRequest;
import com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse;
import com.google.cloud.aiplatform.v1beta1.MetadataSchema;
import com.google.cloud.aiplatform.v1beta1.MetadataStore;
import com.google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest;
import com.google.cloud.aiplatform.v1beta1.QueryContextLineageSubgraphRequest;
import com.google.cloud.aiplatform.v1beta1.QueryExecutionInputsAndOutputsRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateArtifactRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateContextRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateExecutionRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link MetadataServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (aiplatform.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getMetadataStore to 30 seconds:
 *
 * <pre>{@code
 * MetadataServiceStubSettings.Builder metadataServiceSettingsBuilder =
 *     MetadataServiceStubSettings.newBuilder();
 * metadataServiceSettingsBuilder
 *     .getMetadataStoreSettings()
 *     .setRetrySettings(
 *         metadataServiceSettingsBuilder
 *             .getMetadataStoreSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * MetadataServiceStubSettings metadataServiceSettings = metadataServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class MetadataServiceStubSettings extends StubSettings<MetadataServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateMetadataStoreRequest, Operation>
      createMetadataStoreSettings;
  private final OperationCallSettings<
          CreateMetadataStoreRequest, MetadataStore, CreateMetadataStoreOperationMetadata>
      createMetadataStoreOperationSettings;
  private final UnaryCallSettings<GetMetadataStoreRequest, MetadataStore> getMetadataStoreSettings;
  private final PagedCallSettings<
          ListMetadataStoresRequest, ListMetadataStoresResponse, ListMetadataStoresPagedResponse>
      listMetadataStoresSettings;
  private final UnaryCallSettings<DeleteMetadataStoreRequest, Operation>
      deleteMetadataStoreSettings;
  private final OperationCallSettings<
          DeleteMetadataStoreRequest, Empty, DeleteMetadataStoreOperationMetadata>
      deleteMetadataStoreOperationSettings;
  private final UnaryCallSettings<CreateArtifactRequest, Artifact> createArtifactSettings;
  private final UnaryCallSettings<GetArtifactRequest, Artifact> getArtifactSettings;
  private final PagedCallSettings<
          ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
      listArtifactsSettings;
  private final UnaryCallSettings<UpdateArtifactRequest, Artifact> updateArtifactSettings;
  private final UnaryCallSettings<CreateContextRequest, Context> createContextSettings;
  private final UnaryCallSettings<GetContextRequest, Context> getContextSettings;
  private final PagedCallSettings<
          ListContextsRequest, ListContextsResponse, ListContextsPagedResponse>
      listContextsSettings;
  private final UnaryCallSettings<UpdateContextRequest, Context> updateContextSettings;
  private final UnaryCallSettings<DeleteContextRequest, Operation> deleteContextSettings;
  private final OperationCallSettings<DeleteContextRequest, Empty, DeleteOperationMetadata>
      deleteContextOperationSettings;
  private final UnaryCallSettings<
          AddContextArtifactsAndExecutionsRequest, AddContextArtifactsAndExecutionsResponse>
      addContextArtifactsAndExecutionsSettings;
  private final UnaryCallSettings<AddContextChildrenRequest, AddContextChildrenResponse>
      addContextChildrenSettings;
  private final UnaryCallSettings<QueryContextLineageSubgraphRequest, LineageSubgraph>
      queryContextLineageSubgraphSettings;
  private final UnaryCallSettings<CreateExecutionRequest, Execution> createExecutionSettings;
  private final UnaryCallSettings<GetExecutionRequest, Execution> getExecutionSettings;
  private final PagedCallSettings<
          ListExecutionsRequest, ListExecutionsResponse, ListExecutionsPagedResponse>
      listExecutionsSettings;
  private final UnaryCallSettings<UpdateExecutionRequest, Execution> updateExecutionSettings;
  private final UnaryCallSettings<AddExecutionEventsRequest, AddExecutionEventsResponse>
      addExecutionEventsSettings;
  private final UnaryCallSettings<QueryExecutionInputsAndOutputsRequest, LineageSubgraph>
      queryExecutionInputsAndOutputsSettings;
  private final UnaryCallSettings<CreateMetadataSchemaRequest, MetadataSchema>
      createMetadataSchemaSettings;
  private final UnaryCallSettings<GetMetadataSchemaRequest, MetadataSchema>
      getMetadataSchemaSettings;
  private final PagedCallSettings<
          ListMetadataSchemasRequest, ListMetadataSchemasResponse, ListMetadataSchemasPagedResponse>
      listMetadataSchemasSettings;
  private final UnaryCallSettings<QueryArtifactLineageSubgraphRequest, LineageSubgraph>
      queryArtifactLineageSubgraphSettings;

  private static final PagedListDescriptor<
          ListMetadataStoresRequest, ListMetadataStoresResponse, MetadataStore>
      LIST_METADATA_STORES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListMetadataStoresRequest, ListMetadataStoresResponse, MetadataStore>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListMetadataStoresRequest injectToken(
                ListMetadataStoresRequest payload, String token) {
              return ListMetadataStoresRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListMetadataStoresRequest injectPageSize(
                ListMetadataStoresRequest payload, int pageSize) {
              return ListMetadataStoresRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListMetadataStoresRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListMetadataStoresResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<MetadataStore> extractResources(ListMetadataStoresResponse payload) {
              return payload.getMetadataStoresList() == null
                  ? ImmutableList.<MetadataStore>of()
                  : payload.getMetadataStoresList();
            }
          };

  private static final PagedListDescriptor<ListArtifactsRequest, ListArtifactsResponse, Artifact>
      LIST_ARTIFACTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListArtifactsRequest, ListArtifactsResponse, Artifact>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListArtifactsRequest injectToken(ListArtifactsRequest payload, String token) {
              return ListArtifactsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListArtifactsRequest injectPageSize(ListArtifactsRequest payload, int pageSize) {
              return ListArtifactsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListArtifactsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListArtifactsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Artifact> extractResources(ListArtifactsResponse payload) {
              return payload.getArtifactsList() == null
                  ? ImmutableList.<Artifact>of()
                  : payload.getArtifactsList();
            }
          };

  private static final PagedListDescriptor<ListContextsRequest, ListContextsResponse, Context>
      LIST_CONTEXTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListContextsRequest, ListContextsResponse, Context>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListContextsRequest injectToken(ListContextsRequest payload, String token) {
              return ListContextsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListContextsRequest injectPageSize(ListContextsRequest payload, int pageSize) {
              return ListContextsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListContextsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListContextsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Context> extractResources(ListContextsResponse payload) {
              return payload.getContextsList() == null
                  ? ImmutableList.<Context>of()
                  : payload.getContextsList();
            }
          };

  private static final PagedListDescriptor<ListExecutionsRequest, ListExecutionsResponse, Execution>
      LIST_EXECUTIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListExecutionsRequest, ListExecutionsResponse, Execution>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListExecutionsRequest injectToken(ListExecutionsRequest payload, String token) {
              return ListExecutionsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListExecutionsRequest injectPageSize(
                ListExecutionsRequest payload, int pageSize) {
              return ListExecutionsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListExecutionsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListExecutionsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Execution> extractResources(ListExecutionsResponse payload) {
              return payload.getExecutionsList() == null
                  ? ImmutableList.<Execution>of()
                  : payload.getExecutionsList();
            }
          };

  private static final PagedListDescriptor<
          ListMetadataSchemasRequest, ListMetadataSchemasResponse, MetadataSchema>
      LIST_METADATA_SCHEMAS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListMetadataSchemasRequest, ListMetadataSchemasResponse, MetadataSchema>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListMetadataSchemasRequest injectToken(
                ListMetadataSchemasRequest payload, String token) {
              return ListMetadataSchemasRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListMetadataSchemasRequest injectPageSize(
                ListMetadataSchemasRequest payload, int pageSize) {
              return ListMetadataSchemasRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListMetadataSchemasRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListMetadataSchemasResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<MetadataSchema> extractResources(ListMetadataSchemasResponse payload) {
              return payload.getMetadataSchemasList() == null
                  ? ImmutableList.<MetadataSchema>of()
                  : payload.getMetadataSchemasList();
            }
          };

  private static final PagedListResponseFactory<
          ListMetadataStoresRequest, ListMetadataStoresResponse, ListMetadataStoresPagedResponse>
      LIST_METADATA_STORES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListMetadataStoresRequest,
              ListMetadataStoresResponse,
              ListMetadataStoresPagedResponse>() {
            @Override
            public ApiFuture<ListMetadataStoresPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListMetadataStoresRequest, ListMetadataStoresResponse> callable,
                ListMetadataStoresRequest request,
                ApiCallContext context,
                ApiFuture<ListMetadataStoresResponse> futureResponse) {
              PageContext<ListMetadataStoresRequest, ListMetadataStoresResponse, MetadataStore>
                  pageContext =
                      PageContext.create(
                          callable, LIST_METADATA_STORES_PAGE_STR_DESC, request, context);
              return ListMetadataStoresPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
      LIST_ARTIFACTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>() {
            @Override
            public ApiFuture<ListArtifactsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListArtifactsRequest, ListArtifactsResponse> callable,
                ListArtifactsRequest request,
                ApiCallContext context,
                ApiFuture<ListArtifactsResponse> futureResponse) {
              PageContext<ListArtifactsRequest, ListArtifactsResponse, Artifact> pageContext =
                  PageContext.create(callable, LIST_ARTIFACTS_PAGE_STR_DESC, request, context);
              return ListArtifactsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListContextsRequest, ListContextsResponse, ListContextsPagedResponse>
      LIST_CONTEXTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListContextsRequest, ListContextsResponse, ListContextsPagedResponse>() {
            @Override
            public ApiFuture<ListContextsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListContextsRequest, ListContextsResponse> callable,
                ListContextsRequest request,
                ApiCallContext context,
                ApiFuture<ListContextsResponse> futureResponse) {
              PageContext<ListContextsRequest, ListContextsResponse, Context> pageContext =
                  PageContext.create(callable, LIST_CONTEXTS_PAGE_STR_DESC, request, context);
              return ListContextsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListExecutionsRequest, ListExecutionsResponse, ListExecutionsPagedResponse>
      LIST_EXECUTIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListExecutionsRequest, ListExecutionsResponse, ListExecutionsPagedResponse>() {
            @Override
            public ApiFuture<ListExecutionsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListExecutionsRequest, ListExecutionsResponse> callable,
                ListExecutionsRequest request,
                ApiCallContext context,
                ApiFuture<ListExecutionsResponse> futureResponse) {
              PageContext<ListExecutionsRequest, ListExecutionsResponse, Execution> pageContext =
                  PageContext.create(callable, LIST_EXECUTIONS_PAGE_STR_DESC, request, context);
              return ListExecutionsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListMetadataSchemasRequest, ListMetadataSchemasResponse, ListMetadataSchemasPagedResponse>
      LIST_METADATA_SCHEMAS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListMetadataSchemasRequest,
              ListMetadataSchemasResponse,
              ListMetadataSchemasPagedResponse>() {
            @Override
            public ApiFuture<ListMetadataSchemasPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListMetadataSchemasRequest, ListMetadataSchemasResponse> callable,
                ListMetadataSchemasRequest request,
                ApiCallContext context,
                ApiFuture<ListMetadataSchemasResponse> futureResponse) {
              PageContext<ListMetadataSchemasRequest, ListMetadataSchemasResponse, MetadataSchema>
                  pageContext =
                      PageContext.create(
                          callable, LIST_METADATA_SCHEMAS_PAGE_STR_DESC, request, context);
              return ListMetadataSchemasPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createMetadataStore. */
  public UnaryCallSettings<CreateMetadataStoreRequest, Operation> createMetadataStoreSettings() {
    return createMetadataStoreSettings;
  }

  /** Returns the object with the settings used for calls to createMetadataStore. */
  public OperationCallSettings<
          CreateMetadataStoreRequest, MetadataStore, CreateMetadataStoreOperationMetadata>
      createMetadataStoreOperationSettings() {
    return createMetadataStoreOperationSettings;
  }

  /** Returns the object with the settings used for calls to getMetadataStore. */
  public UnaryCallSettings<GetMetadataStoreRequest, MetadataStore> getMetadataStoreSettings() {
    return getMetadataStoreSettings;
  }

  /** Returns the object with the settings used for calls to listMetadataStores. */
  public PagedCallSettings<
          ListMetadataStoresRequest, ListMetadataStoresResponse, ListMetadataStoresPagedResponse>
      listMetadataStoresSettings() {
    return listMetadataStoresSettings;
  }

  /** Returns the object with the settings used for calls to deleteMetadataStore. */
  public UnaryCallSettings<DeleteMetadataStoreRequest, Operation> deleteMetadataStoreSettings() {
    return deleteMetadataStoreSettings;
  }

  /** Returns the object with the settings used for calls to deleteMetadataStore. */
  public OperationCallSettings<
          DeleteMetadataStoreRequest, Empty, DeleteMetadataStoreOperationMetadata>
      deleteMetadataStoreOperationSettings() {
    return deleteMetadataStoreOperationSettings;
  }

  /** Returns the object with the settings used for calls to createArtifact. */
  public UnaryCallSettings<CreateArtifactRequest, Artifact> createArtifactSettings() {
    return createArtifactSettings;
  }

  /** Returns the object with the settings used for calls to getArtifact. */
  public UnaryCallSettings<GetArtifactRequest, Artifact> getArtifactSettings() {
    return getArtifactSettings;
  }

  /** Returns the object with the settings used for calls to listArtifacts. */
  public PagedCallSettings<ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
      listArtifactsSettings() {
    return listArtifactsSettings;
  }

  /** Returns the object with the settings used for calls to updateArtifact. */
  public UnaryCallSettings<UpdateArtifactRequest, Artifact> updateArtifactSettings() {
    return updateArtifactSettings;
  }

  /** Returns the object with the settings used for calls to createContext. */
  public UnaryCallSettings<CreateContextRequest, Context> createContextSettings() {
    return createContextSettings;
  }

  /** Returns the object with the settings used for calls to getContext. */
  public UnaryCallSettings<GetContextRequest, Context> getContextSettings() {
    return getContextSettings;
  }

  /** Returns the object with the settings used for calls to listContexts. */
  public PagedCallSettings<ListContextsRequest, ListContextsResponse, ListContextsPagedResponse>
      listContextsSettings() {
    return listContextsSettings;
  }

  /** Returns the object with the settings used for calls to updateContext. */
  public UnaryCallSettings<UpdateContextRequest, Context> updateContextSettings() {
    return updateContextSettings;
  }

  /** Returns the object with the settings used for calls to deleteContext. */
  public UnaryCallSettings<DeleteContextRequest, Operation> deleteContextSettings() {
    return deleteContextSettings;
  }

  /** Returns the object with the settings used for calls to deleteContext. */
  public OperationCallSettings<DeleteContextRequest, Empty, DeleteOperationMetadata>
      deleteContextOperationSettings() {
    return deleteContextOperationSettings;
  }

  /** Returns the object with the settings used for calls to addContextArtifactsAndExecutions. */
  public UnaryCallSettings<
          AddContextArtifactsAndExecutionsRequest, AddContextArtifactsAndExecutionsResponse>
      addContextArtifactsAndExecutionsSettings() {
    return addContextArtifactsAndExecutionsSettings;
  }

  /** Returns the object with the settings used for calls to addContextChildren. */
  public UnaryCallSettings<AddContextChildrenRequest, AddContextChildrenResponse>
      addContextChildrenSettings() {
    return addContextChildrenSettings;
  }

  /** Returns the object with the settings used for calls to queryContextLineageSubgraph. */
  public UnaryCallSettings<QueryContextLineageSubgraphRequest, LineageSubgraph>
      queryContextLineageSubgraphSettings() {
    return queryContextLineageSubgraphSettings;
  }

  /** Returns the object with the settings used for calls to createExecution. */
  public UnaryCallSettings<CreateExecutionRequest, Execution> createExecutionSettings() {
    return createExecutionSettings;
  }

  /** Returns the object with the settings used for calls to getExecution. */
  public UnaryCallSettings<GetExecutionRequest, Execution> getExecutionSettings() {
    return getExecutionSettings;
  }

  /** Returns the object with the settings used for calls to listExecutions. */
  public PagedCallSettings<
          ListExecutionsRequest, ListExecutionsResponse, ListExecutionsPagedResponse>
      listExecutionsSettings() {
    return listExecutionsSettings;
  }

  /** Returns the object with the settings used for calls to updateExecution. */
  public UnaryCallSettings<UpdateExecutionRequest, Execution> updateExecutionSettings() {
    return updateExecutionSettings;
  }

  /** Returns the object with the settings used for calls to addExecutionEvents. */
  public UnaryCallSettings<AddExecutionEventsRequest, AddExecutionEventsResponse>
      addExecutionEventsSettings() {
    return addExecutionEventsSettings;
  }

  /** Returns the object with the settings used for calls to queryExecutionInputsAndOutputs. */
  public UnaryCallSettings<QueryExecutionInputsAndOutputsRequest, LineageSubgraph>
      queryExecutionInputsAndOutputsSettings() {
    return queryExecutionInputsAndOutputsSettings;
  }

  /** Returns the object with the settings used for calls to createMetadataSchema. */
  public UnaryCallSettings<CreateMetadataSchemaRequest, MetadataSchema>
      createMetadataSchemaSettings() {
    return createMetadataSchemaSettings;
  }

  /** Returns the object with the settings used for calls to getMetadataSchema. */
  public UnaryCallSettings<GetMetadataSchemaRequest, MetadataSchema> getMetadataSchemaSettings() {
    return getMetadataSchemaSettings;
  }

  /** Returns the object with the settings used for calls to listMetadataSchemas. */
  public PagedCallSettings<
          ListMetadataSchemasRequest, ListMetadataSchemasResponse, ListMetadataSchemasPagedResponse>
      listMetadataSchemasSettings() {
    return listMetadataSchemasSettings;
  }

  /** Returns the object with the settings used for calls to queryArtifactLineageSubgraph. */
  public UnaryCallSettings<QueryArtifactLineageSubgraphRequest, LineageSubgraph>
      queryArtifactLineageSubgraphSettings() {
    return queryArtifactLineageSubgraphSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MetadataServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcMetadataServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "aiplatform.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(MetadataServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected MetadataServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createMetadataStoreSettings = settingsBuilder.createMetadataStoreSettings().build();
    createMetadataStoreOperationSettings =
        settingsBuilder.createMetadataStoreOperationSettings().build();
    getMetadataStoreSettings = settingsBuilder.getMetadataStoreSettings().build();
    listMetadataStoresSettings = settingsBuilder.listMetadataStoresSettings().build();
    deleteMetadataStoreSettings = settingsBuilder.deleteMetadataStoreSettings().build();
    deleteMetadataStoreOperationSettings =
        settingsBuilder.deleteMetadataStoreOperationSettings().build();
    createArtifactSettings = settingsBuilder.createArtifactSettings().build();
    getArtifactSettings = settingsBuilder.getArtifactSettings().build();
    listArtifactsSettings = settingsBuilder.listArtifactsSettings().build();
    updateArtifactSettings = settingsBuilder.updateArtifactSettings().build();
    createContextSettings = settingsBuilder.createContextSettings().build();
    getContextSettings = settingsBuilder.getContextSettings().build();
    listContextsSettings = settingsBuilder.listContextsSettings().build();
    updateContextSettings = settingsBuilder.updateContextSettings().build();
    deleteContextSettings = settingsBuilder.deleteContextSettings().build();
    deleteContextOperationSettings = settingsBuilder.deleteContextOperationSettings().build();
    addContextArtifactsAndExecutionsSettings =
        settingsBuilder.addContextArtifactsAndExecutionsSettings().build();
    addContextChildrenSettings = settingsBuilder.addContextChildrenSettings().build();
    queryContextLineageSubgraphSettings =
        settingsBuilder.queryContextLineageSubgraphSettings().build();
    createExecutionSettings = settingsBuilder.createExecutionSettings().build();
    getExecutionSettings = settingsBuilder.getExecutionSettings().build();
    listExecutionsSettings = settingsBuilder.listExecutionsSettings().build();
    updateExecutionSettings = settingsBuilder.updateExecutionSettings().build();
    addExecutionEventsSettings = settingsBuilder.addExecutionEventsSettings().build();
    queryExecutionInputsAndOutputsSettings =
        settingsBuilder.queryExecutionInputsAndOutputsSettings().build();
    createMetadataSchemaSettings = settingsBuilder.createMetadataSchemaSettings().build();
    getMetadataSchemaSettings = settingsBuilder.getMetadataSchemaSettings().build();
    listMetadataSchemasSettings = settingsBuilder.listMetadataSchemasSettings().build();
    queryArtifactLineageSubgraphSettings =
        settingsBuilder.queryArtifactLineageSubgraphSettings().build();
  }

  /** Builder for MetadataServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<MetadataServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateMetadataStoreRequest, Operation>
        createMetadataStoreSettings;
    private final OperationCallSettings.Builder<
            CreateMetadataStoreRequest, MetadataStore, CreateMetadataStoreOperationMetadata>
        createMetadataStoreOperationSettings;
    private final UnaryCallSettings.Builder<GetMetadataStoreRequest, MetadataStore>
        getMetadataStoreSettings;
    private final PagedCallSettings.Builder<
            ListMetadataStoresRequest, ListMetadataStoresResponse, ListMetadataStoresPagedResponse>
        listMetadataStoresSettings;
    private final UnaryCallSettings.Builder<DeleteMetadataStoreRequest, Operation>
        deleteMetadataStoreSettings;
    private final OperationCallSettings.Builder<
            DeleteMetadataStoreRequest, Empty, DeleteMetadataStoreOperationMetadata>
        deleteMetadataStoreOperationSettings;
    private final UnaryCallSettings.Builder<CreateArtifactRequest, Artifact> createArtifactSettings;
    private final UnaryCallSettings.Builder<GetArtifactRequest, Artifact> getArtifactSettings;
    private final PagedCallSettings.Builder<
            ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
        listArtifactsSettings;
    private final UnaryCallSettings.Builder<UpdateArtifactRequest, Artifact> updateArtifactSettings;
    private final UnaryCallSettings.Builder<CreateContextRequest, Context> createContextSettings;
    private final UnaryCallSettings.Builder<GetContextRequest, Context> getContextSettings;
    private final PagedCallSettings.Builder<
            ListContextsRequest, ListContextsResponse, ListContextsPagedResponse>
        listContextsSettings;
    private final UnaryCallSettings.Builder<UpdateContextRequest, Context> updateContextSettings;
    private final UnaryCallSettings.Builder<DeleteContextRequest, Operation> deleteContextSettings;
    private final OperationCallSettings.Builder<
            DeleteContextRequest, Empty, DeleteOperationMetadata>
        deleteContextOperationSettings;
    private final UnaryCallSettings.Builder<
            AddContextArtifactsAndExecutionsRequest, AddContextArtifactsAndExecutionsResponse>
        addContextArtifactsAndExecutionsSettings;
    private final UnaryCallSettings.Builder<AddContextChildrenRequest, AddContextChildrenResponse>
        addContextChildrenSettings;
    private final UnaryCallSettings.Builder<QueryContextLineageSubgraphRequest, LineageSubgraph>
        queryContextLineageSubgraphSettings;
    private final UnaryCallSettings.Builder<CreateExecutionRequest, Execution>
        createExecutionSettings;
    private final UnaryCallSettings.Builder<GetExecutionRequest, Execution> getExecutionSettings;
    private final PagedCallSettings.Builder<
            ListExecutionsRequest, ListExecutionsResponse, ListExecutionsPagedResponse>
        listExecutionsSettings;
    private final UnaryCallSettings.Builder<UpdateExecutionRequest, Execution>
        updateExecutionSettings;
    private final UnaryCallSettings.Builder<AddExecutionEventsRequest, AddExecutionEventsResponse>
        addExecutionEventsSettings;
    private final UnaryCallSettings.Builder<QueryExecutionInputsAndOutputsRequest, LineageSubgraph>
        queryExecutionInputsAndOutputsSettings;
    private final UnaryCallSettings.Builder<CreateMetadataSchemaRequest, MetadataSchema>
        createMetadataSchemaSettings;
    private final UnaryCallSettings.Builder<GetMetadataSchemaRequest, MetadataSchema>
        getMetadataSchemaSettings;
    private final PagedCallSettings.Builder<
            ListMetadataSchemasRequest,
            ListMetadataSchemasResponse,
            ListMetadataSchemasPagedResponse>
        listMetadataSchemasSettings;
    private final UnaryCallSettings.Builder<QueryArtifactLineageSubgraphRequest, LineageSubgraph>
        queryArtifactLineageSubgraphSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_6_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(5000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(5000L))
              .setTotalTimeout(Duration.ofMillis(5000L))
              .build();
      definitions.put("no_retry_6_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createMetadataStoreSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createMetadataStoreOperationSettings = OperationCallSettings.newBuilder();
      getMetadataStoreSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listMetadataStoresSettings = PagedCallSettings.newBuilder(LIST_METADATA_STORES_PAGE_STR_FACT);
      deleteMetadataStoreSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteMetadataStoreOperationSettings = OperationCallSettings.newBuilder();
      createArtifactSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getArtifactSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listArtifactsSettings = PagedCallSettings.newBuilder(LIST_ARTIFACTS_PAGE_STR_FACT);
      updateArtifactSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createContextSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getContextSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listContextsSettings = PagedCallSettings.newBuilder(LIST_CONTEXTS_PAGE_STR_FACT);
      updateContextSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteContextSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteContextOperationSettings = OperationCallSettings.newBuilder();
      addContextArtifactsAndExecutionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      addContextChildrenSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      queryContextLineageSubgraphSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createExecutionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getExecutionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listExecutionsSettings = PagedCallSettings.newBuilder(LIST_EXECUTIONS_PAGE_STR_FACT);
      updateExecutionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      addExecutionEventsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      queryExecutionInputsAndOutputsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createMetadataSchemaSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getMetadataSchemaSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listMetadataSchemasSettings =
          PagedCallSettings.newBuilder(LIST_METADATA_SCHEMAS_PAGE_STR_FACT);
      queryArtifactLineageSubgraphSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createMetadataStoreSettings,
              getMetadataStoreSettings,
              listMetadataStoresSettings,
              deleteMetadataStoreSettings,
              createArtifactSettings,
              getArtifactSettings,
              listArtifactsSettings,
              updateArtifactSettings,
              createContextSettings,
              getContextSettings,
              listContextsSettings,
              updateContextSettings,
              deleteContextSettings,
              addContextArtifactsAndExecutionsSettings,
              addContextChildrenSettings,
              queryContextLineageSubgraphSettings,
              createExecutionSettings,
              getExecutionSettings,
              listExecutionsSettings,
              updateExecutionSettings,
              addExecutionEventsSettings,
              queryExecutionInputsAndOutputsSettings,
              createMetadataSchemaSettings,
              getMetadataSchemaSettings,
              listMetadataSchemasSettings,
              queryArtifactLineageSubgraphSettings);
      initDefaults(this);
    }

    protected Builder(MetadataServiceStubSettings settings) {
      super(settings);

      createMetadataStoreSettings = settings.createMetadataStoreSettings.toBuilder();
      createMetadataStoreOperationSettings =
          settings.createMetadataStoreOperationSettings.toBuilder();
      getMetadataStoreSettings = settings.getMetadataStoreSettings.toBuilder();
      listMetadataStoresSettings = settings.listMetadataStoresSettings.toBuilder();
      deleteMetadataStoreSettings = settings.deleteMetadataStoreSettings.toBuilder();
      deleteMetadataStoreOperationSettings =
          settings.deleteMetadataStoreOperationSettings.toBuilder();
      createArtifactSettings = settings.createArtifactSettings.toBuilder();
      getArtifactSettings = settings.getArtifactSettings.toBuilder();
      listArtifactsSettings = settings.listArtifactsSettings.toBuilder();
      updateArtifactSettings = settings.updateArtifactSettings.toBuilder();
      createContextSettings = settings.createContextSettings.toBuilder();
      getContextSettings = settings.getContextSettings.toBuilder();
      listContextsSettings = settings.listContextsSettings.toBuilder();
      updateContextSettings = settings.updateContextSettings.toBuilder();
      deleteContextSettings = settings.deleteContextSettings.toBuilder();
      deleteContextOperationSettings = settings.deleteContextOperationSettings.toBuilder();
      addContextArtifactsAndExecutionsSettings =
          settings.addContextArtifactsAndExecutionsSettings.toBuilder();
      addContextChildrenSettings = settings.addContextChildrenSettings.toBuilder();
      queryContextLineageSubgraphSettings =
          settings.queryContextLineageSubgraphSettings.toBuilder();
      createExecutionSettings = settings.createExecutionSettings.toBuilder();
      getExecutionSettings = settings.getExecutionSettings.toBuilder();
      listExecutionsSettings = settings.listExecutionsSettings.toBuilder();
      updateExecutionSettings = settings.updateExecutionSettings.toBuilder();
      addExecutionEventsSettings = settings.addExecutionEventsSettings.toBuilder();
      queryExecutionInputsAndOutputsSettings =
          settings.queryExecutionInputsAndOutputsSettings.toBuilder();
      createMetadataSchemaSettings = settings.createMetadataSchemaSettings.toBuilder();
      getMetadataSchemaSettings = settings.getMetadataSchemaSettings.toBuilder();
      listMetadataSchemasSettings = settings.listMetadataSchemasSettings.toBuilder();
      queryArtifactLineageSubgraphSettings =
          settings.queryArtifactLineageSubgraphSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createMetadataStoreSettings,
              getMetadataStoreSettings,
              listMetadataStoresSettings,
              deleteMetadataStoreSettings,
              createArtifactSettings,
              getArtifactSettings,
              listArtifactsSettings,
              updateArtifactSettings,
              createContextSettings,
              getContextSettings,
              listContextsSettings,
              updateContextSettings,
              deleteContextSettings,
              addContextArtifactsAndExecutionsSettings,
              addContextChildrenSettings,
              queryContextLineageSubgraphSettings,
              createExecutionSettings,
              getExecutionSettings,
              listExecutionsSettings,
              updateExecutionSettings,
              addExecutionEventsSettings,
              queryExecutionInputsAndOutputsSettings,
              createMetadataSchemaSettings,
              getMetadataSchemaSettings,
              listMetadataSchemasSettings,
              queryArtifactLineageSubgraphSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createMetadataStoreSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .getMetadataStoreSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .listMetadataStoresSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .deleteMetadataStoreSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .createArtifactSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .getArtifactSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .listArtifactsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .updateArtifactSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .createContextSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .getContextSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .listContextsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .updateContextSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .deleteContextSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .addContextArtifactsAndExecutionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .addContextChildrenSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .queryContextLineageSubgraphSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .createExecutionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .getExecutionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .listExecutionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .updateExecutionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .addExecutionEventsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .queryExecutionInputsAndOutputsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .createMetadataSchemaSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .getMetadataSchemaSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .listMetadataSchemasSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .queryArtifactLineageSubgraphSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createMetadataStoreOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateMetadataStoreRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(MetadataStore.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  CreateMetadataStoreOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteMetadataStoreOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteMetadataStoreRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  DeleteMetadataStoreOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteContextOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteContextRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeleteOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createMetadataStore. */
    public UnaryCallSettings.Builder<CreateMetadataStoreRequest, Operation>
        createMetadataStoreSettings() {
      return createMetadataStoreSettings;
    }

    /** Returns the builder for the settings used for calls to createMetadataStore. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CreateMetadataStoreRequest, MetadataStore, CreateMetadataStoreOperationMetadata>
        createMetadataStoreOperationSettings() {
      return createMetadataStoreOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getMetadataStore. */
    public UnaryCallSettings.Builder<GetMetadataStoreRequest, MetadataStore>
        getMetadataStoreSettings() {
      return getMetadataStoreSettings;
    }

    /** Returns the builder for the settings used for calls to listMetadataStores. */
    public PagedCallSettings.Builder<
            ListMetadataStoresRequest, ListMetadataStoresResponse, ListMetadataStoresPagedResponse>
        listMetadataStoresSettings() {
      return listMetadataStoresSettings;
    }

    /** Returns the builder for the settings used for calls to deleteMetadataStore. */
    public UnaryCallSettings.Builder<DeleteMetadataStoreRequest, Operation>
        deleteMetadataStoreSettings() {
      return deleteMetadataStoreSettings;
    }

    /** Returns the builder for the settings used for calls to deleteMetadataStore. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteMetadataStoreRequest, Empty, DeleteMetadataStoreOperationMetadata>
        deleteMetadataStoreOperationSettings() {
      return deleteMetadataStoreOperationSettings;
    }

    /** Returns the builder for the settings used for calls to createArtifact. */
    public UnaryCallSettings.Builder<CreateArtifactRequest, Artifact> createArtifactSettings() {
      return createArtifactSettings;
    }

    /** Returns the builder for the settings used for calls to getArtifact. */
    public UnaryCallSettings.Builder<GetArtifactRequest, Artifact> getArtifactSettings() {
      return getArtifactSettings;
    }

    /** Returns the builder for the settings used for calls to listArtifacts. */
    public PagedCallSettings.Builder<
            ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
        listArtifactsSettings() {
      return listArtifactsSettings;
    }

    /** Returns the builder for the settings used for calls to updateArtifact. */
    public UnaryCallSettings.Builder<UpdateArtifactRequest, Artifact> updateArtifactSettings() {
      return updateArtifactSettings;
    }

    /** Returns the builder for the settings used for calls to createContext. */
    public UnaryCallSettings.Builder<CreateContextRequest, Context> createContextSettings() {
      return createContextSettings;
    }

    /** Returns the builder for the settings used for calls to getContext. */
    public UnaryCallSettings.Builder<GetContextRequest, Context> getContextSettings() {
      return getContextSettings;
    }

    /** Returns the builder for the settings used for calls to listContexts. */
    public PagedCallSettings.Builder<
            ListContextsRequest, ListContextsResponse, ListContextsPagedResponse>
        listContextsSettings() {
      return listContextsSettings;
    }

    /** Returns the builder for the settings used for calls to updateContext. */
    public UnaryCallSettings.Builder<UpdateContextRequest, Context> updateContextSettings() {
      return updateContextSettings;
    }

    /** Returns the builder for the settings used for calls to deleteContext. */
    public UnaryCallSettings.Builder<DeleteContextRequest, Operation> deleteContextSettings() {
      return deleteContextSettings;
    }

    /** Returns the builder for the settings used for calls to deleteContext. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteContextRequest, Empty, DeleteOperationMetadata>
        deleteContextOperationSettings() {
      return deleteContextOperationSettings;
    }

    /** Returns the builder for the settings used for calls to addContextArtifactsAndExecutions. */
    public UnaryCallSettings.Builder<
            AddContextArtifactsAndExecutionsRequest, AddContextArtifactsAndExecutionsResponse>
        addContextArtifactsAndExecutionsSettings() {
      return addContextArtifactsAndExecutionsSettings;
    }

    /** Returns the builder for the settings used for calls to addContextChildren. */
    public UnaryCallSettings.Builder<AddContextChildrenRequest, AddContextChildrenResponse>
        addContextChildrenSettings() {
      return addContextChildrenSettings;
    }

    /** Returns the builder for the settings used for calls to queryContextLineageSubgraph. */
    public UnaryCallSettings.Builder<QueryContextLineageSubgraphRequest, LineageSubgraph>
        queryContextLineageSubgraphSettings() {
      return queryContextLineageSubgraphSettings;
    }

    /** Returns the builder for the settings used for calls to createExecution. */
    public UnaryCallSettings.Builder<CreateExecutionRequest, Execution> createExecutionSettings() {
      return createExecutionSettings;
    }

    /** Returns the builder for the settings used for calls to getExecution. */
    public UnaryCallSettings.Builder<GetExecutionRequest, Execution> getExecutionSettings() {
      return getExecutionSettings;
    }

    /** Returns the builder for the settings used for calls to listExecutions. */
    public PagedCallSettings.Builder<
            ListExecutionsRequest, ListExecutionsResponse, ListExecutionsPagedResponse>
        listExecutionsSettings() {
      return listExecutionsSettings;
    }

    /** Returns the builder for the settings used for calls to updateExecution. */
    public UnaryCallSettings.Builder<UpdateExecutionRequest, Execution> updateExecutionSettings() {
      return updateExecutionSettings;
    }

    /** Returns the builder for the settings used for calls to addExecutionEvents. */
    public UnaryCallSettings.Builder<AddExecutionEventsRequest, AddExecutionEventsResponse>
        addExecutionEventsSettings() {
      return addExecutionEventsSettings;
    }

    /** Returns the builder for the settings used for calls to queryExecutionInputsAndOutputs. */
    public UnaryCallSettings.Builder<QueryExecutionInputsAndOutputsRequest, LineageSubgraph>
        queryExecutionInputsAndOutputsSettings() {
      return queryExecutionInputsAndOutputsSettings;
    }

    /** Returns the builder for the settings used for calls to createMetadataSchema. */
    public UnaryCallSettings.Builder<CreateMetadataSchemaRequest, MetadataSchema>
        createMetadataSchemaSettings() {
      return createMetadataSchemaSettings;
    }

    /** Returns the builder for the settings used for calls to getMetadataSchema. */
    public UnaryCallSettings.Builder<GetMetadataSchemaRequest, MetadataSchema>
        getMetadataSchemaSettings() {
      return getMetadataSchemaSettings;
    }

    /** Returns the builder for the settings used for calls to listMetadataSchemas. */
    public PagedCallSettings.Builder<
            ListMetadataSchemasRequest,
            ListMetadataSchemasResponse,
            ListMetadataSchemasPagedResponse>
        listMetadataSchemasSettings() {
      return listMetadataSchemasSettings;
    }

    /** Returns the builder for the settings used for calls to queryArtifactLineageSubgraph. */
    public UnaryCallSettings.Builder<QueryArtifactLineageSubgraphRequest, LineageSubgraph>
        queryArtifactLineageSubgraphSettings() {
      return queryArtifactLineageSubgraphSettings;
    }

    @Override
    public MetadataServiceStubSettings build() throws IOException {
      return new MetadataServiceStubSettings(this);
    }
  }
}
