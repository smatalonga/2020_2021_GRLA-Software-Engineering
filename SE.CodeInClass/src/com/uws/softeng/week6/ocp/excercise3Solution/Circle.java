package com.uws.softeng.week6.ocp.excercise3Solution;

public class Circle extends Shape
{
    
	private final double _radius;

    public Circle(double _radius)
    {
        this._radius = _radius;
        
    }

    public double getRadius()
    {
        return _radius;
    }

	@Override
	public double calculateArea() {
		return Math.PI * this.getRadius() * this.getRadius();
	}
}
