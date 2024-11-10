package lec13_01_java_conditional_statements;


import java.util.Scanner;

public class TwoConditionPresentAndWeUseLogicalAndOperatorAndLogicalNotOperator02 {

	public static void main(String[] args) {
		System.out.println("---: Please Put the values in the console :---");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		// Important info: We are using more than 2 conditions
		// use of or [25] and logical not [27]
		// logical or is not generally used in industry
		
		if(val1%2==0 && val2%2 ==0 && val1>val2) {
			System.out.println(val1 + " and " + val2 + " is an Even Number and " + val1 + " is greater than " + val2);
		} else if (val1%2==0 && val2%2 ==0 && val1<val2) {
			System.out.println(val1 + " and " + val2 + " is an Even Number and " + val1 + " is smaller than " + val2);
		} else if (val1%2==0 && val2%2 ==0 && val1==val2) {
			System.out.println(val1 + " and " + val2 + " is an Even Number and " + val1 + " is equal to " + val2);
		} else if(val1%2==0 && val2%2 ==0 && val1>=val2) {
			System.out.println(val1 + " and " + val2 + " is an Even Number and " + val1 + " is greater than or equal to " + val2);
		} else if(val1%2==0 || val2%2 ==0 || val1<=val2) {
			System.out.println(val1 + " or " + val2 + " is an Even Number and " + val1 + " is smaller than or equal to " + val2);
		} else if(!(val1%2==0 && val2%2 ==0 && val1<=val2)) {
			System.out.println(val1 + " and " + val2 + " is not an Even Number and " + val1 + " is not smaller than or not equal to " + val2);
		} else {
			System.out.println("The system failed to execute the outcome");
		}
		scanner.close();		
	}

}
