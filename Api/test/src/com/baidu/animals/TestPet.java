package com.baidu.animals;

public class TestPet {
    public static void main(String[] args)
    {
        /*Dog hehe=new Dog("多多",45,90,0,"哈士奇");*/
        Pet hehe=new Dog("多多",45,90,0,"哈士奇");
        /*Dog d=(Dog) hehe;
        d.hehe();*/
        Master master=new Master();
        master.cure(hehe);
        hehe.print();
        System.out.println("*******************************************");
        master.eat(hehe);
        hehe.print();

        System.out.println("*******************************************");
        /*Penguin haha=new Penguin("嘻嘻",100,100,50,"男");*/
        Pet haha=new Penguin("嘻嘻",100,100,50,"男");
        Master master1=new Master();
        master1.cure(haha);
        haha.print();
        System.out.println("*******************************************");
        master1.eat(haha);
        haha.print();
    }
}
