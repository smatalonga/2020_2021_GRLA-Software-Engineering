package com.uws.softeng.week6.lsp.excercise5;

public class AreaCalculator {
	public void playarroundWithAreas() {
		 Rectangle rectangle = new Rectangle();
	     rectangle.setWidth(5);
	     rectangle.setHeight(4);
	     
	     int area = rectangle.getArea();
	     
	     if (area == 20)
	    	 System.out.println("So far so good...");
	     
	     Rectangle anotherRectangle = new Square();
	     anotherRectangle.setWidth(5);
	     anotherRectangle.setHeight(4);
	     
	     area = anotherRectangle.getArea();
	     
	     if (area != 20)
	    	 System.out.println("MMmmmm what was I trying to do here");
	     
		
	}
}
