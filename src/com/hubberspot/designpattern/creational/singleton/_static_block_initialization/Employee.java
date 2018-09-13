package com.hubberspot.designpattern.creational.singleton._static_block_initialization;

public class Employee {

    static {
        employee = new Employee();
    }

    private static Employee employee;

    private Employee() {
        // private constructor
    }

    public static Employee getEmployee() {
        return employee;
    }

    public void printEmployee() {
        System.out.println("Welcome to ABC Company !!! - " +
                this.getClass().getSimpleName() + " - " + this.hashCode());
    }
}
