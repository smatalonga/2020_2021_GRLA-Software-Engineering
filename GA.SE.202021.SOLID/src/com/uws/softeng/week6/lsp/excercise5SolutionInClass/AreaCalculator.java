package com.uws.softeng.week6.lsp.excercise5SolutionInClass;

public class AreaCalculator {
	public void playarroundWithAreas() {
		 Rectangle rectangle = new Rectangle();
	     rectangle.setWidth(5);
	     rectangle.setHeight(4);
	     
	     int area = rectangle.getArea();
	     
	     if (area == 20)
	    	 System.out.println("So far so good...");
	     
	     Square square = new Square();
	     square.setSide(4);
	     
	     area = square.getArea();
	     
	     /*if (area != 20)
	    	 System.out.println("MMmmmm what was I trying to do here");*/
	     
		
	}
}
