package com.baidu.animals;

public abstract class Pet {
    public String name;
    public int Health;
    public int Love;
    public int Hungry;
    public Pet(){}

    public Pet(String name, int health, int love,int hungry) {
        this.name = name;
        Health = health;
        Love = love;
        Hungry=hungry;
    }

    public int getHungry() {
        return Hungry;
    }

    public void setHungry(int hungry) {
        this.Hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getLove() {
        return Love;
    }

    public void setLove(int love) {
        Love = love;
    }
    public void print()
    {
        System.out.println("宠物的自白:\n我的名字叫:"+getName()+",健康值是:"+getHealth()+",和主人的亲密度是:"+getLove()+"我的饥饿度是:"+getHungry());
    }
   public abstract void go();
   public abstract void eata();
   public void zhuangtai(){
       System.out.println("吃饱了!");
   }
}
