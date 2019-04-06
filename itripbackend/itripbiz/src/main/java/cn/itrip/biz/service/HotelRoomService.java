package cn.itrip.biz.service;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.vo.HotelRoom;

public interface HotelRoomService {
    Dto queryhotelroombyhotel(HotelRoom hotelRoom);
    Dto getimg(Integer id);
    Dto queryhotelroombed();
}
