package textBook;


import java.util.Scanner;

public class AntiConcat {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)){
			
			String word = scanner.nextLine();
			char[] letters = word.toCharArray();
			
			for (int i = 0; i < word.length(); i++){
				System.out.print(letters[i]+" ");
			}
			
		}

	}

}
