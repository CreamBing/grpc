package top.creambing.grpc.server.service;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import top.creambing.grpc.proto.ClientStreamGreeterGrpc;
import top.creambing.grpc.proto.GreeterOuterClass;
import top.creambing.grpc.proto.ServerStreamGreeterGrpc;

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
public class ServerStreamGreeterService extends ServerStreamGreeterGrpc.ServerStreamGreeterImplBase {

    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        //服务端流式api就是将前端的请求逐一返回,类似批量接口,不同的是这里处理一个就返回一个
        String names = request.getName();
        String[] ss = names.split(",");
        for(String s : ss){
            String message = "Hello " + s;
            final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
            responseObserver.onNext(replyBuilder.build());
        }
        responseObserver.onCompleted();
    }
}