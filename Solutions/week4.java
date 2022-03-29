package weekly;

import java.util.Random; // Import Random library
import java.util.Scanner; // Import Scanner library
public class week4 {

	//			!-- PART 1 --!
	public static void main(String[] args) {
		Random rndm = new Random(); // Create a random variable 
		int tail = 0; // Counter for tails
		for (int i = 0; i < 100; i++) {
			int toss = rndm.nextInt(2); 
			// Initialize variable "toss" with random number (0 or 1)
			if(toss == 0) { // If toss is equal to zero, it is tail
				System.out.println("It is tail."); // Print that it is tail
				tail++; // Increase tail's value by one
			}
			else // If above condition is false, print head	
				System.out.println("It is head");
		}
		System.out.println(tail + " times tossed tail.");
		// Print how many times program tossed tail
		System.out.println("---------------------");
		
	//			!-- PART 2 --!
		for (int i = 0; i < 6; i++) {
		// First loop will count rows for 6 times
			for (int k = 0; k < 10 - i * 2; k++)
				System.out.print(" ");
		// Second loop will add spaces at the beginning of printing stars
		// Spaces will be created by multiple of two 
		// but in terms of decreasing spaces,
		// We have to decrease the arrival point by i * 2
			for (int j = 0; j <= i; j++)
		// Third loop will print stars with space next to them
				System.out.print("* ");
			System.out.println();
		// Switching to the next line after stars' creation completed
		}
		System.out.println("---------------------");
		
	//			!-- PART 3 --!	
		Scanner scan = new Scanner(System.in);
		// Create a new scanner to get input from user
		int c = 0;
		// Variable c is my number after multiplication
		while (c != 256) { // If c is not equal to 256, the given commands will executed
			System.out.print("Where is my value!? Give me a value: ");
			int a = scan.nextInt(); // First integer value taken
			System.out.print("I am ravenous! :@ Give me another one: ");
			int b = scan.nextInt(); // Second integer value taken
			if (a * b == 256) { // If multiplication of a and b is equal to 256, quit the loop
				System.out.println("I am full of numbers! \n"
						+ "Thanks for feeding me :)");
				break;
			}
				
			else // If multiplication of a and b is not equal to 256, continue the loop
				System.out.println("ARRRRGGHHH!!! I AM STILL HUNGRY! \n---------------------");	
		}
		scan.close(); // Close the scanner. No more given input at this point
	}
}
