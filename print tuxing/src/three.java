import java.util.Scanner;
//打印阶梯型
public class three
{
    public static void main(String[] args)
    {
        int a=0;
        System.out.print("请输入行数:");
        Scanner wyj=new Scanner(System.in);
        a=wyj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
