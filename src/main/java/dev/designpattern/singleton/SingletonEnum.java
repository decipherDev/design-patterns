/**
To avoid the issue of Reflection on singleton object, Enum can be used.
Java ensures internally that the Enum value is instantiated only once. Since java Enums are globally accessible, they can be used for singletons.
The only drawback is that they do not support lazy initialization.
**/
package dev.designpattern.singleton;

public enum SingletonEnum {
	INSTANCE;
	
	public static SingletonEnum instance() {
		return INSTANCE;
	}
}
