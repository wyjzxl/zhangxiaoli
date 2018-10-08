package com.baidu.Api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put("中国","CN");
        hashMap.put("美国","USA");
        hashMap.put("日本","JP");
        hashMap.put("英国","UK");
        System.out.println(hashMap.get("中国"));
        hashMap.remove("日本");
        System.out.println(hashMap.get("日本"));
        System.out.println(hashMap.size());
        Set keySet=hashMap.keySet();
        for (Object o:keySet)
        {
            System.out.println("key:"+o+",value:"+hashMap.get(o));
        }
        Collection value=hashMap.values();
        for (Object o:value)
        {
            System.out.println(o);
        }
    }
}
