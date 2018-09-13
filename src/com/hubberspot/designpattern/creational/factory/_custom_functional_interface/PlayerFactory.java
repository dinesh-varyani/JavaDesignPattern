package com.hubberspot.designpattern.creational.factory._custom_functional_interface;

@FunctionalInterface
public interface PlayerFactory {

    public static enum PlayerType {
        TENNIS(TennisPlayer::new),
        FOOTBALL(FootballPlayer::new),
        CRICKET((name, age) -> new CricketPlayer(name, age));

        PlayerType(PlayerFactory playerFactory) {
            this.playerFactory = playerFactory;
        }

        private final PlayerFactory playerFactory;

        public PlayerFactory getPlayerfactory() {
            return playerFactory;
        }
    }

    public Player createPlayer(String name, int age);

    public static PlayerFactory createPlayerFactory(PlayerType playerType) {
        return playerType.getPlayerfactory();
    }
}
