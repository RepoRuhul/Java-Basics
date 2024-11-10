package lec02_java_variables;

public class Vehicle {
	// access modifier: public, private, protected, default is used below
	public String name = "Mercedez";
	private int price = 55000; // private can be accessed in the same class
	protected boolean madeInUSA = false;
	char quality = 'A'; // in default type, you don't need to write anything
	float review = 9.5609f;
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		System.out.println(car.price);

	}

}
