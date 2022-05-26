import java.util.Scanner;


public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Create a random number for the user to guess
		int targetNum = (int)(Math.random() * 100 + 1);
		//System.out.println(targetNum);
		
		int guess = 0;
		int numGuess = 0;
		while (guess != targetNum) {
			System.out.print("Guess a number between 1 and 100: ");
			guess = scan.nextInt();
			if (guess < targetNum) {
				System.out.println(guess + " is too low. Try again.");
			} else if (guess > targetNum){
				System.out.println(guess + " is too high. Try again.");
			}
			numGuess ++;
		}
		
		System.out.println("Good Job! It took you " + numGuess + " trys!");

	}

}
