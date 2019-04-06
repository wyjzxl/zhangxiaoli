package cn.itrip.beans.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class AddOrderNoVO {
    private List<UserLinkUserVO> linkUser;
    private Long id;	 // 主键
    private Long userId;	 // 用户id
    private Integer orderType;	 // 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
    private String orderNo;	 // 订单号
    private String tradeNo;	 // 交易编号
    private Long hotelId;	 // 冗余字段 酒店id
    private String hotelName;	 // 冗余字段 酒店名称
    private Long roomId;	 // 房间id
    private Long count;	 // 消耗数量
    private Long bookingDays;	 // 预订天数
    private Date checkInDate;	 // 入住时间
    private Date checkOutDate;	 // 退房时间
    private Integer orderStatus;	 // 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
    private Double payAmount;	 // 支付金额
    private Long payType;	 // 支付方式:1:支付宝 2:微信 3:到店付
    private String noticePhone;	 // 联系手机号
    private String noticeEmail;	 // 联系邮箱
    private String specialRequirement;	 // 特殊需求
    private Long isNeedInvoice;	 // 是否需要发票（0：不需要 1：需要）
    private Long invoiceType;	 // 发票类型（0：个人 1：公司）
    private String invoiceHead;	 // 发票抬头
    private String linkUserName;	 // 入住人名称
    private Long bookType;	 // 0:WEB端 1:手机端 2:其他客户端
    private Date creationDate;	 // 预定时间
    private Long createdBy;
    private Date modifyDate;	 // 支付完成时间
    private Long modifiedBy;
     /*private Date checkInDate;
    private Date checkOutDate;
    private Integer count;
    private Integer hotelId;
    private String hotelName;
    private Integer invoiceHead; //发票头
    private Integer invoiceType;//发票类型
    private Integer isNeedInvoice;//是否需要发票
    private String noticeEmail;
    private String noticePhone;
    private Integer orderType;
    private Integer roomId;
    private Integer specialRequirement;//特殊需求*/
}
