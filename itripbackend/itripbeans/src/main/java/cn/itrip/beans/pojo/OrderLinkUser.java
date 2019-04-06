package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_order_link_user")

public class OrderLinkUser {
    @Id
    private Long id;

    private Long orderId;

    private Long linkUserId;

    private String linkUserName;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;
}