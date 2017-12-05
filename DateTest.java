import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Date displayDate = new Date(requestInput("Enter day date:", input), requestInput("Enter month:", input),
				requestInput("Enter year:", input));

		displayDate.displayDate();
	}

	public static int requestInput(String s, Scanner input) {
		System.out.print(s);
		return input.nextInt();

	}
}
