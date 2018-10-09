package cn.jbit.EmplySys;

/**
 * Created by Administrator on 2018/9/27.
 */
public class Employee {
    private int employId;  //员工号
    private String name;   //姓名
    private double salary;  //工资

    public Employee(int employId, String name, double salary) {
        this.employId = employId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployId() {
        return employId;
    }

    public void setEmployId(int employId) {
        this.employId = employId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
