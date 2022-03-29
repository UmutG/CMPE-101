// Umut Geyik - 120200145 - CMPE 101.02
package Week11;

// Import necessary libraries
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Operations {
	
			
	// Sum two integer values given by user
	public int sum (int a, int b) throws MyException {
		if (a >= 100 || a <= -100 || b >= 100 || b <= -100)
			throw new MyException("One of the values is out of bounds");
		return a + b;
	}
	
	// Convert chars to ASCII
	public void CharToASCII (char first, char second) throws MyException {
		int length = first - second;
		int counter = 0;
		if (length == 0)
			throw new MyException("Two characters are same!");
		else if (length < 0)
			length *= -1;
		String chars [][] = new String [length][2]; 
			if (first > second) {
			for (int i = (int) second; i < (int) first; i++) {
				chars[counter][0] = ("" + (char) i);
				chars[counter][1] = ("" + (int) i);
				counter++;
			}
		}
		else {
			for (int i = (int) first; i < (int) second; i++) {
				chars[counter][0] = ("" + (char) i);
				chars[counter][1] = ("" + (int) i);
				counter++;
			}
		}
	System.out.println(Arrays.toString(chars));
	}
	
	// Create triangle pattern with given char and size
	public void triangleGenerator(char character, int size) throws MyException {
		if (character == ' ')
			throw new MyException("For real? You cannot see space triangle!");
		if (size == 0)
			throw new MyException("Cannot create any triangle with zero size!");
		for (int i = 0; i < size; i++) {
			System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print(character);
			System.out.println();
		}
	}
	
	// Print out Fibonacci series with iteration number
	public String Fibonacci(int until) throws MyException {
		if (until <= 0 || until == 1)
			throw new MyException("Given number is less than 2");
		int first = 1, second = 0, product;
		String pattern = Integer.toString(second) + " ";
		for(int i = 2; i <= until; i++) {
			product = first + second;
			pattern += product + " ";
			first = second;
			second = product;
		}
		return pattern;
	}
	
	// Guess the generated number between 1-5
	public boolean GuessGame(int number) throws MyException{
		if (number <= 0 || number > 5)
			throw new MyException("Given number is out of boundaries");
		Random rand = new Random();
		int randomNum = rand.nextInt(5)+1;
		if (randomNum == number)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) throws MyException, IOException {
		// Create file variable to create error file
		File file = new File("error_logs.txt");
		// Initialize FileWriter variable to write errors
		// true value for multiple line write and add new strings
		FileWriter fileWriter = new FileWriter(file, true);
		//Create operations object
		Operations operation = new Operations();
		//Create scanner object
		Scanner scan = new Scanner(System.in);
		int first, second;
		char firstChar, secondChar;
		
		// Created try-catch functions for every method. Thus,
		// I can write every single error into generated text file
		
		try {
			System.out.print("I need two integers.\nGive me the first: ");
			first = scan.nextInt();
			System.out.print("Give me the second: ");
			second = scan.nextInt();
			System.out.println(operation.sum(first, second));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fileWriter.write("Error: " + e.getMessage() + "\n");
			fileWriter.flush(); 
		}
		
		try {
			System.out.print("\nGive me a char: ");
			firstChar = scan.next().charAt(0);
			System.out.print("Give me another char: ");
			secondChar = scan.next().charAt(0);
			operation.CharToASCII(firstChar, secondChar);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fileWriter.write("Error: " + e.getMessage() + "\n");
			fileWriter.flush();
		}
		
		try {
			System.out.print("\nI need one char and one int."
					+ "\nGive me the char: ");
			firstChar = scan.next().charAt(0);
			System.out.print("Give me the integer: ");
			first = scan.nextInt();
			operation.triangleGenerator(firstChar, first);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fileWriter.write("Error: " + e.getMessage() + "\n");
			fileWriter.flush();
			
		}
		
		try {
			System.out.print("Give me an integer: ");
			second = scan.nextInt();
			System.out.println(operation.Fibonacci(second));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fileWriter.write("Error: " + e.getMessage() + "\n");
			fileWriter.flush();
			
		}
		
		try {
			System.out.print("\nLet's play a game!"
					+ "\nGuess a number between 1-5: ");
			first = scan.nextInt();
			System.out.println(operation.GuessGame(first));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fileWriter.write("Error: " + e.getMessage() + "\n");
			fileWriter.flush();

		}
		// Close FileWrite and Scanner variables
		fileWriter.close();
		scan.close();
	}
}
