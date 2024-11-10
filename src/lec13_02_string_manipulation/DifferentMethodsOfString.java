package lec13_02_string_manipulation;

import java.util.Arrays;

public class DifferentMethodsOfString {
	public static void main(String[] args) {
		// If we write a String by creating an object [a], we have write like below	
		String a = new String("Good Morning");
		System.out.println(a);
		
		System.out.println("------------------------------------------------------------------------");
		// The below is how we represent String as variable, why default access modifier? Ans: default allowed inside main method
		String s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias";
		System.out.println(s);
		
		System.out.println("------------------------------------------------------------------------");
		// The Java String class length() method finds the length of a string.(important)
		System.out.println("The length of the String is: " + s.length());
		
		// The java string toUpperCase() method returns the string in upper case letter.
		System.out.println("------------------------------------------------------------------------");
		System.out.println(s.toUpperCase());
		System.out.println(s); // String is Immutable [unchangeable] that's why it's value is not changed
		
		// The java string toLowerCase() method returns the string in lower case letter.
		System.out.println("------------------------------------------------------------------------");
		System.out.println(s.toLowerCase());
		
		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias";
		// charAt() -- Returns the character value at the specified index.
		// The index number starts from 0 and goes to n-1, where n is the length of the string. 
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("The character at a specific position(0): " + s.charAt(0));
		System.out.println("The character at a specific position(10): " + s.charAt(10));
		System.out.println("The character at a specific position(94): " + s.charAt(94));
		System.out.println("The character at a specific position(95): " + s.charAt(95));
		// System.out.println("The character at a specific position(96): " + s.charAt(96));
		// will show "StringIndexOutOfBoundsException" -- Interview Question
		
		// Returns the index within this string of the first occurrence of the specified substring.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("The index of 'dolor' word is in : " + s.indexOf("dolor"));
		System.out.println("The index of 'Dolor' word is in : " + s.indexOf("Dolor")); // case sensitive
		System.out.println("The index of 'maiores nemo' sentence is in : " + s.indexOf("maiores nemo")); 
		System.out.println("The index of 'pariatur nulla?' sentence is in : " + s.indexOf("pariatur nulla?")); // Absent
	
		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias";
		
		// The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("The character 'L' is, at the position of: " + s.indexOf('L')); // String indexing starts from 0
		System.out.println("The character 'V' is, at the position of: " + s.indexOf('V')); 
		System.out.println("The character 'l' is, at the position of: " + s.indexOf('l')); // case sensitive, 
		System.out.println("The character 'r' is, at the position of: " + s.indexOf('r')); // if present more than one, the first own is recognized
		System.out.println("The character '.' is, at the position of: " + s.indexOf('.')); // character
		System.out.println("The character ' ' is, at the position of: " + s.indexOf(' ')); // white space
		System.out.println("The character 'x' is, at the position of: " + s.indexOf('x')); // if any character is absent, it shows -1.

		// last occurrence of a character by lastIndexOf() (important interview question)
		// The Java String class lastIndexOf() method returns the last index of the given character value or substring.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("The first 'r' character is - at the position of: " + s.indexOf('r')); 
		System.out.println("The last 'r' character is - at the position of: " + s.lastIndexOf('r')); 
		System.out.println("The last 'dolor' word is - at the position of: " + s.lastIndexOf("dolor")); 
		
		System.out.println("\n----------------------------------- Tough 1 -------------------------------------");
		// To know the position of the repetitive character in which index we follow
		// below formula:
		// s.indexOf('a', s.indexOf('a')+1)) [interview]
		// First occurrence
		System.out.println("The first 'r' character is - at the position of: " + s.indexOf('r'));
		
		// Second occurrence, Interview question
		System.out.println("The second 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r')+1));
		// Third occurrence
		System.out.println("The third 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r', s.indexOf('r')+2)+1));
				
		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas tempora ebitis maiores nemo modi! Alias";
		// The java string substring() method returns a part of the string. needed for framework
		// this substring is important method
		// Returns a string that is a substring of the original string. The substring begins at the specified beginIndex and 
		// extends to the character at index (endIndex - 1). Please remember it, here upper limit is excluded
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.substring(65));
		System.out.println(s.substring(65, 75));
		
		// equals() method is used to compare Strings and return a boolean value, needed for framework
		// Returns 'true' if the given object represents a String equivalent to this string, 'false' otherwise
		System.out.println("\n------------------------------------------------------------------------");
		String s1 = "My name is John. ";
		String s2 = "My name is John. ";
		String s3 = "my name is john. ";
		String s4 = "MY NAME IS JOHN. ";
		System.out.println("Is s1 equal to s2? Ans: " + s1.equals(s2));
		System.out.println("Is s1 equal to s3? Ans: " + s1.equals(s3));
		System.out.println("Is s1 equal to s4? Ans: " + s1.equals(s4));
		
		System.out.println("\n------------------------------------------------------------------------");
		// == is used in int, int can't use equal()
		int i = 20;
		int j = 20;
		int k = 25;
		System.out.println(i==j);
		System.out.println(i==k);
		System.out.println(j==k);
		// equals() is not used for int type, used for String Type only
		
		// How about String
		// We can also use == equal to ---> to compare 2 string, but need to be careful for line 113
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s1==s2);
		System.out.println("Is it True? Ans: " + s1==s2); 
		// Why false? get it? because "xxxxxxx" + s1 ----> is concatenating and then comparing with s2
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		s1 = "My name is John. ";
		s2 = "My name is John. ";
		s3 = "my name is john. ";
		s4 = "MY NAME IS JOHN. ";
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s3.equals(s4)); // how we can solve that issue? one way below -
		// Using 2 String methods together. first convert them to upper or lower case, then compare
		System.out.println(s3.toUpperCase().equals(s4));
		System.out.println(s4.toLowerCase().equals(s3));
		
		System.out.println("\n------------------------------------------------------------------------");
		String s5 = "my Name is John. ";
		String s6 = "MY name IS JOHN. "; // here, name is not Upper case
		System.out.println(s5.toUpperCase().equals(s6)); // false
		System.out.println(s5.toUpperCase().equals(s6.toUpperCase()));
		System.out.println(s5.toLowerCase().equals(s6.toLowerCase()));
		
		s3 = "my Name is John. ";
		s4 = "MY NAME is JOHN. ";
		// Two strings are considered equal ignoring case if they are of the same length
		// and corresponding characters in the two strings are equal ignoring case.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s3.equals(s4)); // how that can be solved? one way below -
		System.out.println(s3.equalsIgnoreCase(s4)); // Important: needed for framework
		
		// Interview Question
		// The java string trim() method eliminates leading and trailing spaces. (interview question)
		// To avoid white space: trim() us used -- (it remove any leading and trailing whitespace)
		System.out.println("\n------------------------------------------------------------------------");
		String s7 = "         HelloWorld.        ";
		System.out.println("Before Trim: " + s7);
		System.out.println("After Trim: " + s7.trim());
		
		// can't remove white space Between Words
		System.out.println("\n------------------------------------------------------------------------");
		String s8 = "    Hello       World!    ";
		System.out.println("Before Trim: " + s8);
		System.out.println("After Trim: " + s8.trim()); // Please see solution at line 186
		
		// The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		// To replace we use replace() method
		// Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		// interview question
		System.out.println("\n------------------------------------------------------------------------");
		String s9 = "Good morning ma";
		System.out.println("Before replace: " + s9);
		System.out.println("After replacing by Character: " + s9.replace('m', 'M'));
		// Issue is, it will change the specific character everywhere
		System.out.println("After replacing by Character: " + s9.replace("ma", "Mom"));
		
		// replace() can't trim
		System.out.println("\n------------------------------------------------------------------------");
		String s10 = "      GooD    MoRning      ";
		System.out.println("Replacing can't move white space: " + s10.replace('D', 'd'));
		// We can use trim() and replace() together
		System.out.println("After triming and replacing: " + s10.trim().replace("D    MoRning", "d Morning"));
		
		System.out.println("\n------------------------------------------------------------------------");
		String s11 = "      Good    MoRning      ";
		System.out.println("Before replacing: " + s11);
		System.out.println("After replacing: " + s11.replaceAll("      Good    MoRning      ", "Good Morning"));
		System.out.println("After replacing: " + s11.replaceAll("      Good    MoRning      ", "Good Evening"));
		
		s8 = "    Hello       World.    ";
		System.out.println("After triming and replacing: " + s8.trim().replace("       ", " "));
		// or
		System.out.println("After triming and replacing: " + s8.trim().replace("       World.", " World!"));
		// or
		System.out.println("After replacing all: " + s8.replaceAll("    Hello       World.    ", "Hello World!"));
		
		// Other 3 examples of replaceAll()
		System.out.println("\n------------------------------------------------------------------------");
		String s12 = "Hello! Let's learn together";
		System.out.println("After replacing a word: " + s12.replace("Hello!", "Welcome to Java."));
		
		System.out.println("\n------------------------------------------------------------------------");
		String dateOfToday = "09/22/2024"; // very much used
		System.out.println("After replacing: " + dateOfToday.replace('/', '-'));
		
		s12 = "Hello! Let's learn together";
		// The java string replaceAll() method returns a string replacing all the
		// sequence of characters matching regex and replacement string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("Before replacing all: " + s12);
		System.out.println("After replacing all, the complete String is: " + s12.replaceAll(s12, "Hey Hey Captain!"));

		// regular way of concatenation
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("Hello" + " World!");
		System.out.println(s1 + s12);
		
		// Concatenation
		// The Java String class concat() method combines specified string at the end of
		// this string. It returns a combined string.
		System.out.println("\n------------------------------------------------------------------------");
		String s13 = "My name is ";
		String s14 = "Tofael";
		System.out.println(s13.concat(s14));
		
		System.out.println("\n------------------------------------------------------------------------");
		// Important
		// An Array is a collection of same data type
		// How to write an Array: first data type, then []  container, 
    	// then array name = data separated by comma inside the curly braces, ended up with semicolon
		// Arrays is a class to manipulate Array
		
		String [] allPresident = {"Joe Biden", "Donald Trump", "Barack Obama", "George Bush Jr", "Bill Clinton"}; 
		System.out.println(Arrays.toString(allPresident));
		
		// other Array example
		int [] age = {23, 54, 12, 66, 88, 23, 80, 43};
		char [] gender = {'M', 'M', 'M', 'F', 'M'};
		boolean [] fullTimeStudent = {true, true, false, true, false};
		
		System.out.println("\n----------------------------- Tough 2 : how to convert a String to a String Array-------------------------------------------");	
		// Tough: 2, will be used for Java coding challenge, very very important interview question + coding challenge
		// in short, split() method ---> convert a String to a String Type Array, comma separated word by word
		// the array of strings computed by splitting this string around matches of the given regular expression
    	String str1 = "Mr owl ate my metal worm";
    	String [] wordByWord = str1.split(" ");// There should be a "single space" in String
    	// System.out.println(wordByWord); // It will give us Array ID
    	// This will not show correct outcome, because "Arrays" class is needed for Array manipulation
		// Arrays is a class, need to import and used to manipulate Array. you can't print Array without the help of Arrays class
    	System.out.println(Arrays.toString(wordByWord));
    	
    	System.out.println("\n------------------------- Tough 3 : how to convert a String to a character Array -----------------------------------------------");	
		// Tough: 3, will be used for Java coding challenge, very very important interview question + coding challenge
		// we use toCharArray() method to create an Array from String [which is character type] 
		// comma separated character By Character
    	String str2 = "Mr owl ate my metal worm";	
    	char [] characterByCharacter = str2.toCharArray();
    	System.out.println(Arrays.toString(characterByCharacter));
    	
    	// Easy, needed for framework
		// The Java String class contains() method searches the sequence of characters in this string. This is used as method in many places
		System.out.println("\n ------------------------------------------------------------------------");
		String s15 = "How much you know about Java?";
		System.out.println(s15.contains("much"));
		System.out.println(s15.contains("Much")); // case sensitive
		System.out.println(s15.contains("How much y"));
		System.out.println(s15.contains("How much z"));
		System.out.println(s15.contains("about"));
		System.out.println(s15.contains("hello"));
		System.out.println(s15.contains("java?"));
		
		// Easy
		// The java string startsWith() method checks if this string starts with given prefix.
		System.out.println("\n ------------------------------------------------------------------------");
		String s16 = "java by Oracle";
		System.out.println(s16.startsWith("java"));
		System.out.println(s16.startsWith("Java"));
		
		// The Java String class endsWith() method checks if this string ends with a given suffix.
		System.out.println("\n ------------------------------------------------------------------------");
		System.out.println(s16.endsWith("e"));
		System.out.println(s16.endsWith("E")); 
		System.out.println(s16.endsWith("oraclE"));
		System.out.println(s16.endsWith("Oracle"));
		
		// used in framework
		// The Java String class isEmpty() method checks if the input string is empty or not.
		System.out.println("\n ------------------------------------------------------------------------");
		String s17 = "";
		String s18 = " "; // White space, not empty
		String s19 = "Java";
		System.out.println(s17.isEmpty());
		System.out.println(s18.isEmpty());
		System.out.println(s19.isEmpty());
		
		// Important Interview question
		// The java String.valueOf() method converts int type of values into string.
		// how to turn int, float etc. to String
		System.out.println("\n ------------------------------------------------------------------------");
		int age4 = 30;
		System.out.println(age4 + 10);
		String s20 = String.valueOf(age4); // formula, learned in Wrapper class how to convert a int to String
		System.out.println(s20);
		System.out.println(s20 + 10);
		
		// not important
		// compareTo() Compares two strings lexicographically. never used
		System.out.println("\n------------------------------------------------------------------------");		
		String s21 = "hello";
		String s22 = "meklo";
		String s23 = "hemlo";
		String s24 = "cat";
		String s25 = "hello";
		String s26 = "Hello"; // every character have a value based on ASCII Table, h=104, H=72
		System.out.println(s21.compareTo(s25));// 0 because both are equal
		System.out.println(s21.compareTo(s22)); // -5 because "h" is 5 times lower than "m"
		System.out.println(s21.compareTo(s23)); // -1 because "l" is 1 times lower than "m"
		System.out.println(s21.compareTo(s24)); // 2 because "f" is 2 times lower than "h"
		System.out.println(s21.compareTo(s26)); // 32, every character have a value based on ASCII Table, h=104, H=72
    	
		// Not Important
		System.out.println("------------------------------------------------------------------------\n");	
		// The String.join() method is a static method in the String class that concatenates one or more strings with a delimiter added between each String. 
		// This method joins the passed string with the delimiter passed to return a single string.
		String delimiter = "-";
        String result = String.join(delimiter, "Espresso", "is", "Good");
        System.out.println(result);
		
	}

}
