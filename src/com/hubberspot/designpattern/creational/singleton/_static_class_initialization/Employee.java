package com.hubberspot.designpattern.creational.singleton._static_class_initialization;

public class Employee {

    private Employee() {
        // private constructor
    }

    private static class EmployeeCreator {

        private static final Employee EMPLOYEE = new Employee();

        public static Employee getEmployee() {
            return EMPLOYEE;
        }
    }

    public static Employee getEmployee() {
        return EmployeeCreator.getEmployee();
    }

    public void printEmployee() {
        System.out.println("Welcome to ABC Company !!! - " +
                this.getClass().getSimpleName() + " - " + this.hashCode());
    }
}
