// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clientStreamGreeter.proto

package top.creambing.grpc.proto;

public final class ClientStreamGreeterOuterClass {
  private ClientStreamGreeterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031clientStreamGreeter.proto\032\rgreeter.pro" +
      "to2A\n\023ClientStreamGreeter\022*\n\010SayHello\022\r." +
      "HelloRequest\032\013.HelloReply\"\000(\001B\032\n\030top.cre" +
      "ambing.grpc.protob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          top.creambing.grpc.proto.GreeterOuterClass.getDescriptor(),
        }, assigner);
    top.creambing.grpc.proto.GreeterOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
