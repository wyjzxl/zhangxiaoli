package cn.itrip.biz.service.Impl;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.*;
import cn.itrip.beans.vo.AddComentVo;
import cn.itrip.beans.vo.ImgUrl;
import cn.itrip.biz.service.CommentService;
import cn.itrip.biz.vo.PageUtil;
import cn.itrip.mapper.*;
import cn.itrip.util.DtoUtil;
import cn.itrip.util.TokenUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private AvgHotelScoreMapper avgHotelScoreMapper;
    @Resource
    private CommentMapper commentMapper;
    @Resource
    private ImageMapper imageMapper;
    @Resource
    private HotelMapper hotelMapper;
    @Resource
    private HotelOrderMapper hotelOrderMapper;

    @Override
    public Dto gethotelscore(Integer id) {
        AvgHotelScore avgHotelScore=avgHotelScoreMapper.gethotelscore(id);
        return DtoUtil.getSuccesWithData(avgHotelScore,"获取评分成功");
    }




    @Override
    public Dto getcount(Integer id) {
        AvgHotelScore avgHotelScore=avgHotelScoreMapper.getcount(id);
        return DtoUtil.getSuccesWithData(avgHotelScore,"获取酒店各类评论数成功");
    }

    @Override
    public Dto getcommentlist(CommentVo commentVo) {
        Comment comment=new Comment();
        if(commentVo.getIsHavingImg()!=-1){
            comment.setIsHavingImg(commentVo.getIsHavingImg());
        }
        if(commentVo.getIsOk()!=-1){
            comment.setIsOk(commentVo.getIsOk());
        }
        if(commentVo.getHotelId()!=0 && commentVo.getHotelId()>0){
            comment.setHotelId(commentVo.getHotelId());
        }
        List<CommentListVo> commentList =commentMapper.getcommentlist(comment);
        System.out.println(commentList.toString());
        //分页
        PageUtil pageUtil=new PageUtil();

        pageUtil.setBeginPos(0);
        pageUtil.setCurPage(1);
        pageUtil.setPageSize(5);
        pageUtil.setPageCount(commentList.size()/pageUtil.getPageSize());
        pageUtil.setTotal(commentList.size());
        pageUtil.setRows(commentList);
        return DtoUtil.getSuccesWithData(pageUtil,"获取评论成功");
    }

    @Override
    public Dto getImg(Long commentId) {
        List<Image> imageList=commentMapper.selectImg(commentId);
        return DtoUtil.getSuccesWithData(imageList,"发送成功!");
    }

    @Override
    public Dto getTravelType(String token) {

            List<ItripLabelDic> labelDicList=commentMapper.getTravelType();
            return DtoUtil.getSuccesWithData(labelDicList,"获取旅游类型");

    }

    @Override
    public Dto getHotelDesc(Long hotelId) {
        Map<String,Object> hotel=hotelMapper.selectHotelById(hotelId);
        return DtoUtil.getSuccesWithData(hotel,"获取成功");
    }

    @Override
    public int addComment(AddComentVo addComentVo, String token) {
        Long userId= Long.parseLong(TokenUtil.getId(token).trim());
        Date date=new Date();
        addComentVo.setCreatedBy(userId);
        addComentVo.setCreationDate(date);
        addComentVo.setModifiedBy(userId);
        addComentVo.setModifyDate(date);
        addComentVo.setUserId(userId);
        Integer score=(addComentVo.getServiceScore()+addComentVo.getFacilitiesScore()+addComentVo.getHygieneScore()+addComentVo.getPositionScore())/4;
        addComentVo.setScore(score);
        int count=commentMapper.insertH(addComentVo);
        int count1=hotelOrderMapper.updateOrderStatusCommented(addComentVo.getOrderId());
        System.out.println("添加评论："+count+" 条");
        if(count1>0){
            System.out.println("第一次  评论，改变订单状态***********************");
        }else {
            System.out.println("不是  第一次评论，订单状态未改变*****************");
        }
        if (addComentVo.getIsHavingImg()==1){
            List<ImgUrl> imgUrlList=addComentVo.getItripImages();
            Image image=new Image();
            int imgCount=0;
            System.out.println("**********************************************");
            System.out.println("imgUrlList:"+imgUrlList);
            System.out.println("**********************************************");
            for (int i = 0; i <imgUrlList.size() ; i++) {
                image.setType("2");//评论图片为2
                image.setTargetId(addComentVo.getId());
                image.setPosition(i);
                image.setImgUrl(imgUrlList.get(i).getImgUrl());
                System.out.println("ImgUrl="+imgUrlList.get(i).getImgUrl());
                image.setCreatedBy(userId);
                image.setCreationDate(date);
                image.setModifiedBy(userId);
                image.setModifyDate(date);
                imageMapper.insert(image);
            }
            System.out.println("添加图片："+imgCount+" 条");
        }
        return count;
    }

    @Override
    public Dto uploadImage(MultipartFile file, String token) {
        String realPath="/data/itrip/comment";
        String netUrl = "http://192.168.95.131/comment/";
        String [] imgMime={".BMP",".PNG",".JPG",".JPEG",".JPE",".GIF"};
        List<String> urlList=new ArrayList<>();
        String filename = file.getOriginalFilename();
        String subffix=filename.substring(filename.indexOf("."));
        int isImg=0;
        for (String m:imgMime) {
            if(m.equalsIgnoreCase(subffix)){
                isImg+=1;
                break;
            }
        }

        if(isImg==0){
            return DtoUtil.getFalseDto("图片格式异常","30002");
        }
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        // 确定文件的最终图片名称
        filename =Long.parseLong(TokenUtil.getId(token).trim())+"-"+System.currentTimeMillis()+"-"+uuid.substring(0,7)+subffix;
        try {
            file.transferTo(new File(realPath,filename));
            System.out.println("图片上传成功");
            System.out.println("上传文件的真实路径："+realPath+"/"+filename);
        } catch (IOException e) {
            System.out.println("图片上传失败");
            e.printStackTrace();
        }
        String imgUrl=netUrl+filename;
        urlList.add(imgUrl);
        System.out.println("上传给数据库的文件地址："+imgUrl);
        return DtoUtil.getSuccesWithData(urlList,"发送成功");
    }

    @Override
    public Dto delPic(String imgName, String token) {
        //服务器上文件的真实路径
        String realPath="/data/itrip/comment";
        //封装对象并删除图片数据
        boolean flag=new File(realPath,imgName).delete();
        if(flag){
            System.out.println("图片删除成功……");
        }
        System.out.println("图片删除失败……");
        return DtoUtil.getSuccessDto("删除成功");
    }


}
