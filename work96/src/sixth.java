import java.util.Scanner;

public class sixth
{
    public static void main(String[] args)
    {
            System.out.print("请输入上网时间:");
            Scanner wyj=new Scanner(System.in);
            double time=wyj.nextDouble();
            if(time<=10)
            {
                System.out.println("您的上网费为:"+String.format("%.2f", (double)30));
            }
            else if(time>10||time<50)
            {
                System.out.println("您的上网费为:"+String.format("%.2f", (double)(30+3*(time-10))));
            }
            else
            {
                System.out.println("您的上网费为:"+String.format("%.2f", (double) (150+(time-50))));
            }
    }

}
