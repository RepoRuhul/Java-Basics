package lec10_03_Java_oop_abstraction_final;

public class Toyota extends ElectricCar implements Car{
	// non abstract method or implemented method
	public void toyota() {
		System.out.println("This method is from Toyota class");
	}

	@Override
	public void start() {
		System.out.println("start method from Car Interface");

	}

	@Override
	public String stop() {
		String m = "stop method from Car Interface";
		System.out.println(m);
		return m;	
	}
	
	@Override
	public void brake(String brakeName) {
		String m = "brake method from Car Interface";
		System.out.println(m);
	}

	@Override
	public void price() {
		System.out.println("price method from ElectricCar Abstract class");
	}
	
	
}
