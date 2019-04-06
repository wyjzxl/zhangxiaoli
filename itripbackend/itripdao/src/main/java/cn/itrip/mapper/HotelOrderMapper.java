package cn.itrip.mapper;

import cn.itrip.beans.pojo.HotelOrderExt;
import cn.itrip.beans.vo.OrderRoomInfo;
import org.apache.ibatis.annotations.Param;

public interface HotelOrderMapper {
    HotelOrderExt selectByOrderNo(String orderNo);
    int updateOrder(HotelOrderExt hotelOrder);
    OrderRoomInfo selectPersonalOrderRoomInfo(Long orderId);
    int updateOrderStatusCommented(@Param("orderId") Long orderId);

}