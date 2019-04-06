package com.StudentSystem;

import com.Opera.Opera;

import java.util.Scanner;
import com.Opera.Opera;
import com.StudentSystem.InitEmployee;
import com.Opera.OperaIntfaceD;
import com.StudentSystem.User;
public class LoginMenu {
    Opera opera=new Opera();
    User[] user=InitEmployee.user;
    Scanner abc=new Scanner(System.in);
    public void lmenu()
    {
        System.out.println("请输入用户姓名:");
        String name=abc.next();
        System.out.println("请输入密码:");
        String pwd=abc.next();
        boolean flag=false;
        for (int i = 0; i <user.length ; i++) {
            if(name.equals(user[i].getUserName())&& pwd.equals(user[i].getPassWord()))
            {
                System.out.println("登陆成功!");
                flag=true;
            }
        }
        if(!flag)
        {
            System.out.println("密码或者账号输入有误!");
        }
        else
        {
            mainmenu();
        }
    }
    public void mainmenu()
    {
        do {

            System.out.println("1、查询所有员工信息");
            System.out.println("2、查询员工信息");
            System.out.println("3、添加员工信息");
            System.out.println("4、修改员工信息");
            System.out.println("5、删除员工信息");
            System.out.println("6、退出");
            System.out.print("请选择:");
            int choice=abc.nextInt();
            switch (choice)
            {
                case 1:
                    getEmployee();
                    break;
                case 2:
                    getEmployeeByEmployeeNo();
                    break;
                case 3:
                    addEmployee();
                    break;
                case 4:
                    updateEmployee();
                    break;
                case 5:
                    deteleEmployee();
                    break;
                case 6:
                    System.out.println("程序结束!");
                    return;
                default:
                    System.out.println("输入错误,请重新选择!");
                    break;
            }
        }while (true);
    }
    public void getEmployee()
    {
        opera.getEmployee();
    }
    public void getEmployeeByEmployeeNo()
    {
        System.out.println("请输入工号:");
        int num1=abc.nextInt();
        opera.getEmployeeByEmployeeNo(num1);
    }
    public void addEmployee()
    {
        System.out.println("请输入工号:");
        int num1=abc.nextInt();
        System.out.println("请输入姓名:");
        String name1=abc.next();
        System.out.println("请输入工资:");
        double salary=abc.nextDouble();
        opera.addEmployee(new Employee(num1,name1,salary));
    }
    public void updateEmployee()
    {
        System.out.println("请输入工号:");
        int num1=abc.nextInt();
        System.out.println("请输入工资:");
        double salary=abc.nextDouble();
        opera.updateEmployee(num1,salary);
    }
    public void deteleEmployee()
    {
        System.out.println("请输入工号:");
        int num1=abc.nextInt();
        opera.deteleEmployee(num1);
    }
}
