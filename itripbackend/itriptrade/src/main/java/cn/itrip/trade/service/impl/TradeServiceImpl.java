package cn.itrip.trade.service.impl;

import cn.itrip.beans.pojo.HotelOrderExt;
import cn.itrip.mapper.HotelOrderMapper;
import cn.itrip.mapper.HotelTempStoreMapper;
import cn.itrip.trade.service.TradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class TradeServiceImpl implements TradeService {
    @Resource
    private HotelOrderMapper hotelOrderMapper;
    @Resource
    private HotelTempStoreMapper hotelTempStoreMapper;
    @Override
    public void updateData(String out_trade_no, String trade_no, int payType) {
        HotelOrderExt hotelOrder=hotelOrderMapper.selectByOrderNo(out_trade_no);
        if(hotelOrder.getOrderStatus()==0){
            HotelOrderExt order=new HotelOrderExt();
            //改变订单状态,添加交易号
            order.setOrderNo(out_trade_no);
            order.setTradeNo(trade_no);//设置交易码为支付宝给我们的交易码
            order.setOrderStatus(2);//设置订单状态为已支付
            order.setPayType(payType);//支付方式:1:支付宝 2:微信 3:到店付
            //执行更改订单状态并添加交易号
            hotelOrderMapper.updateOrder(order);
            //调用存储过程，更新临时库存表的记录
            hotelTempStoreMapper.callPre_flush_store(hotelOrder);
            //临时库存减去已支付订单数量房间数
            for (int i = 0; i <hotelOrder.getBookingDays(); i++) {
                Date tempDate=new Date(hotelOrder.getCheckInDate().getTime()+i*1000*60*60*24);
                //获取临时库存表库存
                int store=hotelTempStoreMapper.selectStoreByDate(hotelOrder.getHotelId(),hotelOrder.getRoomId(),tempDate);
                store=store-hotelOrder.getCount();
                hotelTempStoreMapper.updateTempStoreByOrder(hotelOrder.getHotelId(),hotelOrder.getRoomId(),tempDate,store);
            }
        }
    }
}
