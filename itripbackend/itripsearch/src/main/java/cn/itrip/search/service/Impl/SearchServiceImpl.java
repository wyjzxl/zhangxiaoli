package cn.itrip.search.service.Impl;

import cn.itrip.beans.dto.Dto;
import cn.itrip.search.service.SearchService;
import cn.itrip.search.vo.HotHotelVo;
import cn.itrip.search.vo.HotelBean;
import cn.itrip.search.vo.HotelInformationVo;
import cn.itrip.search.vo.PageUtil;
import cn.itrip.util.DtoUtil;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service
public class SearchServiceImpl implements SearchService {
    @Resource
    private SolrTemplate solrTemplate;
    @Override
    public Dto searchItripHotelPage(HotelInformationVo hotelInformationVo) {
        System.out.println("hotelInformationVo"+hotelInformationVo);
        Query query=new SimpleQuery("*:*");
        Criteria criteria=new Criteria("id");

        if(!StringUtils.isEmpty(hotelInformationVo.getAscSort()) && hotelInformationVo.getAscSort()!=null ){
            query.addSort(new Sort(new Sort.Order(Sort.Direction.ASC,hotelInformationVo.getAscSort())));
        }

        if(!StringUtils.isEmpty(hotelInformationVo.getDescSort()) && hotelInformationVo.getDescSort()!=null){
            query.addSort(new Sort(new Sort.Order(Sort.Direction.DESC,hotelInformationVo.getDescSort())));
        }


        if(!StringUtils.isEmpty(hotelInformationVo.getDestination())){
            criteria=criteria.and("redundantCityName").is(hotelInformationVo.getDestination());
        }
        if(!ObjectUtils.isEmpty(hotelInformationVo.getFeatureIds()) && hotelInformationVo.getFeatureIds()!=null ){
            criteria=criteria.and("featureIds").contains(hotelInformationVo.getFeatureIds());
        }
        if(hotelInformationVo.getHotelLevel()!=null && hotelInformationVo.getHotelLevel()>0 ){
            criteria=criteria.and("hotelLevel").is(hotelInformationVo.getHotelLevel());
        }
        if(!StringUtils.isEmpty(hotelInformationVo.getKeywords()) && !"".equals(hotelInformationVo.getKeywords()) ){
            criteria=criteria.and("keywords").contains(hotelInformationVo.getKeywords());
        }

        if(!ObjectUtils.isEmpty(hotelInformationVo.getMinPrice()) &&  !ObjectUtils.isEmpty(hotelInformationVo.getMaxPrice())){
            criteria = criteria.and("minPrice").between(hotelInformationVo.getMinPrice(), hotelInformationVo.getMaxPrice());
        }else {
            criteria = criteria.and("minPrice").between(0, 10000);
        }

        if(!StringUtils.isEmpty(hotelInformationVo.getTradeAreaIds()) && hotelInformationVo.getTradeAreaIds()!=""){
            criteria=criteria.and("tradeAreaIds").contains(hotelInformationVo.getTradeAreaIds());
        }
        query.addCriteria(criteria);
        ScoredPage<HotelBean> scorePage= solrTemplate.queryForPage("hotel",query, HotelBean.class);
        PageUtil pageUtil=new PageUtil();
        pageUtil.setPageSize(scorePage.getSize());
        pageUtil.setBeginPos((scorePage.getNumber()-1)*scorePage.getNumber());
        pageUtil.setCurPage(scorePage.getNumber());
        pageUtil.setRows(scorePage.getContent());
        pageUtil.setTotal(scorePage.getTotalElements());
        pageUtil.setPageCount(scorePage.getTotalPages());

        return DtoUtil.getSuccesWithData(pageUtil,"发送成功!");


    }

    /**
     * 查询热点酒店
     * @param hotHotelVo
     * @return
     */
    @Override
    public Dto searchItripHotelListByHotCity(HotHotelVo hotHotelVo) {
        Query query=new SimpleQuery("*:*");
        Criteria criteria=new Criteria("id");

        if(!ObjectUtils.isEmpty(hotHotelVo.getCityId()) && hotHotelVo.getCityId()>0){
            criteria=criteria.and("cityId").is(hotHotelVo.getCityId());
        }
        if(!StringUtils.isEmpty(String.valueOf(hotHotelVo.getCount()))){
            query.setRows(hotHotelVo.getCount());
        }

        query.addCriteria(criteria);
        ScoredPage<HotelBean> scoredPage=solrTemplate.queryForPage("hotel",query,HotelBean.class);
        return DtoUtil.getSuccesWithData(scoredPage.getContent(),"查询成功！");
    }
}
