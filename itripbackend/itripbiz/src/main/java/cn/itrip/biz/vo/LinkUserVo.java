package cn.itrip.biz.vo;

import lombok.Data;

@Data
public class LinkUserVo {
    private String linkUserName;
    private String linkPhone;
    private String linkIdCard;
    private int linkIdCardType;
    private long id;
}
