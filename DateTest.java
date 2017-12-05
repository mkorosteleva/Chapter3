import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {

		int date = 0;
		int month = 0;
		int year = 0;
		Date displayDate = new Date(date, month, year);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter day date:");
		date = input.nextInt();
		displayDate.setDay(date);

		System.out.print("Enter month:");
		month = input.nextInt();
		displayDate.setMonth(month);

		System.out.print("Enter year:");
		year = input.nextInt();
		displayDate.setYear(year);

		System.out.println();
		displayDate.displayDate();

		input.close();
	}
}
