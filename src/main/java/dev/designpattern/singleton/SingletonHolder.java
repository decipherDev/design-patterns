/** 
Bill Pugh Implementation of singleton
The private inner static class that contains the instance of the singleton class. 
When the SingletonHolder class is loaded, SingletonInstanceHolder class is not loaded into memory and only when someone calls the instance() method, 
this class gets loaded and creates the SingletonHolder class instance. 
This is the most widely used approach for the singleton class as it doesn’t require synchronization
**/
package dev.designpattern.singleton;

public class SingletonHolder {
	
	private SingletonHolder() {
		
	}
	
	private static class SingletonInstanceHolder {
		static final SingletonHolder INSTANCE = new SingletonHolder();
	}
	
	public static SingletonHolder instance() {
		return SingletonInstanceHolder.INSTANCE;
	}
}
