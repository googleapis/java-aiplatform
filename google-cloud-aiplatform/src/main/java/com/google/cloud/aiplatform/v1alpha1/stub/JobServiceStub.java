/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.aiplatform.v1alpha1.stub;

import static com.google.cloud.aiplatform.v1alpha1.JobServiceClient.ListBatchPredictionJobsPagedResponse;
import static com.google.cloud.aiplatform.v1alpha1.JobServiceClient.ListCustomJobsPagedResponse;
import static com.google.cloud.aiplatform.v1alpha1.JobServiceClient.ListHyperparameterTuningJobsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob;
import com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest;
import com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest;
import com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest;
import com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest;
import com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest;
import com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest;
import com.google.cloud.aiplatform.v1alpha1.CustomJob;
import com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest;
import com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest;
import com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest;
import com.google.cloud.aiplatform.v1alpha1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest;
import com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest;
import com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest;
import com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob;
import com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest;
import com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse;
import com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest;
import com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse;
import com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest;
import com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Cloud AI Platform API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class JobServiceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<CreateCustomJobRequest, CustomJob> createCustomJobCallable() {
    throw new UnsupportedOperationException("Not implemented: createCustomJobCallable()");
  }

  public UnaryCallable<GetCustomJobRequest, CustomJob> getCustomJobCallable() {
    throw new UnsupportedOperationException("Not implemented: getCustomJobCallable()");
  }

  public UnaryCallable<ListCustomJobsRequest, ListCustomJobsPagedResponse>
      listCustomJobsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listCustomJobsPagedCallable()");
  }

  public UnaryCallable<ListCustomJobsRequest, ListCustomJobsResponse> listCustomJobsCallable() {
    throw new UnsupportedOperationException("Not implemented: listCustomJobsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteCustomJobRequest, Empty, DeleteOperationMetadata>
      deleteCustomJobOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCustomJobOperationCallable()");
  }

  public UnaryCallable<DeleteCustomJobRequest, Operation> deleteCustomJobCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCustomJobCallable()");
  }

  public UnaryCallable<CancelCustomJobRequest, Empty> cancelCustomJobCallable() {
    throw new UnsupportedOperationException("Not implemented: cancelCustomJobCallable()");
  }

  public UnaryCallable<CreateHyperparameterTuningJobRequest, HyperparameterTuningJob>
      createHyperparameterTuningJobCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createHyperparameterTuningJobCallable()");
  }

  public UnaryCallable<GetHyperparameterTuningJobRequest, HyperparameterTuningJob>
      getHyperparameterTuningJobCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: getHyperparameterTuningJobCallable()");
  }

  public UnaryCallable<
          ListHyperparameterTuningJobsRequest, ListHyperparameterTuningJobsPagedResponse>
      listHyperparameterTuningJobsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listHyperparameterTuningJobsPagedCallable()");
  }

  public UnaryCallable<ListHyperparameterTuningJobsRequest, ListHyperparameterTuningJobsResponse>
      listHyperparameterTuningJobsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listHyperparameterTuningJobsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteHyperparameterTuningJobRequest, Empty, DeleteOperationMetadata>
      deleteHyperparameterTuningJobOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteHyperparameterTuningJobOperationCallable()");
  }

  public UnaryCallable<DeleteHyperparameterTuningJobRequest, Operation>
      deleteHyperparameterTuningJobCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteHyperparameterTuningJobCallable()");
  }

  public UnaryCallable<CancelHyperparameterTuningJobRequest, Empty>
      cancelHyperparameterTuningJobCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: cancelHyperparameterTuningJobCallable()");
  }

  public UnaryCallable<CreateBatchPredictionJobRequest, BatchPredictionJob>
      createBatchPredictionJobCallable() {
    throw new UnsupportedOperationException("Not implemented: createBatchPredictionJobCallable()");
  }

  public UnaryCallable<GetBatchPredictionJobRequest, BatchPredictionJob>
      getBatchPredictionJobCallable() {
    throw new UnsupportedOperationException("Not implemented: getBatchPredictionJobCallable()");
  }

  public UnaryCallable<ListBatchPredictionJobsRequest, ListBatchPredictionJobsPagedResponse>
      listBatchPredictionJobsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listBatchPredictionJobsPagedCallable()");
  }

  public UnaryCallable<ListBatchPredictionJobsRequest, ListBatchPredictionJobsResponse>
      listBatchPredictionJobsCallable() {
    throw new UnsupportedOperationException("Not implemented: listBatchPredictionJobsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteBatchPredictionJobRequest, Empty, DeleteOperationMetadata>
      deleteBatchPredictionJobOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteBatchPredictionJobOperationCallable()");
  }

  public UnaryCallable<DeleteBatchPredictionJobRequest, Operation>
      deleteBatchPredictionJobCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteBatchPredictionJobCallable()");
  }

  public UnaryCallable<CancelBatchPredictionJobRequest, Empty> cancelBatchPredictionJobCallable() {
    throw new UnsupportedOperationException("Not implemented: cancelBatchPredictionJobCallable()");
  }

  @Override
  public abstract void close();
}
