package chapter3;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice = new Invoice("", "", 0, 0.0);
		String number;
		String description;
		int qty;
		double price;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Item Number: ");
		number = input.nextLine();
		invoice.setNumber(number);

		System.out.print("Enter Item Description: ");
		description = input.nextLine();
		invoice.setDescription(description);

		System.out.print("Enter Item Quantity: ");
		qty = input.nextInt();
		if (qty > 0) {
			invoice.setQty(qty);
		}

		System.out.print("Enter Item Price: ");
		price = input.nextDouble();
		invoice.setPrice(price);

		System.out.printf("Invoice Amount %s", invoice.getInvoiceAmount());

		input.close();
	}

}
