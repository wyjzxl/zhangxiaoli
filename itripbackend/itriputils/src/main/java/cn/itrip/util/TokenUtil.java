package cn.itrip.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 该类用于操作token
 */
public class TokenUtil {



    /**
     * 获取token生成时间
     * @param token token串
     * @return 生成时间
     */
    public static Date getGenerateTime(String token){
        Date date;
        String [] agrs=token.split("-");
        try {
            date=new SimpleDateFormat("yyyyMMddHHmmss").parse(agrs[3]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

    /**
     * 获取登陆账户的id
     * @param token token字符串
     * @return 账户id
     */
    public static String getId(String token){
        String []args=token.split("-");
        return args[2];
    }

    /**
     * 获得平台信息
     * @param token token字符串
     * @return 平台名称
     */
    public static String getFlat(String token){
        if(token.startsWith("token:PC")){
            return "PC";
        }else {
            return "MOBILE";
        }
    }
}
