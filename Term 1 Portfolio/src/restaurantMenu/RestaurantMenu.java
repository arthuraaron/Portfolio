package restaurantMenu;
// Aaron Arthur, Xander Peacock, Jack Milner, Gabriel Carlile 9/18 Displays a restaurant menu

import java.util.Scanner;

public class RestaurantMenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Output Variables
		final double TAX_RATE = 0.047;
		double sub_total;
		double total;
		double tip_rate;
		double total_tip;
		
		//Input Variables
		double item1;
		double item2;
		double item3;
		
		// Print menu
		System.out.println("Welcome to Hell! \nMenu:");
		System.out.println("Pizza..........................$5.00");
		System.out.println("Cheese.........................$2.00");
		System.out.println("McFlurry.......................$1.50");
		System.out.println("Dog Meat.......................$20.00");
		System.out.println("Bucket of tears................$6.00");
		System.out.println("A good time....................$69.69");
		System.out.println("Maverick Merch.................$0.49");
		System.out.println("A salad........................$0.00");
		System.out.println("Indentured Servant.............$200.00");
		System.out.println("Coke...........................$300.00\n");
		
		
		// Get user input
		System.out.println("Enter the price of the item that you want to buy: ");
		item1 = input.nextDouble();
		System.out.println("Enter the price of the second item that you want to buy: ");
		item2 = input.nextDouble();
		System.out.println("Enter the price of the final item that you want to buy: ");
		item3 = input.nextDouble();
		
		// Create the sub total
		sub_total = item1 + item2 + item3;
		
		// Make tax rate (4.7% of tax)
		total = sub_total + (sub_total * TAX_RATE);
		
		// Ask for tip rate
		System.out.println("Enter your tip in percent: ");
		tip_rate = input.nextDouble();
		tip_rate/=100;
		total_tip = total*tip_rate;
		double tip_rounded = Math.round(total_tip * 100D) / 100D;
		
		
		// Round total and return bill to the user
		double total_rounded = Math.round(total * 100D) / 100D;
		
		// Print tip and total
		
		System.out.print("\nYour tip comes out to: $");
		System.out.printf("%.2f", tip_rounded);
		System.out.println("");
		
		System.out.print("Your bill comes out to: $");
		System.out.printf("%.2f", total_rounded);
		
		
	}
}
