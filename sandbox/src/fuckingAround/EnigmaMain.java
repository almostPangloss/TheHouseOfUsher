package fuckingAround;

public class EnigmaMain {

	public static void main(String[] args) {
		
//		Encrypting or decrypting? Wuh choo want?
//		getText();
//		applyRotorMorph();
//		showNewtext();
////		
		
		EnigmaRotor er = new EnigmaRotor(11);
		System.out.println(er.encrypt("hello world"));
		System.out.println(er.decrypt(er.encrypt("hello world")));
	}

}
