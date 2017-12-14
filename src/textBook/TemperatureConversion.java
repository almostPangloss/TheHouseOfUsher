/* Temperature Conversion
   Anderson, Franceschi
*/

package textBook;

public class TemperatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
	
			
      //***** 2.  declare temperature in Fahrenheit as an int 
	  int tF = 73; 
	  		
      //***** 3. calculate equivalent Celsius temperature	
	  double tC = (tF-32)*(5.0/9);
	  		
      //***** 4. output the temperature in Celsius
	  System.out.println("The F temp of " + tF + " is " + tC + " in Celcius."); 
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
	  double newTF = ((9.0/5) * tC) + 32;
				
      //***** 6. output Fahrenheit temperature to check correctness 
	  System.out.println(newTF);
				
   }
} 