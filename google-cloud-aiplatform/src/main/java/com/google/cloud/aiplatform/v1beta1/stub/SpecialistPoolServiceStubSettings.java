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

import static com.google.cloud.aiplatform.v1beta1.SpecialistPoolServiceClient.ListSpecialistPoolsPagedResponse;

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
import com.google.cloud.aiplatform.v1beta1.CreateSpecialistPoolOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateSpecialistPoolRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.DeleteSpecialistPoolRequest;
import com.google.cloud.aiplatform.v1beta1.GetSpecialistPoolRequest;
import com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsRequest;
import com.google.cloud.aiplatform.v1beta1.ListSpecialistPoolsResponse;
import com.google.cloud.aiplatform.v1beta1.SpecialistPool;
import com.google.cloud.aiplatform.v1beta1.UpdateSpecialistPoolOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UpdateSpecialistPoolRequest;
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
 * Settings class to configure an instance of {@link SpecialistPoolServiceStub}.
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
 * <p>For example, to set the total timeout of getSpecialistPool to 30 seconds:
 *
 * <pre>{@code
 * SpecialistPoolServiceStubSettings.Builder specialistPoolServiceSettingsBuilder =
 *     SpecialistPoolServiceStubSettings.newBuilder();
 * specialistPoolServiceSettingsBuilder
 *     .getSpecialistPoolSettings()
 *     .setRetrySettings(
 *         specialistPoolServiceSettingsBuilder
 *             .getSpecialistPoolSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * SpecialistPoolServiceStubSettings specialistPoolServiceSettings =
 *     specialistPoolServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class SpecialistPoolServiceStubSettings
    extends StubSettings<SpecialistPoolServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateSpecialistPoolRequest, Operation>
      createSpecialistPoolSettings;
  private final OperationCallSettings<
          CreateSpecialistPoolRequest, SpecialistPool, CreateSpecialistPoolOperationMetadata>
      createSpecialistPoolOperationSettings;
  private final UnaryCallSettings<GetSpecialistPoolRequest, SpecialistPool>
      getSpecialistPoolSettings;
  private final PagedCallSettings<
          ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, ListSpecialistPoolsPagedResponse>
      listSpecialistPoolsSettings;
  private final UnaryCallSettings<DeleteSpecialistPoolRequest, Operation>
      deleteSpecialistPoolSettings;
  private final OperationCallSettings<DeleteSpecialistPoolRequest, Empty, DeleteOperationMetadata>
      deleteSpecialistPoolOperationSettings;
  private final UnaryCallSettings<UpdateSpecialistPoolRequest, Operation>
      updateSpecialistPoolSettings;
  private final OperationCallSettings<
          UpdateSpecialistPoolRequest, SpecialistPool, UpdateSpecialistPoolOperationMetadata>
      updateSpecialistPoolOperationSettings;

  private static final PagedListDescriptor<
          ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, SpecialistPool>
      LIST_SPECIALIST_POOLS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, SpecialistPool>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSpecialistPoolsRequest injectToken(
                ListSpecialistPoolsRequest payload, String token) {
              return ListSpecialistPoolsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSpecialistPoolsRequest injectPageSize(
                ListSpecialistPoolsRequest payload, int pageSize) {
              return ListSpecialistPoolsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSpecialistPoolsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSpecialistPoolsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SpecialistPool> extractResources(ListSpecialistPoolsResponse payload) {
              return payload.getSpecialistPoolsList() == null
                  ? ImmutableList.<SpecialistPool>of()
                  : payload.getSpecialistPoolsList();
            }
          };

  private static final PagedListResponseFactory<
          ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, ListSpecialistPoolsPagedResponse>
      LIST_SPECIALIST_POOLS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSpecialistPoolsRequest,
              ListSpecialistPoolsResponse,
              ListSpecialistPoolsPagedResponse>() {
            @Override
            public ApiFuture<ListSpecialistPoolsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSpecialistPoolsRequest, ListSpecialistPoolsResponse> callable,
                ListSpecialistPoolsRequest request,
                ApiCallContext context,
                ApiFuture<ListSpecialistPoolsResponse> futureResponse) {
              PageContext<ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, SpecialistPool>
                  pageContext =
                      PageContext.create(
                          callable, LIST_SPECIALIST_POOLS_PAGE_STR_DESC, request, context);
              return ListSpecialistPoolsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createSpecialistPool. */
  public UnaryCallSettings<CreateSpecialistPoolRequest, Operation> createSpecialistPoolSettings() {
    return createSpecialistPoolSettings;
  }

  /** Returns the object with the settings used for calls to createSpecialistPool. */
  public OperationCallSettings<
          CreateSpecialistPoolRequest, SpecialistPool, CreateSpecialistPoolOperationMetadata>
      createSpecialistPoolOperationSettings() {
    return createSpecialistPoolOperationSettings;
  }

  /** Returns the object with the settings used for calls to getSpecialistPool. */
  public UnaryCallSettings<GetSpecialistPoolRequest, SpecialistPool> getSpecialistPoolSettings() {
    return getSpecialistPoolSettings;
  }

  /** Returns the object with the settings used for calls to listSpecialistPools. */
  public PagedCallSettings<
          ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, ListSpecialistPoolsPagedResponse>
      listSpecialistPoolsSettings() {
    return listSpecialistPoolsSettings;
  }

  /** Returns the object with the settings used for calls to deleteSpecialistPool. */
  public UnaryCallSettings<DeleteSpecialistPoolRequest, Operation> deleteSpecialistPoolSettings() {
    return deleteSpecialistPoolSettings;
  }

  /** Returns the object with the settings used for calls to deleteSpecialistPool. */
  public OperationCallSettings<DeleteSpecialistPoolRequest, Empty, DeleteOperationMetadata>
      deleteSpecialistPoolOperationSettings() {
    return deleteSpecialistPoolOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateSpecialistPool. */
  public UnaryCallSettings<UpdateSpecialistPoolRequest, Operation> updateSpecialistPoolSettings() {
    return updateSpecialistPoolSettings;
  }

  /** Returns the object with the settings used for calls to updateSpecialistPool. */
  public OperationCallSettings<
          UpdateSpecialistPoolRequest, SpecialistPool, UpdateSpecialistPoolOperationMetadata>
      updateSpecialistPoolOperationSettings() {
    return updateSpecialistPoolOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SpecialistPoolServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcSpecialistPoolServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(SpecialistPoolServiceStubSettings.class))
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

  protected SpecialistPoolServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createSpecialistPoolSettings = settingsBuilder.createSpecialistPoolSettings().build();
    createSpecialistPoolOperationSettings =
        settingsBuilder.createSpecialistPoolOperationSettings().build();
    getSpecialistPoolSettings = settingsBuilder.getSpecialistPoolSettings().build();
    listSpecialistPoolsSettings = settingsBuilder.listSpecialistPoolsSettings().build();
    deleteSpecialistPoolSettings = settingsBuilder.deleteSpecialistPoolSettings().build();
    deleteSpecialistPoolOperationSettings =
        settingsBuilder.deleteSpecialistPoolOperationSettings().build();
    updateSpecialistPoolSettings = settingsBuilder.updateSpecialistPoolSettings().build();
    updateSpecialistPoolOperationSettings =
        settingsBuilder.updateSpecialistPoolOperationSettings().build();
  }

  /** Builder for SpecialistPoolServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<SpecialistPoolServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateSpecialistPoolRequest, Operation>
        createSpecialistPoolSettings;
    private final OperationCallSettings.Builder<
            CreateSpecialistPoolRequest, SpecialistPool, CreateSpecialistPoolOperationMetadata>
        createSpecialistPoolOperationSettings;
    private final UnaryCallSettings.Builder<GetSpecialistPoolRequest, SpecialistPool>
        getSpecialistPoolSettings;
    private final PagedCallSettings.Builder<
            ListSpecialistPoolsRequest,
            ListSpecialistPoolsResponse,
            ListSpecialistPoolsPagedResponse>
        listSpecialistPoolsSettings;
    private final UnaryCallSettings.Builder<DeleteSpecialistPoolRequest, Operation>
        deleteSpecialistPoolSettings;
    private final OperationCallSettings.Builder<
            DeleteSpecialistPoolRequest, Empty, DeleteOperationMetadata>
        deleteSpecialistPoolOperationSettings;
    private final UnaryCallSettings.Builder<UpdateSpecialistPoolRequest, Operation>
        updateSpecialistPoolSettings;
    private final OperationCallSettings.Builder<
            UpdateSpecialistPoolRequest, SpecialistPool, UpdateSpecialistPoolOperationMetadata>
        updateSpecialistPoolOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_6_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
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
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createSpecialistPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createSpecialistPoolOperationSettings = OperationCallSettings.newBuilder();
      getSpecialistPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listSpecialistPoolsSettings =
          PagedCallSettings.newBuilder(LIST_SPECIALIST_POOLS_PAGE_STR_FACT);
      deleteSpecialistPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteSpecialistPoolOperationSettings = OperationCallSettings.newBuilder();
      updateSpecialistPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateSpecialistPoolOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createSpecialistPoolSettings,
              getSpecialistPoolSettings,
              listSpecialistPoolsSettings,
              deleteSpecialistPoolSettings,
              updateSpecialistPoolSettings);
      initDefaults(this);
    }

    protected Builder(SpecialistPoolServiceStubSettings settings) {
      super(settings);

      createSpecialistPoolSettings = settings.createSpecialistPoolSettings.toBuilder();
      createSpecialistPoolOperationSettings =
          settings.createSpecialistPoolOperationSettings.toBuilder();
      getSpecialistPoolSettings = settings.getSpecialistPoolSettings.toBuilder();
      listSpecialistPoolsSettings = settings.listSpecialistPoolsSettings.toBuilder();
      deleteSpecialistPoolSettings = settings.deleteSpecialistPoolSettings.toBuilder();
      deleteSpecialistPoolOperationSettings =
          settings.deleteSpecialistPoolOperationSettings.toBuilder();
      updateSpecialistPoolSettings = settings.updateSpecialistPoolSettings.toBuilder();
      updateSpecialistPoolOperationSettings =
          settings.updateSpecialistPoolOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createSpecialistPoolSettings,
              getSpecialistPoolSettings,
              listSpecialistPoolsSettings,
              deleteSpecialistPoolSettings,
              updateSpecialistPoolSettings);
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
          .createSpecialistPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .getSpecialistPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .listSpecialistPoolsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .deleteSpecialistPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .updateSpecialistPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .createSpecialistPoolOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateSpecialistPoolRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(SpecialistPool.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  CreateSpecialistPoolOperationMetadata.class))
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
          .deleteSpecialistPoolOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteSpecialistPoolRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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

      builder
          .updateSpecialistPoolOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateSpecialistPoolRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(SpecialistPool.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  UpdateSpecialistPoolOperationMetadata.class))
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

    /** Returns the builder for the settings used for calls to createSpecialistPool. */
    public UnaryCallSettings.Builder<CreateSpecialistPoolRequest, Operation>
        createSpecialistPoolSettings() {
      return createSpecialistPoolSettings;
    }

    /** Returns the builder for the settings used for calls to createSpecialistPool. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CreateSpecialistPoolRequest, SpecialistPool, CreateSpecialistPoolOperationMetadata>
        createSpecialistPoolOperationSettings() {
      return createSpecialistPoolOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getSpecialistPool. */
    public UnaryCallSettings.Builder<GetSpecialistPoolRequest, SpecialistPool>
        getSpecialistPoolSettings() {
      return getSpecialistPoolSettings;
    }

    /** Returns the builder for the settings used for calls to listSpecialistPools. */
    public PagedCallSettings.Builder<
            ListSpecialistPoolsRequest,
            ListSpecialistPoolsResponse,
            ListSpecialistPoolsPagedResponse>
        listSpecialistPoolsSettings() {
      return listSpecialistPoolsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteSpecialistPool. */
    public UnaryCallSettings.Builder<DeleteSpecialistPoolRequest, Operation>
        deleteSpecialistPoolSettings() {
      return deleteSpecialistPoolSettings;
    }

    /** Returns the builder for the settings used for calls to deleteSpecialistPool. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteSpecialistPoolRequest, Empty, DeleteOperationMetadata>
        deleteSpecialistPoolOperationSettings() {
      return deleteSpecialistPoolOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateSpecialistPool. */
    public UnaryCallSettings.Builder<UpdateSpecialistPoolRequest, Operation>
        updateSpecialistPoolSettings() {
      return updateSpecialistPoolSettings;
    }

    /** Returns the builder for the settings used for calls to updateSpecialistPool. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UpdateSpecialistPoolRequest, SpecialistPool, UpdateSpecialistPoolOperationMetadata>
        updateSpecialistPoolOperationSettings() {
      return updateSpecialistPoolOperationSettings;
    }

    @Override
    public SpecialistPoolServiceStubSettings build() throws IOException {
      return new SpecialistPoolServiceStubSettings(this);
    }
  }
}
