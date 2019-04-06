package cn.itrip.mapper;

import cn.itrip.beans.pojo.Hotel;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Map;

public interface HotelMapper extends Mapper<Hotel> {
    String queryhotelfacilities(@Param("fId") Long id);
    String queryhotelpolicy(@Param("fId") Integer id);
    Map<String, Object> selectHotelById(@Param("hotelId") Long hotelId);

}