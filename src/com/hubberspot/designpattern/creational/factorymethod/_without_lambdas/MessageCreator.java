package com.hubberspot.designpattern.creational.factorymethod._without_lambdas;

public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = createMessage();

		msg.getDefaultHeaders();
		msg.getEncryption();

		return msg;
	}

	// Factory method
	protected abstract Message createMessage();
}
