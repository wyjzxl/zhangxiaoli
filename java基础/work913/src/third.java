import java.util.Scanner;

public class third
{
    public static void main(String[] args)
    {
        int []nums=new int []{99,85,82,63,60,0};
        int index=-1;
        Scanner wyj=new Scanner(System.in);
        System.out.println("请输入");
        int num=wyj.nextInt();
        for(int i=0;i<nums.length;i++)
        {
            if(num>nums[i])
            {
                index=i;
                break;
            }
        }
        if(index!=-1)
        {
            for(int i=nums.length-1;i>index;i--)
            {
                nums[i]=nums[i-1];
            }
            nums[index]=num;
        }
        System.out.println("插入成绩的下标是:"+index);
        System.out.println("插入后的成绩信息是:");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+"\t");
        }
    }
}
