package com.hubberspot.designpattern.creational.builder.normal;

public class Demo {
    public static void main(String[] args) {
        Builder builder = new HouseBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(builder);

        civilEngineer.constructHouse("igloo");
        House iglooHouse = builder.getHouse();
        System.out.println(iglooHouse);

        civilEngineer.constructHouse("concrete");
        House concreteHouse = builder.getHouse();
        System.out.println(concreteHouse);
    }
}
