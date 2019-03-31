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
