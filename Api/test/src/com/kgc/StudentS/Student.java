package com.kgc.StudentS;

public class Student implements Comparable {
    private int StuNo;
    private String StuName;
    private int age;

    public Student(int stuNo, String stuName, int age) {
        StuNo = stuNo;
        StuName = stuName;
        this.age = age;
    }

    public int getStuNo() {
        return StuNo;
    }

    public void setStuNo(int stuNo) {
        StuNo = stuNo;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student)o;
        if(this.getStuNo()==((Student) o).getStuNo())
        {
            return 0;
        }
        else if(this.getStuNo()>((Student) o).getStuNo())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
