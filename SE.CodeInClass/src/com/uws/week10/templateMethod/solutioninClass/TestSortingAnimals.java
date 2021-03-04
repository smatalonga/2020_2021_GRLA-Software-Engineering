package com.uws.week10.templateMethod.solutioninClass;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestSortingAnimals {

	@Test
	void testSortbyVetebrate() {
		ArrayList<Animal> list  = new ArrayList<Animal>();
		list.add(new Starfish());
		list.add(new Starfish());
		list.add(new Starfish());
		list.add(new Dog());
		list.add(new Dog());
		list.add(new Dog());
		
		
		assertTrue(!list.get(0).isVertebrate(),"A Starfish is not a vertebrate");
		
		SortingAnimals sa = new SortingAnimals();
		ArrayList<Animal> listOutput = sa.sortAnimals(new SortingAnimalsByVertebrate(), list);
		
		assertTrue(listOutput.get(0).isVertebrate(), "First on the List is a Vertebrate");
		
	}

}
