// Umut Geyik - 120200145 - CMPE101.02

package weekly;

import java.util.Scanner;

public class week3 {
	public static void main(String [ ] args) {

			//!-- PART I --!
	int x = 8, y = 9; // Initialize x with 8 and y with 9
	if (x >= 7 && x <= 12) 
		// Check: If x equal or bigger than 7 and
		// x equal or smaller than 12, return true
		System.out.println(true);
	else
		// If above condition is not true, return false
		System.out.println(false);
	if (y > 9 && y < 23)
		// Check: If y bigger than 9 and
		// y smaller than 23, return true
		System.out.println(true);
	else
		// If above condition is not true, return false
		System.out.println(false);
	if ((x >= 8 && y >= 8 && x < 20 && y < 20) && x > y)
		// Check: If x and y equal or bigger than 8 and
		// x and y smaller than 20 and x bigger than y, return true
		System.out.println(true);
	else
		// If above condition is not true, return false
		System.out.println(false);
	
	
			//!-- PART II --!
	System.out.print("What time is it? (24h system): ");
	Scanner scan = new Scanner(System.in);
	int hour = scan.nextInt();
	
	switch (hour)
	{
		case 0:
			System.out.println("Midnight");
			break;
		case 1:
			System.out.println("Midnight");
			break;
		case 2:
			System.out.println("Midnight");
			break;
		case 3:
			System.out.println("Midnight");
			break;
		case 4:
			System.out.println("Midnight");
			break;
		case 5:
			System.out.println("Midnight");
			break;
		case 6:
			System.out.println("Morning");
			break;
		case 7:
			System.out.println("Morning");
			break;
		case 8:
			System.out.println("Morning");
			break;
		case 9:
			System.out.println("Morning");
			break;
		case 10:
			System.out.println("Morning");
			break;
		case 11:
			System.out.println("Morning");
			break;
		case 12:
			System.out.println("Afternoon");
			break;
		case 13:
			System.out.println("Afternoon");
			break;
		case 14:
			System.out.println("Afternoon");
			break;
		case 15:
			System.out.println("Afternoon");
			break;
		case 16:
			System.out.println("Afternoon");
			break;
		case 17:
			System.out.println("Afternoon");
			break;
		case 18:
			System.out.println("Evening");
			break;
		case 19:
			System.out.println("Evening");
			break;
		case 20:
			System.out.println("Evening");
			break;
		case 21:
			System.out.println("Evening");
			break;
		case 22:
			System.out.println("Evening");
			break;
		case 23:
			System.out.println("Evening");
			break;
			
		default:
			System.out.println("Wrong Input.");
			break;
		}
	
			//!-- PART III --!
	int check1 = (x > 20) ? x-5 : x+7;
	// If x bigger than 20 decrease x by 5, else increase with 7
	int check2 = (y > 10 && y < 30) ? y * 2 : y / 3; 
	// If y is between 10 and 30 multiply it with 2, else divide with 3
	int check3 = (x > 25) ? x = y : x * 7;
	// If x is bigger than 25, assign y to x, else multiply with 7
	
	}
}
