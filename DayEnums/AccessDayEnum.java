package DayEnums;

public class AccessDayEnum {

	public static void main(String[] args) {

		System.out.println(Day.SUNDAY.getName());
		
		for (Day day: Day.values()) {
			if (day.getDayNumber() == 2) {
				System.out.println(day.getName());
			}
		}
	}

}
