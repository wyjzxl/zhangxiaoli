package cn.itrip.search.vo;

import lombok.Data;

import java.util.Date;

/*checkInDate: 1551697218274, checkOutDate: 1551783618274, keywords: "", hotelLevel: "", featureIds: "",…}
        checkInDate: 1551697218274
        checkOutDate: 1551783618274
        destination: "北京市"
        featureIds: ""
        hotelLevel: ""
        keywords: ""
//酒店信息VO*/

@Data
public class HotelInformationVo {
    //("[必填] 目的地")
    private String destination;
    //("[非必填] 酒店级别(1-5)")
    private Integer hotelLevel;
    //("[非必填] 关键词")
    private String keywords;
    //("[非必填] 商圈id(每次只能选一个)")
    private String tradeAreaIds;
    //("[非必填] 最低价")
    private Double minPrice;
    //("[非必填] 最高价")
    private Double maxPrice;
    //("[非必填] 酒店特色id(每次只能选一个)")
    private String featureIds;
    //("[非必填] 按照某个字段升序,取值为(isOkCount或avgScore或minPrice或hotelLevel)")
    private String ascSort;
    //("[非必填] 按照某个字段降序,取值为(isOkCount或avgScore或minPrice或hotelLevel)")
    private String  descSort;
    //("[非必填] 入住日期")
    private Date checkInDate;
    //("[非必填] 退房日期")
    private Date checkOutDate;
}
