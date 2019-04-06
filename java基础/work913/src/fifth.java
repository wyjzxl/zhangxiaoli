import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        System.out.println("请输入会员本月的消费记录:");
        Scanner wyj=new Scanner(System.in);
        double []nums=new double[5];
        double sum=0.0;
        for(int i=0;i<nums.length;i++)
        {
            System.out.print("请输入第"+(i+1)+"笔购物金额:");
            nums[i]=wyj.nextDouble();
        }
        System.out.println();
        System.out.println("序号\t\t\t\t\t\t金额(元)");
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            System.out.println((i+1)+"\t\t\t\t\t\t\t"+nums[i]);
        }
        System.out.println("总金额\t\t\t\t\t\t"+sum);
    }
}
