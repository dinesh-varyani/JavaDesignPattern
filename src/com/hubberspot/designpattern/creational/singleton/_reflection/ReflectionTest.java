package com.hubberspot.designpattern.creational.singleton._reflection;

import java.lang.reflect.Constructor;

public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        Employee employeeOne = Employee.getEmployee();
        Employee employeeTwo = null;

        Class<Employee> e = Employee.class;

        Constructor<Employee> constructor = Employee.class
                        .getDeclaredConstructor();
        // Below code will make private constructor accessible
        // to outside world
        constructor.setAccessible(true);
        employeeTwo = (Employee)constructor.newInstance();

        // different objects will get printed on console
        employeeOne.printEmployee();
        employeeTwo.printEmployee();
    }
}
