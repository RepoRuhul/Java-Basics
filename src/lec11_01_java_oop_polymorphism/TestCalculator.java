package lec11_01_java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("-------- Land Calculator --------");
		LandCalculator lc = new LandCalculator();
		lc.landCalculator(); // void type non parameterized method (1) is initialized
		lc.landCalculator(42, 10); // void type parameterized method (2) is initialized
		lc.landCalculator(42, 10, 39); // return type parameterized method (3) is initialized
		lc.landCalculator(61, "31", 97); // void type parameterized method (4) is initialized
		lc.landCalculator(4.345345f, 109, "43"); // return type parameterized method (5) is initialized
		lc.landCalculator(42, 10, 39, 61); // return type final parameterized method (6) initialized
		LandCalculator.landCalculator(42, 10, 39, 61, 19); // void type static parameterized method (7) initialized

		System.out.println("\n-------- Modern Calculator --------");
		ModernCalculator mc = new ModernCalculator();
		mc.landCalculator();// void type non parameterized method (1) is initialized
		mc.landCalculator(42, 10); // void type parameterized method (2) is initialized
		mc.landCalculator(42, 10, 39); // return type parameterized method (3) is initialized
		mc.landCalculator(61, "31", 97); // void type parameterized method (4) is initialized
		mc.landCalculator(4.345345f, 109, "43"); // return type parameterized method (5) is initialized
		
	}

}
