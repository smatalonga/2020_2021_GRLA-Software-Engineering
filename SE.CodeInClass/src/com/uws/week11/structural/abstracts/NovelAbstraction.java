package com.uws.week11.structural.abstracts;

import com.uws.week11.structural.implementors.AnotherCocreteImplementor;
import com.uws.week11.structural.implementors.Implementor;

public class NovelAbstraction extends Abstraction {

	@Override
	public Implementor loadImplementor() {
		
		return this.loadImplementor(new AnotherCocreteImplementor());
	}

	@Override
	public Implementor loadImplementor(Implementor implementorToUse) {
		this.imp = implementorToUse;
		return imp;
		
	}

}
