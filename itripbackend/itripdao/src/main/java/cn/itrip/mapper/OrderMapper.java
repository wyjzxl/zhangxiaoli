package cn.itrip.mapper;

import cn.itrip.beans.pojo.*;
import cn.itrip.beans.vo.AddOrderNoVO;
import cn.itrip.beans.vo.PerOrderInfoVO;
import cn.itrip.beans.vo.PersonalOrderInfoVO;
import cn.itrip.beans.vo.QueryOrderByIdVO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface OrderMapper extends Mapper<Order> {
    long insertOrder(Order order);
    int updateScore(@Param("count") Integer count,@Param("checkInDate")Date checkInDate,@Param("roomId")Integer roomId,@Param("hotelId")Integer hotelId);
    GetOrderRoomInfoVO getOrderRoomId(Integer id);
    ItripHotel getAddress(Integer hotelId);
    ItripHotelRoom getRoomInfo(Integer roomId);
    ItripLabelDic getBedName(Integer roomBedTypeId);
    PersonalOrderInfoVO getOrderId(Integer id);
    QueryOrderByIdVO queryOrderById(Integer id);
    ItripHotelRoom  selectRoom(Integer roomId);
    PerOrderInfoVO roomInfo(Integer roomId);
    Integer getScore(@Param("roomId") Integer roomId,@Param("checkInDate") Date checkInDate,@Param("checkOutDate")Date checkOutDate);
    Integer getCount(@Param("roomId") Integer roomId,@Param("checkInDate") Date checkInDate,@Param("checkOutDate")Date checkOutDate);
    int updateStatus(@Param("orderStatus")Integer orderStatus,@Param("tradeNo")String tradeNo,@Param("orderNo")String orderNo);


    double selectHotelPrice(Order order);
    int insertOrderLinkUser(OrderLinkUser h);
    List<LinkUserInfo> getUserInfo(Integer id);
    OrderE getInfo(Integer id);
    int addOrder(@Param("pojo") AddOrderNoVO pojo);
    PersonalOrderRoomInfo getPersonalOrder(Integer id);
    Long selectOrderIdByOrderNo(String orderNo);
    ItripHotelOrder getOrderNo(String orderNo);
    Integer getPreStore(@Param("checkInDate") Date checkInDate, @Param("checkOutDate") Date checkOutDate, @Param("roomId")Integer roomId, @Param("hotelId")Integer hotelId);

}