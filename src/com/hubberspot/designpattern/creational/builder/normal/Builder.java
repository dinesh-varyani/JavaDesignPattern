package com.hubberspot.designpattern.creational.builder.normal;

public interface Builder {
    public void buildFoundation(String foundation);
    public void buildStructure(String structure);
    public void buildRoof(String roof);
    public void buildInterior(String interior);
    public House getHouse();
}
