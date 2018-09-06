import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        System.out.print("请输入一个整数:");
        Scanner wyj=new Scanner(System.in);
        int number=wyj.nextInt();
        if(number%3 ==0 && number%7==0 )
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
