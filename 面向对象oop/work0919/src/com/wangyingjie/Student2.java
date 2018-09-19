package com.wangyingjie;

public class Student2 {
    public String name;
    public int age;
    public  String sex;
    public String  professional;
    public Student2(String name,int age)
    {
        this.name=name;
        this.age=age;
        this.sex="男";
        this.professional="java";
    }
    public Student2(String name,int age,String sex,String professional)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.professional=professional;
    }
    public void showInfor()
    {
        System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex+",专业:"+professional);
    }

}
