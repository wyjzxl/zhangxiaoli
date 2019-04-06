package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "itrip_hotel_order")

public class Order {
    @Id
    private Long id;

    private Long userId;

    private Integer orderType;

    private String orderNo;

    private String tradeNo;

    private Long hotelId;

    private String hotelName;

    private Long roomId;

    private Integer count;

    private Integer bookingDays;

    private Date checkInDate;

    private Date checkOutDate;

    private Integer orderStatus;

    private Double payAmount;

    private Integer payType;

    private String noticePhone;

    private String noticeEmail;

    private Integer isNeedInvoice;

    private Integer invoiceType;

    private String invoiceHead;

    private String linkUserName;

    private Integer bookType;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    private String specialRequirement;

}