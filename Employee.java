
public class Employee {

	private String firstName; // instance variable
	private String lastName; // instance variable
	private String name;
	private double salary; // instance variable
	private double yearlySalary;
	private double raise;

	// Employee constructor
	public Employee(String firstName, String lastName, double salary) {
		this.salary = salary; // assign salary to instance variable

		// validate that the salary is greater than 0.0; if it's not,
		// instance variable salary keeps its default initial value of 0.0
		if (salary > 0.0) // if the salary is valid
			this.salary = salary; // assign it to instance variable balance
	}

	// calculate yearly salary

	public void yearlySalary(double yearlySalary) {

		yearlySalary = salary * 12; // yearly salary
	}
	public void raise(double raise) {

		raise = yearlySalary + yearlySalary * 0.1;
	}
	
	
	public double getRaise() {
		//this.salary = salary;
		return raise;
	}
	public double getSalary() {
		//this.salary = salary;
		return salary;
	}
	public double getYearlySalary() {
		//this.salary = salary;
		return yearlySalary;
	}	
	
	public void setName(String name) {
		this.name = name;
	}	
public String getName() {
	name = firstName + lastName;
	return name;
}

} // end class Account
