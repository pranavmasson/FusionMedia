package AbstractClasses;

public abstract class House {
	
	/*
	 * \n -> adds a new line to a String
	 */
	
	/*
	 * we can have many types of houses
	 * apartments, townhouse, single family
	 * we use abstract class to define and create a blueprint for specific types of houses
	 */
	
	/*
	 * abstract classes can have instance variables, constructors, and methods
	 * interfaces cannot actually have these (instance variables or constructors)
	 * abstract classes cannot have objects defined directly from them
	 	* Snack snack = new Snack("Cookie"); //example that does not compile
	 */
	
	/* INSTANCE VARIABLES
	 * square footage
	 * price
	 * num of bedrooms
	 * num of bathrooms
	 * num of floors
	 */
	
	/* METHODS
	 * getters and setters
	 * price per square foot
	 * toString()
	 */
	
	/* 	WHAT IS TOSTRING() ?
	 * essentially is printing the details of an object (instance variables)
	 * better to be formatted nicely
	 	* "Square Footage: " squareFootage
	 	* "Price: $" price
	 	* "Number of Bedrooms: " numBedrooms
	 	* "Number of Bathrooms: " numBathrooms
	 	* "Number of Floors: " numFloors
	 */
	
	private int squareFootage;
	private double price;
	private int numBedrooms;
	private int numBathrooms;
	private int numFloors;
	
	public House() {
		this.price = 100000.00;
	}
	
	public House (int squareFootage, double price, int numBedrooms, int numBathrooms, int numFloors) {
		this.squareFootage = squareFootage;
		this.price = price;
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.numFloors = numFloors;
	}
	
	public int getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}
	
	public double pricePerSquareFoot() {
		return this.price / this.squareFootage;
	}
	
	//	* "Square Footage: " squareFootage
	// 	* "Price: $" price
	// 	* "Number of Bedrooms: " numBedrooms
	// 	* "Number of Bathrooms: " numBathrooms
	// 	* "Number of Floors: " numFloors
	public String toString() {
		String str = "";
		str += "Square Footage: " + this.squareFootage + "\n";
		str += "Price: $" + this.price + "\n";
		str += "Number of Bedrooms: " + this.numBedrooms + "\n";
		str += "Number of Bathrooms: " + this.numBathrooms + "\n";
		str += "Number of Floors: " + this.numFloors + "\n";
		return str;
	}
	
	public abstract int addSquareFootage();
	
	public static void main(String[] args) {
		int c = Math.pow
	}
	
	

}
