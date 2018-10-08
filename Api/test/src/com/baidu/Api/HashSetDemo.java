package com.baidu.Api;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        for(Object o:hashSet)
        {
            System.out.println(o);
        }
        //专门为Set做的迭代器遍历
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            String o=(String)iterator.next();
            System.out.println(o);
            if(o.equals("张三"))
            {
                iterator.remove();
            }
        }
    }
}
