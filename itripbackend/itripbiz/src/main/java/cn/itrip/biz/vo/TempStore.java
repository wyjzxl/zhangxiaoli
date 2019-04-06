package cn.itrip.biz.vo;

import lombok.Data;

@Data
public class TempStore {
    private String checkInDate;
    private String checkOutDate;
    private  int count;
    private int hotelId;
    private String hotelName;
    private double price;
    private int roomId;
    private int store;
}
