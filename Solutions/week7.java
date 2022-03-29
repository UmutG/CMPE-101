// Umut Geyik - 120200145 - CMPE101.02
package weekly;
import java.util.Random; // Have to import Random library in order to generate random number
import java.util.Scanner; // Have to import Scanner library in order to get input value
public class week7 {

	private static int counter = 0;
	public static void main(String[] args) {
		
		//				!-- PART I --!
		// Static modifier means, my variable can be updated by processes inside the program
		// For example: if I gave 10 to my static int variable, I can update that variable
		// with different integers whenever I want and it can cause my program to not work
		// properly and unstable. Static modifier can give me the permission to only access static
		// variables and will not allow me to access non-static members. Static modifier do not need
		// generated method to call it. We can simply call it by class_name.static_method_name
		// and it should work without any problem. Also, to create any static variable, we have to
		// write "static" before the type of my variable.
		
		// Non-static modifier means, my variable cannot be updated by processes inside the program,
		// which means, whatever I gave to my non-static value at the beginning, it will remain with that value. 
		// Non-static modifier can give me the permission to access both static and non-static variables. 
		// Which means, we can use both modified variables inside my methods and classes. We cannot access 
		// non-static methods without generating class method. Also, we don't need to write anything before a 
		// variable type to make it non-static.
		
		//				!-- PART II --!
		Scanner scan = new Scanner(System.in); // Create a scanner method from scanner library
		Random rand = new Random(); // Create a random method from random library
		int givenNum = 0, predict = 0; // Initialize my variables
		while (counter != 10) { // If my counter not equal to 10, run codes below
			System.out.print("I need a number (0-100): "); // Ask to user to get input value
			givenNum = scan.nextInt(); // Set the givenNum to given number
			predict = rand.nextInt(101); // Roll a random number between 0-100
			if (givenNum == predict) // If user's prediction equals to generated number
				System.out.print("BINGO! Secret code: https://www.youtube.com/watch?v=dQw4w9WgXcQ");
				// User wins the game.
			else
				System.out.println("Wrong prediction! Number was: " + predict);
				// User loses the game.
			counter++; // Increase my counter by one.
		}
		scan.close(); // Close the scanner
		if (counter == 10) // If counter hits 10, game is over
			System.out.println("GAME OVER!");
		
		//				!-- PART III --!
		week7 w7 = new week7(); // Create a class method to call my parseIt
		System.out.println(w7.parseIt("7.14")); // Parse the given String value to double
		
	}
	
	// CHANGES on Part III: Taken value will be String.
	public double parseIt(String text) { // Create method with double and gets String value
		double d = Double.parseDouble(text); // Parse the given String value to double
		return d; // Returns the double value
	}
}
