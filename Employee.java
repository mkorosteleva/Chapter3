public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;
	private double bonus;

	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;

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
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public double getSalaryBonus() {
		bonus = (monthlySalary * 12) + (monthlySalary * 12 * 0.1);
		return bonus;
	}

}
