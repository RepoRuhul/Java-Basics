package lec06_03_java_type_casting;

// primitive data type: byte, short, int, long, float, double, boolean, char
// primitive number type data: byte, short, int, long, float, double
// casting applied on primitive number type data.
// float or double [wider] ---> converted to byte or short or int or long [called narrowing casting]
// we use Narrowing casting by adding data type manually, line 18, 22

public class UseOfNarrowingCasting {

	public static void main(String[] args) {
		double myGrade = 3.5465864;
		System.out.println("My grade in double: " + myGrade);
		
		// How can you convert a double to an int type?
		// By Narrowing casting
		
		int myNewGradeInInt = (int)myGrade;
		System.out.println("My new Grade in int: " + myNewGradeInInt);
		
		// How can you convert a double to a byte type?
		byte myNewGradeInByte = (byte)myGrade;
		System.out.println("My new Grade in byte: " + myNewGradeInByte);

	}

}
