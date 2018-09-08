import java.util.Scanner;

public class login
{
    public static void main(String[] args) {
        String name1 =null;
        int psd = 0;
        int k=0;
        Scanner abc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++)
        {
            System.out.print("请输入用户名:");
            name1=abc.next();
            System.out.print("请输入密码:");
            psd=abc.nextInt();
            if(name1.equals("wyj") && psd==123123)
            {
                System.out.println("欢迎登陆MyShopping系统!");
                break;
            }
            else
            {
                System.out.println("输入错误!您还有"+(3-i)+"次机会!");
                System.out.println();
                k++;
            }
            if(k==3)
            {
                System.out.println("对不起,您3次均输入错误!");
            }
        }
    }
}
