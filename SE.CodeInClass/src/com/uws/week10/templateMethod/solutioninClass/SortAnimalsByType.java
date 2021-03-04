package com.uws.week10.templateMethod.solutioninClass;

public class SortAnimalsByType extends SortingCriteria {

	@Override
    public int compare(Object t, Object t1) {
        Animal firstAnimal = (Animal) t;
        Animal secondAnimal = (Animal) t1;

       return firstAnimal.getSpecies().compareTo(secondAnimal.getSpecies());
    }

}
