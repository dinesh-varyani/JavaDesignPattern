package com.hubberspot.designpattern.creational.builder.normal;

public class CivilEngineer {

    private final Builder builder;

    public CivilEngineer(Builder builder) {
        this.builder = builder;
    }

    public House constructHouse(String type){
        if(type.equalsIgnoreCase("igloo")) {
            return builder.buildFoundation("Ice bars")
                   .buildStructure("Ice blocks")
                   .buildRoof("Ice dome")
                   .buildInterior("Ice carvings")
                   .getHouse();
        } else if(type.equalsIgnoreCase("concrete")) {
            return builder.buildFoundation("Concrete bars")
                   .buildStructure("Concrete blocks")
                   .buildRoof("Concrete roof")
                   .buildInterior("Concrete carvings")
                   .getHouse();
        }
        return null;
    }
}
