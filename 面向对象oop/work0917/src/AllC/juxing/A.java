package AllC.juxing;

public class A
{
    double shang;
    double xia;
    double zuo;
    double you;
    public  double zhouchang()
    {
        double zhouchang=shang+xia+zuo+you;
        return zhouchang;
    }
    public double mianji()
    {
        double mianji=shang*you;
        return mianji;
    }
    public static void main(String[] args) {
        A abc=new A();
        abc.shang=20.0;
        abc.xia=20.0;
        abc.you=10.0;
        abc.zuo=10.0;
        System.out.println("周长是:"+abc.zhouchang()+",面积是:"+abc.mianji());
    }
}
