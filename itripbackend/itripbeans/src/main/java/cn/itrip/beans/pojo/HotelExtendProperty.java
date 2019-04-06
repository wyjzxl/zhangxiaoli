package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_hotel_extend_property")
public class HotelExtendProperty {
    @Id
    private Long id;

    private Long hotelId;

    private Long extendPropertyId;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;
}