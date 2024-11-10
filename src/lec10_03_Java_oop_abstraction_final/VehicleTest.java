package lec10_03_Java_oop_abstraction_final;

public class VehicleTest {

	public static void main(String[] args) {
		Toyota toyota = new Toyota();
		toyota.toyota();
		toyota.start();
		toyota.stop();
		toyota.price();
		toyota.brake("Maximus Brake");
		// from ElectricCar Abstract class
		toyota.battery();
		// from Car Interface
		toyota.honk();		
		System.out.println("The Car invented in: " + Toyota.YEAR);		
		
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		Car car = new Toyota(); 
		car.start();
		car.stop();
		car.brake("Alex Break");
		Car.gear();
		car.honk();
		System.out.println("The Car invented in: " + Car.YEAR);
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		ElectricCar electricCar = new Toyota();
		electricCar.battery();
		electricCar.price();
	}

}
