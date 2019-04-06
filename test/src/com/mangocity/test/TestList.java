package com.mangocity.test;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class TestList  {
    public static void browseNews() throws InterruptedException {
        for (; ; ) {
            System.out.println("Uh-huh,the good news");
            sleep(1);
        }
    }
    public static void enjoyMusic() throws InterruptedException {
        for (; ; ) {
            System.out.println("Uh-huh,the nice music");
            sleep(1);
        }
    }
    private static void sleep(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }
    public static void main(String args[])  {

        try {
            new Thread(() -> {
                try {
                    enjoyMusic();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            browseNews();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}