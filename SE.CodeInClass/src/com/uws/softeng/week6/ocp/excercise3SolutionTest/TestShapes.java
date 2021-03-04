package com.uws.softeng.week6.ocp.excercise3SolutionTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.uws.softeng.week6.ocp.excercise3Solution.Square;

class TestShapes {

	@Test
	void testSquareAreaCalculator() {
		Square testItem = new Square(4);
		
		double expected = 16;
		
		double actual = testItem.calculateArea();
		
		assertEquals(expected, actual);
		
	}

}
