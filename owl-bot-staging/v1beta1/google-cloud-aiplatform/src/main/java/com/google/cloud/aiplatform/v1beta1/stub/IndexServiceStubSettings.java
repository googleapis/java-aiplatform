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

import static com.google.cloud.aiplatform.v1beta1.IndexServiceClient.ListIndexesPagedResponse;

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
import com.google.cloud.aiplatform.v1beta1.CreateIndexOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateIndexRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.GetIndexRequest;
import com.google.cloud.aiplatform.v1beta1.Index;
import com.google.cloud.aiplatform.v1beta1.ListIndexesRequest;
import com.google.cloud.aiplatform.v1beta1.ListIndexesResponse;
import com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest;
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
 * Settings class to configure an instance of {@link IndexServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (aiplatform.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getIndex to 30 seconds:
 *
 * <pre>{@code
 * IndexServiceStubSettings.Builder indexServiceSettingsBuilder =
 *     IndexServiceStubSettings.newBuilder();
 * indexServiceSettingsBuilder
 *     .getIndexSettings()
 *     .setRetrySettings(
 *         indexServiceSettingsBuilder
 *             .getIndexSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * IndexServiceStubSettings indexServiceSettings = indexServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class IndexServiceStubSettings extends StubSettings<IndexServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateIndexRequest, Operation> createIndexSettings;
  private final OperationCallSettings<CreateIndexRequest, Index, CreateIndexOperationMetadata>
      createIndexOperationSettings;
  private final UnaryCallSettings<GetIndexRequest, Index> getIndexSettings;
  private final PagedCallSettings<ListIndexesRequest, ListIndexesResponse, ListIndexesPagedResponse>
      listIndexesSettings;
  private final UnaryCallSettings<UpdateIndexRequest, Operation> updateIndexSettings;
  private final OperationCallSettings<UpdateIndexRequest, Index, UpdateIndexOperationMetadata>
      updateIndexOperationSettings;
  private final UnaryCallSettings<DeleteIndexRequest, Operation> deleteIndexSettings;
  private final OperationCallSettings<DeleteIndexRequest, Empty, DeleteOperationMetadata>
      deleteIndexOperationSettings;

  private static final PagedListDescriptor<ListIndexesRequest, ListIndexesResponse, Index>
      LIST_INDEXES_PAGE_STR_DESC =
          new PagedListDescriptor<ListIndexesRequest, ListIndexesResponse, Index>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListIndexesRequest injectToken(ListIndexesRequest payload, String token) {
              return ListIndexesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListIndexesRequest injectPageSize(ListIndexesRequest payload, int pageSize) {
              return ListIndexesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListIndexesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListIndexesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Index> extractResources(ListIndexesResponse payload) {
              return payload.getIndexesList() == null
                  ? ImmutableList.<Index>of()
                  : payload.getIndexesList();
            }
          };

  private static final PagedListResponseFactory<
          ListIndexesRequest, ListIndexesResponse, ListIndexesPagedResponse>
      LIST_INDEXES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListIndexesRequest, ListIndexesResponse, ListIndexesPagedResponse>() {
            @Override
            public ApiFuture<ListIndexesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListIndexesRequest, ListIndexesResponse> callable,
                ListIndexesRequest request,
                ApiCallContext context,
                ApiFuture<ListIndexesResponse> futureResponse) {
              PageContext<ListIndexesRequest, ListIndexesResponse, Index> pageContext =
                  PageContext.create(callable, LIST_INDEXES_PAGE_STR_DESC, request, context);
              return ListIndexesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createIndex. */
  public UnaryCallSettings<CreateIndexRequest, Operation> createIndexSettings() {
    return createIndexSettings;
  }

  /** Returns the object with the settings used for calls to createIndex. */
  public OperationCallSettings<CreateIndexRequest, Index, CreateIndexOperationMetadata>
      createIndexOperationSettings() {
    return createIndexOperationSettings;
  }

  /** Returns the object with the settings used for calls to getIndex. */
  public UnaryCallSettings<GetIndexRequest, Index> getIndexSettings() {
    return getIndexSettings;
  }

  /** Returns the object with the settings used for calls to listIndexes. */
  public PagedCallSettings<ListIndexesRequest, ListIndexesResponse, ListIndexesPagedResponse>
      listIndexesSettings() {
    return listIndexesSettings;
  }

  /** Returns the object with the settings used for calls to updateIndex. */
  public UnaryCallSettings<UpdateIndexRequest, Operation> updateIndexSettings() {
    return updateIndexSettings;
  }

  /** Returns the object with the settings used for calls to updateIndex. */
  public OperationCallSettings<UpdateIndexRequest, Index, UpdateIndexOperationMetadata>
      updateIndexOperationSettings() {
    return updateIndexOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteIndex. */
  public UnaryCallSettings<DeleteIndexRequest, Operation> deleteIndexSettings() {
    return deleteIndexSettings;
  }

  /** Returns the object with the settings used for calls to deleteIndex. */
  public OperationCallSettings<DeleteIndexRequest, Empty, DeleteOperationMetadata>
      deleteIndexOperationSettings() {
    return deleteIndexOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public IndexServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcIndexServiceStub.create(this);
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

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "aiplatform.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(IndexServiceStubSettings.class))
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

  protected IndexServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createIndexSettings = settingsBuilder.createIndexSettings().build();
    createIndexOperationSettings = settingsBuilder.createIndexOperationSettings().build();
    getIndexSettings = settingsBuilder.getIndexSettings().build();
    listIndexesSettings = settingsBuilder.listIndexesSettings().build();
    updateIndexSettings = settingsBuilder.updateIndexSettings().build();
    updateIndexOperationSettings = settingsBuilder.updateIndexOperationSettings().build();
    deleteIndexSettings = settingsBuilder.deleteIndexSettings().build();
    deleteIndexOperationSettings = settingsBuilder.deleteIndexOperationSettings().build();
  }

  /** Builder for IndexServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<IndexServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateIndexRequest, Operation> createIndexSettings;
    private final OperationCallSettings.Builder<
            CreateIndexRequest, Index, CreateIndexOperationMetadata>
        createIndexOperationSettings;
    private final UnaryCallSettings.Builder<GetIndexRequest, Index> getIndexSettings;
    private final PagedCallSettings.Builder<
            ListIndexesRequest, ListIndexesResponse, ListIndexesPagedResponse>
        listIndexesSettings;
    private final UnaryCallSettings.Builder<UpdateIndexRequest, Operation> updateIndexSettings;
    private final OperationCallSettings.Builder<
            UpdateIndexRequest, Index, UpdateIndexOperationMetadata>
        updateIndexOperationSettings;
    private final UnaryCallSettings.Builder<DeleteIndexRequest, Operation> deleteIndexSettings;
    private final OperationCallSettings.Builder<DeleteIndexRequest, Empty, DeleteOperationMetadata>
        deleteIndexOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_2_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
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
      definitions.put("no_retry_2_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createIndexSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createIndexOperationSettings = OperationCallSettings.newBuilder();
      getIndexSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listIndexesSettings = PagedCallSettings.newBuilder(LIST_INDEXES_PAGE_STR_FACT);
      updateIndexSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateIndexOperationSettings = OperationCallSettings.newBuilder();
      deleteIndexSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteIndexOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createIndexSettings,
              getIndexSettings,
              listIndexesSettings,
              updateIndexSettings,
              deleteIndexSettings);
      initDefaults(this);
    }

    protected Builder(IndexServiceStubSettings settings) {
      super(settings);

      createIndexSettings = settings.createIndexSettings.toBuilder();
      createIndexOperationSettings = settings.createIndexOperationSettings.toBuilder();
      getIndexSettings = settings.getIndexSettings.toBuilder();
      listIndexesSettings = settings.listIndexesSettings.toBuilder();
      updateIndexSettings = settings.updateIndexSettings.toBuilder();
      updateIndexOperationSettings = settings.updateIndexOperationSettings.toBuilder();
      deleteIndexSettings = settings.deleteIndexSettings.toBuilder();
      deleteIndexOperationSettings = settings.deleteIndexOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createIndexSettings,
              getIndexSettings,
              listIndexesSettings,
              updateIndexSettings,
              deleteIndexSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createIndexSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"));

      builder
          .getIndexSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"));

      builder
          .listIndexesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"));

      builder
          .updateIndexSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"));

      builder
          .deleteIndexSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"));

      builder
          .createIndexOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<CreateIndexRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Index.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  CreateIndexOperationMetadata.class))
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
          .updateIndexOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<UpdateIndexRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Index.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  UpdateIndexOperationMetadata.class))
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
          .deleteIndexOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<DeleteIndexRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"))
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

    /** Returns the builder for the settings used for calls to createIndex. */
    public UnaryCallSettings.Builder<CreateIndexRequest, Operation> createIndexSettings() {
      return createIndexSettings;
    }

    /** Returns the builder for the settings used for calls to createIndex. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<CreateIndexRequest, Index, CreateIndexOperationMetadata>
        createIndexOperationSettings() {
      return createIndexOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getIndex. */
    public UnaryCallSettings.Builder<GetIndexRequest, Index> getIndexSettings() {
      return getIndexSettings;
    }

    /** Returns the builder for the settings used for calls to listIndexes. */
    public PagedCallSettings.Builder<
            ListIndexesRequest, ListIndexesResponse, ListIndexesPagedResponse>
        listIndexesSettings() {
      return listIndexesSettings;
    }

    /** Returns the builder for the settings used for calls to updateIndex. */
    public UnaryCallSettings.Builder<UpdateIndexRequest, Operation> updateIndexSettings() {
      return updateIndexSettings;
    }

    /** Returns the builder for the settings used for calls to updateIndex. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<UpdateIndexRequest, Index, UpdateIndexOperationMetadata>
        updateIndexOperationSettings() {
      return updateIndexOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteIndex. */
    public UnaryCallSettings.Builder<DeleteIndexRequest, Operation> deleteIndexSettings() {
      return deleteIndexSettings;
    }

    /** Returns the builder for the settings used for calls to deleteIndex. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteIndexRequest, Empty, DeleteOperationMetadata>
        deleteIndexOperationSettings() {
      return deleteIndexOperationSettings;
    }

    @Override
    public IndexServiceStubSettings build() throws IOException {
      return new IndexServiceStubSettings(this);
    }
  }
}
