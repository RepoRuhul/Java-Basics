package lec10_02_Java_oop_abstraction;

public class VehicleTest {

	public static void main(String[] args) {
		Toyota toyota = new Toyota();
		toyota.toyota();
		// toyota.countryOfOrigin();
		// if you call a static method by object, it shows warning, see above line
		Toyota.countryOfOrigin();
		// if a method is static, no help needed from object, the class or Interface can directly call it.
		toyota.rent();
		toyota.carryingGoods();
		toyota.carryingPassenger();
		toyota.start();
		toyota.stop();
		toyota.expensive();
		toyota.canFloat();
		toyota.price();
		toyota.brake("Maximus Brake");
		toyota.autoPilot();
		toyota.lightWeight();
		// now calling methods from Abstract class "Electric Car"
		toyota.battery();
		// toyota.yearOfEstablishment();
		Toyota.yearOfEstablishment(); // this static method is from Electric Car
		// yearOfEstablishment() is a static method in Abstract class. Toyota class, (not object) can extends that Abstract class, 
		// so, Toyota itself can initialize that method, but in terms of Interface, it (here gear method) is not allowed for Toyota [line 31-32]
		toyota.flyingFeature();
		// now calling methods from Interface "Car"
		// toyota.gear();
		// Toyota.gear();
		// gear () is a static method of an Interface, static method of an Interface can't be call by object of a regular class (line 31)
		// or by the regular class itself (line 32)
		toyota.honk();
		
		// "priceOfToyota" and "costOfTesla" can be initialized and print like below
		System.out.println("Toyota manufactured in: " + toyota.yearOfManufacture);
		System.out.println("Variable from Abstract Class: " + toyota.nameOfTheElectricCar);
		// System.out.println(toyota.YEAR); // This got warning
		System.out.println("The Car invented in: " + Toyota.YEAR);
		// as "YEAR" variable is static and Toyota implements Car, that's why no error
		
		
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		// 'Cannot instantiate the type Car' which is an Interface. Why?
		// Interview question: why Interface can't be instantiated? 
		// Ans: because implementation is not complete [as abstract methods present] inside Interface
		// Interface carry abstract method
		// What is the solution?
		// an Interface can't be instantiated, it needs the help of a concrete class, 
		// Why Toyota is a concrete class here, 
		// Because Toyota helps to implement the Car Interface by "Toyota implements Car"
		
		Car car = new Toyota(); //Who will be initialized in this line? Constructor
		// Car car2 = new Ferrari(); // Ferrari class never implements Car Interface
		car.start();
		car.stop();
		car.brake("Alex Break");
		// car.gear(); // because static method
		Car.gear(); // no need of object, Interface/class can directly call static methods, 
		// but static method in abstract class can be called by Regular class Toyota object (but got warning), Regular class can call directly
		car.honk();
		car.rent();
		car.carryingPassenger();
		car.carryingGoods();
		System.out.println("The Car invented in: " + Car.YEAR); // year was static in nature
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		// Cannot instantiate the type ElectricCar which is an Abstract Class. Why?
		// Interview question: why Abstract Class can't be instantiated? 
		// because implementation is not complete [as abstract methods present] in Abstract Class
		// an Abstract Class can't be instantiated, it needs the help of a concrete class, 
		// Why Toyota is a concrete class here, 
		// Because Toyota helps to extends ElectricCar (the Abstract Class) by "Toyota extends ElectricCar"
		ElectricCar electricCar = new Toyota();
		// ElectricCar electricCar2 = new Mercedez();
		electricCar.battery();
		electricCar.price();
		ElectricCar.yearOfEstablishment(); // static method
		electricCar.flyingFeature();
		electricCar.autoPilot();
		electricCar.canFloat();
		electricCar.expensive();
		electricCar.costOfTesla = 65000;
		System.out.println("Electric Car name: " + electricCar.nameOfTheElectricCar + ", and price: " + electricCar.costOfTesla);
		
		// we didn't show other regular class, abstract class and Interfaces here, but possible 
	}

}
