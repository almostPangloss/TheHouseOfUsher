package textBook;


import java.util.Scanner;

public class ConvertToBinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		int entry = -1;
		
		do
		{
			System.out.print("A binary number, please: ");
			if (scan.hasNextInt())
			{
				//entry = Integer.parseInt(scan.nextLine(), 2);  //Pulls in the String of the whole line, 
																 //then flips it in radix2, i.e. binary
				
				String[] typed = scan.nextLine().split("");
				
				for ( int i = 0; i < (typed.length - 1); i++)
				{
					if (typed[i].equals(typed[i+1]))
					{
						typed[i+1] = "0";
					} else
					{
						typed[i+1] = "1";
					}
					
					entry = Integer.parseInt(typed[i+1]);
				}
				
			} else
			{
				@SuppressWarnings("unused")
				String garbage = scan.nextLine();
			}
		} while (entry == -1);
		
		System.out.println(entry);
		
		scan.close();
		
	}

}
