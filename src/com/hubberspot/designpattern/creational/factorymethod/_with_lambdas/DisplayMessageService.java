package com.hubberspot.designpattern.creational.factorymethod._with_lambdas;

public class DisplayMessageService {

    private MessageCreator messageCreator;

    public void setMessageCreator(MessageCreator messageCreator) {
        this.messageCreator = messageCreator;
    }

    public void printMessage() {
        Message msg = messageCreator.getMessage();
        System.out.println(msg);
    }
}
