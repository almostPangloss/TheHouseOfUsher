package textBook;

import java.util.Scanner;

public class NumberGuess {
		
	public static void main ( String [] args ) {
		/*
		 * Generate a number between 1 and 10
		 * Ask for user guess
		 * Check that the guess is between 1 and 10 itself
		 * If they got it right, tell them
		 * If they didn't get it right but they were within 3, tell them, "close"
		 * If they weren't within 3, tell them, "Way off."
		 */
		
		int ans, guess;
		Scanner sc = new Scanner(System.in);
		
		ans = (int) (Math.random() * 10 + 1);
		
		System.out.println("What cha guess, between 1 and 10, inclusive?");
		guess = sc.nextInt();
		
		if (guess >= 0 && guess <= 10){
			if (guess == ans) {
				System.out.println("Nicely done, that was it.");
			} else if (Math.abs(ans - guess) <= 3){
				System.out.print("Alrighty, close, close. It was actually " + ans);
			} else {
				System.out.print("Were you even trying? You guessed " + 
						guess + " and the actual answer was " + ans);
			}
		} else {
			System.out.println("So... the directions seemed hard to you, did they?");
		}
		
		sc.close();
	}

}
