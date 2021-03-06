package com.uws.week11.structural.implementors;

public class AnotherCocreteImplementor extends Implementor {
	/*
	 * (non-Javadoc)
	 * @see implementors.Implementor#operationImp()
	 * This is the actual implementation of the operate() method of class
	 * Abstraction.
	 */
	@Override
	public void operationImp() {
		System.out.println("AnotherCocreteImplementor.operationImp()");
		System.out.println("This is an example of a Bridge pattern.");
	}
}
