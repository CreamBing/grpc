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
    comments = "Source: scStreamGreeter.proto")
public final class SCStreamGreeterGrpc {

  private SCStreamGreeterGrpc() {}

  public static final String SERVICE_NAME = "SCStreamGreeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest,
      top.creambing.grpc.proto.GreeterOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = top.creambing.grpc.proto.GreeterOuterClass.HelloRequest.class,
      responseType = top.creambing.grpc.proto.GreeterOuterClass.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest,
      top.creambing.grpc.proto.GreeterOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest, top.creambing.grpc.proto.GreeterOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = SCStreamGreeterGrpc.getSayHelloMethod) == null) {
      synchronized (SCStreamGreeterGrpc.class) {
        if ((getSayHelloMethod = SCStreamGreeterGrpc.getSayHelloMethod) == null) {
          SCStreamGreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest, top.creambing.grpc.proto.GreeterOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SCStreamGreeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  top.creambing.grpc.proto.GreeterOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  top.creambing.grpc.proto.GreeterOuterClass.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SCStreamGreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SCStreamGreeterStub newStub(io.grpc.Channel channel) {
    return new SCStreamGreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SCStreamGreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SCStreamGreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SCStreamGreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SCStreamGreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static abstract class SCStreamGreeterImplBase implements io.grpc.BindableService {

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
            asyncBidiStreamingCall(
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
  public static final class SCStreamGreeterStub extends io.grpc.stub.AbstractStub<SCStreamGreeterStub> {
    private SCStreamGreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SCStreamGreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SCStreamGreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SCStreamGreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloRequest> sayHello(
        io.grpc.stub.StreamObserver<top.creambing.grpc.proto.GreeterOuterClass.HelloReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class SCStreamGreeterBlockingStub extends io.grpc.stub.AbstractStub<SCStreamGreeterBlockingStub> {
    private SCStreamGreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SCStreamGreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SCStreamGreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SCStreamGreeterBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class SCStreamGreeterFutureStub extends io.grpc.stub.AbstractStub<SCStreamGreeterFutureStub> {
    private SCStreamGreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SCStreamGreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SCStreamGreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SCStreamGreeterFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SCStreamGreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SCStreamGreeterImplBase serviceImpl, int methodId) {
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

  private static abstract class SCStreamGreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SCStreamGreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return top.creambing.grpc.proto.ScStreamGreeter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SCStreamGreeter");
    }
  }

  private static final class SCStreamGreeterFileDescriptorSupplier
      extends SCStreamGreeterBaseDescriptorSupplier {
    SCStreamGreeterFileDescriptorSupplier() {}
  }

  private static final class SCStreamGreeterMethodDescriptorSupplier
      extends SCStreamGreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SCStreamGreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (SCStreamGreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SCStreamGreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
