package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_user_link_user")

public class UserLinkUser {
    @Id
    private Long id;

    private String linkUserName;

    private String linkIdCard;

    private String linkPhone;

    private Integer userId;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    private Integer linkidCardType;
}