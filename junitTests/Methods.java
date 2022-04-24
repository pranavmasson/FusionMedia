package junitTests;

public class Methods {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int exponent(int a, int b) {
		return (int)Math.pow(a, b);
	}

	public static String greetingMessage(String name) {
		return "Hello, " + name + ", how are you today?";
	}

	public static int squareArea(int side) {
		return side * side;
	}
	
	public static int squarePermimeter(int side) {
		return side + side + side + side;
	}
	
	public static boolean isEven(int a) {
		return a % 2 == 0;
	}

}
