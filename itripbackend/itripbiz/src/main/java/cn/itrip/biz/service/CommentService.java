package cn.itrip.biz.service;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.CommentVo;
import cn.itrip.beans.vo.AddComentVo;
import org.springframework.web.multipart.MultipartFile;

public interface CommentService {
    Dto gethotelscore(Integer id);

    Dto getcount(Integer id);
    Dto getcommentlist(CommentVo commentVo);
    Dto getImg(Long commentId);
    Dto getTravelType(String token);
    Dto getHotelDesc(Long hotelId);
    int addComment(AddComentVo addComentVo, String token);
    Dto uploadImage(MultipartFile file, String token);
    Dto delPic(String imgName,String token);

}
