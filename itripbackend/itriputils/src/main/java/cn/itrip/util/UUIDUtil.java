package cn.itrip.util;

import java.util.UUID;

public class UUIDUtil {

        public static String getStr(){
           return getStr(false);
        }

        public static String getStr(boolean flag){
            if(flag){
                return UUID.randomUUID().toString().replace("-","");
            }
            return UUID.randomUUID().toString();
        }
        public static String getStr(int length,boolean flag){
            if(flag){
                return UUID.randomUUID().toString().replace("-","").substring(0,length);
            }
            return UUID.randomUUID().toString().substring(length);
        }
}
