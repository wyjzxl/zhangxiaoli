package cn.itrip.mapper;

import cn.itrip.beans.pojo.AreaDic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaMapper {
    List<AreaDic> selectbyparentId(@Param(value = "parentId") Integer parentId);
    List<AreaDic> queryhotcity(@Param(value = "parentId") Long parentId);
}
