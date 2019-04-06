package cn.itrip.beans.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/3/9
 * Time: 15:07

 */
@Data
public class PersonalOrderInfoVO {
    private Long id;	 // 主键
    private String orderNo;	 // 订单号
    private Integer orderStatus;	 // 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
    private Double payAmount;	 // 支付金额
    private Long payType;	 // 支付方式:1:支付宝 2:微信 3:到店付
    private String noticePhone;	 // 联系手机号
    private String noticeEmail;	 // 联系邮箱
    private Long bookType;	 // 0:WEB端 1:手机端 2:其他客户端
    private Date creationDate;	 // 预定时间
    private Integer processNode;
    private String orderProcess;
}
