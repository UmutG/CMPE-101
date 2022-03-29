// Umut Geyik - 120200145 - CMPE101.02
package weekly;
import java.util.Scanner;
import java.lang.Math;
public class week5 {

				// !-- PART 1 --!
	// Created a method to calculate factorial of given number
	public int fctr(int x) {
		int sum = 1;
		for (int i = 2; i <= x; i++)
			sum *= i;
		// 5! = 5 * 4 * 3 * 2 * 1
		// That will basically multiply every single number here
		// and add sum to variable "sum"
		return sum;
		// Return sum
	}
	public int binom(int n, int m) {
		int first = fctr(n) / fctr(n - m);
		// Binomial (n, m) = n! / (n - m)!
		int sec = fctr(m) / fctr(m - n);
		// Binomial (m, n) = m! / (m - n)!
		if (n > m) 
			return first;
		// Return binomial (n, m) equation's value
		else 
			return sec;
		// Return binomial (m, n) equation's value
		
	}
				// !-- PART 2 --!	
	public void operation(int n, int m) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose an operation (*, +): ");
		String operator = scan.next();
		switch (operator){
			case "*":
				System.out.println(n * m);
				break;
			case "+":
				System.out.println(n + m);
				break;
			default:
				System.out.println("Wrong operator!");
				break;
		}
		scan.close();
	}
				// !-- PART 3 --!
	public boolean circle (int x, int y, int r) {
		
		int xAxis = x * x; // Calculate x axis distance
		int yAxis = y * y; // Calculate y axis distance
		double distance = Math.sqrt(xAxis + yAxis);
		// Calculate (x, y) combined distance and take square root of it
		// Thus, it will give me the distance from origin
		if (r > distance)
			return false;
		// If radius is bigger than distance, that's out of range, return false
		else
			return true;
		// Else it is inside of my circle, return true
	}
	
	public static void main(String[] args) {
		week5 wk5 = new week5();
		// Created a new object under class name
		// To call my methods and return values
		System.out.println(wk5.binom(8, 5));
		wk5.operation(10, 5);
		System.out.println(wk5.circle(5, 6, 8));
		System.out.println(wk5.circle(5, 6, 7));
	}
}
