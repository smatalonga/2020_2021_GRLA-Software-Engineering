package com.uws.week11.structural.clients;

import com.uws.week11.structural.implementors.*;

public class ImplementorFactory {
	
	
	public static final String CONCRETE = "Concrete";
	public static final String AnotherConcrete = "AnotherConcrete";

	public static Implementor CreateImplementor(String type) throws Exception{
		if (type.equals(ImplementorFactory.CONCRETE)) {
			return new ConcreteImplementor();
		}
		else if (type.equals(ImplementorFactory.AnotherConcrete)) {
			return new AnotherCocreteImplementor();
		}
		else {
			throw new Exception("Implemetor not Known");
		}
	}
}
