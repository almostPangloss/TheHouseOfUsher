package textBook;

import java.util.Scanner;

public class WordCalc {
	
	public static void main ( String [] args ) {
		/*
		 * Get three inputs from keyboard: two numbers and a sign
		 * Print that calculation in English, with the answer
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		String sign;
		
		System.out.println("Two numbers from 0 to 9, please:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if ((num1 < 0 || num1 > 9) || (num2 < 0 || num2 > 9)){
			System.out.println("What numbers did I say?");
		} else {
		
		System.out.println("\nCool; and an operation from this list:"
				+ "\n+, -, *, /, or ^:");
		sign = sc.next();
		
		switch (sign){
		case "+":
			System.out.println(toAlph(num1) + " plus " + toAlph(num2) 
			+ " equals " + (num1+num2));
			break;
		case "-":
			System.out.println(toAlph(num1) + " minus " + toAlph(num2) 
			+ " equals " + (num1-num2));
			break;
		case "*":
			System.out.println(toAlph(num1) + " multiplied by " + toAlph(num2) 
			+ " equals " + (num1*num2));
			break;
		case "/":
			if (num2 == 0){
				System.out.println("Fuq, may, ya can' do at; ass dividin' bah 0, da is.");
			} else {
			System.out.println(toAlph(num1) + " divided by " + toAlph(num2) 
			+ " equals " + (double)(num1/num2));
			}
			break;
		case "^":
			System.out.println(toAlph(num1) + " to the power of " + toAlph(num2) 
			+ " equals " + Math.pow(num1, num2));
			break;
		}
		}
		
		sc.close();
	}
	
	public static String toAlph (int num ){
		String Alph = null;
		switch (num){
		case 0:
			Alph = "zero";
			break;
		case 1:
			Alph = "one";
			break;
		case 2:
			Alph = "two";
			break;
		case 3:
			Alph = "three";
			break;
		case 4:
			Alph = "four";
			break;
		case 5:
			Alph = "five";
			break;
		case 6:
			Alph = "six";
			break;
		case 7:
			Alph = "seven";
			break;
		case 8:
			Alph = "eight";
			break;
		case 9:
			Alph = "nine";
			break;		
		}		
		return Alph;		
	}

}
