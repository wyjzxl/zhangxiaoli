package cn.itrip.beans.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-02-14 
 */
@Table(name = "itrip_hotel_order")
@NameStyle(Style.normal)
public class ItripHotelOrder implements Serializable {

	private static final long serialVersionUID =  6155048631509668118L;
	@Id
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
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getOrderType() {
		return this.orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Long getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Long getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getBookingDays() {
		return this.bookingDays;
	}

	public void setBookingDays(Long bookingDays) {
		this.bookingDays = bookingDays;
	}

	public Date getCheckInDate() {
		return this.checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return this.checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public Long getPayType() {
		return this.payType;
	}

	public void setPayType(Long payType) {
		this.payType = payType;
	}

	public String getNoticePhone() {
		return this.noticePhone;
	}

	public void setNoticePhone(String noticePhone) {
		this.noticePhone = noticePhone;
	}

	public String getNoticeEmail() {
		return this.noticeEmail;
	}

	public void setNoticeEmail(String noticeEmail) {
		this.noticeEmail = noticeEmail;
	}

	public String getSpecialRequirement() {
		return this.specialRequirement;
	}

	public void setSpecialRequirement(String specialRequirement) {
		this.specialRequirement = specialRequirement;
	}

	public Long getIsNeedInvoice() {
		return this.isNeedInvoice;
	}

	public void setIsNeedInvoice(Long isNeedInvoice) {
		this.isNeedInvoice = isNeedInvoice;
	}

	public Long getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(Long invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceHead() {
		return this.invoiceHead;
	}

	public void setInvoiceHead(String invoiceHead) {
		this.invoiceHead = invoiceHead;
	}

	public String getLinkUserName() {
		return this.linkUserName;
	}

	public void setLinkUserName(String linkUserName) {
		this.linkUserName = linkUserName;
	}

	public Long getBookType() {
		return this.bookType;
	}

	public void setBookType(Long bookType) {
		this.bookType = bookType;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Long getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
