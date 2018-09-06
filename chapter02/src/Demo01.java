public class Demo01
{
    public static void main(String[] args)
    {
        int a=2;
        byte b=2;
        long c=2;
        short d=2;
        char e='A';
        float f=2.5f;
        double g=2.5;
        boolean x=true;
        String y="agdga";

        //小转大
        int abc;
        byte ab=55;
        abc=ab;
        System.out.println(abc);
        //大转小
        int bbc=55;
        byte bb;
        bb= (byte) bbc;
        System.out.println(bb );
        System.out.println("\t");
        //复合运算
        int m=5;
        int n=6;
        System.out.println(m+=n);
        System.out.println(m-=n);
        System.out.println(m*=n);
        System.out.println(m/=n);

        System.out.println("\t");
        //逻辑运算符
        boolean f1=2>1 && 3>4;
        System.out.println(f1);

        boolean f2=2>1 || 3>4;
        System.out.println(f2);

        boolean f3=2>1 && !(3>4);
        System.out.println(f3);

        //条件运算符
        System.out.println("\t");
        String ABC=90>100?"true":"false";
        System.out.println(ABC);
    }
}
