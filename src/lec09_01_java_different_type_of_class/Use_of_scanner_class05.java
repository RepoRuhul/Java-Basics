package lec09_01_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class05 {

	public static void main(String[] args) {
		System.out.println("Please Input Your Student Name: ");
		Scanner scanner = new Scanner(System.in);
		// if we want to input String, int, float together, that is OK!
		String name = scanner.nextLine(); // String Type
		
		System.out.println("Please Input Your Student Id: ");
		int stId = scanner.nextInt();
		
		System.out.println("Please Input Your Score in HW, Quiz and Exam: ");
		float scoreInHW = scanner.nextFloat();
		float scoreInQuiz = scanner.nextFloat();
		float scoreInExam = scanner.nextFloat();

		float average = (scoreInHW + scoreInQuiz + scoreInExam)/3;
		System.out.println("\nStudent Name: " + name + "\nStudent Id: "+ stId+ ",\nThe average of the hw, quiz and exam is: " + average);
		scanner.close();

	}

}
