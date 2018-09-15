package com.hubberspot.designpattern.creational.staticfactory._enum;

public class PlayerFactory {
    public static Player createPlayer(PlayerType playerType) {
        if(playerType == null){
            return null;
        }

        if(playerType == PlayerType.TENNIS){
            return new TennisPlayer();
        } else if(playerType == PlayerType.FOOTBALL){
            return new FootballPlayer();
        } else if(playerType == PlayerType.CRICKET){
            return new CricketPlayer();
        }
        return null;
    }
}
