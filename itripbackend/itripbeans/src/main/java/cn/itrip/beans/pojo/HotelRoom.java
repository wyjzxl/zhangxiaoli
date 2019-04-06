package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Data
@Table(name = "itrip_hotel_room")

public class HotelRoom {
    @Id
    private Long id;

    private Long hotelId;

    private String roomTitle;

    private BigDecimal roomPrice;

    private Long roomBedTypeId;

    private Integer isHavingBreakfast;

    private Integer payType;

    private Long satisfaction;

    private Integer isBook;

    private Integer isCancel;

    private Integer isTimelyResponse;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;
}