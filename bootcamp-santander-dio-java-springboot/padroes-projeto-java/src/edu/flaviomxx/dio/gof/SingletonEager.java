package edu.flaviomxx.dio.gof;

//Singleton "apressado'
public class SingletonEager {
	
	private static SingletonEager instance = new SingletonEager();

	
	private SingletonEager() {
		super();
	}


	public static SingletonEager getIntance() {
		
		return instance;
	}
}
