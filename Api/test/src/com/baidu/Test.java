package com.baidu;

public class Test {
    public static void main(String[] args) {
        Host host=new Host();
        Animal animal=host.send("Cat");
        animal.jiao();
    }
}
