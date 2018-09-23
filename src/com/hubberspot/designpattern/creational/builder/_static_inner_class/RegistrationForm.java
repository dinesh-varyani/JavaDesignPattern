package com.hubberspot.designpattern.creational.builder._static_inner_class;

import java.util.Date;

public class RegistrationForm {
    private String firstName; // mandatory
    private String lastName; // mandatory
    private String userName; // mandatory
    private String password; // mandatory
    private String email; // mandatory
    private Date dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String country;
    private String locale;

    public static class RegistrationFormBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String password;
        private String email;
        private Date dateOfBirth;
        private String address;
        private String city;
        private String state;
        private String country;
        private String locale;

        public RegistrationFormBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public RegistrationFormBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public RegistrationFormBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public RegistrationFormBuilder password(String password) {
            this.password = password;
            return this;
        }

        public RegistrationFormBuilder email(String email) {
            this.email = email;
            return this;
        }

        public RegistrationFormBuilder dateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public RegistrationFormBuilder address(String address) {
            this.address = address;
            return this;
        }

        public RegistrationFormBuilder city(String city) {
            this.city = city;
            return this;
        }

        public RegistrationFormBuilder state(String state) {
            this.state = state;
            return this;
        }

        public RegistrationFormBuilder country(String country) {
            this.country = country;
            return this;
        }

        public RegistrationFormBuilder locale(String locale) {
            this.locale = locale;
            return this;
        }

        public RegistrationForm build() {
            return new RegistrationForm(this);
        }
    }

    private RegistrationForm(RegistrationFormBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.userName = builder.userName;
        this.password = builder.password;
        this.email = builder.email;
        this.dateOfBirth = builder.dateOfBirth;
        this.address = builder.address;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
        this.locale = builder.locale;
    }

    @Override
    public String toString() {
        return "RegistrationForm {" +
                "\n\tfirstName='" + firstName + '\'' +
                ", \n\tlastName='" + lastName + '\'' +
                ", \n\tuserName='" + userName + '\'' +
                ", \n\tpassword='" + password + '\'' +
                ", \n\temail='" + email + '\'' +
                ", \n\tdateOfBirth=" + dateOfBirth +
                ", \n\taddress='" + address + '\'' +
                ", \n\tcity='" + city + '\'' +
                ", \n\tstate='" + state + '\'' +
                ", \n\tcountry='" + country + '\'' +
                ", \n\tlocale='" + locale + '\'' +
                "\n" + '}';
    }
}
