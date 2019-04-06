package com.baidu.Api;

public class FanXing<T,V> {
    private T name;
    private V age;

    public FanXing(T name, V age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    public static void main(String[] args) {
        FanXing<String,Integer> fanXing=new FanXing("额呵呵",18);
        System.out.println(fanXing.getAge());
        System.out.println(fanXing.getName());

    }
}
