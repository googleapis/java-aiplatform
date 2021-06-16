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

import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ExportTensorboardTimeSeriesDataPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ListTensorboardExperimentsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ListTensorboardRunsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ListTensorboardTimeSeriesPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient.ListTensorboardsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.ServerStreamingCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.aiplatform.v1beta1.stub.TensorboardServiceStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link TensorboardServiceClient}.
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
 * <p>For example, to set the total timeout of getTensorboard to 30 seconds:
 *
 * <pre>{@code
 * TensorboardServiceSettings.Builder tensorboardServiceSettingsBuilder =
 *     TensorboardServiceSettings.newBuilder();
 * tensorboardServiceSettingsBuilder
 *     .getTensorboardSettings()
 *     .setRetrySettings(
 *         tensorboardServiceSettingsBuilder
 *             .getTensorboardSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * TensorboardServiceSettings tensorboardServiceSettings =
 *     tensorboardServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class TensorboardServiceSettings extends ClientSettings<TensorboardServiceSettings> {

  /** Returns the object with the settings used for calls to createTensorboard. */
  public UnaryCallSettings<CreateTensorboardRequest, Operation> createTensorboardSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).createTensorboardSettings();
  }

  /** Returns the object with the settings used for calls to createTensorboard. */
  public OperationCallSettings<
          CreateTensorboardRequest, Tensorboard, CreateTensorboardOperationMetadata>
      createTensorboardOperationSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .createTensorboardOperationSettings();
  }

  /** Returns the object with the settings used for calls to getTensorboard. */
  public UnaryCallSettings<GetTensorboardRequest, Tensorboard> getTensorboardSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).getTensorboardSettings();
  }

  /** Returns the object with the settings used for calls to updateTensorboard. */
  public UnaryCallSettings<UpdateTensorboardRequest, Operation> updateTensorboardSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).updateTensorboardSettings();
  }

  /** Returns the object with the settings used for calls to updateTensorboard. */
  public OperationCallSettings<
          UpdateTensorboardRequest, Tensorboard, UpdateTensorboardOperationMetadata>
      updateTensorboardOperationSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .updateTensorboardOperationSettings();
  }

  /** Returns the object with the settings used for calls to listTensorboards. */
  public PagedCallSettings<
          ListTensorboardsRequest, ListTensorboardsResponse, ListTensorboardsPagedResponse>
      listTensorboardsSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).listTensorboardsSettings();
  }

  /** Returns the object with the settings used for calls to deleteTensorboard. */
  public UnaryCallSettings<DeleteTensorboardRequest, Operation> deleteTensorboardSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).deleteTensorboardSettings();
  }

  /** Returns the object with the settings used for calls to deleteTensorboard. */
  public OperationCallSettings<DeleteTensorboardRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardOperationSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .deleteTensorboardOperationSettings();
  }

  /** Returns the object with the settings used for calls to createTensorboardExperiment. */
  public UnaryCallSettings<CreateTensorboardExperimentRequest, TensorboardExperiment>
      createTensorboardExperimentSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .createTensorboardExperimentSettings();
  }

  /** Returns the object with the settings used for calls to getTensorboardExperiment. */
  public UnaryCallSettings<GetTensorboardExperimentRequest, TensorboardExperiment>
      getTensorboardExperimentSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).getTensorboardExperimentSettings();
  }

  /** Returns the object with the settings used for calls to updateTensorboardExperiment. */
  public UnaryCallSettings<UpdateTensorboardExperimentRequest, TensorboardExperiment>
      updateTensorboardExperimentSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .updateTensorboardExperimentSettings();
  }

  /** Returns the object with the settings used for calls to listTensorboardExperiments. */
  public PagedCallSettings<
          ListTensorboardExperimentsRequest, ListTensorboardExperimentsResponse,
          ListTensorboardExperimentsPagedResponse>
      listTensorboardExperimentsSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .listTensorboardExperimentsSettings();
  }

  /** Returns the object with the settings used for calls to deleteTensorboardExperiment. */
  public UnaryCallSettings<DeleteTensorboardExperimentRequest, Operation>
      deleteTensorboardExperimentSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .deleteTensorboardExperimentSettings();
  }

  /** Returns the object with the settings used for calls to deleteTensorboardExperiment. */
  public OperationCallSettings<DeleteTensorboardExperimentRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardExperimentOperationSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .deleteTensorboardExperimentOperationSettings();
  }

  /** Returns the object with the settings used for calls to createTensorboardRun. */
  public UnaryCallSettings<CreateTensorboardRunRequest, TensorboardRun>
      createTensorboardRunSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).createTensorboardRunSettings();
  }

  /** Returns the object with the settings used for calls to getTensorboardRun. */
  public UnaryCallSettings<GetTensorboardRunRequest, TensorboardRun> getTensorboardRunSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).getTensorboardRunSettings();
  }

  /** Returns the object with the settings used for calls to updateTensorboardRun. */
  public UnaryCallSettings<UpdateTensorboardRunRequest, TensorboardRun>
      updateTensorboardRunSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).updateTensorboardRunSettings();
  }

  /** Returns the object with the settings used for calls to listTensorboardRuns. */
  public PagedCallSettings<
          ListTensorboardRunsRequest, ListTensorboardRunsResponse, ListTensorboardRunsPagedResponse>
      listTensorboardRunsSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).listTensorboardRunsSettings();
  }

  /** Returns the object with the settings used for calls to deleteTensorboardRun. */
  public UnaryCallSettings<DeleteTensorboardRunRequest, Operation> deleteTensorboardRunSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).deleteTensorboardRunSettings();
  }

  /** Returns the object with the settings used for calls to deleteTensorboardRun. */
  public OperationCallSettings<DeleteTensorboardRunRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardRunOperationSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .deleteTensorboardRunOperationSettings();
  }

  /** Returns the object with the settings used for calls to createTensorboardTimeSeries. */
  public UnaryCallSettings<CreateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      createTensorboardTimeSeriesSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .createTensorboardTimeSeriesSettings();
  }

  /** Returns the object with the settings used for calls to getTensorboardTimeSeries. */
  public UnaryCallSettings<GetTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      getTensorboardTimeSeriesSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).getTensorboardTimeSeriesSettings();
  }

  /** Returns the object with the settings used for calls to updateTensorboardTimeSeries. */
  public UnaryCallSettings<UpdateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      updateTensorboardTimeSeriesSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .updateTensorboardTimeSeriesSettings();
  }

  /** Returns the object with the settings used for calls to listTensorboardTimeSeries. */
  public PagedCallSettings<
          ListTensorboardTimeSeriesRequest, ListTensorboardTimeSeriesResponse,
          ListTensorboardTimeSeriesPagedResponse>
      listTensorboardTimeSeriesSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).listTensorboardTimeSeriesSettings();
  }

  /** Returns the object with the settings used for calls to deleteTensorboardTimeSeries. */
  public UnaryCallSettings<DeleteTensorboardTimeSeriesRequest, Operation>
      deleteTensorboardTimeSeriesSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .deleteTensorboardTimeSeriesSettings();
  }

  /** Returns the object with the settings used for calls to deleteTensorboardTimeSeries. */
  public OperationCallSettings<DeleteTensorboardTimeSeriesRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardTimeSeriesOperationSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .deleteTensorboardTimeSeriesOperationSettings();
  }

  /** Returns the object with the settings used for calls to readTensorboardTimeSeriesData. */
  public UnaryCallSettings<
          ReadTensorboardTimeSeriesDataRequest, ReadTensorboardTimeSeriesDataResponse>
      readTensorboardTimeSeriesDataSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .readTensorboardTimeSeriesDataSettings();
  }

  /** Returns the object with the settings used for calls to readTensorboardBlobData. */
  public ServerStreamingCallSettings<
          ReadTensorboardBlobDataRequest, ReadTensorboardBlobDataResponse>
      readTensorboardBlobDataSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).readTensorboardBlobDataSettings();
  }

  /** Returns the object with the settings used for calls to writeTensorboardRunData. */
  public UnaryCallSettings<WriteTensorboardRunDataRequest, WriteTensorboardRunDataResponse>
      writeTensorboardRunDataSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings()).writeTensorboardRunDataSettings();
  }

  /** Returns the object with the settings used for calls to exportTensorboardTimeSeriesData. */
  public PagedCallSettings<
          ExportTensorboardTimeSeriesDataRequest, ExportTensorboardTimeSeriesDataResponse,
          ExportTensorboardTimeSeriesDataPagedResponse>
      exportTensorboardTimeSeriesDataSettings() {
    return ((TensorboardServiceStubSettings) getStubSettings())
        .exportTensorboardTimeSeriesDataSettings();
  }

  public static final TensorboardServiceSettings create(TensorboardServiceStubSettings stub)
      throws IOException {
    return new TensorboardServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return TensorboardServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return TensorboardServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return TensorboardServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return TensorboardServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return TensorboardServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return TensorboardServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return TensorboardServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected TensorboardServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for TensorboardServiceSettings. */
  public static class Builder extends ClientSettings.Builder<TensorboardServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(TensorboardServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(TensorboardServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(TensorboardServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(TensorboardServiceStubSettings.newBuilder());
    }

    public TensorboardServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((TensorboardServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createTensorboard. */
    public UnaryCallSettings.Builder<CreateTensorboardRequest, Operation>
        createTensorboardSettings() {
      return getStubSettingsBuilder().createTensorboardSettings();
    }

    /** Returns the builder for the settings used for calls to createTensorboard. */
    public OperationCallSettings.Builder<
            CreateTensorboardRequest, Tensorboard, CreateTensorboardOperationMetadata>
        createTensorboardOperationSettings() {
      return getStubSettingsBuilder().createTensorboardOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getTensorboard. */
    public UnaryCallSettings.Builder<GetTensorboardRequest, Tensorboard> getTensorboardSettings() {
      return getStubSettingsBuilder().getTensorboardSettings();
    }

    /** Returns the builder for the settings used for calls to updateTensorboard. */
    public UnaryCallSettings.Builder<UpdateTensorboardRequest, Operation>
        updateTensorboardSettings() {
      return getStubSettingsBuilder().updateTensorboardSettings();
    }

    /** Returns the builder for the settings used for calls to updateTensorboard. */
    public OperationCallSettings.Builder<
            UpdateTensorboardRequest, Tensorboard, UpdateTensorboardOperationMetadata>
        updateTensorboardOperationSettings() {
      return getStubSettingsBuilder().updateTensorboardOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listTensorboards. */
    public PagedCallSettings.Builder<
            ListTensorboardsRequest, ListTensorboardsResponse, ListTensorboardsPagedResponse>
        listTensorboardsSettings() {
      return getStubSettingsBuilder().listTensorboardsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTensorboard. */
    public UnaryCallSettings.Builder<DeleteTensorboardRequest, Operation>
        deleteTensorboardSettings() {
      return getStubSettingsBuilder().deleteTensorboardSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTensorboard. */
    public OperationCallSettings.Builder<DeleteTensorboardRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardOperationSettings() {
      return getStubSettingsBuilder().deleteTensorboardOperationSettings();
    }

    /** Returns the builder for the settings used for calls to createTensorboardExperiment. */
    public UnaryCallSettings.Builder<CreateTensorboardExperimentRequest, TensorboardExperiment>
        createTensorboardExperimentSettings() {
      return getStubSettingsBuilder().createTensorboardExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to getTensorboardExperiment. */
    public UnaryCallSettings.Builder<GetTensorboardExperimentRequest, TensorboardExperiment>
        getTensorboardExperimentSettings() {
      return getStubSettingsBuilder().getTensorboardExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to updateTensorboardExperiment. */
    public UnaryCallSettings.Builder<UpdateTensorboardExperimentRequest, TensorboardExperiment>
        updateTensorboardExperimentSettings() {
      return getStubSettingsBuilder().updateTensorboardExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to listTensorboardExperiments. */
    public PagedCallSettings.Builder<
            ListTensorboardExperimentsRequest, ListTensorboardExperimentsResponse,
            ListTensorboardExperimentsPagedResponse>
        listTensorboardExperimentsSettings() {
      return getStubSettingsBuilder().listTensorboardExperimentsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardExperiment. */
    public UnaryCallSettings.Builder<DeleteTensorboardExperimentRequest, Operation>
        deleteTensorboardExperimentSettings() {
      return getStubSettingsBuilder().deleteTensorboardExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardExperiment. */
    public OperationCallSettings.Builder<
            DeleteTensorboardExperimentRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardExperimentOperationSettings() {
      return getStubSettingsBuilder().deleteTensorboardExperimentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to createTensorboardRun. */
    public UnaryCallSettings.Builder<CreateTensorboardRunRequest, TensorboardRun>
        createTensorboardRunSettings() {
      return getStubSettingsBuilder().createTensorboardRunSettings();
    }

    /** Returns the builder for the settings used for calls to getTensorboardRun. */
    public UnaryCallSettings.Builder<GetTensorboardRunRequest, TensorboardRun>
        getTensorboardRunSettings() {
      return getStubSettingsBuilder().getTensorboardRunSettings();
    }

    /** Returns the builder for the settings used for calls to updateTensorboardRun. */
    public UnaryCallSettings.Builder<UpdateTensorboardRunRequest, TensorboardRun>
        updateTensorboardRunSettings() {
      return getStubSettingsBuilder().updateTensorboardRunSettings();
    }

    /** Returns the builder for the settings used for calls to listTensorboardRuns. */
    public PagedCallSettings.Builder<
            ListTensorboardRunsRequest, ListTensorboardRunsResponse,
            ListTensorboardRunsPagedResponse>
        listTensorboardRunsSettings() {
      return getStubSettingsBuilder().listTensorboardRunsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardRun. */
    public UnaryCallSettings.Builder<DeleteTensorboardRunRequest, Operation>
        deleteTensorboardRunSettings() {
      return getStubSettingsBuilder().deleteTensorboardRunSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardRun. */
    public OperationCallSettings.Builder<
            DeleteTensorboardRunRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardRunOperationSettings() {
      return getStubSettingsBuilder().deleteTensorboardRunOperationSettings();
    }

    /** Returns the builder for the settings used for calls to createTensorboardTimeSeries. */
    public UnaryCallSettings.Builder<CreateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
        createTensorboardTimeSeriesSettings() {
      return getStubSettingsBuilder().createTensorboardTimeSeriesSettings();
    }

    /** Returns the builder for the settings used for calls to getTensorboardTimeSeries. */
    public UnaryCallSettings.Builder<GetTensorboardTimeSeriesRequest, TensorboardTimeSeries>
        getTensorboardTimeSeriesSettings() {
      return getStubSettingsBuilder().getTensorboardTimeSeriesSettings();
    }

    /** Returns the builder for the settings used for calls to updateTensorboardTimeSeries. */
    public UnaryCallSettings.Builder<UpdateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
        updateTensorboardTimeSeriesSettings() {
      return getStubSettingsBuilder().updateTensorboardTimeSeriesSettings();
    }

    /** Returns the builder for the settings used for calls to listTensorboardTimeSeries. */
    public PagedCallSettings.Builder<
            ListTensorboardTimeSeriesRequest, ListTensorboardTimeSeriesResponse,
            ListTensorboardTimeSeriesPagedResponse>
        listTensorboardTimeSeriesSettings() {
      return getStubSettingsBuilder().listTensorboardTimeSeriesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardTimeSeries. */
    public UnaryCallSettings.Builder<DeleteTensorboardTimeSeriesRequest, Operation>
        deleteTensorboardTimeSeriesSettings() {
      return getStubSettingsBuilder().deleteTensorboardTimeSeriesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTensorboardTimeSeries. */
    public OperationCallSettings.Builder<
            DeleteTensorboardTimeSeriesRequest, Empty, DeleteOperationMetadata>
        deleteTensorboardTimeSeriesOperationSettings() {
      return getStubSettingsBuilder().deleteTensorboardTimeSeriesOperationSettings();
    }

    /** Returns the builder for the settings used for calls to readTensorboardTimeSeriesData. */
    public UnaryCallSettings.Builder<
            ReadTensorboardTimeSeriesDataRequest, ReadTensorboardTimeSeriesDataResponse>
        readTensorboardTimeSeriesDataSettings() {
      return getStubSettingsBuilder().readTensorboardTimeSeriesDataSettings();
    }

    /** Returns the builder for the settings used for calls to readTensorboardBlobData. */
    public ServerStreamingCallSettings.Builder<
            ReadTensorboardBlobDataRequest, ReadTensorboardBlobDataResponse>
        readTensorboardBlobDataSettings() {
      return getStubSettingsBuilder().readTensorboardBlobDataSettings();
    }

    /** Returns the builder for the settings used for calls to writeTensorboardRunData. */
    public UnaryCallSettings.Builder<
            WriteTensorboardRunDataRequest, WriteTensorboardRunDataResponse>
        writeTensorboardRunDataSettings() {
      return getStubSettingsBuilder().writeTensorboardRunDataSettings();
    }

    /** Returns the builder for the settings used for calls to exportTensorboardTimeSeriesData. */
    public PagedCallSettings.Builder<
            ExportTensorboardTimeSeriesDataRequest, ExportTensorboardTimeSeriesDataResponse,
            ExportTensorboardTimeSeriesDataPagedResponse>
        exportTensorboardTimeSeriesDataSettings() {
      return getStubSettingsBuilder().exportTensorboardTimeSeriesDataSettings();
    }

    @Override
    public TensorboardServiceSettings build() throws IOException {
      return new TensorboardServiceSettings(this);
    }
  }
}
