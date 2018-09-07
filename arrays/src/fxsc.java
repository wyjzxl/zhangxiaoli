import java.util.Scanner;

public class fxsc {
    public static void main(String[] args) {
        System.out.println("输入五句话:");
        Scanner wyj=new Scanner(System.in);
        String [] abc=new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("第"+(i+1+"句话:"));
            abc[i]=wyj.next();
        }
        System.out.println("逆序输出5句话:");
        for(int i=1;i<=5;i++)
        {
            System.out.print("第"+i+"句话:");
            System.out.println(abc[5-i]);
        }
    }
}
