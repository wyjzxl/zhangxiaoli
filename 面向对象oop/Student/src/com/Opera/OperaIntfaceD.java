package com.Opera;

import com.StudentSystem.Employee;
public interface OperaIntfaceD {

    void getEmployee();

    void getEmployeeByEmployeeNo(int EmployeeNo);

    void addEmployee(Employee employee);

    void updateEmployee(int EmployeeNo,double EmployeeSalary);

    void deteleEmployee(int Employee);

}
