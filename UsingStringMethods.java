
/**
 * This is a class to demonstrate some of the 
 * String class methods. Type it in and run it. Make changes as
 * indicated.
 * 
 * @author L. Lehmann
 * @version 2-4-2014
 * @author arionalmond
 * @version 3-14-2016
 */

import java.util.Scanner;
public class UsingStringMethods
{
   @SuppressWarnings("resource")
public static void main(String[ ] args)
   {
       String someString;
       Scanner keyboard;
       
      int number; //to be used for
      char symbol; //testing some String class methods
      //String forTesting;
       
       //create a Scanner object that will read input for the keyboard
       keyboard = new Scanner(System.in);
       
       //ask the user to enter a sequence of characters and read it in using the Scanner object
       System.out.print("Enter a sequence of characters: ");
       someString = new String(keyboard.nextLine( )); //create a String object
       
       System.out.println("Here is my String: " + someString);
       
       //Call the length( ) method to find out how many charaters are in my string  object
       number = someString.length( );
       System.out.println("My String object has this many characters: " + number);
       
       //Test the charAt( ) method to extract the first letter of my String object
       //charAt( ) retrieves a character from the invoking String reference. You
       //supply which character you want by sending in an integer value represtenting
       //the position of the character you want
       symbol = someString.charAt(0);
       System.out.println("The first letter is: " + symbol);
       
       //Another test of the charAt( ) method
       symbol = someString.charAt(number - 1);
       System.out.println("The last letter of my string is: " + symbol);
       
       //call the indexOf( ) method of the String class to locate the first occurance of
       //a specific letter in my string
       number = someString.indexOf('y');
       System.out.println("The letter 'y' first appears in my string at position: " + number);
       
       
       //call the method indexOf( ) method of the String class to find where the word "day"
       //appears in my string. If "day" does not appear, then this will show a -1
       number = someString.indexOf("day");
       System.out.println("The word \"day\" appears starting at position: " + number);
       
       //TODO - use the Java 7 API documentation to wtite tests for each of the following
       //String class methods
       
       //Test for the lastIndexOf( ) method
       
       
       
       //Test for the substring( ) method
       
       
       
       //Test for the toUpperCase( ) method
       
       
       //Test for the concat( ) method
       
       
       
       
       //Test for the contains( ) method 
       
       

       
       
    }
}
