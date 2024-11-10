package lec03_01_java_variables;

// class can be default or public only
public class MyInfo {
	// String itself is a class, represents for String type variable here
	// String is not a pure primitive data type, important interview question
	public String myName = "Tofael Kabir";
	
	// primitive data type - 8 type
	// byte, short, int, long are used for complete/solid number
	
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l;
	// we must have to use lower case L (l), at the end of long type value
	// Long can accept int range and no need of l, 
	// but when you cross the range of int, you must have to use l, example: 2147483648
	
	// float and double are used for not a complete number [a number with decimal]
	public float myHeight = 1.6443f;
	// we must have to use lower case f, at the end of float value	
	public double myGrade = 3.7657468566745;
	// Above 6 types are used for number, values are represented with no quotation
	// Important: Mostly int is used for complete number and float for decimal number
	
	public char myGender = 'M';
	public boolean usCitizen = true;
	
	// Constructor declared
	public MyInfo() {
		System.out.println("I am a Constructor from MyInfo class");
	}
	
	// Inside class, method is implemented [not declared], important info
	// How to create a method?
	// This is a void type method
	// method name generally starts with lower Case 
	// and follow camel case feature or snake case pattern
	// but, this is not mandatory to make a method name same as class name
	public void mySelf() {
		System.out.println("I am a myself method");
	}
	
	// there can be more than one method inside a class with different name [not with same name]
	public void study_tour() {
		System.out.println("I am a studyTour method");
	}
	
	// method name can be same as class name, but in lower case
	public void myInfo() {
		System.out.println("I am a myInfo method");
		// Can we use/call variable inside sysout of method body? Ans: Yes, see line 45
		// You don't need an object to call variable inside method
		System.out.println("My Name: " + myName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
