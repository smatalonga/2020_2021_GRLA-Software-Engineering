package com.uws.week10.templateMethod.initial;

public class Dog implements Animal {

	@Override
	public boolean isVertebrate() {
		return true;
	}

	@Override
	public String getSpecies() {
		return "Dog";
	}

}
