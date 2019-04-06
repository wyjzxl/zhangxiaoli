package cn.itrip.beans.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderVo {
    private Date checkInDate;
    private Date checkOutDate;
    private Integer count;
    private Long hotelId;
    private String hotelName;
    private Double  price;
    private Long roomId;
    private Integer  store;
}
