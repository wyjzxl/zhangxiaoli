package studnentMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/10/7.
 */
public class Oprea {
    Scanner input=new Scanner(System.in);
    HashMap<Integer,Student> stus=new HashMap();
    //菜单
    public void menu(){
        do {
            System.out.println("欢迎进入学生管理系统");
            System.out.println("1、增加");
            System.out.println("2、修改");
            System.out.println("3、删除");
            System.out.println("4、查询");
            System.out.println("5、根据学号查询");
            System.out.println("6、退出");
            System.out.println("请选择:");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("请输入学号");
                    int stuNo=input.nextInt();
                    System.out.print("请输入姓名");
                    String stuName=input.next();
                    System.out.print("请输入年龄");
                    int stuAge=input.nextInt();
                    Student stu=new Student(stuNo,stuName,stuAge);
                    addStu(stu);
                    break;
                case 2:
                    System.out.print("请输入学号");
                    int updateNo=input.nextInt();
                    System.out.print("请输入年龄");
                    int newAge=input.nextInt();
                    updateAge(updateNo,newAge);
                    break;
                case 3:
                    System.out.print("请输入学号");
                    int deleteNo=input.nextInt();
                    deleteByStuNo(deleteNo);
                    break;
                case 4:
                    getStus();
                    break;
                case 5:
                    System.out.print("请输入学号");
                    int getNo=input.nextInt();
                    getStusByStuNo(getNo);
                    break;
                case 6:
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }while(true);
    }
    //增加
    public void addStu(Student stu){
        if(stus.containsKey(stu.getStuNo())){
            System.out.println("该生已存在");
        }else{
            stus.put(stu.getStuNo(),stu);
        }
    }
    //修改
    public void updateAge(int stuNo,int age){
        if(stus.containsKey(stuNo)){
            stus.get(stuNo).setAge(age);
        }else{
            System.out.println("未找到");
        }
    }
    //查询所有
    public void getStus(){
        System.out.println("学号\t姓名\t年龄");
        //获取值得集合
        Collection<Student>values=stus.values();
        for (Student s:values) {
            System.out.println(s.getStuNo()+"\t"+s.getName()+"\t"+s.getAge());
        }
    }
    //根据学号查询
    public void getStusByStuNo(int stuNo){
        System.out.println("学号\t姓名\t年龄");
        if(stus.containsKey(stuNo)){
            Student s=stus.get(stuNo);
            System.out.println(s.getStuNo()+"\t"+s.getName()+"\t"+s.getAge());
        }else{
            System.out.println("未找到");
        }
    }
    //删除
    public void deleteByStuNo(int stuNo){
        if(stus.containsKey(stuNo)){
            stus.remove(stuNo);
        }else{
            System.out.println("未找到");
        }
    }
}
