import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        double szx=0;
        double qqt=0;
        System.out.println("请输入一个月的通话时间:");
        Scanner wyj=new Scanner(System.in);
        double time=wyj.nextDouble();
        szx=0.6*time;
        qqt=(double)50+ 0.4*time;
        System.out.println("如果你是神州行用户,"+"每个月通话:"+time+"分钟."+"需付费"+szx+"元");
        System.out.println("如果你是全球通用户,"+"每个月通话:"+time+"分钟."+"需付费"+qqt+"元");

    }
}
