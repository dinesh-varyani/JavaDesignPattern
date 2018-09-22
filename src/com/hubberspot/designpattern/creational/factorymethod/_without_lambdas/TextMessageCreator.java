package com.hubberspot.designpattern.creational.factorymethod._without_lambdas;

public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
