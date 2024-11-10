package lec04_02_java_constructor_final;

public class Employee {
	// variables declared/defined
	// Class variable or Global variable (based on where they are present)
	public String empName;
    public int empId;
    public char empGender;
    public boolean fullTimeEmployee;
	
	// default Constructor declared	
	public Employee() {
		System.out.println("------ Employee's Information is below ------");
	}

	// parameterized Constructor declared	
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + "\nEmployee ID: " + empId + 
				"\nEmployee Gender: " + empGender + "\nFull Time Employee: " + fullTimeEmployee);
	}
		
}
