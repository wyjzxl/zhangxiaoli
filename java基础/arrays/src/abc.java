import java.util.Arrays;

import static java.util.Arrays.copyOf;

//Arrays的用法
public class abc
{
    public static void main(String[] args)
    {
        int [][] abc=new int [][]{{5,1},{4,1},{3,1},{2,1},{1,1}};
        int [] wyj=new int []{10,30,200,150};
        for(int i=0;i<=abc.length-1;i++)
        {
            Arrays.sort(abc[i]);
        }
        for(int i=0;i<abc.length;i++)
        {

            for(int j=0;j<abc[i].length;j++)
            {
                System.out.print(abc[i][j]+" ");

            }
        }
        System.out.println("\n");
        for(int i=0;i<abc.length;i++)
        {
            System.out.print(Arrays.toString(abc[i]));
        }
        System.out.println("\n");
        int []x= copyOf(wyj,6);
        for(int i=0;i<=abc.length;i++)
        {

            System.out.println(x[i]);
        }
        System.out.println("\n");
        Arrays.sort(wyj);
        int y=Arrays.binarySearch(wyj,200);
        System.out.println(y);
    }
}
