package com.uws.softeng.week6.ocp.excercise3Solution;

import java.util.List;

public class AreaCalculator
{
    public static double calculateAreaOfAllShapes(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            area = area + shape.calculateArea();
        	//area += shape.calculateArea();
        }
        //System.out.println("total area = " + area);
        return area;
    }

    
}
