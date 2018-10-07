package com.baidu.Api;

public class Student {
    private int stuNo;
    private String name;
    private int age;

    public Student() {
    }
    public Student(int stuNo, String name, int age) {
        this.stuNo = stuNo;
        this.name = name;
        this.age = age;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
