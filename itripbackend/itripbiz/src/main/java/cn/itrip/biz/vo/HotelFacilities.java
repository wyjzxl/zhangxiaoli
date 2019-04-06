package cn.itrip.biz.vo;

import lombok.Data;

import java.util.List;

@Data
public class HotelFacilities {
    private String rooName;
    private List<HotelFacility> leafs;
}
