package com.hubberspot.designpattern.creational.factorymethod._without_lambdas;

public class Demo {

    public static void main(String[] args) {
        DisplayMessageService displayMessageService = new DisplayMessageService();

        displayMessageService.setMessageCreator(new JsonMessageCreator());
        displayMessageService.printMessage();

        displayMessageService.setMessageCreator(new TextMessageCreator());
        displayMessageService.printMessage();

        displayMessageService.setMessageCreator(new XmlMessageCreator());
        displayMessageService.printMessage();
    }
}
