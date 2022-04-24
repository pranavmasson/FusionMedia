package carPackage;

public class carDriver {

	public static void main(String[] args) {
		
		sportsCar ferrari = new sportsCar(1500, "Miami Blue",
				"UEP-4590");
		sportsCar lamborghini = ferrari.clone();

		ferrari.setMileage(36000);
		System.out.println("Ferrari Mileage: " + ferrari.getMileage());
		
		
		System.out.println(ferrari.toString());
		System.out.println(lamborghini.toString());
		System.out.println("Lamborghini Mileage: " + lamborghini.getMileage());

	}
	
	/*
	 * Step 1: create a package called Schools
	 * Step 2: create an interface called School
	 * Step 3: create a class called Stone Bridge 
	 * Step 4: create a class called AET
	 */

}
