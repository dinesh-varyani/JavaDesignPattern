package com.hubberspot.designpattern.creational.singleton._lazy_initialization;

public class Employee {
    private static Employee employee;

    private Employee() {
        // private constructor
    }

    public static Employee getEmployee() {
        if(employee == null){
            employee = new Employee();
        }
        return employee;
    }

    public void printEmployee() {
        System.out.println("Welcome to ABC Company !!! - " +
                this.getClass().getSimpleName() + " - " + 
                this.hashCode());
    }
}
