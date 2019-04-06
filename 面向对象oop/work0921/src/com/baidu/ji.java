package com.baidu;

public class ji extends jiaqin {
    public ji(String name, String strain, String food, String action)
    {
        super(name,strain,food,action);
    }
    @Override
    public void showInfor()
    {
        System.out.print("我叫"+super.getName());
        System.out.println(",是一只"+super.getStrain());
        System.out.println("我会吃"+super.getFood());
        System.out.println("我会"+super.getAction());
    }
}
