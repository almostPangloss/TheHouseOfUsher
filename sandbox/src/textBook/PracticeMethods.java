package textBook;
/* Chapter 3 Programming Activity 2
   Calling class methods
   Anderson, Franceschi
*/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticeMethods
{
  public static void main( String [] args ) {
    //*****
    // 1.  a. Create a Scanner object to read from the console
    //     b. Prompt the user for their first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    Scanner scan = new Scanner(System.in);
    System.out.println("Heya, what's your name?");
    String name = new String(scan.nextLine());
    System.out.println("Dude, " + name + ", what's up?");
    System.out.println("You know there are " + name.length() + " letters in your name? Indeed.");

    //*****
    // 2.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Calculate and print the age the user will be this year.
    //     c. Declare a constant for average life expectancy,
    //            set its value to 77.9
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    //       Use the DecimalFormat class to format the percentage
    System.out.println("\nSo, what year were you born, " + name + "?");
    System.out.println("\nAh, awesome, so this year, you'll be " + (2017 - scan.nextInt()));

    //*****
    // 3.  a. Generate a random integer between 1 and 20
    //     b. Pop up an input dialog box and ask the user for a guess.
    //     c. Pop up an output dialog box telling the user the number
    //         and how far from the number the guess was (hint: use Math.abs)
    int r = (int) Math.round((Math.random() * 100) / 5);
    int guess = Integer.parseInt(JOptionPane.showInputDialog("Hazard a guess?"));
    JOptionPane.showMessageDialog(null, "Ah, dude, the actual number was " + r + " and you were " + Math.abs(r - guess) + " off, which, you know, isn't bad.");

    scan.close();
  }
}