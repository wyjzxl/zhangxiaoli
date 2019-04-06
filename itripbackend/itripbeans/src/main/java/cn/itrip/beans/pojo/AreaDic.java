package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_area_dic")
public class AreaDic  {
    @Id
    private Long id;

    private String name;

    private String areaNo;

    private Long parent;

    private Integer isActivated;

    private Integer isTradingArea;

    private Integer isHot;

    private Integer level;

    private Integer isChina;
    @Column(name = "pinyin")
    private String pinYin;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;
}