package com.hubberspot.designpattern.creational.factory._custom_functional_interface;

@FunctionalInterface
public interface PlayerFactory {

    public static enum PlayerType {
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

    public Player createPlayer(String name, int age);

    public static PlayerFactory createPlayerFactory(PlayerType playerType) {
        return playerType.getPlayerFactory();
    }
}
