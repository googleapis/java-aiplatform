package com.google.cloud.aiplatform.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A service for creating and managing Vertex AI's Index resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/aiplatform/v1beta1/index_service.proto")
public final class IndexServiceGrpc {

  private IndexServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.aiplatform.v1beta1.IndexService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.CreateIndexRequest,
      com.google.longrunning.Operation> getCreateIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIndex",
      requestType = com.google.cloud.aiplatform.v1beta1.CreateIndexRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.CreateIndexRequest,
      com.google.longrunning.Operation> getCreateIndexMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.CreateIndexRequest, com.google.longrunning.Operation> getCreateIndexMethod;
    if ((getCreateIndexMethod = IndexServiceGrpc.getCreateIndexMethod) == null) {
      synchronized (IndexServiceGrpc.class) {
        if ((getCreateIndexMethod = IndexServiceGrpc.getCreateIndexMethod) == null) {
          IndexServiceGrpc.getCreateIndexMethod = getCreateIndexMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.aiplatform.v1beta1.CreateIndexRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.aiplatform.v1beta1.CreateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new IndexServiceMethodDescriptorSupplier("CreateIndex"))
              .build();
        }
      }
    }
    return getCreateIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.GetIndexRequest,
      com.google.cloud.aiplatform.v1beta1.Index> getGetIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIndex",
      requestType = com.google.cloud.aiplatform.v1beta1.GetIndexRequest.class,
      responseType = com.google.cloud.aiplatform.v1beta1.Index.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.GetIndexRequest,
      com.google.cloud.aiplatform.v1beta1.Index> getGetIndexMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.GetIndexRequest, com.google.cloud.aiplatform.v1beta1.Index> getGetIndexMethod;
    if ((getGetIndexMethod = IndexServiceGrpc.getGetIndexMethod) == null) {
      synchronized (IndexServiceGrpc.class) {
        if ((getGetIndexMethod = IndexServiceGrpc.getGetIndexMethod) == null) {
          IndexServiceGrpc.getGetIndexMethod = getGetIndexMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.aiplatform.v1beta1.GetIndexRequest, com.google.cloud.aiplatform.v1beta1.Index>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.aiplatform.v1beta1.GetIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.aiplatform.v1beta1.Index.getDefaultInstance()))
              .setSchemaDescriptor(new IndexServiceMethodDescriptorSupplier("GetIndex"))
              .build();
        }
      }
    }
    return getGetIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.ListIndexesRequest,
      com.google.cloud.aiplatform.v1beta1.ListIndexesResponse> getListIndexesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIndexes",
      requestType = com.google.cloud.aiplatform.v1beta1.ListIndexesRequest.class,
      responseType = com.google.cloud.aiplatform.v1beta1.ListIndexesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.ListIndexesRequest,
      com.google.cloud.aiplatform.v1beta1.ListIndexesResponse> getListIndexesMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.ListIndexesRequest, com.google.cloud.aiplatform.v1beta1.ListIndexesResponse> getListIndexesMethod;
    if ((getListIndexesMethod = IndexServiceGrpc.getListIndexesMethod) == null) {
      synchronized (IndexServiceGrpc.class) {
        if ((getListIndexesMethod = IndexServiceGrpc.getListIndexesMethod) == null) {
          IndexServiceGrpc.getListIndexesMethod = getListIndexesMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.aiplatform.v1beta1.ListIndexesRequest, com.google.cloud.aiplatform.v1beta1.ListIndexesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIndexes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.aiplatform.v1beta1.ListIndexesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.aiplatform.v1beta1.ListIndexesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexServiceMethodDescriptorSupplier("ListIndexes"))
              .build();
        }
      }
    }
    return getListIndexesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest,
      com.google.longrunning.Operation> getUpdateIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIndex",
      requestType = com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest,
      com.google.longrunning.Operation> getUpdateIndexMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest, com.google.longrunning.Operation> getUpdateIndexMethod;
    if ((getUpdateIndexMethod = IndexServiceGrpc.getUpdateIndexMethod) == null) {
      synchronized (IndexServiceGrpc.class) {
        if ((getUpdateIndexMethod = IndexServiceGrpc.getUpdateIndexMethod) == null) {
          IndexServiceGrpc.getUpdateIndexMethod = getUpdateIndexMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new IndexServiceMethodDescriptorSupplier("UpdateIndex"))
              .build();
        }
      }
    }
    return getUpdateIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest,
      com.google.longrunning.Operation> getDeleteIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIndex",
      requestType = com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest,
      com.google.longrunning.Operation> getDeleteIndexMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest, com.google.longrunning.Operation> getDeleteIndexMethod;
    if ((getDeleteIndexMethod = IndexServiceGrpc.getDeleteIndexMethod) == null) {
      synchronized (IndexServiceGrpc.class) {
        if ((getDeleteIndexMethod = IndexServiceGrpc.getDeleteIndexMethod) == null) {
          IndexServiceGrpc.getDeleteIndexMethod = getDeleteIndexMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new IndexServiceMethodDescriptorSupplier("DeleteIndex"))
              .build();
        }
      }
    }
    return getDeleteIndexMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IndexServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexServiceStub>() {
        @java.lang.Override
        public IndexServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexServiceStub(channel, callOptions);
        }
      };
    return IndexServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IndexServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexServiceBlockingStub>() {
        @java.lang.Override
        public IndexServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexServiceBlockingStub(channel, callOptions);
        }
      };
    return IndexServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IndexServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexServiceFutureStub>() {
        @java.lang.Override
        public IndexServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexServiceFutureStub(channel, callOptions);
        }
      };
    return IndexServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service for creating and managing Vertex AI's Index resources.
   * </pre>
   */
  public static abstract class IndexServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates an Index.
     * </pre>
     */
    public void createIndex(com.google.cloud.aiplatform.v1beta1.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an Index.
     * </pre>
     */
    public void getIndex(com.google.cloud.aiplatform.v1beta1.GetIndexRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1beta1.Index> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists Indexes in a Location.
     * </pre>
     */
    public void listIndexes(com.google.cloud.aiplatform.v1beta1.ListIndexesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1beta1.ListIndexesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIndexesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an Index.
     * </pre>
     */
    public void updateIndex(com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an Index.
     * An Index can only be deleted when all its
     * [DeployedIndexes][google.cloud.aiplatform.v1beta1.Index.deployed_indexes] had been undeployed.
     * </pre>
     */
    public void deleteIndex(com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIndexMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateIndexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.aiplatform.v1beta1.CreateIndexRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_INDEX)))
          .addMethod(
            getGetIndexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.aiplatform.v1beta1.GetIndexRequest,
                com.google.cloud.aiplatform.v1beta1.Index>(
                  this, METHODID_GET_INDEX)))
          .addMethod(
            getListIndexesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.aiplatform.v1beta1.ListIndexesRequest,
                com.google.cloud.aiplatform.v1beta1.ListIndexesResponse>(
                  this, METHODID_LIST_INDEXES)))
          .addMethod(
            getUpdateIndexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_INDEX)))
          .addMethod(
            getDeleteIndexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_INDEX)))
          .build();
    }
  }

  /**
   * <pre>
   * A service for creating and managing Vertex AI's Index resources.
   * </pre>
   */
  public static final class IndexServiceStub extends io.grpc.stub.AbstractAsyncStub<IndexServiceStub> {
    private IndexServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an Index.
     * </pre>
     */
    public void createIndex(com.google.cloud.aiplatform.v1beta1.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an Index.
     * </pre>
     */
    public void getIndex(com.google.cloud.aiplatform.v1beta1.GetIndexRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1beta1.Index> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists Indexes in a Location.
     * </pre>
     */
    public void listIndexes(com.google.cloud.aiplatform.v1beta1.ListIndexesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1beta1.ListIndexesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIndexesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an Index.
     * </pre>
     */
    public void updateIndex(com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an Index.
     * An Index can only be deleted when all its
     * [DeployedIndexes][google.cloud.aiplatform.v1beta1.Index.deployed_indexes] had been undeployed.
     * </pre>
     */
    public void deleteIndex(com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIndexMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service for creating and managing Vertex AI's Index resources.
   * </pre>
   */
  public static final class IndexServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IndexServiceBlockingStub> {
    private IndexServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an Index.
     * </pre>
     */
    public com.google.longrunning.Operation createIndex(com.google.cloud.aiplatform.v1beta1.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an Index.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1beta1.Index getIndex(com.google.cloud.aiplatform.v1beta1.GetIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists Indexes in a Location.
     * </pre>
     */
    public com.google.cloud.aiplatform.v1beta1.ListIndexesResponse listIndexes(com.google.cloud.aiplatform.v1beta1.ListIndexesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIndexesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an Index.
     * </pre>
     */
    public com.google.longrunning.Operation updateIndex(com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an Index.
     * An Index can only be deleted when all its
     * [DeployedIndexes][google.cloud.aiplatform.v1beta1.Index.deployed_indexes] had been undeployed.
     * </pre>
     */
    public com.google.longrunning.Operation deleteIndex(com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIndexMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service for creating and managing Vertex AI's Index resources.
   * </pre>
   */
  public static final class IndexServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IndexServiceFutureStub> {
    private IndexServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an Index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createIndex(
        com.google.cloud.aiplatform.v1beta1.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an Index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.aiplatform.v1beta1.Index> getIndex(
        com.google.cloud.aiplatform.v1beta1.GetIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists Indexes in a Location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.aiplatform.v1beta1.ListIndexesResponse> listIndexes(
        com.google.cloud.aiplatform.v1beta1.ListIndexesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIndexesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an Index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateIndex(
        com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an Index.
     * An Index can only be deleted when all its
     * [DeployedIndexes][google.cloud.aiplatform.v1beta1.Index.deployed_indexes] had been undeployed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteIndex(
        com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIndexMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INDEX = 0;
  private static final int METHODID_GET_INDEX = 1;
  private static final int METHODID_LIST_INDEXES = 2;
  private static final int METHODID_UPDATE_INDEX = 3;
  private static final int METHODID_DELETE_INDEX = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IndexServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IndexServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_INDEX:
          serviceImpl.createIndex((com.google.cloud.aiplatform.v1beta1.CreateIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_INDEX:
          serviceImpl.getIndex((com.google.cloud.aiplatform.v1beta1.GetIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1beta1.Index>) responseObserver);
          break;
        case METHODID_LIST_INDEXES:
          serviceImpl.listIndexes((com.google.cloud.aiplatform.v1beta1.ListIndexesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.aiplatform.v1beta1.ListIndexesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INDEX:
          serviceImpl.updateIndex((com.google.cloud.aiplatform.v1beta1.UpdateIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_INDEX:
          serviceImpl.deleteIndex((com.google.cloud.aiplatform.v1beta1.DeleteIndexRequest) request,
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

  private static abstract class IndexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IndexServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IndexServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IndexService");
    }
  }

  private static final class IndexServiceFileDescriptorSupplier
      extends IndexServiceBaseDescriptorSupplier {
    IndexServiceFileDescriptorSupplier() {}
  }

  private static final class IndexServiceMethodDescriptorSupplier
      extends IndexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IndexServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IndexServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IndexServiceFileDescriptorSupplier())
              .addMethod(getCreateIndexMethod())
              .addMethod(getGetIndexMethod())
              .addMethod(getListIndexesMethod())
              .addMethod(getUpdateIndexMethod())
              .addMethod(getDeleteIndexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
