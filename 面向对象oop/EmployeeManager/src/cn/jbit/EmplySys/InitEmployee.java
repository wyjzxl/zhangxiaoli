package cn.jbit.EmplySys;
/**
 * Created by Administrator on 2018/9/27.
 */
public class InitEmployee {
    public static Employee[] employees=new Employee[10];
    public static User[]users=new User[2];
    static{
        employees[0]=new Employee(1,"张三",9000);
        employees[1]=new Employee(2,"李四",10000);
        employees[2]=new Employee(3,"王五",15000);
    }
    static{
        users[0]=new User("admin","123456");
        users[1]=new User("郭靖","123456");
    }
}
