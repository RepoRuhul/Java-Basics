package lec16_01_Java_Nested_Class;

import lec16_01_Java_Nested_Class.JFK1.TerminalOne;

public class JFKTest {

	public static void main(String[] args) {
		System.out.println("-------------- JFK1 --------------");
		JFK1 jfk1 = new JFK1();
		jfk1.welcome();// outer class method is initialized
		// The below method doesn't work	 with outer class object	
		// jfk1.destination(); // inner class method
		
		// Below line is not ok, because TrminalOne is an inner class, inner class can't be instantiated here
		// Creating object from inner class is not possible
		// TerminalOne terminalOne = new TerminalOne();
		
		// Below one is not ok as Terminal one is not static
		// JFK1.TerminalOne terminalOne = new JFK1.TerminalOne();
		
		// How an outer class object can access the properties/methods of inner class?
		// object of outer class dot object of inner class dot properties/methods of the inner class
		jfk1.t1.destination();
		jfk1.t2.domestic();
		jfk1.t4.middleEasternFlights();
		
		System.out.println("\n-------------- JFK2 --------------");
		JFK2 jfk2 = new JFK2();
		jfk2.welcome();
		
		System.out.println("\n-------------- JFK2 --------------");
		// TerminalFour is static Inner class
		JFK2.TerminalFour jt04 = new JFK2.TerminalFour();
		jt04.middleEasternFlights();
		// jt04.asianFlights(); // shows warning because static method need to be called by the class, SEE below
		
		System.out.println("\n----------------------------");
		// static method of static inner class
		JFK2.TerminalFour.asianFlights();
		// If outer class [JFK2] have static inner class [TerminalFour], and static inner class have static method [asianFlights()]
		// you don't need to create object like line 33
	}

}
