package cn.itrip.beans.vo;

import lombok.Data;
import cn.itrip.beans.pojo.Comment;

import java.util.List;

@Data
public class AddComentVo extends Comment {
    private List<ImgUrl> itripImages;
}
