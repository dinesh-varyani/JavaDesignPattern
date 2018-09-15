package com.hubberspot.designpattern.creational.staticfactory._custom_functional_interface;

public enum PlayerType {

    TENNIS(TennisPlayer::new),
    FOOTBALL(FootballPlayer::new),
    CRICKET(CricketPlayer::new);

    PlayerType(PlayerFactory playerFactory) {
        this.playerFactory = playerFactory;
    }

    private final PlayerFactory playerFactory;

    public PlayerFactory getPlayerFactory() {
        return playerFactory;
    }
}