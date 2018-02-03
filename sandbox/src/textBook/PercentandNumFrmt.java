package textBook;


import java.text.NumberFormat;
import java.util.Scanner;

public class PercentandNumFrmt {
	
		public static void main(String[] args) {
			Scanner sn = new Scanner(System.in);
			NumberFormat frmt = NumberFormat.getCurrencyInstance();
			
			System.out.println("How much did you invest?");
			double princ = sn.nextDouble();
			
			System.out.println("\nDude, interest rate?");		
			double rate = sn.nextDouble();
			
			System.out.println("\n\nCoolios. Here's how that's guna look:\n5 Years: " + 
					frmt.format(princ * Math.pow((1 + rate), 5)) +
					"\n10 years: " + frmt.format(princ * Math.pow((1 + rate), 10)) +
					"\n20 years: " + frmt.format(princ * Math.pow((1 + rate), 20)) );

			sn.close();
	}

}
