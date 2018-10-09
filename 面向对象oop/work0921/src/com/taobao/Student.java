package com.taobao;

public class Student extends Person {
    private String sex="男";
    public Student(String name,int age,String sex)
    {
        super(name,age);
        this.sex=sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student()
    {
    }
    @Override
    public   void showifo()
    {
        System.out.print("我的姓名:"+super.getName());
        System.out.print(",我的年龄:"+super.getAge());
        System.out.print(",我的性别:"+getSex());
        System.out.println();
    }
}
