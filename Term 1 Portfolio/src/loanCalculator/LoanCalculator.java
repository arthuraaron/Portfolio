package loanCalculator;

// Aaron Arthur 9/18 Loan Calculator

import java.util.Scanner;

public class LoanCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input variables
		double amount;
		double rate;
		double time;
		
		// Output variables
		double payment;
		double total;
		
		// User input
		System.out.println("Welcome to the loan calculator!");
		
		System.out.println("Enter the loan amount: ");
		amount = input.nextDouble();
		
		System.out.println("Enter the interest rate as a percent: ");
		rate = input.nextDouble();
		rate /= 100;
		
		System.out.println("Enter the time in years: ");
		time = input.nextDouble();
		time /= 12;
		
		// Calculations
		payment = (amount * rate) / (1-1 / Math.pow(1 + rate, time * 12));
		double monthlyPayment = payment / 12;
		
		total = payment * 12 * time;
		
		// Display payment amounts and total amount
		System.out.println("Your monthly payment is: "+monthlyPayment);
		System.out.println("Your total payment is: "+total);

	}

}
