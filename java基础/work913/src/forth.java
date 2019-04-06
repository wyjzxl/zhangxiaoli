import java.util.Scanner;

public class forth {
    public static void main(String[] args) {
        System.out.println("请输入4家点的价格:");
        Scanner wyj=new Scanner(System.in);
        int []nums=new int[4];
        for(int i=0;i<4;i++)
        {
            System.out.print("第"+(i+1)+"家的价格:");
            nums[i]=wyj.nextInt();
        }
        int min=nums[0];
        for(int i=0;i<4;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        System.out.println("最低价格是:"+min);
    }
}
