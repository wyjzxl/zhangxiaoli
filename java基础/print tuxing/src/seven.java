import java.util.Scanner;
//打印空心菱形
public class seven
{
    public static void main(String[] args)
    {
        int a=0;
        System.out.print("请输入行数:");

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
            System.out.print("*");
            for (int k = 2; k < 2 * i - 1; k++)
            {
                System.out.print(" ");
            }
            if (i >= 2) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int l = 1; l <= b - 1; l++)
        {
            for (int j = 1; j <= l; j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int m = 1; m <= (-2 * l+ 2 * b - 3); m++)
            {
                System.out.print(" ");
            }
            if (l <= b - 2)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
