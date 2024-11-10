package lec03_01_java_variables;

import lec02_java_variables.Vehicle;

public class CarTest {

	public static void main(String[] args) {
		// Inside same package
		Car car = new Car();
		System.out.println(car.carName); // public
		// System.out.println(car.carPrice); // private, see line 17
		System.out.println(car.madeInUSA); // protected
		System.out.println(car.carQuality); // default
		System.out.println(car.userReview); // default
		
		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.name);
		// System.out.println(vehicle.madeInUSA); // protected, see line 29
		// System.out.println(vehicle.quality); // default, see line 29

	}

}

/*
How the variables are printing from here where variables are absent in this class?
Ans: Inside same package, public, protected and default type content can be accessible
Ans: Inside same class, private type content can be accessible
Ans: Inside different package, only public type content can be accessible [this info will come later]
*/
