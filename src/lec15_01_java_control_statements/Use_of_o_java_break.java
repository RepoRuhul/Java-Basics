package lec15_01_java_control_statements;

public class Use_of_o_java_break {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) { 
			System.out.println(i);
		}
		// 1, 2, 3, 4, 5
		
		System.out.println("\n---------- for loop after break  ----------\n");
		for(int j =0; j<=10; j+=2) {
			// if the condition is true, the code will move to the condition body [any condition may present], 
			// and the break feature will break further execution. break means complete stop 
			// we can also use more than one condition by logical and [&&] operator
			if(j>6) {
				break;
				// break always used inside condition body, it shows error if we use without condition
			} else {
				System.out.println(j);
			}
			// how many condition we can use inside a loop? Ans: as many as we want
		}
		// 2 information needed: where we use break? Ans: inside condition
		// what break do? Ans: break the further loop execution
		// break is always the last statement inside the condition
		
		// regular outcome if break not implemented: 0, 2, 4, 6, 8, 10
		// outcome if break implemented: 0, 2, 4, 6
		
		System.out.println("\n---------- for loop after break  ----------\n");
		for(int j =1; j<=10; j+=2) {
			// if the condition is true, the code will move to the condition body [any condition may present], 
			// and the break feature will break further execution. break means complete stop 
			// we can also use more than one condition by logical and [&&] operator
			if(j==6) {
				break;
				// break always used inside condition body, it shows error if we use without condition
			} else {
				System.out.println(j);
			}
			// how many condition we can use inside a loop? Ans: as many as we want
		}
		
		// regular outcome if break not implemented: 1, 3, 5, 7, 9
		// outcome if break implemented:  1, 3, 5, 7, 9
		
		
		// Try to understand at least the for loop, that is enough, if you feel stress don't go below
		// See the code by yourself
		// This is a while loop
		System.out.println("\n---------- while loop ----------\n");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- while loop after break 01 ----------\n");
		int j = 0;
		while (j <= 10) { 
			if (j == 7) {
				break;
			}
			System.out.println("The value is: " + j); // break is not implemented because no value as 7
			j=j+2;
		} 
		// regular outcome if break not implemented: 0, 2, 4, 6, 8, 10
		// outcome if break implemented: 0, 2, 4, 6, 8, 10
		
		System.out.println("\n---------- while loop after break 02 ----------\n");
		int n = 1;
		while (n <= 10) { 
			if (n == 7) {
				break;
			}
			System.out.println("The value is: " + n); // break is implemented because 7 is present as value
			n=n+2;
		}
		
		// regular outcome if break not implemented: 1, 3, 5, 7, 9
		// outcome if break implemented: 1, 3, 5
		
		System.out.println("\n---------- do while loop after break 01 ----------\n");
		int l = 1;
		do { 
			if (l == 5) {
				break;
			}
			System.out.println("The value is: " + l);						
			l = l + 2;
		} while (l <= 7);
		// regular outcome if break not implemented: 1, 3, 5, 7
		// outcome if break implemented: 1, 3
		
		
		System.out.println("\n---------- do while loop after break 02 ----------\n");
		int m = 1;
		do {
			if (m == 6) {  // condition is absent, so break is not implemented
				break;
			}
			System.out.println("The value is: " + m);					
			m = m + 2;
		} while (m <= 7);
		
		// Regular outcome if break not implemented: 1, 3, 5, 7
		// outcome if break implemented: 1, 3, 5, 7
		
		
		
		
	}

}
