package com.hubberspot.designpattern.creational.builder.normal;

public class HouseBuilder implements Builder {
    private House house;

    public HouseBuilder() {
        this.house = new House();
    }
    @Override
    public Builder buildFoundation(String foundation) {
        house.setFoundation(foundation);
        System.out.println("HouseBuilder -> Foundation complete !!!");
        return this;
    }
    @Override
    public Builder buildStructure(String structure) {
        house.setStructure(structure);
        System.out.println("HouseBuilder -> Structure complete !!!");
        return this;
    }
    @Override
    public Builder buildRoof(String roof) {
        house.setRoof(roof);
        System.out.println("HouseBuilder -> Roof complete !!!");
        return this;
    }
    @Override
    public Builder buildInterior(String interior) {
        house.setInterior(interior);
        System.out.println("HouseBuilder -> Interior complete !!!");
        return this;
    }
    @Override
    public House getHouse() {
        return house;
    }
}
