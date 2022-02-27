package AbstractClasses;

public class Apartment extends House {

	private String type;

	public Apartment(int squareFootage, double price, int numBedrooms, int numBathrooms, 
			int numFloors, String type) {
		super(squareFootage, price, numBedrooms, numBathrooms, numFloors);
		this.type = type;
	}

	public Apartment(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static void main(String[] args) {
		// House house = new House();   -> cannot create object because abstract class
		Apartment apartment = new Apartment(1500, 250000.00, 3, 2, 1, "Apartment");
		System.out.println(apartment.toString());	
	}

	@Override
	public int addSquareFootage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
