
import java.util.Scanner;

public class TableofPowers {
	private static int intergerNext;

	public static void main(String args[]) {
		// Declare Scanner
		Scanner sc = new Scanner(System.in);

		// Welcome
		System.out.println("Learn Your Squares and Cubes!");

		System.out.println("Enter and Integer");
		int integerNext = sc.nextInt();

		// Declare Number, Squared, Cubed
		System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
		System.out.println("======" + "  " + "======" + "  " + "======");

		System.out.print(integerNext);

		int square = (integerNext * integerNext);
		System.out.print("      " + square);

		int cube = (integerNext * integerNext * integerNext);
		System.out.print("     " + cube);
		System.out.println();

		// Create Scanner for "Choice"

		// Prompts the user to continue
		{
			System.out.println("Would you like to continue?");

			String choice = sc.next();
			// Prompts user to continue if desired
			if (choice.equalsIgnoreCase("Yes")) {

				System.out.println("Enter another Integer");

			} else {
				System.out.println("See you next time!");
			}

		}
	}
}
