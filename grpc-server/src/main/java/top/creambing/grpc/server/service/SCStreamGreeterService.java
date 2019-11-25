package top.creambing.grpc.server.service;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import top.creambing.grpc.proto.GreeterOuterClass;
import top.creambing.grpc.proto.SCStreamGreeterGrpc;

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
public class SCStreamGreeterService extends SCStreamGreeterGrpc.SCStreamGreeterImplBase {
    @Override
    public StreamObserver<GreeterOuterClass.HelloRequest> sayHello(StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        return new StreamObserver<GreeterOuterClass.HelloRequest>() {
            @Override
            public void onNext(GreeterOuterClass.HelloRequest helloRequest) {
                String message = "Hello " + helloRequest.getName();
                log.info("return msg: [{}]", message);
                //这里就返回
                final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
                responseObserver.onNext(replyBuilder.build());
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}