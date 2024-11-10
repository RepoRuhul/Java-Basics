package lec04_01_java_constructor;

public class Employee {
	// variables declared/defined
	public String empName;
    public int empId;
    public char empGender;
    public boolean fullTimeEmployee;
	
	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default constructor and one or (more than one) parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// You shouldn't write a parameterized constructor without writing a default constructor. It's a norm.

	// default Constructor declared	
	public Employee() {
		System.out.println("I am a Constructor from Employee Class");
	}

	// parameterized Constructor declared -01
	// how to create --> select variable ---> right click --> source ---> Generate Constructor using fields --> choose insertion point
	// here in line 26, empName is called parameter, in line 5, that is variable
	// 'this' keyword represents an instance [an example or single occurrence of something.] of the class [Important interview question]
	// 'this' keyword can be used to access class methods and variables.
	public Employee(String empName) {
		this.empName = empName;
		System.out.println("Employee Name: " + empName);
	}

	// Parameterized constructor declared -02
	// here in line 34, empName is called parameter, in line 6, that is variable, same for others
	// Here empName, empId, empGender, fullTimeEmployee are called parameter, and they have their own data type
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {
		super(); // no need here, you can delete or keep
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + empGender + ", Full Time Employee: " + fullTimeEmployee);
	}
	
	// Parameterized constructor declared -03
	// same name, same number of parameter, but the sequence present inside () is different
	public Employee(char empGender, String empName, int empId, boolean fullTimeEmployee) {
		this.empGender = empGender;
		this.empName = empName;
		this.empId = empId;		
		this.fullTimeEmployee = fullTimeEmployee;
		// The below outcome [syso] is same as line 40, it doesn't matter, what is the sequence present inside syso
		// matter is -->  how parameters are written, and arguments are presented at the same sequence
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + empGender + ", Full Time Employee: " + fullTimeEmployee);
	}

	// Parameterized constructor declared -04
	public Employee(String empName, int empId, char empGender) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		// INSIDE SYSOUT, one extra parameter/variable present
		// default value of variable will print
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + empGender + ", Full Time Employee: " + fullTimeEmployee);
		
	}

	// Parameterized constructor declared -05
	// Here parameters are different in name [not same as variable], no issue, see line 67
	// There is no relation between parameters with sysout outcome
	public Employee(String employeeName, int employeeId) {
		this.empName = employeeName;
		this.empId = employeeId;
		// we can use /n, /t inside String
		System.out.println("\tEmployee ID: " + employeeId + "\n\tEmployee Name: " + employeeName);
	}
	
	

}
