package com.hubberspot.designpattern.creational.factory._enums;

import com.hubberspot.designpattern.creational.factory._enums.PlayerFactory.PlayerType;

public class Demo {
    public static void main(String[] args) {
        Player tennisPlayer = PlayerFactory.createPlayer(PlayerType.TENNIS);
        tennisPlayer.play();

        Player footballPlayer = PlayerFactory.createPlayer(PlayerType.FOOTBALL);
        footballPlayer.play();

        Player cricketPlayer = PlayerFactory.createPlayer(PlayerType.CRICKET);
        cricketPlayer.play();
    }
}
