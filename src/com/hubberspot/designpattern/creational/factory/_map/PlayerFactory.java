package com.hubberspot.designpattern.creational.factory._map;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private final static Map<String, Player> mapOfPlayers = new HashMap<>();

    static {
        mapOfPlayers.put("TENNIS", new TennisPlayer());
        mapOfPlayers.put("FOOTBALL", new FootballPlayer());
        mapOfPlayers.put("CRICKET", new CricketPlayer());
    }

    public static Player createPlayer(String playerType) {
        return mapOfPlayers.get(playerType);
    }
}
