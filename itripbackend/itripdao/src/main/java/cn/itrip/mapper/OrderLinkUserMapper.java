package cn.itrip.mapper;

import cn.itrip.beans.pojo.ItripOrderLinkUser;
import cn.itrip.beans.vo.OrderLinkUserListVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrderLinkUserMapper extends Mapper<ItripOrderLinkUser> {
    List<OrderLinkUserListVO> getOrderInfoList(Integer orderId);

}