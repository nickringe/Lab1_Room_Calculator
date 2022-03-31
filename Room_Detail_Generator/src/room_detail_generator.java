import java.util.Scanner;
import java.text.DecimalFormat;

public class room_detail_generator {

	public static void main(String[] args) {
		char cont;
		System.out.println("Welcome to Nick's Room Detail Generator!");
		System.out.println("");
		do {
			DecimalFormat df = new DecimalFormat("0.00");
			
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter Length in feet: ");
			double length = scnr.nextDouble();
			System.out.println("Enter Width in feet: ");
			double width = scnr.nextDouble();
			System.out.println("Enter Height in feet: ");
			double height = scnr.nextDouble();
			System.out.println("Area: " + df.format(length * width) + " square feet");
			System.out.println("Perimeter: " + (length + length + width + width) + " feet");
			System.out.println("Volume: " + df.format(length * width * height) + " cubic feet");
			System.out.println("Would you like to continue? y/n: ");

			Scanner scnr2 = new Scanner(System.in);
			cont = scnr2.next().charAt(0);

		} while (cont == 'Y' || cont == 'y');

		System.out.println("Goodbye!");

	}
}
