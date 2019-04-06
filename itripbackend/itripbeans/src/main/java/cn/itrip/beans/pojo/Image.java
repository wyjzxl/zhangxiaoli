package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_image")

public class Image {
    @Id
    private Long id;

    private String type;

    private Long targetId;

    private Integer position;

    private String imgUrl;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;
}