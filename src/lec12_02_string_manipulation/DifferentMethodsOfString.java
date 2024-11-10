package lec12_02_string_manipulation;

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
		
		

	}

}
