package com.baidu.Api;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        //添加
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("汪应杰");
        //返回列表元素个数size()
        System.out.println(arrayList.size());
        //返回指定索引位置下的元素
        System.out.println(arrayList.get(1));
        //删除
        arrayList.remove(1);
        //判断某个元素是否存在
        boolean flag=arrayList.contains("王五");
        System.out.println(flag);
        /*//清空
        arrayList.clear();
        System.out.println(arrayList.isEmpty());*/
        //转换为数组
        Object [] names= arrayList.toArray();
        System.out.println(names[0]);
    }
}
