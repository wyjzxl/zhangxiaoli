package com.baidu;

public  class Dog extends Pet{
    private String stain;

    public Dog(String name,int health,int love,String stain) {
        super(name,health,love);
        this.stain = stain;
    }

    public String getStain() {
        return stain;
    }
    public void setStain(String stain) {
        this.stain = stain;
    }
    @Override
    public  void showinfor()
    {
        System.out.println("我的昵称:"+super.getName());
        System.out.println("我的健康值是:"+super.getHealth());
        System.out.println("我和主人的亲密度是:"+super.getLove());
        System.out.println("我的种类是::"+getStain());
    }
    @Override
    public void cure()
    {
        if(getHealth() < 70)
        {
            System.out.println("打针吃药!");
        }
    }

}
