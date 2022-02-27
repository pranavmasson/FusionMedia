import java.util.Scanner;

public class TryCatch {
	
	public static String testString;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of miles: ");
		int miles = scanner.nextInt();

		System.out.println("Enter number of gallons: ");
		int gallons = scanner.nextInt();
		
		try {
			int milesPerGallon = miles / gallons;
			System.out.println("Miles per gallon is: " + milesPerGallon);
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		finally {
			scanner.close();
			System.out.println("Before leaving method getGasAverage() (finally message)");
		}
		
	}

}
