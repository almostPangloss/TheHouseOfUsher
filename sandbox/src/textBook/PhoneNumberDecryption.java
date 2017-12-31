package textBook;

import java.text.Format;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

public class PhoneNumberDecryption {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
        String phoneNumber = checkAndExtract(scan);
        String deCrypted = deCrypt(phoneNumber);
        
        
                   
        System.out.println("SUCCESS \n*******\nInput:\n" + phoneNumber + 
        		"\n********\nDecryption:\n" + String.format("%ddd-ddd-dddd", deCrypted));
        
        scan.close();       
    }
   
    public static String checkAndExtract (Scanner scan){
        int digitCounter = 0;   
        String phoneNumber = "";
        
        do
	        {
	        digitCounter = 0;        //bad form to declare twice like this?
	        phoneNumber = "";
	       
	        System.out.println("A phone number, please:");
	        String input = scan.nextLine();
	                      
	            for (int i = 0; i < input.length(); i++){
	                if ( input.charAt(i) == '-' || Character.isWhitespace(input.charAt(i))) {  //ok way to check for such things?
	                    System.out.println("Dash or a white space character at " + i);
	                } else if (Character.isDigit(input.charAt(i))) {
	                    System.out.println("Digit at " + i);
	                    digitCounter++;
	                    phoneNumber += input.charAt(i);
	                } else {
	                    System.err.println("ELSE block; " + input.charAt(i));
	                    digitCounter = 0;
	                    break;
	                }
	            }
	            
	            if ( (digitCounter == 10) && 
	            		!(phoneNumber.charAt(0) ==  phoneNumber.charAt(2) && phoneNumber.charAt(1) == (phoneNumber.charAt(0) - 1)) ){
	            	digitCounter = 0;
	                System.out.println("That phone number can't de decrypted.\nPlease try again.\n");
	            }
	            
	            System.out.println("******* \nEnd of DoWhile; " + digitCounter + "; " + input);

        } while ( digitCounter != 10 );
           
        return phoneNumber;           
    }
   
    public static String deCrypt (String phoneNumber){
        String deCrypted = "";
        int shift = 0;
   
        shift = phoneNumber.charAt(0) - 2;
        for (int i = 0; i < phoneNumber.length(); i++){
            deCrypted += ( ((phoneNumber.charAt(i) + (10-shift)) % 10) );
        }
              
        return deCrypted;       
    }


}
