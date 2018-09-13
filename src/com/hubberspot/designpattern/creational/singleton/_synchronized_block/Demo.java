package com.hubberspot.designpattern.creational.singleton._synchronized_block;

public class Demo {
    public static void main(String[] args) {
        // Compilation error: private constructor
        // Employee employee = new Employee();

        Employee employeeOne = Employee.getEmployee();
        employeeOne.printEmployee();

        Employee employeeTwo = Employee.getEmployee();
        employeeTwo.printEmployee();
    }
}
