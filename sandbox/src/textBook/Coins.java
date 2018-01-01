package textBook;


import java.text.NumberFormat;
import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q, d, n;
		System.out.print("Tell me how many quarters you've got > ");
		q = scan.nextInt();
		System.out.print("\nDimes, now, please > ");
		d = scan.nextInt();
		System.out.print("\nAnd nickles, please > ");
		n = scan.nextInt();
		
		double total = (q*.25)+(d*.10)+(n*.05);
		
		System.out.println(NumberFormat.getCurrencyInstance().format(total));
		
		System.out.println("Also, were that the radius of a circle, that circle would have an area of " 
		                   	+ (Math.PI * total * total) + 
		                   	" and a perimeter of "
							+ (Math.PI * 2 * total) + ".");

	}

}
