package cn.itrip.mapper;


import cn.itrip.beans.vo.HotelRoom;
import cn.itrip.beans.vo.HotelRoomVo;

import java.util.List;

public interface RoomMapper {
    List<HotelRoomVo> queryhotelroombyhotel(HotelRoom hotelRoom);

}
