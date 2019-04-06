package cn.itrip.mapper;

import cn.itrip.beans.pojo.HotelRoom;
import cn.itrip.beans.pojo.ItripHotelRoom;
import tk.mybatis.mapper.common.Mapper;

public interface HotelRoomMapper extends Mapper<HotelRoom> {
    Double getRoomPrice(Long roomId);
    ItripHotelRoom getRoomId(Long roomId);
}