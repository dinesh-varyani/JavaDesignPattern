package com.hubberspot.designpattern.creational.staticfactory._custom_functional_interface;

import static com.hubberspot.designpattern.creational.staticfactory._custom_functional_interface.PlayerFactory.PlayerType;

public class Demo {
    public static void main(String[] args) {
        Player tennisPlayer = PlayerFactory.createPlayerFactory(PlayerType.TENNIS)
                .createPlayer("Dinesh", 30);
        tennisPlayer.play();

        Player footballPlayer = PlayerFactory.createPlayerFactory(PlayerType.FOOTBALL)
                .createPlayer("Jonty", 31);
        footballPlayer.play();

        Player cricketPlayer = PlayerFactory.createPlayerFactory(PlayerType.CRICKET)
                .createPlayer("Jimmy", 29);
        cricketPlayer.play();
    }
}
