package cn.itrip.auth.controller;

import cn.itrip.auth.service.UserService;
import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.User;
import cn.itrip.beans.vo.ItripToken;
import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Resource
    private UserService userService;

    /**
     *查重
     * @param name
     * @return
     * @throws MessagingException
     */
    @GetMapping("ckusr")
    public Dto isExists(String name)throws MessagingException{
        return userService.isExists(name);
    }

    /**
     * 邮箱注册
     * @param user
     * @return
     * @throws MessagingException
     */
    @PostMapping("doregister")
    public Dto regedisterByEmail(@RequestBody User user) throws MessagingException {
        return  userService.register(user);
    }

    /**
     * 手机号码注册
     * @param user
     * @return
     */
    @PostMapping("registerbyphone")
    private Dto registerbyphone(@RequestBody User user){
        return userService.registerbyphone(user);
    }

    /**
     * 手机号码或者邮箱激活
     * @param user
     * @param code
     * @return
     */
    @PutMapping("activate")
    private Dto activate(String user,String code ){
        return userService.activate(user,code);
    }


    @PutMapping("validatephone")
    private Dto validatephone(String user,String code ){
        return userService.validatephone(user,code);
    }

    /**
     * 登陆
     * @param name
     * @param password
     * @param device
     * @return
     */
    @PostMapping("dologin")
    private Dto dologin(String name, String password, Device device ){
        String fromType="pc";
        if(!device.isNormal()){
            fromType="mobile";
        }
        return userService.dologin(name,password,fromType);

    }

    /**
     * 注销
     * @param httpServletRequest
     * @return
     */
    @GetMapping(value = "logout",headers = "token")
    private Dto logout(HttpServletRequest httpServletRequest){
        String token=httpServletRequest.getHeader("token");
        return userService.logout(token);
    }

    /**
     * 置换token
     * @param httpServletRequest
     * @return
     */
    @PostMapping(value = "retoken",headers = "token")
    private Dto<ItripToken> retoken(HttpServletRequest httpServletRequest){
        String token=httpServletRequest.getHeader("token");
        return userService.retoken(token);
    }


}
