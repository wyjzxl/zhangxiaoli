public class ZSLJ {
    public static void main(String[] args) {
        int sum=0;
        int i;
        for(i=1;i<=10;i++)
        {
            sum+=i;
            if(sum>20)
            {
                break;
            }
        }
        System.out.println("当前数为:"+i+"累加值为:"+sum);
    }
}
