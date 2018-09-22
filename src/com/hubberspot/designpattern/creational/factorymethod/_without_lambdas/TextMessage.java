package com.hubberspot.designpattern.creational.factorymethod._without_lambdas;

public class TextMessage implements Message {
	
	@Override
	public String getBody() {
		return "A simple text message";
	}

	@Override
	public String getDefaultHeaders() {
		return "Content-Type: text/plain";
	}

    @Override
    public String getEncryption() {
        return "RSA encryption";
    }

    @Override
    public String toString() {
        return "TextMessage { \n\t" +
                "body - " + getBody() + " \n\t" +
                "with headers - " + getDefaultHeaders() + " \n\t" +
                "having " + getEncryption() + "\n" +
               "}";
    }
}
