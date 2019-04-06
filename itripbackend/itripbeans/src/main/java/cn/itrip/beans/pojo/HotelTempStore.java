package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_hotel_temp_store")

public class HotelTempStore {
    @Id
    private Long id;

    private Integer hotelId;

    private Long roomId;

    private Date recordDate;

    private Integer store;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;
}