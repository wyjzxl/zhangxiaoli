package cn.jbit.EmplySys.Opera;

import cn.jbit.EmplySys.Employee;
import cn.jbit.EmplySys.InitEmployee;

/**
 * Created by Administrator on 2018/9/27.
 */
public class OpreaImpl implements OpreraInterface {
    Employee[]employees= InitEmployee.employees;
    @Override
    public void addEmpoy(Employee employee) {
        boolean flag=false;
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]==null){
                employees[i]=employee;
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("人员已满");
        }
    }

    @Override
    public void updateEmpoy(int employId,double salary) {
        boolean flag=false;
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]!=null) {
                if (employees[i].getEmployId() == employId) {
                    employees[i].setSalary(salary);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("未找到");
        }
    }

    @Override
    public void deleteEmpoy(int employId) {
        boolean flag=false;
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]!=null) {
                if (employees[i].getEmployId() == employId) {
                    employees[i]=null;
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("未找到");
        }
    }

    @Override
    public void getEmpoys() {
        System.out.println("工号\t\t姓名\t\t工资");
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]!=null) {
                System.out.println(employees[i].getEmployId()
                        +"\t"+employees[i].getName()
                        +"\t\t"+employees[i].getSalary());
            }
        }
    }

    @Override
    public void getEmpoysById(int employId) {
        boolean flag=false;
        System.out.println("工号\t\t姓名\t\t工资");
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]!=null) {
                if (employees[i].getEmployId() == employId) {
                    System.out.println(employees[i].getEmployId()
                            +"\t"+employees[i].getName()
                            +"\t\t"+employees[i].getSalary());
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("未找到");
        }
    }
}
