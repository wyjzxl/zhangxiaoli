package cn.itrip.beans.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class OrderRoomInfo {
    private String address;
    private Integer bookingDays;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date checkInDate;
    private Integer checkInWeek;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date checkOutDate;
    private Integer checkOutWeek;
    private Integer count;
    private Long hotelId;
    private Integer hotelLevel;
    private String hotelName;
    private Long id;
    private Integer isHavingBreakfast;
    private String linkUserName;
    private Double payAmount;
    private Integer roomBedTypeId;
    private String roomBedTypeName;
    private Long roomId;
    private Integer roomPayType;
    private String roomTitle;
    private String specialRequirement;
}
