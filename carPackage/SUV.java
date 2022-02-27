package carPackage;

public class SUV implements Car {

	public int mileage;
	public String colorOfCar;
	public String LP;
	public int numOfSeats;
	
	public SUV(int mileage, String colorOfCar,
			String LP) {
		this.mileage = mileage;
		this.colorOfCar = colorOfCar;
		this.LP = LP;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public String getColorOfCar() {
		return colorOfCar;
	}
	
	public String getLP() {
		return LP;
	}
	
	public int getNumSeats() {
		return numOfSeats;
	}
	
}
