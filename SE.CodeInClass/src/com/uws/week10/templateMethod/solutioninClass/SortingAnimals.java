package com.uws.week10.templateMethod.solutioninClass;


import java.util.ArrayList;
import java.util.Comparator;

/**
 * Holds concrete strategies for working with animal lists.
 * @keaplogik
 */
public class SortingAnimals {
    
       
    
    
    
    public ArrayList<Animal> sortAnimals(SortingCriteria criteria, ArrayList<Animal> originalList){
    	
    	 originalList.sort(criteria);
    	 return originalList;
    	
    }
    

}