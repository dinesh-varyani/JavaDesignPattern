package com.hubberspot.designpattern.creational.factorymethod._without_lambdas;

// Demonstrate using Simple Factory Pattern
public class MessageFactory {

    public static Message createMessage(String type) {
        if(type.equals("text")) {
            return new TextMessage();
        } else if(type.equals("json")) {
            return new JsonMessage();
        } else if(type.equals("xml")) {
            return new XmlMessage();
        }
        return null; // or an exception
    }
}
