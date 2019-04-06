package cn.itrip.beans.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-02-14 
 */
@Table(name = "itrip_trade_ends")
@NameStyle(Style.normal)
public class ItripTradeEnds implements Serializable {

	private static final long serialVersionUID =  1845982347475673731L;
	@Id
	private Long id;	 // 订单ID
	private String orderNo;	 // 订单编号(注意非支付宝交易编号tradeNo)
	private Integer flag;	 // 标识字段(默认0：未处理；1：处理中)

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

}
