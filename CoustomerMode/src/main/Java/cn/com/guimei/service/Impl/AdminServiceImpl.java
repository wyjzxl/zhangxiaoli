package cn.com.guimei.service.Impl;

import cn.com.guimei.dao.AdminMapper;
import cn.com.guimei.pojo.Superuser;
import cn.com.guimei.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;
    public Superuser adminLogin(String userLogin, String userPassword) {
        return adminMapper.adminLogin(userLogin,userPassword);
    }
}
