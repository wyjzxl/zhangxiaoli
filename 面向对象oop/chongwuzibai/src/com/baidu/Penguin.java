package com.baidu;

public  class Penguin extends Pet {
    private String sex;
    public Penguin(String name,int health,int love,String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public void showinfor()
    {
        System.out.println("我的昵称:"+super.getName());
        System.out.println("我的健康值是:"+super.getHealth());
        System.out.println("我和主人的亲密度是:"+super.getLove());
        System.out.println("我的性别是::"+getSex());
    }
    @Override
    public  void cure()
    {
        if(getHealth() < 70)
        {
            System.out.println("住院!");
        }
    }
}
