import java.util.Scanner;
public class Login {
    public static void main(String[] args)
    {
        int a;
        System.out.println("******************************************************************************");
        System.out.println(" ");
        System.out.println("\t\t\t\t\t欢迎使用我行我素购物管理系统");
        System.out.println(" ");
        System.out.println("\t\t\t\t\t1.登陆系统");
        System.out.println(" ");
        System.out.println("\t\t\t\t\t2.退出");
        System.out.println(" ");
        System.out.println("******************************************************************************");
        System.out.print("请选择,输入数字:");
        Scanner wyj=new Scanner(System.in);
        a=wyj.nextInt();
        for(int i=0;i<=200;i++)
        {
            System.out.println("");
        }
        if(a==1)
        {
            System.out.println("\t\t\t\t\t欢迎使用我行我素购物管理系统");
            System.out.println(" ");
            System.out.println("******************************************************************************");
            System.out.println(" ");
            System.out.println("\t\t\t\t\t1.客户信息管理");
            System.out.println(" ");
            System.out.println("\t\t\t\t\t2.购物结算");
            System.out.println(" ");
            System.out.println("\t\t\t\t\t3.真情回馈");
            System.out.println(" ");
            System.out.println("\t\t\t\t\t4.注销");
            System.out.println(" ");
            System.out.println("******************************************************************************");
        }

    }

}
