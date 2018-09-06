import java.util.Scanner;

public class second {
    public static void main(String[] args)
    {
        System.out.println("请输入一个整数:");
        Scanner wyj=new Scanner(System.in);
        int number=wyj.nextInt();
        if(number%2==0)
        {
            System.out.println(number+"是偶数");
        }
        else
        {
            System.out.println(number+"是奇数");
        }
    }
}
