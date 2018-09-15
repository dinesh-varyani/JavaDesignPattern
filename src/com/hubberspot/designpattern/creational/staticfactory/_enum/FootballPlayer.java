package com.hubberspot.designpattern.creational.staticfactory._enum;

public class FootballPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Football player playing ...");
    }
}