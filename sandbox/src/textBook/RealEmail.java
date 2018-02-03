package textBook;


import java.util.Scanner;
import java.util.regex.Pattern;

public class RealEmail {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner ( System.in);
				
		int ats = 0;
		do 
		{
			ats = 0;
			System.out.print("ID, please: ");
			String word = scan.nextLine();
			for ( int i = 0; i < word.length(); i++)
			{
				if ( Pattern.matches("\\d", String.valueOf(word.charAt(i))) )
				{
					ats += 1;
				}
			}			
		} while ( !(ats == 2) );
		
		System.out.println("Accepted");
	
		scan.close();
	}

}
