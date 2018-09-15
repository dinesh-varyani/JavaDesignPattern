package com.hubberspot.designpattern.creational.staticfactory._custom_functional_interface;

public class CricketPlayer implements Player {

    private final String name;
    private final int age;

    public CricketPlayer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void play() {
        System.out.println("Cricket player playing ...");
    }
}