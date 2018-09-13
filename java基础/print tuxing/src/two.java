import java.util.Scanner;
//输出直线型
public class two
{
    public static void main(String[] args)
    {
        int a=0;
        System.out.print("请输入行数:");
        Scanner wyj=new Scanner(System.in);
        a=wyj.nextInt();
        for(int i=1;i<=a;i++)
        {
            System.out.println(" * ");
        }
    }
}
