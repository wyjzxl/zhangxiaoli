package com.baidu;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);
        Opera o=new Opera();
        //添加
        for (int i = 0; i <5 ; i++)
        {
            System.out.print("请输入学号:");
            int stuNu=input.nextInt();
            System.out.print("请输入姓名::");
            String name=input.next();
            System.out.print("请输入年龄:");
            int age=input.nextInt();
            System.out.print("请输入成绩:");
            double source=input.nextDouble();
            Student stu=new Student(stuNu,name,age,source);
            o.add(stu);
        }
        o.showInfor();
        //删除
        System.out.print("请输入需要删除的姓名:");
        String name=input.next();
        o.delete(name);
        o.showInfor();
        //修改
        System.out.print("请输入需要修改的数据名:");
        String num=input.next();
        System.out.print("请输入要替换的数据:");
        String oldnum=input.next();
        System.out.print("请输入替换的数据:");
        String newnum=input.next();
        o.chang(num,oldnum,newnum);
        o.showInfor();
        //查找
        System.out.print("请查看同学的姓名:");
        String  lookName=input.next();
        System.out.println("查找结果:");
        o.look(lookName);
        System.out.println("\n");
        System.out.println("显示!");
        o.showInfor();
    }

}
