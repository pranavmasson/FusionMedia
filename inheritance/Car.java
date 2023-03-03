package inheritance;

import java.awt.Color;

public class Car {

	/*
	 * base car class
	 */
	
	private int doors;
	private int wheels;
	private String make;
	private String model;
	private Color color;
	
	public Car(int doors, int wheels, String make, String model, Color color) {
		this.doors = doors;
		this.wheels = wheels;
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
