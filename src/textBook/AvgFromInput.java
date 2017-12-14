package textBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AvgFromInput {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File ("src//textBook//input.txt");
		Scanner scan = new Scanner (file);
		
		int cnt = 0;
		double total = 0;
		
		while (scan.hasNext()){
			total += scan.nextDouble();
			cnt++;
		}
		
		if (cnt > 0){
			System.out.println("The average of the file is: " + (total / cnt));
		} else {
			System.out.println("No data in file.");
		}
		
		scan.close();

	}

}