package com.Opera;
import com.StudentSystem.InitEmployee;
import com.Opera.OperaIntfaceD;
import com.StudentSystem.Employee;
public  class Opera implements OperaIntfaceD {
    Employee[] employees=InitEmployee.employees;
    @Override
    public void getEmployee()
    {
        System.out.println("工号\t\t姓名\t\t工资");
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]!=null)
            {
                System.out.println(employees[i].getEmployeeNo()+"\t\t\t"+employees[i].getEmployeeName()+"\t\t"+employees[i].getEmployeeSalary());
            }

        }
    }
    @Override
    public void getEmployeeByEmployeeNo(int EmployeeNo)
    {
        boolean flag=false;
        System.out.println("工号\t\t姓名\t\t工资");
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]!=null)
            {
                if(employees[i].getEmployeeNo()==EmployeeNo)
                {
                    System.out.println(employees[i].getEmployeeNo()+"\t\t\t"+employees[i].getEmployeeName()+"\t"+employees[i].getEmployeeSalary());
                    flag=true;
                    System.out.println("查询成功!");
                    break;
                }
            }

        }
        if(!flag)
        {
            System.out.println("查询失败!");
        }
    }
    @Override
    public void addEmployee(Employee employee)
    {
        boolean flag=false;
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]==null)
            {
                employees[i]=employee;
                flag=true;
                System.out.println("添加成功!");
                break;
            }
        }
        if(!flag)
        {
            System.out.println("添加失败!");
        }
    }
    @Override
    public void updateEmployee(int EmployeeNo,double EmployeeSalary)
    {
        boolean flag=false;
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]!=null)
            {
                if(employees[i].getEmployeeNo()==EmployeeNo)
                {
                    employees[i].setEmployeeSalary(EmployeeSalary);
                    System.out.println("修改成功!");
                    flag=true;
                    break;
                }
            }
        }
        if(!flag)
        {
            System.out.println("修改失败!");
        }
    }
    @Override
    public void deteleEmployee(int EmployeeNo)
    {
        boolean flag=false;
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i]!=null)
            {
                if(employees[i].getEmployeeNo()==EmployeeNo)
                {
                    employees[i]=null;
                    System.out.println("删除成功!");
                    flag=true;
                    break;
                }
            }
        }
        if(!flag)
        {
            System.out.println("删除失败!");
        }
    }
}
