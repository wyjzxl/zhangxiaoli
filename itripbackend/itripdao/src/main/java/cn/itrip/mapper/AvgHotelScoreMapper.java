package cn.itrip.mapper;

import cn.itrip.beans.pojo.AvgHotelScore;

public interface AvgHotelScoreMapper {
    AvgHotelScore gethotelscore(Integer id);
    AvgHotelScore getcount(Integer id);
}
