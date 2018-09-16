package com.hubberspot.designpattern.creational.singleton._synchronized_method;

public class Demo {
    public static void main(String[] args) {
        // Compilation error: private constructor
        // Employee employee = new Employee();

        // Code works in multithreaded environment
        for(int i = 0; i < 10; i++){
            new Thread(() -> {
                Employee employee = Employee.getEmployee();
                employee.printEmployee();
            }).start();
        }
    }
}
