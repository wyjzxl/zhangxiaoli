package com.StudentSystem;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap();
        Scanner abc=new Scanner(System.in);
        hashMap.put("李四",59);
        hashMap.put("王五",61);
        hashMap.put("张三",85);
        System.out.println("输入学生姓名:");
        String name=abc.next();
        if(hashMap.containsKey(name))
        {
            System.out.println(name+"的成绩是:"+hashMap.get(name).intValue());
        }
        System.out.println("- - - - - - - - - - 所有学生的成绩是- - - - - - - - -");
        Set<String> keys=hashMap.keySet();
        for(Object o:keys)
        {
            System.out.println(o+"的成绩是:"+hashMap.get(o));
        }
    }

}
