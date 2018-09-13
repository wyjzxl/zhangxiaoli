import java.util.Scanner;

import java.util.Scanner;
public class work2
{
        public static void main(String[] args)
        {
            int a;
            int gw;
            int sw;
            int bw;
            int qw;
            int sum;
            System.out.println("您的会员卡号是:");
            Scanner wyj = new Scanner(System.in);
            a = wyj.nextInt();
            gw = a % 10;
            sw = a / 10 % 10;
            bw = a / 100 % 10;
            qw = a / 1000;
            sum = gw + sw + bw + qw;
            System.out.println("您的会员卡号是:" + a);
            System.out.print("千位数是:" + qw);
            System.out.print("百位数是:" + bw);
            System.out.print("十位数是:" + sw);
            System.out.println("个位数是:" + gw);
            System.out.println("会员卡号:" + a +  "各个位之和:" + sum);
            if(sum>20)
            {
                System.out.println("会员卡号:" + a +  "的会员,您中奖了!奖品是MP3!" );
            }
            else
            {
                System.out.println("会员卡号:" + a +  "的会员,很遗憾，您没中奖!" );
            }
        }
}
