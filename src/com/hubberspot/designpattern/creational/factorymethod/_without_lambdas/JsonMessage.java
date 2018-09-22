package com.hubberspot.designpattern.creational.factorymethod._without_lambdas;

public class JsonMessage implements Message {

	@Override
	public String getBody() {
		return "{\"name\":\"John\", \"age\":31}";
	}

	@Override
	public String getDefaultHeaders() {
		return "Content-Type: application/json";
	}

	@Override
	public String getEncryption() {
		return "AES encryption";
	}

	@Override
	public String toString() {
		return "JsonMessage { \n\t" +
				"body - " + getBody() + " \n\t" +
				"with headers - " + getDefaultHeaders() + " \n\t" +
				"having " + getEncryption() + "\n" +
				"}";
	}
}
