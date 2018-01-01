package textBook;


import java.util.Scanner;

public class BinChkandValid111 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner ( System.in );
       
        Boolean flagIsAccepted = true, flag = false;
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
                        } else {
                        	onesTotal = 0;
                        }
                    
                    if (onesTotal == 3)
                    {
                    	flag = true;
                    }
                }
               
                System.out.println("onesTotal: " +  onesTotal);
               
            }
                                  
        } while (flagIsAccepted == false);
        
        if ( !(flag))
        {
            System.out.println("Rejected.");
        } else
        {
        	System.out.println("Accepted. There were three consecutive 1s in your binary number.");
        }
        
        scan.close();

    }

}
