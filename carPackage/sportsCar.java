package carPackage;

import java.util.ArrayList;

public class sportsCar implements Car, Cloneable {

	public int mileage;
	public String colorOfCar;
	public String LP;
	public ArrayList<String> VIN;
	
	public sportsCar(int mileage, String colorOfCar,
			String LP) {
		this.mileage = mileage;
		this.colorOfCar = colorOfCar;
		this.LP = LP;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
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
	
	public sportsCar clone() {
		// create a new sportsCar and set it to null
		sportsCar clonedCar = null;
		try {
			// clone the object
			clonedCar = (sportsCar) super.clone();
			clonedCar.colorOfCar = new String(this.colorOfCar);
			clonedCar.LP = new String(this.LP);
			ArrayList<String> newVIN = new ArrayList<String>();
			for (int i = 0; i < VIN.size(); i++) {
				newVIN.add(new String(VIN.get(i)));
			}
			clonedCar.VIN = newVIN;
			return clonedCar;
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
}
