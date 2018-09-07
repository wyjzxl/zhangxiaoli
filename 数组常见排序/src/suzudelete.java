import java.util.Scanner;

public class suzudelete {
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

            //数组的删除
            System.out.println("请问您要删除的数是什么:");
            int index=-1;
            int k=wyj.nextInt();
            for(int i=0;i<arr.length;i++)
            {
                if (arr[i]==k)
                {
                    index=i;
                    break;
                }
            }
            if(index!=-1)
            {
                for(int i=index;i<arr.length-1;i++)
                {
                    arr[i]=arr[i+1];
                }
                arr[arr.length-1]=0;
            }
            else
            {
                System.out.println("没有您要删除的内容!");
            }



            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
}
