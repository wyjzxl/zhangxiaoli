package cn.itrip.search.service;

import cn.itrip.beans.dto.Dto;
import cn.itrip.search.vo.HotHotelVo;
import cn.itrip.search.vo.HotelInformationVo;

public interface SearchService {
    /**
     * 查询所有酒店
     * @param hotelInformationVo
     * @return
     */
    Dto searchItripHotelPage(HotelInformationVo hotelInformationVo);

    /**
     * 查询热点酒店
     * @param hotHotelVo
     * @return
     */
    Dto searchItripHotelListByHotCity(HotHotelVo hotHotelVo);
}
