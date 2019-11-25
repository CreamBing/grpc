package top.creambing.grpc.server.service;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import top.creambing.grpc.proto.ClientStreamGreeterGrpc;
import top.creambing.grpc.proto.GreeterOuterClass;

/**
 * Copyright (C), 2015-2019, 优地科技有限公司
 * FileName: ClientStreamGreeterService
 * Author:   creambing
 * Date:     2019-11-25 13:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Slf4j
@GrpcService()
public class ClientStreamGreeterService extends ClientStreamGreeterGrpc.ClientStreamGreeterImplBase {

    @Override
    public StreamObserver<GreeterOuterClass.HelloRequest> sayHello(StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        return new StreamObserver<GreeterOuterClass.HelloRequest>() {
            private String message;
            @Override
            public void onNext(GreeterOuterClass.HelloRequest helloRequest) {
                this.message += "Hello " + helloRequest.getName();
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
                responseObserver.onNext(replyBuilder.build());
                responseObserver.onCompleted();
            }
        };
    }
}