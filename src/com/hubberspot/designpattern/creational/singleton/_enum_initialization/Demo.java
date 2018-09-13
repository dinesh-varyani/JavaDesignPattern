package com.hubberspot.designpattern.creational.singleton._enum_initialization;

public class Demo {
    public static void main(String[] args) {
        // Compilation error: private constructor
        // Employee employee = new Employee();

        Employee employeeOne = Employee.INSTANCE.getEmployee();
        employeeOne.printEmployee();

        Employee employeeTwo = Employee.INSTANCE.getEmployee();
        employeeTwo.printEmployee();
    }
}
