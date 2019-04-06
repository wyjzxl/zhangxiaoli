package AllC.mimaguanli;

import java.util.Scanner;

public class guanli {
    String user;
    int psd;

    public boolean yanzheng()
    {
        boolean flag=false;
        if("admin1".equals(user) && psd==111111)
        {

            flag=true;
        }
        return flag;
    }
    public static void main(String[] args)
    {
        Scanner abc=new Scanner(System.in);
        guanli wyj=new guanli();
        System.out.print("请输入用户名:");
        wyj.user=abc.next();
        System.out.print("请输入密码:");
        wyj.psd=abc.nextInt();
        boolean k=wyj.yanzheng();
        if(!k)
        {
            System.out.println("用户和密码不匹配!您没有权限更新管理员信息");
        }
        else
        {
            System.out.print("");
            System.out.print("\n请输入新密码:");
            int num = abc.nextInt();
            System.out.println("修改密码成功,您的新密码为:" + num);
        }
    }
}
