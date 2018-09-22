package com.hubberspot.designpattern.creational.builder.normal;

public class CivilEngineer {

    private final Builder builder;

    public CivilEngineer(Builder builder) {
        this.builder = builder;
    }

    public House constructHouse(String type){
        if(type.equalsIgnoreCase("igloo")) {
            builder.buildFoundation("Ice bars");
            builder.buildStructure("Ice blocks");
            builder.buildRoof("Ice dome");
            builder.buildInterior("Ice carvings");
            return builder.getHouse();
        } else if(type.equalsIgnoreCase("concrete")) {
                builder.buildFoundation("Concrete bars");
                builder.buildStructure("Concrete blocks");
                builder.buildRoof("Concrete roof");
                builder.buildInterior("Concrete carvings");
                return builder.getHouse();
        }
        return null;
    }
}
