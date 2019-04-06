package cn.itrip.mapper;

import cn.itrip.beans.pojo.Image;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ImageMapper extends Mapper<Image> {
    List<Image> selectImageById(@Param("hotelId") Integer hotelId);
    @Select("select * from itrip_image ii where ii.`type`=#{type} and ii.`targetId`=#{targetId}")
    List<Image> selectByHotelId(@Param("type") Integer type, @Param("targetId") Integer targetId);
}