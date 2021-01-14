package com.uws.softeng.week6.ocp.excercise3SolutionInClass;

public class Circle extends Shape
{
    private final double _radius;

    public Circle(double radius)
    {
        
        _radius = radius;
    }

    public double getRadius()
    {
        return _radius;
    }
    
    public double claculateArea()
    {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
