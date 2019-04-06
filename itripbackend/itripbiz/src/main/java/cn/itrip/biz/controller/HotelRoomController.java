package cn.itrip.biz.controller;

import cn.itrip.beans.dto.Dto;
import cn.itrip.biz.service.HotelRoomService;
import cn.itrip.beans.vo.HotelRoom;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/hotelroom/")
public class HotelRoomController {
    @Resource
    private HotelRoomService hotelRoomService;
    @PostMapping(value = "queryhotelroombyhotel",headers = "token")
    public Dto queryhotelroombyhotel(@RequestBody HotelRoom hotelRoom){
        System.out.println("进入请求!");
        return hotelRoomService.queryhotelroombyhotel(hotelRoom);
    }


    @GetMapping(value = "getimg/{targetId}",headers ="token")
    public Dto getimg(@PathVariable(name = "targetId",required =true) Integer id){
        return hotelRoomService.getimg(id);
    }
    @GetMapping(value = "queryhotelroombed",headers ="token")
    public Dto queryhotelroombed(){
        return hotelRoomService.queryhotelroombed();
    }
}
