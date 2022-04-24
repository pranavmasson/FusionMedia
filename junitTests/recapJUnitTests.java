package junitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class recapJUnitTests {

	@Test
	public void testFactorialOf3() {
		int factorialOf3 = recapMethods.factorial(3);
		assertEquals(factorialOf3, 6);
	}
	
}
