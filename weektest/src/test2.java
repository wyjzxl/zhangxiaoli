import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int a =0;
        int b;
        int c=0;
        int d=0;
        String huangou=null;
        Scanner wyj=new Scanner(System.in);
        System.out.print("请输入消费金额:");
        a=wyj.nextInt();
        System.out.println("是否参加优惠换购活动:");
        System.out.println("1:满50元,加2元换购百事可乐饮料1瓶");
        System.out.println("2:满100元,加3元换购500ml可乐一瓶");
        System.out.println("3:满100元,加10元换购5公斤面粉");
        System.out.println("4:满200元,加10元换购1个苏泊尔炒菜锅");
        System.out.println("5:满200元,加20元换购欧莱雅爽肤水一瓶");
        System.out.println("0:不换购");
        System.out.print("请选择:");
        b=wyj.nextInt();
        while(true)
        {
            if(a>=50 && b==1)
            {
                c=2+a;
                huangou="百事可乐饮料1瓶";
                break;
            }
            else  if(a>=100 && b==2)
            {
                c=3+a;
                huangou="500ml可乐一瓶";
                break;
            }
            else if(a>=100 && b==1)
            {
                c=2+a;
                huangou="百事可乐饮料1瓶";
                break;
            }
            else  if(a>=100 && b==3)
            {
                c=10+a;
                huangou="5公斤面粉";
                break;
            }
            else  if(a>=200 && b==1)
            {
                c=2+a;
                huangou="百事可乐饮料1瓶";
                break;
            }
            else  if(a>=200 && b==2)
            {
                c=3+a;
                huangou="500ml可乐一瓶";
                break;
            }
            else if(a>=200 && b==3)
            {
                c=a+10;
                huangou="5公斤面粉";
                break;
            }
            else  if(a>=200 && b==4)
            {
                c=10+a;
                huangou="1个苏泊尔炒菜锅";
                break;
            }

            else  if(a>=200 && b==5)
            {
                c=20+a;
                huangou="欧莱雅爽肤水一瓶";
                break;
            }
            else if(b==0)
            {
                c=a;
                huangou="";
                break;
            }
            else
            {
                System.out.println("不满足条件换购!");
                System.out.print("请重新选择:");
                b=wyj.nextInt();
            }
        }


        System.out.println("本次消费总金额:"+(float)c);
        System.out.println("成功换购:"+huangou);
    }
}
