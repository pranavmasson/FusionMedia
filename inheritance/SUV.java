package inheritance;

import java.awt.Color;

public class SUV extends Car {

	/*
	 * suv subclass
	 */

	private int seats;
	private boolean spareTire;
	
	public SUV(int doors, int wheels, String make, String model, Color color, int seats, boolean spareTire) {
		super(doors, wheels, make, model, color);
		this.seats = seats;
		this.spareTire = spareTire;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public boolean isSpareTire() {
		return spareTire;
	}

	public void setSpareTire(boolean spareTire) {
		this.spareTire = spareTire;
	}
	
}
