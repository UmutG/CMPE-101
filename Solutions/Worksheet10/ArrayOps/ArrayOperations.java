// Umut Geyik - 120200145 - CMPE 101.02
package ArrayOps;

public class ArrayOperations {

	//						!-- PART II --!
	
	// Print out an element in an array with defined index number
	public String printArray(String [] array, int index) {
		return array[index];
	}
	
	// Return string includes first value of every member 
	public String arrayFirst(String [] array) {
		String elements = "";
		for (int i = 0; i < array.length; i++)
			elements += array[i].charAt(0);
		
		return elements;
	}
	
	// Return total value after sum every value
	public String arraySum(String [] array) {
		String total = "";
		for (int i = 0; i < array.length; i++)
			total += array[i];
		
		return total;
	}
	
	// Return elements as reversed for every element in the array
	public String [] arrayElementReverse(String [] array) {
		String reverse = "";
		String reverseArray [] = new String [array.length];
		for (int i = 0; i < array.length; i++) {
			for(int j = array[i].length()-1; j >= 0; j--) {
				reverse += array[i].charAt(j);
			}
			reverseArray[i] = reverse;
			reverse = "";
		}
		
		return reverseArray;
	}
	
	// Return an array after omitted specific member in the array
	public String [] arrayOmit(String [] array, String b) {
		// Create a new array to transfer new number of elements
		String [] lastVersion = new String [array.length-1];
		// Why length-1? Because after we omit one element, we have to deduct one element
		// in the array. That's why it has one less element size
		int flag = 0; 
		// To find stated number's index, check all members of that array
		for (int i = 0; i < array.length; i++)
			if (array[i] == b)
				flag = i;
		// After finding its index, replace it with next number
		// But it will cause duplication of last number
		// To get rid of that, transfer every member but the last index
		// That's why loop will count until length - 1
		for (int i = flag; i < array.length-1; i++)
			array[i] = array[i+1];
		for (int i = 0; i < array.length-1; i++)
			lastVersion[i] = array[i];
		return lastVersion;
	}
	
}
