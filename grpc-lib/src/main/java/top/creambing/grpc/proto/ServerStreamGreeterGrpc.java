package top.creambing.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeter service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: serverStreamGreeter.proto")
public final class ServerStreamGreeterGrpc {

  private ServerStreamGreeterGrpc() {}

  public static final String SERVICE_NAME = "ServerStreamGreeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest,
      top.creambing.grpc.proto.GreeterOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = top.creambing.grpc.proto.GreeterOuterClass.HelloRequest.class,
      responseType = top.creambing.grpc.proto.GreeterOuterClass.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest,
      top.creambing.grpc.proto.GreeterOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest, top.creambing.grpc.proto.GreeterOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = ServerStreamGreeterGrpc.getSayHelloMethod) == null) {
      synchronized (ServerStreamGreeterGrpc.class) {
        if ((getSayHelloMethod = ServerStreamGreeterGrpc.getSayHelloMethod) == null) {
          ServerStreamGreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest, top.creambing.grpc.proto.GreeterOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ServerStreamGreeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  top.creambing.grpc.proto.GreeterOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  top.creambing.grpc.proto.GreeterOuterClass.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerStreamGreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerStreamGreeterStub newStub(io.grpc.Channel channel) {
    return new ServerStreamGreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerStreamGreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServerStreamGreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerStreamGreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServerStreamGreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static abstract class ServerStreamGreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(top.creambing.grpc.proto.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                top.creambing.grpc.proto.GreeterOuterClass.HelloRequest,
                top.creambing.grpc.proto.GreeterOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class ServerStreamGreeterStub extends io.grpc.stub.AbstractStub<ServerStreamGreeterStub> {
    private ServerStreamGreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerStreamGreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStreamGreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerStreamGreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(top.creambing.grpc.proto.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class ServerStreamGreeterBlockingStub extends io.grpc.stub.AbstractStub<ServerStreamGreeterBlockingStub> {
    private ServerStreamGreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerStreamGreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStreamGreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerStreamGreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public java.util.Iterator<top.creambing.grpc.proto.GreeterOuterClass.HelloReply> sayHello(
        top.creambing.grpc.proto.GreeterOuterClass.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class ServerStreamGreeterFutureStub extends io.grpc.stub.AbstractStub<ServerStreamGreeterFutureStub> {
    private ServerStreamGreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerStreamGreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStreamGreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerStreamGreeterFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerStreamGreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerStreamGreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((top.creambing.grpc.proto.GreeterOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloReply>) responseObserver);
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

  private static abstract class ServerStreamGreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerStreamGreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return top.creambing.grpc.proto.ServerStreamGreeterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerStreamGreeter");
    }
  }

  private static final class ServerStreamGreeterFileDescriptorSupplier
      extends ServerStreamGreeterBaseDescriptorSupplier {
    ServerStreamGreeterFileDescriptorSupplier() {}
  }

  private static final class ServerStreamGreeterMethodDescriptorSupplier
      extends ServerStreamGreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerStreamGreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServerStreamGreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerStreamGreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
