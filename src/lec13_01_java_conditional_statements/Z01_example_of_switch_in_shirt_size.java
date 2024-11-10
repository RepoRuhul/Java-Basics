package lec13_01_java_conditional_statements;

public class Z01_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'p';
		
		switch(size) {		
		case 'S':
			System.out.println("Yes we have your SMALL size shirt");
			break;
			
		case 'M':
			System.out.println("Yes we have your MEDIUM size shirt");
			break;
		
		case 'L':
			System.out.println("Yes we have your LARGE size shirt");
			break;
		
		case 'X':
			System.out.println("Yes we have your EXTRA LARGE size shirt");
			break;
			
		default:
			System.out.println("Sorry! We don't have your " + size + " size Shirt");	
			break;		
		}
		// switch condition mostly used for Constant data type [Enum]
		// default will be executed when no condition match
		// break is not mandatory for default block/body	

	}

}
