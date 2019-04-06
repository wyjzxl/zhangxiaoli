package cn.itrip.beans.vo;

import lombok.Data;

import java.math.BigDecimal;

/*"hotelId": 3,
        "id": 10,
        "isBook": 1,
        "isCancel": 1,
        "isHavingBreakfast": 1,
        "isTimelyResponse": 1,
        "payType": 1,
        "roomBedTypeId": 3,
        "roomPrice": 379.00,
        "roomTitle": "精选印象房",
        "satisfaction": 4.0*/
@Data
public class HotelRoomVo {
    private long hotelId;
    private long id;
    private int isBook;
    private int isCancel;
    private int isHavingBreakfast;
    private int isTimelyResponse;
    private int payType;
    private int roomBedTypeId;
    private double roomPrice;
    private String roomTitle;
    private BigDecimal satisfaction;
}
