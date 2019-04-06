package cn.itrip.mapper;

import java.util.List;

public interface VideoDescMapper {
    List<String> getHotelFeatureList(Integer hotelId);
    List<String> getTradingAreaNameList(Integer hotelId);
    String getHotelName(Integer hotelId);
}
