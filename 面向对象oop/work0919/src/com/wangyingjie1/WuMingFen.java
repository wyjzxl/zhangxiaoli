package com.wangyingjie1;

public class WuMingFen {
    public String theMa;
    public int quantity;
    public boolean likeSoup;
    public WuMingFen(String theMa,int quantity,boolean likeSoup)
    {
        this.theMa=theMa;
        this.quantity=quantity;
        this.likeSoup=likeSoup;
    }
    public WuMingFen(String theMa,int quantity)
    {
        this.theMa=theMa;
        this.quantity=quantity;
    }
    public WuMingFen()
    {
        this.theMa="酸辣面码";
        this.quantity=2;
        this.likeSoup=true;
    }
    public void check()
    {
        System.out.println(theMa+" "+quantity+" "+likeSoup);
    }

    public static void main(String[] args) {
        WuMingFen f1=new WuMingFen("牛肉面码",3,true);
        f1.check();
        WuMingFen f2=new WuMingFen("牛肉面码",2);
        f2.check();

        WuMingFen f3=new WuMingFen();
        f3.check();

    }
}
