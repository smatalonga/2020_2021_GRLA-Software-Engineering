package com.uws.softeng.week6.ocp.excercise3SolutionInClass;

import java.util.List;

public class AreaCalculator
{
    public void calculateArea(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            area = shape.claculateArea();
        }
        System.out.println("total area = " + area);
    }

    

    
}
