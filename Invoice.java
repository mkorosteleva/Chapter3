public class Invoice {
	private String number;
	private String description;
	private int qty;
	private double price;

	public Invoice(String number, String description, int qty, double price) {
		setNumber(number);
		setDescription(description);
		if (qty > 0) {
			setQty(qty);
		}
		if (price > 0) {
			setPrice(price);
		}
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setQty(int qty) {
		if (qty > 0) {
			this.qty = qty;
		}
	}

	public int getQty() {
		// returns quantity
		return qty;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public double getPrice() {
		return price;
	}

	public double getInvoiceAmount() {
		double invoiceAmount = price * qty;
		return invoiceAmount;

	}

}
