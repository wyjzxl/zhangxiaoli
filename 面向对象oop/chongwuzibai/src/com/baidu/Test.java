package com.baidu;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("多多",80,100,"男") ;
        dog.showinfor();

        Penguin penguin=new Penguin("嘟嘟",60,50,"女") ;
        penguin.showinfor();

        Master zhangsan=new Master();
        zhangsan.cure(dog);
        zhangsan.cure(penguin);

    }
}
