package cn.itrip.mapper;

import cn.itrip.beans.pojo.HotelOrder;
import cn.itrip.beans.pojo.HotelOrderExt;
import cn.itrip.beans.pojo.HotelTempStore;
import cn.itrip.beans.pojo.OrderVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

public interface HotelTempStoreMapper extends Mapper<HotelTempStore> {
    String selectHotelName(Integer hotelId);
    double selectPrice(HotelOrder hotelOrder);
    int selectRecord(HotelOrder hotelOrder);
    int selectMinScore(HotelOrder hotelOrder);
    int selectNoPayOrder(HotelOrder hotelOrder);
    int updateStoreWhilePreOrder(OrderVo orderVo);
    Integer callPre_flush_store(HotelOrderExt hotelOrder);
    Integer selectStoreByDate(@Param("hotelId") Long hotelId, @Param("roomId") Long roomId, @Param("tempDate") Date tempDate);

    int updateTempStoreByOrder(@Param("hotelId") Long hotelId, @Param("roomId") Long roomId,@Param("tempDate") Date tempDate,@Param("store") int store);
}