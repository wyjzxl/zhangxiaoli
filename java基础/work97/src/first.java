public class first {
    public static void main(String[] args) {
        int i=2;
        int a=2;
        int sum=0;
        int sum1=0;
        int sum2=0;
        while(i<=100)
        {
            sum=sum+i;
            i=i+2;
        }
        System.out.println(sum);


        do {

            sum1=sum1+a;
            a=a+2;
        }while(a<=100);
        System.out.println(sum1);

        for(int j=0;j<=100;)
        {

            sum2=sum2+j;
            j=j+2;
        }
        System.out.println(sum2);
    }
}
