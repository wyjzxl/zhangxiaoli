import java.util.Scanner;
public class work1 {
        public static void main(String[] args)
        {
            int a=0;
            int num1=0;
            int num2=0;
            int num3=0;
            int num4=0;
            int [] abc=new int[10];
            System.out.println("请输入10个数");
            Scanner wyj=new Scanner(System.in);
            for(int i=0;i<=9;i++)
            {
                a=wyj.nextInt();
                if(a==1)
                {
                    num1+=1;
                }
                else if(a==2)
                {
                    num2+=1;
                }
                else if(a==3)
                {
                    num3+=1;
                }
                else
                {
                    num4+=1;
                }
                abc[i]=a;
            }
            System.out.print("输入的10个数为:");
            for(int i=0;i<=9;i++)
            {
                System.out.print(abc[i]+" ");
            }
            System.out.println("数字1的个数"+num1);
            System.out.println("数字2的个数"+num2);
            System.out.println("数字3的个数"+num3);
            System.out.println("非法数字的个数"+num4);
        }

}
