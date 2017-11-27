
		
		public class EmployeeTest {
			public static void main(String[] args) {
				Employee account1 = new Employee("Jane ", "Green", 50.00);
			Employee account2 = new Employee("John ", "Blue", -7.53);

				// display initial Employee of each object
				System.out.printf("%s salary: $%.2f%n", account1.getName(), account1.getSalary());
				System.out.printf("%s salary: $%.2f%n%n", account2.getName(), account2.getSalary());

				System.out.printf("%s yearly salary: $%.2f%n", account1.getName(), account1.getYearlySalary());
				System.out.printf("%s raise: $%.2f%n", account1.getName(), account1.getRaise());
				

	}

}
