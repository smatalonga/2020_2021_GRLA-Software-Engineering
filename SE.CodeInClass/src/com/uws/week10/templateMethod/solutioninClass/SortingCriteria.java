package com.uws.week10.templateMethod.solutioninClass;

import java.util.Comparator;

public abstract class SortingCriteria implements Comparator {

	@Override
	public abstract int compare(Object arg0, Object arg1);
	
}
