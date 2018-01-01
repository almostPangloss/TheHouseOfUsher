package textBook;


import java.util.Scanner;

public class Ats {
	
	public static void main ( String [] args ) {
		
		Scanner sc = new Scanner(System.in);
		String word ="";
		
		System.out.println("Enter a word containing this symbol: @\n");
		word = sc.nextLine();
		
		while ( !word.contains("@")) {
			System.out.println("Again, I guess. Shouldn't be hard, really.");
			word = sc.nextLine();
		}
		
		System.out.println(word);
		
		sc.close();
	}

}
