package top.creambing.grpc.server.service;

import io.grpc.Channel;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import top.creambing.grpc.proto.*;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

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

    public String clientStream(String name) {
        long start = System.currentTimeMillis();
        //这里必须是一个异步存根
        ClientStreamGreeterGrpc.ClientStreamGreeterStub stub = ClientStreamGreeterGrpc.newStub(serverChannel);
        //用来标记调用结束
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        StringBuilder sb = new StringBuilder();
        StreamObserver<GreeterOuterClass.HelloReply> responseObserver = new StreamObserver<GreeterOuterClass.HelloReply>() {
            @Override
            public void onNext(GreeterOuterClass.HelloReply helloReply) {
                //可以传入一个实例来回调
                log.info("msg [{}],it takes " + (System.currentTimeMillis() - start) + " ms", helloReply.getMessage());
                sb.append(helloReply.getMessage()).append("\n");
            }

            @Override
            public void onError(Throwable throwable) {
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        };
        StreamObserver<GreeterOuterClass.HelloRequest> requestObserver = stub.sayHello(responseObserver);
        String[] ss = name.split(",");
        for(String s : ss){
            requestObserver.onNext(GreeterOuterClass.HelloRequest.newBuilder().setName(s).build());
        }
        requestObserver.onCompleted();
        try {
            //如果在规定时间内没有请求完，则让程序停止 异步转同步,界面展示使用
            if (!countDownLatch.await(5, TimeUnit.MINUTES)) {
                log.error("not complete in time");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String serverStream(String name) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        //这里同步和异步存根都可以
        ServerStreamGreeterGrpc.ServerStreamGreeterBlockingStub stub = ServerStreamGreeterGrpc.newBlockingStub(serverChannel);
        //这里服务端虽然是流式的,但是客户端不是,所以这里拿到了所有的结果
        Iterator<GreeterOuterClass.HelloReply> iterator = stub.sayHello(GreeterOuterClass.HelloRequest.newBuilder().setName(name).build());
        while (iterator.hasNext()) {
            sb.append(iterator.next().getMessage());
        }
        log.info("it takes " + (System.currentTimeMillis() - start) + " ms");
        return sb.toString();
    }


    public String scStream(String name) {
        long start = System.currentTimeMillis();
        //这里必须是一个异步存根
        SCStreamGreeterGrpc.SCStreamGreeterStub stub = SCStreamGreeterGrpc.newStub(serverChannel);
        //用来标记调用结束
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        StringBuilder sb = new StringBuilder();
        StreamObserver<GreeterOuterClass.HelloReply> responseObserver = new StreamObserver<GreeterOuterClass.HelloReply>() {
            @Override
            public void onNext(GreeterOuterClass.HelloReply helloReply) {
                //可以传入一个实例来回调
                log.info("msg [{}],it takes " + (System.currentTimeMillis() - start) + " ms", helloReply.getMessage());
                sb.append(helloReply.getMessage()).append("\n");
            }

            @Override
            public void onError(Throwable throwable) {
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        };
        StreamObserver<GreeterOuterClass.HelloRequest> requestObserver = stub.sayHello(responseObserver);
        String[] ss = name.split(",");
        for(String s : ss){
            requestObserver.onNext(GreeterOuterClass.HelloRequest.newBuilder().setName(s).build());
        }
        requestObserver.onCompleted();
        try {
            //如果在规定时间内没有请求完，则让程序停止 异步转同步,界面展示使用
            if (!countDownLatch.await(5, TimeUnit.MINUTES)) {
                log.error("not complete in time");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
