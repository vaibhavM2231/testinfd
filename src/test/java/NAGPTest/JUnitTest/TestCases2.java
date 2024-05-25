package NAGPTest.JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases2 {

	@Test
	public void test() {
		
		
		int sum = addNumbers(10, 20);
		
		int expected= 30;
		
		assertEquals(sum, expected);
	}
	
	
	public int addNumbers(int a, int b) {
		int c = a+b;
		
		return c;
	}

}
