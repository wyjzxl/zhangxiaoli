package cn.itrip.biz.controller;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.vo.AddOrderNoVO;
import cn.itrip.beans.vo.PerOrderInfoVO;
import cn.itrip.biz.service.HotelOrderService;
import cn.itrip.biz.vo.PersonalorderlistVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/hotelorder/")
public class HotelOrderController {
    @Resource
    private HotelOrderService hotelOrderService;
    @PostMapping(value = "getpreorderinfo",headers = "token")
    public Dto getpreorderinfo(@RequestBody PerOrderInfoVO perOrderInfoVO, HttpServletRequest request){
        String token=request.getHeader("token");
        return hotelOrderService.getpreorderinfo(perOrderInfoVO,token);
    }
    @PostMapping(value = "getpersonalorderlist",headers  ="token")
    public Dto getpersonalorderlist(@RequestBody PersonalorderlistVo personalorderlistVo){
        return hotelOrderService.getpersonalorderlist(personalorderlistVo);
    }
    @GetMapping(value = "getpersonalorderroominfo/{targetId}",headers ="token")
    public Dto getpersonalorderroominfo(@PathVariable(name = "targetId",required =true) Long id, HttpServletRequest request){
        String token=request.getHeader("token");

        return hotelOrderService.getpersonalorderroominfo(id,token);
    }
    @PostMapping(value = "addhotelorder",headers  ="token")
    public Dto addhotelorder(@RequestBody AddOrderNoVO addOrderNoVO, HttpServletRequest httpServletRequest){
        String token=httpServletRequest.getHeader("token");
        return hotelOrderService.addhotelorder(addOrderNoVO,token);
    }
    @GetMapping(value = "queryOrderById/{targetId}",headers ="token")
    public Dto queryOrderById(@PathVariable(name = "targetId",required =true) Integer id,HttpServletRequest request){
        String token=request.getHeader("token");

        return hotelOrderService.queryOrderById(id,token);
    }
    @GetMapping(value = "getpersonalorderinfo/{targetId}",headers ="token")
    public Dto getpersonalorderinfo(@PathVariable(name = "targetId",required =true) Integer id,HttpServletRequest request){
        String token=request.getHeader("token");
        return hotelOrderService.getpersonalorderinfo(id,token);
    }


}
