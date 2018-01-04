package fuckingAround;

import java.util.Arrays;
import java.util.Scanner;

public class FermiGame {
	
	private int ans1, ans2, ans3, guesses;
	private int[] ans;
	
	public FermiGame() {
		ans = new int[] {0,0,0};
		ans[0] = (int)(Math.random()*10);
		ans[1] = ans[0];
		while (ans[1] == ans[0]) {
//			System.out.println("Recaluculating ans2");
			ans[1] = (int)(Math.random()*10);
		}
		ans[2] = ans[0];
		while (ans[2] == ans[0] || ans[2] == ans[1]) {
//			System.out.println("Recalculating ans3. Here's one " + ans[0] 
//					+ ", and here's two " + ans[1] 
//					+ ", and here's three, before the retry: " + ans[2]);
			ans[2] = (int)(Math.random()*10);
//			System.out.println(ans[2]);
		}
		
		guesses = 10;
		System.out.println("Answers assigned randomly, between 0 and 9, inclusive, and guesses set to " 
				+ guesses + ".");
	}
	
	/*  Pre array version of creation.
	public FermiGame() { 
		ans1 = (int)(Math.random()*10);
		ans2 =  ans1;
		while (ans2 == ans1) {
			System.out.println("Recaluculating ans2");
			ans2 = (int)(Math.random()*10);
		}
		ans3 = ans1;
		while (ans3 == ans1 || ans3 == ans2) {
			System.out.println("Recalculating ans3. Here's one " + ans1 
					+ ", and here's two " + ans2 
					+ ", and here's three, before the retry: " + ans3);
			ans3 = (int)(Math.random()*10);
			System.out.println(ans3);
		}
		guesses = 10;
		System.out.println("Answers assigned randomly, between 0 and 9, inclusive, and guesses set to 10.");
	}
	*/
	
	public FermiGame(int startAns1, int startAns2, int startAns3) {
		ans1 = startAns1;
		ans2 = startAns2;
		ans3 = startAns3;
		guesses = 10;
		System.out.println("Answers set by user, guesses left at 10.");
	}
	
	public FermiGame(int startAns1, int startAns2, int startAns3, int startGuesses) {
		ans1 = startAns1;
		ans2 = startAns2;
		ans3 = startAns3;
		guesses = startGuesses;
		System.out.println("Answers and number of guesses set by user.");
	}
	
	public String playRound() {
		String result = "";
		int[] picks = {0,0,0};

		try (Scanner scan = new Scanner ( System.in );){
			
			int fermis = 0, picos = 0, nanos = 0;
			
			while (guesses > 0 && fermis < 3) {
				fermis = 0;
				picos = 0;
				nanos = 0;
				result = "";
				
				System.out.print("First pick: ");
				picks[0] = scan.nextInt();
				System.out.print("Second pick: ");
				picks[1] = scan.nextInt();
				System.out.print("Third pick: ");
				picks[2] = scan.nextInt();
								
				// Trying to get array based comparison working. Again need .contains
				// as in: if (ans.contains (picks[i]))
				// Hmm, I'm going to try thinking of it from the angle of the 
				// words, instead of from the values.
				
				for (int i = 0; i < 3; i++) {
					if (picks[i] == ans[i]) {
						fermis++;
					} else if ((picks[i] == ans[0]) || (picks[i] == ans[1]) || (picks[i] == ans[2]) ){
						picos++;
					} else {
						nanos++;
					}
				}
				
				for (int i = 0; i < fermis; i++) {
					result += "Fermi ";
				}
				for (int i = 0; i < picos; i++) {
					result += "Pico ";
				}
				for (int i = 0; i < nanos; i++) {
					result += "Nano ";
				}
				
				
				guesses--;
				
				System.out.println(result);
				//return result;  //Placement of return statement not good. Does Return break loop?
								// But you need to let them know each time, so they adjust guesses
								// for next round within same game, right?
			}
			
			if (fermis == 3){
				System.out.println("Congrats");
			} else {
				System.out.println("Sorry");
			}
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof FermiGame)) {
			return false;
		} else {
			FermiGame fg = (FermiGame) o;
			if ( 	ans1 == fg.ans1 &&
					ans2 == fg.ans2 &&
					ans3 == fg.ans3	&&
					guesses == fg.guesses) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return (    "Answer 1: " + ans[0]
				+ ", Answer 2: " + ans[1]
				+ ", Answer 3: " + ans[2]
				+ ", Guesses:  " + guesses);
	}
	
	public String getAns() {
		return Arrays.toString(ans);
	}
	public int getGuesses() {
		return guesses;
	}
}
