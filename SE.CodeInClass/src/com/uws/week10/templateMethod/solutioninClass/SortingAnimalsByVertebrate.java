package com.uws.week10.templateMethod.solutioninClass;

public class SortingAnimalsByVertebrate extends SortingCriteria{

	@Override
	//Put the vertebrate first
	public int compare(Object arg0, Object arg1) {
		
            Animal firstAnimal = (Animal) arg0;
            Animal secondAnimal = (Animal) arg1;

            if (firstAnimal.isVertebrate()
                    == secondAnimal.isVertebrate()) {
                return 0;
            } else if (firstAnimal.isVertebrate()
                    || secondAnimal.isVertebrate()) {
                return -1;
            } else {
                return 1;
            }
        }

}
