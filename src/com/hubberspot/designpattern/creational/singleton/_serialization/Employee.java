package com.hubberspot.designpattern.creational.singleton._serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    
    private static final Employee EMPLOYEE = new Employee();

    private Employee() {
        // private constructor
    }

    public static Employee getEmployee() {
        return EMPLOYEE;
    }

    protected Object readResolve() {
        return EMPLOYEE;
    }

    public void printEmployee() {
        System.out.println("Welcome to ABC Company !!! - " +
                this.getClass().getSimpleName() + " - " + 
                this.hashCode());
    }
}
