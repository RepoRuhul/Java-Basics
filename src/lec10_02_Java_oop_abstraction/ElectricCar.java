package lec10_02_Java_oop_abstraction;

// Abstract Class contains both abstract and non abstract methods
// Abstract Class names starts with UpperCase like a regular class
//T hey follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Abstract Class --> ElectricCar
// Snake_case example for an Abstract Class --> Electric_car

// An abstract class
// An abstract class can inherit only one abstract class or one regular class by extends key word
// An abstract class can't inherit an Interface by extends key word


// implements keyword is used to inherit Interface in abstract class
// an abstract class can inherit more than one Interface
// an abstract class cannot inherit a regular class or abstract class by implements keyword

public abstract class ElectricCar extends FlyingCar implements HoverCar, Rocket{
	// Global variable
	// Inside Abstract class, variable can be declared or initialized
	public int costOfTesla;
	public String nameOfTheElectricCar = "Tesla";
		
	// Can you Declare a Constructor inside Abstract class? Ans: Yes
	public ElectricCar() {
		System.out.println("This constructor is from Abstract class-- Electric Car");
	}
	// Important Interview question: Can a Constructor of an Abstract class be initialized?
	// When we will instantiate the Abstract class, we will get that answer that time (Lec 10)
	
	// non abstract method or implemented method
	public void battery() {
		System.out.println("The battery is very efficient and is from ElectricCar Abstract class");
	}
	
	// method declared
	// when method is declared, that method is also called abstract method
	// This is mandatory to put "abstract" keyword with the abstract method (inside Abstract Class)
	// This is the norm/rules to "write at least one abstract method" inside abstract class
	public abstract void price();
	
	// we can also create parameterized method, return type method too
	
	// static method can be used inside abstract class
	public static void yearOfEstablishment() {
		System.out.println("Established in 2018");
	}
	
	// Default methods are allowed only in interfaces, not in abstract class
	/*
	public default void noGas() {
		
	}
	*/
	

}
