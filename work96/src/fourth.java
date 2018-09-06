import java.util.Scanner;
public class fourth
{
    public static void main(String[] args)
    {
        int a=0;
        int b=0;
        int k=0;
        int n=0;
        System.out.println("请输入数组的个数:");
        Scanner wyj=new Scanner(System.in);
        n=wyj.nextInt();
        int [] arr=new int [n];
        System.out.println("请输入数组的元素:");
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=wyj.nextInt();
        }

        System.out.println("您输入的数是:");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\t");


        System.out.println("冒泡排序后的数是:");
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tx=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tx;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
