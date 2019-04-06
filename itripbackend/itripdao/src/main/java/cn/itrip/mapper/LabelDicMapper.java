package cn.itrip.mapper;

import cn.itrip.beans.pojo.LabelDic;
import cn.itrip.beans.vo.HotelDetails;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface LabelDicMapper extends Mapper<LabelDic> {
    List<HotelDetails> queryhoteldetail(Integer hotelId);
    String queryDetail(Integer hotelId);
    List<LabelDic> queryhotelroombed();

}