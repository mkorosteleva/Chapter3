package chapter3;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee account1 = new Employee ("Jane ", "Green", 50.00);
		Employee account2 = new Employee ("Mark ", "Blue", -60.00);
		
		if (account1.getMonthlySalary()<=0) {
			System.out.printf("Salary value for %s%s is not valid",account1.getFirstName(), account1.getLastName() );
		}
		else {
		System.out.printf("%s%s monthly salary is $%.2f%n",
				account1.getFirstName(), account1.getLastName(), account1.getMonthlySalary());
		
		System.out.printf("%s%s yearly salary is $%.2f%n", 
				account1.getFirstName(), account1.getLastName(), account1.getMonthlySalary()*12);
		
		System.out.printf("%s%s yearly salary + bonus $%.2f%n", 
				account1.getFirstName(), account1.getLastName(), ((account1.getMonthlySalary()*12) + (account1.getMonthlySalary()*12)*0.1));
		}
		
		
		if (account2.getMonthlySalary()<=0) {
			System.out.printf("Salary value for %s%s is not valid",account2.getFirstName(), account2.getLastName() );
		}
		else {
		System.out.printf("%s%s monthly salary is $%.2f%n",
				account2.getFirstName(), account2.getLastName(), account2.getMonthlySalary());
		
		System.out.printf("%s%s yearly salary is $%.2f%n", 
				account2.getFirstName(), account2.getLastName(), account2.getMonthlySalary()*12);
		
		System.out.printf("%s%s yearly salary + bonus $%.2f%n", 
				account2.getFirstName(), account2.getLastName(), ((account2.getMonthlySalary()*12) + (account2.getMonthlySalary()*12)*0.1));

		}
	}

}
