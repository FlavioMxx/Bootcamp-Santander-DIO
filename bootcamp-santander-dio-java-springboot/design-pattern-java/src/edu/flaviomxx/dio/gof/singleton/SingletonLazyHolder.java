package edu.flaviomxx.dio.gof.singleton;

//Singleton "Lazy Holder'
public class SingletonLazyHolder {
	
	private static class Holder {
		
	public static SingletonLazyHolder instance = new SingletonLazyHolder();
}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getIntance() {
		return Holder.instance;
	}
}
