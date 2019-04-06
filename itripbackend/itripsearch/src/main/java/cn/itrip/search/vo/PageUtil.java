package cn.itrip.search.vo;

import lombok.Data;

import java.util.List;

/*
{"data":{"beginPos":0,"curPage":1,"pageCount":1,"pageSize":10,"rows":[{"address":"北京 朝阳区 紫玉东路1号 ，近北辰购物中心。","avgScore":3.0,"commentCount":2,"extendPropertyNames":"免费停车","extendPropertyPics":"fa fa-product-hunt","featureNames":"商务出行,青年旅社,会议酒店,亲子时刻","hotelLevel":3,"hotelName":"北京紫玉度假酒店","id":3,"imgUrl":"http://img.itrip.project.bdqn.cn/hotel/8-4567454545412-4567893.jpg","isOkCount":0,"maxPrice":379.0,"minPrice":275.0,"redundantCityName":"北京市","redundantCountryName":"中国","redundantProvinceName":"北京市","tradingAreaNames":"亚运村、奥体中心地区"},{"address":"北京 东城区 前门东大街3号 ，近正义路。","avgScore":4.4,"commentCount":11,"extendPropertyNames":"有无线上网,免费停车,提供餐饮","extendPropertyPics":"fa fa-wifi,fa fa-product-hunt,icon-food","featureNames":"东南亚风情,休闲度假,亲子时刻,会议酒店","hotelLevel":5,"hotelName":"北京首都大酒店","id":1,"imgUrl":"http://img.itrip.project.bdqn.cn/hotel/8-4567454545412-4567891.jpg","isOkCount":0,"maxPrice":1677.0,"minPrice":605.0,"redundantCityName":"北京市","redundantCountryName":"中国","redundantProvinceName":"北京市","tradingAreaNames":"前门"},{"address":"北京 朝阳区 北沙滩大屯路甲1号 ，近北沙滩桥东南角。","avgScore":5.0,"commentCount":0,"extendPropertyNames":"有无线上网,免费停车,提供餐饮","extendPropertyPics":"fa fa-wifi,fa fa-product-hunt,icon-food","featureNames":"商务出行,精品酒店,青年旅社,会议酒店,休闲度假,东南亚风情","hotelLevel":4,"hotelName":"北京亚奥国际酒店","id":7,"imgUrl":"http://img.itrip.project.bdqn.cn/hotel/8-4567454545412-4567897.jpg","isOkCount":0,"maxPrice":765.0,"minPrice":487.0,"redundantCityName":"北京市","redundantCountryName":"中国","redundantProvinceName":"北京市","tradingAreaNames":"亚运村、奥体中心地区"},{"address":"北京 西城区 西交民巷甲19号（人民大会堂南门对面） ，近天安门广场。","avgScore":5.0,"commentCount":0,"extendPropertyNames":"有无线上网,免费停车,提供餐饮","extendPropertyPics":"fa fa-wifi,fa fa-product-hunt,icon-food","featureNames":"商务出行,青年旅社,东南亚风情","hotelLevel":5,"hotelName":"人民大会堂宾馆","id":6,"imgUrl":"http://img.itrip.project.bdqn.cn/hotel/8-4567454545412-4567896.jpg","isOkCount":0,"maxPrice":2891.0,"minPrice":1222.0,"redundantCityName":"北京市","redundantCountryName":"中国","redundantProvinceName":"北京市","tradingAreaNames":"前门"},{"address":"北京 东城区 安乐林路10号22号楼 ，地铁14号线，景泰路上，近北京南站、天坛公园、前门崇文门、天坛医院、天桥、木樨园、方庄。","avgScore":5.0,"commentCount":0,"extendPropertyNames":"有无线上网,免费停车","extendPropertyPics":"fa fa-wifi,fa fa-product-hunt","featureNames":"商务出行,精品酒店,青年旅社,会议酒店,东南亚风情","hotelLevel":3,"hotelName":"北京伯豪瑞廷酒店","id":5,"imgUrl":"http://img.itrip.project.bdqn.cn/hotel/8-4567454545412-4567895.jpg","isOkCount":0,"maxPrice":699.0,"minPrice":605.0,"redundantCityName":"北京市","redundantCountryName":"中国","redundantProvinceName":"北京市","tradingAreaNames":"国贸"},{"address":"北京 东城区 安乐林路10号22号楼 ，地铁14号线，景泰路上，近北京南站、天坛公园、前门崇文门、天坛医院、天桥、木樨园、方庄。","avgScore":5.0,"commentCount":0,"extendPropertyNames":"有无线上网,免费停车,提供餐饮","extendPropertyPics":"fa fa-wifi,fa fa-product-hunt,icon-food","featureNames":"商务出行,精品酒店,青年旅社,会议酒店,休闲度假,东南亚风情","hotelLevel":4,"hotelName":"北京天坛和颐酒店","id":4,"imgUrl":"http://img.itrip.project.bdqn.cn/hotel/8-4567454545412-4567894.jpg","isOkCount":0,"maxPrice":2400.0,"minPrice":779.0,"redundantCityName":"北京市","redundantCountryName":"中国","redundantProvinceName":"北京市","tradingAreaNames":"大红门、南苑地区"}],"total":6},"errorCode":"0","msg":null,"success":"true"}
*/
@Data
public class PageUtil<T> {
    private int beginPos;//起始页
    private int curPage;//当前页
    private long pageCount;//总页数
    private int pageSize;//每页条数
    private List<T> rows;
    private long total;//总记录数

}
