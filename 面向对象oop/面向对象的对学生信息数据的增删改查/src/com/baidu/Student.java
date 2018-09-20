package com.baidu;

public class Student
{
    private int stuNu;
    private  String name;
    private  int age;
    private  double source;

    public Student(int stuNu, String name, int age, double source)
    {
        this.stuNu = stuNu;
        this.name = name;
        this.age = age;
        this.source = source;
    }

    public int getStuNu() {
        return stuNu;
    }

    public void setStuNu(int stuNu) {
        this.stuNu = stuNu;
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

    public double getSource() {
        return source;
    }

    public void setSource(double source) {
        this.source = source;
    }
}
