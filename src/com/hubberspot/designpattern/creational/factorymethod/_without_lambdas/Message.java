package com.hubberspot.designpattern.creational.factorymethod._without_lambdas;

public interface Message {
	public String getBody();
	public String getDefaultHeaders();
	public String getEncryption();
}
