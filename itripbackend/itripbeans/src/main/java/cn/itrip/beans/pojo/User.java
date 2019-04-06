package cn.itrip.beans.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "itrip_user")

public class User {
    @Id
    private Long id;

    private String userCode;

    private String userPassword;

    private Integer userType;

    private Long flatId;

    private String userName;

    private String weChat;
    @Column(name = "QQ")
    private String qq;

    @Column(name = "weibo")
    private String weiBo;
    @Column(name = "baidu")
    private String baiDu;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    private Integer activated;
}