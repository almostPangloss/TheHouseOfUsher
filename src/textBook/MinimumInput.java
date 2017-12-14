package textBook;

import java.util.Scanner;

public class MinimumInput {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int a = 0, b = 0, smallest = 0;
			System.out.print("A number, please > ");
			a = scanner.nextInt();
			for (int i = 0; i < 3; i++){
				System.out.print("A number, please > ");
				b = scanner.nextInt();
				if ( a < b ){		
					smallest = a;
				} else {
					smallest = b;
					a = b;
				}
			}
			
			System.out.println("Boom: " + smallest);
		}

	}

}
