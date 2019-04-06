package cn.itrip.biz.controller;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.CommentVo;
import cn.itrip.beans.vo.AddComentVo;
import cn.itrip.biz.service.CommentService;
import cn.itrip.util.DtoUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/comment/")
public class CommentController{
    @Resource
    private CommentService commentService;
    @GetMapping(value = "gethotelscore/{targetId}",headers = "token")
    public Dto gethotelscore(@PathVariable(name = "targetId",required =true) Integer id){
        return commentService.gethotelscore(id);
    }
    @GetMapping(value = "getcount/{targetId}",headers = "token")
    public Dto getcount(@PathVariable(name = "targetId",required =true) Integer id){
        return commentService.getcount(id);
    }
    @PostMapping(value = "getcommentlist",headers = "token")
    public Dto getcommentlist(@RequestBody CommentVo commentVo){
        return commentService.getcommentlist(commentVo);
    }
    @GetMapping("getimg/{commentId}")
    public Dto getCommentImg(@PathVariable("commentId") Long commentId){

        return commentService.getImg(commentId);
    }
    @GetMapping(value = "gettraveltype")
    public Dto getTravelType(HttpServletRequest request){
        String token=request.getHeader("token");
        return commentService.getTravelType(token);
    }
    @GetMapping("gethoteldesc/{hotelId}")
    public Dto getHotelDesc(@PathVariable("hotelId") Long hotelId){
        return commentService.getHotelDesc(hotelId);
    }
    @PostMapping(value = "add",headers = "token")
    public Dto addComment(@RequestBody AddComentVo addComentVo, HttpServletRequest request){
        String token= request.getHeader("token");
        //向数据库中添加评论数据
        int count=commentService.addComment(addComentVo,token);
        if(count>0){
            return DtoUtil.getSuccessDto("新增评论成功");
        }
        return DtoUtil.getSuccessDto("新增评论失败");
    }
    @RequestMapping(value = "upload",headers = "token",method = RequestMethod.POST)
    public Dto upload(@RequestParam(value = "file",required = false) MultipartFile file, HttpServletRequest request){
        String token=request.getHeader("token");
        return commentService.uploadImage(file,token);
    }
    @PostMapping(value = "delpic",headers = "token")
    public Dto delPic(String imgName,HttpServletRequest request){
        String token=request.getHeader("token");
        return commentService.delPic(imgName,token);
    }
}
