// Umut Geyik - 120200145 - CMPE 101.02
package Test;

import java.util.Arrays;
import ArrayOps.ArrayOperations; 
// Let's import ArrayOperations class to run methods
// We need to reach its package and call it from there
public class Test {

	//								!--	PART I --!
	/*
	 * Encapsulation is a process to include different packages and classes to 
	 * a java file. Java has four different modifiers: public, protected, private and
	 * default (no modifier). Therefore, every modifiers have different access level. 
	 * Moreover, methods that programmer may want to access either can be restricted or accessible.
	 * 
	 * Packaging is a way to separate particular java files from others. Let's consider package
	 * as a directory. In that case, programmer can put together desired java files, mostly similar
	 * type of classes and methods, to that directory to not confuse and label them in order 
	 * to ease of understanding.
	 * 
	 */
	
	//								!--	PART III --!
	public static void main(String[] args) {
		String purrrfect [] = {"Lorem", "ipsum", "dolor", "sit",  "amet", "consectetur"
				, "adipiscing", "elit"}; // Create an array
		
		ArrayOperations Operate = new ArrayOperations();
		// Create an object from package that have operations to run methods
		// LET'S ROCK'N'ROLL!
		System.out.println(Operate.printArray(purrrfect, 5));
		System.out.println(Operate.arrayFirst(purrrfect));
		System.out.println(Operate.arraySum(purrrfect));
		System.out.println(Arrays.toString(Operate.arrayElementReverse(purrrfect)));
		System.out.println(Arrays.toString(Operate.arrayOmit(purrrfect, "amet")));
		
	}
}
