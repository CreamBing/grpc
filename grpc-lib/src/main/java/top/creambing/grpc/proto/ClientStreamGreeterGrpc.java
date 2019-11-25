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
    comments = "Source: clientStreamGreeter.proto")
public final class ClientStreamGreeterGrpc {

  private ClientStreamGreeterGrpc() {}

  public static final String SERVICE_NAME = "ClientStreamGreeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest,
      top.creambing.grpc.proto.GreeterOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = top.creambing.grpc.proto.GreeterOuterClass.HelloRequest.class,
      responseType = top.creambing.grpc.proto.GreeterOuterClass.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest,
      top.creambing.grpc.proto.GreeterOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest, top.creambing.grpc.proto.GreeterOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = ClientStreamGreeterGrpc.getSayHelloMethod) == null) {
      synchronized (ClientStreamGreeterGrpc.class) {
        if ((getSayHelloMethod = ClientStreamGreeterGrpc.getSayHelloMethod) == null) {
          ClientStreamGreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest, top.creambing.grpc.proto.GreeterOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ClientStreamGreeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  top.creambing.grpc.proto.GreeterOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  top.creambing.grpc.proto.GreeterOuterClass.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientStreamGreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientStreamGreeterStub newStub(io.grpc.Channel channel) {
    return new ClientStreamGreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientStreamGreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientStreamGreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientStreamGreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientStreamGreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static abstract class ClientStreamGreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest> sayHello(
        io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncClientStreamingCall(
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
  public static final class ClientStreamGreeterStub extends io.grpc.stub.AbstractStub<ClientStreamGreeterStub> {
    private ClientStreamGreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientStreamGreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStreamGreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientStreamGreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest> sayHello(
        io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class ClientStreamGreeterBlockingStub extends io.grpc.stub.AbstractStub<ClientStreamGreeterBlockingStub> {
    private ClientStreamGreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientStreamGreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStreamGreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientStreamGreeterBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class ClientStreamGreeterFutureStub extends io.grpc.stub.AbstractStub<ClientStreamGreeterFutureStub> {
    private ClientStreamGreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientStreamGreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStreamGreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientStreamGreeterFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientStreamGreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientStreamGreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHello(
              (io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ClientStreamGreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientStreamGreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return top.creambing.grpc.proto.ClientStreamGreeterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientStreamGreeter");
    }
  }

  private static final class ClientStreamGreeterFileDescriptorSupplier
      extends ClientStreamGreeterBaseDescriptorSupplier {
    ClientStreamGreeterFileDescriptorSupplier() {}
  }

  private static final class ClientStreamGreeterMethodDescriptorSupplier
      extends ClientStreamGreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientStreamGreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientStreamGreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientStreamGreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
