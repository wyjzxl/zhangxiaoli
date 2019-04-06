package cn.itrip.beans.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/3/8
 * Time: 14:17
 */
@Data
public class PerOrderInfoVO {
    private Date checkInDate;
    private Date checkOutDate;
    private Integer count;
    private Integer hotelId;
    private String hotelName;
    private Double price;
    private Integer roomId;
    private Integer store;
}
