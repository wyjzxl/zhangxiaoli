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
@Table(name = "itrip_hotel_room")
@NameStyle(Style.normal)
public class ItripHotelRoom implements Serializable {
	private static final long serialVersionUID =  612357417583070329L;
	@Id
	private Long id;	 // 主键
	private Long hotelId;	 // 酒店ID
	private String roomTitle;	 // 房间名称
	private Double roomPrice;	 // 房间价格
	private Long roomBedTypeId;	 // 酒店床型
	private Integer isHavingBreakfast;	 // 是否包含早餐
	private Long payType;	 // 1:在线付 2:到店付 3:不限
	private Double satisfaction;	 // 满意度（冗余字段，在用户评论后更新）
	private Long isBook;	 // 是否可预订(0:不可以 1:可以)
	private Long isCancel;	 // 是否可取消(0:不可 1:可以)
	private Long isTimelyResponse;	 // 是否及时响应(0:不及时 1:及时)
	private Date creationDate;	private Long createdBy;	private Date modifyDate;	private Long modifiedBy;
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getRoomTitle() {
		return this.roomTitle;
	}

	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}

	public Double getRoomPrice() {
		return this.roomPrice;
	}

	public void setRoomPrice(Double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public Long getRoomBedTypeId() {
		return this.roomBedTypeId;
	}

	public void setRoomBedTypeId(Long roomBedTypeId) {
		this.roomBedTypeId = roomBedTypeId;
	}

	public Integer getIsHavingBreakfast() {
		return this.isHavingBreakfast;
	}

	public void setIsHavingBreakfast(Integer isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}

	public Long getPayType() {
		return this.payType;
	}

	public void setPayType(Long payType) {
		this.payType = payType;
	}

	public Double getSatisfaction() {
		return this.satisfaction;
	}

	public void setSatisfaction(Double satisfaction) {
		this.satisfaction = satisfaction;
	}

	public Long getIsBook() {
		return this.isBook;
	}

	public void setIsBook(Long isBook) {
		this.isBook = isBook;
	}

	public Long getIsCancel() {
		return this.isCancel;
	}

	public void setIsCancel(Long isCancel) {
		this.isCancel = isCancel;
	}

	public Long getIsTimelyResponse() {
		return this.isTimelyResponse;
	}

	public void setIsTimelyResponse(Long isTimelyResponse) {
		this.isTimelyResponse = isTimelyResponse;
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
