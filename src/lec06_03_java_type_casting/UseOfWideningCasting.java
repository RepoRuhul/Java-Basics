package lec06_03_java_type_casting;

// primitive data type: byte, short, int, long, float, double, boolean, char
// primitive number type data: byte, short, int, long, float, double
// casting applied on primitive number type data.
// byte or short or int or long [narrow] ---> converted to float or double [wider]   [called widening casting]
// we don't need to use data type manually, line 17 before myBankBalance

public class UseOfWideningCasting {

	public static void main(String[] args) {
		int myBankBalance = 465643;
		System.out.println("My Bank Balance: " + myBankBalance);
		// How can you convert an int to a double type?
		// By Widening casting, you don't need to write the casting type in parentheses

		double myNewBankBalance = myBankBalance;
		System.out.println("My new Bank balance: " + myNewBankBalance);
	}

}
