package com.StudentSystem;

public class InitEmployee {
     public static Employee [] employees=new Employee[10];
     public static User user[]=new User[3];
     static {
         employees[0]=new Employee(1,"张三",1000.0);
         employees[1]=new Employee(2,"李四",2000.0);
         employees[1]=new Employee(3,"王五",3000.0);

         user[0]=new User("admin","admin");
         user[1]=new User("qwert","12345");
         user[2]=new User("asdfg","12345");
     }
}
