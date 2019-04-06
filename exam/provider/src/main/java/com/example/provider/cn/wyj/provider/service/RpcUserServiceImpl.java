package com.example.provider.cn.wyj.provider.service;

import cn.wyj.common.pojo.New;
import cn.wyj.rpcservice.RpcUserService;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.provider.cn.wyj.provider.mapper.UserMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Component
@Transactional
@Service(interfaceClass = RpcUserService.class)
public class RpcUserServiceImpl implements RpcUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<New> queryAll() {
        return userMapper.queryAll();
    }
}
