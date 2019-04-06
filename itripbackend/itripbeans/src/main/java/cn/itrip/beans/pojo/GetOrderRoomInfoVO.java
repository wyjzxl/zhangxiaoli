package cn.itrip.beans.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/3/9
 * Time: 15:48
 */
@Data
public class GetOrderRoomInfoVO {
    private String address;
    private Integer bookingDays;
    private String checkInDate;
    private Integer checkInWeek;
    private String checkOutDate;
    private Integer checkOutWeek;
    private Integer count;
    private Integer hotelId;
    private Long hotelLevel;
    private String hotelName;
    private Integer id;
    private Integer isHavingBreakfast;
    private String linkUserName;
    private Double payAmount;
    private Long roomBedTypeId;
    private String roomBedTypeName;
    private Integer roomId;
    private Long roomPayType;
    private String roomTitle;
    private String  specialRequirement;
    private Date checkInDateTemp;
    private Date checkOutDateTemp;
}
