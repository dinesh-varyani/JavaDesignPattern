package com.hubberspot.designpattern.creational.staticfactory._enums;

public class PlayerFactory {
    public static Player createPlayer(PlayerType playerType) {
        return playerType.getPlayerSupplier().get();
    }
}
