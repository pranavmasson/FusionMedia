package DayEnums;

public class DayClass {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DayClass(String name) {
		this.name = name;
	}
	
	private DayClass() {
		this.name = "Unknown";
	}
	
}
