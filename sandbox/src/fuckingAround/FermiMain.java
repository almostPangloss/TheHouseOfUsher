package fuckingAround;

import java.util.Scanner;

public class FermiMain {

	public static void main(String[] args) {
		
		int doGame = 1;
		int quandoGame = 0;
		
		Scanner scan = new Scanner ( System.in );
		
		
		
		System.out.println("Would you like to play a game? 1 for yes, 0 for no");
		doGame = scan.nextInt();
		
		while ( doGame == 1) {
			
			FermiGame game = new FermiGame();
			//System.out.println(game.getAns());
			//System.out.println(game.toString());
			
			System.out.println("Let us begin. ");
			game.playRound();
			
			System.out.println("Again? 1 for yes, 0 for no");
			doGame = scan.nextInt();
			
			quandoGame++;
		}
		
		System.out.println("You played this many games: " + quandoGame);
		
		scan.close();
	}

}
