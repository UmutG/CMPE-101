// Umut Geyik - 120200145 - CMPE101.02
package weekly;

public class week2 {
	public static void main(String [ ] args) {

	int x = 5;
	double y = 5.2525, n1 = 0;
	float z = 4.5f;
	n1 = ((x * x) + y - (z * z * z)) / (5 * x - (y * y));
	System.out.println(n1);
	
	int a = 10; // Variable a defined with integer type and its value is 10
	int res = a++ + ++a; 
	// a++ suffix for adding +1 after returned the value 
	// ++a prefix for adding +1 immediately
	// Since we use ++a, it will add another +1 to variable a
	System.out.println(res); // Write the value of res
	a = 10; // Reset a
	res = a++ + a++; 
	// This operation will only add +1 for once when you call it
	// Because the second a++ has not increased since we called variable a for once
	// Which means the last a++ is 10 and previous one is 11 
	System.out.println(res); // Write the value of res

	String str1 = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.";
	System.out.println(str1.length());
	System.out.println(str1.charAt(2));
	System.out.println(str1.toUpperCase());
	}
}
