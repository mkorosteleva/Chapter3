public class EmployeeTest {

	public static void main(String[] args) {
		Employee account1 = new Employee ("Jane ", "Green", 50.00);
		Employee account2 = new Employee ("Mark ", "Blue", -60.00);
		
		
		System.out.printf("%s%s monthly salary is $%.2f%n",
				account1.getFirstName(), account1.getLastName(), account1.getMonthlySalary());
		
		System.out.printf("%s%s yearly salary is $%.2f%n", 
				account1.getFirstName(), account1.getLastName(), account1.getYearlySalary());
		
		System.out.printf("%s%s yearly salary + bonus $%.2f%n", 
				account1.getFirstName(), account1.getLastName(), account1.getBonus());
		
		System.out.printf("%s%s monthly salary is $%.2f%n",
				account2.getFirstName(), account2.getLastName(), account2.getMonthlySalary());
		
		System.out.printf("%s%s yearly salary is $%.2f%n", 
				account2.getFirstName(), account2.getLastName(), account2.getYearlySalary());
		
		System.out.printf("%s%s yearly salary + bonus $%.2f%n", 
				account2.getFirstName(), account2.getLastName(), account2.getBonus());

		
	}

}
