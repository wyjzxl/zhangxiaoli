package cn.itrip.mapper;

import cn.itrip.beans.pojo.OrderVo;
import tk.mybatis.mapper.common.Mapper;

public interface PreOrderVoMapper extends Mapper<OrderVo> {
    OrderVo getPreOrderVo(OrderVo preOrderVo);
    int getTempStore(OrderVo preOrderVo);
}
