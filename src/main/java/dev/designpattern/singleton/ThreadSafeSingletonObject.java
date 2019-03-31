package dev.designpattern.singleton;

public class ThreadSafeSingletonObject {
	private static volatile ThreadSafeSingletonObject object = null;

	private ThreadSafeSingletonObject() {
		//private constructor in order to restrict it's visibility
		//from other classes
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
}
