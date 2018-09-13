import java.util.Scanner;

public class test1 {
    public static void main(String[] args)
    {
        int a=0;
        System.out.print("请输入年份:");
        Scanner wyj=new Scanner(System.in);
        a=wyj.nextInt();
        if((a %4==0 && a%100!=0)||(a %100==0 && a%400==0))
        {
            System.out.println(a+"年是闰年");
        }
        else
        {
            System.out.println(a+"年不是闰年");
        }
    }
}
