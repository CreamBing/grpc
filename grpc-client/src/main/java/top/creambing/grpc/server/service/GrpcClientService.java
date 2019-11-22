package top.creambing.grpc.server.service;

import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import top.creambing.grpc.proto.GreeterGrpc;
import top.creambing.grpc.proto.GreeterOuterClass;

@Slf4j
@Service
public class GrpcClientService {

    @GrpcClient("grpc-server")
    private Channel serverChannel;

    public String sendMessage(String name) {
        long start = System.currentTimeMillis();
        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(serverChannel);
        GreeterOuterClass.HelloReply response = stub.sayHello(GreeterOuterClass.HelloRequest.newBuilder().setName(name).build());
        log.info("it takes " + (System.currentTimeMillis() - start) + " ms");
        return response.getMessage();
    }
}
