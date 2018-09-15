package com.hubberspot.designpattern.creational.staticfactory._custom_functional_interface;

public class FootballPlayer implements Player {

    private final String name;
    private final int age;

    public FootballPlayer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void play() {
        System.out.println("Football player playing ...");
    }
}