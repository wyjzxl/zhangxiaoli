package cn.jbit.EmplySys;
import cn.jbit.EmplySys.InitEmployee;
import cn.jbit.EmplySys.Opera.OpreaImpl;
import cn.jbit.EmplySys.Opera.OpreraInterface;
import cn.jbit.EmplySys.User;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/9/27.
 * 菜单类
 */
public class Menu {
    OpreaImpl opera=new OpreaImpl();
    User[]users= InitEmployee.users;
    Scanner input=new Scanner(System.in);
    //登录菜单
    public void LoginMenu(){
        System.out.println("请输入用户名:");
        String name=input.next();
        System.out.println("请输入密码:");
        String pwd=input.next();
        boolean flag=false;
        for (int i = 0; i <users.length ; i++) {
            if(name.equals(users[i].getUserName())
                    &&pwd.equals(users[i].getPassword())){
                 flag=true;
            }
        }
        if(flag){
            //进入主菜单
            MainMenu();
        }else{
            System.out.println("用户名或密码错误");
        }
    }
    //主菜单
    public void MainMenu(){
        do {
            System.out.println("1、查询所有员工信息");
            System.out.println("2、查询员工信息");
            System.out.println("3、添加员工信息");
            System.out.println("4、修改员工信息");
            System.out.println("5、删除员工信息");
            System.out.println("6、退出");
            System.out.println("请选择：");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    getEmplyees();
                    break;
                case 2:
                    getEmplyee();
                    break;
                case 3:
                    addEmployee();
                    break;
                case 4:
                   updateEmplyee();
                    break;
                case 5:
                    deleteEmplyee();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("输入错误请从新选择");
                    break;
            }
        }while(true);
    }
    //增加
    public void addEmployee(){
        System.out.println("请输入工号:");
        int id=input.nextInt();
        System.out.println("请输入姓名:");
        String name=input.next();
        System.out.println("请输入工资:");
        double salary=input.nextDouble();
        Employee employee=new Employee(id,name,salary);
        opera.addEmpoy(employee);
    }
    //根据工号查询员工信息
    public void getEmplyee(){
        System.out.println("请输入工号:");
        int id=input.nextInt();
        opera.getEmpoysById(id);
    }
    //查询所有信息
    public void getEmplyees(){
        opera.getEmpoys();
    }
    //根据工号修改员工信息
    public void updateEmplyee(){
        System.out.println("请输入工号:");
        int id=input.nextInt();
        System.out.println("请输入工资:");
        double salary=input.nextDouble();
        opera.updateEmpoy(id,salary);
    }
    //删除员工
    public void deleteEmplyee(){
        System.out.println("请输入工号:");
        int id=input.nextInt();
        opera.deleteEmpoy(id);
    }
}
