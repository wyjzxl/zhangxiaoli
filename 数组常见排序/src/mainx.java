import java.util.Scanner;
//最大最小值
public class mainx
{
    public static void main(String[] args)
    {
        int max=0;
        int min=100;
        int a=1;
        int k=0;
        int b[]=new int [129];
        for(int i=0;i<128;i++)
        {
            System.out.print("请随意输入值:(输入0时结束)");
            Scanner wyj=new Scanner(System.in);
            a=wyj.nextInt();
            if(max<=a)
            {
                max=a;
            }
            if(min>=a)
            {
                min=a;
            }
            if(a==0)
            {
                break;
            }
            b[i]=a;
            k++;
        }
        System.out.println("最大值是:"+max);
        System.out.println("最小值是:"+min);
        System.out.println("您输入的数字是:");
        for(int j=0;j<=k;j++)
        {
            System.out.println(b[j]);
        }
    }
}
