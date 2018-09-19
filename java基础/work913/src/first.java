import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int num=0;
        System.out.println("请问要输入几个成绩?");
        Scanner wyj=new Scanner(System.in);
        int sum=0;
        int k=0;
        num=wyj.nextInt();
        int cj=0;
        int js=0;
        int t=0;
        while(num>=0)
        {
            int [] nums=new int [num];
            for(int i=0;i<num;i++)
            {
                System.out.println("请输入第"+(i+1)+"个数");
                cj=wyj.nextInt();
                if(cj>100)
                {
                    while(cj>100)
                    {
                        cj=wyj.nextInt();
                        i--;
                    }
                }
                else if(cj>=0 && cj<=100)
                {
                    nums[i]=cj;
                    sum=sum+nums[i];

                }
                else if(cj<0)
                {
                    num=i;
                    break;
                }
            }
            System.out.print("您输入的数是:");

            for(int i=0;i<=num-1;i++)
            {

                System.out.print(nums[i]+" ");
            }
            for(int i=0;i<=num-1;i++)
            {
                if(nums[i]>=((sum/num)))
                {
                    js++;
                }
            }
            if(num==0 && k==3){
                System.out.println("您输入的第一个数就是负数!");
            }
            else
            {
                System.out.println("\n");
                System.out.println("有"+js+"个数高于或者等于平均分");
                System.out.println("有"+(num-js)+"个数低于平均分");
                t=1;
            }
            if(t==1)
            {
                break;
            }
            break;

        }
        if(num==0)
        {
            System.out.println("您输入的个数错误!");
        }
        else
        {
            System.out.println("程序结束!");
        }




    }
}
