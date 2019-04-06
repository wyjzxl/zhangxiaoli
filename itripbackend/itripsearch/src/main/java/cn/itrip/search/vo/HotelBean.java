package cn.itrip.search.vo;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

/*
"address":"北京 东城区 前门东大街3号 ，近正义路。"
,"avgScore":4.3,
"commentCount":18,
"extendPropertyNames":"有无线上网,免费停车,提供餐饮",
"extendPropertyPics":"fa fa-wifi,fa fa-product-hunt,icon-food",
"featureNames":"东南亚风情,休闲度假,亲子时刻,会议酒店",
"hotelLevel":5,
"hotelName":"北京首都大酒店",
"id":1,
"imgUrl":"http://img.itrip.project.bdqn.cn/hotel/8-4567454545412-4567891.jpg",
"isOkCount":0,
"maxPrice":1677.0,
"minPrice":605.0,
"redundantCityName":"北京市",
"redundantCountryName":"中国",
"redundantProvinceName":"北京市",
"tradingAreaNames":"前门"
*/
@Data
public class HotelBean implements Serializable {
    @Field
    private Long id;

    @Field
    private String hotelName;

    @Field
    private String address;

    @Field
    private Integer hotelLevel;

    @Field
    private String redundantCityName;

    @Field
    private String redundantProvinceName;

    @Field
    private String redundantCountryName;

    @Field
    private Double maxPrice;

    @Field
    private Double minPrice;

    @Field
    private String extendPropertyNames;

    @Field
    private String extendPropertyPics;

    @Field
    private String tradingAreaNames;

    @Field
    private String featureNames;

    @Field
    private int isOkCount;

    @Field
    private int commentCount;

    @Field
    private Double avgScore;

    @Field
    private String imgUrl;
}
