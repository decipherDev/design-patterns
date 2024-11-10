package dev.designpattern.singleton;

public class ThreadSafeSingletonObject {
	private static volatile ThreadSafeSingletonObject object = null;

	private ThreadSafeSingletonObject() {
		//private constructor in order to restrict it's visibility
		//from other classes
		if (object != null) {
			//To avoid creation of object using reflection
			throw new IllegalStateException("Instance already exists!");
		}
		
	}
	
	public static ThreadSafeSingletonObject instance() {
		if (object == null) {
			synchronized (ThreadSafeSingletonObject.class) {
				if (object == null) {
					object = new ThreadSafeSingletonObject();
				}
			}
		}
		
		return object;
	}
	
	protected Object readResolve() {
		return instance();
	}
}