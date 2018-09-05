import java.util.Scanner;
//伞形
public class five {
    public static void main(String[] args)
    {
        String str="";
        int a=0;
        System.out.print("请输入行数:");
        Scanner wyj=new Scanner(System.in);
        a=wyj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<a;i++)
        {
            str+=" ";
        }
        for(int j=0;j<a;j++)
        {
            System.out.println(str+"*");
        }
    }
}
