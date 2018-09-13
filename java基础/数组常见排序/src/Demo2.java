import java.util.Scanner;

public class Demo2
{
    public static void main(String[] args) {
        int temp=0;
        String deg=null;
        System.out.print("请输入今天星期几:");
        Scanner wyj = new Scanner(System.in);
        int day = wyj.nextInt();
        if(day==6||day==7)
        {
            System.out.print("今天天气多少度:");
            temp=wyj.nextInt();
        }
        else
        {
            System.out.print("今天天气怎么样?");
            deg=wyj.next();
        }

        if (day==6||day==7)
        {
            if(temp>30)
            {
                System.out.println("去游泳");
            }
            else
            {
                System.out.println("去爬山");
            }
        }
        else
        {
            if (deg.equals("天气好"))
            {
                System.out.println("去谈业务");
            }
            else
            {
                System.out.println("上网查找资料");
            }
        }
    }
}
