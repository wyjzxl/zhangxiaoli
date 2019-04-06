package cn.itrip.beans.vo;

import lombok.Data;

import java.util.Date;

@Data
public class CommentContextVo {
    private Date checkInDate;
    private String content;
    private Date creationDate;
    private Integer hotelLevel;
    private Long id;
    private Integer isHavingImg;
    private String roomTitle;
    private Double score;
    private String tripModeName;
    private String UserCode;
}
