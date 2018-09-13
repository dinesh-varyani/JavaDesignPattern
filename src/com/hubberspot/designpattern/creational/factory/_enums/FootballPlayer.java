package com.hubberspot.designpattern.creational.factory._enums;

public class FootballPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Football player playing ...");
    }
}