import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Invoice invoice = new Invoice(requestInputString("Enter Item Number: ", input),
				requestInputString("Enter Item Description: ", input), requestInputInt("Enter Item Quantity ", input),
				requestInputDouble("Enter Item Price: ", input));

		System.out.printf("Invoice Amount %s", invoice.getInvoiceAmount());

	}

	public static String requestInputString(String s, Scanner input) {
		System.out.print(s);
		return input.nextLine();
	}

	public static int requestInputInt(String s, Scanner input) {
		System.out.print(s);
		return input.nextInt();

	}

	public static double requestInputDouble(String s, Scanner input) {
		System.out.print(s);
		return input.nextDouble();

	}

}
