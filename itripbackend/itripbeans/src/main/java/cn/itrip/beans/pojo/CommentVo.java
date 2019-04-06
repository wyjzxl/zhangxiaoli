package cn.itrip.beans.pojo;

import lombok.Data;

@Data
public class CommentVo {
    private long hotelId;
    private Integer isHavingImg;
    private Integer isOk;
    private Integer pageSize;
    private Integer pageNo;
}
