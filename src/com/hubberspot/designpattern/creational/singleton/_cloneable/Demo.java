package com.hubberspot.designpattern.creational.singleton._cloneable;

public class Demo {
    public static void main(String[] args) 
                            throws CloneNotSupportedException {
        Employee employeeOne = Employee.getEmployee();
        Employee employeeTwo = (Employee) employeeOne.clone();
        employeeOne.printEmployee();
        employeeTwo.printEmployee();
    }
}
