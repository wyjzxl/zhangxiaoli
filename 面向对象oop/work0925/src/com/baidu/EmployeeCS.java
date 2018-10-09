package com.baidu;

public class EmployeeCS extends Employee
{
    public EmployeeCS()
    {
    }

    public EmployeeCS(int employeeNu, String employeeName, double employeeMoney) {
        super(employeeNu, employeeName, employeeMoney);
    }
    public   Employee [] employee=new Employee[5];
    @Override
    public void showInfor()
    {
       employee[0]= new Employee(1,"王五",5000.0);
        employee[1]= new Employee(2,"张三",6000.0);
        employee[2]= new Employee(3,"李四",7000.0);
        employee[3]= new Employee(4,"柳六",8000.0);
        employee[4]= new Employee(5,"汪七",9000.0);
    }

}
