package dev.designpattern.singleton;

public class NonThreadSafeSingleton {
	private static NonThreadSafeSingleton object = null;
	
	private NonThreadSafeSingleton() {
		if (object != null) {
			//To avoid creation of object using reflection
			throw new IllegalStateException("Instance already exists!");
		}
	}
	
	public static NonThreadSafeSingleton instance() {
		if (object == null) {
			object = new NonThreadSafeSingleton();
		}
		return object;
	}
	
	protected Object readResolve() {
		return instance();
	}
}