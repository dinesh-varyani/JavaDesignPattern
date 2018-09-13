package com.hubberspot.designpattern.creational.factory._functional_interface;

public class CricketPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Cricket player playing ...");
    }
}