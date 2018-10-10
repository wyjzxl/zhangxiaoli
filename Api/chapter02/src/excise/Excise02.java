package excise;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/10/10.
 */
public class Excise02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str=input.next();
        //我爱你中国，我爱你故乡
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
//            char s=str.charAt(i);
//            if(s=='爱'){
//                count++;
//            }
            String s=str.substring(i,i+1);
            if(s.equals("爱")){
                count++;
            }
        }
        System.out.println("个数"+count);
        //HelloWorld.java
        String st="HelloWorld.java";
        //先获取.的下标
        int index=st.lastIndexOf(".");
        if (index!=-1&&
                st.substring(index+1).equals("java")){
            System.out.println("合法文件");
        }
        String t="mdy23256@qq.com";
        int index1=t.indexOf("@");
        int index2=t.lastIndexOf(".");
        if(index1!=-1&&index2!=-1&&index1<index2){
            System.out.println("合法");
        }

    }
}
