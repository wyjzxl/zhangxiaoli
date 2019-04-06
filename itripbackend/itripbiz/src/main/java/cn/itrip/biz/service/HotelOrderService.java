package cn.itrip.biz.service;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.vo.AddOrderNoVO;
import cn.itrip.beans.vo.PerOrderInfoVO;
import cn.itrip.biz.vo.PersonalorderlistVo;

public interface HotelOrderService {
    Dto getpreorderinfo(PerOrderInfoVO perOrderInfoVO, String token);
    Dto getpersonalorderlist(PersonalorderlistVo personalorderlistVo);
    Dto getpersonalorderroominfo(Long id,String token);
    Dto addhotelorder(AddOrderNoVO addOrderNoVO, String token);
    Dto queryOrderById(Integer id,String token);
    Dto getpersonalorderinfo(Integer id,String token);
}
