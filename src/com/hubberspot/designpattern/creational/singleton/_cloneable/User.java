package com.hubberspot.designpattern.creational.singleton._cloneable;

public class User implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
