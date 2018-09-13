package com.hubberspot.designpattern.creational.factory._functional_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PlayerFactory {

    private final static Map<String, Supplier<Player>> mapOfPlayers = new HashMap<>();

    static {
        mapOfPlayers.put("TENNIS", TennisPlayer::new);
        mapOfPlayers.put("FOOTBALL", FootballPlayer::new);
        mapOfPlayers.put("CRICKET", CricketPlayer::new);
    }

    public static Player createPlayer(String playerType) {
        return mapOfPlayers.get(playerType).get();
    }
}
