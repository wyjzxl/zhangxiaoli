package cn.itrip.search.controller;

import cn.itrip.beans.dto.Dto;
import cn.itrip.search.service.SearchService;
import cn.itrip.search.vo.HotHotelVo;
import cn.itrip.search.vo.HotelInformationVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/hotellist/")
public class SearchController {
    @Resource
    private SearchService searchService;

    /**
     * 查询所有酒店
     * @param hotelInformationVo
     * @return
     */
    @PostMapping("searchItripHotelPage")
    private Dto searchitriphotelpage(@RequestBody HotelInformationVo hotelInformationVo){
        return searchService.searchItripHotelPage(hotelInformationVo);
    }

    /**
     * 查询热点酒店
     * @param hotHotelVo
     * @return
     */
    @PostMapping("searchItripHotelListByHotCity")
    private Dto searchitriphotellistbyhotcity(@RequestBody HotHotelVo hotHotelVo){
        return searchService.searchItripHotelListByHotCity(hotHotelVo);
    }



}
