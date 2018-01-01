package textBook;


public class Rotor {

	public double getShift() {
		return shift;
	}

	private String encryption;
	private String decryption;
	private double shift;

	public Rotor (){
		
		this.shift = (Math.random() * 10);
				
	}
	
	public String encrypt (String input){
		
		encryption = "";
		
		for (int i = 0; i < input.length(); i++){
			if ((char)input.charAt(i) + (int)shift > 'z'){
				encryption += (char)(input.charAt(i) - 26 + (int)shift);
			} else {
				encryption += (char)(input.charAt(i) + (int)shift);
			}
		}		
		return encryption;
	}
	
	public String decrypt (String input){
		
		decryption = "";
		
		for (int i = 0; i < input.length(); i++){
			if ((char)input.charAt(i) - (int)shift < 'a'){
				decryption += (char)(encryption.charAt(i) + 26 - (int)shift);
			} else {
				decryption += (char)(encryption.charAt(i) - (int)shift);
			}
		}
		
		return decryption;		
	}
	
	public void respond(){
		System.out.println("Rotor Block " + this.shift);
	}
}