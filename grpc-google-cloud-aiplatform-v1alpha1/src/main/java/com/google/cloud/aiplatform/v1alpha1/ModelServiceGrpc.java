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
package com.google.cloud.aiplatform.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * A service for managing AI Platform's machine learning Models.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/aiplatform/v1alpha1/model_service.proto")
public final class ModelServiceGrpc {

  private ModelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.aiplatform.v1alpha1.ModelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.UploadModelRequest, com.google.longrunning.Operation>
      getUploadModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadModel",
      requestType = com.google.cloud.aiplatform.v1alpha1.UploadModelRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.UploadModelRequest, com.google.longrunning.Operation>
      getUploadModelMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.UploadModelRequest,
            com.google.longrunning.Operation>
        getUploadModelMethod;
    if ((getUploadModelMethod = ModelServiceGrpc.getUploadModelMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getUploadModelMethod = ModelServiceGrpc.getUploadModelMethod) == null) {
          ModelServiceGrpc.getUploadModelMethod =
              getUploadModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.UploadModelRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.UploadModelRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("UploadModel"))
                      .build();
        }
      }
    }
    return getUploadModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetModelRequest,
          com.google.cloud.aiplatform.v1alpha1.Model>
      getGetModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModel",
      requestType = com.google.cloud.aiplatform.v1alpha1.GetModelRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.Model.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetModelRequest,
          com.google.cloud.aiplatform.v1alpha1.Model>
      getGetModelMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.GetModelRequest,
            com.google.cloud.aiplatform.v1alpha1.Model>
        getGetModelMethod;
    if ((getGetModelMethod = ModelServiceGrpc.getGetModelMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getGetModelMethod = ModelServiceGrpc.getGetModelMethod) == null) {
          ModelServiceGrpc.getGetModelMethod =
              getGetModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.GetModelRequest,
                          com.google.cloud.aiplatform.v1alpha1.Model>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.GetModelRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.Model.getDefaultInstance()))
                      .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("GetModel"))
                      .build();
        }
      }
    }
    return getGetModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListModelsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListModelsResponse>
      getListModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModels",
      requestType = com.google.cloud.aiplatform.v1alpha1.ListModelsRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.ListModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListModelsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListModelsResponse>
      getListModelsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.ListModelsRequest,
            com.google.cloud.aiplatform.v1alpha1.ListModelsResponse>
        getListModelsMethod;
    if ((getListModelsMethod = ModelServiceGrpc.getListModelsMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getListModelsMethod = ModelServiceGrpc.getListModelsMethod) == null) {
          ModelServiceGrpc.getListModelsMethod =
              getListModelsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.ListModelsRequest,
                          com.google.cloud.aiplatform.v1alpha1.ListModelsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModels"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListModelsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListModelsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("ListModels"))
                      .build();
        }
      }
    }
    return getListModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest, com.google.longrunning.Operation>
      getDeleteModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteModel",
      requestType = com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest, com.google.longrunning.Operation>
      getDeleteModelMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest,
            com.google.longrunning.Operation>
        getDeleteModelMethod;
    if ((getDeleteModelMethod = ModelServiceGrpc.getDeleteModelMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getDeleteModelMethod = ModelServiceGrpc.getDeleteModelMethod) == null) {
          ModelServiceGrpc.getDeleteModelMethod =
              getDeleteModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("DeleteModel"))
                      .build();
        }
      }
    }
    return getDeleteModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ExportModelRequest, com.google.longrunning.Operation>
      getExportModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportModel",
      requestType = com.google.cloud.aiplatform.v1alpha1.ExportModelRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ExportModelRequest, com.google.longrunning.Operation>
      getExportModelMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.ExportModelRequest,
            com.google.longrunning.Operation>
        getExportModelMethod;
    if ((getExportModelMethod = ModelServiceGrpc.getExportModelMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getExportModelMethod = ModelServiceGrpc.getExportModelMethod) == null) {
          ModelServiceGrpc.getExportModelMethod =
              getExportModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.ExportModelRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ExportModelRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("ExportModel"))
                      .build();
        }
      }
    }
    return getExportModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest,
          com.google.cloud.aiplatform.v1alpha1.ModelEvaluation>
      getGetModelEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelEvaluation",
      requestType = com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.ModelEvaluation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest,
          com.google.cloud.aiplatform.v1alpha1.ModelEvaluation>
      getGetModelEvaluationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest,
            com.google.cloud.aiplatform.v1alpha1.ModelEvaluation>
        getGetModelEvaluationMethod;
    if ((getGetModelEvaluationMethod = ModelServiceGrpc.getGetModelEvaluationMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getGetModelEvaluationMethod = ModelServiceGrpc.getGetModelEvaluationMethod) == null) {
          ModelServiceGrpc.getGetModelEvaluationMethod =
              getGetModelEvaluationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest,
                          com.google.cloud.aiplatform.v1alpha1.ModelEvaluation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelEvaluation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ModelEvaluation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ModelServiceMethodDescriptorSupplier("GetModelEvaluation"))
                      .build();
        }
      }
    }
    return getGetModelEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse>
      getListModelEvaluationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelEvaluations",
      requestType = com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse>
      getListModelEvaluationsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest,
            com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse>
        getListModelEvaluationsMethod;
    if ((getListModelEvaluationsMethod = ModelServiceGrpc.getListModelEvaluationsMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getListModelEvaluationsMethod = ModelServiceGrpc.getListModelEvaluationsMethod)
            == null) {
          ModelServiceGrpc.getListModelEvaluationsMethod =
              getListModelEvaluationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest,
                          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListModelEvaluations"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ModelServiceMethodDescriptorSupplier("ListModelEvaluations"))
                      .build();
        }
      }
    }
    return getListModelEvaluationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest,
          com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice>
      getGetModelEvaluationSliceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelEvaluationSlice",
      requestType = com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest,
          com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice>
      getGetModelEvaluationSliceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest,
            com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice>
        getGetModelEvaluationSliceMethod;
    if ((getGetModelEvaluationSliceMethod = ModelServiceGrpc.getGetModelEvaluationSliceMethod)
        == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getGetModelEvaluationSliceMethod = ModelServiceGrpc.getGetModelEvaluationSliceMethod)
            == null) {
          ModelServiceGrpc.getGetModelEvaluationSliceMethod =
              getGetModelEvaluationSliceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest,
                          com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetModelEvaluationSlice"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ModelServiceMethodDescriptorSupplier("GetModelEvaluationSlice"))
                      .build();
        }
      }
    }
    return getGetModelEvaluationSliceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest,
          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse>
      getListModelEvaluationSlicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelEvaluationSlices",
      requestType = com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest,
          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse>
      getListModelEvaluationSlicesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest,
            com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse>
        getListModelEvaluationSlicesMethod;
    if ((getListModelEvaluationSlicesMethod = ModelServiceGrpc.getListModelEvaluationSlicesMethod)
        == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getListModelEvaluationSlicesMethod =
                ModelServiceGrpc.getListModelEvaluationSlicesMethod)
            == null) {
          ModelServiceGrpc.getListModelEvaluationSlicesMethod =
              getListModelEvaluationSlicesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest,
                          com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListModelEvaluationSlices"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ModelServiceMethodDescriptorSupplier("ListModelEvaluationSlices"))
                      .build();
        }
      }
    }
    return getListModelEvaluationSlicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest,
          com.google.longrunning.Operation>
      getExportEvaluatedDataItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportEvaluatedDataItems",
      requestType = com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest,
          com.google.longrunning.Operation>
      getExportEvaluatedDataItemsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest,
            com.google.longrunning.Operation>
        getExportEvaluatedDataItemsMethod;
    if ((getExportEvaluatedDataItemsMethod = ModelServiceGrpc.getExportEvaluatedDataItemsMethod)
        == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getExportEvaluatedDataItemsMethod = ModelServiceGrpc.getExportEvaluatedDataItemsMethod)
            == null) {
          ModelServiceGrpc.getExportEvaluatedDataItemsMethod =
              getExportEvaluatedDataItemsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ExportEvaluatedDataItems"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ModelServiceMethodDescriptorSupplier("ExportEvaluatedDataItems"))
                      .build();
        }
      }
    }
    return getExportEvaluatedDataItemsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static ModelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModelServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ModelServiceStub>() {
          @java.lang.Override
          public ModelServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ModelServiceStub(channel, callOptions);
          }
        };
    return ModelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModelServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModelServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ModelServiceBlockingStub>() {
          @java.lang.Override
          public ModelServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ModelServiceBlockingStub(channel, callOptions);
          }
        };
    return ModelServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static ModelServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModelServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ModelServiceFutureStub>() {
          @java.lang.Override
          public ModelServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ModelServiceFutureStub(channel, callOptions);
          }
        };
    return ModelServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * A service for managing AI Platform's machine learning Models.
   * </pre>
   */
  public abstract static class ModelServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Uploads a Model artifact into AI Platform.
     * </pre>
     */
    public void uploadModel(
        com.google.cloud.aiplatform.v1alpha1.UploadModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadModelMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a Model.
     * </pre>
     */
    public void getModel(
        com.google.cloud.aiplatform.v1alpha1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.Model> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Models in a Location.
     * </pre>
     */
    public void listModels(
        com.google.cloud.aiplatform.v1alpha1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ListModelsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListModelsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Model.
     * Note: Model can only be deleted if there are no DeployedModels created
     * from it.
     * </pre>
     */
    public void deleteModel(
        com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteModelMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports a trained, "export-able", Model to a location specified by the
     * user. A Model is considered export-able if it has at least one [supported
     * export format][Model.supported_export_formats].
     * </pre>
     */
    public void exportModel(
        com.google.cloud.aiplatform.v1alpha1.ExportModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportModelMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a ModelEvaluation.
     * </pre>
     */
    public void getModelEvaluation(
        com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ModelEvaluation>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelEvaluationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists ModelEvaluations in a Model.
     * </pre>
     */
    public void listModelEvaluations(
        com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListModelEvaluationsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a ModelEvaluationSlice.
     * </pre>
     */
    public void getModelEvaluationSlice(
        com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelEvaluationSliceMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists ModelEvaluationSlices in a ModelEvaluation.
     * </pre>
     */
    public void listModelEvaluationSlices(
        com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListModelEvaluationSlicesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports DataItems on which the Model was evaluated (i.e. which were in the
     * TEST set of the dataset the Model was created from), together with their
     * ground truth Annotations and the predictions predicted by the
     * Model.
     * The DataItems, ground truth Annotations and predictions are exported in the
     * state they were at the moment the Model was evaluated.
     * This export is available only for 30 days since the ModelEvaluation is
     * created.
     * Currently only available for AutoML Tables Models.
     * </pre>
     */
    public void exportEvaluatedDataItems(
        com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportEvaluatedDataItemsMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getUploadModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.UploadModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_UPLOAD_MODEL)))
          .addMethod(
              getGetModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.GetModelRequest,
                      com.google.cloud.aiplatform.v1alpha1.Model>(this, METHODID_GET_MODEL)))
          .addMethod(
              getListModelsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.ListModelsRequest,
                      com.google.cloud.aiplatform.v1alpha1.ListModelsResponse>(
                      this, METHODID_LIST_MODELS)))
          .addMethod(
              getDeleteModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_MODEL)))
          .addMethod(
              getExportModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.ExportModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_EXPORT_MODEL)))
          .addMethod(
              getGetModelEvaluationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest,
                      com.google.cloud.aiplatform.v1alpha1.ModelEvaluation>(
                      this, METHODID_GET_MODEL_EVALUATION)))
          .addMethod(
              getListModelEvaluationsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest,
                      com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse>(
                      this, METHODID_LIST_MODEL_EVALUATIONS)))
          .addMethod(
              getGetModelEvaluationSliceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest,
                      com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice>(
                      this, METHODID_GET_MODEL_EVALUATION_SLICE)))
          .addMethod(
              getListModelEvaluationSlicesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest,
                      com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse>(
                      this, METHODID_LIST_MODEL_EVALUATION_SLICES)))
          .addMethod(
              getExportEvaluatedDataItemsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest,
                      com.google.longrunning.Operation>(
                      this, METHODID_EXPORT_EVALUATED_DATA_ITEMS)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * A service for managing AI Platform's machine learning Models.
   * </pre>
   */
  public static final class ModelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ModelServiceStub> {
    private ModelServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModelServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Uploads a Model artifact into AI Platform.
     * </pre>
     */
    public void uploadModel(
        com.google.cloud.aiplatform.v1alpha1.UploadModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadModelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a Model.
     * </pre>
     */
    public void getModel(
        com.google.cloud.aiplatform.v1alpha1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.Model> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Models in a Location.
     * </pre>
     */
    public void listModels(
        com.google.cloud.aiplatform.v1alpha1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ListModelsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Model.
     * Note: Model can only be deleted if there are no DeployedModels created
     * from it.
     * </pre>
     */
    public void deleteModel(
        com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports a trained, "export-able", Model to a location specified by the
     * user. A Model is considered export-able if it has at least one [supported
     * export format][Model.supported_export_formats].
     * </pre>
     */
    public void exportModel(
        com.google.cloud.aiplatform.v1alpha1.ExportModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportModelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a ModelEvaluation.
     * </pre>
     */
    public void getModelEvaluation(
        com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ModelEvaluation>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelEvaluationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists ModelEvaluations in a Model.
     * </pre>
     */
    public void listModelEvaluations(
        com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelEvaluationsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a ModelEvaluationSlice.
     * </pre>
     */
    public void getModelEvaluationSlice(
        com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelEvaluationSliceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists ModelEvaluationSlices in a ModelEvaluation.
     * </pre>
     */
    public void listModelEvaluationSlices(
        com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelEvaluationSlicesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports DataItems on which the Model was evaluated (i.e. which were in the
     * TEST set of the dataset the Model was created from), together with their
     * ground truth Annotations and the predictions predicted by the
     * Model.
     * The DataItems, ground truth Annotations and predictions are exported in the
     * state they were at the moment the Model was evaluated.
     * This export is available only for 30 days since the ModelEvaluation is
     * created.
     * Currently only available for AutoML Tables Models.
     * </pre>
     */
    public void exportEvaluatedDataItems(
        com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportEvaluatedDataItemsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * A service for managing AI Platform's machine learning Models.
   * </pre>
   */
  public static final class ModelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ModelServiceBlockingStub> {
    private ModelServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModelServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Uploads a Model artifact into AI Platform.
     * </pre>
     */
    public com.google.longrunning.Operation uploadModel(
        com.google.cloud.aiplatform.v1alpha1.UploadModelRequest request) {
      return blockingUnaryCall(getChannel(), getUploadModelMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a Model.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.Model getModel(
        com.google.cloud.aiplatform.v1alpha1.GetModelRequest request) {
      return blockingUnaryCall(getChannel(), getGetModelMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Models in a Location.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.ListModelsResponse listModels(
        com.google.cloud.aiplatform.v1alpha1.ListModelsRequest request) {
      return blockingUnaryCall(getChannel(), getListModelsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Model.
     * Note: Model can only be deleted if there are no DeployedModels created
     * from it.
     * </pre>
     */
    public com.google.longrunning.Operation deleteModel(
        com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteModelMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Exports a trained, "export-able", Model to a location specified by the
     * user. A Model is considered export-able if it has at least one [supported
     * export format][Model.supported_export_formats].
     * </pre>
     */
    public com.google.longrunning.Operation exportModel(
        com.google.cloud.aiplatform.v1alpha1.ExportModelRequest request) {
      return blockingUnaryCall(getChannel(), getExportModelMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a ModelEvaluation.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.ModelEvaluation getModelEvaluation(
        com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelEvaluationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists ModelEvaluations in a Model.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse listModelEvaluations(
        com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListModelEvaluationsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a ModelEvaluationSlice.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice getModelEvaluationSlice(
        com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelEvaluationSliceMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists ModelEvaluationSlices in a ModelEvaluation.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse
        listModelEvaluationSlices(
            com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListModelEvaluationSlicesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Exports DataItems on which the Model was evaluated (i.e. which were in the
     * TEST set of the dataset the Model was created from), together with their
     * ground truth Annotations and the predictions predicted by the
     * Model.
     * The DataItems, ground truth Annotations and predictions are exported in the
     * state they were at the moment the Model was evaluated.
     * This export is available only for 30 days since the ModelEvaluation is
     * created.
     * Currently only available for AutoML Tables Models.
     * </pre>
     */
    public com.google.longrunning.Operation exportEvaluatedDataItems(
        com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getExportEvaluatedDataItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * A service for managing AI Platform's machine learning Models.
   * </pre>
   */
  public static final class ModelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ModelServiceFutureStub> {
    private ModelServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModelServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Uploads a Model artifact into AI Platform.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        uploadModel(com.google.cloud.aiplatform.v1alpha1.UploadModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadModelMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a Model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.Model>
        getModel(com.google.cloud.aiplatform.v1alpha1.GetModelRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetModelMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Models in a Location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.ListModelsResponse>
        listModels(com.google.cloud.aiplatform.v1alpha1.ListModelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Model.
     * Note: Model can only be deleted if there are no DeployedModels created
     * from it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteModel(com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Exports a trained, "export-able", Model to a location specified by the
     * user. A Model is considered export-able if it has at least one [supported
     * export format][Model.supported_export_formats].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportModel(com.google.cloud.aiplatform.v1alpha1.ExportModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportModelMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a ModelEvaluation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.ModelEvaluation>
        getModelEvaluation(com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelEvaluationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists ModelEvaluations in a Model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse>
        listModelEvaluations(
            com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelEvaluationsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a ModelEvaluationSlice.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice>
        getModelEvaluationSlice(
            com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelEvaluationSliceMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists ModelEvaluationSlices in a ModelEvaluation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse>
        listModelEvaluationSlices(
            com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelEvaluationSlicesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Exports DataItems on which the Model was evaluated (i.e. which were in the
     * TEST set of the dataset the Model was created from), together with their
     * ground truth Annotations and the predictions predicted by the
     * Model.
     * The DataItems, ground truth Annotations and predictions are exported in the
     * state they were at the moment the Model was evaluated.
     * This export is available only for 30 days since the ModelEvaluation is
     * created.
     * Currently only available for AutoML Tables Models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportEvaluatedDataItems(
            com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportEvaluatedDataItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_MODEL = 0;
  private static final int METHODID_GET_MODEL = 1;
  private static final int METHODID_LIST_MODELS = 2;
  private static final int METHODID_DELETE_MODEL = 3;
  private static final int METHODID_EXPORT_MODEL = 4;
  private static final int METHODID_GET_MODEL_EVALUATION = 5;
  private static final int METHODID_LIST_MODEL_EVALUATIONS = 6;
  private static final int METHODID_GET_MODEL_EVALUATION_SLICE = 7;
  private static final int METHODID_LIST_MODEL_EVALUATION_SLICES = 8;
  private static final int METHODID_EXPORT_EVALUATED_DATA_ITEMS = 9;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ModelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ModelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_MODEL:
          serviceImpl.uploadModel(
              (com.google.cloud.aiplatform.v1alpha1.UploadModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_MODEL:
          serviceImpl.getModel(
              (com.google.cloud.aiplatform.v1alpha1.GetModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.Model>)
                  responseObserver);
          break;
        case METHODID_LIST_MODELS:
          serviceImpl.listModels(
              (com.google.cloud.aiplatform.v1alpha1.ListModelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ListModelsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_MODEL:
          serviceImpl.deleteModel(
              (com.google.cloud.aiplatform.v1alpha1.DeleteModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_MODEL:
          serviceImpl.exportModel(
              (com.google.cloud.aiplatform.v1alpha1.ExportModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_MODEL_EVALUATION:
          serviceImpl.getModelEvaluation(
              (com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ModelEvaluation>)
                  responseObserver);
          break;
        case METHODID_LIST_MODEL_EVALUATIONS:
          serviceImpl.listModelEvaluations(
              (com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_MODEL_EVALUATION_SLICE:
          serviceImpl.getModelEvaluationSlice(
              (com.google.cloud.aiplatform.v1alpha1.GetModelEvaluationSliceRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.aiplatform.v1alpha1.ModelEvaluationSlice>)
                  responseObserver);
          break;
        case METHODID_LIST_MODEL_EVALUATION_SLICES:
          serviceImpl.listModelEvaluationSlices(
              (com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.aiplatform.v1alpha1.ListModelEvaluationSlicesResponse>)
                  responseObserver);
          break;
        case METHODID_EXPORT_EVALUATED_DATA_ITEMS:
          serviceImpl.exportEvaluatedDataItems(
              (com.google.cloud.aiplatform.v1alpha1.ExportEvaluatedDataItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class ModelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ModelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.aiplatform.v1alpha1.ModelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ModelService");
    }
  }

  private static final class ModelServiceFileDescriptorSupplier
      extends ModelServiceBaseDescriptorSupplier {
    ModelServiceFileDescriptorSupplier() {}
  }

  private static final class ModelServiceMethodDescriptorSupplier
      extends ModelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ModelServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ModelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new ModelServiceFileDescriptorSupplier())
                      .addMethod(getUploadModelMethod())
                      .addMethod(getGetModelMethod())
                      .addMethod(getListModelsMethod())
                      .addMethod(getDeleteModelMethod())
                      .addMethod(getExportModelMethod())
                      .addMethod(getGetModelEvaluationMethod())
                      .addMethod(getListModelEvaluationsMethod())
                      .addMethod(getGetModelEvaluationSliceMethod())
                      .addMethod(getListModelEvaluationSlicesMethod())
                      .addMethod(getExportEvaluatedDataItemsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
