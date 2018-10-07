package com.baidu.animals;

public class Penguin extends Pet {
    public String sex;
    public Penguin() {
    }

    public Penguin(String name, int health, int love,int hungry,String sex) {
        super(name, health, love,hungry);
        this.sex=sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public void print()
    {
        super.print();
        System.out.println("我的性别是:"+getSex());
    }
    @Override
    public void go()
    {
        System.out.println("打针吃药!");
        setHealth(30);
    }
    @Override
    public void eata(){
        System.out.println("吃条鱼");
        setHungry(getHungry()+5);

    }
}
