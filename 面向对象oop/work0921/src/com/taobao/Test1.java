package com.taobao;

public class Test1 {
    public static void main(String[] args) {
        Student zhangsan=new Student("鸭",18,"男");
        zhangsan.showifo();

        Student lisi=new Student("鸡",28,"女");
        lisi.showifo();

        Student wangwu=new Student();
        wangwu.showifo();
    }
}
