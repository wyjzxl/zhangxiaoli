package cn.com.guimei.service;

import cn.com.guimei.pojo.Superuser;

public interface AdminService {
    public Superuser adminLogin(String userLogin,String userPassword);
}
