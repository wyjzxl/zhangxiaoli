package cn.itrip.biz.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfoVo {
    private Date checkInDate;
    private Date checkOutDate;
    private int count;
    private int hotelId;
    private int roomId;
}
