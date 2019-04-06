package com.kgc.StudentS;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList();
        Student student1=new Student(1,"张三",10);
        Student student2=new Student(2,"李四",20);
        Student student3=new Student(3,"王五",30);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        Collections.sort(arrayList);
        for (Student student:arrayList) {
            System.out.println(student.getAge()+student.getStuName()+student.getStuNo());
        }
    }
}
