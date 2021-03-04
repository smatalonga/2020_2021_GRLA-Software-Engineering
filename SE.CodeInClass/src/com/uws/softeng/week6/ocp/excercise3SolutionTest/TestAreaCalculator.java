package com.uws.softeng.week6.ocp.excercise3SolutionTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.uws.softeng.week6.ocp.excercise3Solution.*;

class TestAreaCalculator {

	@Test
	void test() {
		Square sq = new Square(2);
		Circle cq = new Circle(3);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(sq);
		shapes.add(cq);
		
		double expected = 9*Math.PI+4;
		
		double actual = AreaCalculator.calculateAreaOfAllShapes(shapes);
		
		assertEquals(expected, actual);
		
	}

}
