package cn.itrip.biz.service.Impl;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.*;
import cn.itrip.beans.vo.*;
import cn.itrip.biz.service.HotelOrderService;
import cn.itrip.biz.vo.OrderStutasVO;
import cn.itrip.biz.vo.PageUtil;
import cn.itrip.biz.vo.PersonalorderlistVo;
import cn.itrip.mapper.*;
import cn.itrip.util.DtoUtil;
import cn.itrip.util.UUIDUtil;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class HotelOrderServiceImpl implements HotelOrderService {
    @Resource
    private HotelTempStoreMapper hotelTempStoreMapper;
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private HotelRoomMapper hotelRoomMapper;
    @Resource
    private OrderLinkUserMapper orderLinkUserMapper;
    @Resource
    private TradeEndsMapper tradeEndsMapper;
    @Resource
    private PreOrderVoMapper preOrderVoMapper;
    @Resource
    private HotelOrderMapper hotelOrderMapper ;
    @Override
    public Dto getpreorderinfo(PerOrderInfoVO perOrderInfoVO,String token) {
        if (token!=null){
            Integer roomId= perOrderInfoVO.getRoomId();
            ItripHotelRoom itripHotelRoom =orderMapper.selectRoom(roomId);
            if (itripHotelRoom.getIsBook()==0){
                return DtoUtil.getSuccessDto("该房间不可预订");
            }else {
                PerOrderInfoVO preOrderInfo=new PerOrderInfoVO();
                //获取房间信息
                preOrderInfo=orderMapper.roomInfo(roomId);
                perOrderInfoVO.setPrice(itripHotelRoom.getRoomPrice());
                //将酒店ID和酒店名称set到VO表
                perOrderInfoVO.setHotelName(preOrderInfo.getHotelName());
                perOrderInfoVO.setHotelId(preOrderInfo.getHotelId());
                //获取临时表房间数量
                //orderMapper.getPreStore(perOrderInfoVO.getCheckInDate(),perOrderInfoVO.getCheckOutDate(),perOrderInfoVO.getRoomId(),perOrderInfoVO.getHotelId());
                Integer score=orderMapper.getScore(roomId, perOrderInfoVO.getCheckInDate(), perOrderInfoVO.getCheckOutDate());
                System.out.println("获取临时表房间数量："+score);
                System.out.println("******score*******");
                System.out.println(score);
                if (score==null){
                    score=20;
                }
                //获取订单表预订房间数量
                Integer count=orderMapper.getCount(roomId, perOrderInfoVO.getCheckInDate(), perOrderInfoVO.getCheckOutDate());
                if (count==null){
                    count=0;
                }
                System.out.println("获取订单表预订房间数量："+count);
                perOrderInfoVO.setStore(score-count);
                System.out.println(perOrderInfoVO);
                return DtoUtil.getSuccesWithData(perOrderInfoVO,"获取下单信息成功");
            }
        }else {
            return DtoUtil.getFalseDto("token为空,无法操作","10014");
        }
    }

    @Override
    public Dto getpersonalorderlist(PersonalorderlistVo personalorderlistVo) {
        Order order=new Order();
        List list;
        if (personalorderlistVo.getOrderStatus() != -1){
            order.setOrderStatus(personalorderlistVo.getOrderStatus());
            if (personalorderlistVo.getOrderType() != -1){
                order.setOrderType(personalorderlistVo.getOrderType());
            }
            list = orderMapper.select(order);
        }else {
            if (personalorderlistVo.getOrderType() != -1){
                order.setOrderType(personalorderlistVo.getOrderType());
                list = orderMapper.select(order);
            }else {
                list = orderMapper.selectAll();
            }
        }
        PageUtil pageUtils = new PageUtil();
        pageUtils.setPageSize(personalorderlistVo.getPageSize());
        pageUtils.setCurPage(personalorderlistVo.getPageNo());
        pageUtils.setRows(list);
        return DtoUtil.getSuccesWithData(pageUtils,"发送成功");
    }

    @Override
    public Dto getpersonalorderroominfo(Long id,String token) {
        System.out.println("ididididididididid="+id);
        OrderRoomInfo orderRoomInfo=hotelOrderMapper.selectPersonalOrderRoomInfo(id);
        System.out.println("orderRoomInfoorderRoomInfoorderRoomInfo="+orderRoomInfo);
        return DtoUtil.getSuccesWithData(orderRoomInfo,"成功");
    }

    @Override
    public Dto addhotelorder(AddOrderNoVO addOrderNoVO, String token) {
        if (stringRedisTemplate.hasKey(token)){
            //获取用户Id
            Long userId=Long.parseLong(token.substring(42,44));
            addOrderNoVO.setUserId(userId);
            addOrderNoVO.setCreatedBy(userId);
            //随机生成订单号
            String orderNo= UUIDUtil.getStr().replace("-","").substring(0,28);
            //增加订单状态
            addOrderNoVO.setOrderStatus(0);
            //增加订单创建日期
            addOrderNoVO.setCreationDate(new Date());
            //增加bookType
            addOrderNoVO.setBookType(0L);
            //增加订单号
            addOrderNoVO.setOrderNo(orderNo);
            //获取订单人姓名
            StringBuilder str=new StringBuilder();
            for (UserLinkUserVO a:addOrderNoVO.getLinkUser()){
                str.append(a.getLinkUserName()+",");
            }
            String userName=str.substring(0,str.length()-1);
            addOrderNoVO.setLinkUserName(userName);
            //获取预订天数
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Long day=0L;
            Long time=addOrderNoVO.getCheckOutDate().getTime()-addOrderNoVO.getCheckInDate().getTime();
            day=time/1000/60/60/24;

            addOrderNoVO.setBookingDays(day);
            //获取支付金额
            ItripHotelRoom itripHotelRoom=hotelRoomMapper.getRoomId(addOrderNoVO.getRoomId());
            addOrderNoVO.setPayAmount(itripHotelRoom.getRoomPrice()*addOrderNoVO.getCount()*day);
            //在数据库增加一条订单信息
            int j=orderMapper.addOrder(addOrderNoVO);
            System.out.println("**************订单增加");
            System.out.println("**j："+j);
            //在订单编号表增加一条信息

            ItripTradeEnds tradeEnds=new ItripTradeEnds();
            tradeEnds.setOrderNo(orderNo);
            Long id=orderMapper.getOrderNo(orderNo).getId();
            tradeEnds.setId(id);
            tradeEnds.setFlag(0);
            int i=tradeEndsMapper.insert(tradeEnds);
            System.out.println("*******************************");
            System.out.println("订单编号表j:"+i);
            //在数据库增加用户订单表信息
            ItripOrderLinkUser orderLinkUser=new ItripOrderLinkUser();
            for (UserLinkUserVO u:addOrderNoVO.getLinkUser()){
                orderLinkUser.setLinkUserId(u.getId());
                orderLinkUser.setLinkUserName(u.getLinkUserName());
                orderLinkUser.setCreationDate(new Date());
                orderLinkUser.setCreatedBy(userId);
                orderLinkUser.setOrderId(id);
                int k=orderLinkUserMapper.insert(orderLinkUser);
                System.out.println("用户订单表信息***********");
                System.out.println("**************用户订单表k:"+k);
            }
            orderMapper.getPreStore(addOrderNoVO.getCheckInDate(),addOrderNoVO.getCheckOutDate(),Integer.parseInt(addOrderNoVO.getRoomId().toString()),Integer.parseInt(addOrderNoVO.getHotelId().toString()));
            //!!!!!!!!!!!!!!!!!!!!!!!!Integer不能转化为Long类型
            Integer count=Integer.parseInt(addOrderNoVO.getCount().toString());
            Integer roomId=Integer.parseInt(addOrderNoVO.getRoomId().toString());
            Integer hotelId=Integer.parseInt(addOrderNoVO.getHotelId().toString());
            //修改房间数量
            orderMapper.updateScore(count,addOrderNoVO.getCheckInDate(),roomId,hotelId);
            return DtoUtil.getSuccesWithData(tradeEnds,"获取订单编号成功");
        }else {
            return DtoUtil.getFalseDto("token已失效","10015");
        }
    }
    @Override
    public Dto queryOrderById(Integer id,String token) {
        if (stringRedisTemplate.hasKey(token)){
            QueryOrderByIdVO orderByIdVO=orderMapper.queryOrderById(id);
            if(orderByIdVO!=null ){
                List<OrderLinkUserListVO> linkUserListVO=orderLinkUserMapper.getOrderInfoList(orderByIdVO.getId());
                orderByIdVO.setItripOrderLinkUserList(linkUserListVO);
                return DtoUtil.getSuccesWithData(orderByIdVO,"查询订单信息成功");
            }
            return DtoUtil.getFalseDto("该订单不存在","10016");
        }else {
            return DtoUtil.getFalseDto("token已失效，请重新登录","10015");
        }
    }

    @Override
    public Dto getpersonalorderinfo(Integer id,String token) {
        if (token!=null){
            PersonalOrderInfoVO orderInfoVO=orderMapper.getOrderId(id);
            switch (orderInfoVO.getOrderStatus()){
                case 0:
                    orderInfoVO.setProcessNode(2);
                    orderInfoVO.setOrderProcess(OrderStutasVO.ORDERPROCESS_STATUS_2);
                case 1:
                    orderInfoVO.setProcessNode(3);
                    orderInfoVO.setOrderProcess(OrderStutasVO.ORDERPROCESS_STATUS_1);
                case 2:
                    orderInfoVO.setProcessNode(3);
                    orderInfoVO.setOrderProcess(OrderStutasVO.ORDERPROCESS_STATUS_2);
                case 3:
                    orderInfoVO.setProcessNode(4);
                    orderInfoVO.setOrderProcess(OrderStutasVO.ORDERPROCESS_STATUS_2);
                case 4:
                    orderInfoVO.setProcessNode(5);
                    orderInfoVO.setOrderProcess(OrderStutasVO.ORDERPROCESS_STATUS_2);
                case 5:
                    orderInfoVO.setProcessNode(6);
                    orderInfoVO.setOrderProcess(OrderStutasVO.ORDERPROCESS_STATUS_2);

            }
            return DtoUtil.getSuccesWithData(orderInfoVO,"获取个人订单信息成功");
        }else {
            return DtoUtil.getFalseDto("token为空,无法操作","10014");
        }
    }
}
