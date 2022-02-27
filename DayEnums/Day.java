package DayEnums;

public enum Day {
	
	/*
	 * Main Difference between enums and classes:
	 * enums can only have one object of each type
	 * constructors must be private so that other classes cannot make more
	 * enum objects must be instantiated and defined within the file itself
	 * add all enums to an array by calling fileName.values() [Day.values();]
	 * order to write enum files: 
	 	* defined enum objects, instance variables, constructors, getters/setters, any addtl. methods
	 */
	
	/*
	 * Class Example:
	 * create an enum file called "CarMakes"
	 * define 5 car makes: "Tesla", "Audi", "Honda", "BMW", "Lamborghini"
	 * create two constructors: 2 parameter and 1 parameter
	 * instance variables: String name, int numModels
	 * define them
	 */
	
	SUNDAY("Sunday"), MONDAY("Monday"), FRIDAY(), DAY1("Sunday", 1), DAY2("Monday", 2),
	DAY3("Tuesday", 3), DAY4("Wednesday", 4), DAY5("Thursday", 5);
	
	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	private String name;
	private int dayNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Day(String name) {
		this.name = name;
	}
	
	private Day(String name, int num) {
		this.name = name;
		this.dayNumber = num;
	}
	
	private Day() {
		this.name = "Unknown";
	}
	
	
	
}
