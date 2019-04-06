package com.baidu;

public class Employee {
    private int  EmployeeNu;
    private String EmployeeName;
    private double EmployeeMoney;
    public Employee()
    {
    }
    public Employee(int employeeNu, String employeeName, double employeeMoney)
    {
        this.EmployeeNu = employeeNu;
        this.EmployeeName = employeeName;
        this.EmployeeMoney = employeeMoney;
    }

    public int getEmployeeNu() {
        return EmployeeNu;
    }

    public void setEmployeeNu(int employeeNu) {
        EmployeeNu = employeeNu;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public double getEmployeeMoney() {
        return EmployeeMoney;
    }

    public void setEmployeeMoney(double employeeMoney) {
        EmployeeMoney = employeeMoney;
    }
    public void showInfor()
    {
        System.out.println("员工号:"+getEmployeeNu()+"姓名:"+getEmployeeName()+"员工工资:"+getEmployeeMoney());
    }
}
