//package fuckingAround;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class EnigmaRotor {
//	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
//	private String warped = "jkbdpqixefuvwalmnoyzrsghct";          
//	
//	public EnigmaRotor() {
//		//From back when warp was an int I was trying to use to permute plaintext.
//		// I'm bad at real math
////		double f = Math.random()/Math.nextDown(1.0);
////		this.warp = (int) (1*(1.0 - f) + 26*f);
//		
//		/*
//		 * What does an enigma rotor do:
//		 * It's a disk which has a set encryption
//		 * When given an input letter, it translates that to the corresponding output letter
//		 * The output of each rotor is the input of the next
//		 * After the third rotorthere's a reflector, with its own encoding that sends the signal back. 
//		 * The rotors are reused and stepped forward accordingly
//		 * 
//		 * 
//		 */
//	}
//	
//	public String encrypt(String text) {
//		text = text.toLowerCase();
//		
//		System.out.println(" Warp: " + warp);
//		
//		char[] textChars = text.toCharArray();
//
//		List<String> encryption = new ArrayList<String>();
//		
//		for (int i = 0; i < textChars.length; i++) {
////			/*
////			 * originalPosition = Find the index of the current character
////			 * positionMultiplied = multiply that by warp
////			 * warpedPosition = mod that by 26
////			 * warpedLetter = find the letter with that 
////			 */
////			System.out.println(textChars[i]);
////			int originalPosition = (alphabet.indexOf(textChars[i]) + 1);
////			if (originalPosition >= 1 && originalPosition <= 26) {
////				int positionMultiplied = originalPosition * warp;
////				int warpedPosition = positionMultiplied % 26;
////				textChars[i] = alphabet.charAt(warpedPosition);		
//			
//			System.out.println(textChars[i]);
//			encryption.add(warped.valueOf(warped.indexOf(textChars[i])));
//			
//			encryption.
//			
//			}
//		}
//		
//		String encrypted = String.copyValueOf(encryption);
//		
//		return encrypted;
//		
//	}
//	
//	public String decrypt(String text) {
//		text = text.toLowerCase();
//		
//		char[] textChars = text.toCharArray();
//		for (int i = 0; i < textChars.length; i++) {
//			/*
//			 * originalPosition = Find the index of the current character
//			 * positionMultiplied = multiply that by warp
//			 * warpedPosition = mod that by 26
//			 * warpedLetter = find the letter with that 
//			 */
//			System.out.println(textChars[i]);
//			int originalPosition = alphabet.indexOf(textChars[i]);
//			if (originalPosition >= 0 && originalPosition <= 25) {
//				for (int j = 1; j < (alphabet.length() + 1); j++) {
//					if ((j * warp) % 26 == 0) {
//						int unwarpedPosition = (j - 1);
//						textChars[i] = alphabet.charAt(unwarpedPosition);
//					} 
//				}
//			}
//		}
//		
//		String decrypted = String.copyValueOf(textChars);
//		
//		return decrypted;
//		
//	}
//}
