package com.uws.week10.templateMethod.initial;

public class Starfish implements Animal {

	@Override
	public boolean isVertebrate() {
		return false;
	}

	@Override
	public String getSpecies() {
		return "Starfish";
	}
	

}
