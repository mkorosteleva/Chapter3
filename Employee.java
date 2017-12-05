public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String firstName, String lastName, double monthlySalary) {
		setFirstName (firstName);
		setLastName (lastName);
		setMonthlySalary (monthlySalary);

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary>0) {
		this.monthlySalary = monthlySalary;
		}
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public double getBonus() {
				return (monthlySalary*12) + (monthlySalary*12*0.1);
			}
	
	public double getYearlySalary() {
		return monthlySalary*12;
	}


	
}
