package textBook;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AvgfromInputFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File input = new File("C:\\Users\\Warren\\Programming\\workspace\\sandbox\\src\\textBook\\input.txt");
		Scanner sc = new Scanner(input);
		
		int total = 0, cnt = 0;
		double avg = 0;
		
		while ( sc.hasNext() ){
			total += sc.nextInt();
			cnt++;			
		}
		
		avg = ((double)(total)/cnt);
		System.out.println(avg);
		
		sc.close();
	}

}