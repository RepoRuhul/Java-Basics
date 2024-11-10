package lec03_01_java_variables;

public class MyInfoTest {
	public static void main(String[] args) {
		// MyInfo is public type
		MyInfo tofael = new MyInfo();
		System.out.println(tofael.myName);
		System.out.println(tofael.myYearlySalary);
		System.out.println(tofael.myGender);
		System.out.println(tofael.usCitizen);
		System.out.println(tofael.myHeight);
		tofael.mySelf(); // object can call method
		tofael.study_tour();
		tofael.myInfo();

	}

}
