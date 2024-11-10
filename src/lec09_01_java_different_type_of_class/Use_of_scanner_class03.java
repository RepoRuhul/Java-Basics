package lec09_01_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class03 {

	public static void main(String[] args) {
		System.out.println("Please Type your First and Last Name: ");
		Scanner scanner = new Scanner(System.in);
		String fName = scanner.nextLine();
		String lName = scanner.nextLine();
		String fullName = fName + " " + lName;
		System.out.println("Hey! " + fullName + ", Now You know how the Scanner class works!");
		scanner.close();
	}

}
