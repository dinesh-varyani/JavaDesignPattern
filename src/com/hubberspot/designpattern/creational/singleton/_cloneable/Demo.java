package com.hubberspot.designpattern.creational.singleton._cloneable;

public class Demo {
    public static void main(String[] args) {
        Employee employeeOne = Employee.getEmployee();
        employeeOne.printEmployee();

        Employee employeeTwo = Employee.getEmployee();
        employeeTwo.printEmployee();
    }
}
