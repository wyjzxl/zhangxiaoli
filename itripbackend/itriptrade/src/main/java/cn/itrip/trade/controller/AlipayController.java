package cn.itrip.trade.controller;

import cn.itrip.beans.pojo.ItripHotelOrder;
import cn.itrip.mapper.OrderMapper;
import cn.itrip.trade.config.AlipayConfig;
import cn.itrip.trade.service.TradeService;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


@RestController
@RequestMapping("/api/")
public class AlipayController {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private TradeService tradeService;

    @GetMapping(value = "prepay/{orderNo}")
    public  void sendMsgToAli(@PathVariable("orderNo") String orderNo, HttpServletRequest request, HttpServletResponse response) throws AlipayApiException, IOException {
        //获得初始化的AlipayClient


        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        ItripHotelOrder hotelOrder=new ItripHotelOrder();
        hotelOrder=orderMapper.getOrderNo(orderNo);
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        AlipayTradePagePayModel modela=new AlipayTradePagePayModel();

        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no =hotelOrder.getOrderNo();
        //付款金额，必填
        String total_amount =hotelOrder.getPayAmount().toString();
        //订单名称，必填
        String subject =hotelOrder.getHotelName();
        //商品描述，可空
        String body =hotelOrder.getSpecialRequirement();
        modela.setProductCode("FAST_INSTANT_TRADE_PAY");
        modela.setBody(body);
        modela.setSubject(subject);
        modela.setOutTradeNo(out_trade_no);
        modela.setTotalAmount(total_amount);


            /*alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                   + "\"total_amount\":\""+ total_amount +"\","
                   + "\"subject\":\""+ subject +"\","
                   + "\"body\":\""+ body +"\","
                    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");*/


        alipayRequest.setBizModel(modela);

        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

        //请求
        response.setContentType("text/html;charset=utf-8");
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        System.out.println("****************\n"+result+"\n*********************");
        //输出

        System.out.println("orderNoorderNoorderNoorderNoorderNoorderNo"+orderNo);

        response.getWriter().println(result);

    }


    //3 异步请求 支付宝在28小时 ，每隔一段时间发送请求，保证消息的到达率99.999%
    @PostMapping("notifyUrl")
    public void syncRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
        //获取支付宝POST过来反馈信息
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名
        //——请在这里编写您的程序（以下代码仅作参考）——

	/* 实际验证过程建议商户务必添加以下校验：
	1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
	2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
	3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
	4、验证app_id是否为该商户本身。
	*/
        System.out.println("异步回调="+signVerified);

        if(signVerified) {//验证成功
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //交易状态
            String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");

            if(trade_status.equals("TRADE_FINISHED")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序
                System.out.println("TRADE_FINISHED：订单付款成功，进行数据库的相关操作，调用业务层修改订单状态，修改库存数据。。。");
                //注意：
                //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
            }else if (trade_status.equals("TRADE_SUCCESS")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序
//                System.out.println("TRADE_SUCCESS：订单付款成功，进行数据库的相关操作，调用业务层修改订单状态，修改库存数据。可能退款行为。。");

                //支付完成之后修改订单
                int i=orderMapper.updateStatus(2,trade_no,out_trade_no);
                System.out.println("******支付完成之后修改订单****"+i);
                /*orderMapper.getPreStore(hotelOrder.getCheckInDate(),hotelOrder.getCheckOutDate(),Integer.parseInt(hotelOrder.getRoomId().toString()),Integer.parseInt(hotelOrder.getHotelId().toString()));*/
                //注意：
                //付款完成后，支付宝系统发送该交易状态通知 必须 success 如果不是，就一直发送请求
            }
            System.out.println("成功了");
            response.getWriter().println("success");

        }else {//验证失败
            System.out.println("失败了");
            response.getWriter().println("fail");

            //调试用，写文本函数记录程序运行情况是否正常
            //String sWord = AlipaySignature.getSignCheckContentV1(params);
            //AlipayConfig.logResult(sWord);
        }
    }


    //4 同步请求： 支付宝只发送一次，不管消息是否收到  不能用来做业务处理，只能做页面跳转
    @GetMapping("returnUrl")
    public void returnUrl(HttpServletRequest request,HttpServletResponse response) throws Exception {
        //获取支付宝GET过来反馈信息
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            // valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

        System.out.println("同步回调="+signVerified);
        //——请在这里编写您的程序（以下代码仅作参考）——
        if(signVerified) {
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
            tradeService.updateData(out_trade_no,trade_no,1);
            //付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
            response.sendRedirect("http://127.0.0.1");
            System.out.println("付款成功跳到首页");
        }else {
            System.out.println("侍款失败，到其它xxx项");
            response.sendRedirect("http://127.0.0.1");
        }
    }

}
