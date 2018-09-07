public class test {
    public static void main(String[] args) {
        int i=2;
        int sum=0;
        int sum1=0;
        int sum2=0;
        int a=0;
        //while循环
        while(i<=100)
        {
            if(i%2==0)
            {
                sum=sum+i;

            }
            i++;
        }
        System.out.println(sum);
        //for循环
        for(int j=0;j<=100;j++)
        {
            if(j%2==0)
            {
                sum1=sum1+j;

            }
        }
        System.out.println(sum1);
        //do while
        do{

                sum2=sum2+a;
                a=a+2;
        }while(a<=100);
        System.out.println(sum2);
    }

}
