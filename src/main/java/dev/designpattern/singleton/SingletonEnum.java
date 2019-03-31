package dev.designpattern.singleton;

public enum SingletonEnum {
	INSTANCE;
	
	public static SingletonEnum instance() {
		return INSTANCE;
	}
}
