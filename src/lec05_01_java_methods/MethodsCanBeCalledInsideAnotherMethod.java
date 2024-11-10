package lec05_01_java_methods;

public class MethodsCanBeCalledInsideAnotherMethod {
	public String breed = "BullDog";
	public int age = 2;
	
	public String firstName = "Alex";
	public String lastName = "Chao";
	
	public double price = 500.50;
	
	public void breedType() {
		System.out.println("The breed: " + breed);
	}
	
	public String breedOfTheDog() {
		System.out.println("The breed of the dog is: " + breed);
		return breed;
	}
	
	public String fullNameOfTheDog() {
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
	
	// We learn from here, which concept will be used later
	// We can call one or more than one method, inside another method
	// This method can be void type too
	public void dogDescription() {
		breedOfTheDog();
		fullNameOfTheDog();
		ageOfTheDog();
		priceOfTheDog();
	}
	
	public static void main(String[] args) {
		MethodsCanBeCalledInsideAnotherMethod mm = new MethodsCanBeCalledInsideAnotherMethod();
		mm.dogDescription();
	}

}
