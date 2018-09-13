package com.hubberspot.designpattern.creational.singleton._eager_initialization;

public class Employee {
    private static final Employee EMPLOYEE = new Employee();

    private Employee() {
        // private constructor
    }

    public static Employee getEmployee() {
        return EMPLOYEE;
    }

    public void printEmployee() {
        System.out.println("Welcome to ABC Company !!! - " +
                this.getClass().getSimpleName() + " - " + this.hashCode());
    }
}
