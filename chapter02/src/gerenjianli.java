import java.util.Scanner;

public class gerenjianli
{
    public static void main(String[] args)
    {
        String name="小明";
        int age=25;
        int jt=3;
        int a=5;
        String b="Java";
        String c="篮球";
        System.out.println("这个同学的姓名是:"+name);
        System.out.println("年龄是:"+age);
        System.out.println("工作了"+jt+"年了");
        System.out.println("做过"+a+"个项目");
        System.out.println("这技术方向是"+b);
        System.out.println("兴趣爱好是:"+c);
        System.out.print("请输入:");
        Scanner wyj=new Scanner(System.in);
        int z=wyj.nextInt();
        System.out.println(z);

        //输入并显示会员卡号
        System.out.print("请输入您的会员卡号:");
        int t=wyj.nextInt();
        System.out.println("会员卡号是:"+t);
    }
}
