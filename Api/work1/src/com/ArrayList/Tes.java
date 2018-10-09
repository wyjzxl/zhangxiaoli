package com.ArrayList;

import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Tes {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("输入班级名称:");
        String banji=abc.next();
        HashMap<String,ArrayList<String>> hashMap=new<String,ArrayList<String>> HashMap();
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("张三丰");
        arrayList.add("杨过");
        arrayList.add("郭靖");
        hashMap.put("三年级一班",arrayList);
        Set<String> keys=hashMap.keySet();
        for (String s:keys) {
            if(banji.equals(s))
            {
                System.out.println(s+"列表");
                ArrayList<String> value=hashMap.get(s);
                for(String k:value)
                {
                    System.out.println(k);
                }
            }

        }
    }
}
