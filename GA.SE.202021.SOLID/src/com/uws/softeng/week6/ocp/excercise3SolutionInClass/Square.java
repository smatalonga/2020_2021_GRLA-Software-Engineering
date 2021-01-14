package com.uws.softeng.week6.ocp.excercise3SolutionInClass;

public class Square extends Shape
{
    private final double _side;

    public Square(double side)
    {
        
        _side = side;
    }

    public double getSide()
    {
        return _side;
    }
    
    public double claculateArea()
    {
        return this.getSide() * this.getSide();
    }
}
