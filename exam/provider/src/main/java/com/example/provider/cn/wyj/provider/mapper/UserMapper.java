package com.example.provider.cn.wyj.provider.mapper;

import cn.wyj.common.pojo.New;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {


    @Select("select * from news_detail")
    List<New> queryAll();
}
