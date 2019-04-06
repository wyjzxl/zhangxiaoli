package cn.itrip.beans.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_hotel")
@NameStyle(Style.normal)
public class Hotel {
    @Id
    private Long id;

    private String hotelName;

    private Long countryId;

    private Long provinceId;

    private Long cityId;

    private String address;

    private Integer hotelType;

    private Integer hotelLevel;

    private Integer isGroupPurchase;

    private String redundantCityName;

    private String redundantProvinceName;

    private String redundantCountryName;

    private Integer redundantHotelStore;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    private String details;

    private String facilities;

    private String hotelPolicy;
}