package cn.itrip.biz.service;

import cn.itrip.beans.dto.Dto;

public interface BizService {
    Dto querytradearea(Integer id);
    Dto queryhotelfeature();
    Dto queryhotcity(Long id);
    Dto getvideodesc(Integer id);
    Dto queryhoteldetails(Integer id);
    Dto queryhotelpolicy(Integer id);
    Dto queryhotelfacilities(Long id);
    Dto getImg(Integer hotelId);
}
