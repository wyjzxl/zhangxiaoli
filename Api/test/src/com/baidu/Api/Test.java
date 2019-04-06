package com.baidu.Api;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    ArrayList stus=new ArrayList();
    Scanner abc=new Scanner(System.in);

    //增加
    public void Menu()
    {

        do {
            System.out.println("欢迎登陆学生管理系统");
            System.out.println("********************************************");
            System.out.println("1、添加");
            System.out.println("2、删除");
            System.out.println("3、修改年龄");
            System.out.println("4、删除");
            System.out.println("5、查看");
            System.out.println("6、指定查看");
            System.out.println("7、退出");
            System.out.print("请选择:");
            int choice=abc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("*******************添加*****************");
                    System.out.println("请输入要添加的学号:");
                    int xuehao=abc.nextInt();
                    System.out.println("请输入要添加的姓名:");
                    String name=abc.next();
                    System.out.println("请输入要添加的年纪:");
                    int age=abc.nextInt();
                    Student stus=new Student(xuehao,name,age);
                    addStu(stus);
                    System.out.println("****************************************");
                    break;
                case 2:
                    System.out.println("*******************删除*****************");
                    System.out.println("请输入要删除的学号:");
                    int xuehao1=abc.nextInt();
                    deteleByStuNo(xuehao1);
                    System.out.println("****************************************");
                    break;
                case 3 :
                    System.out.println("*******************修改*****************");
                    System.out.println("请输入要修改的学号:");
                    int xuehao2=abc.nextInt();
                    System.out.println("请输入要添加的年纪:");
                    int age1=abc.nextInt();
                    updateAge(xuehao2,age1);
                    System.out.println("****************************************");
                    break;
                case 4 :
                    System.out.println("*******************删除*****************");
                    System.out.println("请输入要删除学生的学号:");
                    int xuehao3=abc.nextInt();
                    deteleByStuNo(xuehao3);
                    System.out.println("****************************************");
                    break;
                case 5 :
                    System.out.println("*******************查看*****************");
                    getStus();
                    System.out.println("****************************************");
                    break;
                case 6:
                    System.out.println("******************指定查看****************");
                    System.out.println("要查看学生的学号:");
                    int xuehao4=abc.nextInt();
                    getStusBystuNo(xuehao4);
                    System.out.println("****************************************");
                    break;
                case 7:
                    System.out.println("程序结束!");
                    return;
                default:
                        break;
            }
            System.out.println("********************************************");
        }while (true);

    }
    //添加
    public void addStu(Student stu)
    {
        boolean flag=false;
        for (int i = 0; i <stus.size() ; i++) {
            Student s=(Student)stus.get(i);
            if(s.getStuNo()==stu.getStuNo())
            {
                flag=true;
            }
        }
        if(!flag)
        {
            stus.add(stu);
        }
        else
        {
            System.out.println("添加失败!已经存在该学生");
        }
    }
    //修改
    public void updateAge(int stuNo,int age)
    {
        boolean flag=false;
        for (int i = 0; i <stus.size() ; i++) {
            Student s=(Student)stus.get(i);
            if(s.getStuNo()==stuNo)
            {
                s.setAge(age);
                flag=true;
                System.out.println("修改成功!");
            }
        }
        if(!flag)
        {
            System.out.println("未找到该生!");
        }
    }
    //指定查询
    public void getStusBystuNo(int stuNo)
    {
        System.out.println("学号\t\t姓名\t\t年龄");
        for (int i = 0; i <stus.size() ; i++) {
            Student s=(Student)stus.get(i);
            if(s.getStuNo()==stuNo)
            {
                System.out.println(s.getStuNo()+"\t\t\t"+s.getName()+"\t\t\t"+s.getAge());
                System.out.println("查询成功!");
                break;
            }
            else
            {
                System.out.println("查询失败!");
            }
        }
    }
    //查询所有
    public void getStus()
    {
        System.out.println("学号\t\t姓名\t\t年龄");
        for (int i = 0; i <stus.size(); i++) {
            Student s=(Student)stus.get(i);
            System.out.println(s.getStuNo()+"\t\t\t"+s.getName()+"\t\t\t"+s.getAge());
        }
    }
    //删除
    public void deteleByStuNo(int xuehao1)
    {
        boolean flag=false;
        for (int i = 0; i <stus.size() ; i++) {
            Student s=(Student)stus.get(i);
            if(s.getStuNo()==xuehao1)
            {
                stus.remove(i);
                flag=true;
                System.out.println("删除成功!");
            }
        }
        if(!flag)
        {
            System.out.println("未找到,删除失败!");
        }
    }
}
