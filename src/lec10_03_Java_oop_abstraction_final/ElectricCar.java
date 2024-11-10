package lec10_03_Java_oop_abstraction_final;

public abstract class ElectricCar {
	// non abstract method or implemented method
	public void battery() {
		System.out.println("The battery is very efficient and is from ElectricCar Abstract class");
	}
	
	// abstract method
	public abstract void price();
	
}
