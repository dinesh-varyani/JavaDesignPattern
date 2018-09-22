package com.hubberspot.designpattern.creational.factorymethod._without_lambdas;

public class XmlMessage implements Message {

	@Override
	public String getBody() {
		return "<name>John</name><age>31</age>";
	}

	@Override
	public String getDefaultHeaders() {
		return "Content-Type: application/xml";
	}

	@Override
	public String getEncryption() {
		return "SHA encryption";
	}

	@Override
	public String toString() {
		return "XmlMessage { \n\t" +
				"body - " + getBody() + " \n\t" +
				"with headers - " + getDefaultHeaders() + " \n\t" +
				"having " + getEncryption() + "\n" +
				"}";
	}
}
