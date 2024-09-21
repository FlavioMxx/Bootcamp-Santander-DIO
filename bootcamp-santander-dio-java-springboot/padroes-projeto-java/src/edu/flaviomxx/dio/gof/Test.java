package edu.flaviomxx.dio.gof;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonLazy singletonLazy = SingletonLazy.getIntance();
		System.out.println(singletonLazy);
		
		singletonLazy = SingletonLazy.getIntance();
		System.out.println(singletonLazy);
		
		

		SingletonEager singletonEager = SingletonEager.getIntance();
		System.out.println(singletonEager);
		
		singletonEager = SingletonEager.getIntance();
		System.out.println(singletonEager);
		

		SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getIntance();
		System.out.println(singletonLazyHolder);
		
		singletonLazyHolder = SingletonLazyHolder.getIntance();
		System.out.println(singletonLazyHolder);
	}

}
