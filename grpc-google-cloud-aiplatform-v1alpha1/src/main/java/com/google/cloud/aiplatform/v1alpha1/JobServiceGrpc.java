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
 * A service for creating and managing AI Platform's jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/aiplatform/v1alpha1/job_service.proto")
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.aiplatform.v1alpha1.JobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest,
          com.google.cloud.aiplatform.v1alpha1.CustomJob>
      getCreateCustomJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.CustomJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest,
          com.google.cloud.aiplatform.v1alpha1.CustomJob>
      getCreateCustomJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest,
            com.google.cloud.aiplatform.v1alpha1.CustomJob>
        getCreateCustomJobMethod;
    if ((getCreateCustomJobMethod = JobServiceGrpc.getCreateCustomJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCreateCustomJobMethod = JobServiceGrpc.getCreateCustomJobMethod) == null) {
          JobServiceGrpc.getCreateCustomJobMethod =
              getCreateCustomJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest,
                          com.google.cloud.aiplatform.v1alpha1.CustomJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.CustomJob.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("CreateCustomJob"))
                      .build();
        }
      }
    }
    return getCreateCustomJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest,
          com.google.cloud.aiplatform.v1alpha1.CustomJob>
      getGetCustomJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.CustomJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest,
          com.google.cloud.aiplatform.v1alpha1.CustomJob>
      getGetCustomJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest,
            com.google.cloud.aiplatform.v1alpha1.CustomJob>
        getGetCustomJobMethod;
    if ((getGetCustomJobMethod = JobServiceGrpc.getGetCustomJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetCustomJobMethod = JobServiceGrpc.getGetCustomJobMethod) == null) {
          JobServiceGrpc.getGetCustomJobMethod =
              getGetCustomJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest,
                          com.google.cloud.aiplatform.v1alpha1.CustomJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.CustomJob.getDefaultInstance()))
                      .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetCustomJob"))
                      .build();
        }
      }
    }
    return getGetCustomJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse>
      getListCustomJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCustomJobs",
      requestType = com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse>
      getListCustomJobsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest,
            com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse>
        getListCustomJobsMethod;
    if ((getListCustomJobsMethod = JobServiceGrpc.getListCustomJobsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getListCustomJobsMethod = JobServiceGrpc.getListCustomJobsMethod) == null) {
          JobServiceGrpc.getListCustomJobsMethod =
              getListCustomJobsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest,
                          com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCustomJobs"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("ListCustomJobs"))
                      .build();
        }
      }
    }
    return getListCustomJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest,
          com.google.longrunning.Operation>
      getDeleteCustomJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCustomJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest,
          com.google.longrunning.Operation>
      getDeleteCustomJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest,
            com.google.longrunning.Operation>
        getDeleteCustomJobMethod;
    if ((getDeleteCustomJobMethod = JobServiceGrpc.getDeleteCustomJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getDeleteCustomJobMethod = JobServiceGrpc.getDeleteCustomJobMethod) == null) {
          JobServiceGrpc.getDeleteCustomJobMethod =
              getDeleteCustomJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCustomJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("DeleteCustomJob"))
                      .build();
        }
      }
    }
    return getDeleteCustomJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest, com.google.protobuf.Empty>
      getCancelCustomJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelCustomJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest, com.google.protobuf.Empty>
      getCancelCustomJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest, com.google.protobuf.Empty>
        getCancelCustomJobMethod;
    if ((getCancelCustomJobMethod = JobServiceGrpc.getCancelCustomJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCancelCustomJobMethod = JobServiceGrpc.getCancelCustomJobMethod) == null) {
          JobServiceGrpc.getCancelCustomJobMethod =
              getCancelCustomJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelCustomJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("CancelCustomJob"))
                      .build();
        }
      }
    }
    return getCancelCustomJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest,
          com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
      getCreateHyperparameterTuningJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHyperparameterTuningJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest,
          com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
      getCreateHyperparameterTuningJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest,
            com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
        getCreateHyperparameterTuningJobMethod;
    if ((getCreateHyperparameterTuningJobMethod =
            JobServiceGrpc.getCreateHyperparameterTuningJobMethod)
        == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCreateHyperparameterTuningJobMethod =
                JobServiceGrpc.getCreateHyperparameterTuningJobMethod)
            == null) {
          JobServiceGrpc.getCreateHyperparameterTuningJobMethod =
              getCreateHyperparameterTuningJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest,
                          com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateHyperparameterTuningJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1
                                  .CreateHyperparameterTuningJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("CreateHyperparameterTuningJob"))
                      .build();
        }
      }
    }
    return getCreateHyperparameterTuningJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest,
          com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
      getGetHyperparameterTuningJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHyperparameterTuningJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest,
          com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
      getGetHyperparameterTuningJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest,
            com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
        getGetHyperparameterTuningJobMethod;
    if ((getGetHyperparameterTuningJobMethod = JobServiceGrpc.getGetHyperparameterTuningJobMethod)
        == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetHyperparameterTuningJobMethod =
                JobServiceGrpc.getGetHyperparameterTuningJobMethod)
            == null) {
          JobServiceGrpc.getGetHyperparameterTuningJobMethod =
              getGetHyperparameterTuningJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest,
                          com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetHyperparameterTuningJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("GetHyperparameterTuningJob"))
                      .build();
        }
      }
    }
    return getGetHyperparameterTuningJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse>
      getListHyperparameterTuningJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHyperparameterTuningJobs",
      requestType = com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest.class,
      responseType =
          com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse>
      getListHyperparameterTuningJobsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest,
            com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse>
        getListHyperparameterTuningJobsMethod;
    if ((getListHyperparameterTuningJobsMethod =
            JobServiceGrpc.getListHyperparameterTuningJobsMethod)
        == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getListHyperparameterTuningJobsMethod =
                JobServiceGrpc.getListHyperparameterTuningJobsMethod)
            == null) {
          JobServiceGrpc.getListHyperparameterTuningJobsMethod =
              getListHyperparameterTuningJobsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest,
                          com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListHyperparameterTuningJobs"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1
                                  .ListHyperparameterTuningJobsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1
                                  .ListHyperparameterTuningJobsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("ListHyperparameterTuningJobs"))
                      .build();
        }
      }
    }
    return getListHyperparameterTuningJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest,
          com.google.longrunning.Operation>
      getDeleteHyperparameterTuningJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHyperparameterTuningJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest,
          com.google.longrunning.Operation>
      getDeleteHyperparameterTuningJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest,
            com.google.longrunning.Operation>
        getDeleteHyperparameterTuningJobMethod;
    if ((getDeleteHyperparameterTuningJobMethod =
            JobServiceGrpc.getDeleteHyperparameterTuningJobMethod)
        == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getDeleteHyperparameterTuningJobMethod =
                JobServiceGrpc.getDeleteHyperparameterTuningJobMethod)
            == null) {
          JobServiceGrpc.getDeleteHyperparameterTuningJobMethod =
              getDeleteHyperparameterTuningJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteHyperparameterTuningJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1
                                  .DeleteHyperparameterTuningJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("DeleteHyperparameterTuningJob"))
                      .build();
        }
      }
    }
    return getDeleteHyperparameterTuningJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest,
          com.google.protobuf.Empty>
      getCancelHyperparameterTuningJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelHyperparameterTuningJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest,
          com.google.protobuf.Empty>
      getCancelHyperparameterTuningJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest,
            com.google.protobuf.Empty>
        getCancelHyperparameterTuningJobMethod;
    if ((getCancelHyperparameterTuningJobMethod =
            JobServiceGrpc.getCancelHyperparameterTuningJobMethod)
        == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCancelHyperparameterTuningJobMethod =
                JobServiceGrpc.getCancelHyperparameterTuningJobMethod)
            == null) {
          JobServiceGrpc.getCancelHyperparameterTuningJobMethod =
              getCancelHyperparameterTuningJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CancelHyperparameterTuningJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1
                                  .CancelHyperparameterTuningJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("CancelHyperparameterTuningJob"))
                      .build();
        }
      }
    }
    return getCancelHyperparameterTuningJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest,
          com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
      getCreateBatchPredictionJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBatchPredictionJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest,
          com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
      getCreateBatchPredictionJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest,
            com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
        getCreateBatchPredictionJobMethod;
    if ((getCreateBatchPredictionJobMethod = JobServiceGrpc.getCreateBatchPredictionJobMethod)
        == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCreateBatchPredictionJobMethod = JobServiceGrpc.getCreateBatchPredictionJobMethod)
            == null) {
          JobServiceGrpc.getCreateBatchPredictionJobMethod =
              getCreateBatchPredictionJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest,
                          com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateBatchPredictionJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("CreateBatchPredictionJob"))
                      .build();
        }
      }
    }
    return getCreateBatchPredictionJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest,
          com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
      getGetBatchPredictionJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBatchPredictionJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest,
          com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
      getGetBatchPredictionJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest,
            com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
        getGetBatchPredictionJobMethod;
    if ((getGetBatchPredictionJobMethod = JobServiceGrpc.getGetBatchPredictionJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetBatchPredictionJobMethod = JobServiceGrpc.getGetBatchPredictionJobMethod)
            == null) {
          JobServiceGrpc.getGetBatchPredictionJobMethod =
              getGetBatchPredictionJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest,
                          com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetBatchPredictionJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("GetBatchPredictionJob"))
                      .build();
        }
      }
    }
    return getGetBatchPredictionJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse>
      getListBatchPredictionJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBatchPredictionJobs",
      requestType = com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest.class,
      responseType = com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest,
          com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse>
      getListBatchPredictionJobsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest,
            com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse>
        getListBatchPredictionJobsMethod;
    if ((getListBatchPredictionJobsMethod = JobServiceGrpc.getListBatchPredictionJobsMethod)
        == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getListBatchPredictionJobsMethod = JobServiceGrpc.getListBatchPredictionJobsMethod)
            == null) {
          JobServiceGrpc.getListBatchPredictionJobsMethod =
              getListBatchPredictionJobsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest,
                          com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListBatchPredictionJobs"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("ListBatchPredictionJobs"))
                      .build();
        }
      }
    }
    return getListBatchPredictionJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest,
          com.google.longrunning.Operation>
      getDeleteBatchPredictionJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBatchPredictionJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest,
          com.google.longrunning.Operation>
      getDeleteBatchPredictionJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest,
            com.google.longrunning.Operation>
        getDeleteBatchPredictionJobMethod;
    if ((getDeleteBatchPredictionJobMethod = JobServiceGrpc.getDeleteBatchPredictionJobMethod)
        == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getDeleteBatchPredictionJobMethod = JobServiceGrpc.getDeleteBatchPredictionJobMethod)
            == null) {
          JobServiceGrpc.getDeleteBatchPredictionJobMethod =
              getDeleteBatchPredictionJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteBatchPredictionJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("DeleteBatchPredictionJob"))
                      .build();
        }
      }
    }
    return getDeleteBatchPredictionJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest,
          com.google.protobuf.Empty>
      getCancelBatchPredictionJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelBatchPredictionJob",
      requestType = com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest,
          com.google.protobuf.Empty>
      getCancelBatchPredictionJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest,
            com.google.protobuf.Empty>
        getCancelBatchPredictionJobMethod;
    if ((getCancelBatchPredictionJobMethod = JobServiceGrpc.getCancelBatchPredictionJobMethod)
        == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCancelBatchPredictionJobMethod = JobServiceGrpc.getCancelBatchPredictionJobMethod)
            == null) {
          JobServiceGrpc.getCancelBatchPredictionJobMethod =
              getCancelBatchPredictionJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CancelBatchPredictionJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new JobServiceMethodDescriptorSupplier("CancelBatchPredictionJob"))
                      .build();
        }
      }
    }
    return getCancelBatchPredictionJobMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<JobServiceStub>() {
          @java.lang.Override
          public JobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new JobServiceStub(channel, callOptions);
          }
        };
    return JobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub>() {
          @java.lang.Override
          public JobServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new JobServiceBlockingStub(channel, callOptions);
          }
        };
    return JobServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static JobServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub>() {
          @java.lang.Override
          public JobServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new JobServiceFutureStub(channel, callOptions);
          }
        };
    return JobServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * A service for creating and managing AI Platform's jobs.
   * </pre>
   */
  public abstract static class JobServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Creates a CustomJob. A created CustomJob right away
     * will be attempted to be run.
     * </pre>
     */
    public void createCustomJob(
        com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.CustomJob>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a CustomJob.
     * </pre>
     */
    public void getCustomJob(
        com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.CustomJob>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists CustomJobs in a Location.
     * </pre>
     */
    public void listCustomJobs(
        com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListCustomJobsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a CustomJob.
     * </pre>
     */
    public void deleteCustomJob(
        com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCustomJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a CustomJob.
     * Starts asynchronous cancellation on the CustomJob. The server
     * makes a best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetCustomJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On successful cancellation,
     * the CustomJob is not deleted; instead it becomes a job with
     * a [CustomJob.error][google.cloud.aiplatform.v1alpha1.CustomJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code] of 1,
     * corresponding to `Code.CANCELLED`, and [CustomJob.state][google.cloud.aiplatform.v1alpha1.CustomJob.state] is set to
     * `CANCELLED`.
     * </pre>
     */
    public void cancelCustomJob(
        com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelCustomJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a HyperparameterTuningJob
     * </pre>
     */
    public void createHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateHyperparameterTuningJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a HyperparameterTuningJob
     * </pre>
     */
    public void getHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetHyperparameterTuningJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists HyperparameterTuningJobs in a Location.
     * </pre>
     */
    public void listHyperparameterTuningJobs(
        com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListHyperparameterTuningJobsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a HyperparameterTuningJob.
     * </pre>
     */
    public void deleteHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteHyperparameterTuningJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a HyperparameterTuningJob.
     * Starts asynchronous cancellation on the HyperparameterTuningJob. The server
     * makes a best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetHyperparameterTuningJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On successful cancellation,
     * the HyperparameterTuningJob is not deleted; instead it becomes a job with
     * a [HyperparameterTuningJob.error][google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code]
     * of 1, corresponding to `Code.CANCELLED`, and
     * [HyperparameterTuningJob.state][google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.state] is set to `CANCELLED`.
     * </pre>
     */
    public void cancelHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelHyperparameterTuningJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a BatchPredictionJob. A BatchPredictionJob once created will
     * right away be attempted to start.
     * </pre>
     */
    public void createBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBatchPredictionJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a BatchPredictionJob
     * </pre>
     */
    public void getBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetBatchPredictionJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists BatchPredictionJobs in a Location.
     * </pre>
     */
    public void listBatchPredictionJobs(
        com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListBatchPredictionJobsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a BatchPredictionJob. Can only be called on jobs that already
     * finished.
     * </pre>
     */
    public void deleteBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBatchPredictionJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a BatchPredictionJob.
     * Starts asynchronous cancellation on the BatchPredictionJob. The server
     * makes the best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetBatchPredictionJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On a successful cancellation,
     * the BatchPredictionJob is not deleted;instead its
     * [BatchPredictionJob.state][google.cloud.aiplatform.v1alpha1.BatchPredictionJob.state] is set to `CANCELLED`. Any files already
     * outputted by the job are not deleted.
     * </pre>
     */
    public void cancelBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelBatchPredictionJobMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateCustomJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest,
                      com.google.cloud.aiplatform.v1alpha1.CustomJob>(
                      this, METHODID_CREATE_CUSTOM_JOB)))
          .addMethod(
              getGetCustomJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest,
                      com.google.cloud.aiplatform.v1alpha1.CustomJob>(
                      this, METHODID_GET_CUSTOM_JOB)))
          .addMethod(
              getListCustomJobsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest,
                      com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse>(
                      this, METHODID_LIST_CUSTOM_JOBS)))
          .addMethod(
              getDeleteCustomJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_CUSTOM_JOB)))
          .addMethod(
              getCancelCustomJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest,
                      com.google.protobuf.Empty>(this, METHODID_CANCEL_CUSTOM_JOB)))
          .addMethod(
              getCreateHyperparameterTuningJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest,
                      com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>(
                      this, METHODID_CREATE_HYPERPARAMETER_TUNING_JOB)))
          .addMethod(
              getGetHyperparameterTuningJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest,
                      com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>(
                      this, METHODID_GET_HYPERPARAMETER_TUNING_JOB)))
          .addMethod(
              getListHyperparameterTuningJobsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest,
                      com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse>(
                      this, METHODID_LIST_HYPERPARAMETER_TUNING_JOBS)))
          .addMethod(
              getDeleteHyperparameterTuningJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest,
                      com.google.longrunning.Operation>(
                      this, METHODID_DELETE_HYPERPARAMETER_TUNING_JOB)))
          .addMethod(
              getCancelHyperparameterTuningJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest,
                      com.google.protobuf.Empty>(this, METHODID_CANCEL_HYPERPARAMETER_TUNING_JOB)))
          .addMethod(
              getCreateBatchPredictionJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest,
                      com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>(
                      this, METHODID_CREATE_BATCH_PREDICTION_JOB)))
          .addMethod(
              getGetBatchPredictionJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest,
                      com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>(
                      this, METHODID_GET_BATCH_PREDICTION_JOB)))
          .addMethod(
              getListBatchPredictionJobsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest,
                      com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse>(
                      this, METHODID_LIST_BATCH_PREDICTION_JOBS)))
          .addMethod(
              getDeleteBatchPredictionJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest,
                      com.google.longrunning.Operation>(
                      this, METHODID_DELETE_BATCH_PREDICTION_JOB)))
          .addMethod(
              getCancelBatchPredictionJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest,
                      com.google.protobuf.Empty>(this, METHODID_CANCEL_BATCH_PREDICTION_JOB)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * A service for creating and managing AI Platform's jobs.
   * </pre>
   */
  public static final class JobServiceStub extends io.grpc.stub.AbstractAsyncStub<JobServiceStub> {
    private JobServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a CustomJob. A created CustomJob right away
     * will be attempted to be run.
     * </pre>
     */
    public void createCustomJob(
        com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.CustomJob>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a CustomJob.
     * </pre>
     */
    public void getCustomJob(
        com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.CustomJob>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists CustomJobs in a Location.
     * </pre>
     */
    public void listCustomJobs(
        com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCustomJobsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a CustomJob.
     * </pre>
     */
    public void deleteCustomJob(
        com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCustomJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a CustomJob.
     * Starts asynchronous cancellation on the CustomJob. The server
     * makes a best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetCustomJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On successful cancellation,
     * the CustomJob is not deleted; instead it becomes a job with
     * a [CustomJob.error][google.cloud.aiplatform.v1alpha1.CustomJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code] of 1,
     * corresponding to `Code.CANCELLED`, and [CustomJob.state][google.cloud.aiplatform.v1alpha1.CustomJob.state] is set to
     * `CANCELLED`.
     * </pre>
     */
    public void cancelCustomJob(
        com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelCustomJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a HyperparameterTuningJob
     * </pre>
     */
    public void createHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateHyperparameterTuningJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a HyperparameterTuningJob
     * </pre>
     */
    public void getHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHyperparameterTuningJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists HyperparameterTuningJobs in a Location.
     * </pre>
     */
    public void listHyperparameterTuningJobs(
        com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHyperparameterTuningJobsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a HyperparameterTuningJob.
     * </pre>
     */
    public void deleteHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteHyperparameterTuningJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a HyperparameterTuningJob.
     * Starts asynchronous cancellation on the HyperparameterTuningJob. The server
     * makes a best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetHyperparameterTuningJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On successful cancellation,
     * the HyperparameterTuningJob is not deleted; instead it becomes a job with
     * a [HyperparameterTuningJob.error][google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code]
     * of 1, corresponding to `Code.CANCELLED`, and
     * [HyperparameterTuningJob.state][google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.state] is set to `CANCELLED`.
     * </pre>
     */
    public void cancelHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelHyperparameterTuningJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a BatchPredictionJob. A BatchPredictionJob once created will
     * right away be attempted to start.
     * </pre>
     */
    public void createBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBatchPredictionJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a BatchPredictionJob
     * </pre>
     */
    public void getBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBatchPredictionJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists BatchPredictionJobs in a Location.
     * </pre>
     */
    public void listBatchPredictionJobs(
        com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListBatchPredictionJobsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a BatchPredictionJob. Can only be called on jobs that already
     * finished.
     * </pre>
     */
    public void deleteBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBatchPredictionJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a BatchPredictionJob.
     * Starts asynchronous cancellation on the BatchPredictionJob. The server
     * makes the best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetBatchPredictionJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On a successful cancellation,
     * the BatchPredictionJob is not deleted;instead its
     * [BatchPredictionJob.state][google.cloud.aiplatform.v1alpha1.BatchPredictionJob.state] is set to `CANCELLED`. Any files already
     * outputted by the job are not deleted.
     * </pre>
     */
    public void cancelBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelBatchPredictionJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * A service for creating and managing AI Platform's jobs.
   * </pre>
   */
  public static final class JobServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a CustomJob. A created CustomJob right away
     * will be attempted to be run.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.CustomJob createCustomJob(
        com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest request) {
      return blockingUnaryCall(getChannel(), getCreateCustomJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a CustomJob.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.CustomJob getCustomJob(
        com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest request) {
      return blockingUnaryCall(getChannel(), getGetCustomJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists CustomJobs in a Location.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse listCustomJobs(
        com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest request) {
      return blockingUnaryCall(getChannel(), getListCustomJobsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a CustomJob.
     * </pre>
     */
    public com.google.longrunning.Operation deleteCustomJob(
        com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteCustomJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a CustomJob.
     * Starts asynchronous cancellation on the CustomJob. The server
     * makes a best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetCustomJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On successful cancellation,
     * the CustomJob is not deleted; instead it becomes a job with
     * a [CustomJob.error][google.cloud.aiplatform.v1alpha1.CustomJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code] of 1,
     * corresponding to `Code.CANCELLED`, and [CustomJob.state][google.cloud.aiplatform.v1alpha1.CustomJob.state] is set to
     * `CANCELLED`.
     * </pre>
     */
    public com.google.protobuf.Empty cancelCustomJob(
        com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest request) {
      return blockingUnaryCall(getChannel(), getCancelCustomJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a HyperparameterTuningJob
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob
        createHyperparameterTuningJob(
            com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateHyperparameterTuningJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a HyperparameterTuningJob
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob getHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHyperparameterTuningJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists HyperparameterTuningJobs in a Location.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse
        listHyperparameterTuningJobs(
            com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListHyperparameterTuningJobsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a HyperparameterTuningJob.
     * </pre>
     */
    public com.google.longrunning.Operation deleteHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteHyperparameterTuningJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a HyperparameterTuningJob.
     * Starts asynchronous cancellation on the HyperparameterTuningJob. The server
     * makes a best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetHyperparameterTuningJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On successful cancellation,
     * the HyperparameterTuningJob is not deleted; instead it becomes a job with
     * a [HyperparameterTuningJob.error][google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code]
     * of 1, corresponding to `Code.CANCELLED`, and
     * [HyperparameterTuningJob.state][google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.state] is set to `CANCELLED`.
     * </pre>
     */
    public com.google.protobuf.Empty cancelHyperparameterTuningJob(
        com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelHyperparameterTuningJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a BatchPredictionJob. A BatchPredictionJob once created will
     * right away be attempted to start.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob createBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateBatchPredictionJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a BatchPredictionJob
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob getBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBatchPredictionJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists BatchPredictionJobs in a Location.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse
        listBatchPredictionJobs(
            com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListBatchPredictionJobsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a BatchPredictionJob. Can only be called on jobs that already
     * finished.
     * </pre>
     */
    public com.google.longrunning.Operation deleteBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBatchPredictionJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a BatchPredictionJob.
     * Starts asynchronous cancellation on the BatchPredictionJob. The server
     * makes the best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetBatchPredictionJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On a successful cancellation,
     * the BatchPredictionJob is not deleted;instead its
     * [BatchPredictionJob.state][google.cloud.aiplatform.v1alpha1.BatchPredictionJob.state] is set to `CANCELLED`. Any files already
     * outputted by the job are not deleted.
     * </pre>
     */
    public com.google.protobuf.Empty cancelBatchPredictionJob(
        com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelBatchPredictionJobMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * A service for creating and managing AI Platform's jobs.
   * </pre>
   */
  public static final class JobServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<JobServiceFutureStub> {
    private JobServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a CustomJob. A created CustomJob right away
     * will be attempted to be run.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.CustomJob>
        createCustomJob(com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a CustomJob.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.CustomJob>
        getCustomJob(com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists CustomJobs in a Location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse>
        listCustomJobs(com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCustomJobsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a CustomJob.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteCustomJob(com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCustomJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a CustomJob.
     * Starts asynchronous cancellation on the CustomJob. The server
     * makes a best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetCustomJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On successful cancellation,
     * the CustomJob is not deleted; instead it becomes a job with
     * a [CustomJob.error][google.cloud.aiplatform.v1alpha1.CustomJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code] of 1,
     * corresponding to `Code.CANCELLED`, and [CustomJob.state][google.cloud.aiplatform.v1alpha1.CustomJob.state] is set to
     * `CANCELLED`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        cancelCustomJob(com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelCustomJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a HyperparameterTuningJob
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
        createHyperparameterTuningJob(
            com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateHyperparameterTuningJobMethod(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Gets a HyperparameterTuningJob
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>
        getHyperparameterTuningJob(
            com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHyperparameterTuningJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists HyperparameterTuningJobs in a Location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse>
        listHyperparameterTuningJobs(
            com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListHyperparameterTuningJobsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a HyperparameterTuningJob.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteHyperparameterTuningJob(
            com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteHyperparameterTuningJobMethod(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a HyperparameterTuningJob.
     * Starts asynchronous cancellation on the HyperparameterTuningJob. The server
     * makes a best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetHyperparameterTuningJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On successful cancellation,
     * the HyperparameterTuningJob is not deleted; instead it becomes a job with
     * a [HyperparameterTuningJob.error][google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code]
     * of 1, corresponding to `Code.CANCELLED`, and
     * [HyperparameterTuningJob.state][google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob.state] is set to `CANCELLED`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        cancelHyperparameterTuningJob(
            com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelHyperparameterTuningJobMethod(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Creates a BatchPredictionJob. A BatchPredictionJob once created will
     * right away be attempted to start.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
        createBatchPredictionJob(
            com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBatchPredictionJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a BatchPredictionJob
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
        getBatchPredictionJob(
            com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBatchPredictionJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists BatchPredictionJobs in a Location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse>
        listBatchPredictionJobs(
            com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListBatchPredictionJobsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a BatchPredictionJob. Can only be called on jobs that already
     * finished.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteBatchPredictionJob(
            com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBatchPredictionJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a BatchPredictionJob.
     * Starts asynchronous cancellation on the BatchPredictionJob. The server
     * makes the best effort to cancel the job, but success is not
     * guaranteed. Clients can use [JobService.GetBatchPredictionJob[] or
     * other methods to check whether the cancellation succeeded or whether the
     * job completed despite cancellation. On a successful cancellation,
     * the BatchPredictionJob is not deleted;instead its
     * [BatchPredictionJob.state][google.cloud.aiplatform.v1alpha1.BatchPredictionJob.state] is set to `CANCELLED`. Any files already
     * outputted by the job are not deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        cancelBatchPredictionJob(
            com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelBatchPredictionJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CUSTOM_JOB = 0;
  private static final int METHODID_GET_CUSTOM_JOB = 1;
  private static final int METHODID_LIST_CUSTOM_JOBS = 2;
  private static final int METHODID_DELETE_CUSTOM_JOB = 3;
  private static final int METHODID_CANCEL_CUSTOM_JOB = 4;
  private static final int METHODID_CREATE_HYPERPARAMETER_TUNING_JOB = 5;
  private static final int METHODID_GET_HYPERPARAMETER_TUNING_JOB = 6;
  private static final int METHODID_LIST_HYPERPARAMETER_TUNING_JOBS = 7;
  private static final int METHODID_DELETE_HYPERPARAMETER_TUNING_JOB = 8;
  private static final int METHODID_CANCEL_HYPERPARAMETER_TUNING_JOB = 9;
  private static final int METHODID_CREATE_BATCH_PREDICTION_JOB = 10;
  private static final int METHODID_GET_BATCH_PREDICTION_JOB = 11;
  private static final int METHODID_LIST_BATCH_PREDICTION_JOBS = 12;
  private static final int METHODID_DELETE_BATCH_PREDICTION_JOB = 13;
  private static final int METHODID_CANCEL_BATCH_PREDICTION_JOB = 14;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CUSTOM_JOB:
          serviceImpl.createCustomJob(
              (com.google.cloud.aiplatform.v1alpha1.CreateCustomJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.CustomJob>)
                  responseObserver);
          break;
        case METHODID_GET_CUSTOM_JOB:
          serviceImpl.getCustomJob(
              (com.google.cloud.aiplatform.v1alpha1.GetCustomJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.CustomJob>)
                  responseObserver);
          break;
        case METHODID_LIST_CUSTOM_JOBS:
          serviceImpl.listCustomJobs(
              (com.google.cloud.aiplatform.v1alpha1.ListCustomJobsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.aiplatform.v1alpha1.ListCustomJobsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_CUSTOM_JOB:
          serviceImpl.deleteCustomJob(
              (com.google.cloud.aiplatform.v1alpha1.DeleteCustomJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CANCEL_CUSTOM_JOB:
          serviceImpl.cancelCustomJob(
              (com.google.cloud.aiplatform.v1alpha1.CancelCustomJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_HYPERPARAMETER_TUNING_JOB:
          serviceImpl.createHyperparameterTuningJob(
              (com.google.cloud.aiplatform.v1alpha1.CreateHyperparameterTuningJobRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>)
                  responseObserver);
          break;
        case METHODID_GET_HYPERPARAMETER_TUNING_JOB:
          serviceImpl.getHyperparameterTuningJob(
              (com.google.cloud.aiplatform.v1alpha1.GetHyperparameterTuningJobRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.aiplatform.v1alpha1.HyperparameterTuningJob>)
                  responseObserver);
          break;
        case METHODID_LIST_HYPERPARAMETER_TUNING_JOBS:
          serviceImpl.listHyperparameterTuningJobs(
              (com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.aiplatform.v1alpha1.ListHyperparameterTuningJobsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_HYPERPARAMETER_TUNING_JOB:
          serviceImpl.deleteHyperparameterTuningJob(
              (com.google.cloud.aiplatform.v1alpha1.DeleteHyperparameterTuningJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CANCEL_HYPERPARAMETER_TUNING_JOB:
          serviceImpl.cancelHyperparameterTuningJob(
              (com.google.cloud.aiplatform.v1alpha1.CancelHyperparameterTuningJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_BATCH_PREDICTION_JOB:
          serviceImpl.createBatchPredictionJob(
              (com.google.cloud.aiplatform.v1alpha1.CreateBatchPredictionJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>)
                  responseObserver);
          break;
        case METHODID_GET_BATCH_PREDICTION_JOB:
          serviceImpl.getBatchPredictionJob(
              (com.google.cloud.aiplatform.v1alpha1.GetBatchPredictionJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>)
                  responseObserver);
          break;
        case METHODID_LIST_BATCH_PREDICTION_JOBS:
          serviceImpl.listBatchPredictionJobs(
              (com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_BATCH_PREDICTION_JOB:
          serviceImpl.deleteBatchPredictionJob(
              (com.google.cloud.aiplatform.v1alpha1.DeleteBatchPredictionJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CANCEL_BATCH_PREDICTION_JOB:
          serviceImpl.cancelBatchPredictionJob(
              (com.google.cloud.aiplatform.v1alpha1.CancelBatchPredictionJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private abstract static class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.aiplatform.v1alpha1.JobServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobService");
    }
  }

  private static final class JobServiceFileDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier {
    JobServiceFileDescriptorSupplier() {}
  }

  private static final class JobServiceMethodDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new JobServiceFileDescriptorSupplier())
                      .addMethod(getCreateCustomJobMethod())
                      .addMethod(getGetCustomJobMethod())
                      .addMethod(getListCustomJobsMethod())
                      .addMethod(getDeleteCustomJobMethod())
                      .addMethod(getCancelCustomJobMethod())
                      .addMethod(getCreateHyperparameterTuningJobMethod())
                      .addMethod(getGetHyperparameterTuningJobMethod())
                      .addMethod(getListHyperparameterTuningJobsMethod())
                      .addMethod(getDeleteHyperparameterTuningJobMethod())
                      .addMethod(getCancelHyperparameterTuningJobMethod())
                      .addMethod(getCreateBatchPredictionJobMethod())
                      .addMethod(getGetBatchPredictionJobMethod())
                      .addMethod(getListBatchPredictionJobsMethod())
                      .addMethod(getDeleteBatchPredictionJobMethod())
                      .addMethod(getCancelBatchPredictionJobMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
