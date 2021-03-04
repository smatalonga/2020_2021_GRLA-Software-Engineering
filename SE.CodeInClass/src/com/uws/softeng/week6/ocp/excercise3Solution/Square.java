package com.uws.softeng.week6.ocp.excercise3Solution;

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

	@Override
	public double calculateArea() {
		return this.getSide() * this.getSide();
	}
}
