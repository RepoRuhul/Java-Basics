package lec14_01_java_control_statements;

public class Use_of_k_java_do_while_loop {
	public static void main(String[] args) {
		System.out.println("-------------- for loop --------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("-------------- while loop --------------");
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("-------------- do while loop01, condition is true --------------");
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j<5);
		
		// very very important interview question: what is the difference between while loop and do while loop?
		
		System.out.println("\n---------- do while loop 02, condition is false ----------\n");
		int k = 2;
		do {
			System.out.println(k);
			k+=2;
		} while (k<4);
		
		// but when k is <4, as the condition is not true, loop stop after 1st iteration
		// the value of k will be evaluated from line 31 which is 4, change the condition to >=4, you can see the infinite loop
	}

}
