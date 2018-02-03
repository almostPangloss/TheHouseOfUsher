package textBook;


import java.util.Scanner;

public class nyanHellos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = 0;
		
		System.out.println("Number of hellos?");
		String input = scan.nextLine();		
		
		try {
			number = Integer.parseInt(input);
		} catch (NumberFormatException e){
			
		};
		
		for (int i = 0; i < number; i++){
			System.out.println("Hello, World.");
		}
		
		scan.close();

	}

}
