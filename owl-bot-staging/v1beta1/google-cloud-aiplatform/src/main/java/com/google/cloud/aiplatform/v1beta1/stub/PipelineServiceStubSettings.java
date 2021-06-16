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

import static com.google.cloud.aiplatform.v1beta1.PipelineServiceClient.ListPipelineJobsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.PipelineServiceClient.ListTrainingPipelinesPagedResponse;

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
import com.google.cloud.aiplatform.v1beta1.CancelPipelineJobRequest;
import com.google.cloud.aiplatform.v1beta1.CancelTrainingPipelineRequest;
import com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest;
import com.google.cloud.aiplatform.v1beta1.CreateTrainingPipelineRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.DeletePipelineJobRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteTrainingPipelineRequest;
import com.google.cloud.aiplatform.v1beta1.GetPipelineJobRequest;
import com.google.cloud.aiplatform.v1beta1.GetTrainingPipelineRequest;
import com.google.cloud.aiplatform.v1beta1.ListPipelineJobsRequest;
import com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse;
import com.google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest;
import com.google.cloud.aiplatform.v1beta1.ListTrainingPipelinesResponse;
import com.google.cloud.aiplatform.v1beta1.PipelineJob;
import com.google.cloud.aiplatform.v1beta1.TrainingPipeline;
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
 * Settings class to configure an instance of {@link PipelineServiceStub}.
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
 * <p>For example, to set the total timeout of createTrainingPipeline to 30 seconds:
 *
 * <pre>{@code
 * PipelineServiceStubSettings.Builder pipelineServiceSettingsBuilder =
 *     PipelineServiceStubSettings.newBuilder();
 * pipelineServiceSettingsBuilder
 *     .createTrainingPipelineSettings()
 *     .setRetrySettings(
 *         pipelineServiceSettingsBuilder
 *             .createTrainingPipelineSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * PipelineServiceStubSettings pipelineServiceSettings = pipelineServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class PipelineServiceStubSettings extends StubSettings<PipelineServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateTrainingPipelineRequest, TrainingPipeline>
      createTrainingPipelineSettings;
  private final UnaryCallSettings<GetTrainingPipelineRequest, TrainingPipeline>
      getTrainingPipelineSettings;
  private final PagedCallSettings<
          ListTrainingPipelinesRequest, ListTrainingPipelinesResponse,
          ListTrainingPipelinesPagedResponse>
      listTrainingPipelinesSettings;
  private final UnaryCallSettings<DeleteTrainingPipelineRequest, Operation>
      deleteTrainingPipelineSettings;
  private final OperationCallSettings<DeleteTrainingPipelineRequest, Empty, DeleteOperationMetadata>
      deleteTrainingPipelineOperationSettings;
  private final UnaryCallSettings<CancelTrainingPipelineRequest, Empty>
      cancelTrainingPipelineSettings;
  private final UnaryCallSettings<CreatePipelineJobRequest, PipelineJob> createPipelineJobSettings;
  private final UnaryCallSettings<GetPipelineJobRequest, PipelineJob> getPipelineJobSettings;
  private final PagedCallSettings<
          ListPipelineJobsRequest, ListPipelineJobsResponse, ListPipelineJobsPagedResponse>
      listPipelineJobsSettings;
  private final UnaryCallSettings<DeletePipelineJobRequest, Operation> deletePipelineJobSettings;
  private final OperationCallSettings<DeletePipelineJobRequest, Empty, DeleteOperationMetadata>
      deletePipelineJobOperationSettings;
  private final UnaryCallSettings<CancelPipelineJobRequest, Empty> cancelPipelineJobSettings;

  private static final PagedListDescriptor<
          ListTrainingPipelinesRequest, ListTrainingPipelinesResponse, TrainingPipeline>
      LIST_TRAINING_PIPELINES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTrainingPipelinesRequest, ListTrainingPipelinesResponse, TrainingPipeline>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTrainingPipelinesRequest injectToken(
                ListTrainingPipelinesRequest payload, String token) {
              return ListTrainingPipelinesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTrainingPipelinesRequest injectPageSize(
                ListTrainingPipelinesRequest payload, int pageSize) {
              return ListTrainingPipelinesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTrainingPipelinesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTrainingPipelinesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TrainingPipeline> extractResources(
                ListTrainingPipelinesResponse payload) {
              return payload.getTrainingPipelinesList() == null
                  ? ImmutableList.<TrainingPipeline>of()
                  : payload.getTrainingPipelinesList();
            }
          };

  private static final PagedListDescriptor<
          ListPipelineJobsRequest, ListPipelineJobsResponse, PipelineJob>
      LIST_PIPELINE_JOBS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListPipelineJobsRequest, ListPipelineJobsResponse, PipelineJob>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPipelineJobsRequest injectToken(
                ListPipelineJobsRequest payload, String token) {
              return ListPipelineJobsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListPipelineJobsRequest injectPageSize(
                ListPipelineJobsRequest payload, int pageSize) {
              return ListPipelineJobsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListPipelineJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListPipelineJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<PipelineJob> extractResources(ListPipelineJobsResponse payload) {
              return payload.getPipelineJobsList() == null
                  ? ImmutableList.<PipelineJob>of()
                  : payload.getPipelineJobsList();
            }
          };

  private static final PagedListResponseFactory<
          ListTrainingPipelinesRequest, ListTrainingPipelinesResponse,
          ListTrainingPipelinesPagedResponse>
      LIST_TRAINING_PIPELINES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTrainingPipelinesRequest, ListTrainingPipelinesResponse,
              ListTrainingPipelinesPagedResponse>() {
            @Override
            public ApiFuture<ListTrainingPipelinesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTrainingPipelinesRequest, ListTrainingPipelinesResponse> callable,
                ListTrainingPipelinesRequest request,
                ApiCallContext context,
                ApiFuture<ListTrainingPipelinesResponse> futureResponse) {
              PageContext<
                      ListTrainingPipelinesRequest, ListTrainingPipelinesResponse, TrainingPipeline>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TRAINING_PIPELINES_PAGE_STR_DESC, request, context);
              return ListTrainingPipelinesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPipelineJobsRequest, ListPipelineJobsResponse, ListPipelineJobsPagedResponse>
      LIST_PIPELINE_JOBS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPipelineJobsRequest, ListPipelineJobsResponse, ListPipelineJobsPagedResponse>() {
            @Override
            public ApiFuture<ListPipelineJobsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListPipelineJobsRequest, ListPipelineJobsResponse> callable,
                ListPipelineJobsRequest request,
                ApiCallContext context,
                ApiFuture<ListPipelineJobsResponse> futureResponse) {
              PageContext<ListPipelineJobsRequest, ListPipelineJobsResponse, PipelineJob>
                  pageContext =
                      PageContext.create(
                          callable, LIST_PIPELINE_JOBS_PAGE_STR_DESC, request, context);
              return ListPipelineJobsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createTrainingPipeline. */
  public UnaryCallSettings<CreateTrainingPipelineRequest, TrainingPipeline>
      createTrainingPipelineSettings() {
    return createTrainingPipelineSettings;
  }

  /** Returns the object with the settings used for calls to getTrainingPipeline. */
  public UnaryCallSettings<GetTrainingPipelineRequest, TrainingPipeline>
      getTrainingPipelineSettings() {
    return getTrainingPipelineSettings;
  }

  /** Returns the object with the settings used for calls to listTrainingPipelines. */
  public PagedCallSettings<
          ListTrainingPipelinesRequest, ListTrainingPipelinesResponse,
          ListTrainingPipelinesPagedResponse>
      listTrainingPipelinesSettings() {
    return listTrainingPipelinesSettings;
  }

  /** Returns the object with the settings used for calls to deleteTrainingPipeline. */
  public UnaryCallSettings<DeleteTrainingPipelineRequest, Operation>
      deleteTrainingPipelineSettings() {
    return deleteTrainingPipelineSettings;
  }

  /** Returns the object with the settings used for calls to deleteTrainingPipeline. */
  public OperationCallSettings<DeleteTrainingPipelineRequest, Empty, DeleteOperationMetadata>
      deleteTrainingPipelineOperationSettings() {
    return deleteTrainingPipelineOperationSettings;
  }

  /** Returns the object with the settings used for calls to cancelTrainingPipeline. */
  public UnaryCallSettings<CancelTrainingPipelineRequest, Empty> cancelTrainingPipelineSettings() {
    return cancelTrainingPipelineSettings;
  }

  /** Returns the object with the settings used for calls to createPipelineJob. */
  public UnaryCallSettings<CreatePipelineJobRequest, PipelineJob> createPipelineJobSettings() {
    return createPipelineJobSettings;
  }

  /** Returns the object with the settings used for calls to getPipelineJob. */
  public UnaryCallSettings<GetPipelineJobRequest, PipelineJob> getPipelineJobSettings() {
    return getPipelineJobSettings;
  }

  /** Returns the object with the settings used for calls to listPipelineJobs. */
  public PagedCallSettings<
          ListPipelineJobsRequest, ListPipelineJobsResponse, ListPipelineJobsPagedResponse>
      listPipelineJobsSettings() {
    return listPipelineJobsSettings;
  }

  /** Returns the object with the settings used for calls to deletePipelineJob. */
  public UnaryCallSettings<DeletePipelineJobRequest, Operation> deletePipelineJobSettings() {
    return deletePipelineJobSettings;
  }

  /** Returns the object with the settings used for calls to deletePipelineJob. */
  public OperationCallSettings<DeletePipelineJobRequest, Empty, DeleteOperationMetadata>
      deletePipelineJobOperationSettings() {
    return deletePipelineJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to cancelPipelineJob. */
  public UnaryCallSettings<CancelPipelineJobRequest, Empty> cancelPipelineJobSettings() {
    return cancelPipelineJobSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public PipelineServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcPipelineServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(PipelineServiceStubSettings.class))
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

  protected PipelineServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createTrainingPipelineSettings = settingsBuilder.createTrainingPipelineSettings().build();
    getTrainingPipelineSettings = settingsBuilder.getTrainingPipelineSettings().build();
    listTrainingPipelinesSettings = settingsBuilder.listTrainingPipelinesSettings().build();
    deleteTrainingPipelineSettings = settingsBuilder.deleteTrainingPipelineSettings().build();
    deleteTrainingPipelineOperationSettings =
        settingsBuilder.deleteTrainingPipelineOperationSettings().build();
    cancelTrainingPipelineSettings = settingsBuilder.cancelTrainingPipelineSettings().build();
    createPipelineJobSettings = settingsBuilder.createPipelineJobSettings().build();
    getPipelineJobSettings = settingsBuilder.getPipelineJobSettings().build();
    listPipelineJobsSettings = settingsBuilder.listPipelineJobsSettings().build();
    deletePipelineJobSettings = settingsBuilder.deletePipelineJobSettings().build();
    deletePipelineJobOperationSettings =
        settingsBuilder.deletePipelineJobOperationSettings().build();
    cancelPipelineJobSettings = settingsBuilder.cancelPipelineJobSettings().build();
  }

  /** Builder for PipelineServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<PipelineServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateTrainingPipelineRequest, TrainingPipeline>
        createTrainingPipelineSettings;
    private final UnaryCallSettings.Builder<GetTrainingPipelineRequest, TrainingPipeline>
        getTrainingPipelineSettings;
    private final PagedCallSettings.Builder<
            ListTrainingPipelinesRequest, ListTrainingPipelinesResponse,
            ListTrainingPipelinesPagedResponse>
        listTrainingPipelinesSettings;
    private final UnaryCallSettings.Builder<DeleteTrainingPipelineRequest, Operation>
        deleteTrainingPipelineSettings;
    private final OperationCallSettings.Builder<
            DeleteTrainingPipelineRequest, Empty, DeleteOperationMetadata>
        deleteTrainingPipelineOperationSettings;
    private final UnaryCallSettings.Builder<CancelTrainingPipelineRequest, Empty>
        cancelTrainingPipelineSettings;
    private final UnaryCallSettings.Builder<CreatePipelineJobRequest, PipelineJob>
        createPipelineJobSettings;
    private final UnaryCallSettings.Builder<GetPipelineJobRequest, PipelineJob>
        getPipelineJobSettings;
    private final PagedCallSettings.Builder<
            ListPipelineJobsRequest, ListPipelineJobsResponse, ListPipelineJobsPagedResponse>
        listPipelineJobsSettings;
    private final UnaryCallSettings.Builder<DeletePipelineJobRequest, Operation>
        deletePipelineJobSettings;
    private final OperationCallSettings.Builder<
            DeletePipelineJobRequest, Empty, DeleteOperationMetadata>
        deletePipelineJobOperationSettings;
    private final UnaryCallSettings.Builder<CancelPipelineJobRequest, Empty>
        cancelPipelineJobSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_8_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
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
      definitions.put("no_retry_8_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createTrainingPipelineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getTrainingPipelineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTrainingPipelinesSettings =
          PagedCallSettings.newBuilder(LIST_TRAINING_PIPELINES_PAGE_STR_FACT);
      deleteTrainingPipelineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTrainingPipelineOperationSettings = OperationCallSettings.newBuilder();
      cancelTrainingPipelineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createPipelineJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getPipelineJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listPipelineJobsSettings = PagedCallSettings.newBuilder(LIST_PIPELINE_JOBS_PAGE_STR_FACT);
      deletePipelineJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deletePipelineJobOperationSettings = OperationCallSettings.newBuilder();
      cancelPipelineJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createTrainingPipelineSettings,
              getTrainingPipelineSettings,
              listTrainingPipelinesSettings,
              deleteTrainingPipelineSettings,
              cancelTrainingPipelineSettings,
              createPipelineJobSettings,
              getPipelineJobSettings,
              listPipelineJobsSettings,
              deletePipelineJobSettings,
              cancelPipelineJobSettings);
      initDefaults(this);
    }

    protected Builder(PipelineServiceStubSettings settings) {
      super(settings);

      createTrainingPipelineSettings = settings.createTrainingPipelineSettings.toBuilder();
      getTrainingPipelineSettings = settings.getTrainingPipelineSettings.toBuilder();
      listTrainingPipelinesSettings = settings.listTrainingPipelinesSettings.toBuilder();
      deleteTrainingPipelineSettings = settings.deleteTrainingPipelineSettings.toBuilder();
      deleteTrainingPipelineOperationSettings =
          settings.deleteTrainingPipelineOperationSettings.toBuilder();
      cancelTrainingPipelineSettings = settings.cancelTrainingPipelineSettings.toBuilder();
      createPipelineJobSettings = settings.createPipelineJobSettings.toBuilder();
      getPipelineJobSettings = settings.getPipelineJobSettings.toBuilder();
      listPipelineJobsSettings = settings.listPipelineJobsSettings.toBuilder();
      deletePipelineJobSettings = settings.deletePipelineJobSettings.toBuilder();
      deletePipelineJobOperationSettings = settings.deletePipelineJobOperationSettings.toBuilder();
      cancelPipelineJobSettings = settings.cancelPipelineJobSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createTrainingPipelineSettings,
              getTrainingPipelineSettings,
              listTrainingPipelinesSettings,
              deleteTrainingPipelineSettings,
              cancelTrainingPipelineSettings,
              createPipelineJobSettings,
              getPipelineJobSettings,
              listPipelineJobsSettings,
              deletePipelineJobSettings,
              cancelPipelineJobSettings);
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
          .createTrainingPipelineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_8_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_8_params"));

      builder
          .getTrainingPipelineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_8_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_8_params"));

      builder
          .listTrainingPipelinesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_8_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_8_params"));

      builder
          .deleteTrainingPipelineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_8_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_8_params"));

      builder
          .cancelTrainingPipelineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_8_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_8_params"));

      builder
          .createPipelineJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getPipelineJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listPipelineJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deletePipelineJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .cancelPipelineJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteTrainingPipelineOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteTrainingPipelineRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_8_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_8_params"))
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
          .deletePipelineJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeletePipelineJobRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
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

    /** Returns the builder for the settings used for calls to createTrainingPipeline. */
    public UnaryCallSettings.Builder<CreateTrainingPipelineRequest, TrainingPipeline>
        createTrainingPipelineSettings() {
      return createTrainingPipelineSettings;
    }

    /** Returns the builder for the settings used for calls to getTrainingPipeline. */
    public UnaryCallSettings.Builder<GetTrainingPipelineRequest, TrainingPipeline>
        getTrainingPipelineSettings() {
      return getTrainingPipelineSettings;
    }

    /** Returns the builder for the settings used for calls to listTrainingPipelines. */
    public PagedCallSettings.Builder<
            ListTrainingPipelinesRequest, ListTrainingPipelinesResponse,
            ListTrainingPipelinesPagedResponse>
        listTrainingPipelinesSettings() {
      return listTrainingPipelinesSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTrainingPipeline. */
    public UnaryCallSettings.Builder<DeleteTrainingPipelineRequest, Operation>
        deleteTrainingPipelineSettings() {
      return deleteTrainingPipelineSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTrainingPipeline. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteTrainingPipelineRequest, Empty, DeleteOperationMetadata>
        deleteTrainingPipelineOperationSettings() {
      return deleteTrainingPipelineOperationSettings;
    }

    /** Returns the builder for the settings used for calls to cancelTrainingPipeline. */
    public UnaryCallSettings.Builder<CancelTrainingPipelineRequest, Empty>
        cancelTrainingPipelineSettings() {
      return cancelTrainingPipelineSettings;
    }

    /** Returns the builder for the settings used for calls to createPipelineJob. */
    public UnaryCallSettings.Builder<CreatePipelineJobRequest, PipelineJob>
        createPipelineJobSettings() {
      return createPipelineJobSettings;
    }

    /** Returns the builder for the settings used for calls to getPipelineJob. */
    public UnaryCallSettings.Builder<GetPipelineJobRequest, PipelineJob> getPipelineJobSettings() {
      return getPipelineJobSettings;
    }

    /** Returns the builder for the settings used for calls to listPipelineJobs. */
    public PagedCallSettings.Builder<
            ListPipelineJobsRequest, ListPipelineJobsResponse, ListPipelineJobsPagedResponse>
        listPipelineJobsSettings() {
      return listPipelineJobsSettings;
    }

    /** Returns the builder for the settings used for calls to deletePipelineJob. */
    public UnaryCallSettings.Builder<DeletePipelineJobRequest, Operation>
        deletePipelineJobSettings() {
      return deletePipelineJobSettings;
    }

    /** Returns the builder for the settings used for calls to deletePipelineJob. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeletePipelineJobRequest, Empty, DeleteOperationMetadata>
        deletePipelineJobOperationSettings() {
      return deletePipelineJobOperationSettings;
    }

    /** Returns the builder for the settings used for calls to cancelPipelineJob. */
    public UnaryCallSettings.Builder<CancelPipelineJobRequest, Empty> cancelPipelineJobSettings() {
      return cancelPipelineJobSettings;
    }

    @Override
    public PipelineServiceStubSettings build() throws IOException {
      return new PipelineServiceStubSettings(this);
    }
  }
}
