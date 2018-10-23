package rpsGame;

// Aaron Arthur 10/18 Rock Paper Scissors

import java.util.Scanner;

public class RPSGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Generate number
		int comSign = (int) (Math.random() * 3);
		
		// Get input from user
		System.out.print("Welcome to rock, paper, scissors! \n0: Rock \n1: Paper \n2: Scissors \nEnter your sign: ");
		int userSign = input.nextInt();
		
		if (userSign == 0) { 
			if (comSign == 0) {
				System.out.println("Rock vs. Rock. It is a draw! ");
			}
			else if (comSign == 1) {
				System.out.println("Rock vs. Paper. You lose! ");
			}
			else if (comSign == 2) {
				System.out.println("Rock vs. Scissors. You win! ");
			}
			
		}
		else if (userSign == 1) {
			if (comSign == 0) {
				System.out.println("Paper vs. Rock. You win! ");
			}
			else if (comSign == 1) {
				System.out.println("Paper vs. Paper. It is a draw! ");
			}
			else if (comSign == 2) {
				System.out.println("Paper vs. Scissors. You lose! ");
			}
			
		}
		else if (userSign == 2) {
			if (comSign == 0) {
				System.out.println("Scissors vs. Rock. You lose! ");
			}
			else if (comSign == 1) {
				System.out.println("Scissors vs. Paper. You win! ");
			}
			else if (comSign == 2) {
				System.out.println("Scissors vs. Scissors. It is a draw! ");
			}
			
		}
		else {
			System.out.println("The number you entered is invalid. ");
		}
		
		
		
	}

}
