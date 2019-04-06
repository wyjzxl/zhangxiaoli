package com.baidu;

import java.util.Scanner;

public class until {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("*****欢迎登入员工管理系统!*****");
        boolean flag=false;
        int kaiguan;
        UserCS userCS=new UserCS();

        System.out.print("请输入用户名:");
        String loginName=num.next();
        System.out.print("请输入密码");
        int loginpwd=num.nextInt();
        userCS.showInfor();
            for(User use:userCS.users)
            {
                if(loginName.equals(use.getUsername()) && loginpwd==use.getPassword())
                {
                    System.out.println("登陆成功!");
                    kaiguan=num.nextInt();
                    switch (kaiguan)
                    {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        default:
                                flag=true;
                    }
                    if(!flag)
                    {
                        break;
                    }
                }
                else
                {
                    System.out.println("登陆失败!");
                    break;
                }
            }
    }
}
