package com.hubberspot.designpattern.creational.staticfactory._enums;

import java.util.function.Supplier;

public class PlayerFactory {

    public enum PlayerType {
        TENNIS(TennisPlayer::new),
        FOOTBALL(FootballPlayer::new),
        CRICKET(CricketPlayer::new);

        PlayerType(Supplier<Player> playerSupplier) {
            this.playerSupplier = playerSupplier;
        }

        private final Supplier<Player> playerSupplier;

        public Supplier<Player> getPlayerSupplier() {
            return playerSupplier;
        }
    }

    public static Player createPlayer(PlayerType playerType) {
        return playerType.getPlayerSupplier().get();
    }
}
