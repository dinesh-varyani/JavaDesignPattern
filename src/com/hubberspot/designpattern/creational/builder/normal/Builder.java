package com.hubberspot.designpattern.creational.builder.normal;

public interface Builder {
    public Builder buildFoundation(String foundation);
    public Builder buildStructure(String structure);
    public Builder buildRoof(String roof);
    public Builder buildInterior(String interior);
    public House getHouse();
}
