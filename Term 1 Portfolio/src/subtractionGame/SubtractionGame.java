package subtractionGame;

// Aaron Arthur 10/18 A subtraction game

import java.util.Scanner;


public class SubtractionGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Put the whole thing into a loop
		
		int score = 0;
		int loop = 0;
		while (loop == 0) {
			
			// Initialize variables and set them to their values
			
			int initNum1;
			initNum1 = (int) (Math.random() * 10);
			
			int initNum2; 
			initNum2 = (int) (Math.random() * 10);
			
			int num1;
			int num2;
			
			// Make sure that the first number is greater than the second number
			
			if (initNum1 > initNum2) {
				num1 = initNum1;
				num2 = initNum2;
			}
			else {
				num1 = initNum2;
				num2 = initNum1;
			}
			
			// Initialize correct answer and user answer
			
			int correctAnswer = num1 - num2;
			int userAnswer;
			
			
			// Display question to user
			
			System.out.print("What is " + num1 + " - " + num2 + ": ");
			userAnswer = input.nextInt();
			
			// Output the correct answer
			
			if (userAnswer == correctAnswer) {
				System.out.println("Correct!");
				score += 1;
				System.out.println("Score: " + score + "\n");
			}
			else {
				System.out.println("Incorrect! The correct answer is: " + correctAnswer);
				System.out.println("Score: " + score + "\n");
			}
			
		}
		
	}
			
}
