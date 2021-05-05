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

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.ServerStreamingCallable;
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
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardExperimentRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardRunRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateTensorboardTimeSeriesRequest;
import com.google.cloud.aiplatform.v1beta1.WriteTensorboardRunDataRequest;
import com.google.cloud.aiplatform.v1beta1.WriteTensorboardRunDataResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the TensorboardService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class TensorboardServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public OperationCallable<
          CreateTensorboardRequest, Tensorboard, CreateTensorboardOperationMetadata>
      createTensorboardOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createTensorboardOperationCallable()");
  }

  public UnaryCallable<CreateTensorboardRequest, Operation> createTensorboardCallable() {
    throw new UnsupportedOperationException("Not implemented: createTensorboardCallable()");
  }

  public UnaryCallable<GetTensorboardRequest, Tensorboard> getTensorboardCallable() {
    throw new UnsupportedOperationException("Not implemented: getTensorboardCallable()");
  }

  public OperationCallable<
          UpdateTensorboardRequest, Tensorboard, UpdateTensorboardOperationMetadata>
      updateTensorboardOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateTensorboardOperationCallable()");
  }

  public UnaryCallable<UpdateTensorboardRequest, Operation> updateTensorboardCallable() {
    throw new UnsupportedOperationException("Not implemented: updateTensorboardCallable()");
  }

  public UnaryCallable<ListTensorboardsRequest, ListTensorboardsPagedResponse>
      listTensorboardsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTensorboardsPagedCallable()");
  }

  public UnaryCallable<ListTensorboardsRequest, ListTensorboardsResponse>
      listTensorboardsCallable() {
    throw new UnsupportedOperationException("Not implemented: listTensorboardsCallable()");
  }

  public OperationCallable<DeleteTensorboardRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTensorboardOperationCallable()");
  }

  public UnaryCallable<DeleteTensorboardRequest, Operation> deleteTensorboardCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTensorboardCallable()");
  }

  public UnaryCallable<CreateTensorboardExperimentRequest, TensorboardExperiment>
      createTensorboardExperimentCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createTensorboardExperimentCallable()");
  }

  public UnaryCallable<GetTensorboardExperimentRequest, TensorboardExperiment>
      getTensorboardExperimentCallable() {
    throw new UnsupportedOperationException("Not implemented: getTensorboardExperimentCallable()");
  }

  public UnaryCallable<UpdateTensorboardExperimentRequest, TensorboardExperiment>
      updateTensorboardExperimentCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateTensorboardExperimentCallable()");
  }

  public UnaryCallable<ListTensorboardExperimentsRequest, ListTensorboardExperimentsPagedResponse>
      listTensorboardExperimentsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listTensorboardExperimentsPagedCallable()");
  }

  public UnaryCallable<ListTensorboardExperimentsRequest, ListTensorboardExperimentsResponse>
      listTensorboardExperimentsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listTensorboardExperimentsCallable()");
  }

  public OperationCallable<DeleteTensorboardExperimentRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardExperimentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTensorboardExperimentOperationCallable()");
  }

  public UnaryCallable<DeleteTensorboardExperimentRequest, Operation>
      deleteTensorboardExperimentCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTensorboardExperimentCallable()");
  }

  public UnaryCallable<CreateTensorboardRunRequest, TensorboardRun> createTensorboardRunCallable() {
    throw new UnsupportedOperationException("Not implemented: createTensorboardRunCallable()");
  }

  public UnaryCallable<GetTensorboardRunRequest, TensorboardRun> getTensorboardRunCallable() {
    throw new UnsupportedOperationException("Not implemented: getTensorboardRunCallable()");
  }

  public UnaryCallable<UpdateTensorboardRunRequest, TensorboardRun> updateTensorboardRunCallable() {
    throw new UnsupportedOperationException("Not implemented: updateTensorboardRunCallable()");
  }

  public UnaryCallable<ListTensorboardRunsRequest, ListTensorboardRunsPagedResponse>
      listTensorboardRunsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTensorboardRunsPagedCallable()");
  }

  public UnaryCallable<ListTensorboardRunsRequest, ListTensorboardRunsResponse>
      listTensorboardRunsCallable() {
    throw new UnsupportedOperationException("Not implemented: listTensorboardRunsCallable()");
  }

  public OperationCallable<DeleteTensorboardRunRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardRunOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTensorboardRunOperationCallable()");
  }

  public UnaryCallable<DeleteTensorboardRunRequest, Operation> deleteTensorboardRunCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTensorboardRunCallable()");
  }

  public UnaryCallable<CreateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      createTensorboardTimeSeriesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createTensorboardTimeSeriesCallable()");
  }

  public UnaryCallable<GetTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      getTensorboardTimeSeriesCallable() {
    throw new UnsupportedOperationException("Not implemented: getTensorboardTimeSeriesCallable()");
  }

  public UnaryCallable<UpdateTensorboardTimeSeriesRequest, TensorboardTimeSeries>
      updateTensorboardTimeSeriesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateTensorboardTimeSeriesCallable()");
  }

  public UnaryCallable<ListTensorboardTimeSeriesRequest, ListTensorboardTimeSeriesPagedResponse>
      listTensorboardTimeSeriesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listTensorboardTimeSeriesPagedCallable()");
  }

  public UnaryCallable<ListTensorboardTimeSeriesRequest, ListTensorboardTimeSeriesResponse>
      listTensorboardTimeSeriesCallable() {
    throw new UnsupportedOperationException("Not implemented: listTensorboardTimeSeriesCallable()");
  }

  public OperationCallable<DeleteTensorboardTimeSeriesRequest, Empty, DeleteOperationMetadata>
      deleteTensorboardTimeSeriesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTensorboardTimeSeriesOperationCallable()");
  }

  public UnaryCallable<DeleteTensorboardTimeSeriesRequest, Operation>
      deleteTensorboardTimeSeriesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTensorboardTimeSeriesCallable()");
  }

  public UnaryCallable<ReadTensorboardTimeSeriesDataRequest, ReadTensorboardTimeSeriesDataResponse>
      readTensorboardTimeSeriesDataCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: readTensorboardTimeSeriesDataCallable()");
  }

  public ServerStreamingCallable<ReadTensorboardBlobDataRequest, ReadTensorboardBlobDataResponse>
      readTensorboardBlobDataCallable() {
    throw new UnsupportedOperationException("Not implemented: readTensorboardBlobDataCallable()");
  }

  public UnaryCallable<WriteTensorboardRunDataRequest, WriteTensorboardRunDataResponse>
      writeTensorboardRunDataCallable() {
    throw new UnsupportedOperationException("Not implemented: writeTensorboardRunDataCallable()");
  }

  public UnaryCallable<
          ExportTensorboardTimeSeriesDataRequest, ExportTensorboardTimeSeriesDataPagedResponse>
      exportTensorboardTimeSeriesDataPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: exportTensorboardTimeSeriesDataPagedCallable()");
  }

  public UnaryCallable<
          ExportTensorboardTimeSeriesDataRequest, ExportTensorboardTimeSeriesDataResponse>
      exportTensorboardTimeSeriesDataCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: exportTensorboardTimeSeriesDataCallable()");
  }

  @Override
  public abstract void close();
}
