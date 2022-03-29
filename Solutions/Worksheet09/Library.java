// Umut Geyik - 120200145 - CMPE 101.02
package Worksheet09;
import java.util.Random;
public class Library {
	
	// Created method to calculate given scrolls' sizes
	// In that case, we need a library with hundreds of thousands
	// of scrolls. Let's create 100k of it! Just kidding, 10 scrolls we'll do.
	
	public int LibrarySize(Scroll [] scrolls) {
		// This method will get an array of scrolls as parameter
		int totalSize = 0;
		// To calculate total size of scrolls, we have a condition:
		// Only 100 years and above preserve time will be calculated
		// Create a loop with size of given array and search every value
		// that is equal or bigger than 100 
		for (int i = 0; i < scrolls.length; i++) {
			if (scrolls[i].preserveTime >= 100)
				totalSize += scrolls[i].getSize();
		}
		return totalSize;
	}
	
	public static void main(String[] args) {
		// Create scroll array with 10 elements
		Scroll scrolls [] = new Scroll [10];
		// This time we will create every scroll's attributes
		// With random since attributes are integer value
		// It makes programmer's life easier
		Random rand = new Random(); // Variable object with random library
		// Assign a size and a quality value to every scroll
		for (int i = 0; i < scrolls.length; i++) { // Loop with array size
			int size = rand.nextInt(11)+5; // Assign size 
			int quality = rand.nextInt(60);	// Assign quality
			scrolls[i] = new Scroll(size, quality); 
			// Create element in my array with generated values 
			System.out.println(scrolls[i]); // Printout what we have
		}
		Library myLib = new Library(); // Create myLib object to call method
		System.out.println(myLib.LibrarySize(scrolls)); // Calculate given library size
	}
}
