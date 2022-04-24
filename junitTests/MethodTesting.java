package junitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MethodTesting {
	
	/*
	 * in JUnit tests, we can use methods to make sure our code is working properly
	 	* assertTrue();
	 	* assertFalse();
	 	* assertEquals();
	 */

	@Test
	public void testSum() {	
		int sum = Methods.sum(4, 6);
		assertEquals(10, sum);	
	}
	
	@Test
	public void testGreetingMessage() {
		String testMessage = Methods.greetingMessage("Vaibhav");
		String actualMessage = "Hello, " + "Vaibhav" + ", how are you today?";
		boolean status = false;
		if (testMessage.equals(actualMessage)) {
			status = true;
		}
		assertTrue(status);
	}
	
	/*
	 * BASIC SYNTAX FOR A JUNIT TEST:
	 * @Test //annotation needed
	 * public void testName() {
	 	* ..code
	 	* assertStatement
	 */
	
	
}
