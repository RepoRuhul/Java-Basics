package lec05_01_java_methods;

public class Dog {
	// Global variable
	public String breed = "BullDog";
	public int age = 2;
	
	public String firstName = "Alex";
	public String lastName = "Chao";
	
	public double price = 500.50;
	
	// void type method
	// This method never say what type of parameterized data we are getting
	public void breedType() {
		System.out.println("The breed: " + breed);
	}
	
	// return type method 
	// there is no void keyword inside it, rather data type
	// it tells us what type of data, we will get from this method
	// return keyword should be the last statement of return type method
	public String breedOfTheDog() {
		System.out.println("The breed of the dog is: " + breed);
		return breed;
	}
	
	// we learn: local variable
	public String fullNameOfTheDog() {
		// next line is example of local variable, fullName
		// Why it is called local variable
		// because this is inside a method
		String fullName = firstName +" "+ lastName;
		System.out.println("The name of the dog is: " + fullName);
		return fullName;
	}
	
	public int ageOfTheDog() {
		System.out.println("The age of the dog is: " + age );
		return age;
	}
	
	public double priceOfTheDog() {
		System.out.println("The price of the dog is: " + price);
		return price;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breedType();
		dog.breedOfTheDog();
		dog.fullNameOfTheDog();
		dog.ageOfTheDog();
		dog.priceOfTheDog();
	}

}
