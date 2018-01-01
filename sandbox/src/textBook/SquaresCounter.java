package textBook;


import java.util.Scanner;

public class SquaresCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num = 0;
		int cnt = 0;
		
		do {
			System.out.println("Enter a number greater than 10, please:");
			if ( scan.hasNextDouble()) {
				num = scan.nextDouble();
			} else {
				String garbage = scan.next();
				System.err.println("'" + garbage + "'");
			}
		} while ( num <= 10);
		
		while ( num > 1.01) {
			num = Math.sqrt(num);
			cnt++;
		}
		
		System.out.println(num + ", which took this many iterations: " + cnt);

	}

}
