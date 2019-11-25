package top.creambing.grpc.server.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.creambing.grpc.server.service.GrpcClientService;

import javax.annotation.Resource;


@RestController
public class GrpcClientController {

    @Resource
    private GrpcClientService grpcClientService;

    @RequestMapping("/sync")
    public String printMessage(@RequestParam(defaultValue = "Michael") String name) {
        return grpcClientService.sendMessage(name);
    }

    @RequestMapping("/clientStream")
    public String clientStream(@RequestParam(defaultValue = "Michael,Bob,Alice") String name) {
        return grpcClientService.clientStream(name);
    }

    @RequestMapping("/serverStream")
    public String serverStream(@RequestParam(defaultValue = "Michael,Bob,Alice") String name) {
        return grpcClientService.serverStream(name);
    }

    @RequestMapping("/scStream")
    public String scStream(@RequestParam(defaultValue = "Michael,Bob,Alice") String name) {
        return grpcClientService.scStream(name);
    }

}
