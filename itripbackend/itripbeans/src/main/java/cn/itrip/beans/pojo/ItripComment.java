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
@Table(name = "itrip_comment")
@NameStyle(Style.normal)
public class ItripComment implements Serializable {

	private static final long serialVersionUID =  7234290014677981157L;
	@Id
	private Long id;	 // 主键
	private Long hotelId;	 // 如果产品是酒店的话 改字段保存酒店id
	private Long productId;	 // 商品id
	private Long orderId;	 // 订单id
	private Long productType;	 // 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
	private String content;	 // 评论内容
	private Long userId;	 // 用户编号
	private Long isHavingImg;	 // 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
	private Long positionScore;	 // 位置评分
	private Long facilitiesScore;	 // 设施评分
	private Long serviceScore;	 // 服务评分
	private Long hygieneScore;	 // 卫生评分
	private Long score;	 // 综合评分
	private Long tripMode;	 // 出游类型
	private Long isOk;	 // 是否满意（0：有待改善 1：值得推荐）
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

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductType() {
		return this.productType;
	}

	public void setProductType(Long productType) {
		this.productType = productType;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getIsHavingImg() {
		return this.isHavingImg;
	}

	public void setIsHavingImg(Long isHavingImg) {
		this.isHavingImg = isHavingImg;
	}

	public Long getPositionScore() {
		return this.positionScore;
	}

	public void setPositionScore(Long positionScore) {
		this.positionScore = positionScore;
	}

	public Long getFacilitiesScore() {
		return this.facilitiesScore;
	}

	public void setFacilitiesScore(Long facilitiesScore) {
		this.facilitiesScore = facilitiesScore;
	}

	public Long getServiceScore() {
		return this.serviceScore;
	}

	public void setServiceScore(Long serviceScore) {
		this.serviceScore = serviceScore;
	}

	public Long getHygieneScore() {
		return this.hygieneScore;
	}

	public void setHygieneScore(Long hygieneScore) {
		this.hygieneScore = hygieneScore;
	}

	public Long getScore() {
		return this.score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getTripMode() {
		return this.tripMode;
	}

	public void setTripMode(Long tripMode) {
		this.tripMode = tripMode;
	}

	public Long getIsOk() {
		return this.isOk;
	}

	public void setIsOk(Long isOk) {
		this.isOk = isOk;
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
