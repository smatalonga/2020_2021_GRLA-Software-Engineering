package concatenate;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileFilter;

import org.junit.jupiter.api.Test;

class ConcatenateTest {

	@Test
	void testConcatenate() {
		//Set up the inpout
		String frist = "University of";
		String  second = " West of Scotland";
		
		//Set up the expected output (Test Oracle)
		String expectedOutput = "University of West of Scotland";
		
		//Stimulate the system under test
		Concatenate mySut = new Concatenate();
		
		String actualOuput = mySut.concatenate(frist, second);
		
		//Check actual output agianst expected
		assertEquals(expectedOutput, actualOuput, "Result of test Concatenate");
		
				
	}
	
	@Test
	void testConcatenateEmptyStrings() {
		//Set up the inpout
		String frist = "";
		String  second = "";
		
		//Set up the expected output (Test Oracle)
		String expectedOutput = "";
		
		//Stimulate the system under test
		Concatenate mySut = new Concatenate();
		
		String actualOuput = mySut.concatenate(frist, second);
		
		//Check actual output agianst expected
		assertEquals(expectedOutput, actualOuput, "Result of test Concatenate");
		
				
	}
	
	@Test
	void testConcatenateWithNullInput() {
		//Set up the inpout
		String frist = null;
		String  second = "a";
		
		//Set up the expected output (Test Oracle)
		String expectedOutput = null;
		
		//Stimulate the system under test
		Concatenate mySut = new Concatenate();
		
		String actualOuput = mySut.concatenate(frist, second);
		
		//Check actual output agianst expected
		assertEquals(expectedOutput, actualOuput, "Result of test Concatenate");
		
				
	}

}
