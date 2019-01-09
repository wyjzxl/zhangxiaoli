package cn.com.guimei.controller;

import cn.com.guimei.pojo.Customer;
import cn.com.guimei.pojo.Page;
import cn.com.guimei.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;
    @RequestMapping(value = "/queryAll")
    public String queryAll(String pageNumber, HttpServletRequest request){
        Map<String,Object> map=customerService.customerPageList(pageNumber);
        map.put("url","/customer/customerPageList?");
        request.setAttribute("Map",map);
        return "showCustomer";
    }
}
