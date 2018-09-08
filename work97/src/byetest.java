import java.util.Scanner;

public class byetest
{
    public static void main(String[] args)
    {
        /*String abc=null;
        System.out.print("请输入:");
        Scanner wyj=new Scanner(System.in);

        do {
            abc=wyj.next();

            if(abc.equals("byte"))
            {
                break;
            }
            else
            {
                System.out.print("您输入的是:"+abc);
            }
        }while (true);
        System.out.println("程序结束!");*/




        for(int i=0;;)
        {
            System.out.print("请输入字符串:");
            Scanner wyj1=new Scanner(System.in);
            String ab= wyj1.next();
            if(ab.equals("byte"))
            {
                break;
            }
            else {
                System.out.println("您输入的是:"+ab);
                i++;
            }
        }
        System.out.println("程序结束!");
    }
}
