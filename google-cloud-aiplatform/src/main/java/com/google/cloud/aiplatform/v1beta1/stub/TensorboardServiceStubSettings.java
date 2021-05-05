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

import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ExportTensorboardTimeSeriesDataPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ListTensorboardExperimentsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ListTensorboardRunsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ListTensorboardTimeSeriesPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ListTensorboardsPagedResponse;

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
import com.google.api.gax.rpc.ServerStreamingCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1beta1.CreateTensorboardExperimentRequest;
import com.google.cloud.aiplatform.v1beta1.CreateTensorboardOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateTensorboardRequest;
import com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest;
import com.google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.DeleteTensorboardExperimentRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteTensorboardRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteTensorboardRunRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteTensorboardTimeSeriesRequest;
import com.google.cloud.aiplatform.v1beta1.ExportTensorboardTimeSeriesDataRequest;
import com.google.cloud.aiplatform.v1beta1.ExportTensorboardTimeSeriesDataResponse;
import com.google.cloud.aiplatform.v1beta1.GetTensorboardExperimentRequest;
import com.google.cloud.aiplatform.v1beta1.GetTensorboardRequest;
import com.google.cloud.aiplatform.v1beta1.GetTensorboardRunRequest;
import com.google.cloud.aiplatform.v1beta1.GetTensorboardTimeSeriesRequest;
import com.google.cloud.aiplatform.v1beta1.ListTensorboardExperimentsRequest;
import com.google.cloud.aiplatform.v1beta1.ListTensorboardExperimentsResponse;
import com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsRequest;
import com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse;
import com.google.cloud.aiplatform.v1beta1.ListTensorboardTimeSeriesRequest;
import com.google.cloud.aiplatform.v1beta1.ListTensorboardTimeSeriesResponse;
import com.google.cloud.aiplatform.v1beta1.ListTensorboardsRequest;
import com.google.cloud.aiplatform.v1beta1.ListTensorboardsResponse;
import com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest;
import com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataResponse;
import com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataRequest;
import com.google.cloud.aiplatform.v1beta1.ReadTensorboardTimeSeriesDataResponse;
import com.google.cloud.aiplatform.v1beta1.Tensorboard;
import com.google.cloud.aiplatform.v1beta1.TensorboardExperiment;
import com.google.cloud.aiplatform.v1beta1.TensorboardRun;
import com.google.cloud.aiplatform.v1beta1.TensorboardTimeSeries;
import com.google.cloud.aiplatform.v1beta1.TimeSeriesDataPoint;
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardExperimentRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardTimeSeriesRequest;
import com.google.cloud.aiplatform.v1beta1.WriteTensorboardRunDataRequest;
import com.google.cloud.aiplatform.v1beta1.WriteTensorboardRunDataResponse;
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
 * Settings class to configure an instance of {@link TensorboardServiceStub}.
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
 * <p>For example, to set the total timeout of getTensorboard to 30 seconds:
 *
 * <pre>{@code
 * TensorboardServiceStubSettings.Builder tensorboardServiceSettingsBuilder =
 *     TensorboardServiceStubSettings.newBuilder();
 * tensorboardServiceSettingsBuilder
 *     .getTensorboardSettings()
 *     .setRetrySettings(
 *         tensorboardServiceSettingsBuilder
 *             .getTensorboardSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * TensorboardServiceStubSettings tensorboardServiceSettings =
 *     tensorboardServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class TensorboardServiceStubSettings extends StubSettings<TensorboardServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateTensorboardRequest, Operation> createTensorboardSettings;
  private final OperationCallSettings<
          CreateTensorboardRequest, Tensorboard, CreateTensorboardOperationMetadata>
      createTensorboardOperationSettings;
  private final UnaryCallSettings<GetTensorboardRequest, Tensorboard> getTensorboardSettings;
  private final UnaryCallSettings<UpdateTensorboardRequest, Operation> updateTensorboardSettings;
  private final OperationCallSettings<
          UpdateTensorboardRequest, Tensorboard, UpdateTensorboardOperationMetadata>
      updateTensorboardOperationSettings;
  private final PagedCallSettings<
          ListTensorboardsRequest, ListTensorboardsResponse, ListTensorboardsPagedResponse>
      listTensorboardsSettings;
  private final UnaryCallSettings<DeleteTensorboardRequest, Operation> deleteTensorboardSettings;
  private final OperationCallSettings<DeleteTensorboardRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardOperationSettings;
  private final UnaryCallSettings<CreateTensorboardExperimentRequest, TensorboardExperiment>
      createTensorboardExperimentSettings;
  private final UnaryCallSettings<GetTensorboardExperimentRequest, TensorboardExperiment>
      getTensorboardExperimentSettings;
  private final UnaryCallSettings<UpdateTensorboardExperimentRequest, TensorboardExperiment>
      updateTensorboardExperimentSettings;
  private final PagedCallSettings<
          ListTensorboardExperimentsRequest,
          ListTensorboardExperimentsResponse,
          ListTensorboardExperimentsPagedResponse>
      listTensorboardExperimentsSettings;
  private final UnaryCallSettings<DeleteTensorboardExperimentRequest, Operation>
      deleteTensorboardExperimentSettings;
  private final OperationCallSettings<
          DeleteTensorboardExperimentRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardExperimentOperationSettings;
  private final UnaryCallSettings<CreateTensorboardRunRequest, TensorboardRun>
      createTensorboardRunSettings;
  private final UnaryCallSettings<GetTensorboardRunRequest, TensorboardRun>
      getTensorboardRunSettings;
  private final UnaryCallSettings<UpdateTensorboardRunRequest, TensorboardRun>
      updateTensorboardRunSettings;
  private final PagedCallSettings<
          ListTensorboardRunsRequest, ListTensorboardRunsResponse, ListTensorboardRunsPagedResponse>
      listTensorboardRunsSettings;
  private final UnaryCallSettings<DeleteTensorboardRunRequest, Operation>
      deleteTensorboardRunSettings;
  private final OperationCallSettings<DeleteTensorboardRunRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardRunOperationSettings;
  private final UnaryCallSettings<CreateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      createTensorboardTimeSeriesSettings;
  private final UnaryCallSettings<GetTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      getTensorboardTimeSeriesSettings;
  private final UnaryCallSettings<UpdateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      updateTensorboardTimeSeriesSettings;
  private final PagedCallSettings<
          ListTensorboardTimeSeriesRequest,
          ListTensorboardTimeSeriesResponse,
          ListTensorboardTimeSeriesPagedResponse>
      listTensorboardTimeSeriesSettings;
  private final UnaryCallSettings<DeleteTensorboardTimeSeriesRequest, Operation>
      deleteTensorboardTimeSeriesSettings;
  private final OperationCallSettings<
          DeleteTensorboardTimeSeriesRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardTimeSeriesOperationSettings;
  private final UnaryCallSettings<
          ReadTensorboardTimeSeriesDataRequest, ReadTensorboardTimeSeriesDataResponse>
      readTensorboardTimeSeriesDataSettings;
  private final ServerStreamingCallSettings<
          ReadTensorboardBlobDataRequest, ReadTensorboardBlobDataResponse>
      readTensorboardBlobDataSettings;
  private final UnaryCallSettings<WriteTensorboardRunDataRequest, WriteTensorboardRunDataResponse>
      writeTensorboardRunDataSettings;
  private final PagedCallSettings<
          ExportTensorboardTimeSeriesDataRequest,
          ExportTensorboardTimeSeriesDataResponse,
          ExportTensorboardTimeSeriesDataPagedResponse>
      exportTensorboardTimeSeriesDataSettings;

  private static final PagedListDescriptor<
          ListTensorboardsRequest, ListTensorboardsResponse, Tensorboard>
      LIST_TENSORBOARDS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTensorboardsRequest, ListTensorboardsResponse, Tensorboard>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTensorboardsRequest injectToken(
                ListTensorboardsRequest payload, String token) {
              return ListTensorboardsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTensorboardsRequest injectPageSize(
                ListTensorboardsRequest payload, int pageSize) {
              return ListTensorboardsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTensorboardsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTensorboardsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Tensorboard> extractResources(ListTensorboardsResponse payload) {
              return payload.getTensorboardsList() == null
                  ? ImmutableList.<Tensorboard>of()
                  : payload.getTensorboardsList();
            }
          };

  private static final PagedListDescriptor<
          ListTensorboardExperimentsRequest,
          ListTensorboardExperimentsResponse,
          TensorboardExperiment>
      LIST_TENSORBOARD_EXPERIMENTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTensorboardExperimentsRequest,
              ListTensorboardExperimentsResponse,
              TensorboardExperiment>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTensorboardExperimentsRequest injectToken(
                ListTensorboardExperimentsRequest payload, String token) {
              return ListTensorboardExperimentsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListTensorboardExperimentsRequest injectPageSize(
                ListTensorboardExperimentsRequest payload, int pageSize) {
              return ListTensorboardExperimentsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListTensorboardExperimentsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTensorboardExperimentsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TensorboardExperiment> extractResources(
                ListTensorboardExperimentsResponse payload) {
              return payload.getTensorboardExperimentsList() == null
                  ? ImmutableList.<TensorboardExperiment>of()
                  : payload.getTensorboardExperimentsList();
            }
          };

  private static final PagedListDescriptor<
          ListTensorboardRunsRequest, ListTensorboardRunsResponse, TensorboardRun>
      LIST_TENSORBOARD_RUNS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTensorboardRunsRequest, ListTensorboardRunsResponse, TensorboardRun>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTensorboardRunsRequest injectToken(
                ListTensorboardRunsRequest payload, String token) {
              return ListTensorboardRunsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTensorboardRunsRequest injectPageSize(
                ListTensorboardRunsRequest payload, int pageSize) {
              return ListTensorboardRunsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTensorboardRunsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTensorboardRunsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TensorboardRun> extractResources(ListTensorboardRunsResponse payload) {
              return payload.getTensorboardRunsList() == null
                  ? ImmutableList.<TensorboardRun>of()
                  : payload.getTensorboardRunsList();
            }
          };

  private static final PagedListDescriptor<
          ListTensorboardTimeSeriesRequest,
          ListTensorboardTimeSeriesResponse,
          TensorboardTimeSeries>
      LIST_TENSORBOARD_TIME_SERIES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTensorboardTimeSeriesRequest,
              ListTensorboardTimeSeriesResponse,
              TensorboardTimeSeries>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTensorboardTimeSeriesRequest injectToken(
                ListTensorboardTimeSeriesRequest payload, String token) {
              return ListTensorboardTimeSeriesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListTensorboardTimeSeriesRequest injectPageSize(
                ListTensorboardTimeSeriesRequest payload, int pageSize) {
              return ListTensorboardTimeSeriesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListTensorboardTimeSeriesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTensorboardTimeSeriesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TensorboardTimeSeries> extractResources(
                ListTensorboardTimeSeriesResponse payload) {
              return payload.getTensorboardTimeSeriesList() == null
                  ? ImmutableList.<TensorboardTimeSeries>of()
                  : payload.getTensorboardTimeSeriesList();
            }
          };

  private static final PagedListDescriptor<
          ExportTensorboardTimeSeriesDataRequest,
          ExportTensorboardTimeSeriesDataResponse,
          TimeSeriesDataPoint>
      EXPORT_TENSORBOARD_TIME_SERIES_DATA_PAGE_STR_DESC =
          new PagedListDescriptor<
              ExportTensorboardTimeSeriesDataRequest,
              ExportTensorboardTimeSeriesDataResponse,
              TimeSeriesDataPoint>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ExportTensorboardTimeSeriesDataRequest injectToken(
                ExportTensorboardTimeSeriesDataRequest payload, String token) {
              return ExportTensorboardTimeSeriesDataRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ExportTensorboardTimeSeriesDataRequest injectPageSize(
                ExportTensorboardTimeSeriesDataRequest payload, int pageSize) {
              return ExportTensorboardTimeSeriesDataRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ExportTensorboardTimeSeriesDataRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ExportTensorboardTimeSeriesDataResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TimeSeriesDataPoint> extractResources(
                ExportTensorboardTimeSeriesDataResponse payload) {
              return payload.getTimeSeriesDataPointsList() == null
                  ? ImmutableList.<TimeSeriesDataPoint>of()
                  : payload.getTimeSeriesDataPointsList();
            }
          };

  private static final PagedListResponseFactory<
          ListTensorboardsRequest, ListTensorboardsResponse, ListTensorboardsPagedResponse>
      LIST_TENSORBOARDS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTensorboardsRequest, ListTensorboardsResponse, ListTensorboardsPagedResponse>() {
            @Override
            public ApiFuture<ListTensorboardsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTensorboardsRequest, ListTensorboardsResponse> callable,
                ListTensorboardsRequest request,
                ApiCallContext context,
                ApiFuture<ListTensorboardsResponse> futureResponse) {
              PageContext<ListTensorboardsRequest, ListTensorboardsResponse, Tensorboard>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TENSORBOARDS_PAGE_STR_DESC, request, context);
              return ListTensorboardsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTensorboardExperimentsRequest,
          ListTensorboardExperimentsResponse,
          ListTensorboardExperimentsPagedResponse>
      LIST_TENSORBOARD_EXPERIMENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTensorboardExperimentsRequest,
              ListTensorboardExperimentsResponse,
              ListTensorboardExperimentsPagedResponse>() {
            @Override
            public ApiFuture<ListTensorboardExperimentsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTensorboardExperimentsRequest, ListTensorboardExperimentsResponse>
                    callable,
                ListTensorboardExperimentsRequest request,
                ApiCallContext context,
                ApiFuture<ListTensorboardExperimentsResponse> futureResponse) {
              PageContext<
                      ListTensorboardExperimentsRequest,
                      ListTensorboardExperimentsResponse,
                      TensorboardExperiment>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TENSORBOARD_EXPERIMENTS_PAGE_STR_DESC, request, context);
              return ListTensorboardExperimentsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTensorboardRunsRequest, ListTensorboardRunsResponse, ListTensorboardRunsPagedResponse>
      LIST_TENSORBOARD_RUNS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTensorboardRunsRequest,
              ListTensorboardRunsResponse,
              ListTensorboardRunsPagedResponse>() {
            @Override
            public ApiFuture<ListTensorboardRunsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTensorboardRunsRequest, ListTensorboardRunsResponse> callable,
                ListTensorboardRunsRequest request,
                ApiCallContext context,
                ApiFuture<ListTensorboardRunsResponse> futureResponse) {
              PageContext<ListTensorboardRunsRequest, ListTensorboardRunsResponse, TensorboardRun>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TENSORBOARD_RUNS_PAGE_STR_DESC, request, context);
              return ListTensorboardRunsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTensorboardTimeSeriesRequest,
          ListTensorboardTimeSeriesResponse,
          ListTensorboardTimeSeriesPagedResponse>
      LIST_TENSORBOARD_TIME_SERIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTensorboardTimeSeriesRequest,
              ListTensorboardTimeSeriesResponse,
              ListTensorboardTimeSeriesPagedResponse>() {
            @Override
            public ApiFuture<ListTensorboardTimeSeriesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTensorboardTimeSeriesRequest, ListTensorboardTimeSeriesResponse>
                    callable,
                ListTensorboardTimeSeriesRequest request,
                ApiCallContext context,
                ApiFuture<ListTensorboardTimeSeriesResponse> futureResponse) {
              PageContext<
                      ListTensorboardTimeSeriesRequest,
                      ListTensorboardTimeSeriesResponse,
                      TensorboardTimeSeries>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TENSORBOARD_TIME_SERIES_PAGE_STR_DESC, request, context);
              return ListTensorboardTimeSeriesPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ExportTensorboardTimeSeriesDataRequest,
          ExportTensorboardTimeSeriesDataResponse,
          ExportTensorboardTimeSeriesDataPagedResponse>
      EXPORT_TENSORBOARD_TIME_SERIES_DATA_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ExportTensorboardTimeSeriesDataRequest,
              ExportTensorboardTimeSeriesDataResponse,
              ExportTensorboardTimeSeriesDataPagedResponse>() {
            @Override
            public ApiFuture<ExportTensorboardTimeSeriesDataPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ExportTensorboardTimeSeriesDataRequest,
                        ExportTensorboardTimeSeriesDataResponse>
                    callable,
                ExportTensorboardTimeSeriesDataRequest request,
                ApiCallContext context,
                ApiFuture<ExportTensorboardTimeSeriesDataResponse> futureResponse) {
              PageContext<
                      ExportTensorboardTimeSeriesDataRequest,
                      ExportTensorboardTimeSeriesDataResponse,
                      TimeSeriesDataPoint>
                  pageContext =
                      PageContext.create(
                          callable,
                          EXPORT_TENSORBOARD_TIME_SERIES_DATA_PAGE_STR_DESC,
                          request,
                          context);
              return ExportTensorboardTimeSeriesDataPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createTensorboard. */
  public UnaryCallSettings<CreateTensorboardRequest, Operation> createTensorboardSettings() {
    return createTensorboardSettings;
  }

  /** Returns the object with the settings used for calls to createTensorboard. */
  public OperationCallSettings<
          CreateTensorboardRequest, Tensorboard, CreateTensorboardOperationMetadata>
      createTensorboardOperationSettings() {
    return createTensorboardOperationSettings;
  }

  /** Returns the object with the settings used for calls to getTensorboard. */
  public UnaryCallSettings<GetTensorboardRequest, Tensorboard> getTensorboardSettings() {
    return getTensorboardSettings;
  }

  /** Returns the object with the settings used for calls to updateTensorboard. */
  public UnaryCallSettings<UpdateTensorboardRequest, Operation> updateTensorboardSettings() {
    return updateTensorboardSettings;
  }

  /** Returns the object with the settings used for calls to updateTensorboard. */
  public OperationCallSettings<
          UpdateTensorboardRequest, Tensorboard, UpdateTensorboardOperationMetadata>
      updateTensorboardOperationSettings() {
    return updateTensorboardOperationSettings;
  }

  /** Returns the object with the settings used for calls to listTensorboards. */
  public PagedCallSettings<
          ListTensorboardsRequest, ListTensorboardsResponse, ListTensorboardsPagedResponse>
      listTensorboardsSettings() {
    return listTensorboardsSettings;
  }

  /** Returns the object with the settings used for calls to deleteTensorboard. */
  public UnaryCallSettings<DeleteTensorboardRequest, Operation> deleteTensorboardSettings() {
    return deleteTensorboardSettings;
  }

  /** Returns the object with the settings used for calls to deleteTensorboard. */
  public OperationCallSettings<DeleteTensorboardRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardOperationSettings() {
    return deleteTensorboardOperationSettings;
  }

  /** Returns the object with the settings used for calls to createTensorboardExperiment. */
  public UnaryCallSettings<CreateTensorboardExperimentRequest, TensorboardExperiment>
      createTensorboardExperimentSettings() {
    return createTensorboardExperimentSettings;
  }

  /** Returns the object with the settings used for calls to getTensorboardExperiment. */
  public UnaryCallSettings<GetTensorboardExperimentRequest, TensorboardExperiment>
      getTensorboardExperimentSettings() {
    return getTensorboardExperimentSettings;
  }

  /** Returns the object with the settings used for calls to updateTensorboardExperiment. */
  public UnaryCallSettings<UpdateTensorboardExperimentRequest, TensorboardExperiment>
      updateTensorboardExperimentSettings() {
    return updateTensorboardExperimentSettings;
  }

  /** Returns the object with the settings used for calls to listTensorboardExperiments. */
  public PagedCallSettings<
          ListTensorboardExperimentsRequest,
          ListTensorboardExperimentsResponse,
          ListTensorboardExperimentsPagedResponse>
      listTensorboardExperimentsSettings() {
    return listTensorboardExperimentsSettings;
  }

  /** Returns the object with the settings used for calls to deleteTensorboardExperiment. */
  public UnaryCallSettings<DeleteTensorboardExperimentRequest, Operation>
      deleteTensorboardExperimentSettings() {
    return deleteTensorboardExperimentSettings;
  }

  /** Returns the object with the settings used for calls to deleteTensorboardExperiment. */
  public OperationCallSettings<DeleteTensorboardExperimentRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardExperimentOperationSettings() {
    return deleteTensorboardExperimentOperationSettings;
  }

  /** Returns the object with the settings used for calls to createTensorboardRun. */
  public UnaryCallSettings<CreateTensorboardRunRequest, TensorboardRun>
      createTensorboardRunSettings() {
    return createTensorboardRunSettings;
  }

  /** Returns the object with the settings used for calls to getTensorboardRun. */
  public UnaryCallSettings<GetTensorboardRunRequest, TensorboardRun> getTensorboardRunSettings() {
    return getTensorboardRunSettings;
  }

  /** Returns the object with the settings used for calls to updateTensorboardRun. */
  public UnaryCallSettings<UpdateTensorboardRunRequest, TensorboardRun>
      updateTensorboardRunSettings() {
    return updateTensorboardRunSettings;
  }

  /** Returns the object with the settings used for calls to listTensorboardRuns. */
  public PagedCallSettings<
          ListTensorboardRunsRequest, ListTensorboardRunsResponse, ListTensorboardRunsPagedResponse>
      listTensorboardRunsSettings() {
    return listTensorboardRunsSettings;
  }

  /** Returns the object with the settings used for calls to deleteTensorboardRun. */
  public UnaryCallSettings<DeleteTensorboardRunRequest, Operation> deleteTensorboardRunSettings() {
    return deleteTensorboardRunSettings;
  }

  /** Returns the object with the settings used for calls to deleteTensorboardRun. */
  public OperationCallSettings<DeleteTensorboardRunRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardRunOperationSettings() {
    return deleteTensorboardRunOperationSettings;
  }

  /** Returns the object with the settings used for calls to createTensorboardTimeSeries. */
  public UnaryCallSettings<CreateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      createTensorboardTimeSeriesSettings() {
    return createTensorboardTimeSeriesSettings;
  }

  /** Returns the object with the settings used for calls to getTensorboardTimeSeries. */
  public UnaryCallSettings<GetTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      getTensorboardTimeSeriesSettings() {
    return getTensorboardTimeSeriesSettings;
  }

  /** Returns the object with the settings used for calls to updateTensorboardTimeSeries. */
  public UnaryCallSettings<UpdateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      updateTensorboardTimeSeriesSettings() {
    return updateTensorboardTimeSeriesSettings;
  }

  /** Returns the object with the settings used for calls to listTensorboardTimeSeries. */
  public PagedCallSettings<
          ListTensorboardTimeSeriesRequest,
          ListTensorboardTimeSeriesResponse,
          ListTensorboardTimeSeriesPagedResponse>
      listTensorboardTimeSeriesSettings() {
    return listTensorboardTimeSeriesSettings;
  }

  /** Returns the object with the settings used for calls to deleteTensorboardTimeSeries. */
  public UnaryCallSettings<DeleteTensorboardTimeSeriesRequest, Operation>
      deleteTensorboardTimeSeriesSettings() {
    return deleteTensorboardTimeSeriesSettings;
  }

  /** Returns the object with the settings used for calls to deleteTensorboardTimeSeries. */
  public OperationCallSettings<DeleteTensorboardTimeSeriesRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardTimeSeriesOperationSettings() {
    return deleteTensorboardTimeSeriesOperationSettings;
  }

  /** Returns the object with the settings used for calls to readTensorboardTimeSeriesData. */
  public UnaryCallSettings<
          ReadTensorboardTimeSeriesDataRequest, ReadTensorboardTimeSeriesDataResponse>
      readTensorboardTimeSeriesDataSettings() {
    return readTensorboardTimeSeriesDataSettings;
  }

  /** Returns the object with the settings used for calls to readTensorboardBlobData. */
  public ServerStreamingCallSettings<
          ReadTensorboardBlobDataRequest, ReadTensorboardBlobDataResponse>
      readTensorboardBlobDataSettings() {
    return readTensorboardBlobDataSettings;
  }

  /** Returns the object with the settings used for calls to writeTensorboardRunData. */
  public UnaryCallSettings<WriteTensorboardRunDataRequest, WriteTensorboardRunDataResponse>
      writeTensorboardRunDataSettings() {
    return writeTensorboardRunDataSettings;
  }

  /** Returns the object with the settings used for calls to exportTensorboardTimeSeriesData. */
  public PagedCallSettings<
          ExportTensorboardTimeSeriesDataRequest,
          ExportTensorboardTimeSeriesDataResponse,
          ExportTensorboardTimeSeriesDataPagedResponse>
      exportTensorboardTimeSeriesDataSettings() {
    return exportTensorboardTimeSeriesDataSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TensorboardServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcTensorboardServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(TensorboardServiceStubSettings.class))
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

  protected TensorboardServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createTensorboardSettings = settingsBuilder.createTensorboardSettings().build();
    createTensorboardOperationSettings =
        settingsBuilder.createTensorboardOperationSettings().build();
    getTensorboardSettings = settingsBuilder.getTensorboardSettings().build();
    updateTensorboardSettings = settingsBuilder.updateTensorboardSettings().build();
    updateTensorboardOperationSettings =
        settingsBuilder.updateTensorboardOperationSettings().build();
    listTensorboardsSettings = settingsBuilder.listTensorboardsSettings().build();
    deleteTensorboardSettings = settingsBuilder.deleteTensorboardSettings().build();
    deleteTensorboardOperationSettings =
        settingsBuilder.deleteTensorboardOperationSettings().build();
    createTensorboardExperimentSettings =
        settingsBuilder.createTensorboardExperimentSettings().build();
    getTensorboardExperimentSettings = settingsBuilder.getTensorboardExperimentSettings().build();
    updateTensorboardExperimentSettings =
        settingsBuilder.updateTensorboardExperimentSettings().build();
    listTensorboardExperimentsSettings =
        settingsBuilder.listTensorboardExperimentsSettings().build();
    deleteTensorboardExperimentSettings =
        settingsBuilder.deleteTensorboardExperimentSettings().build();
    deleteTensorboardExperimentOperationSettings =
        settingsBuilder.deleteTensorboardExperimentOperationSettings().build();
    createTensorboardRunSettings = settingsBuilder.createTensorboardRunSettings().build();
    getTensorboardRunSettings = settingsBuilder.getTensorboardRunSettings().build();
    updateTensorboardRunSettings = settingsBuilder.updateTensorboardRunSettings().build();
    listTensorboardRunsSettings = settingsBuilder.listTensorboardRunsSettings().build();
    deleteTensorboardRunSettings = settingsBuilder.deleteTensorboardRunSettings().build();
    deleteTensorboardRunOperationSettings =
        settingsBuilder.deleteTensorboardRunOperationSettings().build();
    createTensorboardTimeSeriesSettings =
        settingsBuilder.createTensorboardTimeSeriesSettings().build();
    getTensorboardTimeSeriesSettings = settingsBuilder.getTensorboardTimeSeriesSettings().build();
    updateTensorboardTimeSeriesSettings =
        settingsBuilder.updateTensorboardTimeSeriesSettings().build();
    listTensorboardTimeSeriesSettings = settingsBuilder.listTensorboardTimeSeriesSettings().build();
    deleteTensorboardTimeSeriesSettings =
        settingsBuilder.deleteTensorboardTimeSeriesSettings().build();
    deleteTensorboardTimeSeriesOperationSettings =
        settingsBuilder.deleteTensorboardTimeSeriesOperationSettings().build();
    readTensorboardTimeSeriesDataSettings =
        settingsBuilder.readTensorboardTimeSeriesDataSettings().build();
    readTensorboardBlobDataSettings = settingsBuilder.readTensorboardBlobDataSettings().build();
    writeTensorboardRunDataSettings = settingsBuilder.writeTensorboardRunDataSettings().build();
    exportTensorboardTimeSeriesDataSettings =
        settingsBuilder.exportTensorboardTimeSeriesDataSettings().build();
  }

  /** Builder for TensorboardServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<TensorboardServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateTensorboardRequest, Operation>
        createTensorboardSettings;
    private final OperationCallSettings.Builder<
            CreateTensorboardRequest, Tensorboard, CreateTensorboardOperationMetadata>
        createTensorboardOperationSettings;
    private final UnaryCallSettings.Builder<GetTensorboardRequest, Tensorboard>
        getTensorboardSettings;
    private final UnaryCallSettings.Builder<UpdateTensorboardRequest, Operation>
        updateTensorboardSettings;
    private final OperationCallSettings.Builder<
            UpdateTensorboardRequest, Tensorboard, UpdateTensorboardOperationMetadata>
        updateTensorboardOperationSettings;
    private final PagedCallSettings.Builder<
            ListTensorboardsRequest, ListTensorboardsResponse, ListTensorboardsPagedResponse>
        listTensorboardsSettings;
    private final UnaryCallSettings.Builder<DeleteTensorboardRequest, Operation>
        deleteTensorboardSettings;
    private final OperationCallSettings.Builder<
            DeleteTensorboardRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardOperationSettings;
    private final UnaryCallSettings.Builder<
            CreateTensorboardExperimentRequest, TensorboardExperiment>
        createTensorboardExperimentSettings;
    private final UnaryCallSettings.Builder<GetTensorboardExperimentRequest, TensorboardExperiment>
        getTensorboardExperimentSettings;
    private final UnaryCallSettings.Builder<
            UpdateTensorboardExperimentRequest, TensorboardExperiment>
        updateTensorboardExperimentSettings;
    private final PagedCallSettings.Builder<
            ListTensorboardExperimentsRequest,
            ListTensorboardExperimentsResponse,
            ListTensorboardExperimentsPagedResponse>
        listTensorboardExperimentsSettings;
    private final UnaryCallSettings.Builder<DeleteTensorboardExperimentRequest, Operation>
        deleteTensorboardExperimentSettings;
    private final OperationCallSettings.Builder<
            DeleteTensorboardExperimentRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardExperimentOperationSettings;
    private final UnaryCallSettings.Builder<CreateTensorboardRunRequest, TensorboardRun>
        createTensorboardRunSettings;
    private final UnaryCallSettings.Builder<GetTensorboardRunRequest, TensorboardRun>
        getTensorboardRunSettings;
    private final UnaryCallSettings.Builder<UpdateTensorboardRunRequest, TensorboardRun>
        updateTensorboardRunSettings;
    private final PagedCallSettings.Builder<
            ListTensorboardRunsRequest,
            ListTensorboardRunsResponse,
            ListTensorboardRunsPagedResponse>
        listTensorboardRunsSettings;
    private final UnaryCallSettings.Builder<DeleteTensorboardRunRequest, Operation>
        deleteTensorboardRunSettings;
    private final OperationCallSettings.Builder<
            DeleteTensorboardRunRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardRunOperationSettings;
    private final UnaryCallSettings.Builder<
            CreateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
        createTensorboardTimeSeriesSettings;
    private final UnaryCallSettings.Builder<GetTensorboardTimeSeriesRequest, TensorboardTimeSeries>
        getTensorboardTimeSeriesSettings;
    private final UnaryCallSettings.Builder<
            UpdateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
        updateTensorboardTimeSeriesSettings;
    private final PagedCallSettings.Builder<
            ListTensorboardTimeSeriesRequest,
            ListTensorboardTimeSeriesResponse,
            ListTensorboardTimeSeriesPagedResponse>
        listTensorboardTimeSeriesSettings;
    private final UnaryCallSettings.Builder<DeleteTensorboardTimeSeriesRequest, Operation>
        deleteTensorboardTimeSeriesSettings;
    private final OperationCallSettings.Builder<
            DeleteTensorboardTimeSeriesRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardTimeSeriesOperationSettings;
    private final UnaryCallSettings.Builder<
            ReadTensorboardTimeSeriesDataRequest, ReadTensorboardTimeSeriesDataResponse>
        readTensorboardTimeSeriesDataSettings;
    private final ServerStreamingCallSettings.Builder<
            ReadTensorboardBlobDataRequest, ReadTensorboardBlobDataResponse>
        readTensorboardBlobDataSettings;
    private final UnaryCallSettings.Builder<
            WriteTensorboardRunDataRequest, WriteTensorboardRunDataResponse>
        writeTensorboardRunDataSettings;
    private final PagedCallSettings.Builder<
            ExportTensorboardTimeSeriesDataRequest,
            ExportTensorboardTimeSeriesDataResponse,
            ExportTensorboardTimeSeriesDataPagedResponse>
        exportTensorboardTimeSeriesDataSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createTensorboardSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createTensorboardOperationSettings = OperationCallSettings.newBuilder();
      getTensorboardSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateTensorboardSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateTensorboardOperationSettings = OperationCallSettings.newBuilder();
      listTensorboardsSettings = PagedCallSettings.newBuilder(LIST_TENSORBOARDS_PAGE_STR_FACT);
      deleteTensorboardSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTensorboardOperationSettings = OperationCallSettings.newBuilder();
      createTensorboardExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getTensorboardExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateTensorboardExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTensorboardExperimentsSettings =
          PagedCallSettings.newBuilder(LIST_TENSORBOARD_EXPERIMENTS_PAGE_STR_FACT);
      deleteTensorboardExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTensorboardExperimentOperationSettings = OperationCallSettings.newBuilder();
      createTensorboardRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getTensorboardRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateTensorboardRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTensorboardRunsSettings =
          PagedCallSettings.newBuilder(LIST_TENSORBOARD_RUNS_PAGE_STR_FACT);
      deleteTensorboardRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTensorboardRunOperationSettings = OperationCallSettings.newBuilder();
      createTensorboardTimeSeriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getTensorboardTimeSeriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateTensorboardTimeSeriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTensorboardTimeSeriesSettings =
          PagedCallSettings.newBuilder(LIST_TENSORBOARD_TIME_SERIES_PAGE_STR_FACT);
      deleteTensorboardTimeSeriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTensorboardTimeSeriesOperationSettings = OperationCallSettings.newBuilder();
      readTensorboardTimeSeriesDataSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      readTensorboardBlobDataSettings = ServerStreamingCallSettings.newBuilder();
      writeTensorboardRunDataSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      exportTensorboardTimeSeriesDataSettings =
          PagedCallSettings.newBuilder(EXPORT_TENSORBOARD_TIME_SERIES_DATA_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createTensorboardSettings,
              getTensorboardSettings,
              updateTensorboardSettings,
              listTensorboardsSettings,
              deleteTensorboardSettings,
              createTensorboardExperimentSettings,
              getTensorboardExperimentSettings,
              updateTensorboardExperimentSettings,
              listTensorboardExperimentsSettings,
              deleteTensorboardExperimentSettings,
              createTensorboardRunSettings,
              getTensorboardRunSettings,
              updateTensorboardRunSettings,
              listTensorboardRunsSettings,
              deleteTensorboardRunSettings,
              createTensorboardTimeSeriesSettings,
              getTensorboardTimeSeriesSettings,
              updateTensorboardTimeSeriesSettings,
              listTensorboardTimeSeriesSettings,
              deleteTensorboardTimeSeriesSettings,
              readTensorboardTimeSeriesDataSettings,
              writeTensorboardRunDataSettings,
              exportTensorboardTimeSeriesDataSettings);
      initDefaults(this);
    }

    protected Builder(TensorboardServiceStubSettings settings) {
      super(settings);

      createTensorboardSettings = settings.createTensorboardSettings.toBuilder();
      createTensorboardOperationSettings = settings.createTensorboardOperationSettings.toBuilder();
      getTensorboardSettings = settings.getTensorboardSettings.toBuilder();
      updateTensorboardSettings = settings.updateTensorboardSettings.toBuilder();
      updateTensorboardOperationSettings = settings.updateTensorboardOperationSettings.toBuilder();
      listTensorboardsSettings = settings.listTensorboardsSettings.toBuilder();
      deleteTensorboardSettings = settings.deleteTensorboardSettings.toBuilder();
      deleteTensorboardOperationSettings = settings.deleteTensorboardOperationSettings.toBuilder();
      createTensorboardExperimentSettings =
          settings.createTensorboardExperimentSettings.toBuilder();
      getTensorboardExperimentSettings = settings.getTensorboardExperimentSettings.toBuilder();
      updateTensorboardExperimentSettings =
          settings.updateTensorboardExperimentSettings.toBuilder();
      listTensorboardExperimentsSettings = settings.listTensorboardExperimentsSettings.toBuilder();
      deleteTensorboardExperimentSettings =
          settings.deleteTensorboardExperimentSettings.toBuilder();
      deleteTensorboardExperimentOperationSettings =
          settings.deleteTensorboardExperimentOperationSettings.toBuilder();
      createTensorboardRunSettings = settings.createTensorboardRunSettings.toBuilder();
      getTensorboardRunSettings = settings.getTensorboardRunSettings.toBuilder();
      updateTensorboardRunSettings = settings.updateTensorboardRunSettings.toBuilder();
      listTensorboardRunsSettings = settings.listTensorboardRunsSettings.toBuilder();
      deleteTensorboardRunSettings = settings.deleteTensorboardRunSettings.toBuilder();
      deleteTensorboardRunOperationSettings =
          settings.deleteTensorboardRunOperationSettings.toBuilder();
      createTensorboardTimeSeriesSettings =
          settings.createTensorboardTimeSeriesSettings.toBuilder();
      getTensorboardTimeSeriesSettings = settings.getTensorboardTimeSeriesSettings.toBuilder();
      updateTensorboardTimeSeriesSettings =
          settings.updateTensorboardTimeSeriesSettings.toBuilder();
      listTensorboardTimeSeriesSettings = settings.listTensorboardTimeSeriesSettings.toBuilder();
      deleteTensorboardTimeSeriesSettings =
          settings.deleteTensorboardTimeSeriesSettings.toBuilder();
      deleteTensorboardTimeSeriesOperationSettings =
          settings.deleteTensorboardTimeSeriesOperationSettings.toBuilder();
      readTensorboardTimeSeriesDataSettings =
          settings.readTensorboardTimeSeriesDataSettings.toBuilder();
      readTensorboardBlobDataSettings = settings.readTensorboardBlobDataSettings.toBuilder();
      writeTensorboardRunDataSettings = settings.writeTensorboardRunDataSettings.toBuilder();
      exportTensorboardTimeSeriesDataSettings =
          settings.exportTensorboardTimeSeriesDataSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createTensorboardSettings,
              getTensorboardSettings,
              updateTensorboardSettings,
              listTensorboardsSettings,
              deleteTensorboardSettings,
              createTensorboardExperimentSettings,
              getTensorboardExperimentSettings,
              updateTensorboardExperimentSettings,
              listTensorboardExperimentsSettings,
              deleteTensorboardExperimentSettings,
              createTensorboardRunSettings,
              getTensorboardRunSettings,
              updateTensorboardRunSettings,
              listTensorboardRunsSettings,
              deleteTensorboardRunSettings,
              createTensorboardTimeSeriesSettings,
              getTensorboardTimeSeriesSettings,
              updateTensorboardTimeSeriesSettings,
              listTensorboardTimeSeriesSettings,
              deleteTensorboardTimeSeriesSettings,
              readTensorboardTimeSeriesDataSettings,
              writeTensorboardRunDataSettings,
              exportTensorboardTimeSeriesDataSettings);
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
          .createTensorboardSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getTensorboardSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateTensorboardSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listTensorboardsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteTensorboardSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createTensorboardExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getTensorboardExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateTensorboardExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listTensorboardExperimentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteTensorboardExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createTensorboardRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getTensorboardRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateTensorboardRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listTensorboardRunsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteTensorboardRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createTensorboardTimeSeriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getTensorboardTimeSeriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateTensorboardTimeSeriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listTensorboardTimeSeriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteTensorboardTimeSeriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .readTensorboardTimeSeriesDataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .readTensorboardBlobDataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .writeTensorboardRunDataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .exportTensorboardTimeSeriesDataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createTensorboardOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateTensorboardRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Tensorboard.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  CreateTensorboardOperationMetadata.class))
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
          .updateTensorboardOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateTensorboardRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Tensorboard.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  UpdateTensorboardOperationMetadata.class))
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
          .deleteTensorboardOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteTensorboardRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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

      builder
          .deleteTensorboardExperimentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteTensorboardExperimentRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
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

      builder
          .deleteTensorboardRunOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteTensorboardRunRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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

      builder
          .deleteTensorboardTimeSeriesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteTensorboardTimeSeriesRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
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

    /** Returns the builder for the settings used for calls to createTensorboard. */
    public UnaryCallSettings.Builder<CreateTensorboardRequest, Operation>
        createTensorboardSettings() {
      return createTensorboardSettings;
    }

    /** Returns the builder for the settings used for calls to createTensorboard. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CreateTensorboardRequest, Tensorboard, CreateTensorboardOperationMetadata>
        createTensorboardOperationSettings() {
      return createTensorboardOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getTensorboard. */
    public UnaryCallSettings.Builder<GetTensorboardRequest, Tensorboard> getTensorboardSettings() {
      return getTensorboardSettings;
    }

    /** Returns the builder for the settings used for calls to updateTensorboard. */
    public UnaryCallSettings.Builder<UpdateTensorboardRequest, Operation>
        updateTensorboardSettings() {
      return updateTensorboardSettings;
    }

    /** Returns the builder for the settings used for calls to updateTensorboard. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UpdateTensorboardRequest, Tensorboard, UpdateTensorboardOperationMetadata>
        updateTensorboardOperationSettings() {
      return updateTensorboardOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listTensorboards. */
    public PagedCallSettings.Builder<
            ListTensorboardsRequest, ListTensorboardsResponse, ListTensorboardsPagedResponse>
        listTensorboardsSettings() {
      return listTensorboardsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTensorboard. */
    public UnaryCallSettings.Builder<DeleteTensorboardRequest, Operation>
        deleteTensorboardSettings() {
      return deleteTensorboardSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTensorboard. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteTensorboardRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardOperationSettings() {
      return deleteTensorboardOperationSettings;
    }

    /** Returns the builder for the settings used for calls to createTensorboardExperiment. */
    public UnaryCallSettings.Builder<CreateTensorboardExperimentRequest, TensorboardExperiment>
        createTensorboardExperimentSettings() {
      return createTensorboardExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to getTensorboardExperiment. */
    public UnaryCallSettings.Builder<GetTensorboardExperimentRequest, TensorboardExperiment>
        getTensorboardExperimentSettings() {
      return getTensorboardExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to updateTensorboardExperiment. */
    public UnaryCallSettings.Builder<UpdateTensorboardExperimentRequest, TensorboardExperiment>
        updateTensorboardExperimentSettings() {
      return updateTensorboardExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to listTensorboardExperiments. */
    public PagedCallSettings.Builder<
            ListTensorboardExperimentsRequest,
            ListTensorboardExperimentsResponse,
            ListTensorboardExperimentsPagedResponse>
        listTensorboardExperimentsSettings() {
      return listTensorboardExperimentsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardExperiment. */
    public UnaryCallSettings.Builder<DeleteTensorboardExperimentRequest, Operation>
        deleteTensorboardExperimentSettings() {
      return deleteTensorboardExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardExperiment. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteTensorboardExperimentRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardExperimentOperationSettings() {
      return deleteTensorboardExperimentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to createTensorboardRun. */
    public UnaryCallSettings.Builder<CreateTensorboardRunRequest, TensorboardRun>
        createTensorboardRunSettings() {
      return createTensorboardRunSettings;
    }

    /** Returns the builder for the settings used for calls to getTensorboardRun. */
    public UnaryCallSettings.Builder<GetTensorboardRunRequest, TensorboardRun>
        getTensorboardRunSettings() {
      return getTensorboardRunSettings;
    }

    /** Returns the builder for the settings used for calls to updateTensorboardRun. */
    public UnaryCallSettings.Builder<UpdateTensorboardRunRequest, TensorboardRun>
        updateTensorboardRunSettings() {
      return updateTensorboardRunSettings;
    }

    /** Returns the builder for the settings used for calls to listTensorboardRuns. */
    public PagedCallSettings.Builder<
            ListTensorboardRunsRequest,
            ListTensorboardRunsResponse,
            ListTensorboardRunsPagedResponse>
        listTensorboardRunsSettings() {
      return listTensorboardRunsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardRun. */
    public UnaryCallSettings.Builder<DeleteTensorboardRunRequest, Operation>
        deleteTensorboardRunSettings() {
      return deleteTensorboardRunSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardRun. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteTensorboardRunRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardRunOperationSettings() {
      return deleteTensorboardRunOperationSettings;
    }

    /** Returns the builder for the settings used for calls to createTensorboardTimeSeries. */
    public UnaryCallSettings.Builder<CreateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
        createTensorboardTimeSeriesSettings() {
      return createTensorboardTimeSeriesSettings;
    }

    /** Returns the builder for the settings used for calls to getTensorboardTimeSeries. */
    public UnaryCallSettings.Builder<GetTensorboardTimeSeriesRequest, TensorboardTimeSeries>
        getTensorboardTimeSeriesSettings() {
      return getTensorboardTimeSeriesSettings;
    }

    /** Returns the builder for the settings used for calls to updateTensorboardTimeSeries. */
    public UnaryCallSettings.Builder<UpdateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
        updateTensorboardTimeSeriesSettings() {
      return updateTensorboardTimeSeriesSettings;
    }

    /** Returns the builder for the settings used for calls to listTensorboardTimeSeries. */
    public PagedCallSettings.Builder<
            ListTensorboardTimeSeriesRequest,
            ListTensorboardTimeSeriesResponse,
            ListTensorboardTimeSeriesPagedResponse>
        listTensorboardTimeSeriesSettings() {
      return listTensorboardTimeSeriesSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardTimeSeries. */
    public UnaryCallSettings.Builder<DeleteTensorboardTimeSeriesRequest, Operation>
        deleteTensorboardTimeSeriesSettings() {
      return deleteTensorboardTimeSeriesSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardTimeSeries. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteTensorboardTimeSeriesRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardTimeSeriesOperationSettings() {
      return deleteTensorboardTimeSeriesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to readTensorboardTimeSeriesData. */
    public UnaryCallSettings.Builder<
            ReadTensorboardTimeSeriesDataRequest, ReadTensorboardTimeSeriesDataResponse>
        readTensorboardTimeSeriesDataSettings() {
      return readTensorboardTimeSeriesDataSettings;
    }

    /** Returns the builder for the settings used for calls to readTensorboardBlobData. */
    public ServerStreamingCallSettings.Builder<
            ReadTensorboardBlobDataRequest, ReadTensorboardBlobDataResponse>
        readTensorboardBlobDataSettings() {
      return readTensorboardBlobDataSettings;
    }

    /** Returns the builder for the settings used for calls to writeTensorboardRunData. */
    public UnaryCallSettings.Builder<
            WriteTensorboardRunDataRequest, WriteTensorboardRunDataResponse>
        writeTensorboardRunDataSettings() {
      return writeTensorboardRunDataSettings;
    }

    /** Returns the builder for the settings used for calls to exportTensorboardTimeSeriesData. */
    public PagedCallSettings.Builder<
            ExportTensorboardTimeSeriesDataRequest,
            ExportTensorboardTimeSeriesDataResponse,
            ExportTensorboardTimeSeriesDataPagedResponse>
        exportTensorboardTimeSeriesDataSettings() {
      return exportTensorboardTimeSeriesDataSettings;
    }

    @Override
    public TensorboardServiceStubSettings build() throws IOException {
      return new TensorboardServiceStubSettings(this);
    }
  }
}
