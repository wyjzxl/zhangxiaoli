package cn.itrip.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
        SHA
        SHA256
        MD5  不可逆运算

 */
public class Md5Utils {
        ///对象。方法（参数）
        public static String encodeStr(String oldString){
            try {
                MessageDigest md5=MessageDigest.getInstance("md5");
                byte [] bs=md5.digest(oldString.getBytes());
                StringBuilder sb=new StringBuilder();
                int temp=0;
                String st;
                for(byte b: bs){
                    temp=b;
                    if(temp<0){
                        temp+=256;
                    }
                    st=Integer.toHexString(temp);
                    if(st.length()==1){
                        st+=0;
                    }
                   sb.append(st);
                }
              //  System.out.println("加密后:"+sb.toString());
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            return "";
        }
}
