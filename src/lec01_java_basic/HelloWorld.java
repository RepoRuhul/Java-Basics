package lec01_java_basic;
// We can create more than one project inside our eclipse IDE
// We can create more than one package inside the src file [src is called source file]
// We can create more than one class inside a package

// here public --> is called "access modifier", class --> type, HelloWorld --> is the name of the class
// The eclipse IDE created the class for us, we didn't type it
public class HelloWorld {
	// main method
	// This is the entry point of the Java
	// This is used to execute the code
	// If this is absent, execution of code is not possible, very common mistake
	// This is a system generated method, name is 'main'
	// What is the shortcut of creating a main method? 
	// Ans: Type 'main' inside the class body and then press Enter button.
	// All the execution come from main method
	// How many main method present inside one class? Ans:  'only one' , can't stay with same name
	// try to create another main method inside/outside the class]
	public static void main(String[] args) {
		// you have to type 'syso' to print something, and then press Enter
		// below line is also system generated printing command, used for printing something
		System.out.println("Hello World!");
		System.out.println("Welcome to Java Course");
		// common mistake: we forgot to put quotation (double quotation) inside parenthesis,
		// we forgot or sometime delete the semicolon
		// we delete curly braces at the end
	}
}

// This part is called Editor
// Below part where you get the outcome as "Hello World!" is called Console

// For execution: We have to save the code (Manually by clicking save/save all button on the top left)
// Or by keyboard command
// for Windows user: keyboard shortcut: save (ctrl+s), saveAll (ctrl+shift+s)
// for Mac user: keyboard shortcut: save (command+s), saveAll (command+shift+s)

// How to Execute/Run the code? 
// 1) Green play button from the tool bar
// 2) right click on Editor -- then 'run as' -- 'java application' 
// 3) from the top of the page from 'Run' -- then 'run as' -- 'java application' 
// 4) go to the class on left and do the right click -- then 'run as' -- 'java application'
// commit for branch created.