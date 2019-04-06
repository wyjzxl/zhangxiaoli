package cn.itrip.biz.controller;

import cn.itrip.beans.dto.Dto;
import cn.itrip.biz.service.BizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/hotel/")
public class BizController {
    @Resource
    private BizService bizService;
    @GetMapping("querytradearea/{targetId}")
    public Dto querytradearea(@PathVariable(name = "targetId",required =true) Integer id){
        return bizService.querytradearea(id);
    }

    @GetMapping("queryhotcity/{targetId}")
    public Dto queryhotcity(@PathVariable(name = "targetId",required =true) Long id){
        return bizService.queryhotcity(id);
    }




    /**
     * 酒店政策
     * @param id
     * @return
     */
    @GetMapping(value = "queryhotelpolicy/{targetId}",headers ="token")
    public Dto queryhotelpolicy(@PathVariable(name = "targetId",required =true) Integer id){

        return bizService.queryhotelpolicy(id);
    }





    /**
     * 酒店设施
     * @param hotelId
     * @param request
     * @return
     */
    @GetMapping(value = "queryhotelfacilities/{hotelId}",headers = "token")
    public Dto queryhotelfacilities(@PathVariable("hotelId") Long hotelId, HttpServletRequest request){
        return bizService.queryhotelfacilities(hotelId);
    }
    @GetMapping("queryhotelfeature")
    public Dto queryhotelfeature(){
        return bizService.queryhotelfeature();
    }

    @GetMapping(value = "queryhoteldetails/{targetId}",headers ="token")
    public Dto queryhoteldetails(@PathVariable(name = "targetId",required =true) Integer id){
        return bizService.queryhoteldetails(id);
    }
    /**
     * 视频中的地址
     * @param targetId
     * @return
     */
    @GetMapping(value = "getvideodesc/{targetId}",headers = "token")
    public Dto getvideodesc(@PathVariable(name = "targetId",required =true) Integer targetId){
        return bizService.getvideodesc(targetId);
    }
    @GetMapping("getimg/{hotelId}")
    public Dto getImg(@PathVariable("hotelId")Integer hotelId){
        return bizService.getImg(hotelId);
    }
}