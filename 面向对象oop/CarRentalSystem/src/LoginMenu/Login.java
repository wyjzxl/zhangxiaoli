package LoginMenu;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("***欢迎进入注册系统***\n");
        while (true)
        {
            System.out.print("请输入用户名:");
            String username=abc.next();
            System.out.print("请输入密码:");
            String pwd=abc.next();
            System.out.print("请再次输入密码:");
            String pwdtry=abc.next();
            if(username.length()<3 ||pwd.length()<6) {
                System.out.println("用户名长度不能小于3,密码长度不能小于6!");
            }
            else
            {
                if(pwd.equals(pwdtry))
                {
                    System.out.println("注册成功!请牢记密码");
                    break;
                }
                else
                {
                    System.out.println("两次密码不相等!");
                }
            }



        }
    }
}
