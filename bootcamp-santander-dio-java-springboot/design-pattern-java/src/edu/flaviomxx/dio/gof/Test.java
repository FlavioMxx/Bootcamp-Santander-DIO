package edu.flaviomxx.dio.gof;

import edu.flaviomxx.dio.gof.facade.Facade;
import edu.flaviomxx.dio.gof.singleton.SingletonEager;
import edu.flaviomxx.dio.gof.singleton.SingletonLazy;
import edu.flaviomxx.dio.gof.singleton.SingletonLazyHolder;
import edu.flaviomxx.dio.gof.strategy.*;

public class Test {

	public static void main(String[] args) {
		//Singleton
		
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

		//Strategy
		System.out.println();

		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setStrategy(agressivo);

		robo.mover();

		//Facade
		System.out.println();

		Facade facade = new Facade();

		facade.migrarCliente("Flavio", "01234567");
	}

}
