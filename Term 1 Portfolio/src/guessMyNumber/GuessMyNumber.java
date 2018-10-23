package guessMyNumber;

import java.util.Scanner;

// Aaron Arthur 10/18 Number guessing game

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Initialize some variables
		int initLives = 10;
		int points = 100;
		int maxNum = 100;
		int wager = 0;
		
		// Create menu for program
		int choice = 0;
		while (choice != 4) {
		System.out.print("Welcome to the Guess my Number Game!\n"
				+ "1: Play game\n"
				+ "2: Options\n"
				+ "3: Credits\n"
				+ "4: Exit\n"
				+ "What do you want to do?: ");
		choice = input.nextInt();
		
		// Open up a multi-way if statement for each choice
		if (choice == 1) {
			System.out.println("\nYou have decided to play the game. ");
			
			// Generate random number
			int randNum = (int) (Math.random() * maxNum);
			
			
			// Start betting
			int betCondition = 0;
			while (betCondition == 0) {
				System.out.println("Points: " + points);
				System.out.print("How many points would you like to wager?: ");
				wager = input.nextInt();
				if (points >= wager) {
					points -= wager;
					System.out.println("You have wagered " + wager + " points.\n");
					betCondition = 1;
				}
				else {
					System.out.println("You do not have enough points. Please try again.\n");
					
				}
				
			}
			
			// Start while loop
			int lives = initLives;
			while (lives > 0 && points >= 0) {

				// Print amount of lives and money
				System.out.println("Lives: " + lives);
				System.out.println("Points: " + points);
				
				// Ask user for input
				System.out.print("Enter your guess: ");
				int userNum = input.nextInt();
				
				// Compare user number to random number
				if (userNum == randNum) {
					System.out.println("\nYou have guessed correctly!");
					if (lives >= 5) {
						points += (wager *  6);
					}
					else if (lives == 4) {
						points += (wager * 5);
						
					}
					else if (lives == 3) {
						points += (wager * 4);
						
					}
					else if (lives == 2) {
						points += (wager * 3);
						
					}
					else if (lives == 1) {
						points += (wager * 2);
						
					}
					
					choice = 0;
					break;
					
				}
				else if (userNum < randNum) {
					System.out.println("\nYou guessed too low." );
					lives -= 1;
					if (lives == 0) {
						System.out.println("You ran out of lives. ");
					}
					
				}
				else if (userNum > randNum) {
					System.out.println("\nYou guessed too high." );
					lives -= 1;
					if (lives == 0) {
						System.out.println("You ran out of lives. ");
					}
					
				}
			
			}	
			
		}
		else if (choice == 2) {
			int optionsChoice = 0;
			while (optionsChoice != 4) {
				System.out.print("\nOptions:\n"
						+ "1: Change range of number\n"
						+ "2: Change number of lives\n"
						+ "3: Change initial points\n"
						+ "4: Return to menu\n"
						+ "What do you want to do?: ");
				optionsChoice = input.nextInt();
				
				// Enter an if statement for each option
				if (optionsChoice == 1) {
					// Change range of number
					System.out.println("\nThe current range of the random number is 1-"+ maxNum);
					System.out.print("What would you like the new maximum to be?: ");
					maxNum = input.nextInt();
					
				}
				else if (optionsChoice == 2) {
					// Change number of lives
					System.out.println("\nThe current number of lives is " + initLives);
					System.out.print("What would you like the new number to be?: ");
					initLives = input.nextInt();
					
				}
				else if (optionsChoice == 3) {
					// Change initial points
					System.out.println("\nThe initial points is set to " + points);
					System.out.print("What would you like the new number to be?: ");
					points = input.nextInt();
					
				}
				else if (optionsChoice == 4) {
					// Return to menu
					System.out.println();
					
				}
				else {
					// Invalid response
					System.out.println("\nYou have entered an invalid number. Please try again.");
				}
			
			}
			
		}
		else if (choice == 3) {
			System.out.println("\nCredits: \nAll programming done by: Aaron Arthur\n");
			System.out.print("1: Return to main menu\nWhat do you want to do?: ");
			int arbitrary = input.nextInt();
			System.out.println();
			
			
		}
		else if (choice == 4) {
			System.out.println("\nExiting program. ");
			System.exit(0);
			
		}
		else {
			System.out.println("\nYour input was invalid, please try again.");
			
		}
		
		}
		
	}

}
