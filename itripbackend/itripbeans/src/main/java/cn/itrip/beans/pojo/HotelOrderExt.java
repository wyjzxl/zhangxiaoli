package cn.itrip.beans.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class HotelOrderExt {
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

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date checkInDate;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
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