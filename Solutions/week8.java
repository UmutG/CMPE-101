// Umut Geyik - 120200145 - CMPE 101.02
package weekly;
import java.util.Random; // Need Random library to generate random number
public class week8 {
					// !-- PART I --!
	public int sumArray(int [] arr, boolean isEven) {
		int sum = 0;
		if (isEven == true) 
			// If boolean variable is true:
			for (int i = 0; i < arr.length; i+=2) 
				// Since it is true, loop starts from zero to given number and increases
				// by two. Thus, I can only take even numbers
				sum += i;
			// Sum all even indexed numbers in given array
			
		else {
			// If boolean variable is false
			if (arr.length == 2 || arr.length == 3) 
				// If given array's length equals to 2 or 3, it has to return 1
				// Since we want only odd numbers and odd numbers start with 1
				// arr.length = 2 means indexes are 0 and 1
				// arr.length = 3 means indexes are 0, 1 and 2
				return 1;
			else if (arr.length <= 1)
				// If given array's length is less or equal to 1, it has to return 0
				// arr.length = 1 means index is 0
				// arr.length = 0 means no index
				return 0;
			else 
				for (int i = 1; i < arr.length; i+=2) 
					sum += i;	
				// Starts from 1 to given array's length, increase i by 2 
				// Sum every odd number
		}
		
		return sum; // Return sum
	}
	
					// !-- PART II --!
	public int numOfChar(String arr[]) {
		int total = 0;
		for (int i = 0; i < arr.length; i++)
			// Starts from zero to given array's length
			total += arr[i].length();
			// Sum every index's length. 
			// Thus, we will get number of characters of that index
		return total; // Return total char number
	}
	
					// !-- PART II --!	
	public int randomArr(int [][] a) {
		int first = a.length;
		// Since given array is 2 dimensional, I have to get row and column sizes
		// First, let's get column's size
		int second = a[0].length;
		// Second, let's get row's size
		Random rndm = new Random();
		int rndFirst = rndm.nextInt(first);
		// Randomly chooses column index
		int rndSecond = rndm.nextInt(second);
		// Randomly chooses row index
		// Let's randomly get a value from given array
		return a[rndFirst][rndSecond];
	}
	
	public static void main(String[] args) {
		Random rndm = new Random();
		int a = rndm.nextInt(101); 
		// I need random size of array, so I wanted to create 
		// an int variable with a random number between 0-100
		int myArray [] = new int[a]; 
		week8 w8 = new week8(); // Create an object to call methods
		System.out.println("First array's length: " + a);
		System.out.println(w8.sumArray(myArray, true));
		String myStrArr [] = {"Lores", "Ipsum", "Neque", "Porro", "Velit", "Dolor", "Dorem"};
		System.out.println(w8.numOfChar(myStrArr));
		int my2Array [][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
		System.out.println(w8.randomArr(my2Array));
	}
}
