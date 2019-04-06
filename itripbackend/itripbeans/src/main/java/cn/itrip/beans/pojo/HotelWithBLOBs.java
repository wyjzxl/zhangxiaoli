package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "itrip_hotel")
public class HotelWithBLOBs extends Hotel {
    private String details;

    private String facilities;

    private String hotelPolicy;
}