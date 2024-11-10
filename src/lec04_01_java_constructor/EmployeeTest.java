package lec04_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// When class is instantiated, means when object is created, Constructor is Initialized
		// default Constructor Initialized
		Employee employee = new Employee();
		
		System.out.println("------------------------------------------------");
		// Parameterized Constructor Initialized -01
		// Here "Alex F" is called 'argument' which is String type
		// Parameterized Constructor have advantage, you can reuse it, how?
		// we change arguments
		Employee employee2 = new Employee("Alex F");
		Employee employee3 = new Employee("Michael V");
		Employee employee4 = new Employee("Jenifer A");
		
		System.out.println("------------------------------------------------");
		// Parameterized Constructor Initialized -02
		// Here "Alex F" is called 'argument' which is String type
		// Here 2188458 is called 'argument' which is int type
		// Here 'M' is called 'argument' which is char type
		// Here false is called 'argument' which is boolean type 
		Employee alex = new Employee("Alex F", 2188458, 'M', false );
		Employee akash = new Employee("Akash", 365763, 'M', true);
		
		System.out.println("------------------------------------------------");
		// Parameterized Constructor Initialized -03
		Employee rubuait = new Employee('F', "Rubuait", 6579675, false);
		
		System.out.println("------------------------------------------------");
		// Parameterized Constructor Initialized -04
		Employee muktar = new Employee("Muktar", 472354, 'M');
		
		System.out.println("------------------------------------------------");
		// Parameterized Constructor Initialized -05
		Employee bani = new Employee("Bani Yusuf", 874365);

	}

}
