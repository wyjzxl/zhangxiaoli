import java.util.Scanner;

public class selectfind {
    public static void main(String[] args)
    {
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


        System.out.println("选择排序后的数是:");
        for(int i=0;i<arr.length;i++)
        {
            int k=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[k])
                {
                    k=j;
                }
            }
            if(i!=k)
            {
                int tx=arr[i];
                arr[i]=arr[k];
                arr[k]=tx;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
