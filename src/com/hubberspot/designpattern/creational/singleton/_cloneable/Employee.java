package com.hubberspot.designpattern.creational.singleton._cloneable;

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
                this.getClass().getSimpleName() + " - " + 
                this.hashCode());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employeeOne = Employee.getEmployee();
        Employee employeeTwo = (Employee) employeeOne.clone();
        employeeOne.printEmployee();
        employeeTwo.printEmployee();
    }
}
