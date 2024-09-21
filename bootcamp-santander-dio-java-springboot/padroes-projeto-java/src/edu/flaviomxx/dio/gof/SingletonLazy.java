package edu.flaviomxx.dio.gof;

import java.util.Objects;

//Singleton "preguiçoso'
public class SingletonLazy {
	
	private static SingletonLazy instance;

	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getIntance() {
		if(Objects.isNull(instance))
			instance = new SingletonLazy();
		
		
		return instance;
	}
}
