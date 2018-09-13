package com.hubberspot.designpattern.creational.factory._static;

public class Demo {
    public static void main(String[] args) {
        Player tennisPlayer = PlayerFactory.createPlayer("TENNIS");
        tennisPlayer.play();

        Player footballPlayer = PlayerFactory.createPlayer("FOOTBALL");
        footballPlayer.play();

        Player cricketPlayer = PlayerFactory.createPlayer("CRICKET");
        cricketPlayer.play();
    }
}
