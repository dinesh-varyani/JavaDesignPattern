package com.hubberspot.designpattern.creational.builder._static_inner_class;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        // private constructor
        // RegistrationForm creation with builder
        // using fluent interface
        // RegistrationForm form = new RegistrationForm();

        RegistrationForm form =
                new RegistrationForm
                        .RegistrationFormBuilder()
                        .firstName("John")
                        .lastName("Doe")
                        .userName("john_doe")
                        .password("qwerty@123")
                        .email("john@doe.com")
                        .dateOfBirth(new Date())
                        .city("New York City")
                        .state("New York")
                        .country("US")
                        .locale("en_US")
                        .build();

        System.out.println(form);
    }
}
