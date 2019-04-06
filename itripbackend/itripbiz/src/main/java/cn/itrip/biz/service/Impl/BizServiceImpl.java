package cn.itrip.biz.service.Impl;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.AreaDic;
import cn.itrip.beans.pojo.LabelDic;
import cn.itrip.beans.vo.HotelDetails;
import cn.itrip.biz.service.BizService;
import cn.itrip.biz.vo.VideoDescVo;
import cn.itrip.mapper.*;
import cn.itrip.util.DtoUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BizServiceImpl implements BizService {
    @Resource
    private AreaMapper areaMapper;
    @Resource
    private QueryHotelFeatureMapper queryHotelFeatureMapper;
    @Resource
    private HotelMapper hotelMapper;
    @Resource
    private ImageMapper imageMapper;
    @Resource
    private LabelDicMapper labelDicMapper;
    @Resource
    private VideoDescMapper videoDescMapper;
    @Override
    public Dto querytradearea(Integer id) {

        if(id!=null && id>0){
            List<AreaDic> list =areaMapper.selectbyparentId(id);

            return DtoUtil.getSuccesWithData(list,"发送成功!");
        }
        return DtoUtil.getFalseDto("出现异常,请联系管理员!","30001");
    }

    @Override
    public Dto queryhotelfeature() {
        List<LabelDic> list =queryHotelFeatureMapper.queryhotelfeature();
        if(list!=null){
            return DtoUtil.getSuccesWithData(list,"发送成功!");
        }
        return DtoUtil.getFalseDto("查询失败","发送成功!");
    }

    @Override
    public Dto queryhotcity(Long id) {

        if(id!=null && id>0){
            System.out.println(areaMapper);
            List<AreaDic> list =areaMapper.queryhotcity(id);
            return DtoUtil.getSuccesWithData(list,"发送成功!");
        }
        return DtoUtil.getFalseDto("出现异常,请联系管理员!","30001");

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Dto getvideodesc(Integer id) {
        List<String>  hotelFeatureList=videoDescMapper.getHotelFeatureList(id);
        List<String> tradingAreaNameList = videoDescMapper.getTradingAreaNameList(id);
        String hotelName=videoDescMapper.getHotelName(id);
        VideoDescVo videoDescVo = new VideoDescVo();
        videoDescVo.setHotelFeatureList(hotelFeatureList);
        videoDescVo.setHotelName(hotelName);
        videoDescVo.setTradingAreaNameList(tradingAreaNameList);
        return DtoUtil.getSuccesWithData(videoDescVo,"获取酒店视频详细描述");
    }

    /**
     * 酒店详情
     * @param id
     * @return
     */
    @Override
    public Dto queryhoteldetails(Integer id) {
        HotelDetails hotelDetails=new HotelDetails();
        List<HotelDetails> list=labelDicMapper.queryhoteldetail(id);
        String hotelDetail=labelDicMapper.queryDetail(id);
        hotelDetails.setName("酒店介绍");
        hotelDetails.setDescription(hotelDetail);
        list.add(1,hotelDetails);
        return DtoUtil.getSuccesWithData(list,"获取酒店详情成功!");
    }

    /**
     * 酒店政策     * @param id
     * @return
     */
    @Override
    public Dto queryhotelpolicy(Integer id) {
        String hotel=hotelMapper.queryhotelpolicy(id);

        return DtoUtil.getSuccesWithData(hotel,"发送成功!");
    }



    @Override
    public Dto queryhotelfacilities(Long id) {

        String hotel=hotelMapper.queryhotelfacilities(id);
        return DtoUtil.getSuccesWithData(hotel,"发送成功!");
    }

    @Override
    public Dto getImg(Integer hotelId) {
        Integer type=0;
        List imgs=new ArrayList();
        imgs=imageMapper.selectByHotelId(type,hotelId);
        return DtoUtil.getSuccesWithData(imgs,"查询酒店图片成功");
    }


}
