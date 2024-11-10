package lec13_01_java_conditional_statements;

public class Z02_example_of_switch_in_using_day {
	public static void main(String[] args) {
	String day = "Thursday";
	int age = 12;

		switch (day) {
		case "Saturday":
			System.out.println("Lunch Menu: Rice and Fish");
			break;

		case "Sunday":
			System.out.println("Lunch Menu: Biriyani");
			break;

		case "Monday":
			System.out.println("Lunch Menu: Rice and Chicken");
			break;
		
		case "Tuesday":
			System.out.println("Lunch Menu: Rice and Beef");
			break;

		case "Wednesday":
			System.out.println("Lunch Menu: Rice and Lamb");
			break;

		// We can use conditions inside case of a switch condition	
		case "Thursday":
			if (age<12) {
				System.out.println("Lunch Menu: Pizza");
			} else if(age>=12) {
				System.out.println("Lunch Menu: Pasta");
			}			
			break;

		case "Friday":
			System.out.println("Lunch Menu: Burger");
			break;

		default:
			System.out.println("Please put a valid Day!!");
			break;
		}

	}

}
