package cn.itrip.beans.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_comment")
@NameStyle(Style.normal)
public class Comment {
    @Id
    private Long id;

    private Long hotelId;

    private Long productId;

    private Long orderId;

    private Integer productType;

    private Long userId;

    private int isHavingImg;

    private Integer positionScore;

    private Integer facilitiesScore;

    private Integer serviceScore;

    private Integer hygieneScore;

    private Integer score;

    private String tripMode;

    private Integer isOk;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    private String content;
}