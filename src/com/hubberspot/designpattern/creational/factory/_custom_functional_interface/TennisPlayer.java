package com.hubberspot.designpattern.creational.factory._custom_functional_interface;

public class TennisPlayer implements Player {

    private final String name;
    private final int age;

    public TennisPlayer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void play() {
        System.out.println("Tennis player playing ...");
    }
}