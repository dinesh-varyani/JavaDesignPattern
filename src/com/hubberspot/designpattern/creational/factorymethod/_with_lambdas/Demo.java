package com.hubberspot.designpattern.creational.factorymethod._with_lambdas;

public class Demo {

    public static void main(String[] args) {
        DisplayMessageService displayMessageService = new DisplayMessageService();

        displayMessageService.setMessageCreator(JsonMessage::new);
        displayMessageService.printMessage();

        displayMessageService.setMessageCreator(TextMessage::new);
        displayMessageService.printMessage();

        displayMessageService.setMessageCreator(XmlMessage::new);
        displayMessageService.printMessage();
    }
}
