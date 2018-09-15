package com.hubberspot.designpattern.creational.staticfactory._custom_functional_interface;

@FunctionalInterface
public interface PlayerFactory {
    public Player createPlayer(String name, int age);

    public static PlayerFactory createPlayerFactory(PlayerType playerType) {
        return playerType.getPlayerFactory();
    }
}
