import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		// display initial balance of each object
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);

		// deposit account1
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); // add to account1's balance

		// display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

		// withdraw account1
		System.out.print("Enter withdrawal amount for account1: "); // prompt
		double withdrawalAmount = input.nextDouble(); // obtain user input

		System.out.printf("%nwithdrawing %.2f from account1 balance%n%n", withdrawalAmount);
		account1.withdrawal(withdrawalAmount); // add to account1's balance

		// display balances for account1
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

		//////////////////////////////////////////////
		// display balances for account2
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		// deposit account2
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount); // add to account2's balance

		// display balances for account2
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		// withdraw account2
		System.out.print("Enter withdrawal amount for account2: "); // prompt
		withdrawalAmount = input.nextDouble(); // obtain user input

		System.out.printf("%nwithdrawing %.2f from account1 balance%n%n", withdrawalAmount);
		account2.withdrawal(withdrawalAmount); // remove from account2's balance

		// display balances for account2
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		input.close();

	} // end main
} // end class AccountTest
