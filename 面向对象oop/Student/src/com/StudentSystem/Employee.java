package com.StudentSystem;

public class Employee {
    private int EmployeeNo;
    private String EmployeeName;
    private double EmployeeSalary;

    public Employee(int employeeNo, String employeeName, double employeeSalary) {
        EmployeeNo = employeeNo;
        EmployeeName = employeeName;
        EmployeeSalary = employeeSalary;
    }

    public int getEmployeeNo() {
        return EmployeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        EmployeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        EmployeeSalary = employeeSalary;
    }
}
