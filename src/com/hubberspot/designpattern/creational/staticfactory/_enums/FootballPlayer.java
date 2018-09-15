package com.hubberspot.designpattern.creational.staticfactory._enums;

public class FootballPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Football player playing ...");
    }
}