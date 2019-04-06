package cn.itrip.beans.pojo;

import lombok.Data;

import java.util.List;

@Data
public class OrderE {
    private String specialRequirement;
    private Long roomId;
    private Integer payType;
    private Integer orderType;
    private String orderNo;
    private String noticePhone;
    private String noticeEmail;
    private String linkUserName;
    private List<LinkUserInfo> itripOrderLinkUserList;
    private Integer isNeedInvoice;
    private Integer bookType;
    private Integer bookingDays;
    private String checkInDate;
    private String checkOutDate;
    private Integer count;
    private Long hotelId;
    private String hotelName;
    private Long id;
    private Integer invoiceType;

    private String invoiceHead;
}
