package cn.com.guimei.service.Impl;

import cn.com.guimei.dao.CustomerMapper;
import cn.com.guimei.pojo.Customer;
import cn.com.guimei.pojo.Page;
import cn.com.guimei.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    CustomerMapper customerMapper;
    public Map<String,Object> customerPageList(String num) {
        Map<String,Object> map=new HashMap<String, Object>();
        int pageSize=5;
        int pageNumber=1;
        if(num!=null && num.length()>0){
            pageNumber=Integer.parseInt(num);
        }
       int pageRecode=customerMapper.totalRecode();
        int totalPage=pageRecode%pageSize==0?pageRecode/pageSize:pageRecode/pageSize+1;
        int pageIndex=(pageNumber-1)*pageSize;
        List<Customer> list=customerMapper.queryAll(pageIndex,pageSize);
        map.put("pageNumber",pageNumber);
        map.put("totalPage",totalPage);
        map.put("pageData",list);
        return map;
    }
}
