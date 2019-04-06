package cn.itrip.biz.service.Impl;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.Image;
import cn.itrip.beans.pojo.LabelDic;
import cn.itrip.beans.vo.HotelRoom;
import cn.itrip.beans.vo.HotelRoomVo;
import cn.itrip.biz.service.HotelRoomService;
import cn.itrip.mapper.ImageMapper;
import cn.itrip.mapper.LabelDicMapper;
import cn.itrip.mapper.RoomMapper;
import cn.itrip.util.DtoUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class HotelRoonServiceImpl implements HotelRoomService {
    @Resource
    private RoomMapper roomMapper;
    @Resource
    private ImageMapper imageMapper;
    @Resource
    private LabelDicMapper labelDicMapper;
    @Override
    public Dto queryhotelroombyhotel( HotelRoom hotelRoom ) {
        List list=new ArrayList();
        List<HotelRoomVo> hotelRoomVoList=roomMapper.queryhotelroombyhotel(hotelRoom);
        for (HotelRoomVo h:hotelRoomVoList
             ) {
            List list1 = new ArrayList();
            list1.add(h);
            list.add(list1);
        }
            return DtoUtil.getSuccesWithData(list,"获取成功");
    }

    @Override
    public Dto getimg(Integer id) {
        List<Image> list=imageMapper.selectImageById(id);
        return DtoUtil.getSuccesWithData(list,"酒店房间图片发送成功!");
    }

    @Override
    public Dto queryhotelroombed() {
        List<LabelDic> list=labelDicMapper.queryhotelroombed();
        return DtoUtil.getSuccesWithData(list,"获取床型成功");
    }
}
