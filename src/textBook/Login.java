package textBook;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		/*
		 * Take in a username and password
		 * See if they match "admin" and "open", respectively.
		 * If one doesn't match, say which, if neither do, say so, and if both match say so
		 */
		
		Scanner sc = new Scanner(System.in);
		String un, pw;
		
		String Tun = "admin";
		String Tpw = "open";
		
		System.out.println("Username:");
		un = sc.nextLine();
		
		System.out.println("Password:");
		pw = sc.nextLine();
		
		if (un.equals(Tun) && pw.equals(Tpw)){
			System.out.println("Ok, nice, welcome.");
		} else if ( un.equals(Tun)){
			System.out.println("Well, you got the username right, so one out of two ain't bad.");
		} else if ( pw.equals(Tpw)){
			System.out.println("OK, you remembered your password, that's a step.");
		} else {
			System.out.println(un + " " + pw );
			System.out.println("Burh, you even trying?");
		}
		
		sc.close();
		
	}

}
