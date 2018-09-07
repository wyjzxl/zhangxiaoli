import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        int number=0;
        int shuzi=0;
        int counter=1;
        Scanner wyj=new Scanner(System.in);
        number=(int)(Math.random()*99);
        while(counter<=20)
        {
            shuzi=wyj.nextInt();
            if(shuzi==number)
            {
                System.out.println("恭喜你猜对了!");
                System.out.println("一共猜了"+counter+"次");
                break;
            }
            else if(shuzi>number)
            {
                System.out.println("太大!");
            }
            else if(shuzi<number)
            {
                System.out.println("太小!");
            }
            counter++;
        }
        System.out.println("幸运数字是:"+number);
        if(counter==1)
        {
            System.out.println("你太有才了!");
        }
        else if(counter>=2 && counter<=6)
        {
            System.out.println("这么快就猜出来了,很聪明么!");
        }
        else if(counter>=7)
        {
            System.out.println("猜了半天才才出来,小同志,尚需努力啊!");
        }
    }
}
