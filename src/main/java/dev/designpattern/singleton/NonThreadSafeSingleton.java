package dev.designpattern.singleton;

public class NonThreadSafeSingleton {
	private static NonThreadSafeSingleton object = null;
	
	private NonThreadSafeSingleton() {
		
	}
	
	public static NonThreadSafeSingleton instance() {
		if (object == null) {
			object = new NonThreadSafeSingleton();
		}
		return object;
	}
}