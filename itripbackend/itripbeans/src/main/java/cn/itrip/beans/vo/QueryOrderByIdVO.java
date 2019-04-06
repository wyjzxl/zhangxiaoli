package cn.itrip.beans.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/3/9
 * Time: 19:31
 */
@Data
public class QueryOrderByIdVO {
    private Long bookType;
    private Long bookingDays;
    private Date checkInDate;
    private Date checkOutDate;
    private Long count;
    private Long hotelId;
    private String hotelName;
    private Integer id;
    private String invoiceHead;
    private Long invoiceType;
    private Long isNeedInvoice;
    private List<OrderLinkUserListVO> itripOrderLinkUserList;
    private String linkUserName;
    private String noticeEmail;
    private Long noticePhone;
    private String orderNo;
    private Long orderType;
    private Long payType;
    private Long roomId;
    private String specialRequirement;

}
