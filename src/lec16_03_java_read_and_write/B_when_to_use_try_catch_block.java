package lec16_03_java_read_and_write;

public class B_when_to_use_try_catch_block {

	public static void main(String[] args) {
		int a = 34;
		int b = 0;
		try {
			int division = a / b;
			System.out.println(division);
		} catch (ArithmeticException e) {
			System.out.println("The Exception occured here is >>>>>> " + e);
			// e.printStackTrace();
		}
		System.out.println("Code is continuing, because exception is handled");

	}

}

// before ArrayList class, everyone should see Array before come to class
