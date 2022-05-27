/*
 * Creator: Elizabeth Sloan
 * Credit: Learn Java the Easy Way (Bryson Payne)
 * 
 * This is a simple number guessing game. It was created by following a tutorial.
 * I have kept most of the content from the book, but I have modified the layout
 * slightly.
 */

import java.util.Scanner;

public class HiLo {

	public static String playAgain = "";
	public static int min = 1;
	public static int max = 100;
	public static int mathMax = max + 1; //to make max inclusive
	public static int range = mathMax-min;
	public static int guess = 0;
	public static int numGuess = 0;

	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		do {
			int targetNum = (int)(Math.random() * range + min);
			//System.out.println(targetNum);

			while (guess != targetNum) {
				System.out.print("Guess a number between " + min + " and " + max + ": ");
				
				while (!scan.hasNextInt()) {
					System.out.print("Please enter a whole number.");
					scan.next();
				}
				
				guess = scan.nextInt();
				
				if (guess < targetNum) {
					System.out.println(guess + " is too low. Try again.");
				} else if (guess > targetNum){
					System.out.println(guess + " is too high. Try again.");
				}
				numGuess ++;
			}

			System.out.println("Good Job! It took you " + numGuess + " trys!");
			numGuess = 0;
			System.out.println("Would you like to play again? y/n");
			playAgain = scan.next();

		} while (playAgain.equalsIgnoreCase("y"));
		
		System.out.println("Thanks for playing! Goodbye.");
		scan.close();
	}
}

