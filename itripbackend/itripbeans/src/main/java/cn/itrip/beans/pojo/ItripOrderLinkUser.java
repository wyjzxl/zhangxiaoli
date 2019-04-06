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
@Table(name = "itrip_order_link_user")
@NameStyle(Style.normal)
public class ItripOrderLinkUser implements Serializable {

	private static final long serialVersionUID =  7199385000102736668L;
	@Id
	private Long id;	 // 主键
	private Long orderId;	 // 订单id
	private Long linkUserId;	 // 联系人id
	private String linkUserName;	 // 入住人姓名逗号分隔
	private Date creationDate;	private Long createdBy;	private Date modifyDate;	private Long modifiedBy;
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getLinkUserId() {
		return this.linkUserId;
	}

	public void setLinkUserId(Long linkUserId) {
		this.linkUserId = linkUserId;
	}

	public String getLinkUserName() {
		return this.linkUserName;
	}

	public void setLinkUserName(String linkUserName) {
		this.linkUserName = linkUserName;
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
