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

import static com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient.ListEntityTypesPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient.ListFeaturesPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient.ListFeaturestoresPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient.SearchFeaturesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesRequest;
import com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse;
import com.google.cloud.aiplatform.v1beta1.BatchReadFeatureValuesOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.BatchReadFeatureValuesRequest;
import com.google.cloud.aiplatform.v1beta1.BatchReadFeatureValuesResponse;
import com.google.cloud.aiplatform.v1beta1.CreateEntityTypeOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest;
import com.google.cloud.aiplatform.v1beta1.CreateFeatureOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateFeatureRequest;
import com.google.cloud.aiplatform.v1beta1.CreateFeaturestoreOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateFeaturestoreRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteEntityTypeRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteFeatureRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteFeaturestoreRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.EntityType;
import com.google.cloud.aiplatform.v1beta1.ExportFeatureValuesOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.ExportFeatureValuesRequest;
import com.google.cloud.aiplatform.v1beta1.ExportFeatureValuesResponse;
import com.google.cloud.aiplatform.v1beta1.Feature;
import com.google.cloud.aiplatform.v1beta1.Featurestore;
import com.google.cloud.aiplatform.v1beta1.GetEntityTypeRequest;
import com.google.cloud.aiplatform.v1beta1.GetFeatureRequest;
import com.google.cloud.aiplatform.v1beta1.GetFeaturestoreRequest;
import com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesRequest;
import com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse;
import com.google.cloud.aiplatform.v1beta1.ListEntityTypesRequest;
import com.google.cloud.aiplatform.v1beta1.ListEntityTypesResponse;
import com.google.cloud.aiplatform.v1beta1.ListFeaturesRequest;
import com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse;
import com.google.cloud.aiplatform.v1beta1.ListFeaturestoresRequest;
import com.google.cloud.aiplatform.v1beta1.ListFeaturestoresResponse;
import com.google.cloud.aiplatform.v1beta1.SearchFeaturesRequest;
import com.google.cloud.aiplatform.v1beta1.SearchFeaturesResponse;
import com.google.cloud.aiplatform.v1beta1.UpdateEntityTypeRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateFeatureRequest;
import com.google.cloud.aiplatform.v1beta1.UpdateFeaturestoreOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UpdateFeaturestoreRequest;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the FeaturestoreService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcFeaturestoreServiceStub extends FeaturestoreServiceStub {
  private static final MethodDescriptor<CreateFeaturestoreRequest, Operation>
      createFeaturestoreMethodDescriptor =
          MethodDescriptor.<CreateFeaturestoreRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/CreateFeaturestore")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateFeaturestoreRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetFeaturestoreRequest, Featurestore>
      getFeaturestoreMethodDescriptor =
          MethodDescriptor.<GetFeaturestoreRequest, Featurestore>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/GetFeaturestore")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetFeaturestoreRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Featurestore.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListFeaturestoresRequest, ListFeaturestoresResponse>
      listFeaturestoresMethodDescriptor =
          MethodDescriptor.<ListFeaturestoresRequest, ListFeaturestoresResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/ListFeaturestores")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListFeaturestoresRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListFeaturestoresResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateFeaturestoreRequest, Operation>
      updateFeaturestoreMethodDescriptor =
          MethodDescriptor.<UpdateFeaturestoreRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/UpdateFeaturestore")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateFeaturestoreRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteFeaturestoreRequest, Operation>
      deleteFeaturestoreMethodDescriptor =
          MethodDescriptor.<DeleteFeaturestoreRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/DeleteFeaturestore")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteFeaturestoreRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateEntityTypeRequest, Operation>
      createEntityTypeMethodDescriptor =
          MethodDescriptor.<CreateEntityTypeRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/CreateEntityType")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetEntityTypeRequest, EntityType>
      getEntityTypeMethodDescriptor =
          MethodDescriptor.<GetEntityTypeRequest, EntityType>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/GetEntityType")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(EntityType.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListEntityTypesRequest, ListEntityTypesResponse>
      listEntityTypesMethodDescriptor =
          MethodDescriptor.<ListEntityTypesRequest, ListEntityTypesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/ListEntityTypes")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListEntityTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListEntityTypesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateEntityTypeRequest, EntityType>
      updateEntityTypeMethodDescriptor =
          MethodDescriptor.<UpdateEntityTypeRequest, EntityType>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/UpdateEntityType")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(EntityType.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteEntityTypeRequest, Operation>
      deleteEntityTypeMethodDescriptor =
          MethodDescriptor.<DeleteEntityTypeRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/DeleteEntityType")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateFeatureRequest, Operation>
      createFeatureMethodDescriptor =
          MethodDescriptor.<CreateFeatureRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/CreateFeature")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateFeatureRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<BatchCreateFeaturesRequest, Operation>
      batchCreateFeaturesMethodDescriptor =
          MethodDescriptor.<BatchCreateFeaturesRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/BatchCreateFeatures")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchCreateFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetFeatureRequest, Feature> getFeatureMethodDescriptor =
      MethodDescriptor.<GetFeatureRequest, Feature>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.aiplatform.v1beta1.FeaturestoreService/GetFeature")
          .setRequestMarshaller(ProtoUtils.marshaller(GetFeatureRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Feature.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<ListFeaturesRequest, ListFeaturesResponse>
      listFeaturesMethodDescriptor =
          MethodDescriptor.<ListFeaturesRequest, ListFeaturesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.aiplatform.v1beta1.FeaturestoreService/ListFeatures")
              .setRequestMarshaller(ProtoUtils.marshaller(ListFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListFeaturesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateFeatureRequest, Feature>
      updateFeatureMethodDescriptor =
          MethodDescriptor.<UpdateFeatureRequest, Feature>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/UpdateFeature")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateFeatureRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Feature.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteFeatureRequest, Operation>
      deleteFeatureMethodDescriptor =
          MethodDescriptor.<DeleteFeatureRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/DeleteFeature")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteFeatureRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ImportFeatureValuesRequest, Operation>
      importFeatureValuesMethodDescriptor =
          MethodDescriptor.<ImportFeatureValuesRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/ImportFeatureValues")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ImportFeatureValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<BatchReadFeatureValuesRequest, Operation>
      batchReadFeatureValuesMethodDescriptor =
          MethodDescriptor.<BatchReadFeatureValuesRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/BatchReadFeatureValues")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchReadFeatureValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ExportFeatureValuesRequest, Operation>
      exportFeatureValuesMethodDescriptor =
          MethodDescriptor.<ExportFeatureValuesRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/ExportFeatureValues")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ExportFeatureValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SearchFeaturesRequest, SearchFeaturesResponse>
      searchFeaturesMethodDescriptor =
          MethodDescriptor.<SearchFeaturesRequest, SearchFeaturesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.FeaturestoreService/SearchFeatures")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchFeaturesResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<CreateFeaturestoreRequest, Operation> createFeaturestoreCallable;
  private final OperationCallable<
          CreateFeaturestoreRequest, Featurestore, CreateFeaturestoreOperationMetadata>
      createFeaturestoreOperationCallable;
  private final UnaryCallable<GetFeaturestoreRequest, Featurestore> getFeaturestoreCallable;
  private final UnaryCallable<ListFeaturestoresRequest, ListFeaturestoresResponse>
      listFeaturestoresCallable;
  private final UnaryCallable<ListFeaturestoresRequest, ListFeaturestoresPagedResponse>
      listFeaturestoresPagedCallable;
  private final UnaryCallable<UpdateFeaturestoreRequest, Operation> updateFeaturestoreCallable;
  private final OperationCallable<
          UpdateFeaturestoreRequest, Featurestore, UpdateFeaturestoreOperationMetadata>
      updateFeaturestoreOperationCallable;
  private final UnaryCallable<DeleteFeaturestoreRequest, Operation> deleteFeaturestoreCallable;
  private final OperationCallable<DeleteFeaturestoreRequest, Empty, DeleteOperationMetadata>
      deleteFeaturestoreOperationCallable;
  private final UnaryCallable<CreateEntityTypeRequest, Operation> createEntityTypeCallable;
  private final OperationCallable<
          CreateEntityTypeRequest, EntityType, CreateEntityTypeOperationMetadata>
      createEntityTypeOperationCallable;
  private final UnaryCallable<GetEntityTypeRequest, EntityType> getEntityTypeCallable;
  private final UnaryCallable<ListEntityTypesRequest, ListEntityTypesResponse>
      listEntityTypesCallable;
  private final UnaryCallable<ListEntityTypesRequest, ListEntityTypesPagedResponse>
      listEntityTypesPagedCallable;
  private final UnaryCallable<UpdateEntityTypeRequest, EntityType> updateEntityTypeCallable;
  private final UnaryCallable<DeleteEntityTypeRequest, Operation> deleteEntityTypeCallable;
  private final OperationCallable<DeleteEntityTypeRequest, Empty, DeleteOperationMetadata>
      deleteEntityTypeOperationCallable;
  private final UnaryCallable<CreateFeatureRequest, Operation> createFeatureCallable;
  private final OperationCallable<CreateFeatureRequest, Feature, CreateFeatureOperationMetadata>
      createFeatureOperationCallable;
  private final UnaryCallable<BatchCreateFeaturesRequest, Operation> batchCreateFeaturesCallable;
  private final OperationCallable<
          BatchCreateFeaturesRequest, BatchCreateFeaturesResponse,
          BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesOperationCallable;
  private final UnaryCallable<GetFeatureRequest, Feature> getFeatureCallable;
  private final UnaryCallable<ListFeaturesRequest, ListFeaturesResponse> listFeaturesCallable;
  private final UnaryCallable<ListFeaturesRequest, ListFeaturesPagedResponse>
      listFeaturesPagedCallable;
  private final UnaryCallable<UpdateFeatureRequest, Feature> updateFeatureCallable;
  private final UnaryCallable<DeleteFeatureRequest, Operation> deleteFeatureCallable;
  private final OperationCallable<DeleteFeatureRequest, Empty, DeleteOperationMetadata>
      deleteFeatureOperationCallable;
  private final UnaryCallable<ImportFeatureValuesRequest, Operation> importFeatureValuesCallable;
  private final OperationCallable<
          ImportFeatureValuesRequest, ImportFeatureValuesResponse,
          ImportFeatureValuesOperationMetadata>
      importFeatureValuesOperationCallable;
  private final UnaryCallable<BatchReadFeatureValuesRequest, Operation>
      batchReadFeatureValuesCallable;
  private final OperationCallable<
          BatchReadFeatureValuesRequest, BatchReadFeatureValuesResponse,
          BatchReadFeatureValuesOperationMetadata>
      batchReadFeatureValuesOperationCallable;
  private final UnaryCallable<ExportFeatureValuesRequest, Operation> exportFeatureValuesCallable;
  private final OperationCallable<
          ExportFeatureValuesRequest, ExportFeatureValuesResponse,
          ExportFeatureValuesOperationMetadata>
      exportFeatureValuesOperationCallable;
  private final UnaryCallable<SearchFeaturesRequest, SearchFeaturesResponse> searchFeaturesCallable;
  private final UnaryCallable<SearchFeaturesRequest, SearchFeaturesPagedResponse>
      searchFeaturesPagedCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcFeaturestoreServiceStub create(FeaturestoreServiceStubSettings settings)
      throws IOException {
    return new GrpcFeaturestoreServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcFeaturestoreServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcFeaturestoreServiceStub(
        FeaturestoreServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcFeaturestoreServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcFeaturestoreServiceStub(
        FeaturestoreServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcFeaturestoreServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcFeaturestoreServiceStub(
      FeaturestoreServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcFeaturestoreServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcFeaturestoreServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcFeaturestoreServiceStub(
      FeaturestoreServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateFeaturestoreRequest, Operation> createFeaturestoreTransportSettings =
        GrpcCallSettings.<CreateFeaturestoreRequest, Operation>newBuilder()
            .setMethodDescriptor(createFeaturestoreMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateFeaturestoreRequest>() {
                  @Override
                  public Map<String, String> extract(CreateFeaturestoreRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetFeaturestoreRequest, Featurestore> getFeaturestoreTransportSettings =
        GrpcCallSettings.<GetFeaturestoreRequest, Featurestore>newBuilder()
            .setMethodDescriptor(getFeaturestoreMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetFeaturestoreRequest>() {
                  @Override
                  public Map<String, String> extract(GetFeaturestoreRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListFeaturestoresRequest, ListFeaturestoresResponse>
        listFeaturestoresTransportSettings =
            GrpcCallSettings.<ListFeaturestoresRequest, ListFeaturestoresResponse>newBuilder()
                .setMethodDescriptor(listFeaturestoresMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListFeaturestoresRequest>() {
                      @Override
                      public Map<String, String> extract(ListFeaturestoresRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<UpdateFeaturestoreRequest, Operation> updateFeaturestoreTransportSettings =
        GrpcCallSettings.<UpdateFeaturestoreRequest, Operation>newBuilder()
            .setMethodDescriptor(updateFeaturestoreMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateFeaturestoreRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateFeaturestoreRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put(
                        "featurestore.name", String.valueOf(request.getFeaturestore().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteFeaturestoreRequest, Operation> deleteFeaturestoreTransportSettings =
        GrpcCallSettings.<DeleteFeaturestoreRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteFeaturestoreMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteFeaturestoreRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteFeaturestoreRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateEntityTypeRequest, Operation> createEntityTypeTransportSettings =
        GrpcCallSettings.<CreateEntityTypeRequest, Operation>newBuilder()
            .setMethodDescriptor(createEntityTypeMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateEntityTypeRequest>() {
                  @Override
                  public Map<String, String> extract(CreateEntityTypeRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetEntityTypeRequest, EntityType> getEntityTypeTransportSettings =
        GrpcCallSettings.<GetEntityTypeRequest, EntityType>newBuilder()
            .setMethodDescriptor(getEntityTypeMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetEntityTypeRequest>() {
                  @Override
                  public Map<String, String> extract(GetEntityTypeRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListEntityTypesRequest, ListEntityTypesResponse>
        listEntityTypesTransportSettings =
            GrpcCallSettings.<ListEntityTypesRequest, ListEntityTypesResponse>newBuilder()
                .setMethodDescriptor(listEntityTypesMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListEntityTypesRequest>() {
                      @Override
                      public Map<String, String> extract(ListEntityTypesRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<UpdateEntityTypeRequest, EntityType> updateEntityTypeTransportSettings =
        GrpcCallSettings.<UpdateEntityTypeRequest, EntityType>newBuilder()
            .setMethodDescriptor(updateEntityTypeMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateEntityTypeRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateEntityTypeRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put(
                        "entity_type.name", String.valueOf(request.getEntityType().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteEntityTypeRequest, Operation> deleteEntityTypeTransportSettings =
        GrpcCallSettings.<DeleteEntityTypeRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteEntityTypeMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteEntityTypeRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteEntityTypeRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateFeatureRequest, Operation> createFeatureTransportSettings =
        GrpcCallSettings.<CreateFeatureRequest, Operation>newBuilder()
            .setMethodDescriptor(createFeatureMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateFeatureRequest>() {
                  @Override
                  public Map<String, String> extract(CreateFeatureRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<BatchCreateFeaturesRequest, Operation> batchCreateFeaturesTransportSettings =
        GrpcCallSettings.<BatchCreateFeaturesRequest, Operation>newBuilder()
            .setMethodDescriptor(batchCreateFeaturesMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<BatchCreateFeaturesRequest>() {
                  @Override
                  public Map<String, String> extract(BatchCreateFeaturesRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetFeatureRequest, Feature> getFeatureTransportSettings =
        GrpcCallSettings.<GetFeatureRequest, Feature>newBuilder()
            .setMethodDescriptor(getFeatureMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetFeatureRequest>() {
                  @Override
                  public Map<String, String> extract(GetFeatureRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListFeaturesRequest, ListFeaturesResponse> listFeaturesTransportSettings =
        GrpcCallSettings.<ListFeaturesRequest, ListFeaturesResponse>newBuilder()
            .setMethodDescriptor(listFeaturesMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ListFeaturesRequest>() {
                  @Override
                  public Map<String, String> extract(ListFeaturesRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<UpdateFeatureRequest, Feature> updateFeatureTransportSettings =
        GrpcCallSettings.<UpdateFeatureRequest, Feature>newBuilder()
            .setMethodDescriptor(updateFeatureMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateFeatureRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateFeatureRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("feature.name", String.valueOf(request.getFeature().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteFeatureRequest, Operation> deleteFeatureTransportSettings =
        GrpcCallSettings.<DeleteFeatureRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteFeatureMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteFeatureRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteFeatureRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ImportFeatureValuesRequest, Operation> importFeatureValuesTransportSettings =
        GrpcCallSettings.<ImportFeatureValuesRequest, Operation>newBuilder()
            .setMethodDescriptor(importFeatureValuesMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ImportFeatureValuesRequest>() {
                  @Override
                  public Map<String, String> extract(ImportFeatureValuesRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("entity_type", String.valueOf(request.getEntityType()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<BatchReadFeatureValuesRequest, Operation>
        batchReadFeatureValuesTransportSettings =
            GrpcCallSettings.<BatchReadFeatureValuesRequest, Operation>newBuilder()
                .setMethodDescriptor(batchReadFeatureValuesMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<BatchReadFeatureValuesRequest>() {
                      @Override
                      public Map<String, String> extract(BatchReadFeatureValuesRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("featurestore", String.valueOf(request.getFeaturestore()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<ExportFeatureValuesRequest, Operation> exportFeatureValuesTransportSettings =
        GrpcCallSettings.<ExportFeatureValuesRequest, Operation>newBuilder()
            .setMethodDescriptor(exportFeatureValuesMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ExportFeatureValuesRequest>() {
                  @Override
                  public Map<String, String> extract(ExportFeatureValuesRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("entity_type", String.valueOf(request.getEntityType()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<SearchFeaturesRequest, SearchFeaturesResponse>
        searchFeaturesTransportSettings =
            GrpcCallSettings.<SearchFeaturesRequest, SearchFeaturesResponse>newBuilder()
                .setMethodDescriptor(searchFeaturesMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<SearchFeaturesRequest>() {
                      @Override
                      public Map<String, String> extract(SearchFeaturesRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("location", String.valueOf(request.getLocation()));
                        return params.build();
                      }
                    })
                .build();

    this.createFeaturestoreCallable =
        callableFactory.createUnaryCallable(
            createFeaturestoreTransportSettings,
            settings.createFeaturestoreSettings(),
            clientContext);
    this.createFeaturestoreOperationCallable =
        callableFactory.createOperationCallable(
            createFeaturestoreTransportSettings,
            settings.createFeaturestoreOperationSettings(),
            clientContext,
            operationsStub);
    this.getFeaturestoreCallable =
        callableFactory.createUnaryCallable(
            getFeaturestoreTransportSettings, settings.getFeaturestoreSettings(), clientContext);
    this.listFeaturestoresCallable =
        callableFactory.createUnaryCallable(
            listFeaturestoresTransportSettings,
            settings.listFeaturestoresSettings(),
            clientContext);
    this.listFeaturestoresPagedCallable =
        callableFactory.createPagedCallable(
            listFeaturestoresTransportSettings,
            settings.listFeaturestoresSettings(),
            clientContext);
    this.updateFeaturestoreCallable =
        callableFactory.createUnaryCallable(
            updateFeaturestoreTransportSettings,
            settings.updateFeaturestoreSettings(),
            clientContext);
    this.updateFeaturestoreOperationCallable =
        callableFactory.createOperationCallable(
            updateFeaturestoreTransportSettings,
            settings.updateFeaturestoreOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteFeaturestoreCallable =
        callableFactory.createUnaryCallable(
            deleteFeaturestoreTransportSettings,
            settings.deleteFeaturestoreSettings(),
            clientContext);
    this.deleteFeaturestoreOperationCallable =
        callableFactory.createOperationCallable(
            deleteFeaturestoreTransportSettings,
            settings.deleteFeaturestoreOperationSettings(),
            clientContext,
            operationsStub);
    this.createEntityTypeCallable =
        callableFactory.createUnaryCallable(
            createEntityTypeTransportSettings, settings.createEntityTypeSettings(), clientContext);
    this.createEntityTypeOperationCallable =
        callableFactory.createOperationCallable(
            createEntityTypeTransportSettings,
            settings.createEntityTypeOperationSettings(),
            clientContext,
            operationsStub);
    this.getEntityTypeCallable =
        callableFactory.createUnaryCallable(
            getEntityTypeTransportSettings, settings.getEntityTypeSettings(), clientContext);
    this.listEntityTypesCallable =
        callableFactory.createUnaryCallable(
            listEntityTypesTransportSettings, settings.listEntityTypesSettings(), clientContext);
    this.listEntityTypesPagedCallable =
        callableFactory.createPagedCallable(
            listEntityTypesTransportSettings, settings.listEntityTypesSettings(), clientContext);
    this.updateEntityTypeCallable =
        callableFactory.createUnaryCallable(
            updateEntityTypeTransportSettings, settings.updateEntityTypeSettings(), clientContext);
    this.deleteEntityTypeCallable =
        callableFactory.createUnaryCallable(
            deleteEntityTypeTransportSettings, settings.deleteEntityTypeSettings(), clientContext);
    this.deleteEntityTypeOperationCallable =
        callableFactory.createOperationCallable(
            deleteEntityTypeTransportSettings,
            settings.deleteEntityTypeOperationSettings(),
            clientContext,
            operationsStub);
    this.createFeatureCallable =
        callableFactory.createUnaryCallable(
            createFeatureTransportSettings, settings.createFeatureSettings(), clientContext);
    this.createFeatureOperationCallable =
        callableFactory.createOperationCallable(
            createFeatureTransportSettings,
            settings.createFeatureOperationSettings(),
            clientContext,
            operationsStub);
    this.batchCreateFeaturesCallable =
        callableFactory.createUnaryCallable(
            batchCreateFeaturesTransportSettings,
            settings.batchCreateFeaturesSettings(),
            clientContext);
    this.batchCreateFeaturesOperationCallable =
        callableFactory.createOperationCallable(
            batchCreateFeaturesTransportSettings,
            settings.batchCreateFeaturesOperationSettings(),
            clientContext,
            operationsStub);
    this.getFeatureCallable =
        callableFactory.createUnaryCallable(
            getFeatureTransportSettings, settings.getFeatureSettings(), clientContext);
    this.listFeaturesCallable =
        callableFactory.createUnaryCallable(
            listFeaturesTransportSettings, settings.listFeaturesSettings(), clientContext);
    this.listFeaturesPagedCallable =
        callableFactory.createPagedCallable(
            listFeaturesTransportSettings, settings.listFeaturesSettings(), clientContext);
    this.updateFeatureCallable =
        callableFactory.createUnaryCallable(
            updateFeatureTransportSettings, settings.updateFeatureSettings(), clientContext);
    this.deleteFeatureCallable =
        callableFactory.createUnaryCallable(
            deleteFeatureTransportSettings, settings.deleteFeatureSettings(), clientContext);
    this.deleteFeatureOperationCallable =
        callableFactory.createOperationCallable(
            deleteFeatureTransportSettings,
            settings.deleteFeatureOperationSettings(),
            clientContext,
            operationsStub);
    this.importFeatureValuesCallable =
        callableFactory.createUnaryCallable(
            importFeatureValuesTransportSettings,
            settings.importFeatureValuesSettings(),
            clientContext);
    this.importFeatureValuesOperationCallable =
        callableFactory.createOperationCallable(
            importFeatureValuesTransportSettings,
            settings.importFeatureValuesOperationSettings(),
            clientContext,
            operationsStub);
    this.batchReadFeatureValuesCallable =
        callableFactory.createUnaryCallable(
            batchReadFeatureValuesTransportSettings,
            settings.batchReadFeatureValuesSettings(),
            clientContext);
    this.batchReadFeatureValuesOperationCallable =
        callableFactory.createOperationCallable(
            batchReadFeatureValuesTransportSettings,
            settings.batchReadFeatureValuesOperationSettings(),
            clientContext,
            operationsStub);
    this.exportFeatureValuesCallable =
        callableFactory.createUnaryCallable(
            exportFeatureValuesTransportSettings,
            settings.exportFeatureValuesSettings(),
            clientContext);
    this.exportFeatureValuesOperationCallable =
        callableFactory.createOperationCallable(
            exportFeatureValuesTransportSettings,
            settings.exportFeatureValuesOperationSettings(),
            clientContext,
            operationsStub);
    this.searchFeaturesCallable =
        callableFactory.createUnaryCallable(
            searchFeaturesTransportSettings, settings.searchFeaturesSettings(), clientContext);
    this.searchFeaturesPagedCallable =
        callableFactory.createPagedCallable(
            searchFeaturesTransportSettings, settings.searchFeaturesSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateFeaturestoreRequest, Operation> createFeaturestoreCallable() {
    return createFeaturestoreCallable;
  }

  @Override
  public OperationCallable<
          CreateFeaturestoreRequest, Featurestore, CreateFeaturestoreOperationMetadata>
      createFeaturestoreOperationCallable() {
    return createFeaturestoreOperationCallable;
  }

  @Override
  public UnaryCallable<GetFeaturestoreRequest, Featurestore> getFeaturestoreCallable() {
    return getFeaturestoreCallable;
  }

  @Override
  public UnaryCallable<ListFeaturestoresRequest, ListFeaturestoresResponse>
      listFeaturestoresCallable() {
    return listFeaturestoresCallable;
  }

  @Override
  public UnaryCallable<ListFeaturestoresRequest, ListFeaturestoresPagedResponse>
      listFeaturestoresPagedCallable() {
    return listFeaturestoresPagedCallable;
  }

  @Override
  public UnaryCallable<UpdateFeaturestoreRequest, Operation> updateFeaturestoreCallable() {
    return updateFeaturestoreCallable;
  }

  @Override
  public OperationCallable<
          UpdateFeaturestoreRequest, Featurestore, UpdateFeaturestoreOperationMetadata>
      updateFeaturestoreOperationCallable() {
    return updateFeaturestoreOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteFeaturestoreRequest, Operation> deleteFeaturestoreCallable() {
    return deleteFeaturestoreCallable;
  }

  @Override
  public OperationCallable<DeleteFeaturestoreRequest, Empty, DeleteOperationMetadata>
      deleteFeaturestoreOperationCallable() {
    return deleteFeaturestoreOperationCallable;
  }

  @Override
  public UnaryCallable<CreateEntityTypeRequest, Operation> createEntityTypeCallable() {
    return createEntityTypeCallable;
  }

  @Override
  public OperationCallable<CreateEntityTypeRequest, EntityType, CreateEntityTypeOperationMetadata>
      createEntityTypeOperationCallable() {
    return createEntityTypeOperationCallable;
  }

  @Override
  public UnaryCallable<GetEntityTypeRequest, EntityType> getEntityTypeCallable() {
    return getEntityTypeCallable;
  }

  @Override
  public UnaryCallable<ListEntityTypesRequest, ListEntityTypesResponse> listEntityTypesCallable() {
    return listEntityTypesCallable;
  }

  @Override
  public UnaryCallable<ListEntityTypesRequest, ListEntityTypesPagedResponse>
      listEntityTypesPagedCallable() {
    return listEntityTypesPagedCallable;
  }

  @Override
  public UnaryCallable<UpdateEntityTypeRequest, EntityType> updateEntityTypeCallable() {
    return updateEntityTypeCallable;
  }

  @Override
  public UnaryCallable<DeleteEntityTypeRequest, Operation> deleteEntityTypeCallable() {
    return deleteEntityTypeCallable;
  }

  @Override
  public OperationCallable<DeleteEntityTypeRequest, Empty, DeleteOperationMetadata>
      deleteEntityTypeOperationCallable() {
    return deleteEntityTypeOperationCallable;
  }

  @Override
  public UnaryCallable<CreateFeatureRequest, Operation> createFeatureCallable() {
    return createFeatureCallable;
  }

  @Override
  public OperationCallable<CreateFeatureRequest, Feature, CreateFeatureOperationMetadata>
      createFeatureOperationCallable() {
    return createFeatureOperationCallable;
  }

  @Override
  public UnaryCallable<BatchCreateFeaturesRequest, Operation> batchCreateFeaturesCallable() {
    return batchCreateFeaturesCallable;
  }

  @Override
  public OperationCallable<
          BatchCreateFeaturesRequest, BatchCreateFeaturesResponse,
          BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesOperationCallable() {
    return batchCreateFeaturesOperationCallable;
  }

  @Override
  public UnaryCallable<GetFeatureRequest, Feature> getFeatureCallable() {
    return getFeatureCallable;
  }

  @Override
  public UnaryCallable<ListFeaturesRequest, ListFeaturesResponse> listFeaturesCallable() {
    return listFeaturesCallable;
  }

  @Override
  public UnaryCallable<ListFeaturesRequest, ListFeaturesPagedResponse> listFeaturesPagedCallable() {
    return listFeaturesPagedCallable;
  }

  @Override
  public UnaryCallable<UpdateFeatureRequest, Feature> updateFeatureCallable() {
    return updateFeatureCallable;
  }

  @Override
  public UnaryCallable<DeleteFeatureRequest, Operation> deleteFeatureCallable() {
    return deleteFeatureCallable;
  }

  @Override
  public OperationCallable<DeleteFeatureRequest, Empty, DeleteOperationMetadata>
      deleteFeatureOperationCallable() {
    return deleteFeatureOperationCallable;
  }

  @Override
  public UnaryCallable<ImportFeatureValuesRequest, Operation> importFeatureValuesCallable() {
    return importFeatureValuesCallable;
  }

  @Override
  public OperationCallable<
          ImportFeatureValuesRequest, ImportFeatureValuesResponse,
          ImportFeatureValuesOperationMetadata>
      importFeatureValuesOperationCallable() {
    return importFeatureValuesOperationCallable;
  }

  @Override
  public UnaryCallable<BatchReadFeatureValuesRequest, Operation> batchReadFeatureValuesCallable() {
    return batchReadFeatureValuesCallable;
  }

  @Override
  public OperationCallable<
          BatchReadFeatureValuesRequest, BatchReadFeatureValuesResponse,
          BatchReadFeatureValuesOperationMetadata>
      batchReadFeatureValuesOperationCallable() {
    return batchReadFeatureValuesOperationCallable;
  }

  @Override
  public UnaryCallable<ExportFeatureValuesRequest, Operation> exportFeatureValuesCallable() {
    return exportFeatureValuesCallable;
  }

  @Override
  public OperationCallable<
          ExportFeatureValuesRequest, ExportFeatureValuesResponse,
          ExportFeatureValuesOperationMetadata>
      exportFeatureValuesOperationCallable() {
    return exportFeatureValuesOperationCallable;
  }

  @Override
  public UnaryCallable<SearchFeaturesRequest, SearchFeaturesResponse> searchFeaturesCallable() {
    return searchFeaturesCallable;
  }

  @Override
  public UnaryCallable<SearchFeaturesRequest, SearchFeaturesPagedResponse>
      searchFeaturesPagedCallable() {
    return searchFeaturesPagedCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
