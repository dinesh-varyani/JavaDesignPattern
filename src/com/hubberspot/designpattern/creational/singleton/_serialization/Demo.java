package com.hubberspot.designpattern.creational.singleton._serialization;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try {
            Employee employeeOne = Employee.getEmployee();

            // serialize an object to file
            ObjectOutput out
                    = new ObjectOutputStream(
                      new FileOutputStream("employee.txt"));
            out.writeObject(employeeOne);
            out.close();

            // deserialize from file to object
            ObjectInput in
                    = new ObjectInputStream(
                      new FileInputStream("employee.txt"));

            Employee employeeTwo = (Employee) in.readObject();
            in.close();

            employeeOne.printEmployee();
            employeeTwo.printEmployee();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
