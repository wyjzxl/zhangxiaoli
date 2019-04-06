package cn.itrip.biz.controller;

import cn.itrip.beans.dto.Dto;
import cn.itrip.biz.service.UserInfoSerivce;
import cn.itrip.biz.vo.LinkUserVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/userinfo/")
public class UserInfoController {
    @Resource
    private UserInfoSerivce userInfoSerivce;
    @PostMapping(value = "queryuserlinkuser",headers = "token")
    public Dto queryuserlinkuser( String linkUserName ){

        return userInfoSerivce.queryuserlinkuser(linkUserName);
    }

    @PostMapping(value = "adduserlinkuser",headers = "token")
    public Dto adduserlinkuser(@RequestBody LinkUserVo linkUserVo){

        return userInfoSerivce.adduserlinkuser(linkUserVo);
    }
    @GetMapping(value = "deluserlinkuser",headers = "token")
    public Dto deluserlinkuser(Integer ids ){//可以接收数组,八大基本类型可以自动转

        return userInfoSerivce.deluserlinkuser(ids);
    }
    @PostMapping(value = "modifyuserlinkuser",headers = "token")
    public Dto modifyuserlinkuser(@RequestBody LinkUserVo linkUserVo){

        return userInfoSerivce.modifyuserlinkuser(linkUserVo);
    }
}
