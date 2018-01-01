package textBook;


import java.util.Scanner;

public class isCommercialWebsite {
	
	public static void main (String args[])
	{
		Scanner scanner = new Scanner ( System.in );
		String word = "";
		int numberOfComs = 0;
		
		do 
		{
			
			word = scanner.nextLine();
			
			if (word.contains(".com"))
					{
						numberOfComs += 1;
					}
			
		} while ( !(word.contentEquals("stop")));
		
		System.out.println("The number of addresses entered containing .com is " + numberOfComs);
		
	}

}
