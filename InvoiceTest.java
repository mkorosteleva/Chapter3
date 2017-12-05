import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		String number = null;
		String description = null;
		int qty = 0;
		double price = 0.00;
		Invoice invoice = new Invoice(number, description, qty, price);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Item Number: ");
		number = input.nextLine();
		invoice.setNumber(number);

		System.out.print("Enter Item Description: ");
		description = input.nextLine();
		invoice.setDescription(description);

		System.out.print("Enter Item Quantity: ");
		qty = input.nextInt();
		invoice.setQty(qty);

		System.out.print("Enter Item Price: ");
		price = input.nextDouble();
		invoice.setPrice(price);

		System.out.printf("Invoice Amount %s", invoice.getInvoiceAmount());

		input.close();
	}

}
