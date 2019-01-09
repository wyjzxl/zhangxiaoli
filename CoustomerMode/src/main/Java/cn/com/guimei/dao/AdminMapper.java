package cn.com.guimei.dao;

import cn.com.guimei.pojo.Superuser;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    public Superuser adminLogin(@Param("userLoginName") String name,@Param("userPassword") String pwd);
}
