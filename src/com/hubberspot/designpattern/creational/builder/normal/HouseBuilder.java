package com.hubberspot.designpattern.creational.builder.normal;

public class HouseBuilder implements Builder {
    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation(String foundation) {
        house.setFoundation(foundation);
        System.out.println("HouseBuilder -> Foundation complete !!!");
    }

    @Override
    public void buildStructure(String structure) {
        house.setStructure(structure);
        System.out.println("HouseBuilder -> Structure complete !!!");
    }

    @Override
    public void buildRoof(String roof) {
        house.setRoof(roof);
        System.out.println("HouseBuilder -> Roof complete !!!");
    }

    @Override
    public void buildInterior(String interior) {
        house.setInterior(interior);
        System.out.println("HouseBuilder -> Interior complete !!!");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
