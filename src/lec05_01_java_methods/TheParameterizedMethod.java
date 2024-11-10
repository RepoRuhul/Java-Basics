package lec05_01_java_methods;

public class TheParameterizedMethod {
	// We don't need variables to make a relation with parameters like Constructor
	
	// void type parameterized method
	// What is the Advantage of parameterized methods?
	// it can be reused [called many times] by changing the arguments, 17-19 line
	// Here, String breed, int price are parameter
	public void breedType(String breed, int price) {
		System.out.println("The breed of the dog is: " + breed + "\nPrice is: " + price);
	}
	
	// can a method be parameterized when they are return type? Yes
	// if a method is parameterized, then no need of variables
	// here int price1, int price2, int price3 are parameter
	public int totalPrice(int price1, int price2, int price3) {
		int total = price1 + price2 + price3;
		System.out.println("Total price of the dogs are: " + total);
		return total;
	}
	
	// parameterized method can be void type or return type
	// parameterized method can be static type or final type

	public static void main(String[] args) {
		TheParameterizedMethod pm = new TheParameterizedMethod();
		pm.breedType("Bull Dog", 1000); // arguments used here
		pm.breedType("Pitt Bull", 800);
		pm.breedType("Doverman", 900);
		
		pm.totalPrice(500, 790, 1099);
		pm.totalPrice(100, 90, 399);
	}

}
