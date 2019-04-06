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
@Table(name = "itrip_hotel")
@NameStyle(Style.normal)
public class ItripHotel implements Serializable {

	private static final long serialVersionUID =  2511835764765662494L;
	@Id
	private Long id;	 // 主键
	private String hotelName;	 // 酒店名称
	private Long countryId;	 // 所在国家id
	private Long provinceId;	 // 所在省份id
	private Long cityId;	 // 所在城市id
	private String address;	 // 酒店所在地址
	private String details;	 // 酒店介绍（保存附文本）
	private String facilities;	 // 酒店设施
	private String hotelPolicy;	 // 酒店政策
	private Long hotelType;	 // 酒店类型(1:国内酒店 2:国际酒店)
	private Long hotelLevel;	 // (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
	private Long isGroupPurchase;	 // 是否是团购酒店
	private String redundantCityName;	 // 城市名称 冗余字段
	private String redundantProvinceName;	 // 省名称 冗余字段
	private String redundantCountryName;	 // 国家名称 冗余字段
	private Long redundantHotelStore;	 // 酒店库存（冗余，每天开定时任务的时候更新）
	private Date creationDate;
	private Long createdBy;
	private Date modifyDate;
	private Long modifiedBy;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Long getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public Long getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public Long getCityId() {
		return this.cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getFacilities() {
		return this.facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public String getHotelPolicy() {
		return this.hotelPolicy;
	}

	public void setHotelPolicy(String hotelPolicy) {
		this.hotelPolicy = hotelPolicy;
	}

	public Long getHotelType() {
		return this.hotelType;
	}

	public void setHotelType(Long hotelType) {
		this.hotelType = hotelType;
	}

	public Long getHotelLevel() {
		return this.hotelLevel;
	}

	public void setHotelLevel(Long hotelLevel) {
		this.hotelLevel = hotelLevel;
	}

	public Long getIsGroupPurchase() {
		return this.isGroupPurchase;
	}

	public void setIsGroupPurchase(Long isGroupPurchase) {
		this.isGroupPurchase = isGroupPurchase;
	}

	public String getRedundantCityName() {
		return this.redundantCityName;
	}

	public void setRedundantCityName(String redundantCityName) {
		this.redundantCityName = redundantCityName;
	}

	public String getRedundantProvinceName() {
		return this.redundantProvinceName;
	}

	public void setRedundantProvinceName(String redundantProvinceName) {
		this.redundantProvinceName = redundantProvinceName;
	}

	public String getRedundantCountryName() {
		return this.redundantCountryName;
	}

	public void setRedundantCountryName(String redundantCountryName) {
		this.redundantCountryName = redundantCountryName;
	}

	public Long getRedundantHotelStore() {
		return this.redundantHotelStore;
	}

	public void setRedundantHotelStore(Long redundantHotelStore) {
		this.redundantHotelStore = redundantHotelStore;
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
