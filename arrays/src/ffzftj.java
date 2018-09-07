import java.util.Scanner;

public class ffzftj {
    public static void main(String[] args) {
        System.out.println("请输入10个数:");
        int[] abc=new int[10];
        Scanner wyj=new Scanner(System.in);
        int number1=0;
        int number2=0;
        int number3=0;
        int qita=0;
        for(int i=0;i<=9;i++)
        {
            abc[i]=wyj.nextInt();
        }
        for(int i=0;i<=9;i++)
        {
            if(abc[i]==1)
            {
                number1++;
            }
            else if(abc[i]==2)
            {
                number2++;
            }
            else if(abc[i]==3)
            {
                number3++;
            }
            else
            {
                qita++;
            }
        }
        System.out.print("输入的10个数为:");
        for(int i=0;i<=9;i++)
        {
            System.out.print(abc[i]+" ");
        }
        System.out.println();
        System.out.println("数字1的个数:"+number1);
        System.out.println("数字2的个数:"+number2);
        System.out.println("数字3的个数:"+number3);
        System.out.println("非法数字的个数:"+qita);
    }
}
