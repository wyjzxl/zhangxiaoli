package cn.com.guimei.service;

import cn.com.guimei.pojo.Customer;
import cn.com.guimei.pojo.Page;

import java.util.Map;

public interface CustomerService {
    Map<String,Object> customerPageList(String pageNumber);
}
