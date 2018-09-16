package com.hubberspot.designpattern.creational.singleton._lazy_initialization;

public class Demo {
    public static void main(String[] args) {
        // Compilation error: private constructor
        // Employee employee = new Employee();

        // Code breaks in multithreaded environment
        for(int i = 0; i < 10; i++){
            new Thread(() -> {
                Employee employee = Employee.getEmployee();
                employee.printEmployee();
            }).start();
        }
    }
}
