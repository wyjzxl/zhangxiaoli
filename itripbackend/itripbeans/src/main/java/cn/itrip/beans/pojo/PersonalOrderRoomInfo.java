package cn.itrip.beans.pojo;

import lombok.Data;

@Data
public class PersonalOrderRoomInfo {
    private  int  bookType;
    private String creationDate;
    private int id;
    private String noticePhone;
    private String orderNo;
    private String orderProcess;
    private int orderStatus;
    private double payAmount;
    private Integer payType;
    private String processNode;
    private int roomPayType;
}
