package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_hotel_feature")
public class HotelFeature {
    @Id
    private Long id;

    private Long hotelId;

    private Long featureId;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;
}