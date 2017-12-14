  /*
   * To make this more robust, I'd need to handle punctuation in the input text
   */

package textBook;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Enigma {
	
	public static void main(String[] args) {
		try (Scanner in = new Scanner ( System.in )) {
			String cont = "y";
			Rotor rotor1 = new Rotor ();
			while ( cont.equals("y")){
				System.out.println("Would you like to (e)ncrypt or (d)ecrypt?");
				String direction = in.nextLine();
				
				System.out.println("\nEnter text:");
				String input = in.nextLine();
				input.toLowerCase();
				
				if ( direction.equals("e") && Pattern.matches("[a-z]*", (CharSequence)input)){
					
					System.out.println(rotor1.encrypt(input));
					
					System.out.print("Would you like to continue, (y) / (n): ");
					cont = in.nextLine();
				} else if ( direction.equals("d") && Pattern.matches("[a-z]*", (CharSequence)input)){
					
					System.out.println(rotor1.decrypt(input));
					
					System.out.print("Would you like to continue, (y) / (n): ");
					cont = in.nextLine();
					
				} else {
					cont = "y";
				}
				

			}
		}
		
	}
}