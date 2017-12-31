package textBook;

import java.util.Scanner;

public class BinaryCheckerandValidation {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner ( System.in );
       
        Boolean flagIsAccepted = true;
        String word = "";
        int onesTotal = 0;
       
        do
        {
            onesTotal = 0;
            //System.out.println("Flag value: " + flagIsAccepted);
           
            System.out.println("Enter a binary number, please:");
            word = scan.nextLine();
           
            flagIsAccepted = true;
           
            for (int i = 0; i < word.length(); i++)
            {
                //System.out.println("i value: " + i);
               
                if ( !(word.charAt(i) == '0' || word.charAt(i) == '1') )
                {
                    System.out.println("Not a valid Binary number");
                    flagIsAccepted = false;
                    break;
                } else
                {
                    //System.out.println("Inside else block");
                    if (word.charAt(i) == '1')
                        {
                            onesTotal += 1;
                        }
                }
               
                System.out.println("onesTotal: " +  onesTotal);
               
            }
                                  
        } while (flagIsAccepted == false);
        
        if ( !(onesTotal == 2))
        {
            System.out.println("Rejected.");
        } else
        {
        	System.out.println("Accepted. There were two 1s in your binary number.");
        }
        
        //System.out.println("The number of 1s in that binary number you provided is " + onesTotal);
        
       
        /*************
        //String[] wordArray = word.split("");
        int onesTotal = 0;
       
        for (int i = 0; i < word.length(); i++)
        {
            //System.out.println(wordArray[i]);
            if ( word.charAt(i) == '0' || word.charAt(i) == '1' )
            {
                //System.out.println("Inside if " + wordArray[i]);
                if (word.charAt(i) == '1')
                {
                    onesTotal += 1;
                }
            } else
            {
                System.out.println("Uh, that's not a binary number, yo.");
            }
        }
       
        System.out.println("The number of 1's in that binary number is " + onesTotal);
       
        *************/
       
        scan.close();

    }

}
