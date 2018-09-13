import java.util.Scanner;

public class HalfFind {
    public static int a[]=new int[25];
    public static int count=0;

    public static void FindAscending(int low,int high,int x){
        int mid;
        int temp;
        if(low<high){
            mid=(low+high)/2;
            count++;
            if(a[mid]>x){
                temp=a[mid];
                System.out.println("本次二分的结果为:"+temp);
                FindAscending(low,mid-1,x);
            }
            else if(a[mid]<x){
                temp=a[mid];
                System.out.println("本次二分的结果为:"+temp);
                FindAscending(mid+1,high,x);
            }
            else{
                temp=a[mid];
                System.out.println("本次二分的结果为:"+temp);
                System.out.println("升序的有序表中查找到元素的位置是:"+mid+""+" 查找到该元素共花费了:"+count+" 次 ");
            }
        }
        else{
            System.out.println("该升序的有序数组中没有您要查找的元素哎!, 在好好检查一下吧！");
        }
    }
    public static void FindDiscending(int high,int low,int x){
        int mid;
        int temp;
        if(high>low){
            mid=(high+low)/2;
            count++;
            if(a[mid]>x){
                temp=a[mid];
                System.out.println("本次二分的中位数为:"+temp);
                FindDiscending(mid+1,low,x);
            }
            else if(a[mid]<x){
                temp=a[mid];
                System.out.println("本次二分的中位数为:"+temp);
                FindDiscending(high,mid-1,x);
            }
            else{
                temp=a[mid];
                System.out.println("本次二分的中位数为;"+temp);
                System.out.println("降序的有序表中查找的元素的位置为:"+mid+""+" 查找到该元素共花费了:"+count+" 次 ");
            }
        }
        else{
            System.out.println("该降序的有序数组中没有您要查找的元素哎!, 在好好检查一下吧");
        }
    }
    public static void main(String[] args) {
        int n,x;
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入您的有序表的元素:");
        System.out.println("-------------");
        n=cin.nextInt();
        System.out.println("请按照升序或降序的顺序的顺序读入有序表中的元素:");
        System.out.println("-------------");
        for(int i=1;i<=n;i++){
            a[i]=cin.nextInt();
        }
        System.out.println("输入您要查找的元素:");
        x=cin.nextInt();
        if(a[1]<=a[n]){
            FindAscending(1,n,x);
            System.out.println("返回了您将才要查找的元素:"+x);
        }
        else{
            FindDiscending(n,1,x);
            System.out.println("返回了您将才要查找的元素:"+x);
        }
        System.out.println("至此二分查找的算法就完美的实现完毕了!");
    }
}