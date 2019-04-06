package cn.itrip.biz.vo;

import lombok.Data;

@Data
public class PersonalorderlistVo {
    private int orderStatus;
    private int orderType;
    private int pageSize;
    private int pageNo;
}
