package lec10_03_Java_oop_abstraction_final;

public interface Car {
	// the variables inside Interface are static and final in nature.
	public static final int YEAR = 1880;
	
	// abstract method
	public abstract void start();
	public String stop();
	public void brake(String name);
	
	// static method
	public static void gear() {
		System.out.println("This Gear feature is from Car Interface");
	}
	
	// default method
	public default void honk() {
		System.out.println("This Honk feature came from Car Interface");
	}
	
	
	
	
	
	
	
	
	
	

}
