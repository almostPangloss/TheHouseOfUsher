package textBook;


import java.util.Scanner;

public class MarioHalfMid {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int height = 0; 
		int width = 2;
		int i = 0;
		int spacer = 0;
		
		System.out.println("How tall would you like your half pyramid to be?");
		if (scan.hasNextInt()){
			height = scan.nextInt();
			
			if (-1 < height && height < 24){
				
				while (height > 0){
					i = width;
					spacer = height - 2;
					
					while (spacer > -1){
						System.out.print(" ");
						spacer--;
					}
					
					while (i > 0){
						System.out.print("#");
						i--;
					}
					
					System.out.print("\n");
					width++;
					height--;			
					
				}
			}
		}
		scan.close();
	}
}
