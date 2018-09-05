import java.util.Scanner;
//打印菱形
public class six {

    public static void main(String[] args)
    {
        int a=0;
        System.out.print("请输入行数:");
        Scanner wyj=new Scanner(System.in);
        a=wyj.nextInt();
        if(a%2==0)
        {
            a++;
        }
        int b=a/2+1;
        for (int i = 1; i <= b; i++)
        {
            for (int j = 1; j <= b - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= b - 1; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (-2 * i + 2 * b- 1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
