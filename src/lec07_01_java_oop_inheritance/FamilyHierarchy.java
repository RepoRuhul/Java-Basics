package lec07_01_java_oop_inheritance;

public class FamilyHierarchy {

	public static void main(String[] args) {	
		GrandFather grandFather = new GrandFather();
		grandFather.grandFatherInfo();
		
		System.out.println("\n");
		Aunt aunt = new Aunt(); // can inherit the Constructor of parent
		aunt.auntInfo();
		aunt.grandFatherInfo(); // can inherit the method of parent
		aunt.age = 55; // can inherit the variable of parent
		System.out.println(aunt.age);
		
		
		System.out.println("\n");
		Cousin cousin = new Cousin();
		cousin.cousinInfo();
		cousin.auntInfo();
		cousin.grandFatherInfo();
		
		System.out.println("\n");
		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		
		System.out.println("\n");
		Father father = new Father();
		father.fatherInfo();
		father.grandFatherInfo();
		
		System.out.println("\n");
		Sister sister = new Sister();
		sister.sisterInfo();
		sister.fatherInfo();
		sister.grandFatherInfo();
		
		System.out.println("\n");
		Niece niece = new Niece();
		niece.nieceInfo();
		niece.sisterInfo();
		niece.fatherInfo();
		niece.grandFatherInfo();
		
		System.out.println("\n");
		MySelf mySelf = new MySelf();
		mySelf.myInfo();
	}
	
	// Niece extends Sister, Sister extends Father, Father extends GrandFather
	// Example of Multilevel Inheritance
	
	// Aunt extends GrandFather, Father extends GrandFather, Uncle extends GrandFather
	// Example of Hierarchical Inheritance
	
}
