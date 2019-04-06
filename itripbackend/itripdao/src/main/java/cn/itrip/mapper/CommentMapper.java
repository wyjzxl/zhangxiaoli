package cn.itrip.mapper;

import cn.itrip.beans.pojo.*;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CommentMapper extends Mapper<Comment> {
    List<CommentListVo> getcommentlist(Comment comment);
    List<Image> selectImg(Long commentId);
    List<ItripLabelDic> getTravelType();
    int insertH(Comment record);
    List<CommentListVo> selectCommentList(@Param("commentVo") CommentVo commentVo);

}