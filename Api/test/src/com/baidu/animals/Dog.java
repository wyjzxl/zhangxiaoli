package com.baidu.animals;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Dog extends Pet {
    public String strain;
    public Dog(){
    }
    public Dog(String name, int health, int love,int hungry, String strain) {
        super(name, health, love,hungry);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("我是一只"+getStrain());
    }
    public void hehe(){
        System.out.println("游泳!");
    }
    @Override
    public void go(){
        System.out.println("去医院");
        setHealth(30);
    }
    @Override
    public void eata(){
        System.out.println("吃根骨头");
        setHungry(getHungry()+3);

    }
}
