package cn.itrip.beans.vo;

import lombok.Data;

import java.util.Date;
/*endDate: "2019-03-10T14:21:40.000Z"
hotelId: "3"
isBook: null
isCancel: null
isHavingBreakfast: null
isTimelyResponse: null
payType: null
roomBedTypeId: null
startDate: "2019-03-09T14:21:40.000Z"*/
@Data
public class HotelRoom {
    private Date endDate;
    private Integer hotelId;
    private Integer isBook;
    private Integer isCancel;
    private Integer isHavingBreakfast;
    private Integer isTimelyResponse;
    private Integer payType;
    private Integer roomBedTypeId;
    private Date startDate;
}
