package cn.com.guimei.controller;

import cn.com.guimei.pojo.Superuser;
import cn.com.guimei.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    AdminService adminService;
    @RequestMapping("/login")
    public String adminLogin(String userLoginName, String userPassword, HttpServletRequest request){
        Superuser superuser=adminService.adminLogin(userLoginName,userPassword);
        if(superuser==null){
            request.setAttribute("error","您输入的密码有误!");
            return InternalResourceViewResolver.FORWARD_URL_PREFIX+"/Login.jsp";
        }
        request.getSession().setAttribute("Superuser",superuser);
        return "index";
    }
}
