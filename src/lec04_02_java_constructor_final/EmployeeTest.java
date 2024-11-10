package lec04_02_java_constructor_final;

public class EmployeeTest {

	public static void main(String[] args) {
		// default Constructor Initialized
		Employee employee = new Employee();
		
		// Parameterized Constructor Initialized -01
		System.out.println("---------------------- // -------------------------");
		Employee alex = new Employee("Alex F", 216843, 'M', true);
		System.out.println("---------------------- // -------------------------");
		Employee akash = new Employee("Akash", 365763, 'M', true);
		System.out.println("---------------------- // -------------------------");
		Employee rubuait = new Employee("Rubuait", 6579675, 'F', false);
		System.out.println("---------------------- // -------------------------");
		Employee muktar = new Employee("Muktar", 472354, 'M', true);
		System.out.println("---------------------- // -------------------------");
		Employee bani = new Employee("Bani Yusuf", 874365, 'M', false);
		System.out.println("---------------------- // -------------------------");
		Employee shapna = new Employee("Shapna", 174365, 'F', true);
		
		// Advantage of Parameterized Constructor: 
		// We can initialized arguments for multiple user
	}

}
