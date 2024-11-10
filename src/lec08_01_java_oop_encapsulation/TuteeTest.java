package lec08_01_java_oop_encapsulation;

public class TuteeTest {

	public static void main(String[] args) {
		Tutee tutee = new Tutee("Alex F", 538705, 'M', false, 2.4456f);		
		System.out.println("Student Name: " + tutee.getStName()  + "\nStudent Id: " + tutee.getStId() + "\nGender: "
				+ tutee.getStGender() + "\nFull Time student? : " + tutee.isFullTimeSt() + "\nGrade: " + tutee.getStGrade());

		System.out.println("\n---------------\\-----------------");
		Tutee angelina = new Tutee("Angelina J", 477830, 'F', true, 3.536f); 
		System.out.println("Student Name: " + angelina.getStName()  + "\nStudent Id: " + angelina.getStId() + "\nGender: "
				+ angelina.getStGender() + "\nFull Time student? : " + angelina.isFullTimeSt() + "\nGrade: " + angelina.getStGrade());

		
	}

}
