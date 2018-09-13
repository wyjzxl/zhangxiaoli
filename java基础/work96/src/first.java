import java.util.Scanner;

public class first
{
    public static void main(String[] args)
    {
        System.out.println("我行我素购物管理系统 >  幸运抽奖");
        System.out.print("\n");
        System.out.print("请输入四位会员号:");
        Scanner wyj=new Scanner(System.in);
        int sum=wyj.nextInt();
        if(sum>=1000 && sum<=9999)
        {
            int bw=sum/100%10;
            int a=(int)(Math.random()*1+9);
            System.out.println("幸运数字是:"+a);
            if(a==bw)
            {
                System.out.println(sum+"号是幸运客户，获精美MP3一个.");
            }
            else
            {
                System.out.println(sum+"号客户，谢谢您的支持!");
            }
        }
        else
        {
            System.out.print("请重新输入四位会员号:");
            sum=wyj.nextInt();
            int bw=sum/100%10;
            int a=(int)(Math.random()*1+9);
            System.out.println("幸运数字是:"+a);
            if(a==bw)
            {
                System.out.println(sum+"号是幸运客户，获精美MP3一个.");
            }
            else
            {
                System.out.println(sum+"号客户，谢谢您的支持!");
            }
        }
    }
}
