package junitTests;

public class recapMethods {

	public static int factorial(int num) {
		int factorial = 1;
		for (int i = 2; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
}
