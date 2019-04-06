package CarRentalOop;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        MotoOperation motoMgr=new MotoOperation();
        motoMgr.init();
        System.out.println("*****************欢迎光临租赁公司********************");
        System.out.println("1、轿车\t 2、客车");
        System.out.println("请选择您要租赁得汽车类型");
        int motoType=abc.nextInt();
        String brand="";
        String type="";
        int seat=0;
        if(motoType==1)
        {
            System.out.println("请选择您要租赁得轿车品牌:1、别克 2、宝马");
            int choose=abc.nextInt();
            if(choose==1)
            {
                brand="别克";
                System.out.println("请选择您要租赁得汽车型号:1、林荫大道2、GLB");
                type=(abc.nextInt()==1)?"林荫大道":"GLB";
            } else if (choose==2) {
                brand="宝马";
                System.out.println("请选择您要租赁得汽车型号:1、X6 2、550i");
                type=(abc.nextInt()==1)?"X6":"550i";

            }
        }
        else if(motoType==2)
        {
            type="";
            System.out.println("请选择您要租赁得汽客车型号:1、金杯2、金龙");
            brand=(abc.nextInt()==1)?"金杯":"金龙";
            System.out.println("请选择您要租赁的客车座数:1、16座 2、34座");
            seat=(abc.nextInt()==1)? 16:34;
        }
         MotoVehicle moto=motoMgr.motoLeaseOut(brand,type,seat);
        System.out.println("请输入您的租赁天数:");
        int days=abc.nextInt();
        float money=moto.calcRent(days);
        System.out.println("您需要支付:"+money+"元");
    }
}
