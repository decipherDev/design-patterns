/**
To avoid the issue of Reflection on singleton object, enum can be used.
Java ensures internally that the enum value is instantiated only once. Since java Enums are globally accessible, they can be used for singletons.
**/
package dev.designpattern.singleton;

public enum SingletonEnum {
	INSTANCE;
	
	public static SingletonEnum instance() {
		return INSTANCE;
	}
}
