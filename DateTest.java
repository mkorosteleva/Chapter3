import java.util.Scanner;

public class DateTest {
public static void main(String[] args) {
		
		Date displayDate = new Date (0,0,0);
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter day date:");
		int date = input.nextInt();
		displayDate.setDay(date);
		
		System.out.print("Enter month:");
		int month = input.nextInt();
		displayDate.setMonth(month);
		
		System.out.print("Enter year:");
		int year = input.nextInt();
		displayDate.setYear(year);
		
		System.out.println();
		displayDate.displayDate();
		
		input.close();
}
}
