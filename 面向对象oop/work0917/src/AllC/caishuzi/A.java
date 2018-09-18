package AllC.caishuzi;

import java.util.Scanner;

public class A {
    int v=100;
    String a=null;
    public String caice(int num)
    {


        if(num > v)
        {
            a= "太大了";
        }
        else if(num<v)
        {
            a= "太小了";
        }
        else if(num==v)
        {
            a= "猜测成功";
        }
        return a;
    }

    public static void main(String[] args) {
        A wyj=new A();
        Scanner abc=new Scanner(System.in);
        int num;
        do {
            System.out.println("请输入一个数:");
            num=abc.nextInt();
            wyj.caice(num);
            System.out.println(wyj.a);
        }while(!"猜测成功".equals(wyj.caice(num)));
    }
}
