package cn.itrip.biz.vo;

import lombok.Data;

import java.util.List;

@Data
public class VideoDescVo {
    private List<String> hotelFeatureList;
    private String hotelName;
    private List<String> tradingAreaNameList;
}
