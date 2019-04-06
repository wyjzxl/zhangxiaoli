package com.example.consumer.cn.wyj.controller;

import cn.wyj.rpcservice.RpcUserService;
import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @DubboConsumer(timeout = 3000)
    private RpcUserService rpcUserService;
    @RequestMapping("/queryAll")
    public Object queryAll (){
        return rpcUserService.queryAll();
    }
    @RequestMapping("/delete/{target}")
    public Object delete (@PathVariable("target") int id){
        return rpcUserService.queryAll();
    }

}
